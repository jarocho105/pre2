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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.AbonoPrestamoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class AbonoPrestamoDetalleFormJInternalFrame extends AbonoPrestamoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAbonoPrestamo;
	
	protected JMenuBar jmenuBarDetalleAbonoPrestamo;
	
	protected JMenu jmenuDetalleAbonoPrestamo;
	protected JMenu jmenuDetalleArchivoAbonoPrestamo;
	protected JMenu jmenuDetalleAccionesAbonoPrestamo;
	protected JMenu jmenuDetalleDatosAbonoPrestamo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAbonoPrestamo;	
	protected GridBagConstraints gridBagConstraintsAbonoPrestamo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AbonoPrestamoBeanSwingJInternalFrameAdditional jInternalFrameDetalleAbonoPrestamo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_prestamo="";
	
	public AbonoPrestamoSessionBean abonoprestamoSessionBean;
	
	
	
	
	public PrestamoSessionBean prestamoSessionBean;	
	
	public AbonoPrestamoLogic abonoprestamoLogic;
	
	public JScrollPane jScrollPanelDatosAbonoPrestamo;
	public JScrollPane jScrollPanelDatosEdicionAbonoPrestamo;
	public JScrollPane jScrollPanelDatosGeneralAbonoPrestamo;
	
	protected JPanel jPanelCamposAbonoPrestamo;    
	protected JPanel jPanelCamposOcultosAbonoPrestamo;    	
	protected JPanel jPanelAccionesAbonoPrestamo;
	protected JPanel jPanelAccionesFormularioAbonoPrestamo;
    
	
	
	protected Integer iXPanelCamposAbonoPrestamo=0;
	protected Integer iYPanelCamposAbonoPrestamo=0;
	
	protected Integer iXPanelCamposOcultosAbonoPrestamo=0;
	protected Integer iYPanelCamposOcultosAbonoPrestamo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAbonoPrestamo;
	public JButton jButtonModificarAbonoPrestamo;
	public JButton jButtonActualizarAbonoPrestamo;
    public JButton jButtonEliminarAbonoPrestamo;
	public JButton jButtonCancelarAbonoPrestamo;
    public JButton jButtonGuardarCambiosAbonoPrestamo;
	public JButton jButtonGuardarCambiosTablaAbonoPrestamo;
	protected JButton jButtonCerrarAbonoPrestamo;
	
	
	protected JButton jButtonProcesarInformacionAbonoPrestamo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAbonoPrestamo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAbonoPrestamo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAbonoPrestamo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAbonoPrestamo;
	protected JButton jButtonModificarToolBarAbonoPrestamo;
	protected JButton jButtonActualizarToolBarAbonoPrestamo;
    protected JButton jButtonEliminarToolBarAbonoPrestamo;
	protected JButton jButtonCancelarToolBarAbonoPrestamo;
    protected JButton jButtonGuardarCambiosToolBarAbonoPrestamo;
	protected JButton jButtonGuardarCambiosTablaToolBarAbonoPrestamo;
	protected JButton jButtonMostrarOcultarTablaToolBarAbonoPrestamo;
	protected JButton jButtonCerrarToolBarAbonoPrestamo;
	
	protected JButton jButtonProcesarInformacionToolBarAbonoPrestamo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAbonoPrestamo;
	protected JMenuItem jMenuItemModificarAbonoPrestamo;
	protected JMenuItem jMenuItemActualizarAbonoPrestamo;
    protected JMenuItem jMenuItemEliminarAbonoPrestamo;
	protected JMenuItem jMenuItemCancelarAbonoPrestamo;
    protected JMenuItem jMenuItemGuardarCambiosAbonoPrestamo;
	protected JMenuItem jMenuItemGuardarCambiosTablaAbonoPrestamo;
	protected JMenuItem jMenuItemCerrarAbonoPrestamo;
	protected JMenuItem jMenuItemDetalleCerrarAbonoPrestamo;
	protected JMenuItem jMenuItemDetalleMostarOcultarAbonoPrestamo;
	
	protected JMenuItem jMenuItemProcesarInformacionAbonoPrestamo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAbonoPrestamo;
	protected JMenuItem jMenuItemMostrarOcultarAbonoPrestamo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAbonoPrestamo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAbonoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAbonoPrestamo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAbonoPrestamo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAbonoPrestamo;
	public JLabel jLabelIdAbonoPrestamo;
	public JLabel jLabelidAbonoPrestamo;
	public JButton jButtonidAbonoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelnumeroAbonoPrestamo;
	public JLabel jLabelnumeroAbonoPrestamo;
	public JTextField jTextFieldnumeroAbonoPrestamo;
	public JButton jButtonnumeroAbonoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelmonto_capitalAbonoPrestamo;
	public JLabel jLabelmonto_capitalAbonoPrestamo;
	public JTextField jTextFieldmonto_capitalAbonoPrestamo;
	public JButton jButtonmonto_capitalAbonoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelmonto_interesAbonoPrestamo;
	public JLabel jLabelmonto_interesAbonoPrestamo;
	public JTextField jTextFieldmonto_interesAbonoPrestamo;
	public JButton jButtonmonto_interesAbonoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelvalorAbonoPrestamo;
	public JLabel jLabelvalorAbonoPrestamo;
	public JTextField jTextFieldvalorAbonoPrestamo;
	public JButton jButtonvalorAbonoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoAbonoPrestamo;
	public JLabel jLabelfecha_vencimientoAbonoPrestamo;
	//public JFormattedTextField jDateChooserfecha_vencimientoAbonoPrestamo;

	public JDateChooser jDateChooserfecha_vencimientoAbonoPrestamo;
	public JButton jButtonfecha_vencimientoAbonoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_quincenaAbonoPrestamo;
	public JLabel jLabelcodigo_quincenaAbonoPrestamo;
	public JTextField jTextFieldcodigo_quincenaAbonoPrestamo;
	public JButton jButtoncodigo_quincenaAbonoPrestamoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_prestamoAbonoPrestamo;
	public JLabel jLabelid_prestamoAbonoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_prestamoAbonoPrestamo;
	public JButton jButtonid_prestamoAbonoPrestamo= new JButtonMe();
	public JButton jButtonid_prestamoAbonoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_prestamoAbonoPrestamoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAbonoPrestamo;
	
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
	
	public AbonoPrestamoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAbonoPrestamo=new JPanel();
				this.jPanelAccionesFormularioAbonoPrestamo=new JPanel();
				this.jmenuBarDetalleAbonoPrestamo=new JMenuBar();
				this.jTtoolBarDetalleAbonoPrestamo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AbonoPrestamoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AbonoPrestamoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AbonoPrestamoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AbonoPrestamoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AbonoPrestamoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAbonoPrestamo() {
		return this.jButtonActualizarToolBarAbonoPrestamo;
	}
	
	public JButton getjButtonEliminarToolBarAbonoPrestamo() {
		return this.jButtonEliminarToolBarAbonoPrestamo;
	}
	
	public JButton getjButtonCancelarToolBarAbonoPrestamo() {
		return this.jButtonCancelarToolBarAbonoPrestamo;
	}		
	
	public JButton getjButtonProcesarInformacionAbonoPrestamo() {
		return this.jButtonProcesarInformacionAbonoPrestamo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAbonoPrestamo)	{
		this.jButtonProcesarInformacionAbonoPrestamo = jButtonProcesarInformacionAbonoPrestamo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAbonoPrestamo() {
		return this.jComboBoxTiposAccionesAbonoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAbonoPrestamo(
			JComboBox jComboBoxTiposRelacionesAbonoPrestamo) {
		this.jComboBoxTiposRelacionesAbonoPrestamo = jComboBoxTiposRelacionesAbonoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAbonoPrestamo(
			JComboBox jComboBoxTiposAccionesAbonoPrestamo) {
		this.jComboBoxTiposAccionesAbonoPrestamo = jComboBoxTiposAccionesAbonoPrestamo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAbonoPrestamo() {
		return this.jComboBoxTiposAccionesFormularioAbonoPrestamo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAbonoPrestamo(
			JComboBox jComboBoxTiposAccionesFormularioAbonoPrestamo) {
		this.jComboBoxTiposAccionesFormularioAbonoPrestamo = jComboBoxTiposAccionesFormularioAbonoPrestamo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		
		this.abonoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.abonoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.abonoprestamoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AbonoPrestamoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Abono Prestamo MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
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
	
		AbonoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAbonoPrestamo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAbonoPrestamo=new JButtonMe();
				this.jButtonModificarToolBarAbonoPrestamo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAbonoPrestamo,this.jTtoolBarDetalleAbonoPrestamo,
							"actualizar","actualizar","Actualizar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAbonoPrestamo,this.jTtoolBarDetalleAbonoPrestamo,
							"eliminar","eliminar","Eliminar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAbonoPrestamo,this.jTtoolBarDetalleAbonoPrestamo,
							"cancelar","cancelar","Cancelar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAbonoPrestamo,this.jTtoolBarDetalleAbonoPrestamo,
							"guardarcambios","guardarcambios","Guardar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAbonoPrestamo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAbonoPrestamo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAbonoPrestamo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAbonoPrestamo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAbonoPrestamo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAbonoPrestamo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAbonoPrestamo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAbonoPrestamo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAbonoPrestamo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAbonoPrestamo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAbonoPrestamo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAbonoPrestamo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAbonoPrestamo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAbonoPrestamo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAbonoPrestamo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAbonoPrestamo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAbonoPrestamo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAbonoPrestamo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAbonoPrestamo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAbonoPrestamo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAbonoPrestamo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAbonoPrestamo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAbonoPrestamo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAbonoPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAbonoPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAbonoPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAbonoPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAbonoPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAbonoPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAbonoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAbonoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAbonoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAbonoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAbonoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAbonoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAbonoPrestamo.add(this.jMenuItemDetalleCerrarAbonoPrestamo);
		
		this.jmenuDetalleAccionesAbonoPrestamo.add(this.jMenuItemActualizarAbonoPrestamo);
		this.jmenuDetalleAccionesAbonoPrestamo.add(this.jMenuItemEliminarAbonoPrestamo);
		this.jmenuDetalleAccionesAbonoPrestamo.add(this.jMenuItemCancelarAbonoPrestamo);		
		
		//this.jmenuDetalleDatosAbonoPrestamo.add(this.jMenuItemDetalleAbrirOrderByAbonoPrestamo);				
		this.jmenuDetalleDatosAbonoPrestamo.add(this.jMenuItemDetalleMostarOcultarAbonoPrestamo);				
				
		//this.jmenuDetalleAccionesAbonoPrestamo.add(this.jMenuItemGuardarCambiosAbonoPrestamo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAbonoPrestamo.add(this.jmenuDetalleArchivoAbonoPrestamo);		
		this.jmenuBarDetalleAbonoPrestamo.add(this.jmenuDetalleAccionesAbonoPrestamo);		
		this.jmenuBarDetalleAbonoPrestamo.add(this.jmenuDetalleDatosAbonoPrestamo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAbonoPrestamo);				
	}
	
	
	public void inicializarElementosCamposAbonoPrestamo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAbonoPrestamo = new JLabelMe();
		jLabelIdAbonoPrestamo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAbonoPrestamo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAbonoPrestamo= new GridBagLayout();

		this.jPanelidAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);

		jLabelidAbonoPrestamo = new JLabel();
		jLabelidAbonoPrestamo.setText("Id");

		jLabelidAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroAbonoPrestamo = new JLabelMe();
		this.jLabelnumeroAbonoPrestamo.setText(""+AbonoPrestamoConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroAbonoPrestamo.setToolTipText("Numero");
		this.jLabelnumeroAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		this.jPanelnumeroAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);


		jTextFieldnumeroAbonoPrestamo= new JTextFieldMe();
		jTextFieldnumeroAbonoPrestamo.setEnabled(false);
		jTextFieldnumeroAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumeroAbonoPrestamo.setText("0");

		this.jButtonnumeroAbonoPrestamoBusqueda= new JButtonMe();
		this.jButtonnumeroAbonoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroAbonoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroAbonoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroAbonoPrestamoBusqueda.setText("U");
		this.jButtonnumeroAbonoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroAbonoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroAbonoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroAbonoPrestamoBusqueda"));

		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroAbonoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelmonto_capitalAbonoPrestamo = new JLabelMe();
		this.jLabelmonto_capitalAbonoPrestamo.setText(""+AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL+" : *");
		this.jLabelmonto_capitalAbonoPrestamo.setToolTipText("Monto Capital");
		this.jLabelmonto_capitalAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_capitalAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_capitalAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_capitalAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_capitalAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_capitalAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL);
		this.gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		this.jPanelmonto_capitalAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);


		jTextFieldmonto_capitalAbonoPrestamo= new JTextFieldMe();
		jTextFieldmonto_capitalAbonoPrestamo.setEnabled(false);
		jTextFieldmonto_capitalAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_capitalAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_capitalAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_capitalAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_capitalAbonoPrestamo.setText("0.0");

		this.jButtonmonto_capitalAbonoPrestamoBusqueda= new JButtonMe();
		this.jButtonmonto_capitalAbonoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_capitalAbonoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_capitalAbonoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_capitalAbonoPrestamoBusqueda.setText("U");
		this.jButtonmonto_capitalAbonoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_capitalAbonoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_capitalAbonoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_capitalAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_capitalAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_capitalAbonoPrestamoBusqueda"));

		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_capitalAbonoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelmonto_interesAbonoPrestamo = new JLabelMe();
		this.jLabelmonto_interesAbonoPrestamo.setText(""+AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES+" : *");
		this.jLabelmonto_interesAbonoPrestamo.setToolTipText("Monto Interes");
		this.jLabelmonto_interesAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_interesAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_interesAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_interesAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_interesAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_interesAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES);
		this.gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		this.jPanelmonto_interesAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);


		jTextFieldmonto_interesAbonoPrestamo= new JTextFieldMe();
		jTextFieldmonto_interesAbonoPrestamo.setEnabled(false);
		jTextFieldmonto_interesAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_interesAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_interesAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_interesAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_interesAbonoPrestamo.setText("0.0");

		this.jButtonmonto_interesAbonoPrestamoBusqueda= new JButtonMe();
		this.jButtonmonto_interesAbonoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_interesAbonoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_interesAbonoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_interesAbonoPrestamoBusqueda.setText("U");
		this.jButtonmonto_interesAbonoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_interesAbonoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_interesAbonoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_interesAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_interesAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_interesAbonoPrestamoBusqueda"));

		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_interesAbonoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelvalorAbonoPrestamo = new JLabelMe();
		this.jLabelvalorAbonoPrestamo.setText(""+AbonoPrestamoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorAbonoPrestamo.setToolTipText("Valor");
		this.jLabelvalorAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		this.jPanelvalorAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);


		jTextFieldvalorAbonoPrestamo= new JTextFieldMe();
		jTextFieldvalorAbonoPrestamo.setEnabled(false);
		jTextFieldvalorAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorAbonoPrestamo.setText("0.0");

		this.jButtonvalorAbonoPrestamoBusqueda= new JButtonMe();
		this.jButtonvalorAbonoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAbonoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAbonoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorAbonoPrestamoBusqueda.setText("U");
		this.jButtonvalorAbonoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorAbonoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorAbonoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorAbonoPrestamoBusqueda"));

		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorAbonoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoAbonoPrestamo = new JLabelMe();
		this.jLabelfecha_vencimientoAbonoPrestamo.setText(""+AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoAbonoPrestamo.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		this.jPanelfecha_vencimientoAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);


		//jFormattedTextFieldfecha_vencimientoAbonoPrestamo= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoAbonoPrestamo= new JDateChooser();
		jDateChooserfecha_vencimientoAbonoPrestamo.setEnabled(false);
		jDateChooserfecha_vencimientoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoAbonoPrestamo.setDate(new Date());
		jDateChooserfecha_vencimientoAbonoPrestamo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoAbonoPrestamo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoAbonoPrestamoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoAbonoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoAbonoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoAbonoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoAbonoPrestamoBusqueda.setText("U");
		this.jButtonfecha_vencimientoAbonoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoAbonoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoAbonoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoAbonoPrestamoBusqueda"));

		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoAbonoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_quincenaAbonoPrestamo = new JLabelMe();
		this.jLabelcodigo_quincenaAbonoPrestamo.setText(""+AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA+" : *");
		this.jLabelcodigo_quincenaAbonoPrestamo.setToolTipText("Codigo Quincena");
		this.jLabelcodigo_quincenaAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_quincenaAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_quincenaAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_quincenaAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_quincenaAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_quincenaAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA);
		this.gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		this.jPanelcodigo_quincenaAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);


		jTextFieldcodigo_quincenaAbonoPrestamo= new JTextFieldMe();

		jTextFieldcodigo_quincenaAbonoPrestamo.setEnabled(false);
		jTextFieldcodigo_quincenaAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_quincenaAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_quincenaAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_quincenaAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_quincenaAbonoPrestamoBusqueda= new JButtonMe();
		this.jButtoncodigo_quincenaAbonoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_quincenaAbonoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_quincenaAbonoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_quincenaAbonoPrestamoBusqueda.setText("U");
		this.jButtoncodigo_quincenaAbonoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_quincenaAbonoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_quincenaAbonoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_quincenaAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_quincenaAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_quincenaAbonoPrestamoBusqueda"));

		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_quincenaAbonoPrestamoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAbonoPrestamo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_prestamoAbonoPrestamo = new JLabelMe();
		this.jLabelid_prestamoAbonoPrestamo.setText(""+AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO+" : *");
		this.jLabelid_prestamoAbonoPrestamo.setToolTipText("Idprestamo");
		this.jLabelid_prestamoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_prestamoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_prestamoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_prestamoAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_prestamoAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_prestamoAbonoPrestamo.setToolTipText(AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO);
		this.gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		this.jPanelid_prestamoAbonoPrestamo.setLayout(this.gridaBagLayoutAbonoPrestamo);


		jComboBoxid_prestamoAbonoPrestamo= new JComboBoxMe();
		jComboBoxid_prestamoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_prestamoAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_prestamoAbonoPrestamo= new JButtonMe();
		this.jButtonid_prestamoAbonoPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prestamoAbonoPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prestamoAbonoPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prestamoAbonoPrestamo.setText("Buscar");
		this.jButtonid_prestamoAbonoPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_prestamoAbonoPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prestamoAbonoPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_prestamoAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prestamoAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prestamoAbonoPrestamo"));

		this.jButtonid_prestamoAbonoPrestamoBusqueda= new JButtonMe();
		this.jButtonid_prestamoAbonoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoAbonoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoAbonoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_prestamoAbonoPrestamoBusqueda.setText("U");
		this.jButtonid_prestamoAbonoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_prestamoAbonoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prestamoAbonoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_prestamoAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prestamoAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prestamoAbonoPrestamoBusqueda"));

		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_prestamoAbonoPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_prestamoAbonoPrestamoUpdate= new JButtonMe();
		this.jButtonid_prestamoAbonoPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoAbonoPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoAbonoPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_prestamoAbonoPrestamoUpdate.setText("U");
		this.jButtonid_prestamoAbonoPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_prestamoAbonoPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prestamoAbonoPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_prestamoAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prestamoAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prestamoAbonoPrestamoUpdate"));



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
		//this.jInternalFrameDetalleAbonoPrestamo = new AbonoPrestamoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Abono Prestamo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAbonoPrestamo= new GridBagLayout();
		

		
		String sToolTipAbonoPrestamo="";
		sToolTipAbonoPrestamo=AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAbonoPrestamo+="(Nomina.AbonoPrestamo)";
		}
		
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			sToolTipAbonoPrestamo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAbonoPrestamo = new JButtonMe();
		this.jButtonModificarAbonoPrestamo = new JButtonMe();
        this.jButtonActualizarAbonoPrestamo = new JButtonMe();
        this.jButtonEliminarAbonoPrestamo = new JButtonMe();
        this.jButtonCancelarAbonoPrestamo = new JButtonMe();
        this.jButtonGuardarCambiosAbonoPrestamo = new JButtonMe();
		this.jButtonGuardarCambiosTablaAbonoPrestamo = new JButtonMe();
		this.jButtonCerrarAbonoPrestamo = new JButtonMe();
		
		this.jScrollPanelDatosAbonoPrestamo = new JScrollPane();   
        this.jScrollPanelDatosEdicionAbonoPrestamo = new JScrollPane();
		this.jScrollPanelDatosGeneralAbonoPrestamo = new JScrollPane();
				
		
		
		this.jPanelCamposAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Abono Prestamo";
		
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Abono Prestamos" + this.sPath));
		} else {
			this.jScrollPanelDatosAbonoPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAbonoPrestamo.setName("jPanelCamposAbonoPrestamo"); 

		this.jPanelCamposOcultosAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAbonoPrestamo.setName("jPanelCamposOcultosAbonoPrestamo"); 

        this.jPanelAccionesAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAbonoPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesAbonoPrestamo.setName("Acciones"); 

		this.jPanelAccionesFormularioAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAbonoPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAbonoPrestamo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAbonoPrestamo.setText("Nuevo");
		this.jButtonModificarAbonoPrestamo.setText("Editar");
        this.jButtonActualizarAbonoPrestamo.setText("Actualizar");
        this.jButtonEliminarAbonoPrestamo.setText("Eliminar");
        this.jButtonCancelarAbonoPrestamo.setText("Cancelar");
        this.jButtonGuardarCambiosAbonoPrestamo.setText("Guardar");
		this.jButtonGuardarCambiosTablaAbonoPrestamo.setText("Guardar");
		this.jButtonCerrarAbonoPrestamo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAbonoPrestamo,"nuevo_button","Nuevo",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAbonoPrestamo,"modificar_button","Editar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAbonoPrestamo,"actualizar_button","Actualizar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAbonoPrestamo,"eliminar_button","Eliminar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAbonoPrestamo,"cancelar_button","Cancelar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAbonoPrestamo,"guardarcambios_button","Guardar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAbonoPrestamo,"guardarcambiostabla_button","Guardar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAbonoPrestamo,"cerrar_button","Salir",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAbonoPrestamo.setToolTipText("Nuevo"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAbonoPrestamo.setToolTipText("Editar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAbonoPrestamo.setToolTipText("Actualizar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAbonoPrestamo.setToolTipText("Eliminar)"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAbonoPrestamo.setToolTipText("Cancelar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAbonoPrestamo.setToolTipText("Guardar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAbonoPrestamo.setToolTipText("Guardar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAbonoPrestamo.setToolTipText("Salir"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAbonoPrestamo";
		inputMap = this.jButtonNuevoAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAbonoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAbonoPrestamo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAbonoPrestamo";
		inputMap = this.jButtonActualizarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAbonoPrestamo"));
		
		//ELIMINAR
		sMapKey = "EliminarAbonoPrestamo";
		inputMap = this.jButtonEliminarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAbonoPrestamo"));
		
		//CANCELAR	
		sMapKey = "CancelarAbonoPrestamo";
		inputMap = this.jButtonCancelarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAbonoPrestamo"));
		
		//CERRAR		
		sMapKey = "CerrarAbonoPrestamo";
		inputMap = this.jButtonCerrarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAbonoPrestamo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAbonoPrestamo";
		inputMap = this.jButtonGuardarCambiosTablaAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAbonoPrestamo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAbonoPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAbonoPrestamo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAbonoPrestamo.setToolTipText("Nuevo AbonoPrestamo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAbonoPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAbonoPrestamo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAbonoPrestamo.setToolTipText("Sin Cerrar Ventana AbonoPrestamo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAbonoPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAbonoPrestamo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAbonoPrestamo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAbonoPrestamo.setText("Accion");
		this.jComboBoxTiposAccionesAbonoPrestamo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAbonoPrestamo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAbonoPrestamo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAbonoPrestamo = new JLabelMe();
		
		this.jLabelAccionesAbonoPrestamo.setText("Acciones");		
		this.jLabelAccionesAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAbonoPrestamo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAbonoPrestamo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAbonoPrestamo=new JTabbedPane();
		this.jTabbedPaneRelacionesAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAbonoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAbonoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAbonoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAbonoPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAbonoPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAbonoPrestamo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAbonoPrestamo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAbonoPrestamo = new GridBagLayout();
		
		this.jPanelCamposAbonoPrestamo.setLayout(gridaBagLayoutCamposAbonoPrestamo);
		this.jPanelCamposOcultosAbonoPrestamo.setLayout(gridaBagLayoutCamposOcultosAbonoPrestamo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAbonoPrestamo.add(jLabelIdAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAbonoPrestamo.add(jLabelidAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_prestamoAbonoPrestamo.add(jLabelid_prestamoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 2;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_prestamoAbonoPrestamo.add(jButtonid_prestamoAbonoPrestamoBusqueda, this.gridBagConstraintsAbonoPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 3;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_prestamoAbonoPrestamo.add(jButtonid_prestamoAbonoPrestamoUpdate, this.gridBagConstraintsAbonoPrestamo);
	}

	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_prestamoAbonoPrestamo.add(jComboBoxid_prestamoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroAbonoPrestamo.add(jLabelnumeroAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 2;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroAbonoPrestamo.add(jButtonnumeroAbonoPrestamoBusqueda, this.gridBagConstraintsAbonoPrestamo);
	}

	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroAbonoPrestamo.add(jTextFieldnumeroAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_capitalAbonoPrestamo.add(jLabelmonto_capitalAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 2;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_capitalAbonoPrestamo.add(jButtonmonto_capitalAbonoPrestamoBusqueda, this.gridBagConstraintsAbonoPrestamo);
	}

	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_capitalAbonoPrestamo.add(jTextFieldmonto_capitalAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_interesAbonoPrestamo.add(jLabelmonto_interesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 2;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_interesAbonoPrestamo.add(jButtonmonto_interesAbonoPrestamoBusqueda, this.gridBagConstraintsAbonoPrestamo);
	}

	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_interesAbonoPrestamo.add(jTextFieldmonto_interesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorAbonoPrestamo.add(jLabelvalorAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 2;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorAbonoPrestamo.add(jButtonvalorAbonoPrestamoBusqueda, this.gridBagConstraintsAbonoPrestamo);
	}

	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorAbonoPrestamo.add(jTextFieldvalorAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoAbonoPrestamo.add(jLabelfecha_vencimientoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 2;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoAbonoPrestamo.add(jButtonfecha_vencimientoAbonoPrestamoBusqueda, this.gridBagConstraintsAbonoPrestamo);
	}

	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoAbonoPrestamo.add(jDateChooserfecha_vencimientoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_quincenaAbonoPrestamo.add(jLabelcodigo_quincenaAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 2;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
		this.gridBagConstraintsAbonoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_quincenaAbonoPrestamo.add(jButtoncodigo_quincenaAbonoPrestamoBusqueda, this.gridBagConstraintsAbonoPrestamo);
	}

	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAbonoPrestamo.gridy = 0;
	this.gridBagConstraintsAbonoPrestamo.gridx = 1;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_quincenaAbonoPrestamo.add(jTextFieldcodigo_quincenaAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelidAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
	}
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelid_prestamoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
	}
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelnumeroAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
	}
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelmonto_capitalAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
	}
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelmonto_interesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
	}
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelvalorAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
	}
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelfecha_vencimientoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
	}
	this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAbonoPrestamo.gridy = iYPanelCamposAbonoPrestamo;
	this.gridBagConstraintsAbonoPrestamo.gridx = iXPanelCamposAbonoPrestamo++;
	this.gridBagConstraintsAbonoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAbonoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAbonoPrestamo.add(this.jPanelcodigo_quincenaAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);



	if(iXPanelCamposAbonoPrestamo % 1==0) {
		iXPanelCamposAbonoPrestamo=0;
		iYPanelCamposAbonoPrestamo++;
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
			
		GridBagLayout gridaBagLayoutAccionesAbonoPrestamo= new GridBagLayout();
		this.jPanelAccionesAbonoPrestamo.setLayout(gridaBagLayoutAccionesAbonoPrestamo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAbonoPrestamo= new GridBagLayout();
		this.jPanelAccionesFormularioAbonoPrestamo.setLayout(gridaBagLayoutAccionesFormularioAbonoPrestamo);
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAbonoPrestamo.add(this.jComboBoxTiposAccionesFormularioAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAbonoPrestamo.add(this.jCheckBoxPostAccionNuevoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAbonoPrestamo.add(this.jCheckBoxPostAccionSinCerrarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAbonoPrestamo.add(this.jCheckBoxPostAccionSinMensajeAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccion++;
			
		this.jPanelAccionesAbonoPrestamo.add(this.jButtonModificarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);							

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx =iPosXAccion++;
			
		this.jPanelAccionesAbonoPrestamo.add(this.jButtonEliminarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
			
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccion++;
		
		this.jPanelAccionesAbonoPrestamo.add(this.jButtonActualizarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccion++;
		
		this.jPanelAccionesAbonoPrestamo.add(this.jButtonGuardarCambiosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);	
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;		
		this.gridBagConstraintsAbonoPrestamo.gridx =iPosXAccion++;
		
		this.jPanelAccionesAbonoPrestamo.add(this.jButtonCancelarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAbonoPrestamo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();						
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAbonoPrestamo.gridx = 0;		
			//this.gridBagConstraintsAbonoPrestamo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAbonoPrestamo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAbonoPrestamo.gridx =0;
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAbonoPrestamo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAbonoPrestamo = new AbonoPrestamoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Abono Prestamo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Abono Prestamo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Abono Prestamo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AbonoPrestamoModel abonoprestamoModel=new AbonoPrestamoModel(this);
			
			//SI USARA CLASE INTERNA
			//AbonoPrestamoModel.AbonoPrestamoFocusTraversalPolicy abonoprestamoFocusTraversalPolicy = abonoprestamoModel.new AbonoPrestamoFocusTraversalPolicy(this);
			
			//abonoprestamoFocusTraversalPolicy.setabonoprestamoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(abonoprestamoModel);
			
			
			this.jContentPaneDetalleAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAbonoPrestamo = new GridBagLayout();	
			this.jContentPaneDetalleAbonoPrestamo.setLayout(gridaBagLayoutDetalleAbonoPrestamo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAbonoPrestamo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsAbonoPrestamo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAbonoPrestamo.gridx = 0;
					
				
				this.jContentPaneDetalleAbonoPrestamo.add(jTtoolBarDetalleAbonoPrestamo, gridBagConstraintsAbonoPrestamo);								
				
}
			
			this.jScrollPanelDatosEdicionAbonoPrestamo=   new JScrollPane(jContentPaneDetalleAbonoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAbonoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAbonoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAbonoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAbonoPrestamo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAbonoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAbonoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAbonoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAbonoPrestamo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	        
			this.jContentPaneDetalleAbonoPrestamo.add(jPanelCamposAbonoPrestamo, gridBagConstraintsAbonoPrestamo);
			
			
			
			
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
						&& abonoprestamoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAbonoPrestamo= new GridBagConstraints();
						this.gridBagConstraintsAbonoPrestamo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAbonoPrestamo.gridx = 0;
						this.jContentPaneDetalleAbonoPrestamo.add(this.jTabbedPaneRelacionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAbonoPrestamo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAbonoPrestamo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
					this.gridBagConstraintsAbonoPrestamo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAbonoPrestamo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAbonoPrestamo.gridx = 0;
					
				
					this.jContentPaneDetalleAbonoPrestamo.add(jPanelCamposOcultosAbonoPrestamo, gridBagConstraintsAbonoPrestamo);
				
					this.jPanelCamposOcultosAbonoPrestamo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	        this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAbonoPrestamo.add(this.jPanelAccionesFormularioAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);							
			
			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
	        this.gridBagConstraintsAbonoPrestamo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAbonoPrestamo.gridx = 0;
	        
			
			this.jContentPaneDetalleAbonoPrestamo.add(this.jPanelAccionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAbonoPrestamo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAbonoPrestamo=   new JScrollPane(this.jPanelCamposAbonoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAbonoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAbonoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAbonoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAbonoPrestamo.gridx = 0;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAbonoPrestamo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAbonoPrestamo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAbonoPrestamo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			
			
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
			
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAbonoPrestamo;//jContentPane;
		
		return jScrollPanelDatosEdicionAbonoPrestamo;
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
