DOCKER_COMPOSE_PROJECT_NAME=architecture-in-spring-db

.PHONY:up
up:
	docker compose -p $(DOCKER_COMPOSE_PROJECT_NAME) up -d

.PHONY:down
down:
	docker compose -p $(DOCKER_COMPOSE_PROJECT_NAME) down

.PHONY:log
log:
	docker compose -p $(DOCKER_COMPOSE_PROJECT_NAME) logs -f --since 1m

.PHONY:clean
clean:
	docker compose -p $(DOCKER_COMPOSE_PROJECT_NAME) down -v

.PHONY:reset
reset:clean up
