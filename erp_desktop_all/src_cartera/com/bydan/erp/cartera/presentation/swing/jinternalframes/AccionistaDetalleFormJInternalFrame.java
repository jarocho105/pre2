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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.cartera.util.AccionistaConstantesFunciones;

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


@SuppressWarnings("unused")
public class AccionistaDetalleFormJInternalFrame extends AccionistaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAccionista;
	
	protected JMenuBar jmenuBarDetalleAccionista;
	
	protected JMenu jmenuDetalleAccionista;
	protected JMenu jmenuDetalleArchivoAccionista;
	protected JMenu jmenuDetalleAccionesAccionista;
	protected JMenu jmenuDetalleDatosAccionista;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAccionista;	
	protected GridBagConstraints gridBagConstraintsAccionista;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AccionistaBeanSwingJInternalFrameAdditional jInternalFrameDetalleAccionista;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoInversionBeanSwingJInternalFrame tipoinversionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoinversion="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";
	
	public AccionistaSessionBean accionistaSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoInversionSessionBean tipoinversionSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;	
	
	public AccionistaLogic accionistaLogic;
	
	public JScrollPane jScrollPanelDatosAccionista;
	public JScrollPane jScrollPanelDatosEdicionAccionista;
	public JScrollPane jScrollPanelDatosGeneralAccionista;
	
	protected JPanel jPanelCamposAccionista;    
	protected JPanel jPanelCamposOcultosAccionista;    	
	protected JPanel jPanelAccionesAccionista;
	protected JPanel jPanelAccionesFormularioAccionista;
    
	
	
	protected Integer iXPanelCamposAccionista=0;
	protected Integer iYPanelCamposAccionista=0;
	
	protected Integer iXPanelCamposOcultosAccionista=0;
	protected Integer iYPanelCamposOcultosAccionista=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAccionista;
	public JButton jButtonModificarAccionista;
	public JButton jButtonActualizarAccionista;
    public JButton jButtonEliminarAccionista;
	public JButton jButtonCancelarAccionista;
    public JButton jButtonGuardarCambiosAccionista;
	public JButton jButtonGuardarCambiosTablaAccionista;
	protected JButton jButtonCerrarAccionista;
	
	
	protected JButton jButtonProcesarInformacionAccionista;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAccionista;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAccionista;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAccionista;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAccionista;
	protected JButton jButtonModificarToolBarAccionista;
	protected JButton jButtonActualizarToolBarAccionista;
    protected JButton jButtonEliminarToolBarAccionista;
	protected JButton jButtonCancelarToolBarAccionista;
    protected JButton jButtonGuardarCambiosToolBarAccionista;
	protected JButton jButtonGuardarCambiosTablaToolBarAccionista;
	protected JButton jButtonMostrarOcultarTablaToolBarAccionista;
	protected JButton jButtonCerrarToolBarAccionista;
	
	protected JButton jButtonProcesarInformacionToolBarAccionista;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAccionista;
	protected JMenuItem jMenuItemModificarAccionista;
	protected JMenuItem jMenuItemActualizarAccionista;
    protected JMenuItem jMenuItemEliminarAccionista;
	protected JMenuItem jMenuItemCancelarAccionista;
    protected JMenuItem jMenuItemGuardarCambiosAccionista;
	protected JMenuItem jMenuItemGuardarCambiosTablaAccionista;
	protected JMenuItem jMenuItemCerrarAccionista;
	protected JMenuItem jMenuItemDetalleCerrarAccionista;
	protected JMenuItem jMenuItemDetalleMostarOcultarAccionista;
	
	protected JMenuItem jMenuItemProcesarInformacionAccionista;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAccionista;
	protected JMenuItem jMenuItemMostrarOcultarAccionista;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAccionista;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAccionista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAccionista;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAccionista;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAccionista;
	public JLabel jLabelIdAccionista;
	public JLabel jLabelidAccionista;
	public JButton jButtonidAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionAccionista;
	public JLabel jLabelidentificacionAccionista;
	public JTextField jTextFieldidentificacionAccionista;
	public JButton jButtonidentificacionAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelapellidopaternoAccionista;
	public JLabel jLabelapellidopaternoAccionista;
	public JTextArea jTextAreaapellidopaternoAccionista;
	public JScrollPane jscrollPaneapellidopaternoAccionista;
	public JButton jButtonapellidopaternoAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelapellidomaternoAccionista;
	public JLabel jLabelapellidomaternoAccionista;
	public JTextArea jTextAreaapellidomaternoAccionista;
	public JScrollPane jscrollPaneapellidomaternoAccionista;
	public JButton jButtonapellidomaternoAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelprimernombreAccionista;
	public JLabel jLabelprimernombreAccionista;
	public JTextArea jTextAreaprimernombreAccionista;
	public JScrollPane jscrollPaneprimernombreAccionista;
	public JButton jButtonprimernombreAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelsegundonombreAccionista;
	public JLabel jLabelsegundonombreAccionista;
	public JTextArea jTextAreasegundonombreAccionista;
	public JScrollPane jscrollPanesegundonombreAccionista;
	public JButton jButtonsegundonombreAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelnombrecortoAccionista;
	public JLabel jLabelnombrecortoAccionista;
	public JTextArea jTextAreanombrecortoAccionista;
	public JScrollPane jscrollPanenombrecortoAccionista;
	public JButton jButtonnombrecortoAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelparticipacionAccionista;
	public JLabel jLabelparticipacionAccionista;
	public JTextField jTextFieldparticipacionAccionista;
	public JButton jButtonparticipacionAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelesactivoAccionista;
	public JLabel jLabelesactivoAccionista;
	public JCheckBox jCheckBoxesactivoAccionista;
	public JButton jButtonesactivoAccionistaBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteAccionista;
	public JLabel jLabelidclienteAccionista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteAccionista;
	public JButton jButtonidclienteAccionista= new JButtonMe();
	public JButton jButtonidclienteAccionistaUpdate= new JButtonMe();
	public JButton jButtonidclienteAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclienteinversionAccionista;
	public JLabel jLabelidvalorclienteinversionAccionista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclienteinversionAccionista;
	public JButton jButtonidvalorclienteinversionAccionista= new JButtonMe();
	public JButton jButtonidvalorclienteinversionAccionistaUpdate= new JButtonMe();
	public JButton jButtonidvalorclienteinversionAccionistaBusqueda= new JButtonMe();

	public JPanel jPanelidvaloridentificacionAccionista;
	public JLabel jLabelidvaloridentificacionAccionista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvaloridentificacionAccionista;
	public JButton jButtonidvaloridentificacionAccionista= new JButtonMe();
	public JButton jButtonidvaloridentificacionAccionistaUpdate= new JButtonMe();
	public JButton jButtonidvaloridentificacionAccionistaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAccionista;
	
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
	public int iHeightFormulario=1166;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AccionistaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAccionista=new JPanel();
				this.jPanelAccionesFormularioAccionista=new JPanel();
				this.jmenuBarDetalleAccionista=new JMenuBar();
				this.jTtoolBarDetalleAccionista=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionistaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AccionistaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionistaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionistaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionistaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAccionista() {
		return this.jButtonActualizarToolBarAccionista;
	}
	
	public JButton getjButtonEliminarToolBarAccionista() {
		return this.jButtonEliminarToolBarAccionista;
	}
	
	public JButton getjButtonCancelarToolBarAccionista() {
		return this.jButtonCancelarToolBarAccionista;
	}		
	
	public JButton getjButtonProcesarInformacionAccionista() {
		return this.jButtonProcesarInformacionAccionista;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAccionista)	{
		this.jButtonProcesarInformacionAccionista = jButtonProcesarInformacionAccionista;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAccionista() {
		return this.jComboBoxTiposAccionesAccionista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAccionista(
			JComboBox jComboBoxTiposRelacionesAccionista) {
		this.jComboBoxTiposRelacionesAccionista = jComboBoxTiposRelacionesAccionista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAccionista(
			JComboBox jComboBoxTiposAccionesAccionista) {
		this.jComboBoxTiposAccionesAccionista = jComboBoxTiposAccionesAccionista;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAccionista() {
		return this.jComboBoxTiposAccionesFormularioAccionista;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAccionista(
			JComboBox jComboBoxTiposAccionesFormularioAccionista) {
		this.jComboBoxTiposAccionesFormularioAccionista = jComboBoxTiposAccionesFormularioAccionista;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.accionistaSessionBean=new AccionistaSessionBean();
		
		this.accionistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.accionistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.accionistaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AccionistaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Accionista MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
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
	
		AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAccionista= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAccionista=new JButtonMe();
				this.jButtonModificarToolBarAccionista=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAccionista,this.jTtoolBarDetalleAccionista,
							"actualizar","actualizar","Actualizar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAccionista,this.jTtoolBarDetalleAccionista,
							"eliminar","eliminar","Eliminar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAccionista,this.jTtoolBarDetalleAccionista,
							"cancelar","cancelar","Cancelar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAccionista,this.jTtoolBarDetalleAccionista,
							"guardarcambios","guardarcambios","Guardar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAccionista,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAccionista,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAccionista,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAccionista=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAccionista=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAccionista=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAccionista=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAccionista=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAccionista= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAccionista.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAccionista,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAccionista= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAccionista.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAccionista,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAccionista= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAccionista.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAccionista,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAccionista= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAccionista.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAccionista,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAccionista= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAccionista.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAccionista,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAccionista= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAccionista.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAccionista,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAccionista= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAccionista.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAccionista,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAccionista= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAccionista.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAccionista,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAccionista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAccionista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAccionista,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAccionista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAccionista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAccionista,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAccionista.add(this.jMenuItemDetalleCerrarAccionista);
		
		this.jmenuDetalleAccionesAccionista.add(this.jMenuItemActualizarAccionista);
		this.jmenuDetalleAccionesAccionista.add(this.jMenuItemEliminarAccionista);
		this.jmenuDetalleAccionesAccionista.add(this.jMenuItemCancelarAccionista);		
		
		//this.jmenuDetalleDatosAccionista.add(this.jMenuItemDetalleAbrirOrderByAccionista);				
		this.jmenuDetalleDatosAccionista.add(this.jMenuItemDetalleMostarOcultarAccionista);				
				
		//this.jmenuDetalleAccionesAccionista.add(this.jMenuItemGuardarCambiosAccionista);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAccionista.add(this.jmenuDetalleArchivoAccionista);		
		this.jmenuBarDetalleAccionista.add(this.jmenuDetalleAccionesAccionista);		
		this.jmenuBarDetalleAccionista.add(this.jmenuDetalleDatosAccionista);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAccionista);				
	}
	
	
	public void inicializarElementosCamposAccionista() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAccionista = new JLabelMe();
		jLabelIdAccionista.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAccionista = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAccionista= new GridBagLayout();

		this.jPanelidAccionista.setLayout(this.gridaBagLayoutAccionista);

		jLabelidAccionista = new JLabel();
		jLabelidAccionista.setText("Id");

		jLabelidAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelidentificacionAccionista = new JLabelMe();
		this.jLabelidentificacionAccionista.setText(""+AccionistaConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionAccionista.setToolTipText("Identificacion");
		this.jLabelidentificacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelidentificacionAccionista.setLayout(this.gridaBagLayoutAccionista);


		jTextFieldidentificacionAccionista= new JTextFieldMe();

		jTextFieldidentificacionAccionista.setEnabled(false);
		jTextFieldidentificacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionAccionistaBusqueda= new JButtonMe();
		this.jButtonidentificacionAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionAccionistaBusqueda.setText("U");
		this.jButtonidentificacionAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionAccionistaBusqueda.setVisible(false);		}


					
		this.jLabelapellidopaternoAccionista = new JLabelMe();
		this.jLabelapellidopaternoAccionista.setText(""+AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO+" : *");
		this.jLabelapellidopaternoAccionista.setToolTipText("Apellido Paterno");
		this.jLabelapellidopaternoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidopaternoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidopaternoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidopaternoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidopaternoAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidopaternoAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelapellidopaternoAccionista.setLayout(this.gridaBagLayoutAccionista);


		jTextAreaapellidopaternoAccionista= new JTextAreaMe();
		jTextAreaapellidopaternoAccionista.setEnabled(false);
		jTextAreaapellidopaternoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoAccionista.setLineWrap(true);
		jTextAreaapellidopaternoAccionista.setWrapStyleWord(true);
		jTextAreaapellidopaternoAccionista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidopaternoAccionista.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidopaternoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidopaternoAccionista = new JScrollPane(jTextAreaapellidopaternoAccionista);
		jscrollPaneapellidopaternoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidopaternoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidopaternoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidopaternoAccionistaBusqueda= new JButtonMe();
		this.jButtonapellidopaternoAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidopaternoAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidopaternoAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidopaternoAccionistaBusqueda.setText("U");
		this.jButtonapellidopaternoAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidopaternoAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidopaternoAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidopaternoAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidopaternoAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidopaternoAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidopaternoAccionistaBusqueda.setVisible(false);		}


					
		this.jLabelapellidomaternoAccionista = new JLabelMe();
		this.jLabelapellidomaternoAccionista.setText(""+AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO+" : *");
		this.jLabelapellidomaternoAccionista.setToolTipText("Apellido Materno");
		this.jLabelapellidomaternoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidomaternoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidomaternoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidomaternoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidomaternoAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidomaternoAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelapellidomaternoAccionista.setLayout(this.gridaBagLayoutAccionista);


		jTextAreaapellidomaternoAccionista= new JTextAreaMe();
		jTextAreaapellidomaternoAccionista.setEnabled(false);
		jTextAreaapellidomaternoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoAccionista.setLineWrap(true);
		jTextAreaapellidomaternoAccionista.setWrapStyleWord(true);
		jTextAreaapellidomaternoAccionista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidomaternoAccionista.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidomaternoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidomaternoAccionista = new JScrollPane(jTextAreaapellidomaternoAccionista);
		jscrollPaneapellidomaternoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidomaternoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidomaternoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidomaternoAccionistaBusqueda= new JButtonMe();
		this.jButtonapellidomaternoAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidomaternoAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidomaternoAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidomaternoAccionistaBusqueda.setText("U");
		this.jButtonapellidomaternoAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidomaternoAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidomaternoAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidomaternoAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidomaternoAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidomaternoAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidomaternoAccionistaBusqueda.setVisible(false);		}


					
		this.jLabelprimernombreAccionista = new JLabelMe();
		this.jLabelprimernombreAccionista.setText(""+AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE+" : *");
		this.jLabelprimernombreAccionista.setToolTipText("Primer Nombre");
		this.jLabelprimernombreAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprimernombreAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprimernombreAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprimernombreAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprimernombreAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprimernombreAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelprimernombreAccionista.setLayout(this.gridaBagLayoutAccionista);


		jTextAreaprimernombreAccionista= new JTextAreaMe();
		jTextAreaprimernombreAccionista.setEnabled(false);
		jTextAreaprimernombreAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreAccionista.setLineWrap(true);
		jTextAreaprimernombreAccionista.setWrapStyleWord(true);
		jTextAreaprimernombreAccionista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaprimernombreAccionista.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaprimernombreAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneprimernombreAccionista = new JScrollPane(jTextAreaprimernombreAccionista);
		jscrollPaneprimernombreAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprimernombreAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprimernombreAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonprimernombreAccionistaBusqueda= new JButtonMe();
		this.jButtonprimernombreAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprimernombreAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprimernombreAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprimernombreAccionistaBusqueda.setText("U");
		this.jButtonprimernombreAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprimernombreAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprimernombreAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaprimernombreAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaprimernombreAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"primernombreAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprimernombreAccionistaBusqueda.setVisible(false);		}


					
		this.jLabelsegundonombreAccionista = new JLabelMe();
		this.jLabelsegundonombreAccionista.setText(""+AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE+" : *");
		this.jLabelsegundonombreAccionista.setToolTipText("Segundo Nombre");
		this.jLabelsegundonombreAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegundonombreAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegundonombreAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsegundonombreAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsegundonombreAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsegundonombreAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelsegundonombreAccionista.setLayout(this.gridaBagLayoutAccionista);


		jTextAreasegundonombreAccionista= new JTextAreaMe();
		jTextAreasegundonombreAccionista.setEnabled(false);
		jTextAreasegundonombreAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreAccionista.setLineWrap(true);
		jTextAreasegundonombreAccionista.setWrapStyleWord(true);
		jTextAreasegundonombreAccionista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasegundonombreAccionista.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreasegundonombreAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesegundonombreAccionista = new JScrollPane(jTextAreasegundonombreAccionista);
		jscrollPanesegundonombreAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesegundonombreAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesegundonombreAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsegundonombreAccionistaBusqueda= new JButtonMe();
		this.jButtonsegundonombreAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegundonombreAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegundonombreAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsegundonombreAccionistaBusqueda.setText("U");
		this.jButtonsegundonombreAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsegundonombreAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsegundonombreAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasegundonombreAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasegundonombreAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"segundonombreAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsegundonombreAccionistaBusqueda.setVisible(false);		}


					
		this.jLabelnombrecortoAccionista = new JLabelMe();
		this.jLabelnombrecortoAccionista.setText(""+AccionistaConstantesFunciones.LABEL_NOMBRECORTO+" : *");
		this.jLabelnombrecortoAccionista.setToolTipText("Nombre Corto");
		this.jLabelnombrecortoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrecortoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrecortoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrecortoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrecortoAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrecortoAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_NOMBRECORTO);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelnombrecortoAccionista.setLayout(this.gridaBagLayoutAccionista);


		jTextAreanombrecortoAccionista= new JTextAreaMe();
		jTextAreanombrecortoAccionista.setEnabled(false);
		jTextAreanombrecortoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoAccionista.setLineWrap(true);
		jTextAreanombrecortoAccionista.setWrapStyleWord(true);
		jTextAreanombrecortoAccionista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrecortoAccionista.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreanombrecortoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrecortoAccionista = new JScrollPane(jTextAreanombrecortoAccionista);
		jscrollPanenombrecortoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrecortoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrecortoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombrecortoAccionistaBusqueda= new JButtonMe();
		this.jButtonnombrecortoAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrecortoAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrecortoAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrecortoAccionistaBusqueda.setText("U");
		this.jButtonnombrecortoAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrecortoAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrecortoAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrecortoAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrecortoAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrecortoAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrecortoAccionistaBusqueda.setVisible(false);		}


					
		this.jLabelparticipacionAccionista = new JLabelMe();
		this.jLabelparticipacionAccionista.setText(""+AccionistaConstantesFunciones.LABEL_PARTICIPACION+" : *");
		this.jLabelparticipacionAccionista.setToolTipText("Participacion");
		this.jLabelparticipacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelparticipacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelparticipacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelparticipacionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelparticipacionAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelparticipacionAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_PARTICIPACION);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelparticipacionAccionista.setLayout(this.gridaBagLayoutAccionista);


		jTextFieldparticipacionAccionista= new JTextFieldMe();
		jTextFieldparticipacionAccionista.setEnabled(false);
		jTextFieldparticipacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldparticipacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldparticipacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldparticipacionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldparticipacionAccionista.setText("0");

		this.jButtonparticipacionAccionistaBusqueda= new JButtonMe();
		this.jButtonparticipacionAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonparticipacionAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonparticipacionAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonparticipacionAccionistaBusqueda.setText("U");
		this.jButtonparticipacionAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonparticipacionAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonparticipacionAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldparticipacionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldparticipacionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"participacionAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonparticipacionAccionistaBusqueda.setVisible(false);		}


					
		this.jLabelesactivoAccionista = new JLabelMe();
		this.jLabelesactivoAccionista.setText(""+AccionistaConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoAccionista.setToolTipText("Es Activo");
		this.jLabelesactivoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelesactivoAccionista.setLayout(this.gridaBagLayoutAccionista);


		jCheckBoxesactivoAccionista= new JCheckBoxMe();
		jCheckBoxesactivoAccionista.setEnabled(false);

		jCheckBoxesactivoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoAccionistaBusqueda= new JButtonMe();
		this.jButtonesactivoAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoAccionistaBusqueda.setText("U");
		this.jButtonesactivoAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoAccionistaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAccionista() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelidclienteAccionista = new JLabelMe();
		this.jLabelidclienteAccionista.setText(""+AccionistaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteAccionista.setToolTipText("Cliente");
		this.jLabelidclienteAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelidclienteAccionista.setLayout(this.gridaBagLayoutAccionista);


		jComboBoxidclienteAccionista= new JComboBoxMe();
		jComboBoxidclienteAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteAccionista= new JButtonMe();
		this.jButtonidclienteAccionista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteAccionista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteAccionista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteAccionista.setText("Buscar");
		this.jButtonidclienteAccionista.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteAccionista.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteAccionista,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteAccionista"));

		this.jButtonidclienteAccionistaBusqueda= new JButtonMe();
		this.jButtonidclienteAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteAccionistaBusqueda.setText("U");
		this.jButtonidclienteAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteAccionistaBusqueda.setVisible(false);		}

		this.jButtonidclienteAccionistaUpdate= new JButtonMe();
		this.jButtonidclienteAccionistaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteAccionistaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteAccionistaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteAccionistaUpdate.setText("U");
		this.jButtonidclienteAccionistaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteAccionistaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteAccionistaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteAccionistaUpdate"));



					
		this.jLabelidvalorclienteinversionAccionista = new JLabelMe();
		this.jLabelidvalorclienteinversionAccionista.setText(""+AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION+" : *");
		this.jLabelidvalorclienteinversionAccionista.setToolTipText("Tipo Inversion");
		this.jLabelidvalorclienteinversionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclienteinversionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclienteinversionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclienteinversionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclienteinversionAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclienteinversionAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelidvalorclienteinversionAccionista.setLayout(this.gridaBagLayoutAccionista);


		jComboBoxidvalorclienteinversionAccionista= new JComboBoxMe();
		jComboBoxidvalorclienteinversionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteinversionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteinversionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclienteinversionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclienteinversionAccionista= new JButtonMe();
		this.jButtonidvalorclienteinversionAccionista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienteinversionAccionista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienteinversionAccionista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienteinversionAccionista.setText("Buscar");
		this.jButtonidvalorclienteinversionAccionista.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclienteinversionAccionista.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienteinversionAccionista,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclienteinversionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienteinversionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienteinversionAccionista"));

		this.jButtonidvalorclienteinversionAccionistaBusqueda= new JButtonMe();
		this.jButtonidvalorclienteinversionAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteinversionAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteinversionAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclienteinversionAccionistaBusqueda.setText("U");
		this.jButtonidvalorclienteinversionAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclienteinversionAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienteinversionAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclienteinversionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienteinversionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienteinversionAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclienteinversionAccionistaBusqueda.setVisible(false);		}

		this.jButtonidvalorclienteinversionAccionistaUpdate= new JButtonMe();
		this.jButtonidvalorclienteinversionAccionistaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteinversionAccionistaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteinversionAccionistaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclienteinversionAccionistaUpdate.setText("U");
		this.jButtonidvalorclienteinversionAccionistaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclienteinversionAccionistaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienteinversionAccionistaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclienteinversionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienteinversionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienteinversionAccionistaUpdate"));



					
		this.jLabelidvaloridentificacionAccionista = new JLabelMe();
		this.jLabelidvaloridentificacionAccionista.setText(""+AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION+" : *");
		this.jLabelidvaloridentificacionAccionista.setToolTipText("Tipo Identificacion");
		this.jLabelidvaloridentificacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvaloridentificacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvaloridentificacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvaloridentificacionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvaloridentificacionAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvaloridentificacionAccionista.setToolTipText(AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		this.gridaBagLayoutAccionista = new GridBagLayout();
		this.jPanelidvaloridentificacionAccionista.setLayout(this.gridaBagLayoutAccionista);


		jComboBoxidvaloridentificacionAccionista= new JComboBoxMe();
		jComboBoxidvaloridentificacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvaloridentificacionAccionista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvaloridentificacionAccionista= new JButtonMe();
		this.jButtonidvaloridentificacionAccionista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvaloridentificacionAccionista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvaloridentificacionAccionista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvaloridentificacionAccionista.setText("Buscar");
		this.jButtonidvaloridentificacionAccionista.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvaloridentificacionAccionista.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvaloridentificacionAccionista,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvaloridentificacionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvaloridentificacionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvaloridentificacionAccionista"));

		this.jButtonidvaloridentificacionAccionistaBusqueda= new JButtonMe();
		this.jButtonidvaloridentificacionAccionistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionAccionistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionAccionistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvaloridentificacionAccionistaBusqueda.setText("U");
		this.jButtonidvaloridentificacionAccionistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvaloridentificacionAccionistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvaloridentificacionAccionistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvaloridentificacionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvaloridentificacionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvaloridentificacionAccionistaBusqueda"));

		if(this.accionistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvaloridentificacionAccionistaBusqueda.setVisible(false);		}

		this.jButtonidvaloridentificacionAccionistaUpdate= new JButtonMe();
		this.jButtonidvaloridentificacionAccionistaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionAccionistaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionAccionistaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvaloridentificacionAccionistaUpdate.setText("U");
		this.jButtonidvaloridentificacionAccionistaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvaloridentificacionAccionistaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvaloridentificacionAccionistaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvaloridentificacionAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvaloridentificacionAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvaloridentificacionAccionistaUpdate"));



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
		//this.jInternalFrameDetalleAccionista = new AccionistaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Accionista DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAccionista= new GridBagLayout();
		

		
		String sToolTipAccionista="";
		sToolTipAccionista=AccionistaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAccionista+="(Cartera.Accionista)";
		}
		
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAccionista+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAccionista = new JButtonMe();
		this.jButtonModificarAccionista = new JButtonMe();
        this.jButtonActualizarAccionista = new JButtonMe();
        this.jButtonEliminarAccionista = new JButtonMe();
        this.jButtonCancelarAccionista = new JButtonMe();
        this.jButtonGuardarCambiosAccionista = new JButtonMe();
		this.jButtonGuardarCambiosTablaAccionista = new JButtonMe();
		this.jButtonCerrarAccionista = new JButtonMe();
		
		this.jScrollPanelDatosAccionista = new JScrollPane();   
        this.jScrollPanelDatosEdicionAccionista = new JScrollPane();
		this.jScrollPanelDatosGeneralAccionista = new JScrollPane();
				
		
		
		this.jPanelCamposAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Accionista";
		
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Accionistas" + this.sPath));
		} else {
			this.jScrollPanelDatosAccionista.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAccionista.setName("jPanelCamposAccionista"); 

		this.jPanelCamposOcultosAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAccionista.setName("jPanelCamposOcultosAccionista"); 

        this.jPanelAccionesAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAccionista.setToolTipText("Acciones");
        this.jPanelAccionesAccionista.setName("Acciones"); 

		this.jPanelAccionesFormularioAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAccionista.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAccionista.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAccionista, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAccionista.setText("Nuevo");
		this.jButtonModificarAccionista.setText("Editar");
        this.jButtonActualizarAccionista.setText("Actualizar");
        this.jButtonEliminarAccionista.setText("Eliminar");
        this.jButtonCancelarAccionista.setText("Cancelar");
        this.jButtonGuardarCambiosAccionista.setText("Guardar");
		this.jButtonGuardarCambiosTablaAccionista.setText("Guardar");
		this.jButtonCerrarAccionista.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAccionista,"nuevo_button","Nuevo",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAccionista,"modificar_button","Editar",this.accionistaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAccionista,"actualizar_button","Actualizar",this.accionistaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAccionista,"eliminar_button","Eliminar",this.accionistaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAccionista,"cancelar_button","Cancelar",this.accionistaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAccionista,"guardarcambios_button","Guardar",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAccionista,"guardarcambiostabla_button","Guardar",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAccionista,"cerrar_button","Salir",this.accionistaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAccionista.setToolTipText("Nuevo"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAccionista.setToolTipText("Editar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAccionista.setToolTipText("Actualizar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAccionista.setToolTipText("Eliminar)"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAccionista.setToolTipText("Cancelar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAccionista.setToolTipText("Guardar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAccionista.setToolTipText("Guardar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAccionista.setToolTipText("Salir"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAccionista";
		inputMap = this.jButtonNuevoAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAccionista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAccionista"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAccionista";
		inputMap = this.jButtonActualizarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAccionista"));
		
		//ELIMINAR
		sMapKey = "EliminarAccionista";
		inputMap = this.jButtonEliminarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAccionista"));
		
		//CANCELAR	
		sMapKey = "CancelarAccionista";
		inputMap = this.jButtonCancelarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAccionista"));
		
		//CERRAR		
		sMapKey = "CerrarAccionista";
		inputMap = this.jButtonCerrarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAccionista"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAccionista";
		inputMap = this.jButtonGuardarCambiosTablaAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAccionista"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAccionista = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAccionista.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAccionista.setToolTipText("Nuevo Accionista");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAccionista = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAccionista.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAccionista.setToolTipText("Sin Cerrar Ventana Accionista");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAccionista = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAccionista.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAccionista.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAccionista, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAccionista = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAccionista.setText("Accion");
		this.jComboBoxTiposAccionesAccionista.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAccionista = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAccionista.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAccionista.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAccionista = new JLabelMe();
		
		this.jLabelAccionesAccionista.setText("Acciones");		
		this.jLabelAccionesAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAccionista();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAccionista();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAccionista=new JTabbedPane();
		this.jTabbedPaneRelacionesAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAccionista,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAccionista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccionista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccionista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAccionista.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAccionista.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAccionista.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAccionista, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAccionista = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAccionista = new GridBagLayout();
		
		this.jPanelCamposAccionista.setLayout(gridaBagLayoutCamposAccionista);
		this.jPanelCamposOcultosAccionista.setLayout(gridaBagLayoutCamposOcultosAccionista);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAccionista.add(jLabelIdAccionista, this.gridBagConstraintsAccionista);



	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAccionista.add(jLabelidAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteAccionista.add(jLabelidclienteAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 2;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteAccionista.add(jButtonidclienteAccionista, this.gridBagConstraintsAccionista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 3;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteAccionista.add(jButtonidclienteAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 4;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteAccionista.add(jButtonidclienteAccionistaUpdate, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteAccionista.add(jComboBoxidclienteAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclienteinversionAccionista.add(jLabelidvalorclienteinversionAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclienteinversionAccionista.add(jButtonidvalorclienteinversionAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 3;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclienteinversionAccionista.add(jButtonidvalorclienteinversionAccionistaUpdate, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclienteinversionAccionista.add(jComboBoxidvalorclienteinversionAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvaloridentificacionAccionista.add(jLabelidvaloridentificacionAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvaloridentificacionAccionista.add(jButtonidvaloridentificacionAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 3;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvaloridentificacionAccionista.add(jButtonidvaloridentificacionAccionistaUpdate, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvaloridentificacionAccionista.add(jComboBoxidvaloridentificacionAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionAccionista.add(jLabelidentificacionAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionAccionista.add(jButtonidentificacionAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionAccionista.add(jTextFieldidentificacionAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidopaternoAccionista.add(jLabelapellidopaternoAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidopaternoAccionista.add(jButtonapellidopaternoAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidopaternoAccionista.add(jscrollPaneapellidopaternoAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidomaternoAccionista.add(jLabelapellidomaternoAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidomaternoAccionista.add(jButtonapellidomaternoAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidomaternoAccionista.add(jscrollPaneapellidomaternoAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprimernombreAccionista.add(jLabelprimernombreAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelprimernombreAccionista.add(jButtonprimernombreAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprimernombreAccionista.add(jscrollPaneprimernombreAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsegundonombreAccionista.add(jLabelsegundonombreAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelsegundonombreAccionista.add(jButtonsegundonombreAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsegundonombreAccionista.add(jscrollPanesegundonombreAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrecortoAccionista.add(jLabelnombrecortoAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrecortoAccionista.add(jButtonnombrecortoAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrecortoAccionista.add(jscrollPanenombrecortoAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelparticipacionAccionista.add(jLabelparticipacionAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelparticipacionAccionista.add(jButtonparticipacionAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelparticipacionAccionista.add(jTextFieldparticipacionAccionista, this.gridBagConstraintsAccionista);


	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 0;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoAccionista.add(jLabelesactivoAccionista, this.gridBagConstraintsAccionista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 2;
		this.gridBagConstraintsAccionista.ipadx = 0;
		this.gridBagConstraintsAccionista.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoAccionista.add(jButtonesactivoAccionistaBusqueda, this.gridBagConstraintsAccionista);
	}

	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccionista.gridy = 0;
	this.gridBagConstraintsAccionista.gridx = 1;
	this.gridBagConstraintsAccionista.ipadx = 0;
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoAccionista.add(jCheckBoxesactivoAccionista, this.gridBagConstraintsAccionista);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelidAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelidclienteAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelidvalorclienteinversionAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelidvaloridentificacionAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelidentificacionAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelapellidopaternoAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelapellidomaternoAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelprimernombreAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelsegundonombreAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelnombrecortoAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelparticipacionAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
	}
	this.gridBagConstraintsAccionista = new GridBagConstraints();
	this.gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccionista.gridy = iYPanelCamposAccionista;
	this.gridBagConstraintsAccionista.gridx = iXPanelCamposAccionista++;
	this.gridBagConstraintsAccionista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccionista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccionista.add(this.jPanelesactivoAccionista, this.gridBagConstraintsAccionista);



	if(iXPanelCamposAccionista % 1==0) {
		iXPanelCamposAccionista=0;
		iYPanelCamposAccionista++;
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
			
		GridBagLayout gridaBagLayoutAccionesAccionista= new GridBagLayout();
		this.jPanelAccionesAccionista.setLayout(gridaBagLayoutAccionesAccionista);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAccionista= new GridBagLayout();
		this.jPanelAccionesFormularioAccionista.setLayout(gridaBagLayoutAccionesFormularioAccionista);
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAccionista.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAccionista.add(this.jComboBoxTiposAccionesFormularioAccionista, this.gridBagConstraintsAccionista);

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAccionista.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAccionista.add(this.jCheckBoxPostAccionNuevoAccionista, this.gridBagConstraintsAccionista);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.accionistaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAccionista.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAccionista.add(this.jCheckBoxPostAccionSinCerrarAccionista, this.gridBagConstraintsAccionista);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.accionistaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAccionista.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAccionista.add(this.jCheckBoxPostAccionSinMensajeAccionista, this.gridBagConstraintsAccionista);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = iPosXAccion++;
			
		this.jPanelAccionesAccionista.add(this.jButtonModificarAccionista, this.gridBagConstraintsAccionista);							

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx =iPosXAccion++;
			
		this.jPanelAccionesAccionista.add(this.jButtonEliminarAccionista, this.gridBagConstraintsAccionista);
		
			
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = 0;		
		this.gridBagConstraintsAccionista.gridx = iPosXAccion++;
		
		this.jPanelAccionesAccionista.add(this.jButtonActualizarAccionista, this.gridBagConstraintsAccionista);


		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = 0;		
		this.gridBagConstraintsAccionista.gridx = iPosXAccion++;
		
		this.jPanelAccionesAccionista.add(this.jButtonGuardarCambiosAccionista, this.gridBagConstraintsAccionista);	
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = 0;		
		this.gridBagConstraintsAccionista.gridx =iPosXAccion++;
		
		this.jPanelAccionesAccionista.add(this.jButtonCancelarAccionista, this.gridBagConstraintsAccionista);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAccionista = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAccionista);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAccionista = new GridBagConstraints();						
			this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAccionista.gridx = 0;		
			//this.gridBagConstraintsAccionista.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAccionista.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAccionista.gridx =0;
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAccionista.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAccionista, this.gridBagConstraintsAccionista);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AccionistaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAccionista = new AccionistaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Accionista DATOS");
			
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
			
	        //this.setTitle("[FOR] - Accionista DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Accionista Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AccionistaModel accionistaModel=new AccionistaModel(this);
			
			//SI USARA CLASE INTERNA
			//AccionistaModel.AccionistaFocusTraversalPolicy accionistaFocusTraversalPolicy = accionistaModel.new AccionistaFocusTraversalPolicy(this);
			
			//accionistaFocusTraversalPolicy.setaccionistaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(accionistaModel);
			
			
			this.jContentPaneDetalleAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAccionista = new GridBagLayout();	
			this.jContentPaneDetalleAccionista.setLayout(gridaBagLayoutDetalleAccionista);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAccionista = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAccionista = new GridBagConstraints();
				this.gridBagConstraintsAccionista.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAccionista.gridx = 0;
					
				
				this.jContentPaneDetalleAccionista.add(jTtoolBarDetalleAccionista, gridBagConstraintsAccionista);								
				
}
			
			this.jScrollPanelDatosEdicionAccionista=   new JScrollPane(jContentPaneDetalleAccionista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAccionista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccionista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccionista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAccionista=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAccionista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccionista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccionista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAccionista.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAccionista.gridx = 0;
	        
			this.jContentPaneDetalleAccionista.add(jPanelCamposAccionista, gridBagConstraintsAccionista);
			
			
			
			
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
						&& accionistaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.accionistaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAccionista= new GridBagConstraints();
						this.gridBagConstraintsAccionista.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAccionista.gridx = 0;
						this.jContentPaneDetalleAccionista.add(this.jTabbedPaneRelacionesAccionista, this.gridBagConstraintsAccionista);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAccionista.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAccionista.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAccionista = new GridBagConstraints();
					this.gridBagConstraintsAccionista.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAccionista.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAccionista.gridx = 0;
					
				
					this.jContentPaneDetalleAccionista.add(jPanelCamposOcultosAccionista, gridBagConstraintsAccionista);
				
					this.jPanelCamposOcultosAccionista.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAccionista.gridx = 0;
	        this.gridBagConstraintsAccionista.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAccionista.add(this.jPanelAccionesFormularioAccionista, this.gridBagConstraintsAccionista);							
			
			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
	        this.gridBagConstraintsAccionista.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAccionista.gridx = 0;
	        
			
			this.jContentPaneDetalleAccionista.add(this.jPanelAccionesAccionista, this.gridBagConstraintsAccionista);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAccionista);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAccionista=   new JScrollPane(this.jPanelCamposAccionista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAccionista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccionista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccionista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAccionista.gridx = 0;
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAccionista.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAccionista, this.gridBagConstraintsAccionista);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAccionista.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAccionista, this.gridBagConstraintsAccionista);			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAccionista.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAccionista, this.gridBagConstraintsAccionista);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAccionista, this.gridBagConstraintsAccionista);
			
			
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAccionista, this.gridBagConstraintsAccionista);
		
			
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAccionista, this.gridBagConstraintsAccionista);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAccionista;//jContentPane;
		
		return jScrollPanelDatosEdicionAccionista;
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
