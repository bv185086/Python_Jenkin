print("Hello World")
def prime(n):
    for i in range(2,n):
        if n%i==0:
            return False
    else:
        return True
def prime_list(n):
    for i in range(2,n+1):
        if prime(i):
            print(i,end=' ')
    print()
prime_list(10)
