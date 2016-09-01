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
import com.bydan.erp.cartera.util.FirmaClienteConstantesFunciones;

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
public class FirmaClienteDetalleFormJInternalFrame extends FirmaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFirmaCliente;
	
	protected JMenuBar jmenuBarDetalleFirmaCliente;
	
	protected JMenu jmenuDetalleFirmaCliente;
	protected JMenu jmenuDetalleArchivoFirmaCliente;
	protected JMenu jmenuDetalleAccionesFirmaCliente;
	protected JMenu jmenuDetalleDatosFirmaCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFirmaCliente;	
	protected GridBagConstraints gridBagConstraintsFirmaCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FirmaClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleFirmaCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoImagenBeanSwingJInternalFrame tipoimagenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimagen="";
	
	public FirmaClienteSessionBean firmaclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoImagenSessionBean tipoimagenSessionBean;	
	
	public FirmaClienteLogic firmaclienteLogic;
	
	public JScrollPane jScrollPanelDatosFirmaCliente;
	public JScrollPane jScrollPanelDatosEdicionFirmaCliente;
	public JScrollPane jScrollPanelDatosGeneralFirmaCliente;
	
	protected JPanel jPanelCamposFirmaCliente;    
	protected JPanel jPanelCamposOcultosFirmaCliente;    	
	protected JPanel jPanelAccionesFirmaCliente;
	protected JPanel jPanelAccionesFormularioFirmaCliente;
    
	
	
	protected Integer iXPanelCamposFirmaCliente=0;
	protected Integer iYPanelCamposFirmaCliente=0;
	
	protected Integer iXPanelCamposOcultosFirmaCliente=0;
	protected Integer iYPanelCamposOcultosFirmaCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFirmaCliente;
	public JButton jButtonModificarFirmaCliente;
	public JButton jButtonActualizarFirmaCliente;
    public JButton jButtonEliminarFirmaCliente;
	public JButton jButtonCancelarFirmaCliente;
    public JButton jButtonGuardarCambiosFirmaCliente;
	public JButton jButtonGuardarCambiosTablaFirmaCliente;
	protected JButton jButtonCerrarFirmaCliente;
	
	
	protected JButton jButtonProcesarInformacionFirmaCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFirmaCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFirmaCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFirmaCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFirmaCliente;
	protected JButton jButtonModificarToolBarFirmaCliente;
	protected JButton jButtonActualizarToolBarFirmaCliente;
    protected JButton jButtonEliminarToolBarFirmaCliente;
	protected JButton jButtonCancelarToolBarFirmaCliente;
    protected JButton jButtonGuardarCambiosToolBarFirmaCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarFirmaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarFirmaCliente;
	protected JButton jButtonCerrarToolBarFirmaCliente;
	
	protected JButton jButtonProcesarInformacionToolBarFirmaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFirmaCliente;
	protected JMenuItem jMenuItemModificarFirmaCliente;
	protected JMenuItem jMenuItemActualizarFirmaCliente;
    protected JMenuItem jMenuItemEliminarFirmaCliente;
	protected JMenuItem jMenuItemCancelarFirmaCliente;
    protected JMenuItem jMenuItemGuardarCambiosFirmaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaFirmaCliente;
	protected JMenuItem jMenuItemCerrarFirmaCliente;
	protected JMenuItem jMenuItemDetalleCerrarFirmaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarFirmaCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionFirmaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFirmaCliente;
	protected JMenuItem jMenuItemMostrarOcultarFirmaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFirmaCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFirmaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFirmaCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFirmaCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFirmaCliente;
	public JLabel jLabelIdFirmaCliente;
	public JLabel jLabelidFirmaCliente;
	public JButton jButtonidFirmaClienteBusqueda= new JButtonMe();

	public JPanel jPanelfirmaFirmaCliente;
	public JLabel jLabelfirmaFirmaCliente;
	public JFileChooser jFileChooserfirmaFirmaCliente = new JFileChooser();
	public JButton jButtonfirmaFirmaCliente= new JButtonMe("...");
	public JLabel jLabelImagenfirmaFirmaCliente= new JLabelMe("Imagen");

	public JButton jButtonDescargarfirmaFirmaCliente= new JButtonMe("Descargar");
	public JButton jButtonfirmaFirmaClienteBusqueda= new JButtonMe();

	public JPanel jPanelpath_firmaFirmaCliente;
	public JLabel jLabelpath_firmaFirmaCliente;
	public JTextArea jTextAreapath_firmaFirmaCliente;
	public JScrollPane jscrollPanepath_firmaFirmaCliente;
	public JButton jButtonpath_firmaFirmaClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFirmaCliente;
	public JLabel jLabelid_empresaFirmaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFirmaCliente;
	public JButton jButtonid_empresaFirmaCliente= new JButtonMe();
	public JButton jButtonid_empresaFirmaClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaFirmaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteFirmaCliente;
	public JLabel jLabelid_clienteFirmaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFirmaCliente;
	public JButton jButtonid_clienteFirmaCliente= new JButtonMe();
	public JButton jButtonid_clienteFirmaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFirmaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_imagenFirmaCliente;
	public JLabel jLabelid_tipo_imagenFirmaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_imagenFirmaCliente;
	public JButton jButtonid_tipo_imagenFirmaCliente= new JButtonMe();
	public JButton jButtonid_tipo_imagenFirmaClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_imagenFirmaClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFirmaCliente;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FirmaClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFirmaCliente=new JPanel();
				this.jPanelAccionesFormularioFirmaCliente=new JPanel();
				this.jmenuBarDetalleFirmaCliente=new JMenuBar();
				this.jTtoolBarDetalleFirmaCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FirmaClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FirmaClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FirmaClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FirmaClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FirmaClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFirmaCliente() {
		return this.jButtonActualizarToolBarFirmaCliente;
	}
	
	public JButton getjButtonEliminarToolBarFirmaCliente() {
		return this.jButtonEliminarToolBarFirmaCliente;
	}
	
	public JButton getjButtonCancelarToolBarFirmaCliente() {
		return this.jButtonCancelarToolBarFirmaCliente;
	}		
	
	public JButton getjButtonProcesarInformacionFirmaCliente() {
		return this.jButtonProcesarInformacionFirmaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFirmaCliente)	{
		this.jButtonProcesarInformacionFirmaCliente = jButtonProcesarInformacionFirmaCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFirmaCliente() {
		return this.jComboBoxTiposAccionesFirmaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFirmaCliente(
			JComboBox jComboBoxTiposRelacionesFirmaCliente) {
		this.jComboBoxTiposRelacionesFirmaCliente = jComboBoxTiposRelacionesFirmaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFirmaCliente(
			JComboBox jComboBoxTiposAccionesFirmaCliente) {
		this.jComboBoxTiposAccionesFirmaCliente = jComboBoxTiposAccionesFirmaCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFirmaCliente() {
		return this.jComboBoxTiposAccionesFormularioFirmaCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFirmaCliente(
			JComboBox jComboBoxTiposAccionesFormularioFirmaCliente) {
		this.jComboBoxTiposAccionesFormularioFirmaCliente = jComboBoxTiposAccionesFormularioFirmaCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.firmaclienteSessionBean=new FirmaClienteSessionBean();
		
		this.firmaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.firmaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.firmaclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FirmaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Firma Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		FirmaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFirmaCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFirmaCliente=new JButtonMe();
				this.jButtonModificarToolBarFirmaCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFirmaCliente,this.jTtoolBarDetalleFirmaCliente,
							"actualizar","actualizar","Actualizar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFirmaCliente,this.jTtoolBarDetalleFirmaCliente,
							"eliminar","eliminar","Eliminar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFirmaCliente,this.jTtoolBarDetalleFirmaCliente,
							"cancelar","cancelar","Cancelar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFirmaCliente,this.jTtoolBarDetalleFirmaCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFirmaCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFirmaCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFirmaCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFirmaCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFirmaCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFirmaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFirmaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFirmaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFirmaCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFirmaCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFirmaCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFirmaCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFirmaCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFirmaCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFirmaCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFirmaCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFirmaCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFirmaCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFirmaCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFirmaCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFirmaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFirmaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFirmaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFirmaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFirmaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFirmaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFirmaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFirmaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFirmaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFirmaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFirmaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFirmaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFirmaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFirmaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFirmaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFirmaCliente.add(this.jMenuItemDetalleCerrarFirmaCliente);
		
		this.jmenuDetalleAccionesFirmaCliente.add(this.jMenuItemActualizarFirmaCliente);
		this.jmenuDetalleAccionesFirmaCliente.add(this.jMenuItemEliminarFirmaCliente);
		this.jmenuDetalleAccionesFirmaCliente.add(this.jMenuItemCancelarFirmaCliente);		
		
		//this.jmenuDetalleDatosFirmaCliente.add(this.jMenuItemDetalleAbrirOrderByFirmaCliente);				
		this.jmenuDetalleDatosFirmaCliente.add(this.jMenuItemDetalleMostarOcultarFirmaCliente);				
				
		//this.jmenuDetalleAccionesFirmaCliente.add(this.jMenuItemGuardarCambiosFirmaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFirmaCliente.add(this.jmenuDetalleArchivoFirmaCliente);		
		this.jmenuBarDetalleFirmaCliente.add(this.jmenuDetalleAccionesFirmaCliente);		
		this.jmenuBarDetalleFirmaCliente.add(this.jmenuDetalleDatosFirmaCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFirmaCliente);				
	}
	
	
	public void inicializarElementosCamposFirmaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFirmaCliente = new JLabelMe();
		jLabelIdFirmaCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFirmaCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFirmaCliente.setToolTipText(FirmaClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFirmaCliente= new GridBagLayout();

		this.jPanelidFirmaCliente.setLayout(this.gridaBagLayoutFirmaCliente);

		jLabelidFirmaCliente = new JLabel();
		jLabelidFirmaCliente.setText("Id");

		jLabelidFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfirmaFirmaCliente = new JLabelMe();
		this.jLabelfirmaFirmaCliente.setText(""+FirmaClienteConstantesFunciones.LABEL_FIRMA+" : *");
		this.jLabelfirmaFirmaCliente.setToolTipText("Firma");
		this.jLabelfirmaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfirmaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfirmaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfirmaFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfirmaFirmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfirmaFirmaCliente.setToolTipText(FirmaClienteConstantesFunciones.LABEL_FIRMA);
		this.gridaBagLayoutFirmaCliente = new GridBagLayout();
		this.jPanelfirmaFirmaCliente.setLayout(this.gridaBagLayoutFirmaCliente);

		this.jButtonfirmaFirmaClienteBusqueda= new JButtonMe();
		this.jButtonfirmaFirmaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfirmaFirmaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfirmaFirmaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfirmaFirmaClienteBusqueda.setText("U");
		this.jButtonfirmaFirmaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfirmaFirmaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfirmaFirmaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		if(this.firmaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfirmaFirmaClienteBusqueda.setVisible(false);		}


					
		this.jLabelpath_firmaFirmaCliente = new JLabelMe();
		this.jLabelpath_firmaFirmaCliente.setText(""+FirmaClienteConstantesFunciones.LABEL_PATHFIRMA+" : *");
		this.jLabelpath_firmaFirmaCliente.setToolTipText("Path Firma");
		this.jLabelpath_firmaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_firmaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_firmaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_firmaFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_firmaFirmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_firmaFirmaCliente.setToolTipText(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA);
		this.gridaBagLayoutFirmaCliente = new GridBagLayout();
		this.jPanelpath_firmaFirmaCliente.setLayout(this.gridaBagLayoutFirmaCliente);


		jTextAreapath_firmaFirmaCliente= new JTextAreaMe();
		jTextAreapath_firmaFirmaCliente.setEnabled(false);
		jTextAreapath_firmaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_firmaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_firmaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_firmaFirmaCliente.setLineWrap(true);
		jTextAreapath_firmaFirmaCliente.setWrapStyleWord(true);
		jTextAreapath_firmaFirmaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapath_firmaFirmaCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapath_firmaFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepath_firmaFirmaCliente = new JScrollPane(jTextAreapath_firmaFirmaCliente);
		jscrollPanepath_firmaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_firmaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_firmaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpath_firmaFirmaClienteBusqueda= new JButtonMe();
		this.jButtonpath_firmaFirmaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_firmaFirmaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_firmaFirmaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_firmaFirmaClienteBusqueda.setText("U");
		this.jButtonpath_firmaFirmaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_firmaFirmaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_firmaFirmaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapath_firmaFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapath_firmaFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_firmaFirmaClienteBusqueda"));

		if(this.firmaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_firmaFirmaClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFirmaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFirmaCliente = new JLabelMe();
		this.jLabelid_empresaFirmaCliente.setText(""+FirmaClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFirmaCliente.setToolTipText("Empresa");
		this.jLabelid_empresaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFirmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFirmaCliente.setToolTipText(FirmaClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFirmaCliente = new GridBagLayout();
		this.jPanelid_empresaFirmaCliente.setLayout(this.gridaBagLayoutFirmaCliente);


		jComboBoxid_empresaFirmaCliente= new JComboBoxMe();
		jComboBoxid_empresaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFirmaCliente.setEnabled(false);

		this.jButtonid_empresaFirmaCliente= new JButtonMe();
		this.jButtonid_empresaFirmaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFirmaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFirmaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFirmaCliente.setText("Buscar");
		this.jButtonid_empresaFirmaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFirmaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFirmaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFirmaCliente"));

		this.jButtonid_empresaFirmaClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaFirmaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFirmaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFirmaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFirmaClienteBusqueda.setText("U");
		this.jButtonid_empresaFirmaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFirmaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFirmaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFirmaClienteBusqueda"));

		if(this.firmaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFirmaClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaFirmaClienteUpdate= new JButtonMe();
		this.jButtonid_empresaFirmaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFirmaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFirmaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFirmaClienteUpdate.setText("U");
		this.jButtonid_empresaFirmaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFirmaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFirmaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFirmaClienteUpdate"));



					
		this.jLabelid_clienteFirmaCliente = new JLabelMe();
		this.jLabelid_clienteFirmaCliente.setText(""+FirmaClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFirmaCliente.setToolTipText("Cliente");
		this.jLabelid_clienteFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFirmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFirmaCliente.setToolTipText(FirmaClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFirmaCliente = new GridBagLayout();
		this.jPanelid_clienteFirmaCliente.setLayout(this.gridaBagLayoutFirmaCliente);


		jComboBoxid_clienteFirmaCliente= new JComboBoxMe();
		jComboBoxid_clienteFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFirmaCliente= new JButtonMe();
		this.jButtonid_clienteFirmaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFirmaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFirmaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFirmaCliente.setText("Buscar");
		this.jButtonid_clienteFirmaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFirmaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFirmaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFirmaCliente"));

		this.jButtonid_clienteFirmaClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteFirmaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFirmaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFirmaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFirmaClienteBusqueda.setText("U");
		this.jButtonid_clienteFirmaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFirmaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFirmaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFirmaClienteBusqueda"));

		if(this.firmaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFirmaClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteFirmaClienteUpdate= new JButtonMe();
		this.jButtonid_clienteFirmaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFirmaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFirmaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFirmaClienteUpdate.setText("U");
		this.jButtonid_clienteFirmaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFirmaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFirmaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFirmaClienteUpdate"));



					
		this.jLabelid_tipo_imagenFirmaCliente = new JLabelMe();
		this.jLabelid_tipo_imagenFirmaCliente.setText(""+FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN+" : *");
		this.jLabelid_tipo_imagenFirmaCliente.setToolTipText("Idtipo Imagen");
		this.jLabelid_tipo_imagenFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_imagenFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_imagenFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_imagenFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_imagenFirmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_imagenFirmaCliente.setToolTipText(FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN);
		this.gridaBagLayoutFirmaCliente = new GridBagLayout();
		this.jPanelid_tipo_imagenFirmaCliente.setLayout(this.gridaBagLayoutFirmaCliente);


		jComboBoxid_tipo_imagenFirmaCliente= new JComboBoxMe();
		jComboBoxid_tipo_imagenFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_imagenFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_imagenFirmaCliente= new JButtonMe();
		this.jButtonid_tipo_imagenFirmaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagenFirmaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagenFirmaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_imagenFirmaCliente.setText("Buscar");
		this.jButtonid_tipo_imagenFirmaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_imagenFirmaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagenFirmaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_imagenFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagenFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagenFirmaCliente"));

		this.jButtonid_tipo_imagenFirmaClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_imagenFirmaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenFirmaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenFirmaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_imagenFirmaClienteBusqueda.setText("U");
		this.jButtonid_tipo_imagenFirmaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_imagenFirmaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagenFirmaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_imagenFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagenFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagenFirmaClienteBusqueda"));

		if(this.firmaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_imagenFirmaClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_imagenFirmaClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_imagenFirmaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenFirmaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_imagenFirmaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_imagenFirmaClienteUpdate.setText("U");
		this.jButtonid_tipo_imagenFirmaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_imagenFirmaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_imagenFirmaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_imagenFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_imagenFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_imagenFirmaClienteUpdate"));



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
		//this.jInternalFrameDetalleFirmaCliente = new FirmaClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Firma Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFirmaCliente= new GridBagLayout();
		

		
		String sToolTipFirmaCliente="";
		sToolTipFirmaCliente=FirmaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFirmaCliente+="(Cartera.FirmaCliente)";
		}
		
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipFirmaCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFirmaCliente = new JButtonMe();
		this.jButtonModificarFirmaCliente = new JButtonMe();
        this.jButtonActualizarFirmaCliente = new JButtonMe();
        this.jButtonEliminarFirmaCliente = new JButtonMe();
        this.jButtonCancelarFirmaCliente = new JButtonMe();
        this.jButtonGuardarCambiosFirmaCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaFirmaCliente = new JButtonMe();
		this.jButtonCerrarFirmaCliente = new JButtonMe();
		
		this.jScrollPanelDatosFirmaCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionFirmaCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralFirmaCliente = new JScrollPane();
				
		
		
		this.jPanelCamposFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Firma Cliente";
		
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Firma Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosFirmaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFirmaCliente.setName("jPanelCamposFirmaCliente"); 

		this.jPanelCamposOcultosFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFirmaCliente.setName("jPanelCamposOcultosFirmaCliente"); 

        this.jPanelAccionesFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFirmaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFirmaCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFirmaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFirmaCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFirmaCliente.setText("Nuevo");
		this.jButtonModificarFirmaCliente.setText("Editar");
        this.jButtonActualizarFirmaCliente.setText("Actualizar");
        this.jButtonEliminarFirmaCliente.setText("Eliminar");
        this.jButtonCancelarFirmaCliente.setText("Cancelar");
        this.jButtonGuardarCambiosFirmaCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaFirmaCliente.setText("Guardar");
		this.jButtonCerrarFirmaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFirmaCliente,"nuevo_button","Nuevo",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFirmaCliente,"modificar_button","Editar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFirmaCliente,"actualizar_button","Actualizar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFirmaCliente,"eliminar_button","Eliminar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFirmaCliente,"cancelar_button","Cancelar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFirmaCliente,"guardarcambios_button","Guardar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFirmaCliente,"guardarcambiostabla_button","Guardar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFirmaCliente,"cerrar_button","Salir",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFirmaCliente.setToolTipText("Nuevo"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFirmaCliente.setToolTipText("Editar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFirmaCliente.setToolTipText("Actualizar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFirmaCliente.setToolTipText("Eliminar)"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFirmaCliente.setToolTipText("Cancelar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFirmaCliente.setToolTipText("Guardar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFirmaCliente.setToolTipText("Guardar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFirmaCliente.setToolTipText("Salir"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFirmaCliente";
		inputMap = this.jButtonNuevoFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFirmaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFirmaCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFirmaCliente";
		inputMap = this.jButtonActualizarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFirmaCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarFirmaCliente";
		inputMap = this.jButtonEliminarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFirmaCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarFirmaCliente";
		inputMap = this.jButtonCancelarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFirmaCliente"));
		
		//CERRAR		
		sMapKey = "CerrarFirmaCliente";
		inputMap = this.jButtonCerrarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFirmaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFirmaCliente";
		inputMap = this.jButtonGuardarCambiosTablaFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFirmaCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFirmaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFirmaCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFirmaCliente.setToolTipText("Nuevo FirmaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFirmaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFirmaCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFirmaCliente.setToolTipText("Sin Cerrar Ventana FirmaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFirmaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFirmaCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFirmaCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFirmaCliente.setText("Accion");
		this.jComboBoxTiposAccionesFirmaCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFirmaCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFirmaCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFirmaCliente = new JLabelMe();
		
		this.jLabelAccionesFirmaCliente.setText("Acciones");		
		this.jLabelAccionesFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFirmaCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFirmaCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFirmaCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFirmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFirmaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFirmaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFirmaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFirmaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFirmaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFirmaCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFirmaCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFirmaCliente = new GridBagLayout();
		
		this.jPanelCamposFirmaCliente.setLayout(gridaBagLayoutCamposFirmaCliente);
		this.jPanelCamposOcultosFirmaCliente.setLayout(gridaBagLayoutCamposOcultosFirmaCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 0;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFirmaCliente.add(jLabelIdFirmaCliente, this.gridBagConstraintsFirmaCliente);



	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 1;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFirmaCliente.add(jLabelidFirmaCliente, this.gridBagConstraintsFirmaCliente);


	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 0;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFirmaCliente.add(jLabelid_empresaFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 2;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFirmaCliente.add(jButtonid_empresaFirmaClienteBusqueda, this.gridBagConstraintsFirmaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 3;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFirmaCliente.add(jButtonid_empresaFirmaClienteUpdate, this.gridBagConstraintsFirmaCliente);
	}

	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 1;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFirmaCliente.add(jComboBoxid_empresaFirmaCliente, this.gridBagConstraintsFirmaCliente);


	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 0;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteFirmaCliente.add(jLabelid_clienteFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 2;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteFirmaCliente.add(jButtonid_clienteFirmaCliente, this.gridBagConstraintsFirmaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 3;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFirmaCliente.add(jButtonid_clienteFirmaClienteBusqueda, this.gridBagConstraintsFirmaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 4;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFirmaCliente.add(jButtonid_clienteFirmaClienteUpdate, this.gridBagConstraintsFirmaCliente);
	}

	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 1;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteFirmaCliente.add(jComboBoxid_clienteFirmaCliente, this.gridBagConstraintsFirmaCliente);


	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 0;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_imagenFirmaCliente.add(jLabelid_tipo_imagenFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 2;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_imagenFirmaCliente.add(jButtonid_tipo_imagenFirmaClienteBusqueda, this.gridBagConstraintsFirmaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 3;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_imagenFirmaCliente.add(jButtonid_tipo_imagenFirmaClienteUpdate, this.gridBagConstraintsFirmaCliente);
	}

	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 1;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_imagenFirmaCliente.add(jComboBoxid_tipo_imagenFirmaCliente, this.gridBagConstraintsFirmaCliente);


	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 0;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfirmaFirmaCliente.add(jLabelfirmaFirmaCliente, this.gridBagConstraintsFirmaCliente);



	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 2;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelfirmaFirmaCliente.add(jButtonDescargarfirmaFirmaCliente, this.gridBagConstraintsFirmaCliente);

	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 3;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelfirmaFirmaCliente.add(jLabelImagenfirmaFirmaCliente, this.gridBagConstraintsFirmaCliente);

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 2;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfirmaFirmaCliente.add(jButtonfirmaFirmaClienteBusqueda, this.gridBagConstraintsFirmaCliente);
	}

	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 1;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfirmaFirmaCliente.add(jButtonfirmaFirmaCliente, this.gridBagConstraintsFirmaCliente);


	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 0;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpath_firmaFirmaCliente.add(jLabelpath_firmaFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 2;
		this.gridBagConstraintsFirmaCliente.ipadx = 0;
		this.gridBagConstraintsFirmaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_firmaFirmaCliente.add(jButtonpath_firmaFirmaClienteBusqueda, this.gridBagConstraintsFirmaCliente);
	}

	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFirmaCliente.gridy = 0;
	this.gridBagConstraintsFirmaCliente.gridx = 1;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpath_firmaFirmaCliente.add(jscrollPanepath_firmaFirmaCliente, this.gridBagConstraintsFirmaCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFirmaCliente.gridy = iYPanelCamposFirmaCliente;
	this.gridBagConstraintsFirmaCliente.gridx = iXPanelCamposFirmaCliente++;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFirmaCliente.add(this.jPanelidFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(iXPanelCamposFirmaCliente % 1==0) {
		iXPanelCamposFirmaCliente=0;
		iYPanelCamposFirmaCliente++;
	}
	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFirmaCliente.gridy = iYPanelCamposFirmaCliente;
	this.gridBagConstraintsFirmaCliente.gridx = iXPanelCamposFirmaCliente++;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFirmaCliente.add(this.jPanelid_clienteFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(iXPanelCamposFirmaCliente % 1==0) {
		iXPanelCamposFirmaCliente=0;
		iYPanelCamposFirmaCliente++;
	}
	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFirmaCliente.gridy = iYPanelCamposFirmaCliente;
	this.gridBagConstraintsFirmaCliente.gridx = iXPanelCamposFirmaCliente++;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFirmaCliente.add(this.jPanelid_tipo_imagenFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(iXPanelCamposFirmaCliente % 1==0) {
		iXPanelCamposFirmaCliente=0;
		iYPanelCamposFirmaCliente++;
	}
	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFirmaCliente.gridy = iYPanelCamposFirmaCliente;
	this.gridBagConstraintsFirmaCliente.gridx = iXPanelCamposFirmaCliente++;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFirmaCliente.add(this.jPanelfirmaFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(iXPanelCamposFirmaCliente % 1==0) {
		iXPanelCamposFirmaCliente=0;
		iYPanelCamposFirmaCliente++;
	}
	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFirmaCliente.gridy = iYPanelCamposFirmaCliente;
	this.gridBagConstraintsFirmaCliente.gridx = iXPanelCamposFirmaCliente++;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFirmaCliente.add(this.jPanelpath_firmaFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(iXPanelCamposFirmaCliente % 1==0) {
		iXPanelCamposFirmaCliente=0;
		iYPanelCamposFirmaCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFirmaCliente.gridy = iYPanelCamposOcultosFirmaCliente;
	this.gridBagConstraintsFirmaCliente.gridx = iXPanelCamposOcultosFirmaCliente++;
	this.gridBagConstraintsFirmaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFirmaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFirmaCliente.add(this.jPanelid_empresaFirmaCliente, this.gridBagConstraintsFirmaCliente);



	if(iXPanelCamposOcultosFirmaCliente % 1==0) {
		iXPanelCamposOcultosFirmaCliente=0;
		iYPanelCamposOcultosFirmaCliente++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesFirmaCliente= new GridBagLayout();
		this.jPanelAccionesFirmaCliente.setLayout(gridaBagLayoutAccionesFirmaCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFirmaCliente= new GridBagLayout();
		this.jPanelAccionesFormularioFirmaCliente.setLayout(gridaBagLayoutAccionesFormularioFirmaCliente);
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFirmaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFirmaCliente.add(this.jComboBoxTiposAccionesFormularioFirmaCliente, this.gridBagConstraintsFirmaCliente);

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFirmaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFirmaCliente.add(this.jCheckBoxPostAccionNuevoFirmaCliente, this.gridBagConstraintsFirmaCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.firmaclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFirmaCliente.add(this.jCheckBoxPostAccionSinCerrarFirmaCliente, this.gridBagConstraintsFirmaCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.firmaclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFirmaCliente.add(this.jCheckBoxPostAccionSinMensajeFirmaCliente, this.gridBagConstraintsFirmaCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesFirmaCliente.add(this.jButtonModificarFirmaCliente, this.gridBagConstraintsFirmaCliente);							

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesFirmaCliente.add(this.jButtonEliminarFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
			
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = 0;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesFirmaCliente.add(this.jButtonActualizarFirmaCliente, this.gridBagConstraintsFirmaCliente);


		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = 0;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesFirmaCliente.add(this.jButtonGuardarCambiosFirmaCliente, this.gridBagConstraintsFirmaCliente);	
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = 0;		
		this.gridBagConstraintsFirmaCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesFirmaCliente.add(this.jButtonCancelarFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFirmaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFirmaCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();						
			this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFirmaCliente.gridx = 0;		
			//this.gridBagConstraintsFirmaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFirmaCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFirmaCliente.gridx =0;
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFirmaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFirmaCliente, this.gridBagConstraintsFirmaCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFirmaCliente = new FirmaClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Firma Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Firma Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Firma Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FirmaClienteModel firmaclienteModel=new FirmaClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//FirmaClienteModel.FirmaClienteFocusTraversalPolicy firmaclienteFocusTraversalPolicy = firmaclienteModel.new FirmaClienteFocusTraversalPolicy(this);
			
			//firmaclienteFocusTraversalPolicy.setfirmaclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(firmaclienteModel);
			
			
			this.jContentPaneDetalleFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFirmaCliente = new GridBagLayout();	
			this.jContentPaneDetalleFirmaCliente.setLayout(gridaBagLayoutDetalleFirmaCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFirmaCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
				this.gridBagConstraintsFirmaCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFirmaCliente.gridx = 0;
					
				
				this.jContentPaneDetalleFirmaCliente.add(jTtoolBarDetalleFirmaCliente, gridBagConstraintsFirmaCliente);								
				
}
			
			this.jScrollPanelDatosEdicionFirmaCliente=   new JScrollPane(jContentPaneDetalleFirmaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFirmaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFirmaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFirmaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFirmaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFirmaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFirmaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFirmaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFirmaCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFirmaCliente.gridx = 0;
	        
			this.jContentPaneDetalleFirmaCliente.add(jPanelCamposFirmaCliente, gridBagConstraintsFirmaCliente);
			
			
			
			
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
						&& firmaclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFirmaCliente= new GridBagConstraints();
						this.gridBagConstraintsFirmaCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFirmaCliente.gridx = 0;
						this.jContentPaneDetalleFirmaCliente.add(this.jTabbedPaneRelacionesFirmaCliente, this.gridBagConstraintsFirmaCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFirmaCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFirmaCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
					this.gridBagConstraintsFirmaCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFirmaCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFirmaCliente.gridx = 0;
					
				
					this.jContentPaneDetalleFirmaCliente.add(jPanelCamposOcultosFirmaCliente, gridBagConstraintsFirmaCliente);
				
					this.jPanelCamposOcultosFirmaCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFirmaCliente.gridx = 0;
	        this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFirmaCliente.add(this.jPanelAccionesFormularioFirmaCliente, this.gridBagConstraintsFirmaCliente);							
			
			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
	        this.gridBagConstraintsFirmaCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFirmaCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleFirmaCliente.add(this.jPanelAccionesFirmaCliente, this.gridBagConstraintsFirmaCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFirmaCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFirmaCliente=   new JScrollPane(this.jPanelCamposFirmaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFirmaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFirmaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFirmaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFirmaCliente.gridx = 0;
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFirmaCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFirmaCliente, this.gridBagConstraintsFirmaCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFirmaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFirmaCliente, this.gridBagConstraintsFirmaCliente);			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFirmaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFirmaCliente, this.gridBagConstraintsFirmaCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFirmaCliente, this.gridBagConstraintsFirmaCliente);
			
			
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
			
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFirmaCliente, this.gridBagConstraintsFirmaCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFirmaCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionFirmaCliente;
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
