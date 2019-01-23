# ISoccer-P3

0) Funcionalidades:

0.1) Criar conta do administrador (X)
0.2) Entrar na conta de administrador (X)
0.3) Adicionar empregados de qualquer tipo (X)
0.4) Adicionar torcedores de qualquer tipo (X)
0.5) Mudar o valor de contribuição para torcedores Junior, Senior e Elite (X)
0.6) Mudar a disponibilidade de um jogador qualquer (X)
0.7) Adicionar Recursos de qualquer tipo (X)
0.8) Verificar e mudar disponibilidade de um recurso (X)
0.9) Mudar informações relacionadas as capacidades dos recursos (X)
0.10) Mostrar um relatório contendo as informações de cada integrante do time dando prioridade ao técnico (X) 
0.11) Mostrar a disponibilidade dos jogadores (X)
0.12) Mostrar um relatório contendo as informações de todos os empregados (X)
0.13) Mostrar um relatório contendo as informações dos estádios e do centros de treinamento (X)
0.14) Mostrar um relatório contendo as informações dos transportes (X)
0.15) Mostrar um relatório contendo as informações de todos os torcedores bem como a quantidade (X)

1) Classes:

1.1 Database
	1.1.1 Motivação: Armazenar os dados de empregados, fans e recursos.
	1.1.2 Solução: Armazenei os dados em três ArrayList, um para empregado, fan e outro para recursos.
	1.1.3 Vantagem: Tenho um Agrupamento e armazenamento melhor dos meu dados, posso trabalhar com diversos objetos de uma maneira mais facil e ao invés de passar 3 objetos como argumentos entre as funções, apenas passo um objeto que contém os três arrayList.
	1.1.4 Desvantagem: Aumento de métodos devido a existência de 3 bases de dado (Arraylist).

1.2 Employee
	1.1.1 Motivação: Armazenar os atributos e métodos comuns a todos os empregados dando enfase no reuso do código.
	1.1.2 Solução: Criar uma classe com os métodos e atributos comum a todos os todos os empregados e aplicar herança nas classes filhas. 
	1.1.3 Vantagem: Melhor manutibilidade e reuso do código. 
	1.1.4 Desvantagem:  

- Cooker
	1.1.1 Motivação: Armazenar os dados especificos de um cozinheiro.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um cozinheiro, com suas informações e funções próprias.
	1.1.4 Desvantagem:
		
- Doctor
	1.1.1 Motivação: Armazenar os atributos e métodos especificos de um Doutor.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um Doutor, com suas informações e funções próprias.
	1.1.4 Desvantagem:

- Driver
	1.1.1 Motivação: Armazenar os atributos e métodos especificos de um Motorista.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um motorista, com suas informações e funções próprias.
	1.1.4 Desvantagem:

- Lawyer
	1.1.1 Motivação: Armazenar os atributos e métodos especificos de um Advogado.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um advogado, com suas informações e funções próprias.
	1.1.4 Desvantagem:

- PersonalTrainer
	1.1.1 Motivação: Armazenar os atributos e métodos especificos de um Personal Trainer. 
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um personal trainer, com suas informações e funções próprias.
	1.1.4 Desvantagem:

- Player
	1.1.1 Motivação: Armazenar os atributos e métodos especificos de um Jogador.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um jogador, com suas informações e funções próprias.
	1.1.4 Desvantagem:

- President
	1.1.1 Motivação: Armazenar os atributos e métodos especificos de um Presidente bem como os dados da classe pai.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um presidente, com suas informações e funções próprias.
	1.1.4 Desvantagem:

- Technician
	1.1.1 Motivação: Armazenar os atributos e métodos especificos de um Técnico.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos da classe e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um técnico, com suas informações e funções próprias.
	1.1.4 Desvantagem:

- ContributionSetup
	1.1.1 Motivação: Ter a configuração de contribuição para Elite, Senior e Junior.
	1.1.2 Solução: Criar uma classe com três atributos double para armazenar as configurações de contribuição para Elite, Senior, Junior.
	1.1.3 Vantagem: Ter uma classe com os valores de contribução, dessa forma não precisa armazenar o valor em uma classe Fan e caso seja feita alguma alteração no valor de contribuição não será necessário modificar esse valor em casa classe Fan, bastando assim modificar apenas nessa classe, uma vez que os valores são obtidos e modificados apenas nela.
	1.1.4 Desvantagem:

- Fan
	1.1.1 Motivação: Armazenar os atributos e métodos comum a todos os tipos de fans dando enfase no reuso do código.
	1.1.2 Solução: Criar uma classe com os métodos e atributos comum a todos os fans e aplicar herança nas classes filhas.
	1.1.3 Vantagem: Melhor manutibilidade e reuso do código.
	1.1.4 Desvantagem:

- Elite
	1.1.1 Motivação: Caracterizar um tipo de fan Elite e ter métodos especificos da classe.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos do objeto Elite e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Diferenciar dos demais tipos de fans, melhor manutibilidade. 
	1.1.4 Desvantagem:

- Senior
	1.1.1 Motivação: Caracterizar um tipo de fan Senior e ter métodos especificos da classe.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos do objeto Senior e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Diferenciar dos demais tipos de fans, melhor manutibilidade.
	1.1.4 Desvantagem:

