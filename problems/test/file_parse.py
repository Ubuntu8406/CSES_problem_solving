f = open('user_output2.txt', 'r')
f1 = open('test_output2.txt', 'r')
f2 = open('test_input2.txt', 'r')

row = 1
while True:
    s1, s2, s3 = f.readline(), f1.readline(), list(map(int, f2.readline().split(' ')))#
    print(row, end=' ')
    n1, n2 = s3[0], s3[1]
    if s1!=s2:
        print(f'{row}, {n1}, {n2}, {max(n1,n2)/min(n1, n2)}', s1, s2)
    row+=1;
    if row == 5000:
        break;

f.close()
f1.close()
f2.close()

    # if min(n1, n2) != 0:
    #     print(s1, s2, not(bool(sum(s3)%3)), f'{n1} / {n2} = ', n1/n2, sep=" ")
    # else:
    #     print(s1, s2, not(bool(sum(s3)%3)), sep=" ")       
    # if s1 != s2:
    #     break;