from datetime import date

def saque(saldo, extrato, tentativas_saque):
    valor = int(input("Informe o valor do saque: "))
    if saldo < valor:
        print("\n @@@ SALDO INSUFICIENTE @@@")
    elif tentativas_saque == 3:
        print("\n @@@ LIMITE DIÁRIO DE SAQUES EXCEDIDO @@@.")
    elif valor > 500:
        print("\n @@@ VALOR INVÁLIDO. O VALOR MÁXIMO POR SAQUE É DE R$ 500,00 @@@")
    elif valor < 0:
        print("\n @@@ VALOR INVÁLIDO @@@")
    else :
        saldo -= valor
        tentativas_saque = tentativas_saque + 1
        extrato += f"{date.today()} {'Saque':11} - R${valor}\n"
        print(" === SAQUE EFETUADO COM SUCESSO!!! === \n")
    
    return saldo, extrato, tentativas_saque

def deposito(saldo, extrato):
    valor = int(input("Informe o valor a ser depositado: "))
    if valor > 0:
        saldo += valor
        extrato += f"{date.today()} {'Depósito':11} + R${valor}\n"
        print("Depósito efetuado com sucesso...")

    return saldo, extrato

def imprime_extrato(saldo, extrato):
    print(extrato)
    print(f"Saldo total ____________________ R$ {saldo}")

    return saldo, extrato

def cadastrar_cliente(clientes, cpf):
        nome = input("Digite seu nome:  ")
        dia_nascimento = input("Digite o dia do seu nascimento:  ")
        mes_nascimento = input("Digite seu mês de nascimento:   ")
        ano_nascimento = input("Digite seu ano de nascimento: ")
        endereco = input("Digite seu endereco:   ")
        clientes.update({cpf:{"nome": nome, "data_nascimento": f"{dia_nascimento}/{mes_nascimento}/{ano_nascimento}", "endereco": endereco}})
        print(" \n === CADASTRO EFETUADO COM SUCESSO! ===")

        return clientes

def cadastrar_conta(contas_correntes, cpf):
    numero_conta = (len(contas_correntes)) + 1
    contas_correntes.update({cpf: {"agencia": "0001", "conta": numero_conta}})
    print("\n === CONTA CORRENTE CADASTRADA COM SUCESSO === ")
    print(f"Dados da conta: AGÊNCIA: 0001 NÚMERO DA CONTA: {numero_conta}")

    return contas_correntes

def mensagem():
    return """
    ===================================================
        Seja Bem vindo(a). Digite a opção desejada:

        [1] - Saque
        [2] - Depósito
        [3] - Extrato
        [4] - Cadastrar-se
        [5] - Abrir uma conta corrente
        [0] - Para sair...

    ====================================================
    """

def main(): 
    saldo = 0
    extrato = ""
    tentativas_saque = 0

    clientes = {}
    contas_correntes = {}

    while True:
        opcao = int(input(mensagem()))
        match opcao:
            case 1:
                saldo, extrato, tentativas_saque = saque(saldo, extrato, tentativas_saque)
            case 2:
                saldo, extrato = deposito(saldo, extrato)
            case 3:
                saldo, extrato = imprime_extrato(saldo, extrato)
            case 4:
                cpf = input("Digite seu cpf:    ")
                if clientes.get(cpf):
                    print("Cpf já cadastrado!")
                else:
                    clientes = cadastrar_cliente(clientes, cpf)
            case 5:
                cpf = input("Digite seu cpf:    ")
                if contas_correntes.get(cpf):
                    print("Cliente já possui conta corrente.")
                elif(clientes.get(cpf)):
                    contas_correntes = cadastrar_conta(contas_correntes, cpf)
                else:
                    clientes = cadastrar_cliente(clientes, cpf)
                    contas_correntes = cadastrar_conta(contas_correntes, cpf)
            case 0:
                print("\n Obrigado por ser nosso cliente. Tenha um bom dia!")
                break
            case other:
                print("\n @@@ NÃO CONSEGUI ENTENDER SUA ESCOLHA... @@@ \n")
                print(contas_correntes)

main()