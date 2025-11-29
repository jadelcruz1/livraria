# Livraria Spring Boot + Angular 21

Este projeto é um exemplo de **aplicação de livraria** utilizando **Spring Boot** no backend e **Angular 21** no frontend. Ele permite gerenciar livros, incluindo título, autor, preço e ISBN.


---

## 📁 Estrutura do Projeto

### Backend (Spring Boot)
```
src/main/java/com/jpa/livraria
├── model
│   └── Livro.java
├── repository
│   └── LivroRepository.java
├── controller
│   └── LivroController.java
└── LivrariaApplication.java
```

### Frontend (Angular 21)
```
src/app
├── components
│   └── livro
│       ├── livro.component.ts
│       ├── livro.component.html
│       └── livro.component.css
├── services
│   └── livro.service.ts
└── app.module.ts
```

---

## 🚀 Funcionalidades

- Listar livros
- Inserir novos livros
- Consultar livros pelo ISBN, autor ou título
- Atualizar ou deletar livros (opcional)

---

## 🛠 Tecnologias Utilizadas

- **Backend:** Spring Boot, Spring Data JPA, H2 Database (ou MySQL)
- **Frontend:** Angular 21, TypeScript, HTML, CSS
- **Build e Gestão de Dependências:** Maven (Backend) e NPM (Frontend)

---

## ⚡ Como Rodar o Projeto

### Backend
1. Navegue até o diretório do backend:
```bash
cd backend
```
2. Rode a aplicação:
```bash
mvn spring-boot:run
```
3. Acesse a API (exemplo H2):
```
http://localhost:8080/livros
```

### Frontend
1. Navegue até o diretório do frontend:
```bash
cd frontend
```
2. Instale dependências:
```bash
npm install
```
3. Rode o projeto Angular:
```bash
ng serve --open
```
4. O frontend abrirá automaticamente em:
```
http://localhost:4200
```

---

## 📌 Endpoints API

- `GET /livros` – Listar todos os livros
- `POST /livros` – Adicionar um novo livro
- `GET /livros/{id}` – Consultar livro por ID
- `PUT /livros/{id}` – Atualizar livro
- `DELETE /livros/{id}` – Deletar livro

---

## 📚 Exemplo de Livro JSON para POST
```json
{
  "titulo": "Exemplo de Livro",
  "autor": "Autor Exemplo",
  "preco": 49.90,
  "isbn": "123-4567890123"
}
```

---

## 📝 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para usar e modificar.