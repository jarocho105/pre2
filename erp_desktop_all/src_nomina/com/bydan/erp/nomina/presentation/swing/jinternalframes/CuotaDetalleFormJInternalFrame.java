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
import com.bydan.erp.nomina.util.CuotaConstantesFunciones;

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
public class CuotaDetalleFormJInternalFrame extends CuotaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuota;
	
	protected JMenuBar jmenuBarDetalleCuota;
	
	protected JMenu jmenuDetalleCuota;
	protected JMenu jmenuDetalleArchivoCuota;
	protected JMenu jmenuDetalleAccionesCuota;
	protected JMenu jmenuDetalleDatosCuota;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuota;	
	protected GridBagConstraints gridBagConstraintsCuota;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuotaBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuota;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_prestamo="";

	protected EstadoCuotaBeanSwingJInternalFrame estadocuotaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocuota="";

	protected DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_defiprovisionempleado="";
	
	public CuotaSessionBean cuotaSessionBean;
	
	
	
	
	public PrestamoSessionBean prestamoSessionBean;
	public EstadoCuotaSessionBean estadocuotaSessionBean;
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;	
	
	public CuotaLogic cuotaLogic;
	
	public JScrollPane jScrollPanelDatosCuota;
	public JScrollPane jScrollPanelDatosEdicionCuota;
	public JScrollPane jScrollPanelDatosGeneralCuota;
	
	protected JPanel jPanelCamposCuota;    
	protected JPanel jPanelCamposOcultosCuota;    	
	protected JPanel jPanelAccionesCuota;
	protected JPanel jPanelAccionesFormularioCuota;
    
	
	
	protected Integer iXPanelCamposCuota=0;
	protected Integer iYPanelCamposCuota=0;
	
	protected Integer iXPanelCamposOcultosCuota=0;
	protected Integer iYPanelCamposOcultosCuota=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuota;
	public JButton jButtonModificarCuota;
	public JButton jButtonActualizarCuota;
    public JButton jButtonEliminarCuota;
	public JButton jButtonCancelarCuota;
    public JButton jButtonGuardarCambiosCuota;
	public JButton jButtonGuardarCambiosTablaCuota;
	protected JButton jButtonCerrarCuota;
	
	
	protected JButton jButtonProcesarInformacionCuota;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuota;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuota;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuota;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuota;
	protected JButton jButtonModificarToolBarCuota;
	protected JButton jButtonActualizarToolBarCuota;
    protected JButton jButtonEliminarToolBarCuota;
	protected JButton jButtonCancelarToolBarCuota;
    protected JButton jButtonGuardarCambiosToolBarCuota;
	protected JButton jButtonGuardarCambiosTablaToolBarCuota;
	protected JButton jButtonMostrarOcultarTablaToolBarCuota;
	protected JButton jButtonCerrarToolBarCuota;
	
	protected JButton jButtonProcesarInformacionToolBarCuota;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuota;
	protected JMenuItem jMenuItemModificarCuota;
	protected JMenuItem jMenuItemActualizarCuota;
    protected JMenuItem jMenuItemEliminarCuota;
	protected JMenuItem jMenuItemCancelarCuota;
    protected JMenuItem jMenuItemGuardarCambiosCuota;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuota;
	protected JMenuItem jMenuItemCerrarCuota;
	protected JMenuItem jMenuItemDetalleCerrarCuota;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuota;
	
	protected JMenuItem jMenuItemProcesarInformacionCuota;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuota;
	protected JMenuItem jMenuItemMostrarOcultarCuota;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuota;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuota;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuota;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuota;
	public JLabel jLabelIdCuota;
	public JLabel jLabelidCuota;
	public JButton jButtonidCuotaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuotaCuota;
	public JLabel jLabelnumero_cuotaCuota;
	public JTextField jTextFieldnumero_cuotaCuota;
	public JButton jButtonnumero_cuotaCuotaBusqueda= new JButtonMe();

	public JPanel jPanelcapitalCuota;
	public JLabel jLabelcapitalCuota;
	public JTextField jTextFieldcapitalCuota;
	public JButton jButtoncapitalCuotaBusqueda= new JButtonMe();

	public JPanel jPanelinteresCuota;
	public JLabel jLabelinteresCuota;
	public JTextField jTextFieldinteresCuota;
	public JButton jButtoninteresCuotaBusqueda= new JButtonMe();

	public JPanel jPaneltotalCuota;
	public JLabel jLabeltotalCuota;
	public JTextField jTextFieldtotalCuota;
	public JButton jButtontotalCuotaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_liquidacionCuota;
	public JLabel jLabelfecha_liquidacionCuota;
	public JTextField jTextFieldfecha_liquidacionCuota;
	public JButton jButtonfecha_liquidacionCuotaBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ajusteCuota;
	public JLabel jLabelmonto_ajusteCuota;
	public JTextField jTextFieldmonto_ajusteCuota;
	public JButton jButtonmonto_ajusteCuotaBusqueda= new JButtonMe();

	public JPanel jPanelinteres_ajusteCuota;
	public JLabel jLabelinteres_ajusteCuota;
	public JTextField jTextFieldinteres_ajusteCuota;
	public JButton jButtoninteres_ajusteCuotaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoCuota;
	public JLabel jLabelfecha_vencimientoCuota;
	//public JFormattedTextField jDateChooserfecha_vencimientoCuota;

	public JDateChooser jDateChooserfecha_vencimientoCuota;
	public JButton jButtonfecha_vencimientoCuotaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCuota;
	public JLabel jLabeldescripcionCuota;
	public JTextArea jTextAreadescripcionCuota;
	public JScrollPane jscrollPanedescripcionCuota;
	public JButton jButtondescripcionCuotaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_prestamoCuota;
	public JLabel jLabelid_prestamoCuota;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_prestamoCuota;
	public JButton jButtonid_prestamoCuota= new JButtonMe();
	public JButton jButtonid_prestamoCuotaUpdate= new JButtonMe();
	public JButton jButtonid_prestamoCuotaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_cuotaCuota;
	public JLabel jLabelid_estado_cuotaCuota;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_cuotaCuota;
	public JButton jButtonid_estado_cuotaCuota= new JButtonMe();
	public JButton jButtonid_estado_cuotaCuotaUpdate= new JButtonMe();
	public JButton jButtonid_estado_cuotaCuotaBusqueda= new JButtonMe();

	public JPanel jPanelid_defi_provision_empleadoCuota;
	public JLabel jLabelid_defi_provision_empleadoCuota;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_defi_provision_empleadoCuota;
	public JButton jButtonid_defi_provision_empleadoCuota= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoCuotaUpdate= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoCuotaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuota;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuotaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuota=new JPanel();
				this.jPanelAccionesFormularioCuota=new JPanel();
				this.jmenuBarDetalleCuota=new JMenuBar();
				this.jTtoolBarDetalleCuota=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuotaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuotaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuotaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuotaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuotaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuota() {
		return this.jButtonActualizarToolBarCuota;
	}
	
	public JButton getjButtonEliminarToolBarCuota() {
		return this.jButtonEliminarToolBarCuota;
	}
	
	public JButton getjButtonCancelarToolBarCuota() {
		return this.jButtonCancelarToolBarCuota;
	}		
	
	public JButton getjButtonProcesarInformacionCuota() {
		return this.jButtonProcesarInformacionCuota;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuota)	{
		this.jButtonProcesarInformacionCuota = jButtonProcesarInformacionCuota;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuota() {
		return this.jComboBoxTiposAccionesCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuota(
			JComboBox jComboBoxTiposRelacionesCuota) {
		this.jComboBoxTiposRelacionesCuota = jComboBoxTiposRelacionesCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuota(
			JComboBox jComboBoxTiposAccionesCuota) {
		this.jComboBoxTiposAccionesCuota = jComboBoxTiposAccionesCuota;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuota() {
		return this.jComboBoxTiposAccionesFormularioCuota;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuota(
			JComboBox jComboBoxTiposAccionesFormularioCuota) {
		this.jComboBoxTiposAccionesFormularioCuota = jComboBoxTiposAccionesFormularioCuota;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuotaSessionBean=new CuotaSessionBean();
		
		this.cuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuotaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuotaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuotaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuota MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
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
	
		CuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuota= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuota=new JButtonMe();
				this.jButtonModificarToolBarCuota=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuota,this.jTtoolBarDetalleCuota,
							"actualizar","actualizar","Actualizar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuota,this.jTtoolBarDetalleCuota,
							"eliminar","eliminar","Eliminar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuota,this.jTtoolBarDetalleCuota,
							"cancelar","cancelar","Cancelar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuota,this.jTtoolBarDetalleCuota,
							"guardarcambios","guardarcambios","Guardar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuota,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuota=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuota=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuota=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuota=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuota=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuota= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuota.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuota,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuota= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuota.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuota,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuota= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuota.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuota,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuota= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuota.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuota,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuota= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuota.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuota,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuota= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuota.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuota,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuota,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuota,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuota, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuota.add(this.jMenuItemDetalleCerrarCuota);
		
		this.jmenuDetalleAccionesCuota.add(this.jMenuItemActualizarCuota);
		this.jmenuDetalleAccionesCuota.add(this.jMenuItemEliminarCuota);
		this.jmenuDetalleAccionesCuota.add(this.jMenuItemCancelarCuota);		
		
		//this.jmenuDetalleDatosCuota.add(this.jMenuItemDetalleAbrirOrderByCuota);				
		this.jmenuDetalleDatosCuota.add(this.jMenuItemDetalleMostarOcultarCuota);				
				
		//this.jmenuDetalleAccionesCuota.add(this.jMenuItemGuardarCambiosCuota);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuota.add(this.jmenuDetalleArchivoCuota);		
		this.jmenuBarDetalleCuota.add(this.jmenuDetalleAccionesCuota);		
		this.jmenuBarDetalleCuota.add(this.jmenuDetalleDatosCuota);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuota);				
	}
	
	
	public void inicializarElementosCamposCuota() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuota = new JLabelMe();
		jLabelIdCuota.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuota = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuota.setToolTipText(CuotaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuota= new GridBagLayout();

		this.jPanelidCuota.setLayout(this.gridaBagLayoutCuota);

		jLabelidCuota = new JLabel();
		jLabelidCuota.setText("Id");

		jLabelidCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_cuotaCuota = new JLabelMe();
		this.jLabelnumero_cuotaCuota.setText(""+CuotaConstantesFunciones.LABEL_NUMEROCUOTA+" : *");
		this.jLabelnumero_cuotaCuota.setToolTipText("Numero Cuota");
		this.jLabelnumero_cuotaCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotaCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotaCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuotaCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuotaCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuotaCuota.setToolTipText(CuotaConstantesFunciones.LABEL_NUMEROCUOTA);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelnumero_cuotaCuota.setLayout(this.gridaBagLayoutCuota);


		jTextFieldnumero_cuotaCuota= new JTextFieldMe();
		jTextFieldnumero_cuotaCuota.setEnabled(false);
		jTextFieldnumero_cuotaCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotaCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotaCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuotaCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cuotaCuota.setText("0");

		this.jButtonnumero_cuotaCuotaBusqueda= new JButtonMe();
		this.jButtonnumero_cuotaCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotaCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotaCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuotaCuotaBusqueda.setText("U");
		this.jButtonnumero_cuotaCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuotaCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuotaCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuotaCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuotaCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuotaCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuotaCuotaBusqueda.setVisible(false);		}


					
		this.jLabelcapitalCuota = new JLabelMe();
		this.jLabelcapitalCuota.setText(""+CuotaConstantesFunciones.LABEL_CAPITAL+" : *");
		this.jLabelcapitalCuota.setToolTipText("Capital");
		this.jLabelcapitalCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcapitalCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcapitalCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcapitalCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcapitalCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcapitalCuota.setToolTipText(CuotaConstantesFunciones.LABEL_CAPITAL);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelcapitalCuota.setLayout(this.gridaBagLayoutCuota);


		jTextFieldcapitalCuota= new JTextFieldMe();
		jTextFieldcapitalCuota.setEnabled(false);
		jTextFieldcapitalCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcapitalCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcapitalCuota.setText("0.0");

		this.jButtoncapitalCuotaBusqueda= new JButtonMe();
		this.jButtoncapitalCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncapitalCuotaBusqueda.setText("U");
		this.jButtoncapitalCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncapitalCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncapitalCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcapitalCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcapitalCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"capitalCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncapitalCuotaBusqueda.setVisible(false);		}


					
		this.jLabelinteresCuota = new JLabelMe();
		this.jLabelinteresCuota.setText(""+CuotaConstantesFunciones.LABEL_INTERES+" : *");
		this.jLabelinteresCuota.setToolTipText("Interes");
		this.jLabelinteresCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinteresCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinteresCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinteresCuota.setToolTipText(CuotaConstantesFunciones.LABEL_INTERES);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelinteresCuota.setLayout(this.gridaBagLayoutCuota);


		jTextFieldinteresCuota= new JTextFieldMe();
		jTextFieldinteresCuota.setEnabled(false);
		jTextFieldinteresCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinteresCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinteresCuota.setText("0.0");

		this.jButtoninteresCuotaBusqueda= new JButtonMe();
		this.jButtoninteresCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninteresCuotaBusqueda.setText("U");
		this.jButtoninteresCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninteresCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninteresCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinteresCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinteresCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"interesCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninteresCuotaBusqueda.setVisible(false);		}


					
		this.jLabeltotalCuota = new JLabelMe();
		this.jLabeltotalCuota.setText(""+CuotaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalCuota.setToolTipText("Total");
		this.jLabeltotalCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalCuota.setToolTipText(CuotaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPaneltotalCuota.setLayout(this.gridaBagLayoutCuota);


		jTextFieldtotalCuota= new JTextFieldMe();
		jTextFieldtotalCuota.setEnabled(false);
		jTextFieldtotalCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalCuota.setText("0.0");

		this.jButtontotalCuotaBusqueda= new JButtonMe();
		this.jButtontotalCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalCuotaBusqueda.setText("U");
		this.jButtontotalCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalCuotaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_liquidacionCuota = new JLabelMe();
		this.jLabelfecha_liquidacionCuota.setText(""+CuotaConstantesFunciones.LABEL_FECHALIQUIDACION+" : *");
		this.jLabelfecha_liquidacionCuota.setToolTipText("Fecha Liquacion");
		this.jLabelfecha_liquidacionCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_liquidacionCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_liquidacionCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_liquidacionCuota.setToolTipText(CuotaConstantesFunciones.LABEL_FECHALIQUIDACION);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelfecha_liquidacionCuota.setLayout(this.gridaBagLayoutCuota);


		jTextFieldfecha_liquidacionCuota= new JTextFieldMe();
		jTextFieldfecha_liquidacionCuota.setEnabled(false);
		jTextFieldfecha_liquidacionCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfecha_liquidacionCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfecha_liquidacionCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfecha_liquidacionCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfecha_liquidacionCuota.setText("0.0");

		this.jButtonfecha_liquidacionCuotaBusqueda= new JButtonMe();
		this.jButtonfecha_liquidacionCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_liquidacionCuotaBusqueda.setText("U");
		this.jButtonfecha_liquidacionCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_liquidacionCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_liquidacionCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfecha_liquidacionCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfecha_liquidacionCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_liquidacionCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_liquidacionCuotaBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ajusteCuota = new JLabelMe();
		this.jLabelmonto_ajusteCuota.setText(""+CuotaConstantesFunciones.LABEL_MONTOAJUSTE+" : *");
		this.jLabelmonto_ajusteCuota.setToolTipText("Monto Ajuste");
		this.jLabelmonto_ajusteCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ajusteCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ajusteCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ajusteCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ajusteCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ajusteCuota.setToolTipText(CuotaConstantesFunciones.LABEL_MONTOAJUSTE);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelmonto_ajusteCuota.setLayout(this.gridaBagLayoutCuota);


		jTextFieldmonto_ajusteCuota= new JTextFieldMe();
		jTextFieldmonto_ajusteCuota.setEnabled(false);
		jTextFieldmonto_ajusteCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ajusteCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ajusteCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ajusteCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ajusteCuota.setText("0.0");

		this.jButtonmonto_ajusteCuotaBusqueda= new JButtonMe();
		this.jButtonmonto_ajusteCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ajusteCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ajusteCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ajusteCuotaBusqueda.setText("U");
		this.jButtonmonto_ajusteCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ajusteCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ajusteCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ajusteCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ajusteCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ajusteCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ajusteCuotaBusqueda.setVisible(false);		}


					
		this.jLabelinteres_ajusteCuota = new JLabelMe();
		this.jLabelinteres_ajusteCuota.setText(""+CuotaConstantesFunciones.LABEL_INTERESAJUSTE+" : *");
		this.jLabelinteres_ajusteCuota.setToolTipText("Interes Ajuste");
		this.jLabelinteres_ajusteCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteres_ajusteCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteres_ajusteCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinteres_ajusteCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinteres_ajusteCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinteres_ajusteCuota.setToolTipText(CuotaConstantesFunciones.LABEL_INTERESAJUSTE);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelinteres_ajusteCuota.setLayout(this.gridaBagLayoutCuota);


		jTextFieldinteres_ajusteCuota= new JTextFieldMe();
		jTextFieldinteres_ajusteCuota.setEnabled(false);
		jTextFieldinteres_ajusteCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteres_ajusteCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteres_ajusteCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinteres_ajusteCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinteres_ajusteCuota.setText("0.0");

		this.jButtoninteres_ajusteCuotaBusqueda= new JButtonMe();
		this.jButtoninteres_ajusteCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteres_ajusteCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteres_ajusteCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninteres_ajusteCuotaBusqueda.setText("U");
		this.jButtoninteres_ajusteCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninteres_ajusteCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninteres_ajusteCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinteres_ajusteCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinteres_ajusteCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"interes_ajusteCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninteres_ajusteCuotaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoCuota = new JLabelMe();
		this.jLabelfecha_vencimientoCuota.setText(""+CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoCuota.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoCuota.setToolTipText(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelfecha_vencimientoCuota.setLayout(this.gridaBagLayoutCuota);


		//jFormattedTextFieldfecha_vencimientoCuota= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoCuota= new JDateChooser();
		jDateChooserfecha_vencimientoCuota.setEnabled(false);
		jDateChooserfecha_vencimientoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoCuota.setDate(new Date());
		jDateChooserfecha_vencimientoCuota.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoCuota.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoCuotaBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoCuotaBusqueda.setText("U");
		this.jButtonfecha_vencimientoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoCuotaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCuota = new JLabelMe();
		this.jLabeldescripcionCuota.setText(""+CuotaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionCuota.setToolTipText("Descripcion");
		this.jLabeldescripcionCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCuota.setToolTipText(CuotaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPaneldescripcionCuota.setLayout(this.gridaBagLayoutCuota);


		jTextAreadescripcionCuota= new JTextAreaMe();
		jTextAreadescripcionCuota.setEnabled(false);
		jTextAreadescripcionCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCuota.setLineWrap(true);
		jTextAreadescripcionCuota.setWrapStyleWord(true);
		jTextAreadescripcionCuota.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCuota.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCuota = new JScrollPane(jTextAreadescripcionCuota);
		jscrollPanedescripcionCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionCuotaBusqueda= new JButtonMe();
		this.jButtondescripcionCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCuotaBusqueda.setText("U");
		this.jButtondescripcionCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCuotaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuota() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_prestamoCuota = new JLabelMe();
		this.jLabelid_prestamoCuota.setText(""+CuotaConstantesFunciones.LABEL_IDPRESTAMO+" : *");
		this.jLabelid_prestamoCuota.setToolTipText("Prestamo");
		this.jLabelid_prestamoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_prestamoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_prestamoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_prestamoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_prestamoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_prestamoCuota.setToolTipText(CuotaConstantesFunciones.LABEL_IDPRESTAMO);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelid_prestamoCuota.setLayout(this.gridaBagLayoutCuota);


		jComboBoxid_prestamoCuota= new JComboBoxMe();
		jComboBoxid_prestamoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_prestamoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_prestamoCuota= new JButtonMe();
		this.jButtonid_prestamoCuota.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prestamoCuota.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prestamoCuota.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prestamoCuota.setText("Buscar");
		this.jButtonid_prestamoCuota.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_prestamoCuota.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prestamoCuota,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_prestamoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prestamoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prestamoCuota"));

		this.jButtonid_prestamoCuotaBusqueda= new JButtonMe();
		this.jButtonid_prestamoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_prestamoCuotaBusqueda.setText("U");
		this.jButtonid_prestamoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_prestamoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prestamoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_prestamoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prestamoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prestamoCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_prestamoCuotaBusqueda.setVisible(false);		}

		this.jButtonid_prestamoCuotaUpdate= new JButtonMe();
		this.jButtonid_prestamoCuotaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoCuotaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prestamoCuotaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_prestamoCuotaUpdate.setText("U");
		this.jButtonid_prestamoCuotaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_prestamoCuotaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prestamoCuotaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_prestamoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prestamoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prestamoCuotaUpdate"));



					
		this.jLabelid_estado_cuotaCuota = new JLabelMe();
		this.jLabelid_estado_cuotaCuota.setText(""+CuotaConstantesFunciones.LABEL_IDESTADOCUOTA+" : *");
		this.jLabelid_estado_cuotaCuota.setToolTipText("Estado Cuota");
		this.jLabelid_estado_cuotaCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_cuotaCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_cuotaCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_cuotaCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_cuotaCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_cuotaCuota.setToolTipText(CuotaConstantesFunciones.LABEL_IDESTADOCUOTA);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelid_estado_cuotaCuota.setLayout(this.gridaBagLayoutCuota);


		jComboBoxid_estado_cuotaCuota= new JComboBoxMe();
		jComboBoxid_estado_cuotaCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuotaCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuotaCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_cuotaCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_cuotaCuota= new JButtonMe();
		this.jButtonid_estado_cuotaCuota.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_cuotaCuota.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_cuotaCuota.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_cuotaCuota.setText("Buscar");
		this.jButtonid_estado_cuotaCuota.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_cuotaCuota.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_cuotaCuota,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_cuotaCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_cuotaCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_cuotaCuota"));

		this.jButtonid_estado_cuotaCuotaBusqueda= new JButtonMe();
		this.jButtonid_estado_cuotaCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuotaCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuotaCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_cuotaCuotaBusqueda.setText("U");
		this.jButtonid_estado_cuotaCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_cuotaCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_cuotaCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_cuotaCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_cuotaCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_cuotaCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_cuotaCuotaBusqueda.setVisible(false);		}

		this.jButtonid_estado_cuotaCuotaUpdate= new JButtonMe();
		this.jButtonid_estado_cuotaCuotaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuotaCuotaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuotaCuotaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_cuotaCuotaUpdate.setText("U");
		this.jButtonid_estado_cuotaCuotaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_cuotaCuotaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_cuotaCuotaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_cuotaCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_cuotaCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_cuotaCuotaUpdate"));



					
		this.jLabelid_defi_provision_empleadoCuota = new JLabelMe();
		this.jLabelid_defi_provision_empleadoCuota.setText(""+CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO+" : *");
		this.jLabelid_defi_provision_empleadoCuota.setToolTipText("Defi Provision Empleado");
		this.jLabelid_defi_provision_empleadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_defi_provision_empleadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_defi_provision_empleadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_defi_provision_empleadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_defi_provision_empleadoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_defi_provision_empleadoCuota.setToolTipText(CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
		this.gridaBagLayoutCuota = new GridBagLayout();
		this.jPanelid_defi_provision_empleadoCuota.setLayout(this.gridaBagLayoutCuota);


		jComboBoxid_defi_provision_empleadoCuota= new JComboBoxMe();
		jComboBoxid_defi_provision_empleadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_defi_provision_empleadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_defi_provision_empleadoCuota= new JButtonMe();
		this.jButtonid_defi_provision_empleadoCuota.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoCuota.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoCuota.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoCuota.setText("Buscar");
		this.jButtonid_defi_provision_empleadoCuota.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_defi_provision_empleadoCuota.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoCuota,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_defi_provision_empleadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoCuota"));

		this.jButtonid_defi_provision_empleadoCuotaBusqueda= new JButtonMe();
		this.jButtonid_defi_provision_empleadoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_defi_provision_empleadoCuotaBusqueda.setText("U");
		this.jButtonid_defi_provision_empleadoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_defi_provision_empleadoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_defi_provision_empleadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoCuotaBusqueda"));

		if(this.cuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_defi_provision_empleadoCuotaBusqueda.setVisible(false);		}

		this.jButtonid_defi_provision_empleadoCuotaUpdate= new JButtonMe();
		this.jButtonid_defi_provision_empleadoCuotaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoCuotaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoCuotaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_defi_provision_empleadoCuotaUpdate.setText("U");
		this.jButtonid_defi_provision_empleadoCuotaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_defi_provision_empleadoCuotaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoCuotaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_defi_provision_empleadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoCuotaUpdate"));



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
		//this.jInternalFrameDetalleCuota = new CuotaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuota DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuota= new GridBagLayout();
		

		
		String sToolTipCuota="";
		sToolTipCuota=CuotaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuota+="(Nomina.Cuota)";
		}
		
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuota+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuota = new JButtonMe();
		this.jButtonModificarCuota = new JButtonMe();
        this.jButtonActualizarCuota = new JButtonMe();
        this.jButtonEliminarCuota = new JButtonMe();
        this.jButtonCancelarCuota = new JButtonMe();
        this.jButtonGuardarCambiosCuota = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuota = new JButtonMe();
		this.jButtonCerrarCuota = new JButtonMe();
		
		this.jScrollPanelDatosCuota = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuota = new JScrollPane();
		this.jScrollPanelDatosGeneralCuota = new JScrollPane();
				
		
		
		this.jPanelCamposCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuota";
		
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuotas" + this.sPath));
		} else {
			this.jScrollPanelDatosCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuota.setName("jPanelCamposCuota"); 

		this.jPanelCamposOcultosCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuota.setName("jPanelCamposOcultosCuota"); 

        this.jPanelAccionesCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuota.setToolTipText("Acciones");
        this.jPanelAccionesCuota.setName("Acciones"); 

		this.jPanelAccionesFormularioCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuota.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuota.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuota, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuota, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuota, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuota.setText("Nuevo");
		this.jButtonModificarCuota.setText("Editar");
        this.jButtonActualizarCuota.setText("Actualizar");
        this.jButtonEliminarCuota.setText("Eliminar");
        this.jButtonCancelarCuota.setText("Cancelar");
        this.jButtonGuardarCambiosCuota.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuota.setText("Guardar");
		this.jButtonCerrarCuota.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuota,"nuevo_button","Nuevo",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuota,"modificar_button","Editar",this.cuotaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuota,"actualizar_button","Actualizar",this.cuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuota,"eliminar_button","Eliminar",this.cuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuota,"cancelar_button","Cancelar",this.cuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuota,"guardarcambios_button","Guardar",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuota,"guardarcambiostabla_button","Guardar",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuota,"cerrar_button","Salir",this.cuotaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuota.setToolTipText("Nuevo"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuota.setToolTipText("Editar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuota.setToolTipText("Actualizar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuota.setToolTipText("Eliminar)"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuota.setToolTipText("Cancelar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuota.setToolTipText("Guardar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuota.setToolTipText("Guardar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuota.setToolTipText("Salir"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuota";
		inputMap = this.jButtonNuevoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuota"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuota";
		inputMap = this.jButtonActualizarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuota"));
		
		//ELIMINAR
		sMapKey = "EliminarCuota";
		inputMap = this.jButtonEliminarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuota"));
		
		//CANCELAR	
		sMapKey = "CancelarCuota";
		inputMap = this.jButtonCancelarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuota"));
		
		//CERRAR		
		sMapKey = "CerrarCuota";
		inputMap = this.jButtonCerrarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuota"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuota";
		inputMap = this.jButtonGuardarCambiosTablaCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuota"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuota.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuota.setToolTipText("Nuevo Cuota");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuota.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuota.setToolTipText("Sin Cerrar Ventana Cuota");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuota, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuota.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuota.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuota, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuota.setText("Accion");
		this.jComboBoxTiposAccionesCuota.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuota.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuota.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuota = new JLabelMe();
		
		this.jLabelAccionesCuota.setText("Acciones");		
		this.jLabelAccionesCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuota();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuota();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuota=new JTabbedPane();
		this.jTabbedPaneRelacionesCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuota.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuota.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuota.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuota, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuota = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuota = new GridBagLayout();
		
		this.jPanelCamposCuota.setLayout(gridaBagLayoutCamposCuota);
		this.jPanelCamposOcultosCuota.setLayout(gridaBagLayoutCamposOcultosCuota);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuota.add(jLabelIdCuota, this.gridBagConstraintsCuota);



	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuota.add(jLabelidCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_prestamoCuota.add(jLabelid_prestamoCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_prestamoCuota.add(jButtonid_prestamoCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 3;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_prestamoCuota.add(jButtonid_prestamoCuotaUpdate, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_prestamoCuota.add(jComboBoxid_prestamoCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_cuotaCuota.add(jLabelid_estado_cuotaCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_cuotaCuota.add(jButtonid_estado_cuotaCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 3;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_cuotaCuota.add(jButtonid_estado_cuotaCuotaUpdate, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_cuotaCuota.add(jComboBoxid_estado_cuotaCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_defi_provision_empleadoCuota.add(jLabelid_defi_provision_empleadoCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_defi_provision_empleadoCuota.add(jButtonid_defi_provision_empleadoCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 3;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_defi_provision_empleadoCuota.add(jButtonid_defi_provision_empleadoCuotaUpdate, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_defi_provision_empleadoCuota.add(jComboBoxid_defi_provision_empleadoCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuotaCuota.add(jLabelnumero_cuotaCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuotaCuota.add(jButtonnumero_cuotaCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuotaCuota.add(jTextFieldnumero_cuotaCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcapitalCuota.add(jLabelcapitalCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelcapitalCuota.add(jButtoncapitalCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcapitalCuota.add(jTextFieldcapitalCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinteresCuota.add(jLabelinteresCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelinteresCuota.add(jButtoninteresCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinteresCuota.add(jTextFieldinteresCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalCuota.add(jLabeltotalCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalCuota.add(jButtontotalCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalCuota.add(jTextFieldtotalCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_liquidacionCuota.add(jLabelfecha_liquidacionCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_liquidacionCuota.add(jButtonfecha_liquidacionCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_liquidacionCuota.add(jTextFieldfecha_liquidacionCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_ajusteCuota.add(jLabelmonto_ajusteCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ajusteCuota.add(jButtonmonto_ajusteCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_ajusteCuota.add(jTextFieldmonto_ajusteCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinteres_ajusteCuota.add(jLabelinteres_ajusteCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelinteres_ajusteCuota.add(jButtoninteres_ajusteCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinteres_ajusteCuota.add(jTextFieldinteres_ajusteCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoCuota.add(jLabelfecha_vencimientoCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoCuota.add(jButtonfecha_vencimientoCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoCuota.add(jDateChooserfecha_vencimientoCuota, this.gridBagConstraintsCuota);


	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 0;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCuota.add(jLabeldescripcionCuota, this.gridBagConstraintsCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 2;
		this.gridBagConstraintsCuota.ipadx = 0;
		this.gridBagConstraintsCuota.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCuota.add(jButtondescripcionCuotaBusqueda, this.gridBagConstraintsCuota);
	}

	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuota.gridy = 0;
	this.gridBagConstraintsCuota.gridx = 1;
	this.gridBagConstraintsCuota.ipadx = 0;
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCuota.add(jscrollPanedescripcionCuota, this.gridBagConstraintsCuota);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelidCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelid_prestamoCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelid_estado_cuotaCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelid_defi_provision_empleadoCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelnumero_cuotaCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelcapitalCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelinteresCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPaneltotalCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelfecha_liquidacionCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelmonto_ajusteCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelinteres_ajusteCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPanelfecha_vencimientoCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
	}
	this.gridBagConstraintsCuota = new GridBagConstraints();
	this.gridBagConstraintsCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuota.gridy = iYPanelCamposCuota;
	this.gridBagConstraintsCuota.gridx = iXPanelCamposCuota++;
	this.gridBagConstraintsCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuota.add(this.jPaneldescripcionCuota, this.gridBagConstraintsCuota);



	if(iXPanelCamposCuota % 1==0) {
		iXPanelCamposCuota=0;
		iYPanelCamposCuota++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuota= new GridBagLayout();
		this.jPanelAccionesCuota.setLayout(gridaBagLayoutAccionesCuota);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuota= new GridBagLayout();
		this.jPanelAccionesFormularioCuota.setLayout(gridaBagLayoutAccionesFormularioCuota);
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuota.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuota.add(this.jComboBoxTiposAccionesFormularioCuota, this.gridBagConstraintsCuota);

		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuota.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuota.add(this.jCheckBoxPostAccionNuevoCuota, this.gridBagConstraintsCuota);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuotaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuota.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuota.add(this.jCheckBoxPostAccionSinCerrarCuota, this.gridBagConstraintsCuota);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuotaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuota.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuota.add(this.jCheckBoxPostAccionSinMensajeCuota, this.gridBagConstraintsCuota);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuota.add(this.jButtonModificarCuota, this.gridBagConstraintsCuota);							

		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuota.add(this.jButtonEliminarCuota, this.gridBagConstraintsCuota);
		
			
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = 0;		
		this.gridBagConstraintsCuota.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuota.add(this.jButtonActualizarCuota, this.gridBagConstraintsCuota);


		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = 0;		
		this.gridBagConstraintsCuota.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuota.add(this.jButtonGuardarCambiosCuota, this.gridBagConstraintsCuota);	
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = 0;		
		this.gridBagConstraintsCuota.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuota.add(this.jButtonCancelarCuota, this.gridBagConstraintsCuota);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuota = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuota);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuota = new GridBagConstraints();						
			this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuota.gridx = 0;		
			//this.gridBagConstraintsCuota.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuota.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuota.gridx =0;
		this.gridBagConstraintsCuota.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuota.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuota, this.gridBagConstraintsCuota);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuotaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuota = new CuotaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuota DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuota DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuota Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuotaModel cuotaModel=new CuotaModel(this);
			
			//SI USARA CLASE INTERNA
			//CuotaModel.CuotaFocusTraversalPolicy cuotaFocusTraversalPolicy = cuotaModel.new CuotaFocusTraversalPolicy(this);
			
			//cuotaFocusTraversalPolicy.setcuotaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuotaModel);
			
			
			this.jContentPaneDetalleCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuota = new GridBagLayout();	
			this.jContentPaneDetalleCuota.setLayout(gridaBagLayoutDetalleCuota);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuota = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuota = new GridBagConstraints();
				this.gridBagConstraintsCuota.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuota.gridx = 0;
					
				
				this.jContentPaneDetalleCuota.add(jTtoolBarDetalleCuota, gridBagConstraintsCuota);								
				
}
			
			this.jScrollPanelDatosEdicionCuota=   new JScrollPane(jContentPaneDetalleCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuota=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuota.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuota.gridx = 0;
	        
			this.jContentPaneDetalleCuota.add(jPanelCamposCuota, gridBagConstraintsCuota);
			
			
			
			
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
						&& cuotaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuotaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuota= new GridBagConstraints();
						this.gridBagConstraintsCuota.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuota.gridx = 0;
						this.jContentPaneDetalleCuota.add(this.jTabbedPaneRelacionesCuota, this.gridBagConstraintsCuota);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuota.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuota.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuota = new GridBagConstraints();
					this.gridBagConstraintsCuota.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuota.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuota.gridx = 0;
					
				
					this.jContentPaneDetalleCuota.add(jPanelCamposOcultosCuota, gridBagConstraintsCuota);
				
					this.jPanelCamposOcultosCuota.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuota.gridx = 0;
	        this.gridBagConstraintsCuota.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuota.add(this.jPanelAccionesFormularioCuota, this.gridBagConstraintsCuota);							
			
			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
	        this.gridBagConstraintsCuota.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuota.gridx = 0;
	        
			
			this.jContentPaneDetalleCuota.add(this.jPanelAccionesCuota, this.gridBagConstraintsCuota);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuota);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuota=   new JScrollPane(this.jPanelCamposCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuota.gridx = 0;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuota.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuota, this.gridBagConstraintsCuota);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuota.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuota, this.gridBagConstraintsCuota);			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuota.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuota, this.gridBagConstraintsCuota);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuota, this.gridBagConstraintsCuota);
			
			
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuota, this.gridBagConstraintsCuota);
		
			
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuota, this.gridBagConstraintsCuota);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuota;//jContentPane;
		
		return jScrollPanelDatosEdicionCuota;
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
