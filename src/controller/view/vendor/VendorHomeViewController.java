package controller.view.vendor;

import view.StageManager;
import view.common.EditProfileView;
import view.common.InvitationsView;
import view.common.InvitedEventsView;
import view.vendor.view.VendorProductsView;

public class VendorHomeViewController {

    public static void handleViewAcceptedEventsRedirect() {
        StageManager.getInstance().switchScene(InvitedEventsView.class);
    }

    public static void handleViewInvitationsRedirect() {
        StageManager.getInstance().switchScene(InvitationsView.class);
    }

    public static void handleMangeProductsRedirect() {
        StageManager.getInstance().switchScene(VendorProductsView.class);
    }

    public static void handleEditProfileRedirect() {
        StageManager.getInstance().switchScene(EditProfileView.class);
    }
}
