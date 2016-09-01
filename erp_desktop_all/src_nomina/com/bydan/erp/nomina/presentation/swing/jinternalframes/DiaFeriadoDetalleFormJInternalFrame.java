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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.DiaFeriadoConstantesFunciones;

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
public class DiaFeriadoDetalleFormJInternalFrame extends DiaFeriadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDiaFeriado;
	
	protected JMenuBar jmenuBarDetalleDiaFeriado;
	
	protected JMenu jmenuDetalleDiaFeriado;
	protected JMenu jmenuDetalleArchivoDiaFeriado;
	protected JMenu jmenuDetalleAccionesDiaFeriado;
	protected JMenu jmenuDetalleDatosDiaFeriado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiaFeriado;	
	protected GridBagConstraints gridBagConstraintsDiaFeriado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DiaFeriadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDiaFeriado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public DiaFeriadoSessionBean diaferiadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public MesSessionBean mesSessionBean;
	public AnioSessionBean anioSessionBean;	
	
	public DiaFeriadoLogic diaferiadoLogic;
	
	public JScrollPane jScrollPanelDatosDiaFeriado;
	public JScrollPane jScrollPanelDatosEdicionDiaFeriado;
	public JScrollPane jScrollPanelDatosGeneralDiaFeriado;
	
	protected JPanel jPanelCamposDiaFeriado;    
	protected JPanel jPanelCamposOcultosDiaFeriado;    	
	protected JPanel jPanelAccionesDiaFeriado;
	protected JPanel jPanelAccionesFormularioDiaFeriado;
    
	
	
	protected Integer iXPanelCamposDiaFeriado=0;
	protected Integer iYPanelCamposDiaFeriado=0;
	
	protected Integer iXPanelCamposOcultosDiaFeriado=0;
	protected Integer iYPanelCamposOcultosDiaFeriado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDiaFeriado;
	public JButton jButtonModificarDiaFeriado;
	public JButton jButtonActualizarDiaFeriado;
    public JButton jButtonEliminarDiaFeriado;
	public JButton jButtonCancelarDiaFeriado;
    public JButton jButtonGuardarCambiosDiaFeriado;
	public JButton jButtonGuardarCambiosTablaDiaFeriado;
	protected JButton jButtonCerrarDiaFeriado;
	
	
	protected JButton jButtonProcesarInformacionDiaFeriado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDiaFeriado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDiaFeriado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDiaFeriado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiaFeriado;
	protected JButton jButtonModificarToolBarDiaFeriado;
	protected JButton jButtonActualizarToolBarDiaFeriado;
    protected JButton jButtonEliminarToolBarDiaFeriado;
	protected JButton jButtonCancelarToolBarDiaFeriado;
    protected JButton jButtonGuardarCambiosToolBarDiaFeriado;
	protected JButton jButtonGuardarCambiosTablaToolBarDiaFeriado;
	protected JButton jButtonMostrarOcultarTablaToolBarDiaFeriado;
	protected JButton jButtonCerrarToolBarDiaFeriado;
	
	protected JButton jButtonProcesarInformacionToolBarDiaFeriado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiaFeriado;
	protected JMenuItem jMenuItemModificarDiaFeriado;
	protected JMenuItem jMenuItemActualizarDiaFeriado;
    protected JMenuItem jMenuItemEliminarDiaFeriado;
	protected JMenuItem jMenuItemCancelarDiaFeriado;
    protected JMenuItem jMenuItemGuardarCambiosDiaFeriado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiaFeriado;
	protected JMenuItem jMenuItemCerrarDiaFeriado;
	protected JMenuItem jMenuItemDetalleCerrarDiaFeriado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiaFeriado;
	
	protected JMenuItem jMenuItemProcesarInformacionDiaFeriado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiaFeriado;
	protected JMenuItem jMenuItemMostrarOcultarDiaFeriado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiaFeriado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiaFeriado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiaFeriado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDiaFeriado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDiaFeriado;
	public JLabel jLabelIdDiaFeriado;
	public JLabel jLabelidDiaFeriado;
	public JButton jButtonidDiaFeriadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreDiaFeriado;
	public JLabel jLabelnombreDiaFeriado;
	public JTextField jTextFieldnombreDiaFeriado;
	public JButton jButtonnombreDiaFeriadoBusqueda= new JButtonMe();

	public JPanel jPanelfechaDiaFeriado;
	public JLabel jLabelfechaDiaFeriado;
	//public JFormattedTextField jDateChooserfechaDiaFeriado;

	public JDateChooser jDateChooserfechaDiaFeriado;
	public JButton jButtonfechaDiaFeriadoBusqueda= new JButtonMe();

	public JPanel jPaneldiaDiaFeriado;
	public JLabel jLabeldiaDiaFeriado;
	public JTextField jTextFielddiaDiaFeriado;
	public JButton jButtondiaDiaFeriadoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDiaFeriado;
	public JLabel jLabeldescripcionDiaFeriado;
	public JTextArea jTextAreadescripcionDiaFeriado;
	public JScrollPane jscrollPanedescripcionDiaFeriado;
	public JButton jButtondescripcionDiaFeriadoBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoDiaFeriado;
	public JLabel jLabelesta_activoDiaFeriado;
	public JCheckBox jCheckBoxesta_activoDiaFeriado;
	public JButton jButtonesta_activoDiaFeriadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDiaFeriado;
	public JLabel jLabelid_empresaDiaFeriado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDiaFeriado;
	public JButton jButtonid_empresaDiaFeriado= new JButtonMe();
	public JButton jButtonid_empresaDiaFeriadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDiaFeriadoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDiaFeriado;
	public JLabel jLabelid_mesDiaFeriado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDiaFeriado;
	public JButton jButtonid_mesDiaFeriado= new JButtonMe();
	public JButton jButtonid_mesDiaFeriadoUpdate= new JButtonMe();
	public JButton jButtonid_mesDiaFeriadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDiaFeriado;
	public JLabel jLabelid_anioDiaFeriado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDiaFeriado;
	public JButton jButtonid_anioDiaFeriado= new JButtonMe();
	public JButton jButtonid_anioDiaFeriadoUpdate= new JButtonMe();
	public JButton jButtonid_anioDiaFeriadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDiaFeriado;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DiaFeriadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDiaFeriado=new JPanel();
				this.jPanelAccionesFormularioDiaFeriado=new JPanel();
				this.jmenuBarDetalleDiaFeriado=new JMenuBar();
				this.jTtoolBarDetalleDiaFeriado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaFeriadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DiaFeriadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaFeriadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaFeriadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaFeriadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDiaFeriado() {
		return this.jButtonActualizarToolBarDiaFeriado;
	}
	
	public JButton getjButtonEliminarToolBarDiaFeriado() {
		return this.jButtonEliminarToolBarDiaFeriado;
	}
	
	public JButton getjButtonCancelarToolBarDiaFeriado() {
		return this.jButtonCancelarToolBarDiaFeriado;
	}		
	
	public JButton getjButtonProcesarInformacionDiaFeriado() {
		return this.jButtonProcesarInformacionDiaFeriado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiaFeriado)	{
		this.jButtonProcesarInformacionDiaFeriado = jButtonProcesarInformacionDiaFeriado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiaFeriado() {
		return this.jComboBoxTiposAccionesDiaFeriado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiaFeriado(
			JComboBox jComboBoxTiposRelacionesDiaFeriado) {
		this.jComboBoxTiposRelacionesDiaFeriado = jComboBoxTiposRelacionesDiaFeriado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiaFeriado(
			JComboBox jComboBoxTiposAccionesDiaFeriado) {
		this.jComboBoxTiposAccionesDiaFeriado = jComboBoxTiposAccionesDiaFeriado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDiaFeriado() {
		return this.jComboBoxTiposAccionesFormularioDiaFeriado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDiaFeriado(
			JComboBox jComboBoxTiposAccionesFormularioDiaFeriado) {
		this.jComboBoxTiposAccionesFormularioDiaFeriado = jComboBoxTiposAccionesFormularioDiaFeriado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
		
		this.diaferiadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diaferiadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diaferiadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiaFeriadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiaFeriadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiaFeriadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dia Feriado MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
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
	
		DiaFeriadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDiaFeriado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDiaFeriado=new JButtonMe();
				this.jButtonModificarToolBarDiaFeriado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDiaFeriado,this.jTtoolBarDetalleDiaFeriado,
							"actualizar","actualizar","Actualizar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDiaFeriado,this.jTtoolBarDetalleDiaFeriado,
							"eliminar","eliminar","Eliminar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDiaFeriado,this.jTtoolBarDetalleDiaFeriado,
							"cancelar","cancelar","Cancelar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDiaFeriado,this.jTtoolBarDetalleDiaFeriado,
							"guardarcambios","guardarcambios","Guardar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDiaFeriado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDiaFeriado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDiaFeriado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDiaFeriado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDiaFeriado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiaFeriado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiaFeriado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiaFeriado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDiaFeriado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDiaFeriado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDiaFeriado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDiaFeriado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDiaFeriado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDiaFeriado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDiaFeriado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDiaFeriado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDiaFeriado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDiaFeriado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDiaFeriado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDiaFeriado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDiaFeriado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiaFeriado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiaFeriado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiaFeriado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiaFeriado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiaFeriado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDiaFeriado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDiaFeriado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDiaFeriado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiaFeriado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiaFeriado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiaFeriado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiaFeriado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiaFeriado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiaFeriado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDiaFeriado.add(this.jMenuItemDetalleCerrarDiaFeriado);
		
		this.jmenuDetalleAccionesDiaFeriado.add(this.jMenuItemActualizarDiaFeriado);
		this.jmenuDetalleAccionesDiaFeriado.add(this.jMenuItemEliminarDiaFeriado);
		this.jmenuDetalleAccionesDiaFeriado.add(this.jMenuItemCancelarDiaFeriado);		
		
		//this.jmenuDetalleDatosDiaFeriado.add(this.jMenuItemDetalleAbrirOrderByDiaFeriado);				
		this.jmenuDetalleDatosDiaFeriado.add(this.jMenuItemDetalleMostarOcultarDiaFeriado);				
				
		//this.jmenuDetalleAccionesDiaFeriado.add(this.jMenuItemGuardarCambiosDiaFeriado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDiaFeriado.add(this.jmenuDetalleArchivoDiaFeriado);		
		this.jmenuBarDetalleDiaFeriado.add(this.jmenuDetalleAccionesDiaFeriado);		
		this.jmenuBarDetalleDiaFeriado.add(this.jmenuDetalleDatosDiaFeriado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDiaFeriado);				
	}
	
	
	public void inicializarElementosCamposDiaFeriado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDiaFeriado = new JLabelMe();
		jLabelIdDiaFeriado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDiaFeriado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDiaFeriado= new GridBagLayout();

		this.jPanelidDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);

		jLabelidDiaFeriado = new JLabel();
		jLabelidDiaFeriado.setText("Id");

		jLabelidDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreDiaFeriado = new JLabelMe();
		this.jLabelnombreDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDiaFeriado.setToolTipText("Nombre");
		this.jLabelnombreDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPanelnombreDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		jTextFieldnombreDiaFeriado= new JTextFieldMe();

		jTextFieldnombreDiaFeriado.setEnabled(false);
		jTextFieldnombreDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreDiaFeriadoBusqueda= new JButtonMe();
		this.jButtonnombreDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDiaFeriadoBusqueda.setText("U");
		this.jButtonnombreDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDiaFeriadoBusqueda.setVisible(false);		}


					
		this.jLabelfechaDiaFeriado = new JLabelMe();
		this.jLabelfechaDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDiaFeriado.setToolTipText("Fecha");
		this.jLabelfechaDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPanelfechaDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		//jFormattedTextFieldfechaDiaFeriado= new JFormattedTextFieldMe();

		jDateChooserfechaDiaFeriado= new JDateChooser();
		jDateChooserfechaDiaFeriado.setEnabled(false);
		jDateChooserfechaDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDiaFeriado.setDate(new Date());
		jDateChooserfechaDiaFeriado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDiaFeriado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDiaFeriadoBusqueda= new JButtonMe();
		this.jButtonfechaDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDiaFeriadoBusqueda.setText("U");
		this.jButtonfechaDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDiaFeriadoBusqueda.setVisible(false);		}


					
		this.jLabeldiaDiaFeriado = new JLabelMe();
		this.jLabeldiaDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_DIA+" : *");
		this.jLabeldiaDiaFeriado.setToolTipText("Dia");
		this.jLabeldiaDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiaDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiaDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiaDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_DIA);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPaneldiaDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		jTextFielddiaDiaFeriado= new JTextFieldMe();
		jTextFielddiaDiaFeriado.setEnabled(false);
		jTextFielddiaDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiaDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiaDiaFeriado.setText("0");

		this.jButtondiaDiaFeriadoBusqueda= new JButtonMe();
		this.jButtondiaDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiaDiaFeriadoBusqueda.setText("U");
		this.jButtondiaDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiaDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiaDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiaDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiaDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diaDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiaDiaFeriadoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDiaFeriado = new JLabelMe();
		this.jLabeldescripcionDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDiaFeriado.setToolTipText("Descripcion");
		this.jLabeldescripcionDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPaneldescripcionDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		jTextAreadescripcionDiaFeriado= new JTextAreaMe();
		jTextAreadescripcionDiaFeriado.setEnabled(false);
		jTextAreadescripcionDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDiaFeriado.setLineWrap(true);
		jTextAreadescripcionDiaFeriado.setWrapStyleWord(true);
		jTextAreadescripcionDiaFeriado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDiaFeriado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDiaFeriado = new JScrollPane(jTextAreadescripcionDiaFeriado);
		jscrollPanedescripcionDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDiaFeriadoBusqueda= new JButtonMe();
		this.jButtondescripcionDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDiaFeriadoBusqueda.setText("U");
		this.jButtondescripcionDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDiaFeriadoBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoDiaFeriado = new JLabelMe();
		this.jLabelesta_activoDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoDiaFeriado.setToolTipText("Esta Activo");
		this.jLabelesta_activoDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPanelesta_activoDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		jCheckBoxesta_activoDiaFeriado= new JCheckBoxMe();
		jCheckBoxesta_activoDiaFeriado.setEnabled(false);

		jCheckBoxesta_activoDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoDiaFeriadoBusqueda= new JButtonMe();
		this.jButtonesta_activoDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoDiaFeriadoBusqueda.setText("U");
		this.jButtonesta_activoDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoDiaFeriadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDiaFeriado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDiaFeriado = new JLabelMe();
		this.jLabelid_empresaDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDiaFeriado.setToolTipText("Empresa");
		this.jLabelid_empresaDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPanelid_empresaDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		jComboBoxid_empresaDiaFeriado= new JComboBoxMe();
		jComboBoxid_empresaDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDiaFeriado.setEnabled(false);

		this.jButtonid_empresaDiaFeriado= new JButtonMe();
		this.jButtonid_empresaDiaFeriado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiaFeriado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiaFeriado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiaFeriado.setText("Buscar");
		this.jButtonid_empresaDiaFeriado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDiaFeriado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiaFeriado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiaFeriado"));

		this.jButtonid_empresaDiaFeriadoBusqueda= new JButtonMe();
		this.jButtonid_empresaDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiaFeriadoBusqueda.setText("U");
		this.jButtonid_empresaDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDiaFeriadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDiaFeriadoUpdate= new JButtonMe();
		this.jButtonid_empresaDiaFeriadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiaFeriadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiaFeriadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiaFeriadoUpdate.setText("U");
		this.jButtonid_empresaDiaFeriadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDiaFeriadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiaFeriadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiaFeriadoUpdate"));



					
		this.jLabelid_mesDiaFeriado = new JLabelMe();
		this.jLabelid_mesDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDiaFeriado.setToolTipText("Mes");
		this.jLabelid_mesDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPanelid_mesDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		jComboBoxid_mesDiaFeriado= new JComboBoxMe();
		jComboBoxid_mesDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesDiaFeriado= new JButtonMe();
		this.jButtonid_mesDiaFeriado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDiaFeriado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDiaFeriado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDiaFeriado.setText("Buscar");
		this.jButtonid_mesDiaFeriado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDiaFeriado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDiaFeriado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDiaFeriado"));

		this.jButtonid_mesDiaFeriadoBusqueda= new JButtonMe();
		this.jButtonid_mesDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDiaFeriadoBusqueda.setText("U");
		this.jButtonid_mesDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDiaFeriadoBusqueda.setVisible(false);		}

		this.jButtonid_mesDiaFeriadoUpdate= new JButtonMe();
		this.jButtonid_mesDiaFeriadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDiaFeriadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDiaFeriadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDiaFeriadoUpdate.setText("U");
		this.jButtonid_mesDiaFeriadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDiaFeriadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDiaFeriadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDiaFeriadoUpdate"));



					
		this.jLabelid_anioDiaFeriado = new JLabelMe();
		this.jLabelid_anioDiaFeriado.setText(""+DiaFeriadoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDiaFeriado.setToolTipText("Anio");
		this.jLabelid_anioDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDiaFeriado.setToolTipText(DiaFeriadoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDiaFeriado = new GridBagLayout();
		this.jPanelid_anioDiaFeriado.setLayout(this.gridaBagLayoutDiaFeriado);


		jComboBoxid_anioDiaFeriado= new JComboBoxMe();
		jComboBoxid_anioDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioDiaFeriado= new JButtonMe();
		this.jButtonid_anioDiaFeriado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDiaFeriado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDiaFeriado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDiaFeriado.setText("Buscar");
		this.jButtonid_anioDiaFeriado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDiaFeriado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDiaFeriado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDiaFeriado"));

		this.jButtonid_anioDiaFeriadoBusqueda= new JButtonMe();
		this.jButtonid_anioDiaFeriadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDiaFeriadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDiaFeriadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDiaFeriadoBusqueda.setText("U");
		this.jButtonid_anioDiaFeriadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDiaFeriadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDiaFeriadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDiaFeriadoBusqueda"));

		if(this.diaferiadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDiaFeriadoBusqueda.setVisible(false);		}

		this.jButtonid_anioDiaFeriadoUpdate= new JButtonMe();
		this.jButtonid_anioDiaFeriadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDiaFeriadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDiaFeriadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDiaFeriadoUpdate.setText("U");
		this.jButtonid_anioDiaFeriadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDiaFeriadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDiaFeriadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDiaFeriadoUpdate"));



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
		//this.jInternalFrameDetalleDiaFeriado = new DiaFeriadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dia Feriado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiaFeriado= new GridBagLayout();
		

		
		String sToolTipDiaFeriado="";
		sToolTipDiaFeriado=DiaFeriadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiaFeriado+="(Nomina.DiaFeriado)";
		}
		
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiaFeriado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDiaFeriado = new JButtonMe();
		this.jButtonModificarDiaFeriado = new JButtonMe();
        this.jButtonActualizarDiaFeriado = new JButtonMe();
        this.jButtonEliminarDiaFeriado = new JButtonMe();
        this.jButtonCancelarDiaFeriado = new JButtonMe();
        this.jButtonGuardarCambiosDiaFeriado = new JButtonMe();
		this.jButtonGuardarCambiosTablaDiaFeriado = new JButtonMe();
		this.jButtonCerrarDiaFeriado = new JButtonMe();
		
		this.jScrollPanelDatosDiaFeriado = new JScrollPane();   
        this.jScrollPanelDatosEdicionDiaFeriado = new JScrollPane();
		this.jScrollPanelDatosGeneralDiaFeriado = new JScrollPane();
				
		
		
		this.jPanelCamposDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dia Feriado";
		
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dia Feriados" + this.sPath));
		} else {
			this.jScrollPanelDatosDiaFeriado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDiaFeriado.setName("jPanelCamposDiaFeriado"); 

		this.jPanelCamposOcultosDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDiaFeriado.setName("jPanelCamposOcultosDiaFeriado"); 

        this.jPanelAccionesDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiaFeriado.setToolTipText("Acciones");
        this.jPanelAccionesDiaFeriado.setName("Acciones"); 

		this.jPanelAccionesFormularioDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDiaFeriado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDiaFeriado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDiaFeriado.setText("Nuevo");
		this.jButtonModificarDiaFeriado.setText("Editar");
        this.jButtonActualizarDiaFeriado.setText("Actualizar");
        this.jButtonEliminarDiaFeriado.setText("Eliminar");
        this.jButtonCancelarDiaFeriado.setText("Cancelar");
        this.jButtonGuardarCambiosDiaFeriado.setText("Guardar");
		this.jButtonGuardarCambiosTablaDiaFeriado.setText("Guardar");
		this.jButtonCerrarDiaFeriado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiaFeriado,"nuevo_button","Nuevo",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDiaFeriado,"modificar_button","Editar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDiaFeriado,"actualizar_button","Actualizar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDiaFeriado,"eliminar_button","Eliminar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDiaFeriado,"cancelar_button","Cancelar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDiaFeriado,"guardarcambios_button","Guardar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiaFeriado,"guardarcambiostabla_button","Guardar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiaFeriado,"cerrar_button","Salir",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDiaFeriado.setToolTipText("Nuevo"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDiaFeriado.setToolTipText("Editar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDiaFeriado.setToolTipText("Actualizar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDiaFeriado.setToolTipText("Eliminar)"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDiaFeriado.setToolTipText("Cancelar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDiaFeriado.setToolTipText("Guardar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDiaFeriado.setToolTipText("Guardar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiaFeriado.setToolTipText("Salir"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiaFeriado";
		inputMap = this.jButtonNuevoDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiaFeriado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiaFeriado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDiaFeriado";
		inputMap = this.jButtonActualizarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDiaFeriado"));
		
		//ELIMINAR
		sMapKey = "EliminarDiaFeriado";
		inputMap = this.jButtonEliminarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDiaFeriado"));
		
		//CANCELAR	
		sMapKey = "CancelarDiaFeriado";
		inputMap = this.jButtonCancelarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDiaFeriado"));
		
		//CERRAR		
		sMapKey = "CerrarDiaFeriado";
		inputMap = this.jButtonCerrarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiaFeriado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiaFeriado";
		inputMap = this.jButtonGuardarCambiosTablaDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiaFeriado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDiaFeriado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDiaFeriado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDiaFeriado.setToolTipText("Nuevo DiaFeriado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDiaFeriado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDiaFeriado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDiaFeriado.setToolTipText("Sin Cerrar Ventana DiaFeriado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDiaFeriado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDiaFeriado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDiaFeriado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiaFeriado.setText("Accion");
		this.jComboBoxTiposAccionesDiaFeriado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDiaFeriado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDiaFeriado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDiaFeriado = new JLabelMe();
		
		this.jLabelAccionesDiaFeriado.setText("Acciones");		
		this.jLabelAccionesDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDiaFeriado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDiaFeriado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDiaFeriado=new JTabbedPane();
		this.jTabbedPaneRelacionesDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDiaFeriado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDiaFeriado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiaFeriado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiaFeriado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDiaFeriado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiaFeriado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiaFeriado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDiaFeriado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDiaFeriado = new GridBagLayout();
		
		this.jPanelCamposDiaFeriado.setLayout(gridaBagLayoutCamposDiaFeriado);
		this.jPanelCamposOcultosDiaFeriado.setLayout(gridaBagLayoutCamposOcultosDiaFeriado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDiaFeriado.add(jLabelIdDiaFeriado, this.gridBagConstraintsDiaFeriado);



	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDiaFeriado.add(jLabelidDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDiaFeriado.add(jLabelid_empresaDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiaFeriado.add(jButtonid_empresaDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 3;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiaFeriado.add(jButtonid_empresaDiaFeriadoUpdate, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDiaFeriado.add(jComboBoxid_empresaDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDiaFeriado.add(jLabelnombreDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDiaFeriado.add(jButtonnombreDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDiaFeriado.add(jTextFieldnombreDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDiaFeriado.add(jLabelfechaDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDiaFeriado.add(jButtonfechaDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDiaFeriado.add(jDateChooserfechaDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiaDiaFeriado.add(jLabeldiaDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiaDiaFeriado.add(jButtondiaDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiaDiaFeriado.add(jTextFielddiaDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDiaFeriado.add(jLabelid_mesDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDiaFeriado.add(jButtonid_mesDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 3;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDiaFeriado.add(jButtonid_mesDiaFeriadoUpdate, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDiaFeriado.add(jComboBoxid_mesDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDiaFeriado.add(jLabelid_anioDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDiaFeriado.add(jButtonid_anioDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 3;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDiaFeriado.add(jButtonid_anioDiaFeriadoUpdate, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDiaFeriado.add(jComboBoxid_anioDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDiaFeriado.add(jLabeldescripcionDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDiaFeriado.add(jButtondescripcionDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDiaFeriado.add(jscrollPanedescripcionDiaFeriado, this.gridBagConstraintsDiaFeriado);


	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 0;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoDiaFeriado.add(jLabelesta_activoDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 2;
		this.gridBagConstraintsDiaFeriado.ipadx = 0;
		this.gridBagConstraintsDiaFeriado.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoDiaFeriado.add(jButtonesta_activoDiaFeriadoBusqueda, this.gridBagConstraintsDiaFeriado);
	}

	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiaFeriado.gridy = 0;
	this.gridBagConstraintsDiaFeriado.gridx = 1;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoDiaFeriado.add(jCheckBoxesta_activoDiaFeriado, this.gridBagConstraintsDiaFeriado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPanelidDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPanelnombreDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPanelfechaDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPaneldiaDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPanelid_mesDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPanelid_anioDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPaneldescripcionDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiaFeriado.add(this.jPanelesta_activoDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposDiaFeriado % 1==0) {
		iXPanelCamposDiaFeriado=0;
		iYPanelCamposDiaFeriado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiaFeriado.gridy = iYPanelCamposOcultosDiaFeriado;
	this.gridBagConstraintsDiaFeriado.gridx = iXPanelCamposOcultosDiaFeriado++;
	this.gridBagConstraintsDiaFeriado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiaFeriado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiaFeriado.add(this.jPanelid_empresaDiaFeriado, this.gridBagConstraintsDiaFeriado);



	if(iXPanelCamposOcultosDiaFeriado % 1==0) {
		iXPanelCamposOcultosDiaFeriado=0;
		iYPanelCamposOcultosDiaFeriado++;
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
			
		GridBagLayout gridaBagLayoutAccionesDiaFeriado= new GridBagLayout();
		this.jPanelAccionesDiaFeriado.setLayout(gridaBagLayoutAccionesDiaFeriado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDiaFeriado= new GridBagLayout();
		this.jPanelAccionesFormularioDiaFeriado.setLayout(gridaBagLayoutAccionesFormularioDiaFeriado);
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDiaFeriado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDiaFeriado.add(this.jComboBoxTiposAccionesFormularioDiaFeriado, this.gridBagConstraintsDiaFeriado);

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDiaFeriado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDiaFeriado.add(this.jCheckBoxPostAccionNuevoDiaFeriado, this.gridBagConstraintsDiaFeriado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.diaferiadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDiaFeriado.add(this.jCheckBoxPostAccionSinCerrarDiaFeriado, this.gridBagConstraintsDiaFeriado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.diaferiadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDiaFeriado.add(this.jCheckBoxPostAccionSinMensajeDiaFeriado, this.gridBagConstraintsDiaFeriado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXAccion++;
			
		this.jPanelAccionesDiaFeriado.add(this.jButtonModificarDiaFeriado, this.gridBagConstraintsDiaFeriado);							

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx =iPosXAccion++;
			
		this.jPanelAccionesDiaFeriado.add(this.jButtonEliminarDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
			
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = 0;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiaFeriado.add(this.jButtonActualizarDiaFeriado, this.gridBagConstraintsDiaFeriado);


		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = 0;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiaFeriado.add(this.jButtonGuardarCambiosDiaFeriado, this.gridBagConstraintsDiaFeriado);	
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = 0;		
		this.gridBagConstraintsDiaFeriado.gridx =iPosXAccion++;
		
		this.jPanelAccionesDiaFeriado.add(this.jButtonCancelarDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiaFeriado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiaFeriado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();						
			this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiaFeriado.gridx = 0;		
			//this.gridBagConstraintsDiaFeriado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiaFeriado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiaFeriado.gridx =0;
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiaFeriado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiaFeriado, this.gridBagConstraintsDiaFeriado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDiaFeriado = new DiaFeriadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dia Feriado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dia Feriado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dia Feriado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DiaFeriadoModel diaferiadoModel=new DiaFeriadoModel(this);
			
			//SI USARA CLASE INTERNA
			//DiaFeriadoModel.DiaFeriadoFocusTraversalPolicy diaferiadoFocusTraversalPolicy = diaferiadoModel.new DiaFeriadoFocusTraversalPolicy(this);
			
			//diaferiadoFocusTraversalPolicy.setdiaferiadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(diaferiadoModel);
			
			
			this.jContentPaneDetalleDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDiaFeriado = new GridBagLayout();	
			this.jContentPaneDetalleDiaFeriado.setLayout(gridaBagLayoutDetalleDiaFeriado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiaFeriado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
				this.gridBagConstraintsDiaFeriado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDiaFeriado.gridx = 0;
					
				
				this.jContentPaneDetalleDiaFeriado.add(jTtoolBarDetalleDiaFeriado, gridBagConstraintsDiaFeriado);								
				
}
			
			this.jScrollPanelDatosEdicionDiaFeriado=   new JScrollPane(jContentPaneDetalleDiaFeriado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiaFeriado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiaFeriado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiaFeriado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDiaFeriado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiaFeriado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiaFeriado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiaFeriado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDiaFeriado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDiaFeriado.gridx = 0;
	        
			this.jContentPaneDetalleDiaFeriado.add(jPanelCamposDiaFeriado, gridBagConstraintsDiaFeriado);
			
			
			
			
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
						&& diaferiadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDiaFeriado= new GridBagConstraints();
						this.gridBagConstraintsDiaFeriado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDiaFeriado.gridx = 0;
						this.jContentPaneDetalleDiaFeriado.add(this.jTabbedPaneRelacionesDiaFeriado, this.gridBagConstraintsDiaFeriado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDiaFeriado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDiaFeriado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
					this.gridBagConstraintsDiaFeriado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDiaFeriado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDiaFeriado.gridx = 0;
					
				
					this.jContentPaneDetalleDiaFeriado.add(jPanelCamposOcultosDiaFeriado, gridBagConstraintsDiaFeriado);
				
					this.jPanelCamposOcultosDiaFeriado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDiaFeriado.gridx = 0;
	        this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDiaFeriado.add(this.jPanelAccionesFormularioDiaFeriado, this.gridBagConstraintsDiaFeriado);							
			
			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
	        this.gridBagConstraintsDiaFeriado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDiaFeriado.gridx = 0;
	        
			
			this.jContentPaneDetalleDiaFeriado.add(this.jPanelAccionesDiaFeriado, this.gridBagConstraintsDiaFeriado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDiaFeriado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDiaFeriado=   new JScrollPane(this.jPanelCamposDiaFeriado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiaFeriado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiaFeriado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiaFeriado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDiaFeriado.gridx = 0;
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDiaFeriado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDiaFeriado, this.gridBagConstraintsDiaFeriado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiaFeriado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDiaFeriado, this.gridBagConstraintsDiaFeriado);			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiaFeriado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDiaFeriado, this.gridBagConstraintsDiaFeriado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiaFeriado, this.gridBagConstraintsDiaFeriado);
			
			
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
			
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiaFeriado, this.gridBagConstraintsDiaFeriado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDiaFeriado;//jContentPane;
		
		return jScrollPanelDatosEdicionDiaFeriado;
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
