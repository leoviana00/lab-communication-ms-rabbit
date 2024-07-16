FROM node:22-alpine

WORKDIR /app
COPY package*.json ./
RUN yarn install 
COPY . .
EXPOSE 8082
CMD ["node", "app.js"]