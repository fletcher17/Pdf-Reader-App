package com.raywenderlich.android.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00063"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "", "addBookmark", "Lcom/raywenderlich/android/majesticreaderr/interactors/AddBookMark;", "getBookmarks", "Lcom/raywenderlich/android/majesticreaderr/interactors/GetBookMarks;", "deleteBookmark", "Lcom/raywenderlich/android/majesticreaderr/interactors/RemoveBookMark;", "addDocument", "Lcom/raywenderlich/android/majesticreaderr/interactors/AddDocument;", "getDocuments", "Lcom/raywenderlich/android/majesticreaderr/interactors/GetDocuments;", "removeDocument", "Lcom/raywenderlich/android/majesticreaderr/interactors/RemoveDocument;", "getOpenDocument", "Lcom/raywenderlich/android/majesticreaderr/interactors/GetOpenDocument;", "setOpenDocument", "Lcom/raywenderlich/android/majesticreaderr/interactors/SetOpenDocument;", "(Lcom/raywenderlich/android/majesticreaderr/interactors/AddBookMark;Lcom/raywenderlich/android/majesticreaderr/interactors/GetBookMarks;Lcom/raywenderlich/android/majesticreaderr/interactors/RemoveBookMark;Lcom/raywenderlich/android/majesticreaderr/interactors/AddDocument;Lcom/raywenderlich/android/majesticreaderr/interactors/GetDocuments;Lcom/raywenderlich/android/majesticreaderr/interactors/RemoveDocument;Lcom/raywenderlich/android/majesticreaderr/interactors/GetOpenDocument;Lcom/raywenderlich/android/majesticreaderr/interactors/SetOpenDocument;)V", "getAddBookmark", "()Lcom/raywenderlich/android/majesticreaderr/interactors/AddBookMark;", "getAddDocument", "()Lcom/raywenderlich/android/majesticreaderr/interactors/AddDocument;", "getDeleteBookmark", "()Lcom/raywenderlich/android/majesticreaderr/interactors/RemoveBookMark;", "getGetBookmarks", "()Lcom/raywenderlich/android/majesticreaderr/interactors/GetBookMarks;", "getGetDocuments", "()Lcom/raywenderlich/android/majesticreaderr/interactors/GetDocuments;", "getGetOpenDocument", "()Lcom/raywenderlich/android/majesticreaderr/interactors/GetOpenDocument;", "getRemoveDocument", "()Lcom/raywenderlich/android/majesticreaderr/interactors/RemoveDocument;", "getSetOpenDocument", "()Lcom/raywenderlich/android/majesticreaderr/interactors/SetOpenDocument;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Interactors {
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.AddBookMark addBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.GetBookMarks getBookmarks = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.RemoveBookMark deleteBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.AddDocument addDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.GetDocuments getDocuments = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.RemoveDocument removeDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.GetOpenDocument getOpenDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreaderr.interactors.SetOpenDocument setOpenDocument = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.framework.Interactors copy(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.AddBookMark addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.GetBookMarks getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.RemoveBookMark deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.SetOpenDocument setOpenDocument) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Interactors(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.AddBookMark addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.GetBookMarks getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.RemoveBookMark deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreaderr.interactors.SetOpenDocument setOpenDocument) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.AddBookMark component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.AddBookMark getAddBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.GetBookMarks component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.GetBookMarks getGetBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.RemoveBookMark component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.RemoveBookMark getDeleteBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.AddDocument component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.AddDocument getAddDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.GetDocuments component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.GetDocuments getGetDocuments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.RemoveDocument component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.RemoveDocument getRemoveDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.GetOpenDocument component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.GetOpenDocument getGetOpenDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.SetOpenDocument component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreaderr.interactors.SetOpenDocument getSetOpenDocument() {
        return null;
    }
}