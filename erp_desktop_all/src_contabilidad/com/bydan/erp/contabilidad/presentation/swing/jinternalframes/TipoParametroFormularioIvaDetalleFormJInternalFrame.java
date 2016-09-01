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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoParametroFormularioIvaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoParametroFormularioIvaDetalleFormJInternalFrame extends TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoParametroFormularioIva;
	
	protected JMenuBar jmenuBarDetalleTipoParametroFormularioIva;
	
	protected JMenu jmenuDetalleTipoParametroFormularioIva;
	protected JMenu jmenuDetalleArchivoTipoParametroFormularioIva;
	protected JMenu jmenuDetalleAccionesTipoParametroFormularioIva;
	protected JMenu jmenuDetalleDatosTipoParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsTipoParametroFormularioIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoParametroFormularioIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParametroFormularioIvaSessionBean tipoparametroformularioivaSessionBean;
	
	

	public ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame=null;
	public ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroFormularioIva=false;
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;
	
		
	
	public TipoParametroFormularioIvaLogic tipoparametroformularioivaLogic;
	
	public JScrollPane jScrollPanelDatosTipoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionTipoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralTipoParametroFormularioIva;
	
	protected JPanel jPanelCamposTipoParametroFormularioIva;    
	protected JPanel jPanelCamposOcultosTipoParametroFormularioIva;    	
	protected JPanel jPanelAccionesTipoParametroFormularioIva;
	protected JPanel jPanelAccionesFormularioTipoParametroFormularioIva;
    
	
	
	protected Integer iXPanelCamposTipoParametroFormularioIva=0;
	protected Integer iYPanelCamposTipoParametroFormularioIva=0;
	
	protected Integer iXPanelCamposOcultosTipoParametroFormularioIva=0;
	protected Integer iYPanelCamposOcultosTipoParametroFormularioIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoParametroFormularioIva;
	public JButton jButtonModificarTipoParametroFormularioIva;
	public JButton jButtonActualizarTipoParametroFormularioIva;
    public JButton jButtonEliminarTipoParametroFormularioIva;
	public JButton jButtonCancelarTipoParametroFormularioIva;
    public JButton jButtonGuardarCambiosTipoParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaTipoParametroFormularioIva;
	protected JButton jButtonCerrarTipoParametroFormularioIva;
	
	
	protected JButton jButtonProcesarInformacionTipoParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParametroFormularioIva;
	protected JButton jButtonModificarToolBarTipoParametroFormularioIva;
	protected JButton jButtonActualizarToolBarTipoParametroFormularioIva;
    protected JButton jButtonEliminarToolBarTipoParametroFormularioIva;
	protected JButton jButtonCancelarToolBarTipoParametroFormularioIva;
    protected JButton jButtonGuardarCambiosToolBarTipoParametroFormularioIva;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParametroFormularioIva;
	protected JButton jButtonCerrarToolBarTipoParametroFormularioIva;
	
	protected JButton jButtonProcesarInformacionToolBarTipoParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParametroFormularioIva;
	protected JMenuItem jMenuItemModificarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemActualizarTipoParametroFormularioIva;
    protected JMenuItem jMenuItemEliminarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemCancelarTipoParametroFormularioIva;
    protected JMenuItem jMenuItemGuardarCambiosTipoParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParametroFormularioIva;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParametroFormularioIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParametroFormularioIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoParametroFormularioIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoParametroFormularioIva;
	public JLabel jLabelIdTipoParametroFormularioIva;
	public JTextFieldMe jTextFieldidTipoParametroFormularioIva;
	public JButton jButtonidTipoParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoParametroFormularioIva;
	public JLabel jLabelnombreTipoParametroFormularioIva;
	public JTextArea jTextAreanombreTipoParametroFormularioIva;
	public JScrollPane jscrollPanenombreTipoParametroFormularioIva;
	public JButton jButtonnombreTipoParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sriTipoParametroFormularioIva;
	public JLabel jLabelcodigo_sriTipoParametroFormularioIva;
	public JTextField jTextFieldcodigo_sriTipoParametroFormularioIva;
	public JButton jButtoncodigo_sriTipoParametroFormularioIvaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoParametroFormularioIva;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoParametroFormularioIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoParametroFormularioIva=new JPanel();
				this.jPanelAccionesFormularioTipoParametroFormularioIva=new JPanel();
				this.jmenuBarDetalleTipoParametroFormularioIva=new JMenuBar();
				this.jTtoolBarDetalleTipoParametroFormularioIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroFormularioIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoParametroFormularioIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroFormularioIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroFormularioIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroFormularioIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoParametroFormularioIva() {
		return this.jButtonActualizarToolBarTipoParametroFormularioIva;
	}
	
	public JButton getjButtonEliminarToolBarTipoParametroFormularioIva() {
		return this.jButtonEliminarToolBarTipoParametroFormularioIva;
	}
	
	public JButton getjButtonCancelarToolBarTipoParametroFormularioIva() {
		return this.jButtonCancelarToolBarTipoParametroFormularioIva;
	}		
	
	public JButton getjButtonProcesarInformacionTipoParametroFormularioIva() {
		return this.jButtonProcesarInformacionTipoParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParametroFormularioIva)	{
		this.jButtonProcesarInformacionTipoParametroFormularioIva = jButtonProcesarInformacionTipoParametroFormularioIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesTipoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesTipoParametroFormularioIva) {
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva = jComboBoxTiposRelacionesTipoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesTipoParametroFormularioIva) {
		this.jComboBoxTiposAccionesTipoParametroFormularioIva = jComboBoxTiposAccionesTipoParametroFormularioIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioTipoParametroFormularioIva) {
		this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva = jComboBoxTiposAccionesFormularioTipoParametroFormularioIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
		
		this.tipoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Parametro Formulario Iva  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoParametroFormularioIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoParametroFormularioIva=new JButtonMe();
				this.jButtonModificarToolBarTipoParametroFormularioIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoParametroFormularioIva,this.jTtoolBarDetalleTipoParametroFormularioIva,
							"actualizar","actualizar","Actualizar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoParametroFormularioIva,this.jTtoolBarDetalleTipoParametroFormularioIva,
							"eliminar","eliminar","Eliminar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoParametroFormularioIva,this.jTtoolBarDetalleTipoParametroFormularioIva,
							"cancelar","cancelar","Cancelar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoParametroFormularioIva,this.jTtoolBarDetalleTipoParametroFormularioIva,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoParametroFormularioIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoParametroFormularioIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoParametroFormularioIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoParametroFormularioIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoParametroFormularioIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoParametroFormularioIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoParametroFormularioIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoParametroFormularioIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoParametroFormularioIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoParametroFormularioIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoParametroFormularioIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoParametroFormularioIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoParametroFormularioIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoParametroFormularioIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoParametroFormularioIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoParametroFormularioIva.add(this.jMenuItemDetalleCerrarTipoParametroFormularioIva);
		
		this.jmenuDetalleAccionesTipoParametroFormularioIva.add(this.jMenuItemActualizarTipoParametroFormularioIva);
		this.jmenuDetalleAccionesTipoParametroFormularioIva.add(this.jMenuItemEliminarTipoParametroFormularioIva);
		this.jmenuDetalleAccionesTipoParametroFormularioIva.add(this.jMenuItemCancelarTipoParametroFormularioIva);		
		
		//this.jmenuDetalleDatosTipoParametroFormularioIva.add(this.jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva);				
		this.jmenuDetalleDatosTipoParametroFormularioIva.add(this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva);				
				
		//this.jmenuDetalleAccionesTipoParametroFormularioIva.add(this.jMenuItemGuardarCambiosTipoParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoParametroFormularioIva.add(this.jmenuDetalleArchivoTipoParametroFormularioIva);		
		this.jmenuBarDetalleTipoParametroFormularioIva.add(this.jmenuDetalleAccionesTipoParametroFormularioIva);		
		this.jmenuBarDetalleTipoParametroFormularioIva.add(this.jmenuDetalleDatosTipoParametroFormularioIva);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoParametroFormularioIva.add(this.jmenuDetalleTipoParametroFormularioIva);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoParametroFormularioIva);				
	}
	
	
	public void inicializarElementosCamposTipoParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoParametroFormularioIva = new JLabelMe();
		jLabelIdTipoParametroFormularioIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoParametroFormularioIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoParametroFormularioIva.setToolTipText(TipoParametroFormularioIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoParametroFormularioIva= new GridBagLayout();

		this.jPanelidTipoParametroFormularioIva.setLayout(this.gridaBagLayoutTipoParametroFormularioIva);

		jTextFieldidTipoParametroFormularioIva = new JTextFieldMe();
		jTextFieldidTipoParametroFormularioIva.setText("Id");

		jTextFieldidTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoParametroFormularioIva = new JLabelMe();
		this.jLabelnombreTipoParametroFormularioIva.setText(""+TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoParametroFormularioIva.setToolTipText("Nombre");
		this.jLabelnombreTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoParametroFormularioIva.setToolTipText(TipoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoParametroFormularioIva = new GridBagLayout();
		this.jPanelnombreTipoParametroFormularioIva.setLayout(this.gridaBagLayoutTipoParametroFormularioIva);


		jTextAreanombreTipoParametroFormularioIva= new JTextAreaMe();
		jTextAreanombreTipoParametroFormularioIva.setEnabled(false);
		jTextAreanombreTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParametroFormularioIva.setLineWrap(true);
		jTextAreanombreTipoParametroFormularioIva.setWrapStyleWord(true);
		jTextAreanombreTipoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoParametroFormularioIva.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoParametroFormularioIva = new JScrollPane(jTextAreanombreTipoParametroFormularioIva);
		jscrollPanenombreTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonnombreTipoParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoParametroFormularioIvaBusqueda.setText("U");
		this.jButtonnombreTipoParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoParametroFormularioIvaBusqueda"));

		if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoParametroFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_sriTipoParametroFormularioIva = new JLabelMe();
		this.jLabelcodigo_sriTipoParametroFormularioIva.setText(""+TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI+" : *");
		this.jLabelcodigo_sriTipoParametroFormularioIva.setToolTipText("Codigo Sri");
		this.jLabelcodigo_sriTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sriTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sriTipoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sriTipoParametroFormularioIva.setToolTipText(TipoParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI);
		this.gridaBagLayoutTipoParametroFormularioIva = new GridBagLayout();
		this.jPanelcodigo_sriTipoParametroFormularioIva.setLayout(this.gridaBagLayoutTipoParametroFormularioIva);


		jTextFieldcodigo_sriTipoParametroFormularioIva= new JTextFieldMe();

		jTextFieldcodigo_sriTipoParametroFormularioIva.setEnabled(false);
		jTextFieldcodigo_sriTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sriTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.setText("U");
		this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sriTipoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sriTipoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sriTipoParametroFormularioIvaBusqueda"));

		if(this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sriTipoParametroFormularioIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTipoParametroFormularioIva = new TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Parametro Formulario Iva  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParametroFormularioIva= new GridBagLayout();
		

		
		String sToolTipTipoParametroFormularioIva="";
		sToolTipTipoParametroFormularioIva=TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParametroFormularioIva+="(Contabilidad.TipoParametroFormularioIva)";
		}
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParametroFormularioIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoParametroFormularioIva = new JButtonMe();
		this.jButtonModificarTipoParametroFormularioIva = new JButtonMe();
        this.jButtonActualizarTipoParametroFormularioIva = new JButtonMe();
        this.jButtonEliminarTipoParametroFormularioIva = new JButtonMe();
        this.jButtonCancelarTipoParametroFormularioIva = new JButtonMe();
        this.jButtonGuardarCambiosTipoParametroFormularioIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarTipoParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoParametroFormularioIva = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoParametroFormularioIva = new JScrollPane();
				
		
		
		this.jPanelCamposTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Parametro Formulario Iva ";
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Formulario Iva s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoParametroFormularioIva.setName("jPanelCamposTipoParametroFormularioIva"); 

		this.jPanelCamposOcultosTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoParametroFormularioIva.setName("jPanelCamposOcultosTipoParametroFormularioIva"); 

        this.jPanelAccionesTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoParametroFormularioIva.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoParametroFormularioIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoParametroFormularioIva.setText("Nuevo");
		this.jButtonModificarTipoParametroFormularioIva.setText("Editar");
        this.jButtonActualizarTipoParametroFormularioIva.setText("Actualizar");
        this.jButtonEliminarTipoParametroFormularioIva.setText("Eliminar");
        this.jButtonCancelarTipoParametroFormularioIva.setText("Cancelar");
        this.jButtonGuardarCambiosTipoParametroFormularioIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarTipoParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParametroFormularioIva,"nuevo_button","Nuevo",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoParametroFormularioIva,"modificar_button","Editar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoParametroFormularioIva,"actualizar_button","Actualizar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoParametroFormularioIva,"eliminar_button","Eliminar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoParametroFormularioIva,"cancelar_button","Cancelar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoParametroFormularioIva,"guardarcambios_button","Guardar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParametroFormularioIva,"cerrar_button","Salir",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoParametroFormularioIva.setToolTipText("Nuevo"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoParametroFormularioIva.setToolTipText("Editar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoParametroFormularioIva.setToolTipText("Actualizar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoParametroFormularioIva.setToolTipText("Eliminar)"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoParametroFormularioIva.setToolTipText("Cancelar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoParametroFormularioIva.setToolTipText("Guardar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.setToolTipText("Guardar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParametroFormularioIva.setToolTipText("Salir"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParametroFormularioIva";
		inputMap = this.jButtonNuevoTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParametroFormularioIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoParametroFormularioIva";
		inputMap = this.jButtonActualizarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoParametroFormularioIva"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoParametroFormularioIva";
		inputMap = this.jButtonEliminarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoParametroFormularioIva"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoParametroFormularioIva";
		inputMap = this.jButtonCancelarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoParametroFormularioIva"));
		
		//CERRAR		
		sMapKey = "CerrarTipoParametroFormularioIva";
		inputMap = this.jButtonCerrarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParametroFormularioIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoParametroFormularioIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoParametroFormularioIva.setToolTipText("Nuevo TipoParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva.setToolTipText("Sin Cerrar Ventana TipoParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesTipoParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoParametroFormularioIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoParametroFormularioIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoParametroFormularioIva=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoParametroFormularioIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoParametroFormularioIva = new GridBagLayout();
		
		this.jPanelCamposTipoParametroFormularioIva.setLayout(gridaBagLayoutCamposTipoParametroFormularioIva);
		this.jPanelCamposOcultosTipoParametroFormularioIva.setLayout(gridaBagLayoutCamposOcultosTipoParametroFormularioIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoParametroFormularioIva.add(jLabelIdTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);



	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoParametroFormularioIva.add(jTextFieldidTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);


	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoParametroFormularioIva.add(jLabelnombreTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoParametroFormularioIva.add(jButtonnombreTipoParametroFormularioIvaBusqueda, this.gridBagConstraintsTipoParametroFormularioIva);
	}

	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoParametroFormularioIva.add(jscrollPanenombreTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);


	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sriTipoParametroFormularioIva.add(jLabelcodigo_sriTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sriTipoParametroFormularioIva.add(jButtoncodigo_sriTipoParametroFormularioIvaBusqueda, this.gridBagConstraintsTipoParametroFormularioIva);
	}

	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sriTipoParametroFormularioIva.add(jTextFieldcodigo_sriTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = iYPanelCamposTipoParametroFormularioIva;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = iXPanelCamposTipoParametroFormularioIva++;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParametroFormularioIva.add(this.jPanelidTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);



	if(iXPanelCamposTipoParametroFormularioIva % 1==0) {
		iXPanelCamposTipoParametroFormularioIva=0;
		iYPanelCamposTipoParametroFormularioIva++;
	}
	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = iYPanelCamposTipoParametroFormularioIva;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = iXPanelCamposTipoParametroFormularioIva++;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParametroFormularioIva.add(this.jPanelnombreTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);



	if(iXPanelCamposTipoParametroFormularioIva % 1==0) {
		iXPanelCamposTipoParametroFormularioIva=0;
		iYPanelCamposTipoParametroFormularioIva++;
	}
	this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParametroFormularioIva.gridy = iYPanelCamposTipoParametroFormularioIva;
	this.gridBagConstraintsTipoParametroFormularioIva.gridx = iXPanelCamposTipoParametroFormularioIva++;
	this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParametroFormularioIva.add(this.jPanelcodigo_sriTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);



	if(iXPanelCamposTipoParametroFormularioIva % 1==0) {
		iXPanelCamposTipoParametroFormularioIva=0;
		iYPanelCamposTipoParametroFormularioIva++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesTipoParametroFormularioIva.setLayout(gridaBagLayoutAccionesTipoParametroFormularioIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioTipoParametroFormularioIva.setLayout(gridaBagLayoutAccionesFormularioTipoParametroFormularioIva);
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParametroFormularioIva.add(this.jComboBoxTiposAccionesFormularioTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);

		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParametroFormularioIva.add(this.jCheckBoxPostAccionNuevoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParametroFormularioIva.add(this.jCheckBoxPostAccionSinCerrarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParametroFormularioIva.add(this.jCheckBoxPostAccionSinMensajeTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoParametroFormularioIva.add(this.jButtonModificarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);							

		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoParametroFormularioIva.add(this.jButtonEliminarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
			
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParametroFormularioIva.add(this.jButtonActualizarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);


		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParametroFormularioIva.add(this.jButtonGuardarCambiosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);	
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoParametroFormularioIva.add(this.jButtonCancelarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParametroFormularioIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsTipoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =0;
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoParametroFormularioIva = new TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Parametro Formulario Iva  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Parametro Formulario Iva  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Parametro Formulario Iva  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoParametroFormularioIvaModel tipoparametroformularioivaModel=new TipoParametroFormularioIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoParametroFormularioIvaModel.TipoParametroFormularioIvaFocusTraversalPolicy tipoparametroformularioivaFocusTraversalPolicy = tipoparametroformularioivaModel.new TipoParametroFormularioIvaFocusTraversalPolicy(this);
			
			//tipoparametroformularioivaFocusTraversalPolicy.settipoparametroformularioivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoparametroformularioivaModel);
			
			
			this.jContentPaneDetalleTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoParametroFormularioIva = new GridBagLayout();	
			this.jContentPaneDetalleTipoParametroFormularioIva.setLayout(gridaBagLayoutDetalleTipoParametroFormularioIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParametroFormularioIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
					
				
				this.jContentPaneDetalleTipoParametroFormularioIva.add(jTtoolBarDetalleTipoParametroFormularioIva, gridBagConstraintsTipoParametroFormularioIva);								
				
}
			
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva=   new JScrollPane(jContentPaneDetalleTipoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
	        
			this.jContentPaneDetalleTipoParametroFormularioIva.add(jPanelCamposTipoParametroFormularioIva, gridBagConstraintsTipoParametroFormularioIva);
			
			
			
			
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
						&& tipoparametroformularioivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(this.puedeCargarPorParteParametroFormularioIva,false,-1);
					
					if(this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoParametroFormularioIva= new GridBagConstraints();
						this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
						this.jContentPaneDetalleTipoParametroFormularioIva.add(this.jTabbedPaneRelacionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoParametroFormularioIva.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoParametroFormularioIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
					this.gridBagConstraintsTipoParametroFormularioIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
					
				
					this.jContentPaneDetalleTipoParametroFormularioIva.add(jPanelCamposOcultosTipoParametroFormularioIva, gridBagConstraintsTipoParametroFormularioIva);
				
					this.jPanelCamposOcultosTipoParametroFormularioIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
	        this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoParametroFormularioIva.add(this.jPanelAccionesFormularioTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);							
			
			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
	        this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoParametroFormularioIva.add(this.jPanelAccionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoParametroFormularioIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva=   new JScrollPane(this.jPanelCamposTipoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoParametroFormularioIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			
			
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
			
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoParametroFormularioIva;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoParametroFormularioIva;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		this.parametroformularioivaSessionBean.setConGuardarRelaciones(false);
		this.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);

		this.parametroformularioivaBeanSwingJInternalFrame=null;//new ParametroFormularioIvaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroformularioivaBeanSwingJInternalFramePopup=new ParametroFormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroformularioivaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {

				ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);

				this.parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroformularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroformularioivaBeanSwingJInternalFrame.setparametroformularioivaSessionBean(this.parametroformularioivaSessionBean);

				//this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
				//this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
				//this.jContentPaneDetalleTipoParametroFormularioIva.add(this.parametroformularioivaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoParametroFormularioIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoParametroFormularioIva.add("Parametro Formulario Ivas",this.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoParametroFormularioIva.setComponentAt(iIndexTab,this.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
				this.parametroformularioivaBeanSwingJInternalFrame=null;//new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroFormularioIva) {
					this.jTabbedPaneRelacionesTipoParametroFormularioIva.add("Parametro Formulario Ivas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroFormularioIvaBeanSwingJInternalFrame(List<TipoParametroFormularioIva> tipoparametroformularioivas,TipoParametroFormularioIva tipoparametroformularioiva,ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroformularioivaBeanSwingJInternalFrame.getParametroFormularioIvaLogic().setConnexion(this.tipoparametroformularioivaLogic.getConnexion());

					parametroformularioivaBeanSwingJInternalFrame.settipoparametroformularioivasForeignKey(tipoparametroformularioivas);
					parametroformularioivaBeanSwingJInternalFrame.settipoparametroformularioivaForeignKey(tipoparametroformularioiva);
					parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionTipoParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setlidTipoParametroFormularioIvaActual(tipoparametroformularioiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroformularioivaBeanSwingJInternalFrame.cargarCombosForeignKeyParametroFormularioIva(parametroformularioivaBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroformularioivaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.setid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIva(tipoparametroformularioiva.getId());

					if(!this.conCargarFormDetalle) {
						parametroformularioivaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroformularioivaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoParametroFormularioIvaForeignKey(tipoparametroformularioiva,1,false,true,true);
					parametroformularioivaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroformularioivaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoParametroFormularioIva");
					parametroformularioivaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoParametroFormularioIva");
					parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroFormularioIva("n",parametroformularioivaBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroformularioivaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroformularioivaBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroformularioivaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("relacionado");
					} else {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("no_relacionado");
					}

					parametroformularioivaBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroFormularioIva().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
