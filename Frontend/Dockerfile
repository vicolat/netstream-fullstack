# Use Node.js environment
FROM node:18

# Set working directory
WORKDIR /app

# Copy all frontend files
COPY . .

# Install dependencies
RUN npm install

# Build React app
RUN npm run build

# Install static server
RUN npm install -g serve

# Expose frontend port
EXPOSE 3000

# Start the app
CMD ["serve", "-s", "build"]