- Junior
	1.1.1 Motivação: Caracterizar um tipo de fan Junior e ter métodos especificos da classe.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos do objeto Junior e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Diferenciar dos demais tipos de fans, melhor manutibilidade.
	1.1.4 Desvantagem:


- Resource
	1.1.1 Motivação: Armazenar os atributos e métodos comum a todos os tipos de recursos dando enfase no reuso do código.
	1.1.2 Solução: Criar uma classe com os métodos e atributos comum a todos os resource e aplicar herança nas classes filhas. 
	1.1.3 Vantagem: Melhor manutibilidade e reuso do código. 
	1.1.4 Desvantagem:

- Training Center
	1.1.1 Motivação: Caracterizar um tipo de recurso para centro de treinamento, ter métodos e atributos especificos da classe.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos do objeto Centro de treinamento e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um centro de treinamento, com suas informações próprias, métodos próprios e facilita na manutibilidade.
	1.1.4 Desvantagem:

- Stadium
	1.1.1 Motivação: Caracterizar um tipo de recurso para estádio, ter métodos e atributos especificos da classe.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos do objeto estádio e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um estádio, com suas informações, métodos próprios e facilita na manutibilidade.
	1.1.4 Desvantagem:

- Bus
	1.1.1 Motivação: Caracterizar um tipo de recurso para onibus, ter métodos e atributos especificos da classe.
	1.1.2 Solução: Criar uma classe com os atributos e métodos especificos do objeto onibus e herdar os atributos e métodos da classe pai.
	1.1.3 Vantagem: Criar uma abstração/objeto que caracterize um onibus, com suas informações, métodos próprios e facilita na manutibilidade.
	1.1.4 Desvantagem:

- MenuSystem
	1.1.1 Motivação: Mostrar opções de funcionalidades após o administrador ter logado, bem como direcionar para as opções escolhidas. 
	1.1.2 Solução: Criar um método com as funcionalidades enumeradas, pedindo ao usuário seu respectivo valor e em seguida executar o método do respectivo número escolhido.
	1.1.3 Vantagem: Apresentação de uma interface intuitiva e simples para o usuário.
	1.1.4 Desvantagem:

- ReportMenu
	1.1.1 Motivação: Mostrar as opções de relatório, bem como direcionar para as opções escolhidas.
	1.1.2 Solução: Criar um método com as funcionalidades enumeradas, pedindo ao usuário seu respectivo valor e em seguida executar o método do respectivo número escolhido.
	1.1.3 Vantagem: Apresentação de uma interface intuitiva e simples para obtenção de diversos relatórios.
	1.1.4 Desvantagem:

- ResourceMenu
	1.1.1 Motivação: Mostrar as opções de funções envolvendo os recursos, bem como direcionar para as opções escolhidas.
	1.1.2 Solução: Criar um método com as funcionalidades enumeradas, pedindo ao usuário seu respectivo valor e em seguida executar o método do respectivo número escolhido.
	1.1.3 Vantagem: Apresentação de uma interface intuitiva e simples para manusear os recursos.
	1.1.4 Desvantagem:

- Start
	1.1.1 Motivação: Oferecer a opção de logar no sistema ou sair dele.
	1.1.2 Solução: Criar um método com as duas funcionalidades enumeradas, pedindo ao usuário seu respectivo valor e em seguida executar o método do respectivo número escolhido
	1.1.3 Vantagem: Apresentação de uma interface intuitiva e simples para sair ou entrar no sistema.
	1.1.4 Desvantagem:

- Administrator
	1.1.1 Motivação: Armazenar a conta do administrador do sistema.
	1.1.2 Solução: Criar uma classe com os atributos usuário e senha, bem como os métodos relacionados a esses atributos.
	1.1.3 Vantagem: Possibilidade de criar uma conta e encapsular em uma classe tanto os atributos quanto os métodos.
	1.1.4 Desvantagem:

- CentralCenter
	1.1.1 Motivação: Ter um espaço para inicialização dos objetos importantes para o sistema, como administrador, database e executar o método que inicia o sistema. 
	1.1.2 Solução: Criar uma classe para inicialização da classe administrador, database e chamar o método que iniciar o sistema.
	1.1.3 Vantagem: Ter uma classe com o mínimo de dado possivel para inicializar o sistema.
	1.1.4 Desvantagem:

- Utilities
	1.1.1 Motivação: 
	1.1.2 Solução: 
	1.1.3 Vantagem: 
	1.1.4 Desvantagem:

Distribuição dos Métodos
Motivação
Solução
Vantages
Desvantagens

Herança
Motivação
Solução
Vantages
Desvantagens

Abstrata
Motivação
Solução
Vantages
Desvantagens

Interface
Motivação
Solução
Vantages
Desvantagens

Polimorfismo
Motivação
Solução
Vantages
Desvantagens

Tratamento de Exceções
Motivação
Solução
Vantages
Desvantagens

Extensibilidade
Motivação
Solução
Vantages
Desvantagens

Reuso
Motivação
Solução
Vantages
Desvantagens
