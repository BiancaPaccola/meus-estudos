from datetime import date

saldo = 0
extrato = ""
tentativas_saque = 0

mensagem = """
===================================================
    Seja Bem vindo(a). Digite a opção desejada:

    [1] - Saque
    [2] - Depósito
    [3] - Extrato
    [0] - Para sair...

====================================================
"""

def saque():
    global saldo, extrato, tentativas_saque
    valor = int(input("Informe o valor do saque: "))
    if saldo < valor:
        print("Saldo insuficiente!")
    elif tentativas_saque == 3:
        print("Limite diário de saques excedido.")
    elif valor > 500:
        print("Valor inválido. O valor máximo por saque é de R$ 500,00")
    elif valor < 0:
        print("Valor inválido.")
    else :
        saldo -= valor
        tentativas_saque = tentativas_saque + 1
        extrato += f"{date.today()} {'Saque':11} - R${valor}\n"
        print("Saque efetuado com sucesso!!!\n")

def deposito():
    global extrato, saldo
    valor = int(input("Informe o valor a ser depositado: "))
    if valor > 0:
        saldo += valor
        extrato += f"{date.today()} {'Depósito':11} + R${valor}\n"
        print("Depósito efetuado com sucesso...")

def imprime_extrato():
    print(extrato)
    print(f"Saldo total ____________________ R$ {saldo}")

while True:
    opcao = int(input(mensagem))

    match opcao:
        case 1:
            saque()
        case 2:
            deposito()
        case 3:
            imprime_extrato()
        case 0:
            print("Obrigado por ser nosso cliente. Tenha um bom dia!")
            break
        case other:
            print("Não consegui entender sua escolha...\n")