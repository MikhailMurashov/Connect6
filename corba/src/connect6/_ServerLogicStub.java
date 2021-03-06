package connect6;


/**
* connect6/_ServerLogicStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from connect6.idl
* �����, 25 ������ 2018 �., 2:17:34 ������, ����������� �����
*/

public class _ServerLogicStub extends org.omg.CORBA.portable.ObjectImpl implements connect6.ServerLogic
{

  public void registerClient (connect6.ClientLogic client)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registerClient", true);
                connect6.ClientLogicHelper.write ($out, client);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                registerClient (client        );
            } finally {
                _releaseReply ($in);
            }
  } // registerClient

  public void sendMove (connect6.ClientLogic client, String move)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("sendMove", true);
                connect6.ClientLogicHelper.write ($out, client);
                $out.write_string (move);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                sendMove (client, move        );
            } finally {
                _releaseReply ($in);
            }
  } // sendMove

  public void receiveMove (String move)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("receiveMove", true);
                $out.write_string (move);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                receiveMove (move        );
            } finally {
                _releaseReply ($in);
            }
  } // receiveMove

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:connect6/ServerLogic:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ServerLogicStub
