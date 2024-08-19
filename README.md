Santander dev week 2024
## Diagrama de classes 

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Card card
        +List~Feature~ features
        +List~News~ news
    }

    class Account {
        +String Number
        +String Agency
        +float Balance
        +float Limit
    }

    class Card {
        +String Number
        +float Limit
    }

    class Feature {
        +String Icon
        +String Description
    }

    class News {
        +String newsIcon
        +String newsDescription
    }

    User "1" *-->"1" Account
    User "1" *-->"1" Card
    User "1" *-->"N"  Feature
    User "1" *-->"N" News
```
