# Criar um ambiente de cadastro que o usuário vai informar o nome, a cidade e se tem transporte ou não.

# Cria uma lista vazia para armazenar os dados de todas as pessoas cadastradas
usuarios = []

# Início de um loop que continua até o usuário decidir parar
while True:
    # Criação de um dicionário para armazenar os dados de uma pessoa  
    pessoa = {
        "nome": input ("Digite o nome: \n"),
        "cidade": input ("Digite a cidade: \n"),
        "TemTransporte": "",
        "TipoDeTransporte": {"tipo": "", "modelo": ""}
    }

    # Pergunta ao usuário se ele possui transporte
    resposta_transporte = input ("Você possui algum meio de transporte? (Responda com 'Sim' ou 'Não'): \n")
    if resposta_transporte == "Sim":
        # Se sim, preenche os campos relacionados ao transporte
        pessoa["TemTransporte"] = "Sim"
        pessoa["TipoDeTransporte"]["tipo"] = input ("Que tipo de transporte você tem? (Ex: carro, moto, bicicleta...) \n")
        pessoa["TipoDeTransporte"]["modelo"] = input ("E qual é o modelo do seu transporte? \n")
    else:
        # Caso contrário, apenas marca como "Não"
        pessoa["TemTransporte"] = "Não"

    # Adiciona os dados da pessoa à lista de usuários
    usuarios.append(pessoa)

    # Pergunta se o usuário deseja cadastrar outra pessoa
    continuar = input ("Deseja cadastrar outra pessoa? (Digite 'Sim' para continuar ou qualquer outra coisa para encerrar): \n")
    print()
    if continuar != "Sim":
        break  # Encerra o loop caso a resposta seja diferente de "Sim"

# Após o fim do cadastro, exibe todos os dados cadastrados
print ("Cadastro finalizado. Aqui estão os dados coletados:")
for usuario in usuarios:
    print(usuario)  # Exibe o dicionário bruto com as informações de cada pessoa
