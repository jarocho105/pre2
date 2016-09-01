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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ClienteImagenConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;

	
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("unused")
public class ClienteImagenDetalleFormJInternalFrame extends ClienteImagenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleClienteImagen;
	
	protected JMenuBar jmenuBarDetalleClienteImagen;
	
	protected JMenu jmenuDetalleClienteImagen;
	protected JMenu jmenuDetalleArchivoClienteImagen;
	protected JMenu jmenuDetalleAccionesClienteImagen;
	protected JMenu jmenuDetalleDatosClienteImagen;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteImagen;	
	protected GridBagConstraints gridBagConstraintsClienteImagen;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ClienteImagenBeanSwingJInternalFrameAdditional jInternalFrameDetalleClienteImagen;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoImagenPersonaBeanSwingJInternalFrame tipoimagenpersonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimagenpersona="";

	protected TipoImagenBeanSwingJInternalFrame tipoimagenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimagen="";
	
	public ClienteImagenSessionBean clienteimagenSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoImagenPersonaSessionBean tipoimagenpersonaSessionBean;
	public TipoImagenSessionBean tipoimagenSessionBean;	
	
	public ClienteImagenLogic clienteimagenLogic;
	
	public JScrollPane jScrollPanelDatosClienteImagen;
	public JScrollPane jScrollPanelDatosEdicionClienteImagen;
	public JScrollPane jScrollPanelDatosGeneralClienteImagen;
	
	protected JPanel jPanelCamposClienteImagen;    
	protected JPanel jPanelCamposOcultosClienteImagen;    	
	protected JPanel jPanelAccionesClienteImagen;
	protected JPanel jPanelAccionesFormularioClienteImagen;
    
	
	
	protected Integer iXPanelCamposClienteImagen=0;
	protected Integer iYPanelCamposClienteImagen=0;
	
	protected Integer iXPanelCamposOcultosClienteImagen=0;
	protected Integer iYPanelCamposOcultosClienteImagen=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoClienteImagen;
	public JButton jButtonModificarClienteImagen;
	public JButton jButtonActualizarClienteImagen;
    public JButton jButtonEliminarClienteImagen;
	public JButton jButtonCancelarClienteImagen;
    public JButton jButtonGuardarCambiosClienteImagen;
	public JButton jButtonGuardarCambiosTablaClienteImagen;
	protected JButton jButtonCerrarClienteImagen;
	
	
	protected JButton jButtonProcesarInformacionClienteImagen;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoClienteImagen;
	protected JCheckBox jCheckBoxPostAccionSinCerrarClienteImagen;
	protected JCheckBox jCheckBoxPostAccionSinMensajeClienteImagen;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteImagen;
	protected JButton jButtonModificarToolBarClienteImagen;
	protected JButton jButtonActualizarToolBarClienteImagen;
    protected JButton jButtonEliminarToolBarClienteImagen;
	protected JButton jButtonCancelarToolBarClienteImagen;
    protected JButton jButtonGuardarCambiosToolBarClienteImagen;
	protected JButton jButtonGuardarCambiosTablaToolBarClienteImagen;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteImagen;
	protected JButton jButtonCerrarToolBarClienteImagen;
	
	protected JButton jButtonProcesarInformacionToolBarClienteImagen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteImagen;
	protected JMenuItem jMenuItemModificarClienteImagen;
	protected JMenuItem jMenuItemActualizarClienteImagen;
    protected JMenuItem jMenuItemEliminarClienteImagen;
	protected JMenuItem jMenuItemCancelarClienteImagen;
    protected JMenuItem jMenuItemGuardarCambiosClienteImagen;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteImagen;
	protected JMenuItem jMenuItemCerrarClienteImagen;
	protected JMenuItem jMenuItemDetalleCerrarClienteImagen;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteImagen;
	
	protected JMenuItem jMenuItemProcesarInformacionClienteImagen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteImagen;
	protected JMenuItem jMenuItemMostrarOcultarClienteImagen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteImagen;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteImagen;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioClienteImagen;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidClienteImagen;
	public JLabel jLabelIdClienteImagen;
	public JLabel jLabelidClienteImagen;
	public JButton jButtonidClienteImagenBusqueda= new JButtonMe();

	public JPanel jPanelnombreClienteImagen;
	public JLabel jLabelnombreClienteImagen;
	public JTextField jTextFieldnombreClienteImagen;
	public JButton jButtonnombreClienteImagenBusqueda= new JButtonMe();

	public JPanel jPanelimagenClienteImagen;
	public JLabel jLabelimagenClienteImagen;
	public JFileChooser jFileChooserimagenClienteImagen = new JFileChooser();
	public JButton jButtonimagenClienteImagen= new JButtonMe("...");
	public JLabel jLabelImagenimagenClienteImagen= new JLabelMe("Imagen");

	public JButton jButtonDescargarimagenClienteImagen= new JButtonMe("Descargar");
	public JButton jButtonimagenClienteImagenBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionClienteImagen;
	public JLabel jLabeldescripcionClienteImagen;
	public JTextArea jTextAreadescripcionClienteImagen;
	public JScrollPane jscrollPanedescripcionClienteImagen;
	public JButton jButtondescripcionClienteImagenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteClienteImagen;
	public JLabel jLabelid_clienteClienteImagen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteClienteImagen;
	public JButton jButtonid_clienteClienteImagen= new JButtonMe();
	public JButton jButtonid_clienteClienteImagenUpdate= new JButtonMe();
	public JButton jButtonid_clienteClienteImagenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_imagen_personaClienteImagen;
	public JLabel jLabelid_tipo_imagen_personaClienteImagen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_imagen_personaClienteImagen;
	public JButton jButtonid_tipo_imagen_personaClienteImagen= new JButtonMe();
	public JButton jButtonid_tipo_imagen_personaClienteImagenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_imagen_personaClienteImagenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_imagenClienteImagen;
	public JLabel jLabelid_tipo_imagenClienteImagen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_imagenClienteImagen;
	public JButton jButtonid_tipo_imagenClienteImagen= new JButtonMe();
	public JButton jButtonid_tipo_imagenClienteImagenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_imagenClienteImagenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesClienteImagen;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ClienteImagenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposClienteImagen=new JPanel();
				this.jPanelAccionesFormularioClienteImagen=new JPanel();
				this.jmenuBarDetalleClienteImagen=new JMenuBar();
				this.jTtoolBarDetalleClienteImagen=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteImagenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ClienteImagenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteImagenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteImagenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteImagenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarClienteImagen() {
		return this.jButtonActualizarToolBarClienteImagen;
	}
	
	public JButton getjButtonEliminarToolBarClienteImagen() {
		return this.jButtonEliminarToolBarClienteImagen;
	}
	
	public JButton getjButtonCancelarToolBarClienteImagen() {
		return this.jButtonCancelarToolBarClienteImagen;
	}		
	
	public JButton getjButtonProcesarInformacionClienteImagen() {
		return this.jButtonProcesarInformacionClienteImagen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteImagen)	{
		this.jButtonProcesarInformacionClienteImagen = jButtonProcesarInformacionClienteImagen;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteImagen() {
		return this.jComboBoxTiposAccionesClienteImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteImagen(
			JComboBox jComboBoxTiposRelacionesClienteImagen) {
		this.jComboBoxTiposRelacionesClienteImagen = jComboBoxTiposRelacionesClienteImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteImagen(
			JComboBox jComboBoxTiposAccionesClienteImagen) {
		this.jComboBoxTiposAccionesClienteImagen = jComboBoxTiposAccionesClienteImagen;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioClienteImagen() {
		return this.jComboBoxTiposAccionesFormularioClienteImagen;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioClienteImagen(
			JComboBox jComboBoxTiposAccionesFormularioClienteImagen) {
		this.jComboBoxTiposAccionesFormularioClienteImagen = jComboBoxTiposAccionesFormularioClienteImagen;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.clienteimagenSessionBean=new ClienteImagenSessionBean();
		
		this.clienteimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clienteimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clienteimagenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteImagenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cliente Imagen MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ClienteImagenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleClienteImagen= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarClienteImagen=new JButtonMe();
				this.jButtonModificarToolBarClienteImagen=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarClienteImagen,this.jTtoolBarDetalleClienteImagen,
							"actualizar","actualizar","Actualizar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarClienteImagen,this.jTtoolBarDetalleClienteImagen,
							"eliminar","eliminar","Eliminar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarClienteImagen,this.jTtoolBarDetalleClienteImagen,
							"cancelar","cancelar","Cancelar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarClienteImagen,this.jTtoolBarDetalleClienteImagen,
							"guardarcambios","guardarcambios","Guardar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleClienteImagen=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleClienteImagen=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoClienteImagen=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesClienteImagen=new JMenuMe("Acciones");
		this.jmenuDetalleDatosClienteImagen=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteImagen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteImagen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteImagen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarClienteImagen= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarClienteImagen.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarClienteImagen,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarClienteImagen= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarClienteImagen.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarClienteImagen,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarClienteImagen= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarClienteImagen.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarClienteImagen,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarClienteImagen= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarClienteImagen.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarClienteImagen,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosClienteImagen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteImagen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteImagen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteImagen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteImagen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteImagen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarClienteImagen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarClienteImagen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarClienteImagen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteImagen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteImagen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoClienteImagen.add(this.jMenuItemDetalleCerrarClienteImagen);
		
		this.jmenuDetalleAccionesClienteImagen.add(this.jMenuItemActualizarClienteImagen);
		this.jmenuDetalleAccionesClienteImagen.add(this.jMenuItemEliminarClienteImagen);
		this.jmenuDetalleAccionesClienteImagen.add(this.jMenuItemCancelarClienteImagen);		
		
		//this.jmenuDetalleDatosClienteImagen.add(this.jMenuItemDetalleAbrirOrderByClienteImagen);				
		this.jmenuDetalleDatosClienteImagen.add(this.jMenuItemDetalleMostarOcultarClienteImagen);				
				
		//this.jmenuDetalleAccionesClienteImagen.add(this.jMenuItemGuardarCambiosClienteImagen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleClienteImagen.add(this.jmenuDetalleArchivoClienteImagen);		
		this.jmenuBarDetalleClienteImagen.add(this.jmenuDetalleAccionesClienteImagen);		
		this.jmenuBarDetalleClienteImagen.add(this.jmenuDetalleDatosClienteImagen);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleClienteImagen);				
	}
	
	
	public void inicializarElementosCamposClienteImagen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdClienteImagen = new JLabelMe();
		jLabelIdClienteImagen.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidClienteImagen = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidClienteImagen.setToolTipText(ClienteImagenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutClienteImagen= new GridBagLayout();

		this.jPanelidClienteImagen.setLayout(this.gridaBagLayoutClienteImagen);

		jLabelidClienteImagen = new JLabel();
		jLabelidClienteImagen.setText("Id");

		jLabelidClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreClienteImagen = new JLabelMe();
		this.jLabelnombreClienteImagen.setText(""+ClienteImagenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreClienteImagen.setToolTipText("Nombre");
		this.jLabelnombreClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreClienteImagen.setToolTipText(ClienteImagenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutClienteImagen = new GridBagLayout();
		this.jPanelnombreClienteImagen.setLayout(this.gridaBagLayoutClienteImagen);


		jTextFieldnombreClienteImagen= new JTextFieldMe();

		jTextFieldnombreClienteImagen.setEnabled(false);
		jTextFieldnombreClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreClienteImagenBusqueda= new JButtonMe();
		this.jButtonnombreClienteImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClienteImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClienteImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreClienteImagenBusqueda.setText("U");
		this.jButtonnombreClienteImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreClienteImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreClienteImagenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreClienteImagenBusqueda"));

		if(this.clienteimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreClienteImagenBusqueda.setVisible(false);		}


					
		this.jLabelimagenClienteImagen = new JLabelMe();
		this.jLabelimagenClienteImagen.setText(""+ClienteImagenConstantesFunciones.LABEL_IMAGEN+" : *");
		this.jLabelimagenClienteImagen.setToolTipText("Imagen");
		this.jLabelimagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimagenClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimagenClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimagenClienteImagen.setToolTipText(ClienteImagenConstantesFunciones.LABEL_IMAGEN);
		this.gridaBagLayoutClienteImagen = new GridBagLayout();
		this.jPanelimagenClienteImagen.setLayout(this.gridaBagLayoutClienteImagen);

		this.jButtonimagenClienteImagenBusqueda= new JButtonMe();
		this.jButtonimagenClienteImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimagenClienteImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimagenClienteImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimagenClienteImagenBusqueda.setText("U");
		this.jButtonimagenClienteImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimagenClienteImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimagenClienteImagenBusqueda,"buscardatos","BUSCAR DATOS");

		if(this.clienteimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimagenClienteImagenBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionClienteImagen = new JLabelMe();
		this.jLabeldescripcionClienteImagen.setText(""+ClienteImagenConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionClienteImagen.setToolTipText("Descripcion");
		this.jLabeldescripcionClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionClienteImagen.setToolTipText(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutClienteImagen = new GridBagLayout();
		this.jPaneldescripcionClienteImagen.setLayout(this.gridaBagLayoutClienteImagen);


		jTextAreadescripcionClienteImagen= new JTextAreaMe();
		jTextAreadescripcionClienteImagen.setEnabled(false);
		jTextAreadescripcionClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteImagen.setLineWrap(true);
		jTextAreadescripcionClienteImagen.setWrapStyleWord(true);
		jTextAreadescripcionClienteImagen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionClienteImagen.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionClienteImagen = new JScrollPane(jTextAreadescripcionClienteImagen);
		jscrollPanedescripcionClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionClienteImagenBusqueda= new JButtonMe();
		this.jButtondescripcionClienteImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionClienteImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionClienteImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionClienteImagenBusqueda.setText("U");
		this.jButtondescripcionClienteImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionClienteImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionClienteImagenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionClienteImagenBusqueda"));

		if(this.clienteimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionClienteImagenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysClienteImagen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_clienteClienteImagen = new JLabelMe();
		this.jLabelid_clienteClienteImagen.setText(""+ClienteImagenConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteClienteImagen.setToolTipText("Idcliente");
		this.jLabelid_clienteClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteClienteImagen.setToolTipText(ClienteImagenConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutClienteImagen = new GridBagLayout();
		this.jPanelid_clienteClienteImagen.setLayout(this.gridaBagLayoutClienteImagen);


		jComboBoxid_clienteClienteImagen= new JComboBoxMe();
		jComboBoxid_clienteClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteClienteImagen= new JButtonMe();
		this.jButtonid_clienteClienteImagen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteImagen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteImagen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteImagen.setText("Buscar");
		this.jButtonid_clienteClienteImagen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteClienteImagen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteImagen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteImagen"));

		this.jButtonid_clienteClienteImagenBusqueda= new JButtonMe();
		this.jButtonid_clienteClienteImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteImagenBusqueda.setText("U");
		this.jButtonid_clienteClienteImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteClienteImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteImagenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteImagenBusqueda"));

		if(this.clienteimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteClienteImagenBusqueda.setVisible(false);		}

		this.jButtonid_clienteClienteImagenUpdate= new JButtonMe();
		this.jButtonid_clienteClienteImagenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteImagenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteImagenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteImagenUpdate.setText("U");
		this.jButtonid_clienteClienteImagenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteClienteImagenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteImagenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteImagenUpdate"));



					
		this.jLabelid_tipo_imagen_personaClienteImagen = new JLabelMe();
		this.jLabelid_tipo_imagen_personaClienteImagen.setText(""+ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA+" : *");
		this.jLabelid_tipo_imagen_personaClienteImagen.setToolTipText("Tipo Imagen Persona");
		this.jLabelid_tipo_imagen_personaClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_imagen_personaClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_imagen_personaClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_imagen_personaClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_imagen_personaClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_imagen_personaClienteImagen.setToolTipText(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA);
		this.gridaBagLayoutClienteImagen = new GridBagLayout();
		this.jPanelid_tipo_imagen_personaClienteImagen.setLayout(this.gridaBagLayoutClienteImagen);


		jComboBoxid_tipo_imagen_personaClienteImagen= new JComboBoxMe();
		jComboBoxid_tipo_imagen_personaClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagen_personaClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagen_personaClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_imagen_personaClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_imagen_personaClienteImagen= new JButtonMe();
		this.jButtonid_tipo_imagen_personaClienteImagen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagen_personaClienteImagen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagen_personaClienteImagen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagen_personaClienteImagen.setText("Buscar");
		this.jButtonid_tipo_imagen_personaClienteImagen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_imagen_personaClienteImagen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagen_personaClienteImagen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_imagen_personaClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagen_personaClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagen_personaClienteImagen"));

		this.jButtonid_tipo_imagen_personaClienteImagenBusqueda= new JButtonMe();
		this.jButtonid_tipo_imagen_personaClienteImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagen_personaClienteImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagen_personaClienteImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_imagen_personaClienteImagenBusqueda.setText("U");
		this.jButtonid_tipo_imagen_personaClienteImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_imagen_personaClienteImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagen_personaClienteImagenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_imagen_personaClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagen_personaClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagen_personaClienteImagenBusqueda"));

		if(this.clienteimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_imagen_personaClienteImagenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_imagen_personaClienteImagenUpdate= new JButtonMe();
		this.jButtonid_tipo_imagen_personaClienteImagenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagen_personaClienteImagenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagen_personaClienteImagenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_imagen_personaClienteImagenUpdate.setText("U");
		this.jButtonid_tipo_imagen_personaClienteImagenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_imagen_personaClienteImagenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagen_personaClienteImagenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_imagen_personaClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagen_personaClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagen_personaClienteImagenUpdate"));



					
		this.jLabelid_tipo_imagenClienteImagen = new JLabelMe();
		this.jLabelid_tipo_imagenClienteImagen.setText(""+ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN+" : *");
		this.jLabelid_tipo_imagenClienteImagen.setToolTipText("Tipo Imagen");
		this.jLabelid_tipo_imagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_imagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_imagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_imagenClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_imagenClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_imagenClienteImagen.setToolTipText(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN);
		this.gridaBagLayoutClienteImagen = new GridBagLayout();
		this.jPanelid_tipo_imagenClienteImagen.setLayout(this.gridaBagLayoutClienteImagen);


		jComboBoxid_tipo_imagenClienteImagen= new JComboBoxMe();
		jComboBoxid_tipo_imagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_imagenClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_imagenClienteImagen= new JButtonMe();
		this.jButtonid_tipo_imagenClienteImagen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagenClienteImagen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagenClienteImagen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagenClienteImagen.setText("Buscar");
		this.jButtonid_tipo_imagenClienteImagen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_imagenClienteImagen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagenClienteImagen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_imagenClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagenClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagenClienteImagen"));

		this.jButtonid_tipo_imagenClienteImagenBusqueda= new JButtonMe();
		this.jButtonid_tipo_imagenClienteImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenClienteImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenClienteImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_imagenClienteImagenBusqueda.setText("U");
		this.jButtonid_tipo_imagenClienteImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_imagenClienteImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagenClienteImagenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_imagenClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagenClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagenClienteImagenBusqueda"));

		if(this.clienteimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_imagenClienteImagenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_imagenClienteImagenUpdate= new JButtonMe();
		this.jButtonid_tipo_imagenClienteImagenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenClienteImagenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenClienteImagenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_imagenClienteImagenUpdate.setText("U");
		this.jButtonid_tipo_imagenClienteImagenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_imagenClienteImagenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagenClienteImagenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_imagenClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagenClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagenClienteImagenUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleClienteImagen = new ClienteImagenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cliente Imagen DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteImagen= new GridBagLayout();
		

		
		String sToolTipClienteImagen="";
		sToolTipClienteImagen=ClienteImagenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteImagen+="(Cartera.ClienteImagen)";
		}
		
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteImagen+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoClienteImagen = new JButtonMe();
		this.jButtonModificarClienteImagen = new JButtonMe();
        this.jButtonActualizarClienteImagen = new JButtonMe();
        this.jButtonEliminarClienteImagen = new JButtonMe();
        this.jButtonCancelarClienteImagen = new JButtonMe();
        this.jButtonGuardarCambiosClienteImagen = new JButtonMe();
		this.jButtonGuardarCambiosTablaClienteImagen = new JButtonMe();
		this.jButtonCerrarClienteImagen = new JButtonMe();
		
		this.jScrollPanelDatosClienteImagen = new JScrollPane();   
        this.jScrollPanelDatosEdicionClienteImagen = new JScrollPane();
		this.jScrollPanelDatosGeneralClienteImagen = new JScrollPane();
				
		
		
		this.jPanelCamposClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cliente Imagen";
		
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Imagenes" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposClienteImagen.setName("jPanelCamposClienteImagen"); 

		this.jPanelCamposOcultosClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosClienteImagen.setName("jPanelCamposOcultosClienteImagen"); 

        this.jPanelAccionesClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteImagen.setToolTipText("Acciones");
        this.jPanelAccionesClienteImagen.setName("Acciones"); 

		this.jPanelAccionesFormularioClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioClienteImagen.setToolTipText("Acciones");
        this.jPanelAccionesFormularioClienteImagen.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoClienteImagen.setText("Nuevo");
		this.jButtonModificarClienteImagen.setText("Editar");
        this.jButtonActualizarClienteImagen.setText("Actualizar");
        this.jButtonEliminarClienteImagen.setText("Eliminar");
        this.jButtonCancelarClienteImagen.setText("Cancelar");
        this.jButtonGuardarCambiosClienteImagen.setText("Guardar");
		this.jButtonGuardarCambiosTablaClienteImagen.setText("Guardar");
		this.jButtonCerrarClienteImagen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteImagen,"nuevo_button","Nuevo",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarClienteImagen,"modificar_button","Editar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarClienteImagen,"actualizar_button","Actualizar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarClienteImagen,"eliminar_button","Eliminar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarClienteImagen,"cancelar_button","Cancelar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosClienteImagen,"guardarcambios_button","Guardar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteImagen,"guardarcambiostabla_button","Guardar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteImagen,"cerrar_button","Salir",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoClienteImagen.setToolTipText("Nuevo"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarClienteImagen.setToolTipText("Editar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarClienteImagen.setToolTipText("Actualizar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarClienteImagen.setToolTipText("Eliminar)"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarClienteImagen.setToolTipText("Cancelar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosClienteImagen.setToolTipText("Guardar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaClienteImagen.setToolTipText("Guardar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteImagen.setToolTipText("Salir"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoClienteImagen";
		inputMap = this.jButtonNuevoClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteImagen"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarClienteImagen";
		inputMap = this.jButtonActualizarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarClienteImagen"));
		
		//ELIMINAR
		sMapKey = "EliminarClienteImagen";
		inputMap = this.jButtonEliminarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarClienteImagen"));
		
		//CANCELAR	
		sMapKey = "CancelarClienteImagen";
		inputMap = this.jButtonCancelarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarClienteImagen"));
		
		//CERRAR		
		sMapKey = "CerrarClienteImagen";
		inputMap = this.jButtonCerrarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteImagen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteImagen";
		inputMap = this.jButtonGuardarCambiosTablaClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteImagen"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoClienteImagen = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoClienteImagen.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoClienteImagen.setToolTipText("Nuevo ClienteImagen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarClienteImagen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarClienteImagen.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarClienteImagen.setToolTipText("Sin Cerrar Ventana ClienteImagen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeClienteImagen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeClienteImagen.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeClienteImagen.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteImagen.setText("Accion");
		this.jComboBoxTiposAccionesClienteImagen.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioClienteImagen.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioClienteImagen.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesClienteImagen = new JLabelMe();
		
		this.jLabelAccionesClienteImagen.setText("Acciones");		
		this.jLabelAccionesClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposClienteImagen();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysClienteImagen();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesClienteImagen=new JTabbedPane();
		this.jTabbedPaneRelacionesClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesClienteImagen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesClienteImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioClienteImagen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteImagen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteImagen.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposClienteImagen = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosClienteImagen = new GridBagLayout();
		
		this.jPanelCamposClienteImagen.setLayout(gridaBagLayoutCamposClienteImagen);
		this.jPanelCamposOcultosClienteImagen.setLayout(gridaBagLayoutCamposOcultosClienteImagen);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 0;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidClienteImagen.add(jLabelIdClienteImagen, this.gridBagConstraintsClienteImagen);



	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 1;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidClienteImagen.add(jLabelidClienteImagen, this.gridBagConstraintsClienteImagen);


	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 0;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteClienteImagen.add(jLabelid_clienteClienteImagen, this.gridBagConstraintsClienteImagen);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 2;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteClienteImagen.add(jButtonid_clienteClienteImagen, this.gridBagConstraintsClienteImagen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 3;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteImagen.add(jButtonid_clienteClienteImagenBusqueda, this.gridBagConstraintsClienteImagen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 4;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteImagen.add(jButtonid_clienteClienteImagenUpdate, this.gridBagConstraintsClienteImagen);
	}

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 1;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteClienteImagen.add(jComboBoxid_clienteClienteImagen, this.gridBagConstraintsClienteImagen);


	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 0;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_imagen_personaClienteImagen.add(jLabelid_tipo_imagen_personaClienteImagen, this.gridBagConstraintsClienteImagen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 2;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_imagen_personaClienteImagen.add(jButtonid_tipo_imagen_personaClienteImagenBusqueda, this.gridBagConstraintsClienteImagen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 3;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_imagen_personaClienteImagen.add(jButtonid_tipo_imagen_personaClienteImagenUpdate, this.gridBagConstraintsClienteImagen);
	}

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 1;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_imagen_personaClienteImagen.add(jComboBoxid_tipo_imagen_personaClienteImagen, this.gridBagConstraintsClienteImagen);


	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 0;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_imagenClienteImagen.add(jLabelid_tipo_imagenClienteImagen, this.gridBagConstraintsClienteImagen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 2;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_imagenClienteImagen.add(jButtonid_tipo_imagenClienteImagenBusqueda, this.gridBagConstraintsClienteImagen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 3;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_imagenClienteImagen.add(jButtonid_tipo_imagenClienteImagenUpdate, this.gridBagConstraintsClienteImagen);
	}

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 1;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_imagenClienteImagen.add(jComboBoxid_tipo_imagenClienteImagen, this.gridBagConstraintsClienteImagen);


	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 0;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreClienteImagen.add(jLabelnombreClienteImagen, this.gridBagConstraintsClienteImagen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 2;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreClienteImagen.add(jButtonnombreClienteImagenBusqueda, this.gridBagConstraintsClienteImagen);
	}

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 1;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreClienteImagen.add(jTextFieldnombreClienteImagen, this.gridBagConstraintsClienteImagen);


	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 0;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimagenClienteImagen.add(jLabelimagenClienteImagen, this.gridBagConstraintsClienteImagen);



	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 2;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
	this.jPanelimagenClienteImagen.add(jButtonDescargarimagenClienteImagen, this.gridBagConstraintsClienteImagen);

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 3;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
	this.jPanelimagenClienteImagen.add(jLabelImagenimagenClienteImagen, this.gridBagConstraintsClienteImagen);

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 2;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelimagenClienteImagen.add(jButtonimagenClienteImagenBusqueda, this.gridBagConstraintsClienteImagen);
	}

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 1;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimagenClienteImagen.add(jButtonimagenClienteImagen, this.gridBagConstraintsClienteImagen);


	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 0;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionClienteImagen.add(jLabeldescripcionClienteImagen, this.gridBagConstraintsClienteImagen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 2;
		this.gridBagConstraintsClienteImagen.ipadx = 0;
		this.gridBagConstraintsClienteImagen.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionClienteImagen.add(jButtondescripcionClienteImagenBusqueda, this.gridBagConstraintsClienteImagen);
	}

	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteImagen.gridy = 0;
	this.gridBagConstraintsClienteImagen.gridx = 1;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionClienteImagen.add(jscrollPanedescripcionClienteImagen, this.gridBagConstraintsClienteImagen);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteImagen.gridy = iYPanelCamposClienteImagen;
	this.gridBagConstraintsClienteImagen.gridx = iXPanelCamposClienteImagen++;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteImagen.add(this.jPanelidClienteImagen, this.gridBagConstraintsClienteImagen);



	if(iXPanelCamposClienteImagen % 1==0) {
		iXPanelCamposClienteImagen=0;
		iYPanelCamposClienteImagen++;
	}
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteImagen.gridy = iYPanelCamposClienteImagen;
	this.gridBagConstraintsClienteImagen.gridx = iXPanelCamposClienteImagen++;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteImagen.add(this.jPanelid_clienteClienteImagen, this.gridBagConstraintsClienteImagen);



	if(iXPanelCamposClienteImagen % 1==0) {
		iXPanelCamposClienteImagen=0;
		iYPanelCamposClienteImagen++;
	}
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteImagen.gridy = iYPanelCamposClienteImagen;
	this.gridBagConstraintsClienteImagen.gridx = iXPanelCamposClienteImagen++;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteImagen.add(this.jPanelid_tipo_imagen_personaClienteImagen, this.gridBagConstraintsClienteImagen);



	if(iXPanelCamposClienteImagen % 1==0) {
		iXPanelCamposClienteImagen=0;
		iYPanelCamposClienteImagen++;
	}
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteImagen.gridy = iYPanelCamposClienteImagen;
	this.gridBagConstraintsClienteImagen.gridx = iXPanelCamposClienteImagen++;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteImagen.add(this.jPanelid_tipo_imagenClienteImagen, this.gridBagConstraintsClienteImagen);



	if(iXPanelCamposClienteImagen % 1==0) {
		iXPanelCamposClienteImagen=0;
		iYPanelCamposClienteImagen++;
	}
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteImagen.gridy = iYPanelCamposClienteImagen;
	this.gridBagConstraintsClienteImagen.gridx = iXPanelCamposClienteImagen++;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteImagen.add(this.jPanelnombreClienteImagen, this.gridBagConstraintsClienteImagen);



	if(iXPanelCamposClienteImagen % 1==0) {
		iXPanelCamposClienteImagen=0;
		iYPanelCamposClienteImagen++;
	}
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteImagen.gridy = iYPanelCamposClienteImagen;
	this.gridBagConstraintsClienteImagen.gridx = iXPanelCamposClienteImagen++;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteImagen.add(this.jPanelimagenClienteImagen, this.gridBagConstraintsClienteImagen);



	if(iXPanelCamposClienteImagen % 1==0) {
		iXPanelCamposClienteImagen=0;
		iYPanelCamposClienteImagen++;
	}
	this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteImagen.gridy = iYPanelCamposClienteImagen;
	this.gridBagConstraintsClienteImagen.gridx = iXPanelCamposClienteImagen++;
	this.gridBagConstraintsClienteImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteImagen.add(this.jPaneldescripcionClienteImagen, this.gridBagConstraintsClienteImagen);



	if(iXPanelCamposClienteImagen % 1==0) {
		iXPanelCamposClienteImagen=0;
		iYPanelCamposClienteImagen++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesClienteImagen= new GridBagLayout();
		this.jPanelAccionesClienteImagen.setLayout(gridaBagLayoutAccionesClienteImagen);
		
		GridBagLayout gridaBagLayoutAccionesFormularioClienteImagen= new GridBagLayout();
		this.jPanelAccionesFormularioClienteImagen.setLayout(gridaBagLayoutAccionesFormularioClienteImagen);
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteImagen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteImagen.add(this.jComboBoxTiposAccionesFormularioClienteImagen, this.gridBagConstraintsClienteImagen);

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteImagen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteImagen.add(this.jCheckBoxPostAccionNuevoClienteImagen, this.gridBagConstraintsClienteImagen);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.clienteimagenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteImagen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteImagen.add(this.jCheckBoxPostAccionSinCerrarClienteImagen, this.gridBagConstraintsClienteImagen);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.clienteimagenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteImagen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteImagen.add(this.jCheckBoxPostAccionSinMensajeClienteImagen, this.gridBagConstraintsClienteImagen);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = iPosXAccion++;
			
		this.jPanelAccionesClienteImagen.add(this.jButtonModificarClienteImagen, this.gridBagConstraintsClienteImagen);							

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx =iPosXAccion++;
			
		this.jPanelAccionesClienteImagen.add(this.jButtonEliminarClienteImagen, this.gridBagConstraintsClienteImagen);
		
			
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = 0;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteImagen.add(this.jButtonActualizarClienteImagen, this.gridBagConstraintsClienteImagen);


		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = 0;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteImagen.add(this.jButtonGuardarCambiosClienteImagen, this.gridBagConstraintsClienteImagen);	
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = 0;		
		this.gridBagConstraintsClienteImagen.gridx =iPosXAccion++;
		
		this.jPanelAccionesClienteImagen.add(this.jButtonCancelarClienteImagen, this.gridBagConstraintsClienteImagen);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteImagen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteImagen);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();						
			this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteImagen.gridx = 0;		
			//this.gridBagConstraintsClienteImagen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteImagen.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteImagen.gridx =0;
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteImagen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteImagen, this.gridBagConstraintsClienteImagen);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleClienteImagen = new ClienteImagenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cliente Imagen DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Cliente Imagen DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cliente Imagen Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ClienteImagenModel clienteimagenModel=new ClienteImagenModel(this);
			
			//SI USARA CLASE INTERNA
			//ClienteImagenModel.ClienteImagenFocusTraversalPolicy clienteimagenFocusTraversalPolicy = clienteimagenModel.new ClienteImagenFocusTraversalPolicy(this);
			
			//clienteimagenFocusTraversalPolicy.setclienteimagenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(clienteimagenModel);
			
			
			this.jContentPaneDetalleClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleClienteImagen = new GridBagLayout();	
			this.jContentPaneDetalleClienteImagen.setLayout(gridaBagLayoutDetalleClienteImagen);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteImagen = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsClienteImagen = new GridBagConstraints();
				this.gridBagConstraintsClienteImagen.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsClienteImagen.gridx = 0;
					
				
				this.jContentPaneDetalleClienteImagen.add(jTtoolBarDetalleClienteImagen, gridBagConstraintsClienteImagen);								
				
}
			
			this.jScrollPanelDatosEdicionClienteImagen=   new JScrollPane(jContentPaneDetalleClienteImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralClienteImagen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			
			
	        this.gridBagConstraintsClienteImagen.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsClienteImagen.gridx = 0;
	        
			this.jContentPaneDetalleClienteImagen.add(jPanelCamposClienteImagen, gridBagConstraintsClienteImagen);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& clienteimagenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsClienteImagen= new GridBagConstraints();
						this.gridBagConstraintsClienteImagen.gridy = iGridyRelaciones++;
						this.gridBagConstraintsClienteImagen.gridx = 0;
						this.jContentPaneDetalleClienteImagen.add(this.jTabbedPaneRelacionesClienteImagen, this.gridBagConstraintsClienteImagen);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesClienteImagen.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosClienteImagen.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsClienteImagen = new GridBagConstraints();
					this.gridBagConstraintsClienteImagen.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsClienteImagen.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsClienteImagen.gridx = 0;
					
				
					this.jContentPaneDetalleClienteImagen.add(jPanelCamposOcultosClienteImagen, gridBagConstraintsClienteImagen);
				
					this.jPanelCamposOcultosClienteImagen.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsClienteImagen.gridx = 0;
	        this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleClienteImagen.add(this.jPanelAccionesFormularioClienteImagen, this.gridBagConstraintsClienteImagen);							
			
			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
	        this.gridBagConstraintsClienteImagen.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsClienteImagen.gridx = 0;
	        
			
			this.jContentPaneDetalleClienteImagen.add(this.jPanelAccionesClienteImagen, this.gridBagConstraintsClienteImagen);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionClienteImagen);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionClienteImagen=   new JScrollPane(this.jPanelCamposClienteImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsClienteImagen.gridx = 0;
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsClienteImagen.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionClienteImagen, this.gridBagConstraintsClienteImagen);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteImagen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioClienteImagen, this.gridBagConstraintsClienteImagen);			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteImagen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesClienteImagen, this.gridBagConstraintsClienteImagen);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteImagen, this.gridBagConstraintsClienteImagen);
			
			
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteImagen, this.gridBagConstraintsClienteImagen);
		
			
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteImagen, this.gridBagConstraintsClienteImagen);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralClienteImagen;//jContentPane;
		
		return jScrollPanelDatosEdicionClienteImagen;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
