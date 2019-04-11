# ISoccer-P3

## Funcionalidades

- [x] Acesso restrito ao ADMIN
- [x] Adição de funcionários
- [x] Adição os sócios-torcedores
- [x] Alteração dos dados de sócios-torcedores
- [x] Gerenciamento de recursos
- [x] Solitação e criação de relatórios

## Assuntos aplicados

- [x] Herança
- [x] Polimorfismo
- [x] Interface
- [x] Exception
- [x] Collection

```
Herança: Utilizamos nas classes filhas Cooker, Doctor, Driver, Lawyer, PersonalTrainer, Player, President e Technician que estendem da classe pai Employee, nas classes filhas Elite, Fan e Junior que estendem da classe pai Fan e nas classes filhas Bus, Stadium e TrainingCenter que estendem de Resource.

Polimorfismo: Foi utilizada nas classes filhas de Employee nos métodos showAllEmployeeData() e obtainEmployeeComplete(), além disso nas classes filhas de Resource nos métodos showAllInformationResource(), changeResourceCapacity() e obtainResourceComplete(), por fim nas classes filha de Fan nos métodos showAllInformationFan(ContributionSetup contributionSetup).

Interface: Foi usada para implementar o padrão de projeto Factory Method para as classes BusFactory, StadiumFactory e TrainingCenterFactory.

Exception: Implementamos o tratamento da exceção InputMismatchException em todas as classes que requisitava algum valor numérico ao usuário.

Collection: Foi utilizado ArrayLists para armazenar os dados do sistema na classe DatabaseSingleton.
```

## Padrões de projeto

- [x] Factory Method
- [x] Singleton

```
Factory Method: Foi usado na criação dos recursos, bus, stadium e trainingCenter, adicionando as classes ResourceFactory,
StadiumFactory, BusFactory, TrainingCenterFactory.

Singleton: Foi usado para instanciação unica da classe database que contém todos os dados do sistema, adicionando métodos
getInstance() e o atributo privado estático database na classe DatabaseSingleton.

```

## Diagrama UML

![screenshot](isoccer_uml.png)
