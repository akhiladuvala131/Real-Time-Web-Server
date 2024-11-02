# Use the official Node.js image
FROM node:14

# Set the working directory
WORKDIR /app

# Copy package.json and install dependencies
COPY package.json .
RUN npm install

# Copy the source files
COPY src/ .

# Expose the app port
EXPOSE 3000

# Command to run the app
CMD ["node", "index.js"]
