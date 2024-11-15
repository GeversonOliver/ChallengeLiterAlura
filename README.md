# Literalura

Literalura é uma aplicação Java/Spring Boot para amantes de livros. Esta aplicação permite buscar livros, listar livros registrados, listar autores, e muitas outras funcionalidades relacionadas à leitura e organização de livros.

## Funcionalidades

1. **Buscar livros pelo título**: Consulta a API Gutendex para buscar livros pelo título.
2. **Listar livros registrados**: Exibe todos os livros registrados no banco de dados.
3. **Listar autores registrados**: Exibe todos os autores dos livros registrados.
4. **Listar autores vivos em um determinado ano**: Lista autores que estavam vivos em um ano especificado.
5. **Listar autores nascidos em determinado ano**: Lista autores que nasceram em um ano especificado.
6. **Listar autores por ano de sua morte**: Lista autores que morreram em um ano especificado.
7. **Listar livros em um determinado idioma**: Lista livros registrados no banco de dados em um idioma especificado.
8. **Encerrar a aplicação**: Encerra o programa.

## Tecnologias Utilizadas

- **Java 17** 
- **Spring Boot 3.3.5**
- **Hibernate**
- **PostgreSQL**
- **Gutendex API**
- **Maven**

## Configuração do Projeto

### Pré-requisitos

- Java 17 ou superior
- Maven
- PostgreSQL

### Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/literalura.git
   cd literalura
   ```

2. Configure o banco de dados no arquivo `application.properties`:
   ```properties
        spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
        spring.datasource.username=${DB_USER}
        spring.datasource.password=${DB_PASSWORD}
        spring.datasource.driver-class-name=org.postgresql.Driver
        hibernate.dialect=org.hibernate.dialect.HSQLDialect

        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        spring.jpa.format-sql=true
   ```

3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

## Estrutura do Projeto

- `br.com.devgol.literalura`: Pacote principal do projeto.
  - `view`
  - `model`
  - `repository`
  - `service`

## Uso

Ao iniciar a aplicação, o menu principal será exibido com as opções disponíveis. Basta seguir as instruções na tela para navegar pelas funcionalidades.

### Exemplo de Uso

1. **Buscar livros pelo título**:
   - Digite `1` e pressione Enter.
   - Insira o título do livro que deseja buscar.
   - A aplicação fará uma consulta à API Gutendex e exibirá os resultados encontrados.

2. **Listar livros registrados**:
   - Digite `2` e pressione Enter.
   - A aplicação listará todos os livros registrados no banco de dados.

3. **Listar autores registrados**:
   - Digite `3` e pressione Enter.
   - A aplicação listará todos os autores dos livros registrados.

4. **Listar autores vivos em um determinado ano**:
   - Digite `4` e pressione Enter.
   - Insira o ano desejado.
   - A aplicação listará os autores que estavam vivos naquele ano.

5. **Listar autores nascidos em determinado ano**:
   - Digite `5` e pressione Enter.
   - Insira o ano desejado.
   - A aplicação listará os autores que nasceram naquele ano.

6. **Listar autores por ano de sua morte**:
   - Digite `6` e pressione Enter.
   - Insira o ano desejado.
   - A aplicação listará os autores que morreram naquele ano.

7. **Listar livros em um determinado idioma**:
   - Digite `7` e pressione Enter.
   - Insira o código do idioma desejado (por exemplo, `en` para Inglês, `pt` para Português).
   - A aplicação listará todos os livros registrados no banco de dados naquele idioma.

8. **Encerrar a aplicação**:
   - Digite `0` e pressione Enter.
   - A aplicação será encerrada.

## Contribuição

Se você deseja contribuir para o projeto, siga os passos abaixo:

1. Fork o repositório.
2. Crie uma nova branch: `git checkout -b minha-feature`.
3. Faça suas alterações e commite-as: `git commit -m 'Minha nova feature'`.
4. Envie para o repositório original: `git push origin minha-feature`.
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo `LICENSE` para mais detalhes.

## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato.


