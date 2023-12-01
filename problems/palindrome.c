#include <stdio.h>
#define LETTERS "NOPQRSTUVWXYZABCDEFGHIJKLM"

int hash(char c);

int main(){
    int count[26];
    for (int i = 0; i < 26; i++)
        count[i] = 0;
    
    char input_str[1000000];
    scanf("%s", &input_str);
    int index = 0;
    int count_of_odd = 0;
    
    while (input_str[index] != '\0'){
        int h = hash(input_str[index]);
        count[h] += 1;
        index++;
    }
    for (int i = 0; i < 26; i++){
        int current = count[i];
        if (current != 0 && current % 2 != 0)
                count_of_odd++;
    }
    if (count_of_odd < 2){
        char output_str[index];
        for (int i = 0; i < index; i++)
            output_str[i] = '0';
        int start = 0; int k = 0;
        for (int i = 0; i < 26; i++){
            int current = count[i];
            
            if (current != 0){
                if (current % 2 != 0){
                    int s = (index/2 - current/2);
                    for (int j = s;j < s + current;j++){
                        output_str[j] = LETTERS[i];
                    }           
                }else{
                    
                    for (int j = 0; j+start < current/2; j++){
                        
                        output_str[j+start+k] = LETTERS[i];
                        output_str[index-start-j-1-k] = LETTERS[i];
                    }
                    k+=(current/2);
                }
            }
    }
        printf("%s", output_str);
    } else {
        printf("NO SOLUTION");
    }
    return 0;
}

int hash(char c){
    int k = c;
    return k % 26;
}