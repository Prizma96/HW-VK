package domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private int createdby;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private boolean frendsOnly;
    private int postNumber;
    private String postText;
    private String imageUrl;
    private String videoUrl;
    private String audioUrl;
    private Repost repost;
    private View view;
    private  CommentsText comment;
    private boolean letPost;
    private Copyright copyright;
    private Like like;
    private String type;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int copyHistory;
    private int canPin;
    private int canDelite;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postonedId;
}

// + get / set 