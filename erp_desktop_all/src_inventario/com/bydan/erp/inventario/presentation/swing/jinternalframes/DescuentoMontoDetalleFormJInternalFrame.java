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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DescuentoMontoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DescuentoMontoDetalleFormJInternalFrame extends DescuentoMontoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDescuentoMonto;
	
	protected JMenuBar jmenuBarDetalleDescuentoMonto;
	
	protected JMenu jmenuDetalleDescuentoMonto;
	protected JMenu jmenuDetalleArchivoDescuentoMonto;
	protected JMenu jmenuDetalleAccionesDescuentoMonto;
	protected JMenu jmenuDetalleDatosDescuentoMonto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDescuentoMonto;	
	protected GridBagConstraints gridBagConstraintsDescuentoMonto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DescuentoMontoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDescuentoMonto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";
	
	public DescuentoMontoSessionBean descuentomontoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;	
	
	public DescuentoMontoLogic descuentomontoLogic;
	
	public JScrollPane jScrollPanelDatosDescuentoMonto;
	public JScrollPane jScrollPanelDatosEdicionDescuentoMonto;
	public JScrollPane jScrollPanelDatosGeneralDescuentoMonto;
	
	protected JPanel jPanelCamposDescuentoMonto;    
	protected JPanel jPanelCamposOcultosDescuentoMonto;    	
	protected JPanel jPanelAccionesDescuentoMonto;
	protected JPanel jPanelAccionesFormularioDescuentoMonto;
    
	
	
	protected Integer iXPanelCamposDescuentoMonto=0;
	protected Integer iYPanelCamposDescuentoMonto=0;
	
	protected Integer iXPanelCamposOcultosDescuentoMonto=0;
	protected Integer iYPanelCamposOcultosDescuentoMonto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDescuentoMonto;
	public JButton jButtonModificarDescuentoMonto;
	public JButton jButtonActualizarDescuentoMonto;
    public JButton jButtonEliminarDescuentoMonto;
	public JButton jButtonCancelarDescuentoMonto;
    public JButton jButtonGuardarCambiosDescuentoMonto;
	public JButton jButtonGuardarCambiosTablaDescuentoMonto;
	protected JButton jButtonCerrarDescuentoMonto;
	
	
	protected JButton jButtonProcesarInformacionDescuentoMonto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDescuentoMonto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDescuentoMonto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDescuentoMonto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDescuentoMonto;
	protected JButton jButtonModificarToolBarDescuentoMonto;
	protected JButton jButtonActualizarToolBarDescuentoMonto;
    protected JButton jButtonEliminarToolBarDescuentoMonto;
	protected JButton jButtonCancelarToolBarDescuentoMonto;
    protected JButton jButtonGuardarCambiosToolBarDescuentoMonto;
	protected JButton jButtonGuardarCambiosTablaToolBarDescuentoMonto;
	protected JButton jButtonMostrarOcultarTablaToolBarDescuentoMonto;
	protected JButton jButtonCerrarToolBarDescuentoMonto;
	
	protected JButton jButtonProcesarInformacionToolBarDescuentoMonto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDescuentoMonto;
	protected JMenuItem jMenuItemModificarDescuentoMonto;
	protected JMenuItem jMenuItemActualizarDescuentoMonto;
    protected JMenuItem jMenuItemEliminarDescuentoMonto;
	protected JMenuItem jMenuItemCancelarDescuentoMonto;
    protected JMenuItem jMenuItemGuardarCambiosDescuentoMonto;
	protected JMenuItem jMenuItemGuardarCambiosTablaDescuentoMonto;
	protected JMenuItem jMenuItemCerrarDescuentoMonto;
	protected JMenuItem jMenuItemDetalleCerrarDescuentoMonto;
	protected JMenuItem jMenuItemDetalleMostarOcultarDescuentoMonto;
	
	protected JMenuItem jMenuItemProcesarInformacionDescuentoMonto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDescuentoMonto;
	protected JMenuItem jMenuItemMostrarOcultarDescuentoMonto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDescuentoMonto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDescuentoMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDescuentoMonto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDescuentoMonto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDescuentoMonto;
	public JLabel jLabelIdDescuentoMonto;
	public JLabel jLabelidDescuentoMonto;
	public JButton jButtonidDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDescuentoMonto;
	public JLabel jLabeldescripcionDescuentoMonto;
	public JTextArea jTextAreadescripcionDescuentoMonto;
	public JScrollPane jscrollPanedescripcionDescuentoMonto;
	public JButton jButtondescripcionDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeDescuentoMonto;
	public JLabel jLabelporcentajeDescuentoMonto;
	public JTextField jTextFieldporcentajeDescuentoMonto;
	public JButton jButtonporcentajeDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_inicioDescuentoMonto;
	public JLabel jLabelvalor_inicioDescuentoMonto;
	public JTextField jTextFieldvalor_inicioDescuentoMonto;
	public JButton jButtonvalor_inicioDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_finDescuentoMonto;
	public JLabel jLabelvalor_finDescuentoMonto;
	public JTextField jTextFieldvalor_finDescuentoMonto;
	public JButton jButtonvalor_finDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoDescuentoMonto;
	public JLabel jLabelesta_activoDescuentoMonto;
	public JCheckBox jCheckBoxesta_activoDescuentoMonto;
	public JButton jButtonesta_activoDescuentoMontoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDescuentoMonto;
	public JLabel jLabelid_empresaDescuentoMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDescuentoMonto;
	public JButton jButtonid_empresaDescuentoMonto= new JButtonMe();
	public JButton jButtonid_empresaDescuentoMontoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDescuentoMonto;
	public JLabel jLabelid_sucursalDescuentoMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDescuentoMonto;
	public JButton jButtonid_sucursalDescuentoMonto= new JButtonMe();
	public JButton jButtonid_sucursalDescuentoMontoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioDescuentoMonto;
	public JLabel jLabelid_usuarioDescuentoMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioDescuentoMonto;
	public JButton jButtonid_usuarioDescuentoMonto= new JButtonMe();
	public JButton jButtonid_usuarioDescuentoMontoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioDescuentoMontoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDescuentoMonto;
	public JLabel jLabelid_bodegaDescuentoMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDescuentoMonto;
	public JButton jButtonid_bodegaDescuentoMonto= new JButtonMe();
	public JButton jButtonid_bodegaDescuentoMontoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDescuentoMontoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDescuentoMonto;
	
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
	
	public DescuentoMontoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDescuentoMonto=new JPanel();
				this.jPanelAccionesFormularioDescuentoMonto=new JPanel();
				this.jmenuBarDetalleDescuentoMonto=new JMenuBar();
				this.jTtoolBarDetalleDescuentoMonto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoMontoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DescuentoMontoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoMontoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoMontoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoMontoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDescuentoMonto() {
		return this.jButtonActualizarToolBarDescuentoMonto;
	}
	
	public JButton getjButtonEliminarToolBarDescuentoMonto() {
		return this.jButtonEliminarToolBarDescuentoMonto;
	}
	
	public JButton getjButtonCancelarToolBarDescuentoMonto() {
		return this.jButtonCancelarToolBarDescuentoMonto;
	}		
	
	public JButton getjButtonProcesarInformacionDescuentoMonto() {
		return this.jButtonProcesarInformacionDescuentoMonto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDescuentoMonto)	{
		this.jButtonProcesarInformacionDescuentoMonto = jButtonProcesarInformacionDescuentoMonto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDescuentoMonto() {
		return this.jComboBoxTiposAccionesDescuentoMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDescuentoMonto(
			JComboBox jComboBoxTiposRelacionesDescuentoMonto) {
		this.jComboBoxTiposRelacionesDescuentoMonto = jComboBoxTiposRelacionesDescuentoMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDescuentoMonto(
			JComboBox jComboBoxTiposAccionesDescuentoMonto) {
		this.jComboBoxTiposAccionesDescuentoMonto = jComboBoxTiposAccionesDescuentoMonto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDescuentoMonto() {
		return this.jComboBoxTiposAccionesFormularioDescuentoMonto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDescuentoMonto(
			JComboBox jComboBoxTiposAccionesFormularioDescuentoMonto) {
		this.jComboBoxTiposAccionesFormularioDescuentoMonto = jComboBoxTiposAccionesFormularioDescuentoMonto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
		
		this.descuentomontoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.descuentomontoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.descuentomontoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DescuentoMontoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Descuento Monto MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
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
	
		DescuentoMontoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDescuentoMonto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDescuentoMonto=new JButtonMe();
				this.jButtonModificarToolBarDescuentoMonto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDescuentoMonto,this.jTtoolBarDetalleDescuentoMonto,
							"actualizar","actualizar","Actualizar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDescuentoMonto,this.jTtoolBarDetalleDescuentoMonto,
							"eliminar","eliminar","Eliminar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDescuentoMonto,this.jTtoolBarDetalleDescuentoMonto,
							"cancelar","cancelar","Cancelar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDescuentoMonto,this.jTtoolBarDetalleDescuentoMonto,
							"guardarcambios","guardarcambios","Guardar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDescuentoMonto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDescuentoMonto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDescuentoMonto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDescuentoMonto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDescuentoMonto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDescuentoMonto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDescuentoMonto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDescuentoMonto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDescuentoMonto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDescuentoMonto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDescuentoMonto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDescuentoMonto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDescuentoMonto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDescuentoMonto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDescuentoMonto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDescuentoMonto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDescuentoMonto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDescuentoMonto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDescuentoMonto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDescuentoMonto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDescuentoMonto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDescuentoMonto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDescuentoMonto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDescuentoMonto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDescuentoMonto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDescuentoMonto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDescuentoMonto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDescuentoMonto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDescuentoMonto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDescuentoMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDescuentoMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDescuentoMonto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDescuentoMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDescuentoMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDescuentoMonto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDescuentoMonto.add(this.jMenuItemDetalleCerrarDescuentoMonto);
		
		this.jmenuDetalleAccionesDescuentoMonto.add(this.jMenuItemActualizarDescuentoMonto);
		this.jmenuDetalleAccionesDescuentoMonto.add(this.jMenuItemEliminarDescuentoMonto);
		this.jmenuDetalleAccionesDescuentoMonto.add(this.jMenuItemCancelarDescuentoMonto);		
		
		//this.jmenuDetalleDatosDescuentoMonto.add(this.jMenuItemDetalleAbrirOrderByDescuentoMonto);				
		this.jmenuDetalleDatosDescuentoMonto.add(this.jMenuItemDetalleMostarOcultarDescuentoMonto);				
				
		//this.jmenuDetalleAccionesDescuentoMonto.add(this.jMenuItemGuardarCambiosDescuentoMonto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDescuentoMonto.add(this.jmenuDetalleArchivoDescuentoMonto);		
		this.jmenuBarDetalleDescuentoMonto.add(this.jmenuDetalleAccionesDescuentoMonto);		
		this.jmenuBarDetalleDescuentoMonto.add(this.jmenuDetalleDatosDescuentoMonto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDescuentoMonto);				
	}
	
	
	public void inicializarElementosCamposDescuentoMonto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDescuentoMonto = new JLabelMe();
		jLabelIdDescuentoMonto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDescuentoMonto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDescuentoMonto= new GridBagLayout();

		this.jPanelidDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);

		jLabelidDescuentoMonto = new JLabel();
		jLabelidDescuentoMonto.setText("Id");

		jLabelidDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDescuentoMonto = new JLabelMe();
		this.jLabeldescripcionDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDescuentoMonto.setToolTipText("Descripcion");
		this.jLabeldescripcionDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPaneldescripcionDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jTextAreadescripcionDescuentoMonto= new JTextAreaMe();
		jTextAreadescripcionDescuentoMonto.setEnabled(false);
		jTextAreadescripcionDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDescuentoMonto.setLineWrap(true);
		jTextAreadescripcionDescuentoMonto.setWrapStyleWord(true);
		jTextAreadescripcionDescuentoMonto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDescuentoMonto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDescuentoMonto = new JScrollPane(jTextAreadescripcionDescuentoMonto);
		jscrollPanedescripcionDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDescuentoMontoBusqueda= new JButtonMe();
		this.jButtondescripcionDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDescuentoMontoBusqueda.setText("U");
		this.jButtondescripcionDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDescuentoMontoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeDescuentoMonto = new JLabelMe();
		this.jLabelporcentajeDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeDescuentoMonto.setToolTipText("Porcentaje");
		this.jLabelporcentajeDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelporcentajeDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jTextFieldporcentajeDescuentoMonto= new JTextFieldMe();
		jTextFieldporcentajeDescuentoMonto.setEnabled(false);
		jTextFieldporcentajeDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeDescuentoMonto.setText("0.0");

		this.jButtonporcentajeDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonporcentajeDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeDescuentoMontoBusqueda.setText("U");
		this.jButtonporcentajeDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeDescuentoMontoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_inicioDescuentoMonto = new JLabelMe();
		this.jLabelvalor_inicioDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_VALORINICIO+" : *");
		this.jLabelvalor_inicioDescuentoMonto.setToolTipText("Valor Inicio");
		this.jLabelvalor_inicioDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_inicioDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_inicioDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_inicioDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_inicioDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_inicioDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_VALORINICIO);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelvalor_inicioDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jTextFieldvalor_inicioDescuentoMonto= new JTextFieldMe();
		jTextFieldvalor_inicioDescuentoMonto.setEnabled(false);
		jTextFieldvalor_inicioDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_inicioDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_inicioDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_inicioDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_inicioDescuentoMonto.setText("0.0");

		this.jButtonvalor_inicioDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonvalor_inicioDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_inicioDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_inicioDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_inicioDescuentoMontoBusqueda.setText("U");
		this.jButtonvalor_inicioDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_inicioDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_inicioDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_inicioDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_inicioDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_inicioDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_inicioDescuentoMontoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_finDescuentoMonto = new JLabelMe();
		this.jLabelvalor_finDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_VALORFIN+" : *");
		this.jLabelvalor_finDescuentoMonto.setToolTipText("Valor Fin");
		this.jLabelvalor_finDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_finDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_finDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_finDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_finDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_finDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_VALORFIN);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelvalor_finDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jTextFieldvalor_finDescuentoMonto= new JTextFieldMe();
		jTextFieldvalor_finDescuentoMonto.setEnabled(false);
		jTextFieldvalor_finDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_finDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_finDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_finDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_finDescuentoMonto.setText("0.0");

		this.jButtonvalor_finDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonvalor_finDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_finDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_finDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_finDescuentoMontoBusqueda.setText("U");
		this.jButtonvalor_finDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_finDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_finDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_finDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_finDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_finDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_finDescuentoMontoBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoDescuentoMonto = new JLabelMe();
		this.jLabelesta_activoDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoDescuentoMonto.setToolTipText("Esta Activo");
		this.jLabelesta_activoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelesta_activoDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jCheckBoxesta_activoDescuentoMonto= new JCheckBoxMe();
		jCheckBoxesta_activoDescuentoMonto.setEnabled(false);

		jCheckBoxesta_activoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonesta_activoDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoDescuentoMontoBusqueda.setText("U");
		this.jButtonesta_activoDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoDescuentoMontoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDescuentoMonto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDescuentoMonto = new JLabelMe();
		this.jLabelid_empresaDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDescuentoMonto.setToolTipText("Empresa");
		this.jLabelid_empresaDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelid_empresaDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jComboBoxid_empresaDescuentoMonto= new JComboBoxMe();
		jComboBoxid_empresaDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDescuentoMonto.setEnabled(false);

		this.jButtonid_empresaDescuentoMonto= new JButtonMe();
		this.jButtonid_empresaDescuentoMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDescuentoMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDescuentoMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDescuentoMonto.setText("Buscar");
		this.jButtonid_empresaDescuentoMonto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDescuentoMonto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDescuentoMonto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDescuentoMonto"));

		this.jButtonid_empresaDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonid_empresaDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDescuentoMontoBusqueda.setText("U");
		this.jButtonid_empresaDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDescuentoMontoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDescuentoMontoUpdate= new JButtonMe();
		this.jButtonid_empresaDescuentoMontoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoMontoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoMontoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDescuentoMontoUpdate.setText("U");
		this.jButtonid_empresaDescuentoMontoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDescuentoMontoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDescuentoMontoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDescuentoMontoUpdate"));



					
		this.jLabelid_sucursalDescuentoMonto = new JLabelMe();
		this.jLabelid_sucursalDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDescuentoMonto.setToolTipText("Sucursal");
		this.jLabelid_sucursalDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelid_sucursalDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jComboBoxid_sucursalDescuentoMonto= new JComboBoxMe();
		jComboBoxid_sucursalDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDescuentoMonto.setEnabled(false);

		this.jButtonid_sucursalDescuentoMonto= new JButtonMe();
		this.jButtonid_sucursalDescuentoMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDescuentoMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDescuentoMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDescuentoMonto.setText("Buscar");
		this.jButtonid_sucursalDescuentoMonto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDescuentoMonto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDescuentoMonto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDescuentoMonto"));

		this.jButtonid_sucursalDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDescuentoMontoBusqueda.setText("U");
		this.jButtonid_sucursalDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDescuentoMontoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDescuentoMontoUpdate= new JButtonMe();
		this.jButtonid_sucursalDescuentoMontoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoMontoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoMontoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDescuentoMontoUpdate.setText("U");
		this.jButtonid_sucursalDescuentoMontoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDescuentoMontoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDescuentoMontoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDescuentoMontoUpdate"));



					
		this.jLabelid_usuarioDescuentoMonto = new JLabelMe();
		this.jLabelid_usuarioDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioDescuentoMonto.setToolTipText("Usuario");
		this.jLabelid_usuarioDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelid_usuarioDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jComboBoxid_usuarioDescuentoMonto= new JComboBoxMe();
		jComboBoxid_usuarioDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioDescuentoMonto.setEnabled(false);

		this.jButtonid_usuarioDescuentoMonto= new JButtonMe();
		this.jButtonid_usuarioDescuentoMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDescuentoMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDescuentoMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDescuentoMonto.setText("Buscar");
		this.jButtonid_usuarioDescuentoMonto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioDescuentoMonto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDescuentoMonto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDescuentoMonto"));

		this.jButtonid_usuarioDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonid_usuarioDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDescuentoMontoBusqueda.setText("U");
		this.jButtonid_usuarioDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioDescuentoMontoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioDescuentoMontoUpdate= new JButtonMe();
		this.jButtonid_usuarioDescuentoMontoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoMontoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoMontoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDescuentoMontoUpdate.setText("U");
		this.jButtonid_usuarioDescuentoMontoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioDescuentoMontoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDescuentoMontoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDescuentoMontoUpdate"));



					
		this.jLabelid_bodegaDescuentoMonto = new JLabelMe();
		this.jLabelid_bodegaDescuentoMonto.setText(""+DescuentoMontoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDescuentoMonto.setToolTipText("Bodega");
		this.jLabelid_bodegaDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDescuentoMonto.setToolTipText(DescuentoMontoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDescuentoMonto = new GridBagLayout();
		this.jPanelid_bodegaDescuentoMonto.setLayout(this.gridaBagLayoutDescuentoMonto);


		jComboBoxid_bodegaDescuentoMonto= new JComboBoxMe();
		jComboBoxid_bodegaDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDescuentoMonto= new JButtonMe();
		this.jButtonid_bodegaDescuentoMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDescuentoMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDescuentoMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDescuentoMonto.setText("Buscar");
		this.jButtonid_bodegaDescuentoMonto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDescuentoMonto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDescuentoMonto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDescuentoMonto"));

		this.jButtonid_bodegaDescuentoMontoBusqueda= new JButtonMe();
		this.jButtonid_bodegaDescuentoMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDescuentoMontoBusqueda.setText("U");
		this.jButtonid_bodegaDescuentoMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDescuentoMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDescuentoMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDescuentoMontoBusqueda"));

		if(this.descuentomontoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDescuentoMontoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDescuentoMontoUpdate= new JButtonMe();
		this.jButtonid_bodegaDescuentoMontoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoMontoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoMontoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDescuentoMontoUpdate.setText("U");
		this.jButtonid_bodegaDescuentoMontoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDescuentoMontoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDescuentoMontoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDescuentoMontoUpdate"));



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
		//this.jInternalFrameDetalleDescuentoMonto = new DescuentoMontoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Descuento Monto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDescuentoMonto= new GridBagLayout();
		

		
		String sToolTipDescuentoMonto="";
		sToolTipDescuentoMonto=DescuentoMontoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDescuentoMonto+="(Inventario.DescuentoMonto)";
		}
		
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDescuentoMonto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDescuentoMonto = new JButtonMe();
		this.jButtonModificarDescuentoMonto = new JButtonMe();
        this.jButtonActualizarDescuentoMonto = new JButtonMe();
        this.jButtonEliminarDescuentoMonto = new JButtonMe();
        this.jButtonCancelarDescuentoMonto = new JButtonMe();
        this.jButtonGuardarCambiosDescuentoMonto = new JButtonMe();
		this.jButtonGuardarCambiosTablaDescuentoMonto = new JButtonMe();
		this.jButtonCerrarDescuentoMonto = new JButtonMe();
		
		this.jScrollPanelDatosDescuentoMonto = new JScrollPane();   
        this.jScrollPanelDatosEdicionDescuentoMonto = new JScrollPane();
		this.jScrollPanelDatosGeneralDescuentoMonto = new JScrollPane();
				
		
		
		this.jPanelCamposDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Descuento Monto";
		
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Montos" + this.sPath));
		} else {
			this.jScrollPanelDatosDescuentoMonto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDescuentoMonto.setName("jPanelCamposDescuentoMonto"); 

		this.jPanelCamposOcultosDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDescuentoMonto.setName("jPanelCamposOcultosDescuentoMonto"); 

        this.jPanelAccionesDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDescuentoMonto.setToolTipText("Acciones");
        this.jPanelAccionesDescuentoMonto.setName("Acciones"); 

		this.jPanelAccionesFormularioDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDescuentoMonto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDescuentoMonto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDescuentoMonto.setText("Nuevo");
		this.jButtonModificarDescuentoMonto.setText("Editar");
        this.jButtonActualizarDescuentoMonto.setText("Actualizar");
        this.jButtonEliminarDescuentoMonto.setText("Eliminar");
        this.jButtonCancelarDescuentoMonto.setText("Cancelar");
        this.jButtonGuardarCambiosDescuentoMonto.setText("Guardar");
		this.jButtonGuardarCambiosTablaDescuentoMonto.setText("Guardar");
		this.jButtonCerrarDescuentoMonto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDescuentoMonto,"nuevo_button","Nuevo",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDescuentoMonto,"modificar_button","Editar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDescuentoMonto,"actualizar_button","Actualizar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDescuentoMonto,"eliminar_button","Eliminar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDescuentoMonto,"cancelar_button","Cancelar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDescuentoMonto,"guardarcambios_button","Guardar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDescuentoMonto,"guardarcambiostabla_button","Guardar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDescuentoMonto,"cerrar_button","Salir",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDescuentoMonto.setToolTipText("Nuevo"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDescuentoMonto.setToolTipText("Editar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDescuentoMonto.setToolTipText("Actualizar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDescuentoMonto.setToolTipText("Eliminar)"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDescuentoMonto.setToolTipText("Cancelar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDescuentoMonto.setToolTipText("Guardar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDescuentoMonto.setToolTipText("Guardar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDescuentoMonto.setToolTipText("Salir"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDescuentoMonto";
		inputMap = this.jButtonNuevoDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDescuentoMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDescuentoMonto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDescuentoMonto";
		inputMap = this.jButtonActualizarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDescuentoMonto"));
		
		//ELIMINAR
		sMapKey = "EliminarDescuentoMonto";
		inputMap = this.jButtonEliminarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDescuentoMonto"));
		
		//CANCELAR	
		sMapKey = "CancelarDescuentoMonto";
		inputMap = this.jButtonCancelarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDescuentoMonto"));
		
		//CERRAR		
		sMapKey = "CerrarDescuentoMonto";
		inputMap = this.jButtonCerrarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDescuentoMonto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDescuentoMonto";
		inputMap = this.jButtonGuardarCambiosTablaDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDescuentoMonto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDescuentoMonto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDescuentoMonto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDescuentoMonto.setToolTipText("Nuevo DescuentoMonto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDescuentoMonto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDescuentoMonto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDescuentoMonto.setToolTipText("Sin Cerrar Ventana DescuentoMonto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDescuentoMonto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDescuentoMonto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDescuentoMonto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDescuentoMonto.setText("Accion");
		this.jComboBoxTiposAccionesDescuentoMonto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDescuentoMonto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDescuentoMonto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDescuentoMonto = new JLabelMe();
		
		this.jLabelAccionesDescuentoMonto.setText("Acciones");		
		this.jLabelAccionesDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDescuentoMonto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDescuentoMonto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDescuentoMonto=new JTabbedPane();
		this.jTabbedPaneRelacionesDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDescuentoMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDescuentoMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDescuentoMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDescuentoMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDescuentoMonto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDescuentoMonto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDescuentoMonto = new GridBagLayout();
		
		this.jPanelCamposDescuentoMonto.setLayout(gridaBagLayoutCamposDescuentoMonto);
		this.jPanelCamposOcultosDescuentoMonto.setLayout(gridaBagLayoutCamposOcultosDescuentoMonto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDescuentoMonto.add(jLabelIdDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDescuentoMonto.add(jLabelidDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDescuentoMonto.add(jLabelid_empresaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDescuentoMonto.add(jButtonid_empresaDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 3;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDescuentoMonto.add(jButtonid_empresaDescuentoMontoUpdate, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDescuentoMonto.add(jComboBoxid_empresaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDescuentoMonto.add(jLabelid_sucursalDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDescuentoMonto.add(jButtonid_sucursalDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 3;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDescuentoMonto.add(jButtonid_sucursalDescuentoMontoUpdate, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDescuentoMonto.add(jComboBoxid_sucursalDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioDescuentoMonto.add(jLabelid_usuarioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDescuentoMonto.add(jButtonid_usuarioDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 3;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDescuentoMonto.add(jButtonid_usuarioDescuentoMontoUpdate, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioDescuentoMonto.add(jComboBoxid_usuarioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDescuentoMonto.add(jLabelid_bodegaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDescuentoMonto.add(jButtonid_bodegaDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 3;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDescuentoMonto.add(jButtonid_bodegaDescuentoMontoUpdate, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDescuentoMonto.add(jComboBoxid_bodegaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDescuentoMonto.add(jLabeldescripcionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDescuentoMonto.add(jButtondescripcionDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDescuentoMonto.add(jscrollPanedescripcionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeDescuentoMonto.add(jLabelporcentajeDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeDescuentoMonto.add(jButtonporcentajeDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeDescuentoMonto.add(jTextFieldporcentajeDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_inicioDescuentoMonto.add(jLabelvalor_inicioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_inicioDescuentoMonto.add(jButtonvalor_inicioDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_inicioDescuentoMonto.add(jTextFieldvalor_inicioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_finDescuentoMonto.add(jLabelvalor_finDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_finDescuentoMonto.add(jButtonvalor_finDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_finDescuentoMonto.add(jTextFieldvalor_finDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 0;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoDescuentoMonto.add(jLabelesta_activoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 2;
		this.gridBagConstraintsDescuentoMonto.ipadx = 0;
		this.gridBagConstraintsDescuentoMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoDescuentoMonto.add(jButtonesta_activoDescuentoMontoBusqueda, this.gridBagConstraintsDescuentoMonto);
	}

	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoMonto.gridy = 0;
	this.gridBagConstraintsDescuentoMonto.gridx = 1;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoDescuentoMonto.add(jCheckBoxesta_activoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoMonto.add(this.jPanelidDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposDescuentoMonto % 1==0) {
		iXPanelCamposDescuentoMonto=0;
		iYPanelCamposDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoMonto.add(this.jPanelid_bodegaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposDescuentoMonto % 1==0) {
		iXPanelCamposDescuentoMonto=0;
		iYPanelCamposDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoMonto.add(this.jPaneldescripcionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposDescuentoMonto % 1==0) {
		iXPanelCamposDescuentoMonto=0;
		iYPanelCamposDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoMonto.add(this.jPanelporcentajeDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposDescuentoMonto % 1==0) {
		iXPanelCamposDescuentoMonto=0;
		iYPanelCamposDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoMonto.add(this.jPanelvalor_inicioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposDescuentoMonto % 1==0) {
		iXPanelCamposDescuentoMonto=0;
		iYPanelCamposDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoMonto.add(this.jPanelvalor_finDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposDescuentoMonto % 1==0) {
		iXPanelCamposDescuentoMonto=0;
		iYPanelCamposDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoMonto.add(this.jPanelesta_activoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposDescuentoMonto % 1==0) {
		iXPanelCamposDescuentoMonto=0;
		iYPanelCamposDescuentoMonto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposOcultosDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposOcultosDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDescuentoMonto.add(this.jPanelid_empresaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposOcultosDescuentoMonto % 1==0) {
		iXPanelCamposOcultosDescuentoMonto=0;
		iYPanelCamposOcultosDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposOcultosDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposOcultosDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDescuentoMonto.add(this.jPanelid_sucursalDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposOcultosDescuentoMonto % 1==0) {
		iXPanelCamposOcultosDescuentoMonto=0;
		iYPanelCamposOcultosDescuentoMonto++;
	}
	this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoMonto.gridy = iYPanelCamposOcultosDescuentoMonto;
	this.gridBagConstraintsDescuentoMonto.gridx = iXPanelCamposOcultosDescuentoMonto++;
	this.gridBagConstraintsDescuentoMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDescuentoMonto.add(this.jPanelid_usuarioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);



	if(iXPanelCamposOcultosDescuentoMonto % 1==0) {
		iXPanelCamposOcultosDescuentoMonto=0;
		iYPanelCamposOcultosDescuentoMonto++;
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
			
		GridBagLayout gridaBagLayoutAccionesDescuentoMonto= new GridBagLayout();
		this.jPanelAccionesDescuentoMonto.setLayout(gridaBagLayoutAccionesDescuentoMonto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDescuentoMonto= new GridBagLayout();
		this.jPanelAccionesFormularioDescuentoMonto.setLayout(gridaBagLayoutAccionesFormularioDescuentoMonto);
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDescuentoMonto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDescuentoMonto.add(this.jComboBoxTiposAccionesFormularioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDescuentoMonto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDescuentoMonto.add(this.jCheckBoxPostAccionNuevoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.descuentomontoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDescuentoMonto.add(this.jCheckBoxPostAccionSinCerrarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.descuentomontoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDescuentoMonto.add(this.jCheckBoxPostAccionSinMensajeDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccion++;
			
		this.jPanelAccionesDescuentoMonto.add(this.jButtonModificarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);							

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx =iPosXAccion++;
			
		this.jPanelAccionesDescuentoMonto.add(this.jButtonEliminarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
			
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = 0;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccion++;
		
		this.jPanelAccionesDescuentoMonto.add(this.jButtonActualizarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = 0;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccion++;
		
		this.jPanelAccionesDescuentoMonto.add(this.jButtonGuardarCambiosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);	
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = 0;		
		this.gridBagConstraintsDescuentoMonto.gridx =iPosXAccion++;
		
		this.jPanelAccionesDescuentoMonto.add(this.jButtonCancelarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDescuentoMonto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDescuentoMonto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();						
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDescuentoMonto.gridx = 0;		
			//this.gridBagConstraintsDescuentoMonto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDescuentoMonto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDescuentoMonto.gridx =0;
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDescuentoMonto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDescuentoMonto = new DescuentoMontoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Descuento Monto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Descuento Monto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Descuento Monto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DescuentoMontoModel descuentomontoModel=new DescuentoMontoModel(this);
			
			//SI USARA CLASE INTERNA
			//DescuentoMontoModel.DescuentoMontoFocusTraversalPolicy descuentomontoFocusTraversalPolicy = descuentomontoModel.new DescuentoMontoFocusTraversalPolicy(this);
			
			//descuentomontoFocusTraversalPolicy.setdescuentomontoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(descuentomontoModel);
			
			
			this.jContentPaneDetalleDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDescuentoMonto = new GridBagLayout();	
			this.jContentPaneDetalleDescuentoMonto.setLayout(gridaBagLayoutDetalleDescuentoMonto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDescuentoMonto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
				this.gridBagConstraintsDescuentoMonto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDescuentoMonto.gridx = 0;
					
				
				this.jContentPaneDetalleDescuentoMonto.add(jTtoolBarDetalleDescuentoMonto, gridBagConstraintsDescuentoMonto);								
				
}
			
			this.jScrollPanelDatosEdicionDescuentoMonto=   new JScrollPane(jContentPaneDetalleDescuentoMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDescuentoMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDescuentoMonto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDescuentoMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDescuentoMonto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDescuentoMonto.gridx = 0;
	        
			this.jContentPaneDetalleDescuentoMonto.add(jPanelCamposDescuentoMonto, gridBagConstraintsDescuentoMonto);
			
			
			
			
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
						&& descuentomontoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDescuentoMonto= new GridBagConstraints();
						this.gridBagConstraintsDescuentoMonto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDescuentoMonto.gridx = 0;
						this.jContentPaneDetalleDescuentoMonto.add(this.jTabbedPaneRelacionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDescuentoMonto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDescuentoMonto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
					this.gridBagConstraintsDescuentoMonto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDescuentoMonto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDescuentoMonto.gridx = 0;
					
				
					this.jContentPaneDetalleDescuentoMonto.add(jPanelCamposOcultosDescuentoMonto, gridBagConstraintsDescuentoMonto);
				
					this.jPanelCamposOcultosDescuentoMonto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDescuentoMonto.gridx = 0;
	        this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDescuentoMonto.add(this.jPanelAccionesFormularioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);							
			
			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
	        this.gridBagConstraintsDescuentoMonto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDescuentoMonto.gridx = 0;
	        
			
			this.jContentPaneDetalleDescuentoMonto.add(this.jPanelAccionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDescuentoMonto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDescuentoMonto=   new JScrollPane(this.jPanelCamposDescuentoMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDescuentoMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDescuentoMonto.gridx = 0;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDescuentoMonto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDescuentoMonto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDescuentoMonto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			
			
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
			
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDescuentoMonto;//jContentPane;
		
		return jScrollPanelDatosEdicionDescuentoMonto;
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
