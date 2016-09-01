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
import com.bydan.erp.cartera.util.ClienteArchivoConstantesFunciones;

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
public class ClienteArchivoDetalleFormJInternalFrame extends ClienteArchivoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleClienteArchivo;
	
	protected JMenuBar jmenuBarDetalleClienteArchivo;
	
	protected JMenu jmenuDetalleClienteArchivo;
	protected JMenu jmenuDetalleArchivoClienteArchivo;
	protected JMenu jmenuDetalleAccionesClienteArchivo;
	protected JMenu jmenuDetalleDatosClienteArchivo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteArchivo;	
	protected GridBagConstraints gridBagConstraintsClienteArchivo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ClienteArchivoBeanSwingJInternalFrameAdditional jInternalFrameDetalleClienteArchivo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoArchivoBeanSwingJInternalFrame tipoarchivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoarchivo="";
	
	public ClienteArchivoSessionBean clientearchivoSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoArchivoSessionBean tipoarchivoSessionBean;	
	
	public ClienteArchivoLogic clientearchivoLogic;
	
	public JScrollPane jScrollPanelDatosClienteArchivo;
	public JScrollPane jScrollPanelDatosEdicionClienteArchivo;
	public JScrollPane jScrollPanelDatosGeneralClienteArchivo;
	
	protected JPanel jPanelCamposClienteArchivo;    
	protected JPanel jPanelCamposOcultosClienteArchivo;    	
	protected JPanel jPanelAccionesClienteArchivo;
	protected JPanel jPanelAccionesFormularioClienteArchivo;
    
	
	
	protected Integer iXPanelCamposClienteArchivo=0;
	protected Integer iYPanelCamposClienteArchivo=0;
	
	protected Integer iXPanelCamposOcultosClienteArchivo=0;
	protected Integer iYPanelCamposOcultosClienteArchivo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoClienteArchivo;
	public JButton jButtonModificarClienteArchivo;
	public JButton jButtonActualizarClienteArchivo;
    public JButton jButtonEliminarClienteArchivo;
	public JButton jButtonCancelarClienteArchivo;
    public JButton jButtonGuardarCambiosClienteArchivo;
	public JButton jButtonGuardarCambiosTablaClienteArchivo;
	protected JButton jButtonCerrarClienteArchivo;
	
	
	protected JButton jButtonProcesarInformacionClienteArchivo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoClienteArchivo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarClienteArchivo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeClienteArchivo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteArchivo;
	protected JButton jButtonModificarToolBarClienteArchivo;
	protected JButton jButtonActualizarToolBarClienteArchivo;
    protected JButton jButtonEliminarToolBarClienteArchivo;
	protected JButton jButtonCancelarToolBarClienteArchivo;
    protected JButton jButtonGuardarCambiosToolBarClienteArchivo;
	protected JButton jButtonGuardarCambiosTablaToolBarClienteArchivo;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteArchivo;
	protected JButton jButtonCerrarToolBarClienteArchivo;
	
	protected JButton jButtonProcesarInformacionToolBarClienteArchivo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteArchivo;
	protected JMenuItem jMenuItemModificarClienteArchivo;
	protected JMenuItem jMenuItemActualizarClienteArchivo;
    protected JMenuItem jMenuItemEliminarClienteArchivo;
	protected JMenuItem jMenuItemCancelarClienteArchivo;
    protected JMenuItem jMenuItemGuardarCambiosClienteArchivo;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteArchivo;
	protected JMenuItem jMenuItemCerrarClienteArchivo;
	protected JMenuItem jMenuItemDetalleCerrarClienteArchivo;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteArchivo;
	
	protected JMenuItem jMenuItemProcesarInformacionClienteArchivo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteArchivo;
	protected JMenuItem jMenuItemMostrarOcultarClienteArchivo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteArchivo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteArchivo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioClienteArchivo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidClienteArchivo;
	public JLabel jLabelIdClienteArchivo;
	public JLabel jLabelidClienteArchivo;
	public JButton jButtonidClienteArchivoBusqueda= new JButtonMe();

	public JPanel jPanelnombreClienteArchivo;
	public JLabel jLabelnombreClienteArchivo;
	public JTextField jTextFieldnombreClienteArchivo;
	public JButton jButtonnombreClienteArchivoBusqueda= new JButtonMe();

	public JPanel jPanelarchivoClienteArchivo;
	public JLabel jLabelarchivoClienteArchivo;
	public JFileChooser jFileChooserarchivoClienteArchivo = new JFileChooser();
	public JButton jButtonarchivoClienteArchivo= new JButtonMe("...");
	public JLabel jLabelImagenarchivoClienteArchivo= new JLabelMe("Archivo");
	public JButton jButtonDescargararchivoClienteArchivo= new JButtonMe("Descargar");
	public JButton jButtonarchivoClienteArchivoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionClienteArchivo;
	public JLabel jLabeldescripcionClienteArchivo;
	public JTextArea jTextAreadescripcionClienteArchivo;
	public JScrollPane jscrollPanedescripcionClienteArchivo;
	public JButton jButtondescripcionClienteArchivoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteClienteArchivo;
	public JLabel jLabelid_clienteClienteArchivo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteClienteArchivo;
	public JButton jButtonid_clienteClienteArchivo= new JButtonMe();
	public JButton jButtonid_clienteClienteArchivoUpdate= new JButtonMe();
	public JButton jButtonid_clienteClienteArchivoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_archivoClienteArchivo;
	public JLabel jLabelid_tipo_archivoClienteArchivo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_archivoClienteArchivo;
	public JButton jButtonid_tipo_archivoClienteArchivo= new JButtonMe();
	public JButton jButtonid_tipo_archivoClienteArchivoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_archivoClienteArchivoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesClienteArchivo;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ClienteArchivoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposClienteArchivo=new JPanel();
				this.jPanelAccionesFormularioClienteArchivo=new JPanel();
				this.jmenuBarDetalleClienteArchivo=new JMenuBar();
				this.jTtoolBarDetalleClienteArchivo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteArchivoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ClienteArchivoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteArchivoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteArchivoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteArchivoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarClienteArchivo() {
		return this.jButtonActualizarToolBarClienteArchivo;
	}
	
	public JButton getjButtonEliminarToolBarClienteArchivo() {
		return this.jButtonEliminarToolBarClienteArchivo;
	}
	
	public JButton getjButtonCancelarToolBarClienteArchivo() {
		return this.jButtonCancelarToolBarClienteArchivo;
	}		
	
	public JButton getjButtonProcesarInformacionClienteArchivo() {
		return this.jButtonProcesarInformacionClienteArchivo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteArchivo)	{
		this.jButtonProcesarInformacionClienteArchivo = jButtonProcesarInformacionClienteArchivo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteArchivo() {
		return this.jComboBoxTiposAccionesClienteArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteArchivo(
			JComboBox jComboBoxTiposRelacionesClienteArchivo) {
		this.jComboBoxTiposRelacionesClienteArchivo = jComboBoxTiposRelacionesClienteArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteArchivo(
			JComboBox jComboBoxTiposAccionesClienteArchivo) {
		this.jComboBoxTiposAccionesClienteArchivo = jComboBoxTiposAccionesClienteArchivo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioClienteArchivo() {
		return this.jComboBoxTiposAccionesFormularioClienteArchivo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioClienteArchivo(
			JComboBox jComboBoxTiposAccionesFormularioClienteArchivo) {
		this.jComboBoxTiposAccionesFormularioClienteArchivo = jComboBoxTiposAccionesFormularioClienteArchivo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
		
		this.clientearchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clientearchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clientearchivoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteArchivoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cliente Archivo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
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
	
		ClienteArchivoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleClienteArchivo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarClienteArchivo=new JButtonMe();
				this.jButtonModificarToolBarClienteArchivo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarClienteArchivo,this.jTtoolBarDetalleClienteArchivo,
							"actualizar","actualizar","Actualizar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarClienteArchivo,this.jTtoolBarDetalleClienteArchivo,
							"eliminar","eliminar","Eliminar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarClienteArchivo,this.jTtoolBarDetalleClienteArchivo,
							"cancelar","cancelar","Cancelar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarClienteArchivo,this.jTtoolBarDetalleClienteArchivo,
							"guardarcambios","guardarcambios","Guardar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleClienteArchivo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleClienteArchivo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoClienteArchivo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesClienteArchivo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosClienteArchivo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteArchivo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteArchivo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteArchivo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarClienteArchivo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarClienteArchivo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarClienteArchivo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarClienteArchivo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarClienteArchivo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarClienteArchivo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarClienteArchivo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarClienteArchivo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarClienteArchivo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarClienteArchivo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarClienteArchivo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarClienteArchivo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosClienteArchivo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteArchivo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteArchivo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteArchivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteArchivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteArchivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarClienteArchivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarClienteArchivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarClienteArchivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteArchivo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteArchivo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoClienteArchivo.add(this.jMenuItemDetalleCerrarClienteArchivo);
		
		this.jmenuDetalleAccionesClienteArchivo.add(this.jMenuItemActualizarClienteArchivo);
		this.jmenuDetalleAccionesClienteArchivo.add(this.jMenuItemEliminarClienteArchivo);
		this.jmenuDetalleAccionesClienteArchivo.add(this.jMenuItemCancelarClienteArchivo);		
		
		//this.jmenuDetalleDatosClienteArchivo.add(this.jMenuItemDetalleAbrirOrderByClienteArchivo);				
		this.jmenuDetalleDatosClienteArchivo.add(this.jMenuItemDetalleMostarOcultarClienteArchivo);				
				
		//this.jmenuDetalleAccionesClienteArchivo.add(this.jMenuItemGuardarCambiosClienteArchivo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleClienteArchivo.add(this.jmenuDetalleArchivoClienteArchivo);		
		this.jmenuBarDetalleClienteArchivo.add(this.jmenuDetalleAccionesClienteArchivo);		
		this.jmenuBarDetalleClienteArchivo.add(this.jmenuDetalleDatosClienteArchivo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleClienteArchivo);				
	}
	
	
	public void inicializarElementosCamposClienteArchivo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdClienteArchivo = new JLabelMe();
		jLabelIdClienteArchivo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidClienteArchivo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidClienteArchivo.setToolTipText(ClienteArchivoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutClienteArchivo= new GridBagLayout();

		this.jPanelidClienteArchivo.setLayout(this.gridaBagLayoutClienteArchivo);

		jLabelidClienteArchivo = new JLabel();
		jLabelidClienteArchivo.setText("Id");

		jLabelidClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreClienteArchivo = new JLabelMe();
		this.jLabelnombreClienteArchivo.setText(""+ClienteArchivoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreClienteArchivo.setToolTipText("Nombre");
		this.jLabelnombreClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreClienteArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreClienteArchivo.setToolTipText(ClienteArchivoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutClienteArchivo = new GridBagLayout();
		this.jPanelnombreClienteArchivo.setLayout(this.gridaBagLayoutClienteArchivo);


		jTextFieldnombreClienteArchivo= new JTextFieldMe();

		jTextFieldnombreClienteArchivo.setEnabled(false);
		jTextFieldnombreClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreClienteArchivoBusqueda= new JButtonMe();
		this.jButtonnombreClienteArchivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClienteArchivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClienteArchivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreClienteArchivoBusqueda.setText("U");
		this.jButtonnombreClienteArchivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreClienteArchivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreClienteArchivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreClienteArchivoBusqueda"));

		if(this.clientearchivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreClienteArchivoBusqueda.setVisible(false);		}


					
		this.jLabelarchivoClienteArchivo = new JLabelMe();
		this.jLabelarchivoClienteArchivo.setText(""+ClienteArchivoConstantesFunciones.LABEL_ARCHIVO+" : *");
		this.jLabelarchivoClienteArchivo.setToolTipText("Archivo");
		this.jLabelarchivoClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarchivoClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarchivoClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelarchivoClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarchivoClienteArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarchivoClienteArchivo.setToolTipText(ClienteArchivoConstantesFunciones.LABEL_ARCHIVO);
		this.gridaBagLayoutClienteArchivo = new GridBagLayout();
		this.jPanelarchivoClienteArchivo.setLayout(this.gridaBagLayoutClienteArchivo);

		this.jButtonarchivoClienteArchivoBusqueda= new JButtonMe();
		this.jButtonarchivoClienteArchivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarchivoClienteArchivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarchivoClienteArchivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarchivoClienteArchivoBusqueda.setText("U");
		this.jButtonarchivoClienteArchivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarchivoClienteArchivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarchivoClienteArchivoBusqueda,"buscardatos","BUSCAR DATOS");

		if(this.clientearchivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarchivoClienteArchivoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionClienteArchivo = new JLabelMe();
		this.jLabeldescripcionClienteArchivo.setText(""+ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionClienteArchivo.setToolTipText("Descripcion");
		this.jLabeldescripcionClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionClienteArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionClienteArchivo.setToolTipText(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutClienteArchivo = new GridBagLayout();
		this.jPaneldescripcionClienteArchivo.setLayout(this.gridaBagLayoutClienteArchivo);


		jTextAreadescripcionClienteArchivo= new JTextAreaMe();
		jTextAreadescripcionClienteArchivo.setEnabled(false);
		jTextAreadescripcionClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteArchivo.setLineWrap(true);
		jTextAreadescripcionClienteArchivo.setWrapStyleWord(true);
		jTextAreadescripcionClienteArchivo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionClienteArchivo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionClienteArchivo = new JScrollPane(jTextAreadescripcionClienteArchivo);
		jscrollPanedescripcionClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionClienteArchivoBusqueda= new JButtonMe();
		this.jButtondescripcionClienteArchivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionClienteArchivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionClienteArchivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionClienteArchivoBusqueda.setText("U");
		this.jButtondescripcionClienteArchivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionClienteArchivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionClienteArchivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionClienteArchivoBusqueda"));

		if(this.clientearchivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionClienteArchivoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysClienteArchivo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_clienteClienteArchivo = new JLabelMe();
		this.jLabelid_clienteClienteArchivo.setText(""+ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteClienteArchivo.setToolTipText("Cliente");
		this.jLabelid_clienteClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteClienteArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteClienteArchivo.setToolTipText(ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutClienteArchivo = new GridBagLayout();
		this.jPanelid_clienteClienteArchivo.setLayout(this.gridaBagLayoutClienteArchivo);


		jComboBoxid_clienteClienteArchivo= new JComboBoxMe();
		jComboBoxid_clienteClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteClienteArchivo= new JButtonMe();
		this.jButtonid_clienteClienteArchivo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteArchivo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteArchivo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteArchivo.setText("Buscar");
		this.jButtonid_clienteClienteArchivo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteClienteArchivo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteArchivo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteArchivo"));

		this.jButtonid_clienteClienteArchivoBusqueda= new JButtonMe();
		this.jButtonid_clienteClienteArchivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteArchivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteArchivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteArchivoBusqueda.setText("U");
		this.jButtonid_clienteClienteArchivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteClienteArchivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteArchivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteArchivoBusqueda"));

		if(this.clientearchivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteClienteArchivoBusqueda.setVisible(false);		}

		this.jButtonid_clienteClienteArchivoUpdate= new JButtonMe();
		this.jButtonid_clienteClienteArchivoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteArchivoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteArchivoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteArchivoUpdate.setText("U");
		this.jButtonid_clienteClienteArchivoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteClienteArchivoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteArchivoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteArchivoUpdate"));



					
		this.jLabelid_tipo_archivoClienteArchivo = new JLabelMe();
		this.jLabelid_tipo_archivoClienteArchivo.setText(""+ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO+" : *");
		this.jLabelid_tipo_archivoClienteArchivo.setToolTipText("Tipo Archivo");
		this.jLabelid_tipo_archivoClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_archivoClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_archivoClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_archivoClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_archivoClienteArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_archivoClienteArchivo.setToolTipText(ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO);
		this.gridaBagLayoutClienteArchivo = new GridBagLayout();
		this.jPanelid_tipo_archivoClienteArchivo.setLayout(this.gridaBagLayoutClienteArchivo);


		jComboBoxid_tipo_archivoClienteArchivo= new JComboBoxMe();
		jComboBoxid_tipo_archivoClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_archivoClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_archivoClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_archivoClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_archivoClienteArchivo= new JButtonMe();
		this.jButtonid_tipo_archivoClienteArchivo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_archivoClienteArchivo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_archivoClienteArchivo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_archivoClienteArchivo.setText("Buscar");
		this.jButtonid_tipo_archivoClienteArchivo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_archivoClienteArchivo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_archivoClienteArchivo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_archivoClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_archivoClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_archivoClienteArchivo"));

		this.jButtonid_tipo_archivoClienteArchivoBusqueda= new JButtonMe();
		this.jButtonid_tipo_archivoClienteArchivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_archivoClienteArchivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_archivoClienteArchivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_archivoClienteArchivoBusqueda.setText("U");
		this.jButtonid_tipo_archivoClienteArchivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_archivoClienteArchivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_archivoClienteArchivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_archivoClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_archivoClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_archivoClienteArchivoBusqueda"));

		if(this.clientearchivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_archivoClienteArchivoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_archivoClienteArchivoUpdate= new JButtonMe();
		this.jButtonid_tipo_archivoClienteArchivoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_archivoClienteArchivoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_archivoClienteArchivoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_archivoClienteArchivoUpdate.setText("U");
		this.jButtonid_tipo_archivoClienteArchivoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_archivoClienteArchivoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_archivoClienteArchivoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_archivoClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_archivoClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_archivoClienteArchivoUpdate"));



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
		//this.jInternalFrameDetalleClienteArchivo = new ClienteArchivoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cliente Archivo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteArchivo= new GridBagLayout();
		

		
		String sToolTipClienteArchivo="";
		sToolTipClienteArchivo=ClienteArchivoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteArchivo+="(Cartera.ClienteArchivo)";
		}
		
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteArchivo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoClienteArchivo = new JButtonMe();
		this.jButtonModificarClienteArchivo = new JButtonMe();
        this.jButtonActualizarClienteArchivo = new JButtonMe();
        this.jButtonEliminarClienteArchivo = new JButtonMe();
        this.jButtonCancelarClienteArchivo = new JButtonMe();
        this.jButtonGuardarCambiosClienteArchivo = new JButtonMe();
		this.jButtonGuardarCambiosTablaClienteArchivo = new JButtonMe();
		this.jButtonCerrarClienteArchivo = new JButtonMe();
		
		this.jScrollPanelDatosClienteArchivo = new JScrollPane();   
        this.jScrollPanelDatosEdicionClienteArchivo = new JScrollPane();
		this.jScrollPanelDatosGeneralClienteArchivo = new JScrollPane();
				
		
		
		this.jPanelCamposClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cliente Archivo";
		
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Archivos" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteArchivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposClienteArchivo.setName("jPanelCamposClienteArchivo"); 

		this.jPanelCamposOcultosClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosClienteArchivo.setName("jPanelCamposOcultosClienteArchivo"); 

        this.jPanelAccionesClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteArchivo.setToolTipText("Acciones");
        this.jPanelAccionesClienteArchivo.setName("Acciones"); 

		this.jPanelAccionesFormularioClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioClienteArchivo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioClienteArchivo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoClienteArchivo.setText("Nuevo");
		this.jButtonModificarClienteArchivo.setText("Editar");
        this.jButtonActualizarClienteArchivo.setText("Actualizar");
        this.jButtonEliminarClienteArchivo.setText("Eliminar");
        this.jButtonCancelarClienteArchivo.setText("Cancelar");
        this.jButtonGuardarCambiosClienteArchivo.setText("Guardar");
		this.jButtonGuardarCambiosTablaClienteArchivo.setText("Guardar");
		this.jButtonCerrarClienteArchivo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteArchivo,"nuevo_button","Nuevo",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarClienteArchivo,"modificar_button","Editar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarClienteArchivo,"actualizar_button","Actualizar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarClienteArchivo,"eliminar_button","Eliminar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarClienteArchivo,"cancelar_button","Cancelar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosClienteArchivo,"guardarcambios_button","Guardar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteArchivo,"guardarcambiostabla_button","Guardar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteArchivo,"cerrar_button","Salir",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoClienteArchivo.setToolTipText("Nuevo"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarClienteArchivo.setToolTipText("Editar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarClienteArchivo.setToolTipText("Actualizar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarClienteArchivo.setToolTipText("Eliminar)"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarClienteArchivo.setToolTipText("Cancelar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosClienteArchivo.setToolTipText("Guardar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaClienteArchivo.setToolTipText("Guardar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteArchivo.setToolTipText("Salir"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClienteArchivo";
		inputMap = this.jButtonNuevoClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteArchivo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarClienteArchivo";
		inputMap = this.jButtonActualizarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarClienteArchivo"));
		
		//ELIMINAR
		sMapKey = "EliminarClienteArchivo";
		inputMap = this.jButtonEliminarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarClienteArchivo"));
		
		//CANCELAR	
		sMapKey = "CancelarClienteArchivo";
		inputMap = this.jButtonCancelarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarClienteArchivo"));
		
		//CERRAR		
		sMapKey = "CerrarClienteArchivo";
		inputMap = this.jButtonCerrarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteArchivo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteArchivo";
		inputMap = this.jButtonGuardarCambiosTablaClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteArchivo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoClienteArchivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoClienteArchivo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoClienteArchivo.setToolTipText("Nuevo ClienteArchivo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarClienteArchivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarClienteArchivo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarClienteArchivo.setToolTipText("Sin Cerrar Ventana ClienteArchivo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeClienteArchivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeClienteArchivo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeClienteArchivo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteArchivo.setText("Accion");
		this.jComboBoxTiposAccionesClienteArchivo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioClienteArchivo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioClienteArchivo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesClienteArchivo = new JLabelMe();
		
		this.jLabelAccionesClienteArchivo.setText("Acciones");		
		this.jLabelAccionesClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposClienteArchivo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysClienteArchivo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesClienteArchivo=new JTabbedPane();
		this.jTabbedPaneRelacionesClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesClienteArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesClienteArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioClienteArchivo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteArchivo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteArchivo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposClienteArchivo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosClienteArchivo = new GridBagLayout();
		
		this.jPanelCamposClienteArchivo.setLayout(gridaBagLayoutCamposClienteArchivo);
		this.jPanelCamposOcultosClienteArchivo.setLayout(gridaBagLayoutCamposOcultosClienteArchivo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 0;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidClienteArchivo.add(jLabelIdClienteArchivo, this.gridBagConstraintsClienteArchivo);



	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 1;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidClienteArchivo.add(jLabelidClienteArchivo, this.gridBagConstraintsClienteArchivo);


	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 0;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteClienteArchivo.add(jLabelid_clienteClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 2;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteClienteArchivo.add(jButtonid_clienteClienteArchivo, this.gridBagConstraintsClienteArchivo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 3;
		this.gridBagConstraintsClienteArchivo.ipadx = 0;
		this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteArchivo.add(jButtonid_clienteClienteArchivoBusqueda, this.gridBagConstraintsClienteArchivo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 4;
		this.gridBagConstraintsClienteArchivo.ipadx = 0;
		this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteArchivo.add(jButtonid_clienteClienteArchivoUpdate, this.gridBagConstraintsClienteArchivo);
	}

	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 1;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteClienteArchivo.add(jComboBoxid_clienteClienteArchivo, this.gridBagConstraintsClienteArchivo);


	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 0;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_archivoClienteArchivo.add(jLabelid_tipo_archivoClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 2;
		this.gridBagConstraintsClienteArchivo.ipadx = 0;
		this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_archivoClienteArchivo.add(jButtonid_tipo_archivoClienteArchivoBusqueda, this.gridBagConstraintsClienteArchivo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 3;
		this.gridBagConstraintsClienteArchivo.ipadx = 0;
		this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_archivoClienteArchivo.add(jButtonid_tipo_archivoClienteArchivoUpdate, this.gridBagConstraintsClienteArchivo);
	}

	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 1;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_archivoClienteArchivo.add(jComboBoxid_tipo_archivoClienteArchivo, this.gridBagConstraintsClienteArchivo);


	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 0;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreClienteArchivo.add(jLabelnombreClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 2;
		this.gridBagConstraintsClienteArchivo.ipadx = 0;
		this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreClienteArchivo.add(jButtonnombreClienteArchivoBusqueda, this.gridBagConstraintsClienteArchivo);
	}

	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 1;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreClienteArchivo.add(jTextFieldnombreClienteArchivo, this.gridBagConstraintsClienteArchivo);


	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 0;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarchivoClienteArchivo.add(jLabelarchivoClienteArchivo, this.gridBagConstraintsClienteArchivo);



	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 2;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
	this.jPanelarchivoClienteArchivo.add(jButtonDescargararchivoClienteArchivo, this.gridBagConstraintsClienteArchivo);

	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 3;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
	this.jPanelarchivoClienteArchivo.add(jLabelImagenarchivoClienteArchivo, this.gridBagConstraintsClienteArchivo);

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 2;
		this.gridBagConstraintsClienteArchivo.ipadx = 0;
		this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelarchivoClienteArchivo.add(jButtonarchivoClienteArchivoBusqueda, this.gridBagConstraintsClienteArchivo);
	}

	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 1;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarchivoClienteArchivo.add(jButtonarchivoClienteArchivo, this.gridBagConstraintsClienteArchivo);


	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 0;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionClienteArchivo.add(jLabeldescripcionClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 2;
		this.gridBagConstraintsClienteArchivo.ipadx = 0;
		this.gridBagConstraintsClienteArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionClienteArchivo.add(jButtondescripcionClienteArchivoBusqueda, this.gridBagConstraintsClienteArchivo);
	}

	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteArchivo.gridy = 0;
	this.gridBagConstraintsClienteArchivo.gridx = 1;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionClienteArchivo.add(jscrollPanedescripcionClienteArchivo, this.gridBagConstraintsClienteArchivo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteArchivo.gridy = iYPanelCamposClienteArchivo;
	this.gridBagConstraintsClienteArchivo.gridx = iXPanelCamposClienteArchivo++;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteArchivo.add(this.jPanelidClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(iXPanelCamposClienteArchivo % 1==0) {
		iXPanelCamposClienteArchivo=0;
		iYPanelCamposClienteArchivo++;
	}
	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteArchivo.gridy = iYPanelCamposClienteArchivo;
	this.gridBagConstraintsClienteArchivo.gridx = iXPanelCamposClienteArchivo++;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteArchivo.add(this.jPanelid_clienteClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(iXPanelCamposClienteArchivo % 1==0) {
		iXPanelCamposClienteArchivo=0;
		iYPanelCamposClienteArchivo++;
	}
	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteArchivo.gridy = iYPanelCamposClienteArchivo;
	this.gridBagConstraintsClienteArchivo.gridx = iXPanelCamposClienteArchivo++;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteArchivo.add(this.jPanelid_tipo_archivoClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(iXPanelCamposClienteArchivo % 1==0) {
		iXPanelCamposClienteArchivo=0;
		iYPanelCamposClienteArchivo++;
	}
	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteArchivo.gridy = iYPanelCamposClienteArchivo;
	this.gridBagConstraintsClienteArchivo.gridx = iXPanelCamposClienteArchivo++;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteArchivo.add(this.jPanelnombreClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(iXPanelCamposClienteArchivo % 1==0) {
		iXPanelCamposClienteArchivo=0;
		iYPanelCamposClienteArchivo++;
	}
	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteArchivo.gridy = iYPanelCamposClienteArchivo;
	this.gridBagConstraintsClienteArchivo.gridx = iXPanelCamposClienteArchivo++;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteArchivo.add(this.jPanelarchivoClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(iXPanelCamposClienteArchivo % 1==0) {
		iXPanelCamposClienteArchivo=0;
		iYPanelCamposClienteArchivo++;
	}
	this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteArchivo.gridy = iYPanelCamposClienteArchivo;
	this.gridBagConstraintsClienteArchivo.gridx = iXPanelCamposClienteArchivo++;
	this.gridBagConstraintsClienteArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteArchivo.add(this.jPaneldescripcionClienteArchivo, this.gridBagConstraintsClienteArchivo);



	if(iXPanelCamposClienteArchivo % 1==0) {
		iXPanelCamposClienteArchivo=0;
		iYPanelCamposClienteArchivo++;
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
			
		GridBagLayout gridaBagLayoutAccionesClienteArchivo= new GridBagLayout();
		this.jPanelAccionesClienteArchivo.setLayout(gridaBagLayoutAccionesClienteArchivo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioClienteArchivo= new GridBagLayout();
		this.jPanelAccionesFormularioClienteArchivo.setLayout(gridaBagLayoutAccionesFormularioClienteArchivo);
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteArchivo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteArchivo.add(this.jComboBoxTiposAccionesFormularioClienteArchivo, this.gridBagConstraintsClienteArchivo);

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteArchivo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteArchivo.add(this.jCheckBoxPostAccionNuevoClienteArchivo, this.gridBagConstraintsClienteArchivo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.clientearchivoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteArchivo.add(this.jCheckBoxPostAccionSinCerrarClienteArchivo, this.gridBagConstraintsClienteArchivo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.clientearchivoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteArchivo.add(this.jCheckBoxPostAccionSinMensajeClienteArchivo, this.gridBagConstraintsClienteArchivo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXAccion++;
			
		this.jPanelAccionesClienteArchivo.add(this.jButtonModificarClienteArchivo, this.gridBagConstraintsClienteArchivo);							

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx =iPosXAccion++;
			
		this.jPanelAccionesClienteArchivo.add(this.jButtonEliminarClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
			
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = 0;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteArchivo.add(this.jButtonActualizarClienteArchivo, this.gridBagConstraintsClienteArchivo);


		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = 0;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteArchivo.add(this.jButtonGuardarCambiosClienteArchivo, this.gridBagConstraintsClienteArchivo);	
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = 0;		
		this.gridBagConstraintsClienteArchivo.gridx =iPosXAccion++;
		
		this.jPanelAccionesClienteArchivo.add(this.jButtonCancelarClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteArchivo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteArchivo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();						
			this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteArchivo.gridx = 0;		
			//this.gridBagConstraintsClienteArchivo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteArchivo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteArchivo.gridx =0;
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteArchivo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteArchivo, this.gridBagConstraintsClienteArchivo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleClienteArchivo = new ClienteArchivoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cliente Archivo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cliente Archivo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cliente Archivo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ClienteArchivoModel clientearchivoModel=new ClienteArchivoModel(this);
			
			//SI USARA CLASE INTERNA
			//ClienteArchivoModel.ClienteArchivoFocusTraversalPolicy clientearchivoFocusTraversalPolicy = clientearchivoModel.new ClienteArchivoFocusTraversalPolicy(this);
			
			//clientearchivoFocusTraversalPolicy.setclientearchivoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(clientearchivoModel);
			
			
			this.jContentPaneDetalleClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleClienteArchivo = new GridBagLayout();	
			this.jContentPaneDetalleClienteArchivo.setLayout(gridaBagLayoutDetalleClienteArchivo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteArchivo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
				this.gridBagConstraintsClienteArchivo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsClienteArchivo.gridx = 0;
					
				
				this.jContentPaneDetalleClienteArchivo.add(jTtoolBarDetalleClienteArchivo, gridBagConstraintsClienteArchivo);								
				
}
			
			this.jScrollPanelDatosEdicionClienteArchivo=   new JScrollPane(jContentPaneDetalleClienteArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralClienteArchivo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsClienteArchivo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsClienteArchivo.gridx = 0;
	        
			this.jContentPaneDetalleClienteArchivo.add(jPanelCamposClienteArchivo, gridBagConstraintsClienteArchivo);
			
			
			
			
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
						&& clientearchivoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsClienteArchivo= new GridBagConstraints();
						this.gridBagConstraintsClienteArchivo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsClienteArchivo.gridx = 0;
						this.jContentPaneDetalleClienteArchivo.add(this.jTabbedPaneRelacionesClienteArchivo, this.gridBagConstraintsClienteArchivo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesClienteArchivo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosClienteArchivo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
					this.gridBagConstraintsClienteArchivo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsClienteArchivo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsClienteArchivo.gridx = 0;
					
				
					this.jContentPaneDetalleClienteArchivo.add(jPanelCamposOcultosClienteArchivo, gridBagConstraintsClienteArchivo);
				
					this.jPanelCamposOcultosClienteArchivo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsClienteArchivo.gridx = 0;
	        this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleClienteArchivo.add(this.jPanelAccionesFormularioClienteArchivo, this.gridBagConstraintsClienteArchivo);							
			
			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
	        this.gridBagConstraintsClienteArchivo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsClienteArchivo.gridx = 0;
	        
			
			this.jContentPaneDetalleClienteArchivo.add(this.jPanelAccionesClienteArchivo, this.gridBagConstraintsClienteArchivo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionClienteArchivo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionClienteArchivo=   new JScrollPane(this.jPanelCamposClienteArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsClienteArchivo.gridx = 0;
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsClienteArchivo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionClienteArchivo, this.gridBagConstraintsClienteArchivo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteArchivo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioClienteArchivo, this.gridBagConstraintsClienteArchivo);			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteArchivo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesClienteArchivo, this.gridBagConstraintsClienteArchivo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteArchivo, this.gridBagConstraintsClienteArchivo);
			
			
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
			
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteArchivo, this.gridBagConstraintsClienteArchivo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralClienteArchivo;//jContentPane;
		
		return jScrollPanelDatosEdicionClienteArchivo;
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
