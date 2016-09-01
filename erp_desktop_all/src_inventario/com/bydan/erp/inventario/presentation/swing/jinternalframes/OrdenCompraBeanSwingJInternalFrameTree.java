/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.inventario.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.inventario.util.OrdenCompraConstantesFunciones;
import com.bydan.erp.inventario.business.entity.OrdenCompra;

import com.bydan.erp.inventario.business.logic.*;


//import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.*;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityReturnGeneral;


//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class OrdenCompraBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //OrdenCompraBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeOrdenCompra;
	public JScrollPane jScrollPaneDatosGeneralOrdenCompra;
	public JScrollPane jScrollPaneTreeOrdenCompra;
	private JTree treeOrdenCompra;
	protected GridBagConstraints gridBagConstraintsOrdenCompra;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<OrdenCompra> ordencompras;	
	OrdenCompraLogic ordencompraLogic;
	OrdenCompraLogicAdditional ordencompraLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  OrdenCompraBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.ordencompras= new ArrayList<OrdenCompra>();
			
			ordencompraLogic=new OrdenCompraLogic();
			ordencompraLogicAdditional=new OrdenCompraLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<OrdenCompra> getOrdenCompras() throws Exception {			
		return this.ordencompras;
	}
	
	public void setOrdenCompras(List<OrdenCompra> newOrdenCompras) {
		this.ordencompras = newOrdenCompras;
	}
	
	private void initialize() throws Exception {	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
		int iWidth=(screenSize.width-screenSize.width/3);
		int iHeight=(screenSize.height-screenSize.height/2);		
		
		this.setSize(iWidth,iHeight);
		
		this.setContentPane(this.getJContentPane(iWidth,iHeight));
	
		this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
	    this.iconable=true;
		
		this.setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
		
		if(Constantes.CON_VARIAS_VENTANAS) {
			openFrameCount++;
			
			if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
				openFrameCount=0;
			}
		}
	
	}
	
	public JScrollPane getJContentPane(int iWidth,int iHeight) throws Exception {	
		int iGridyPrincipal=0;
		
		this.defaultMutableTreeNode = new DefaultMutableTreeNode("ARBOL");
        //this.CargarTreeOrdenCompra(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeOrdenCompra = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeOrdenCompra.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeOrdenCompra.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeOrdenCompra.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeOrdenCompra.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeOrdenCompra.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeOrdenCompra = new JScrollPane(this.treeOrdenCompra);
		
		this.jScrollPaneTreeOrdenCompra.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeOrdenCompra.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeOrdenCompra.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralOrdenCompra = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeOrdenCompra.setToolTipText("ARBOL");
        this.jPanelTreeOrdenCompra.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalOrdenCompra = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalOrdenCompra);
		
		GridBagLayout gridaBagLayoutTreeOrdenCompra= new GridBagLayout();
		this.jPanelTreeOrdenCompra.setLayout(gridaBagLayoutTreeOrdenCompra);
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = 0;		
		this.gridBagConstraintsOrdenCompra.gridx =0;
		
		this.jPanelTreeOrdenCompra.add(this.jScrollPaneTreeOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
		//this.gridBagConstraintsOrdenCompra.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsOrdenCompra.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		this.jScrollPaneDatosGeneralOrdenCompra=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL OrdenCompras"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralOrdenCompra.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralOrdenCompra.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralOrdenCompra.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralOrdenCompra;
	}
		
	public void CargarTreeOrdenCompra() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeOrdenCompra(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeOrdenCompra(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootOrdenCompra = null;
        DefaultMutableTreeNode defaultMutableTreeNodeOrdenCompra = null;
 
        defaultMutableTreeNodeRootOrdenCompra = new DefaultMutableTreeNode("OrdenCompraS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootOrdenCompra);
		
		ArrayList<OrdenCompra> ordencomprasPrimerNivel=this.getPrimerNivelOrdenCompras();
		ArrayList<OrdenCompra> ordencomprasHijos=new ArrayList<OrdenCompra>();
		
		for(OrdenCompra ordencompra:ordencomprasPrimerNivel){//ordencompras) {
			defaultMutableTreeNodeOrdenCompra = new DefaultMutableTreeNode(ordencompra);
			
			ordencomprasHijos=this.getHijosOrdenCompra(ordencompra);
			
			if(ordencomprasHijos.size()>0) {
				this.setHijosArbolOrdenCompra(ordencomprasHijos,defaultMutableTreeNodeOrdenCompra);
			}
			
			defaultMutableTreeNodeRootOrdenCompra.add(defaultMutableTreeNodeOrdenCompra);
		}
	}	
	
	public void setHijosArbolOrdenCompra(ArrayList<OrdenCompra> ordencomprasAux,DefaultMutableTreeNode defaultMutableTreeNodeOrdenCompraPadre) {
		ArrayList<OrdenCompra> ordencomprasHijos=new ArrayList<OrdenCompra>();
		DefaultMutableTreeNode defaultMutableTreeNodeOrdenCompra = null;
				 
		for(OrdenCompra ordencompra:ordencomprasAux) {
			defaultMutableTreeNodeOrdenCompra = new DefaultMutableTreeNode(ordencompra);
			
			ordencomprasHijos=this.getHijosOrdenCompra(ordencompra);
			
			if(ordencomprasHijos.size()>0) {
				this.setHijosArbolOrdenCompra(ordencomprasHijos,defaultMutableTreeNodeOrdenCompra);
			}
			
			defaultMutableTreeNodeOrdenCompraPadre.add(defaultMutableTreeNodeOrdenCompra);
		}
	}
	
	public ArrayList<OrdenCompra> getHijosOrdenCompra(OrdenCompra ordencompraPadre) {
		ArrayList<OrdenCompra> ordencomprasAux=new ArrayList<OrdenCompra>();
		
		for(OrdenCompra ordencompra:ordencompras) {
			if(ordencompra.getid_orden_compra()!=null && ordencompra.getid_orden_compra().equals(ordencompraPadre.getId())) {
				ordencomprasAux.add(ordencompra);
			}
		}
		return ordencomprasAux;
	}
	
	public ArrayList<OrdenCompra> getPrimerNivelOrdenCompras() {
		ArrayList<OrdenCompra> ordencomprasAux=new ArrayList<OrdenCompra>();
		
		for(OrdenCompra ordencompra:ordencompras) {
			if(ordencompra.getid_orden_compra()==null || ordencompra.getid_orden_compra()<=0) {
				ordencomprasAux.add(ordencompra);
			}
		}
		return ordencomprasAux;
	}
	
	public void CargarTreeOrdenCompraTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootOrdenCompra = null;
        DefaultMutableTreeNode defaultMutableTreeNodeOrdenCompra = null;
 
        defaultMutableTreeNodeRootOrdenCompra = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootOrdenCompra);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeOrdenCompra = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootOrdenCompra.add(defaultMutableTreeNodeOrdenCompra);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeOrdenCompra.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		OrdenCompra ordencompra = (OrdenCompra)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(ordencompra.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(ordencompra.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(ordencompra.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(ordencompra.getId(),this.sTipoBusqueda);			
			}
			
			//CERRAR VENTANA
			//this.jDesktopPane.add(this);			
	       	this.setVisible(false);
	        this.setSelected(false);			
			//this.dispose();
			//this=null;
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(userObject.toString());        
    }
	
	 public void clear() {
        this.defaultMutableTreeNode.removeAllChildren();
        this.defaultTreeModel.reload();
    }

	/** Remove the currently selected node. */
    public void removeCurrentNode() {
        TreePath currentSelection = this.treeOrdenCompra.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
                this.defaultTreeModel.removeNodeFromParent(currentNode);
                return;
            }
        } 

        // Either there was no selection, or the root was selected.
        //toolkit.beep();
    }

    /** Add child to the currently selected node. */
    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = this.treeOrdenCompra.getSelectionPath();

        if (parentPath == null) {
            parentNode = this.defaultMutableTreeNode;
        } else {
            parentNode = (DefaultMutableTreeNode)
                         (parentPath.getLastPathComponent());
        }

        return addObject(parentNode, child, true);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child) {
        return addObject(parent, child, false);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);

        if (parent == null) {
            parent = this.defaultMutableTreeNode;
        }
	
	//It is key to invoke this on the TreeModel, and NOT DefaultMutableTreeNode
        this.defaultTreeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());

        //Make sure the user can see the lovely new node.
        if (shouldBeVisible) {
            this.treeOrdenCompra.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }
	
	 public void treeNodesChanged(TreeModelEvent e) {
            DefaultMutableTreeNode node;
            node = (DefaultMutableTreeNode)(e.getTreePath().getLastPathComponent());

            /*
             * If the event lists children, then the changed
             * node is the child of the node we've already
             * gotten.  Otherwise, the changed node and the
             * specified node are the same.
             */

                int index = e.getChildIndices()[0];
                node = (DefaultMutableTreeNode)(node.getChildAt(index));

            System.out.println("The user has finished editing the node.");
            System.out.println("New value: " + node.getUserObject());
        }
        public void treeNodesInserted(TreeModelEvent e) {
        }
        public void treeNodesRemoved(TreeModelEvent e) {
        }
        public void treeStructureChanged(TreeModelEvent e) {
        }
		
	//CONTROL_FUNCION2
}

