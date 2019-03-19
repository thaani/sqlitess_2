package com.example.sqlitess;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class ContactAdapter extends  RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private Context mCtx;

    //we are storing all the products in a list
    private List<Contact> contacts;

    public ContactAdapter(Context mCtx, List<Contact> contacts) {
        this.mCtx = mCtx;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_contact, null);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact = contacts.get(position);
holder.name.setText(contact.get_name());
holder.mobile.setText(contact.get_phone_number());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView name,mobile;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            mobile=itemView.findViewById(R.id.mobile);

        }
    }
}
