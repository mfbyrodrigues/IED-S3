import lib

while True:
    print("ok")
    break

if __name__ == 'main':
    pass

lista_de_fruta = ['siriguela', 'pinha', 'melancia', 1, True, 3.1415, (), [], {}]

lista_de_fruta.append('tomate') # Adiciona elemento no fim da lista (ordem não importa)
lista_de_fruta.insert(2,'manga') # Adiciona elemento
lista_de_fruta.pop(-2) # Do final pro começo
lista_de_frutas.remove('melancia') # Remove só a primeira ocorrencia do valor
lista_de_fruta.copy() # Copia da lista
lista_de_fruta.count('siriguela') # Conta o número de ocorrência que aparece um valor
lista_de_fruta.index('pinha') # Me passa o index de um determinado valor 
lista_de_fruta.sort() # Ordenação principalmente com listas númericas
lista_de_fruta.extend() # Extenção da lista baseado em outra lista

print(lista_de_fruta)