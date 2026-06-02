docker run  
#cria um novo container a partir da imagem nginx, mapeando a porta 80 do container para a porta 80 do host, e executa o container em segundo plano (detached mode)

docker ps -a;
#lista todos os containers, incluindo os que estão parados, mostrando informações como ID do container, imagem usada, comando de execução, status, portas mapeadas e nome do container

docker stop name;
#para um container em execução, onde "name" é o nome ou ID do container que você deseja parar. Certifique-se de substituir "name" pelo nome ou ID real do container que você deseja interromper.

docker start name;
#inicia um container que está parado, onde "name" é o nome ou ID do container que você deseja iniciar. Certifique-se de substituir "name" pelo nome ou ID real do container que você deseja iniciar.

docker container rm name;
#deleta um container específico, onde "name" é o nome ou ID do container que você deseja remover. Certifique-se de substituir "name" pelo nome ou ID real do container que você deseja excluir.

