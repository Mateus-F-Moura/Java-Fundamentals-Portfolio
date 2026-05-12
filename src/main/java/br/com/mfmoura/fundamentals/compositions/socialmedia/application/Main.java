package br.com.mfmoura.fundamentals.compositions.socialmedia.application;

import br.com.mfmoura.fundamentals.compositions.socialmedia.entities.Comment;
import br.com.mfmoura.fundamentals.compositions.socialmedia.entities.Post;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            List<Post> posts = new ArrayList<>();

            boolean more;
            do {
                System.out.println();
                Instant moment = Instant.now();
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Content: ");
                String content = sc.nextLine();

                Post post = new Post(moment, title, content);

                System.out.print("Give a like on this post? (true / false): ");
                boolean like = sc.nextBoolean();
                sc.nextLine();

                post.addLike(like);

                boolean makeComment;
                while (true) {
                    System.out.print("Make a comment? (true / false): ");
                    makeComment = sc.nextBoolean();
                    sc.nextLine();

                    if (!makeComment) {
                        break;
                    }

                    System.out.print("Text: ");
                    String text = sc.nextLine();
                    Comment comment = new Comment(text);

                    post.addComment(comment);
                }

                posts.add(post);

                System.out.println();
                System.out.print("Want to write/read more posts? (true / false): ");
                more = sc.nextBoolean();
                sc.nextLine();
            } while (more);

            int i = 1;
            for (Post p : posts) {
                System.out.println("===" + i +"# Post===");

                System.out.println(p);

                i++;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
