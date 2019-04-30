# Stage 0, "build-stage", based on maven jdk 11, to build and compile the backend
FROM postgres:11
COPY init.sql /docker-entrypoint-initdb.d/
