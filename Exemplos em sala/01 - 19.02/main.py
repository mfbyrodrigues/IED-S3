# declaração de variável
variavel = 'i'

# declaração da função
def mostrar():
    print(variavel)

def mostrar(a):
    print(a)

def outra_funcao():
    pass

mostrar()

# Estruturas condicionais:
if (variavel < 1): # se
    print('ok')

elif (variavel > 5): #se não, se
    print(bigger)

else: # se não
    print('not ok')

# Estrutura de repetição:
def loop():
    for i in range(10):
        print(i)

# Listas:
lista_de_fruta = ['siriguela', 'pinha', 'melancia', 1, True, 3.1415, (), [], {}]

print(lista_de_frutas[0])

print(lista_de_frutas[9]) # Erro 'Out Of Range'

lista_de_fruta.index('melancia') # Várias funções catalogadas para se usar
print (index_melancia) # Mostra o index da posição do elemento

print(lista_de_fruta.append('manga')) # Adiciona o elemento bem no final

# Outra maneira de percorrer:

for fruta in range(len(lista_de_frutas)):
    print(fruta)
