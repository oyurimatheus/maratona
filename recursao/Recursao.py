def main():
    print("====MDC: ", mdc(2, 2))
    print("====MDC: ", mdc(928, 100))
    print("====MDC: ", mdc(16, 8))
    print("====MDC: ", mdc(20, 25))

    print("====Converte: 10: ", converte("10"))
    print("====Converte: 101: ", converte("101"))
    print("====Converte: 11: ", converte("11"))
    print("====Converte: 11111111: ", converte("11111111"))
    print("====Converte: 10000000: ", converte("10000000"))

def mdc(x, y):
    if x ==y:
        return x
    elif x > y:
        resto = x % y
        if resto != 0:
            return mdc(y, resto)
        else:
            return y
    else:
        resto = y % x
        if resto != 0:
            return mdc(x, resto)
        else:
            return x

def converte(b):
    if len(b) == 0 or b[0] == '0': return 0
    return 2 ** (len(b) - 1) + converte(b[1:])

if __name__ == '__main__':
    main()