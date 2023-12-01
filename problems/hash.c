#include <stdio.h>
#include <stdlib.h>
#define LEN 26

typedef struct {
    char key;
    int value;
} Node;

typedef struct {
    Node* nodes[LEN];
} HashMap;

int hash(char);
void put(HashMap *map, char key, int value);
// int get(HashMap *map, char key);
void nodes(HashMap *map);

int main(){
    HashMap map;
    char str[30] = "ABABABABJJKAOLEP";
    put(&map, 'D', 4);
}

int hash(char key){
    int k = key;
    return k % LEN;
}

void put(HashMap *map, char key, int value){
    int index = hash(key);
    Node* node = (Node*) malloc(sizeof(Node));
    node->key = key;
    node->value = value;
    map->nodes[index] = node;
}
