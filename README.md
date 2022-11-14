# Testes unitários 

### O que são testes unitários?
- Também conhecido como teste de unidade
- Testar a menor unidade de código possível
- Unidade: função, método, classes.
- Testar uma aplicação na sua menor parte
- Geralmente escrito em tempo de desenvolvimento

### Por que escrever testes unitários?
- Compreender o código fonte
- Corrigir bugs com segurança
- Refatorar código sem introduzir bugs
- Entregar com segurança uma nova feature
- Pirâmide de testes
- Testes unitários como métrica de qualidade (confiabilidade)
- Cobertura de testes
- Automação na execução de testes
- Cultura de agilidade

### Boas práticas 
- Busque simplicidade
    - Preocupe-se com os nomes
    - Preocupe-se com a facilidade de leitura
- Comece a testar cedo
    - Escrever o código de teste o mais próximo possível do código de execução.
    - TDD
        1. Escreva um teste que falhe
        2. Faça o código funcionar
        3. Elimine redundância
- Busque padronização
    - Nomenclatura
- Testes precisam ser determinísticos
- Economize tempo automatizando
    - Ferramentas de coberturas de código (Jacoco)
    - Automatize a execução dos seus testes

### Exemplos com JUnit
- Assertions
- Assumptions 
- After e Before
- Condicionais
- Ordenação
- Exceptions
- Same
- Disabled

# Testes unitários com Mockito

### Configurando o Mockito
- [Mockito Core](https://mvnrepository.com/artifact/org.mockito/mockito-core)
- [Mockito JUnit Jupiter](https://mvnrepository.com/artifact/org.mockito/mockito-junit-jupiter)
- [Mockito Inline](https://mvnrepository.com/artifact/org.mockito/mockito-inline)

### Exemplos com Mockito
- @Mock - Mockando objetos 
- @Spy - Espiando objetos 
- @Captor - Capturando argumentos
- @Matchers - Manipulando retornos
- @MockedStatic - Mockando métodos estáticos 

