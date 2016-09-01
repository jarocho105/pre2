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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.FormatoConstantesFunciones;

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
public class FormatoDetalleFormJInternalFrame extends FormatoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormato;
	
	protected JMenuBar jmenuBarDetalleFormato;
	
	protected JMenu jmenuDetalleFormato;
	protected JMenu jmenuDetalleArchivoFormato;
	protected JMenu jmenuDetalleAccionesFormato;
	protected JMenu jmenuDetalleDatosFormato;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormato;	
	protected GridBagConstraints gridBagConstraintsFormato;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormatoBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormato;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoFormatoBeanSwingJInternalFrame tipoformatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformato="";
	
	public FormatoSessionBean formatoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoFormatoSessionBean tipoformatoSessionBean;	
	
	public FormatoLogic formatoLogic;
	
	public JScrollPane jScrollPanelDatosFormato;
	public JScrollPane jScrollPanelDatosEdicionFormato;
	public JScrollPane jScrollPanelDatosGeneralFormato;
	
	protected JPanel jPanelCamposFormato;    
	protected JPanel jPanelCamposOcultosFormato;    	
	protected JPanel jPanelAccionesFormato;
	protected JPanel jPanelAccionesFormularioFormato;
    
	
	
	protected Integer iXPanelCamposFormato=0;
	protected Integer iYPanelCamposFormato=0;
	
	protected Integer iXPanelCamposOcultosFormato=0;
	protected Integer iYPanelCamposOcultosFormato=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormato;
	public JButton jButtonModificarFormato;
	public JButton jButtonActualizarFormato;
    public JButton jButtonEliminarFormato;
	public JButton jButtonCancelarFormato;
    public JButton jButtonGuardarCambiosFormato;
	public JButton jButtonGuardarCambiosTablaFormato;
	protected JButton jButtonCerrarFormato;
	
	
	protected JButton jButtonProcesarInformacionFormato;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormato;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormato;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormato;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormato;
	protected JButton jButtonModificarToolBarFormato;
	protected JButton jButtonActualizarToolBarFormato;
    protected JButton jButtonEliminarToolBarFormato;
	protected JButton jButtonCancelarToolBarFormato;
    protected JButton jButtonGuardarCambiosToolBarFormato;
	protected JButton jButtonGuardarCambiosTablaToolBarFormato;
	protected JButton jButtonMostrarOcultarTablaToolBarFormato;
	protected JButton jButtonCerrarToolBarFormato;
	
	protected JButton jButtonProcesarInformacionToolBarFormato;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormato;
	protected JMenuItem jMenuItemModificarFormato;
	protected JMenuItem jMenuItemActualizarFormato;
    protected JMenuItem jMenuItemEliminarFormato;
	protected JMenuItem jMenuItemCancelarFormato;
    protected JMenuItem jMenuItemGuardarCambiosFormato;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormato;
	protected JMenuItem jMenuItemCerrarFormato;
	protected JMenuItem jMenuItemDetalleCerrarFormato;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormato;
	
	protected JMenuItem jMenuItemProcesarInformacionFormato;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormato;
	protected JMenuItem jMenuItemMostrarOcultarFormato;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormato;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormato;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormato;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormato;
	public JLabel jLabelIdFormato;
	public JLabel jLabelidFormato;
	public JButton jButtonidFormatoBusqueda= new JButtonMe();

	public JPanel jPanelnombreFormato;
	public JLabel jLabelnombreFormato;
	public JTextField jTextFieldnombreFormato;
	public JButton jButtonnombreFormatoBusqueda= new JButtonMe();

	public JPanel jPanelubicacionFormato;
	public JLabel jLabelubicacionFormato;
	public JTextArea jTextAreaubicacionFormato;
	public JScrollPane jscrollPaneubicacionFormato;
	public JButton jButtonubicacionFormatoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormato;
	public JLabel jLabelid_empresaFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormato;
	public JButton jButtonid_empresaFormato= new JButtonMe();
	public JButton jButtonid_empresaFormatoUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormatoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloFormato;
	public JLabel jLabelid_moduloFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFormato;
	public JButton jButtonid_moduloFormato= new JButtonMe();
	public JButton jButtonid_moduloFormatoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFormatoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoFormato;
	public JLabel jLabelid_tipo_movimientoFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFormato;
	public JButton jButtonid_tipo_movimientoFormato= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFormatoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFormatoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_formatoFormato;
	public JLabel jLabelid_tipo_formatoFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_formatoFormato;
	public JButton jButtonid_tipo_formatoFormato= new JButtonMe();
	public JButton jButtonid_tipo_formatoFormatoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_formatoFormatoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormato;
	
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
	
	public FormatoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormato=new JPanel();
				this.jPanelAccionesFormularioFormato=new JPanel();
				this.jmenuBarDetalleFormato=new JMenuBar();
				this.jTtoolBarDetalleFormato=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormatoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormato() {
		return this.jButtonActualizarToolBarFormato;
	}
	
	public JButton getjButtonEliminarToolBarFormato() {
		return this.jButtonEliminarToolBarFormato;
	}
	
	public JButton getjButtonCancelarToolBarFormato() {
		return this.jButtonCancelarToolBarFormato;
	}		
	
	public JButton getjButtonProcesarInformacionFormato() {
		return this.jButtonProcesarInformacionFormato;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormato)	{
		this.jButtonProcesarInformacionFormato = jButtonProcesarInformacionFormato;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormato() {
		return this.jComboBoxTiposAccionesFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormato(
			JComboBox jComboBoxTiposRelacionesFormato) {
		this.jComboBoxTiposRelacionesFormato = jComboBoxTiposRelacionesFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormato(
			JComboBox jComboBoxTiposAccionesFormato) {
		this.jComboBoxTiposAccionesFormato = jComboBoxTiposAccionesFormato;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormato() {
		return this.jComboBoxTiposAccionesFormularioFormato;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormato(
			JComboBox jComboBoxTiposAccionesFormularioFormato) {
		this.jComboBoxTiposAccionesFormularioFormato = jComboBoxTiposAccionesFormularioFormato;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formatoSessionBean=new FormatoSessionBean();
		
		this.formatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
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
	
		FormatoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormato= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormato=new JButtonMe();
				this.jButtonModificarToolBarFormato=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormato,this.jTtoolBarDetalleFormato,
							"actualizar","actualizar","Actualizar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormato,this.jTtoolBarDetalleFormato,
							"eliminar","eliminar","Eliminar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormato,this.jTtoolBarDetalleFormato,
							"cancelar","cancelar","Cancelar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormato,this.jTtoolBarDetalleFormato,
							"guardarcambios","guardarcambios","Guardar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormato,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormato=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormato=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormato=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormato=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormato=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormato= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormato.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormato,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormato= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormato.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormato,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormato= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormato.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormato,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormato= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormato.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormato,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormato= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormato.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormato,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormato= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormato.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormato,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormato,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormato,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormato, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormato.add(this.jMenuItemDetalleCerrarFormato);
		
		this.jmenuDetalleAccionesFormato.add(this.jMenuItemActualizarFormato);
		this.jmenuDetalleAccionesFormato.add(this.jMenuItemEliminarFormato);
		this.jmenuDetalleAccionesFormato.add(this.jMenuItemCancelarFormato);		
		
		//this.jmenuDetalleDatosFormato.add(this.jMenuItemDetalleAbrirOrderByFormato);				
		this.jmenuDetalleDatosFormato.add(this.jMenuItemDetalleMostarOcultarFormato);				
				
		//this.jmenuDetalleAccionesFormato.add(this.jMenuItemGuardarCambiosFormato);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormato.add(this.jmenuDetalleArchivoFormato);		
		this.jmenuBarDetalleFormato.add(this.jmenuDetalleAccionesFormato);		
		this.jmenuBarDetalleFormato.add(this.jmenuDetalleDatosFormato);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormato);				
	}
	
	
	public void inicializarElementosCamposFormato() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormato = new JLabelMe();
		jLabelIdFormato.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormato = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormato.setToolTipText(FormatoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormato= new GridBagLayout();

		this.jPanelidFormato.setLayout(this.gridaBagLayoutFormato);

		jLabelidFormato = new JLabel();
		jLabelidFormato.setText("Id");

		jLabelidFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreFormato = new JLabelMe();
		this.jLabelnombreFormato.setText(""+FormatoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFormato.setToolTipText("Nombre");
		this.jLabelnombreFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFormato.setToolTipText(FormatoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFormato = new GridBagLayout();
		this.jPanelnombreFormato.setLayout(this.gridaBagLayoutFormato);


		jTextFieldnombreFormato= new JTextFieldMe();

		jTextFieldnombreFormato.setEnabled(false);
		jTextFieldnombreFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreFormatoBusqueda= new JButtonMe();
		this.jButtonnombreFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFormatoBusqueda.setText("U");
		this.jButtonnombreFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFormatoBusqueda"));

		if(this.formatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFormatoBusqueda.setVisible(false);		}


					
		this.jLabelubicacionFormato = new JLabelMe();
		this.jLabelubicacionFormato.setText(""+FormatoConstantesFunciones.LABEL_UBICACION+" : *");
		this.jLabelubicacionFormato.setToolTipText("Ubicacion");
		this.jLabelubicacionFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelubicacionFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelubicacionFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelubicacionFormato.setToolTipText(FormatoConstantesFunciones.LABEL_UBICACION);
		this.gridaBagLayoutFormato = new GridBagLayout();
		this.jPanelubicacionFormato.setLayout(this.gridaBagLayoutFormato);


		jTextAreaubicacionFormato= new JTextAreaMe();
		jTextAreaubicacionFormato.setEnabled(false);
		jTextAreaubicacionFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionFormato.setLineWrap(true);
		jTextAreaubicacionFormato.setWrapStyleWord(true);
		jTextAreaubicacionFormato.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaubicacionFormato.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaubicacionFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneubicacionFormato = new JScrollPane(jTextAreaubicacionFormato);
		jscrollPaneubicacionFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonubicacionFormatoBusqueda= new JButtonMe();
		this.jButtonubicacionFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonubicacionFormatoBusqueda.setText("U");
		this.jButtonubicacionFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonubicacionFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonubicacionFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaubicacionFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaubicacionFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ubicacionFormatoBusqueda"));

		if(this.formatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonubicacionFormatoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormato() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormato = new JLabelMe();
		this.jLabelid_empresaFormato.setText(""+FormatoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormato.setToolTipText("Empresa");
		this.jLabelid_empresaFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormato.setToolTipText(FormatoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormato = new GridBagLayout();
		this.jPanelid_empresaFormato.setLayout(this.gridaBagLayoutFormato);


		jComboBoxid_empresaFormato= new JComboBoxMe();
		jComboBoxid_empresaFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormato.setEnabled(false);

		this.jButtonid_empresaFormato= new JButtonMe();
		this.jButtonid_empresaFormato.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormato.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormato.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormato.setText("Buscar");
		this.jButtonid_empresaFormato.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormato.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormato,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormato"));

		this.jButtonid_empresaFormatoBusqueda= new JButtonMe();
		this.jButtonid_empresaFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoBusqueda.setText("U");
		this.jButtonid_empresaFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoBusqueda"));

		if(this.formatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormatoBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormatoUpdate= new JButtonMe();
		this.jButtonid_empresaFormatoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoUpdate.setText("U");
		this.jButtonid_empresaFormatoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormatoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoUpdate"));



					
		this.jLabelid_moduloFormato = new JLabelMe();
		this.jLabelid_moduloFormato.setText(""+FormatoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloFormato.setToolTipText("Modulo");
		this.jLabelid_moduloFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloFormato.setToolTipText(FormatoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutFormato = new GridBagLayout();
		this.jPanelid_moduloFormato.setLayout(this.gridaBagLayoutFormato);


		jComboBoxid_moduloFormato= new JComboBoxMe();
		jComboBoxid_moduloFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloFormato= new JButtonMe();
		this.jButtonid_moduloFormato.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFormato.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFormato.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFormato.setText("Buscar");
		this.jButtonid_moduloFormato.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloFormato.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFormato,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFormato"));

		this.jButtonid_moduloFormatoBusqueda= new JButtonMe();
		this.jButtonid_moduloFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFormatoBusqueda.setText("U");
		this.jButtonid_moduloFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFormatoBusqueda"));

		if(this.formatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloFormatoBusqueda.setVisible(false);		}

		this.jButtonid_moduloFormatoUpdate= new JButtonMe();
		this.jButtonid_moduloFormatoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormatoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormatoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFormatoUpdate.setText("U");
		this.jButtonid_moduloFormatoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloFormatoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFormatoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFormatoUpdate"));



					
		this.jLabelid_tipo_movimientoFormato = new JLabelMe();
		this.jLabelid_tipo_movimientoFormato.setText(""+FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoFormato.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoFormato.setToolTipText(FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutFormato = new GridBagLayout();
		this.jPanelid_tipo_movimientoFormato.setLayout(this.gridaBagLayoutFormato);


		jComboBoxid_tipo_movimientoFormato= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoFormato= new JButtonMe();
		this.jButtonid_tipo_movimientoFormato.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFormato.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFormato.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFormato.setText("Buscar");
		this.jButtonid_tipo_movimientoFormato.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoFormato.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFormato,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFormato"));

		this.jButtonid_tipo_movimientoFormatoBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoFormatoBusqueda.setText("U");
		this.jButtonid_tipo_movimientoFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFormatoBusqueda"));

		if(this.formatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoFormatoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoFormatoUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoFormatoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFormatoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFormatoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoFormatoUpdate.setText("U");
		this.jButtonid_tipo_movimientoFormatoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoFormatoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFormatoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFormatoUpdate"));



					
		this.jLabelid_tipo_formatoFormato = new JLabelMe();
		this.jLabelid_tipo_formatoFormato.setText(""+FormatoConstantesFunciones.LABEL_IDTIPOFORMATO+" : *");
		this.jLabelid_tipo_formatoFormato.setToolTipText("Tipo Formato");
		this.jLabelid_tipo_formatoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_formatoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_formatoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_formatoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_formatoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_formatoFormato.setToolTipText(FormatoConstantesFunciones.LABEL_IDTIPOFORMATO);
		this.gridaBagLayoutFormato = new GridBagLayout();
		this.jPanelid_tipo_formatoFormato.setLayout(this.gridaBagLayoutFormato);


		jComboBoxid_tipo_formatoFormato= new JComboBoxMe();
		jComboBoxid_tipo_formatoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formatoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formatoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_formatoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_formatoFormato= new JButtonMe();
		this.jButtonid_tipo_formatoFormato.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_formatoFormato.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_formatoFormato.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_formatoFormato.setText("Buscar");
		this.jButtonid_tipo_formatoFormato.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_formatoFormato.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_formatoFormato,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_formatoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_formatoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_formatoFormato"));

		this.jButtonid_tipo_formatoFormatoBusqueda= new JButtonMe();
		this.jButtonid_tipo_formatoFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formatoFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formatoFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_formatoFormatoBusqueda.setText("U");
		this.jButtonid_tipo_formatoFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_formatoFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_formatoFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_formatoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_formatoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_formatoFormatoBusqueda"));

		if(this.formatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_formatoFormatoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_formatoFormatoUpdate= new JButtonMe();
		this.jButtonid_tipo_formatoFormatoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formatoFormatoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formatoFormatoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_formatoFormatoUpdate.setText("U");
		this.jButtonid_tipo_formatoFormatoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_formatoFormatoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_formatoFormatoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_formatoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_formatoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_formatoFormatoUpdate"));



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
		//this.jInternalFrameDetalleFormato = new FormatoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formato DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormato= new GridBagLayout();
		

		
		String sToolTipFormato="";
		sToolTipFormato=FormatoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormato+="(Contabilidad.Formato)";
		}
		
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormato+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormato = new JButtonMe();
		this.jButtonModificarFormato = new JButtonMe();
        this.jButtonActualizarFormato = new JButtonMe();
        this.jButtonEliminarFormato = new JButtonMe();
        this.jButtonCancelarFormato = new JButtonMe();
        this.jButtonGuardarCambiosFormato = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormato = new JButtonMe();
		this.jButtonCerrarFormato = new JButtonMe();
		
		this.jScrollPanelDatosFormato = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormato = new JScrollPane();
		this.jScrollPanelDatosGeneralFormato = new JScrollPane();
				
		
		
		this.jPanelCamposFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formato";
		
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoes" + this.sPath));
		} else {
			this.jScrollPanelDatosFormato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormato.setName("jPanelCamposFormato"); 

		this.jPanelCamposOcultosFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormato.setName("jPanelCamposOcultosFormato"); 

        this.jPanelAccionesFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormato.setToolTipText("Acciones");
        this.jPanelAccionesFormato.setName("Acciones"); 

		this.jPanelAccionesFormularioFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormato.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormato.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormato, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormato, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormato, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormato.setText("Nuevo");
		this.jButtonModificarFormato.setText("Editar");
        this.jButtonActualizarFormato.setText("Actualizar");
        this.jButtonEliminarFormato.setText("Eliminar");
        this.jButtonCancelarFormato.setText("Cancelar");
        this.jButtonGuardarCambiosFormato.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormato.setText("Guardar");
		this.jButtonCerrarFormato.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormato,"nuevo_button","Nuevo",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormato,"modificar_button","Editar",this.formatoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormato,"actualizar_button","Actualizar",this.formatoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormato,"eliminar_button","Eliminar",this.formatoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormato,"cancelar_button","Cancelar",this.formatoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormato,"guardarcambios_button","Guardar",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormato,"guardarcambiostabla_button","Guardar",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormato,"cerrar_button","Salir",this.formatoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormato.setToolTipText("Nuevo"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormato.setToolTipText("Editar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormato.setToolTipText("Actualizar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormato.setToolTipText("Eliminar)"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormato.setToolTipText("Cancelar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormato.setToolTipText("Guardar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormato.setToolTipText("Guardar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormato.setToolTipText("Salir"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormato";
		inputMap = this.jButtonNuevoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormato"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormato";
		inputMap = this.jButtonActualizarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormato"));
		
		//ELIMINAR
		sMapKey = "EliminarFormato";
		inputMap = this.jButtonEliminarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormato"));
		
		//CANCELAR	
		sMapKey = "CancelarFormato";
		inputMap = this.jButtonCancelarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormato"));
		
		//CERRAR		
		sMapKey = "CerrarFormato";
		inputMap = this.jButtonCerrarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormato"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormato";
		inputMap = this.jButtonGuardarCambiosTablaFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormato"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormato = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormato.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormato.setToolTipText("Nuevo Formato");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormato = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormato.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormato.setToolTipText("Sin Cerrar Ventana Formato");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormato, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormato = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormato.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormato.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormato, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormato.setText("Accion");
		this.jComboBoxTiposAccionesFormato.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormato.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormato.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormato = new JLabelMe();
		
		this.jLabelAccionesFormato.setText("Acciones");		
		this.jLabelAccionesFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormato();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormato();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormato=new JTabbedPane();
		this.jTabbedPaneRelacionesFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormato.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormato.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormato.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormato, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormato = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormato = new GridBagLayout();
		
		this.jPanelCamposFormato.setLayout(gridaBagLayoutCamposFormato);
		this.jPanelCamposOcultosFormato.setLayout(gridaBagLayoutCamposOcultosFormato);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 0;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormato.add(jLabelIdFormato, this.gridBagConstraintsFormato);



	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 1;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormato.add(jLabelidFormato, this.gridBagConstraintsFormato);


	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 0;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormato.add(jLabelid_empresaFormato, this.gridBagConstraintsFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 2;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormato.add(jButtonid_empresaFormatoBusqueda, this.gridBagConstraintsFormato);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 3;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormato.add(jButtonid_empresaFormatoUpdate, this.gridBagConstraintsFormato);
	}

	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 1;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormato.add(jComboBoxid_empresaFormato, this.gridBagConstraintsFormato);


	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 0;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloFormato.add(jLabelid_moduloFormato, this.gridBagConstraintsFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 2;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFormato.add(jButtonid_moduloFormatoBusqueda, this.gridBagConstraintsFormato);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 3;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFormato.add(jButtonid_moduloFormatoUpdate, this.gridBagConstraintsFormato);
	}

	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 1;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloFormato.add(jComboBoxid_moduloFormato, this.gridBagConstraintsFormato);


	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 0;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFormato.add(jLabelnombreFormato, this.gridBagConstraintsFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 2;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFormato.add(jButtonnombreFormatoBusqueda, this.gridBagConstraintsFormato);
	}

	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 1;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFormato.add(jTextFieldnombreFormato, this.gridBagConstraintsFormato);


	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 0;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoFormato.add(jLabelid_tipo_movimientoFormato, this.gridBagConstraintsFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 2;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoFormato.add(jButtonid_tipo_movimientoFormatoBusqueda, this.gridBagConstraintsFormato);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 3;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoFormato.add(jButtonid_tipo_movimientoFormatoUpdate, this.gridBagConstraintsFormato);
	}

	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 1;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoFormato.add(jComboBoxid_tipo_movimientoFormato, this.gridBagConstraintsFormato);


	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 0;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_formatoFormato.add(jLabelid_tipo_formatoFormato, this.gridBagConstraintsFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 2;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_formatoFormato.add(jButtonid_tipo_formatoFormatoBusqueda, this.gridBagConstraintsFormato);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 3;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_formatoFormato.add(jButtonid_tipo_formatoFormatoUpdate, this.gridBagConstraintsFormato);
	}

	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 1;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_formatoFormato.add(jComboBoxid_tipo_formatoFormato, this.gridBagConstraintsFormato);


	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 0;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelubicacionFormato.add(jLabelubicacionFormato, this.gridBagConstraintsFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 2;
		this.gridBagConstraintsFormato.ipadx = 0;
		this.gridBagConstraintsFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelubicacionFormato.add(jButtonubicacionFormatoBusqueda, this.gridBagConstraintsFormato);
	}

	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormato.gridy = 0;
	this.gridBagConstraintsFormato.gridx = 1;
	this.gridBagConstraintsFormato.ipadx = 0;
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelubicacionFormato.add(jscrollPaneubicacionFormato, this.gridBagConstraintsFormato);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormato.gridy = iYPanelCamposFormato;
	this.gridBagConstraintsFormato.gridx = iXPanelCamposFormato++;
	this.gridBagConstraintsFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormato.add(this.jPanelidFormato, this.gridBagConstraintsFormato);



	if(iXPanelCamposFormato % 1==0) {
		iXPanelCamposFormato=0;
		iYPanelCamposFormato++;
	}
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormato.gridy = iYPanelCamposFormato;
	this.gridBagConstraintsFormato.gridx = iXPanelCamposFormato++;
	this.gridBagConstraintsFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormato.add(this.jPanelid_moduloFormato, this.gridBagConstraintsFormato);



	if(iXPanelCamposFormato % 1==0) {
		iXPanelCamposFormato=0;
		iYPanelCamposFormato++;
	}
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormato.gridy = iYPanelCamposFormato;
	this.gridBagConstraintsFormato.gridx = iXPanelCamposFormato++;
	this.gridBagConstraintsFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormato.add(this.jPanelnombreFormato, this.gridBagConstraintsFormato);



	if(iXPanelCamposFormato % 1==0) {
		iXPanelCamposFormato=0;
		iYPanelCamposFormato++;
	}
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormato.gridy = iYPanelCamposFormato;
	this.gridBagConstraintsFormato.gridx = iXPanelCamposFormato++;
	this.gridBagConstraintsFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormato.add(this.jPanelid_tipo_movimientoFormato, this.gridBagConstraintsFormato);



	if(iXPanelCamposFormato % 1==0) {
		iXPanelCamposFormato=0;
		iYPanelCamposFormato++;
	}
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormato.gridy = iYPanelCamposFormato;
	this.gridBagConstraintsFormato.gridx = iXPanelCamposFormato++;
	this.gridBagConstraintsFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormato.add(this.jPanelid_tipo_formatoFormato, this.gridBagConstraintsFormato);



	if(iXPanelCamposFormato % 1==0) {
		iXPanelCamposFormato=0;
		iYPanelCamposFormato++;
	}
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormato.gridy = iYPanelCamposFormato;
	this.gridBagConstraintsFormato.gridx = iXPanelCamposFormato++;
	this.gridBagConstraintsFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormato.add(this.jPanelubicacionFormato, this.gridBagConstraintsFormato);



	if(iXPanelCamposFormato % 1==0) {
		iXPanelCamposFormato=0;
		iYPanelCamposFormato++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormato = new GridBagConstraints();
	this.gridBagConstraintsFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormato.gridy = iYPanelCamposOcultosFormato;
	this.gridBagConstraintsFormato.gridx = iXPanelCamposOcultosFormato++;
	this.gridBagConstraintsFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormato.add(this.jPanelid_empresaFormato, this.gridBagConstraintsFormato);



	if(iXPanelCamposOcultosFormato % 1==0) {
		iXPanelCamposOcultosFormato=0;
		iYPanelCamposOcultosFormato++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormato= new GridBagLayout();
		this.jPanelAccionesFormato.setLayout(gridaBagLayoutAccionesFormato);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormato= new GridBagLayout();
		this.jPanelAccionesFormularioFormato.setLayout(gridaBagLayoutAccionesFormularioFormato);
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormato.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormato.add(this.jComboBoxTiposAccionesFormularioFormato, this.gridBagConstraintsFormato);

		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormato.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormato.add(this.jCheckBoxPostAccionNuevoFormato, this.gridBagConstraintsFormato);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formatoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormato.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormato.add(this.jCheckBoxPostAccionSinCerrarFormato, this.gridBagConstraintsFormato);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formatoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formatoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormato.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormato.add(this.jCheckBoxPostAccionSinMensajeFormato, this.gridBagConstraintsFormato);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormato.add(this.jButtonModificarFormato, this.gridBagConstraintsFormato);							

		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormato.add(this.jButtonEliminarFormato, this.gridBagConstraintsFormato);
		
			
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = 0;		
		this.gridBagConstraintsFormato.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormato.add(this.jButtonActualizarFormato, this.gridBagConstraintsFormato);


		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = 0;		
		this.gridBagConstraintsFormato.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormato.add(this.jButtonGuardarCambiosFormato, this.gridBagConstraintsFormato);	
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = 0;		
		this.gridBagConstraintsFormato.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormato.add(this.jButtonCancelarFormato, this.gridBagConstraintsFormato);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormato = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormato);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormato = new GridBagConstraints();						
			this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormato.gridx = 0;		
			//this.gridBagConstraintsFormato.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormato.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormato.gridx =0;
		this.gridBagConstraintsFormato.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormato.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormato, this.gridBagConstraintsFormato);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormatoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormato = new FormatoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formato DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formato DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormatoModel formatoModel=new FormatoModel(this);
			
			//SI USARA CLASE INTERNA
			//FormatoModel.FormatoFocusTraversalPolicy formatoFocusTraversalPolicy = formatoModel.new FormatoFocusTraversalPolicy(this);
			
			//formatoFocusTraversalPolicy.setformatoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formatoModel);
			
			
			this.jContentPaneDetalleFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormato = new GridBagLayout();	
			this.jContentPaneDetalleFormato.setLayout(gridaBagLayoutDetalleFormato);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormato = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormato = new GridBagConstraints();
				this.gridBagConstraintsFormato.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormato.gridx = 0;
					
				
				this.jContentPaneDetalleFormato.add(jTtoolBarDetalleFormato, gridBagConstraintsFormato);								
				
}
			
			this.jScrollPanelDatosEdicionFormato=   new JScrollPane(jContentPaneDetalleFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormato=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormato.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormato.gridx = 0;
	        
			this.jContentPaneDetalleFormato.add(jPanelCamposFormato, gridBagConstraintsFormato);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& formatoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.formatoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormato= new GridBagConstraints();
						this.gridBagConstraintsFormato.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormato.gridx = 0;
						this.jContentPaneDetalleFormato.add(this.jTabbedPaneRelacionesFormato, this.gridBagConstraintsFormato);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormato.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormato.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormato = new GridBagConstraints();
					this.gridBagConstraintsFormato.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormato.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormato.gridx = 0;
					
				
					this.jContentPaneDetalleFormato.add(jPanelCamposOcultosFormato, gridBagConstraintsFormato);
				
					this.jPanelCamposOcultosFormato.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFormato.gridx = 0;
	        this.gridBagConstraintsFormato.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormato.add(this.jPanelAccionesFormularioFormato, this.gridBagConstraintsFormato);							
			
			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
	        this.gridBagConstraintsFormato.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFormato.gridx = 0;
	        
			
			this.jContentPaneDetalleFormato.add(this.jPanelAccionesFormato, this.gridBagConstraintsFormato);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormato);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormato=   new JScrollPane(this.jPanelCamposFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormato.gridx = 0;
			this.gridBagConstraintsFormato.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormato.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormato, this.gridBagConstraintsFormato);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormato.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormato, this.gridBagConstraintsFormato);			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormato.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormato, this.gridBagConstraintsFormato);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormato, this.gridBagConstraintsFormato);
			
			
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormato, this.gridBagConstraintsFormato);
		
			
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormato, this.gridBagConstraintsFormato);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormato;//jContentPane;
		
		return jScrollPanelDatosEdicionFormato;
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
