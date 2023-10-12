# Aplicação de Gerenciamento de Eventos com Spring

<p align="center">
<a href="https://web.dio.me/home">
<img  width="200"  height="100"  src="https://hermes.digitalinnovation.one/assets/diome/logo.svg">
</a>
</p>

## Descrição

A atividade "Desenvolvimento de Aplicação de Gerenciamento de Eventos com Spring" tem como objetivo proporcionar uma experiência prática para a aplicação de conceitos-chave de desenvolvimento de software, incluindo Inversão de Controle (IoC), Injeção de Dependências e padrões de projeto, como Singleton, Strategy e Facade.

## Objetivos

- Implementar uma aplicação em Spring que permita aos usuários criar e listar eventos.
- Utilizar o conceito de Inversão de Controle (IoC) para gerenciar os componentes da aplicação.
- Aplicar Injeção de Dependências para facilitar a configuração e a reutilização de componentes.
- Implementar o padrão de projeto Singleton para garantir que certos componentes tenham uma única instância.
- Utilizar o padrão de projeto Strategy para encapsular diferentes estratégias de gerenciamento de eventos.
- Implementar o padrão de projeto Facade para simplificar a interação com uma API externa (ViaCEP) para obtenção de informações de localização.

## Funcionalidades da Aplicação

A aplicação permitirá aos usuários:

- Criar um novo evento fornecendo informações, como título, data e horário.
- Listar todos os eventos criados com seus detalhes.
- Obter informações de localização automaticamente usando a API externa do ViaCEP com base em um CEP fornecido durante a criação do evento.

## Componentes Principais

A aplicação é dividida em diversas pastas, com os seguintes componentes principais:

- Pasta `controller`: Contém o controlador responsável por fornecer uma interface REST para criar e listar eventos.
- Pasta `model`: Contém os modelos de dados para eventos e informações de localização.
- Pasta `repository`: Contém os repositórios para persistência de eventos e informações de localização.
- Pasta `service`: Contém os serviços para gerenciamento de eventos e obtenção de informações de localização.

## Implementação

A implementação da aplicação é realizada em Java com o framework Spring Boot. A Injeção de Dependências é aplicada para facilitar a configuração dos componentes e permitir que eles sejam facilmente substituíveis. O padrão de projeto Singleton é aplicado ao componente `EventoService` para garantir uma única instância durante toda a execução. O padrão de projeto Strategy é usado para permitir diferentes estratégias de gerenciamento de eventos.

O componente `LocalizacaoService` aplica o padrão de projeto Facade para simplificar a interação com a API externa do ViaCEP e obter informações de localização com base no CEP fornecido pelos usuários.

## Como Rodar a Aplicação

Para rodar a aplicação, siga as etapas abaixo:

1. Clone este repositório para sua máquina local:

```
git clone https://github.com/jeffnts/dio-spring-padroes-projeto.git
```

2. Navegue até o diretório raiz do projeto:

```
cd dio-spring-padroes-projet
```


3. Execute a aplicação Spring Boot com o seguinte comando:

```
./mvnw spring-boot:run
```


4. Acesse a aplicação em seu navegador:

- URL da API: `http://localhost:8080`

Agora, a aplicação está em execução localmente e pronta para ser usada.

## Considerações Finais

Esta atividade proporciona uma oportunidade valiosa para aplicar conceitos avançados de desenvolvimento de software em um contexto real. Ao criar uma aplicação de gerenciamento de eventos com Spring, foi possível a utilizar IoC, Injeção de Dependências e padrões de projeto importantes, como Singleton, Strategy e Facade, para criar uma aplicação eficaz e modular.

## Recursos de Apoio

Recomenda-se consultar a documentação oficial do Spring para obter informações detalhadas sobre o uso do framework e a integração com bibliotecas externas, como a API do ViaCEP. Além disso, materiais de referência sobre os padrões de projeto mencionados podem ser úteis para uma implementação eficaz.

## Swagger

A documentação da API pode ser encontrada na rota `/swagger-ui/index.html`. Para visualizar a documentação, acesse [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) após iniciar a aplicação.
