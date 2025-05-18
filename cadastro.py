# Criar um ambiente que o usuário vai chegar informando o nome, a cidade e se tem transporte ou não

# Dicionário
pessoa = {
    "nome": [input("Digite o seu nome: \n")],
    "cidade": [input("Digite a cidade: \n")],
    "TemTransporte": [],
    "TipoDeTransporte": {"tipo": [], "modelo": []}
}

# Se tiver transporte, vai informar outras informações sobre
if input ("Tem transporte? (Responda: Sim/Não): \n") == "Sim":
    pessoa["TemTransporte"].append("Sim")
    pessoa["TipoDeTransporte"]["tipo"].append (input ("Digite o tipo de transporte: \n"))
    pessoa["TipoDeTransporte"]["modelo"].append (input ("Digite o modelo do transporte: \n"))
else:
    pessoa["TemTransporte"].append("Não")
    print("Realmente... Você não tem transporte.")

# Mostrar os dados colocados no dicionário
print()
print ("Dados cadastrados:")
print (pessoa) 
