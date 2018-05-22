# EXAMPLE SPRING-BOOT, SPRING-DATA AND GRAPHQL.

mvn spring-boot:run

http://localhost:8080/graphiq

### Mutation 
```
mutation newAuthor($input: String!) {
  newAuthor(name: $input) {
    id
    name
  }
}
```

```
mutation newPost($title: String!, $content: String!, $mmm: String!,) {
  newPost(title: $title, content: $content, author: $mmm) {
    id
    title
    content
    author {
      id,
      name
    }
  }
}
```

### Query
```
query findPosts {
  posts {
    id
    title
    content
    author {
      id,
      name
    }
  }
}
```

```
query findAll {
  authors {
    id
    name
  }
}
```

```
query findPageAuthors($page: Int!) {
  pageAuthors(pageSize: $page) {
    
    pageNumber
    numberPages
    
    totalElements
    authors {
      id
    }
  }
}
```
