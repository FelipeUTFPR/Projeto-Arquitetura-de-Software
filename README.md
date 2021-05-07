# Projeto-Arquitetura-de-Software-Parte-4
# Projeto-Arquitetura-de-Software-Parte-3

Corrigido a descrição e a estrutura dos métodos nas Classes: "Fosfatagem", "Potassagem e "correcaoSolo".

Eliminação de Herança nas Classes  "Fosfatagem", "Potassagem".

Foi incluída  as Classes Enum "FontePotassio" e "FontesFosforo" para melhor organização dos valores.

Corrigido valores no método "custoPotassioPorHectare" estava com uma
constante errada.

Agora todos os testes ocorreram ok, de acordo com os valores da
planilha.

## Medição do Projeto

![Medicao](https://user-images.githubusercontent.com/62437893/117399007-e9e07300-aed5-11eb-84e1-da9848dadde1.png)



# Projeto-Arquitetura-de-Software-Parte-2 

## Correção/Recuperação de Fosforo

### Formulário Conversão Unidades

kg/ha = mg/dm³ * 2

kg/ha (de Fosforo)= kg/ha (de P2O5) * 2.29

P= P2O5 * 0.437

P2O5 = P * 2.29 

### Fontes de Fosforo

Algumas fontes;

Superfosfato Simple................................... 18%

Superfosfato Triplo...................................... 43%

Fosfato monomônico.................................. 48%

Fosfato Diamônico......................................... 45%

### Necessidade de Fosforo a adicionar

necessidadeFosforo = teorFosforoAtingir(mg.dm³) - teorFosforoAtual(mg.dm³)

### Aproveitamento  do Fosforo

aproP2O5 = P2O5(kg/ha) * 100/ eficienciaFosforo(%) 

### Quantidade de Fosforo a Aplicar por Hectare (ha)

quantidadeAplicarPHa = (aproP2O5 (kg/ha) * 100) / teorFonteFosforo (%)

### Quantidade de Fosforo a Aplicar por Alquere (Al)

quantidadeAplicarPAl = quantidadeAplicarHa * 2.42

### Custo de Fosforo por Alquere

custoPAl = Valor(Tonelada) * (quantidadeAplicarAl/1000)

### Custo de Fosforo por Hectare

custoPHe = custoPAl /2.42

### Custo Total

custoTotalPHa = custoPHa * AreaTalhao(ha)

---

# Correção/Recuperação de Potássio

### Formulário Conversão Unidades

1 cmolc de K = 391 mg/dm³ de k

kg/ha = mg.dm³ * 2

K2O = K * 1.2

### Fontes de Potássio

Algumas fontes;

Cloreto de Potássio................................... 60%

Sulfato de Potássio...................................... 50%

Nitrato de Potássio.................................. 44%

 

### Quantidade de Potássio a Aplicar por Hectare (ha)

quantidadeAplicarKHa = (P2O5 (kg/ha) * 100) * teorFonteFosforo (%)

### Necessidade de Potássio a adicionar

teorFosforoAtingir(cmolc.dm³)  = (CTCPotassioDesejada(%) * CTCTotal(%)) / 100 

necessidadePotassio = teorPotassioAtingir(cmolc.dm³) - teorPotassioAtual(cmolc.dm³)

### Aproveitamento  do Potássio

aproK2O = K2O(kg/ha) * 100/ eficienciaPotassio(%) 

### Quantidade de Potássio a Aplicar por Hectare (ha)

quantidadeAplicarKHa = (aproK2) (kg/ha) * 100) / teorFontePotassio (%)

### Quantidade de Potássio a Aplicar por Alquere (Al)

quantidadeAplicarKAl = quantidadeAplicarKHa * 2.49

### Custo do Potássio por Alqueire

custoKAl = Valor(Tonelada) * (quantidadeAplicarKAl/1000)

### Custo de Potássio por Hectare

custoKHa = custoKAl /2.42

### Custo Total

custoTotalKHa = custoKHa * AreaTalhao(ha)


## Projeto-Arquitetura-de-Software-Parte-1 ##

#Variável: SB 

Significado: Soma das Bases

Definição: Representa a soma das bases no Solo.

Formula: 

SB =K+Na+Ca2+Mg2

Unidade: cmol/dm³

Classificação: Baixo < 2.0 ; Médio ≥2.0 e ≥5.0 ; Alto >5.0

_____________________________________________________________________________________________________

#Variável: CTC ou T

Significado: Capacidade de Troca de Cátions

Definição: É a capacidade de troca de cátions do solo, medida à pH 7, Indica a quantidade
total de cargas negativas que o solo poderia apresentar se o seu pH
fosse 7.

Formula: T = SB + H + Al

Unidade: cmol/dm³

Classificação: Baixo < 4.5 ; Médio ≥4.5 e ≥10 ; Alto >10

_____________________________________________________________________________________________________



#Variável: V

Significado: Saturação em Bases

Definição: Indica a porcentagem do total de cargas negativas ocupadas por bases (k, Na, Ca, Mg).

Formula: V = SB/T x 100

Unidade: %

Classificação: Baixo < 50 ; Médio ≥50 e ≥70 ; Alto >70

_____________________________________________________________________________________________________

---

## Variável: M.o.

Significado: Matéria Orgânica do Solo

Definição: A matéria orgânica (MO) do solo é formada pelos resíduos
da parte aérea e radicular das plantas, de micro-organismos e
exsudados de raízes. É constituída basicamente por C, H, O, N, S
e P. A proporção destes elementos gira em torno de 58% de C, 6%
de H, 33% de O e 3% de N, S e P.

Formula: Carbono Orgânico x 1.72

Unidade: dag/kg

Classificação: Baixo < 1.5 ; Médio ≥1.5 e ≥3.0 ; Alto >3.0

_____________________________________________________________________________________________________



#Variável: texSolo

Significado: Textura do Solo

Definição: Se valor 1: Solo argiloso; Se valor 2 solo areno-argiloso;

Classificação:

Menos de 20% argila - solo arenoso
Mais de 40% argila - solo argiloso
Entre 20 e 40% argila - solo areno-argiloso
