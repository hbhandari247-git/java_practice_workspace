package procparttwo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Example of an asynchronous computation
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate a long-running task
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello, World!";
        });

        // Block and get the result of the Future
        String result = future.get();  // This will block until the computation is complete

        System.out.println(result);  // Output: Hello, World!
    }
}


/*public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // First task
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello";
        });

        // Chaining a dependent task
        CompletableFuture<String> chainedFuture = future.thenApply(result -> result + ", World!");

        // Block and get the result of the Future
        String result = chainedFuture.get();

        System.out.println(result);  // Output: Hello, World!
    }
}*/

/*public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "World";
        });

        // Combine the results of both Futures
        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + " " + result2);

        // Block and get the result of the Future
        String result = combinedFuture.get();

        System.out.println(result);  // Output: Hello World
    }
}*/

/*public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) {
                throw new IllegalStateException("Computation error!");
            }
            return "Hello, World!";
        });

        // Handle errors
        CompletableFuture<String> handledFuture = future.handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Exception: " + ex.getMessage());
                return "Default Value";
            }
            return result;
        });

        try {
            // Block and get the result of the Future
            String result = handledFuture.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
} */
