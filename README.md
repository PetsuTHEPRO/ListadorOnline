# Listador Instagram Online

## Descrição

  Com o intuito de desenvolver um programa para auxiliar os usuários que participam de sorteios realizados na plataforma do instagram a conseguirem se organizar melhor, tendo uma ferramenta para cadastrarem seus IG's(Usuário do Instragram) de forma que aumentarem as chances de ganharem mais prêmios. Eu comecei a criar um programa que focasse nos problemas relatados por eles, tentando da melhor forma possível solucionar-los, oferecendo uma aplicação feita em Java, que fosse fácil e intuitiva no processo.

## Configurar o Projeto

### Clone o Repositório

Execute o comando abaixo no terminal para clonar o repositório do projeto:

```bash
git clone https://github.com/usuario/seu-projeto.git
```

### Instale o MySQL ConnectorJ

Como o projeto utiliza MySQL, você precisará configurar manualmente o conector JDBC para que a aplicação consiga se comunicar com o banco de dados.

Passos:

1. Acesse o site oficial do MySQL e baixe o [MySQL ConnectorJ](https://dev.mysql.com/downloads/connector/j/).
2. Extraia o arquivo .zip ou .tar.gz.
3. Localize o arquivo mysql-connector-java-<versão>.jar.
4. Abra o NetBeans e adicione o .jar do MySQL ConnectorJ ao classpath do projeto:
    - Clique com o botão direito no nome do projeto no Project Explorer.
    - Vá para Properties > Libraries > Add JAR/Folder.
    - Navegue até o local onde você extraiu o conector e selecione o arquivo mysql-connector-java-<versão>.jar.

### Baixe e Instale o NetBeans

Você pode usar a IDE NetBeans para desenvolver e rodar o projeto.

Passos:
Acesse o site oficial do NetBeans e baixe a versão mais recente da IDE.
Siga as instruções de instalação fornecidas para o seu sistema operacional.

### Configure o Banco de Dados MySQL
Crie um banco de dados MySQL para o projeto. Você pode usar o seguinte comando para criar o banco de dados:

```sql
CREATE DATABASE seu_banco_de_dados;
```

Atualize o arquivo de configuração do projeto para incluir suas credenciais MySQL (usuário, senha e nome do banco).

### Execute o Projeto

Depois de configurar o conector e o banco de dados:

- Abra o projeto no NetBeans.
- Clique em Run ou pressione Shift + F6 para executar a aplicação.

## Como usar

  O programa tem um sistema de cadastro/login para que o usuário cadastre suas informações com segurança, além de oferecer dicas de como aumentar as chances de ganhar sorteios e uma visão de como está a situação do usuário com base nos dados informados pelo mesmo. Com tudo, tenho trabalhado para automatizar o maior número de tarefas possíveis, sem descomprir nenhuma diretiz do Instagram, de forma que não prejudique o usuário.

## Objetivos

**Sistemas**  
- [x] Sistema de Login
- [x] Sistema de Cadastro  

**Funções**
- [ ] Entregas de Premios

**Cadastros**
- [x] Cadastro de Usuário
- [x] Cadastro de IG's
- [ ] Cadastro de Sorteios
- [ ] Cadastro de Premios  

**Telas**
- [x] Tela de Login
- [x] Tela de Cadastro
- [ ] Tela Principal

