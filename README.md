# ProjetoMasmorra: Implementando o Padrão Observer em Java

Um projeto prático de RPG por terminal desenvolvido para estudar, aplicar e consolidar o **Padrão de Projeto Observer** (Design Pattern) utilizando Java.

## O Cenário
O projeto simula o núcleo de um RPG onde o herói explora uma masmorra e enfrenta inimigos em combates por turnos. O grande desafio arquitetural é que diversas partes do sistema (HUD de Combate, Log de Batalha, Sistema de Nível e Poções Automáticas) precisam reagir dinamicamente ao que acontece no combate.

## A Solução: Observer Pattern
Para evitar um código altamente acoplado onde o Herói precisa instanciar e chamar cada sistema manualmente, aplicamos o padrão Observer. 
* **Observable (O Sujeito):** A classe `Heroi` atua como a fonte da verdade, emitindo notificações sempre que seu estado muda (toma dano, recebe cura, gasta mana ou ganha XP).
* **Observers (Os Observadores):** Os sistemas periféricos assinam essas notificações e reagem de forma totalmente independente, permitindo que novos sistemas sejam adicionados no futuro sem alterar o núcleo do jogo.

## Passos da Implementação (Roadmap)
- [ ] 1. Criar e implementar as interfaces `Observable` e `Observer` nas classes base.
- [ ] 2. Implementar a lógica de notificação de eventos (`TipoEvento`) e atualização.
- [ ] 3. Disparar o gatilho de notificação (`notificar()`) nos métodos de ação do herói.
- [ ] 4. Validar o fluxo principal no método `Main`.
- [ ] 5. **Feature: A Zona Silenciosa.** Implementar a lógica de desconexão/reconexão temporária da interface de combate durante o jogo.
- [ ] 6. **Feature: Inimigo Curioso.** Criar um observador dinâmico (inimigo) que altera seus atributos em tempo real baseado no ganho de XP ou dano recebido pelo herói.

## Como executar
1. Clone este repositório.
2. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, etc).
3. Execute o arquivo principal localizado em `src/main/java/masmorra/Main.java`.
4. Acompanhe os turnos pelo terminal!
