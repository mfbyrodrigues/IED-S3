# declaração de variável
variavel = 0

# declaração da função
def mostrar():
    print(variavel)

def mostrar(a):
    print(a)

def outra_funcao():
    pass

mostrar()

# estruturas condicionais:
if (variavel < 1): # se
    print('ok')

elif (variavel > 5): #se não, se
    print(bigger)

else: # se não
    print('not ok')

# estrutura de repetição:
def loop():
    for i in range(10):
        print(i)

# listas:
lista_de_fruta = ['siriguela', 'pinha', 'melancia', 1, True, 3.1415, (), [], {}]

print(lista_de_frutas[0])

print(lista_de_frutas[9]) # erro 'Out Of Range'

lista_de_fruta.index('melancia') # várias funções catalogadas para se usar
print (index_melancia) # Mostra o index da posição do elemento

print(lista_de_fruta.append('manga')) # adiciona o elemento bem no final

# outra maneira de percorrer:

for fruta in range(len(lista_de_frutas)):
    print(fruta)
