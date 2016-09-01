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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.TipoTransaConstantesFunciones;
import com.bydan.erp.cartera.util.TipoTransaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoTransaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoTransaBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoTransaBeanSwingJInternalFrame extends TipoTransaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTransaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTransa> tipotransaValidator = new ClassValidator<TipoTransa>(TipoTransa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTransa tipotransa;	
	public TipoTransa tipotransaAux;
	public TipoTransa tipotransaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTransa tipotransaTotales;
	public Long idTipoTransaActual;
	public Long iIdNuevoTipoTransa=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosTransaccion=false;

	public Boolean getIsTienePermisosTransaccion() {
		return isTienePermisosTransaccion;
	}

	public void setIsTienePermisosTransaccion(Boolean isTienePermisosTransaccion) {
		this.isTienePermisosTransaccion= isTienePermisosTransaccion;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoTipoTransa;
	public Boolean isPermisoNuevoTipoTransa;
	public Boolean isPermisoActualizarTipoTransa;
	public Boolean isPermisoActualizarOriginalTipoTransa;
	public Boolean isPermisoEliminarTipoTransa;
	public Boolean isPermisoGuardarCambiosTipoTransa;
	public Boolean isPermisoConsultaTipoTransa;
	public Boolean isPermisoBusquedaTipoTransa;
	public Boolean isPermisoReporteTipoTransa;
	public Boolean isPermisoPaginacionMedioTipoTransa;
	public Boolean isPermisoPaginacionAltoTipoTransa;
	public Boolean isPermisoPaginacionTodoTipoTransa;
	public Boolean isPermisoCopiarTipoTransa;
	public Boolean isPermisoVerFormTipoTransa;
	public Boolean isPermisoDuplicarTipoTransa;
	public Boolean isPermisoOrdenTipoTransa;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public TipoTransaParameterReturnGeneral tipotransaReturnGeneral;
	public TipoTransaParameterReturnGeneral tipotransaParameterGeneral;
	
	

	public TransaccionLogic transaccionLogic=null;

	public TransaccionLogic getTransaccionLogic() {
		return transaccionLogic;
	}

	public void setTransaccionLogic(TransaccionLogic transaccionLogic) {
		this.transaccionLogic = transaccionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTransa=false;
	public Boolean esParaAccionDesdeFormularioTipoTransa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTransaLogic tipotransaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTransa tipotransaBean;
	public TipoTransaConstantesFunciones tipotransaConstantesFunciones;
	//public TipoTransaParameterReturnGeneral tipotransaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoTransa> tipotransas;	
	//public List<TipoTransa> tipotransasEliminados;
	//public List<TipoTransa> tipotransasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTransa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTransa=true;
	public Boolean isVisibilidadCeldaCopiarTipoTransa=true;
	public Boolean isVisibilidadCeldaVerFormTipoTransa=true;
	public Boolean isVisibilidadCeldaOrdenTipoTransa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
	public Boolean isVisibilidadCeldaModificarTipoTransa=false;
	public Boolean isVisibilidadCeldaActualizarTipoTransa=false;
	public Boolean isVisibilidadCeldaEliminarTipoTransa=false;
	public Boolean isVisibilidadCeldaCancelarTipoTransa=false;
	public Boolean isVisibilidadCeldaGuardarTipoTransa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTransa=false;	
	
	
	
	public Long getiIdNuevoTipoTransa() {
		return this.iIdNuevoTipoTransa;
	}

	public void setiIdNuevoTipoTransa(Long iIdNuevoTipoTransa) {
		this.iIdNuevoTipoTransa = iIdNuevoTipoTransa;
	}
	
	public Long getidTipoTransaActual() {
		return this.idTipoTransaActual;
	}

	public void setidTipoTransaActual(Long idTipoTransaActual) {
		this.idTipoTransaActual = idTipoTransaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTransa gettipotransa() {
		return this.tipotransa;
	}

	public void settipotransa(TipoTransa tipotransa) {
		this.tipotransa = tipotransa;
	}
	
	public TipoTransa gettipotransaAux() {
		return this.tipotransaAux;
	}

	public void settipotransaAux(TipoTransa tipotransaAux) {
		this.tipotransaAux = tipotransaAux;
	}				
	
	public TipoTransa gettipotransaAnterior() {
		return this.tipotransaAnterior;
	}

	public void settipotransaAnterior(TipoTransa tipotransaAnterior) {
		this.tipotransaAnterior = tipotransaAnterior;
	}	
	
	public TipoTransa gettipotransaTotales() {
		return this.tipotransaTotales;
	}

	public void settipotransaTotales(TipoTransa tipotransaTotales) {
		this.tipotransaTotales = tipotransaTotales;
	}	
	
	public TipoTransa gettipotransaBean() {
		return this.tipotransaBean;
	}

	public void settipotransaBean(TipoTransa tipotransaBean) {
		this.tipotransaBean = tipotransaBean;
	}	
	
	public TipoTransaParameterReturnGeneral gettipotransaReturnGeneral() {
		return this.tipotransaReturnGeneral;
	}

	public void settipotransaReturnGeneral(TipoTransaParameterReturnGeneral tipotransaReturnGeneral) {
		this.tipotransaReturnGeneral = tipotransaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoTransaLogic getTipoTransaLogic()	{		
		return tipotransaLogic;
	}

	public void setTipoTransaLogic(TipoTransaLogic tipotransaLogic) {
		this.tipotransaLogic = tipotransaLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoTipoTransa() {
		return isEsNuevoTipoTransa;
	}

	public void setIsEsNuevoTipoTransa(Boolean isEsNuevoTipoTransa) {
		this.isEsNuevoTipoTransa = isEsNuevoTipoTransa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTransa() {
		return esParaAccionDesdeFormularioTipoTransa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTransa(Boolean esParaAccionDesdeFormularioTipoTransa) {
		this.esParaAccionDesdeFormularioTipoTransa = esParaAccionDesdeFormularioTipoTransa;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoTransa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTransaConstantesFunciones.refrescarForeignKeysDescripcionesTipoTransa(this.tipotransaLogic.getTipoTransas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTransaConstantesFunciones.refrescarForeignKeysDescripcionesTipoTransa(this.tipotransas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipotransaLogic.setTipoTransas(this.tipotransas);
			tipotransaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public TipoTransaParameterReturnGeneral getTipoTransaParameterGeneral() {
		return this.tipotransaParameterGeneral;
	}
	
	public void setTipoTransaParameterGeneral(TipoTransaParameterReturnGeneral tipotransaParameterGeneral) {
		this.tipotransaParameterGeneral = tipotransaParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoTipoTransa() {
		return isPermisoTodoTipoTransa;
	}

	public void setIsPermisoTodoTipoTransa(Boolean isPermisoTodoTipoTransa) {
		this.isPermisoTodoTipoTransa = isPermisoTodoTipoTransa;
	}

	public Boolean getIsPermisoNuevoTipoTransa() {
		return isPermisoNuevoTipoTransa;
	}

	public void setIsPermisoNuevoTipoTransa(Boolean isPermisoNuevoTipoTransa) {
		this.isPermisoNuevoTipoTransa = isPermisoNuevoTipoTransa;
	}

	public Boolean getIsPermisoActualizarTipoTransa() {
		return isPermisoActualizarTipoTransa;
	}

	public void setIsPermisoActualizarTipoTransa(Boolean isPermisoActualizarTipoTransa) {
		this.isPermisoActualizarTipoTransa = isPermisoActualizarTipoTransa;
	}

	public Boolean getIsPermisoEliminarTipoTransa() {
		return isPermisoEliminarTipoTransa;
	}

	public void setIsPermisoEliminarTipoTransa(Boolean isPermisoEliminarTipoTransa) {
		this.isPermisoEliminarTipoTransa = isPermisoEliminarTipoTransa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTransa() {
		return isPermisoGuardarCambiosTipoTransa;
	}

	public void setIsPermisoGuardarCambiosTipoTransa(Boolean isPermisoGuardarCambiosTipoTransa) {
		this.isPermisoGuardarCambiosTipoTransa = isPermisoGuardarCambiosTipoTransa;
	}
	
	public Boolean getIsPermisoConsultaTipoTransa() {
		return isPermisoConsultaTipoTransa;
	}

	public void setIsPermisoConsultaTipoTransa(Boolean isPermisoConsultaTipoTransa) {
		this.isPermisoConsultaTipoTransa = isPermisoConsultaTipoTransa;
	}

	public Boolean getIsPermisoBusquedaTipoTransa() {
		return isPermisoBusquedaTipoTransa;
	}

	public void setIsPermisoBusquedaTipoTransa(Boolean isPermisoBusquedaTipoTransa) {
		this.isPermisoBusquedaTipoTransa = isPermisoBusquedaTipoTransa;
	}

	public Boolean getIsPermisoReporteTipoTransa() {
		return isPermisoReporteTipoTransa;
	}

	public void setIsPermisoReporteTipoTransa(Boolean isPermisoReporteTipoTransa) {
		this.isPermisoReporteTipoTransa = isPermisoReporteTipoTransa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTransa() {
		return isPermisoPaginacionMedioTipoTransa;
	}

	public void setIsPermisoPaginacionMedioTipoTransa(Boolean isPermisoPaginacionMedioTipoTransa) {
		this.isPermisoPaginacionMedioTipoTransa = isPermisoPaginacionMedioTipoTransa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTransa() {
		return isPermisoPaginacionTodoTipoTransa;
	}

	public void setIsPermisoPaginacionTodoTipoTransa(Boolean isPermisoPaginacionTodoTipoTransa) {
		this.isPermisoPaginacionTodoTipoTransa = isPermisoPaginacionTodoTipoTransa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTransa() {
		return isPermisoPaginacionAltoTipoTransa;
	}

	public void setIsPermisoPaginacionAltoTipoTransa(Boolean isPermisoPaginacionAltoTipoTransa) {
		this.isPermisoPaginacionAltoTipoTransa = isPermisoPaginacionAltoTipoTransa;
	}
	
	public Boolean getIsPermisoCopiarTipoTransa() {
		return isPermisoCopiarTipoTransa;
	}

	public void setIsPermisoCopiarTipoTransa(Boolean isPermisoCopiarTipoTransa) {
		this.isPermisoCopiarTipoTransa = isPermisoCopiarTipoTransa;
	}
	
	public Boolean getIsPermisoVerFormTipoTransa() {
		return isPermisoVerFormTipoTransa;
	}

	public void setIsPermisoVerFormTipoTransa(Boolean isPermisoVerFormTipoTransa) {
		this.isPermisoVerFormTipoTransa = isPermisoVerFormTipoTransa;
	}
	
	public Boolean getIsPermisoDuplicarTipoTransa() {
		return isPermisoDuplicarTipoTransa;
	}

	public void setIsPermisoDuplicarTipoTransa(Boolean isPermisoDuplicarTipoTransa) {
		this.isPermisoDuplicarTipoTransa = isPermisoDuplicarTipoTransa;
	}
	
	public Boolean getIsPermisoOrdenTipoTransa() {
		return isPermisoOrdenTipoTransa;
	}

	public void setIsPermisoOrdenTipoTransa(Boolean isPermisoOrdenTipoTransa) {
		this.isPermisoOrdenTipoTransa = isPermisoOrdenTipoTransa;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTransa() {
		return isVisibilidadCeldaNuevoTipoTransa;
	}

	public void setIsVisibilidadCeldaNuevoTipoTransa(Boolean isVisibilidadCeldaNuevoTipoTransa) {
		this.isVisibilidadCeldaNuevoTipoTransa = isVisibilidadCeldaNuevoTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTransa() {
		return isVisibilidadCeldaDuplicarTipoTransa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTransa(Boolean isVisibilidadCeldaDuplicarTipoTransa) {
		this.isVisibilidadCeldaDuplicarTipoTransa = isVisibilidadCeldaDuplicarTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTransa() {
		return isVisibilidadCeldaCopiarTipoTransa;
	}

	public void setIsVisibilidadCeldaCopiarTipoTransa(Boolean isVisibilidadCeldaCopiarTipoTransa) {
		this.isVisibilidadCeldaCopiarTipoTransa = isVisibilidadCeldaCopiarTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTransa() {
		return isVisibilidadCeldaVerFormTipoTransa;
	}

	public void setIsVisibilidadCeldaVerFormTipoTransa(Boolean isVisibilidadCeldaVerFormTipoTransa) {
		this.isVisibilidadCeldaVerFormTipoTransa = isVisibilidadCeldaVerFormTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTransa() {
		return isVisibilidadCeldaOrdenTipoTransa;
	}

	public void setIsVisibilidadCeldaOrdenTipoTransa(Boolean isVisibilidadCeldaOrdenTipoTransa) {
		this.isVisibilidadCeldaOrdenTipoTransa = isVisibilidadCeldaOrdenTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTransa() {
		return isVisibilidadCeldaNuevoRelacionesTipoTransa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTransa(Boolean isVisibilidadCeldaNuevoRelacionesTipoTransa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTransa = isVisibilidadCeldaNuevoRelacionesTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTransa() {
		return isVisibilidadCeldaModificarTipoTransa;
	}

	public void setIsVisibilidadCeldaModificarTipoTransa(Boolean isVisibilidadCeldaModificarTipoTransa) {
		this.isVisibilidadCeldaModificarTipoTransa = isVisibilidadCeldaModificarTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTransa() {
		return isVisibilidadCeldaActualizarTipoTransa;
	}

	public void setIsVisibilidadCeldaActualizarTipoTransa(Boolean isVisibilidadCeldaActualizarTipoTransa) {
		this.isVisibilidadCeldaActualizarTipoTransa = isVisibilidadCeldaActualizarTipoTransa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTransa() {
		return isVisibilidadCeldaEliminarTipoTransa;
	}

	public void setIsVisibilidadCeldaEliminarTipoTransa(Boolean isVisibilidadCeldaEliminarTipoTransa) {
		this.isVisibilidadCeldaEliminarTipoTransa = isVisibilidadCeldaEliminarTipoTransa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTransa() {
		return isVisibilidadCeldaCancelarTipoTransa;
	}

	public void setIsVisibilidadCeldaCancelarTipoTransa(Boolean isVisibilidadCeldaCancelarTipoTransa) {
		this.isVisibilidadCeldaCancelarTipoTransa = isVisibilidadCeldaCancelarTipoTransa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTransa() {
		return isVisibilidadCeldaGuardarTipoTransa;
	}

	public void setIsVisibilidadCeldaGuardarTipoTransa(Boolean isVisibilidadCeldaGuardarTipoTransa) {
		this.isVisibilidadCeldaGuardarTipoTransa = isVisibilidadCeldaGuardarTipoTransa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTransa() {
		return isVisibilidadCeldaGuardarCambiosTipoTransa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTransa(Boolean isVisibilidadCeldaGuardarCambiosTipoTransa) {
		this.isVisibilidadCeldaGuardarCambiosTipoTransa = isVisibilidadCeldaGuardarCambiosTipoTransa;
	}
		
	public TipoTransaSessionBean gettipotransaSessionBean() {
		return this.tipotransaSessionBean;
	}
	
	public void settipotransaSessionBean(TipoTransaSessionBean tipotransaSessionBean) {
		this.tipotransaSessionBean=tipotransaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTransa(TipoTransa tipotransa)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(TipoTransa tipotransa,TipoTransa tipotransaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTransa(tipotransa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipotransaAux.setId(tipotransa.getId());
		tipotransaAux.setVersionRow(tipotransa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTransa();
		
			int intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipotransaValidator.getInvalidValues(this.tipotransa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipotransaLogic.setDatosCliente(datosCliente);
			tipotransaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipotransaAux=new  TipoTransa();
				
				tipotransaAux.setIsNew(true);
				tipotransaAux.setIsChanged(true);
				
				tipotransaAux.setTipoTransaOriginal(this.tipotransa);
				
				tipotransaAux.setId(this.tipotransa.getId());	
				tipotransaAux.setVersionRow(this.tipotransa.getVersionRow());	
				tipotransaAux.setnombre(this.tipotransa.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotransaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipotransaAux,tipotransaLogic.getTipoTransas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaAux,tipotransas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipotransaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotransaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaLogic.saveTipoTransas();//WithConnection
						//tipotransaLogic.getSetVersionRowTipoTransas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotransa,tipotransaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipotransaAux=new  TipoTransa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipotransaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipotransaSessionBean.getEsGuardarRelacionado() && this.tipotransa.getId()>=0)) {
						
					tipotransaAux.setIsNew(false);
				}
				
				tipotransaAux.setIsDeleted(false);
			
				tipotransaAux.setId(this.tipotransa.getId());	
				tipotransaAux.setVersionRow(this.tipotransa.getVersionRow());	
				tipotransaAux.setnombre(this.tipotransa.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotransaAux,tipotransaLogic.getTipoTransas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaAux,tipotransas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipotransaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotransaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaLogic.saveTipoTransas();//WithConnection
						//tipotransaLogic.getSetVersionRowTipoTransas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotransa,tipotransaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipotransaAux=new  TipoTransa();
				
				tipotransaAux.setIsNew(false);
				tipotransaAux.setIsChanged(false);
				
				tipotransaAux.setIsDeleted(true);
				
				tipotransaAux.setId(this.tipotransa.getId());	
				tipotransaAux.setVersionRow(this.tipotransa.getVersionRow());	
				tipotransaAux.setnombre(this.tipotransa.getnombre());	
				
				if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipotransaAux.getId()>=0) {	
						this.tipotransasEliminados.add(tipotransaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipotransaAux,tipotransaLogic.getTipoTransas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaAux,tipotransas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipotransaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotransaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaLogic.saveTipoTransas();//WithConnection
						//tipotransaLogic.getSetVersionRowTipoTransas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotransaAux.setTransaccions(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionLogic.getTransaccions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipotransaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipotransaAux,tipotransaLogic.getTipoTransas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipotransaAux,tipotransas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.getTipoTransas().addAll(this.tipotransasEliminados);
					
					tipotransaLogic.saveTipoTransas();//WithConnection
					//tipotransaLogic.getSetVersionRowTipoTransas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipotransasEliminados= new ArrayList<TipoTransa>();		
			}
			
			if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Transa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipotransa=tipotransaAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTipoTransa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTransa tipotransaLocal) throws Exception {
		
		if(this.tipotransaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipotransaLocal.setTransaccions(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionLogic.getTransaccions());
			
			} else {
			
				tipotransaLocal.setTransaccions(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTransa tipotransaLocal) throws Exception {	
		if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoTransaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipotransaValidator.getInvalidValues(this.tipotransa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTransa tipotransa,List<TipoTransa> tipotransas) throws Exception {
		try	{		
			TipoTransaConstantesFunciones.actualizarLista(tipotransa,tipotransas,this.tipotransaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTransa tipotransa,List<TipoTransa> tipotransas) throws Exception {
		try	{			
			TipoTransaConstantesFunciones.actualizarSelectedLista(tipotransa,tipotransas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTransa> tipotransasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipotransasLocal=this.tipotransaLogic.getTipoTransas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipotransasLocal=this.tipotransas;
			}
			//ARCHITECTURE
		
			for(TipoTransa tipotransaLocal:tipotransasLocal) {
				if(this.permiteMantenimiento(tipotransaLocal) && tipotransaLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+TipoTransaConstantesFunciones.getTipoTransaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTransaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransa.jLabelnombreTipoTransa,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTransa.jLabelnombreTipoTransa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Transaccion")) {
			if(this.tipotransa==null) {
				this.tipotransa= new TipoTransa();
			}

			if(this.tipotransaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoTransa
				this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);

				this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.gettransaccion().setTipoTransa(this.tipotransa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoTransa--;	
		
		
		this.tipotransaAux=new TipoTransa();
		
		this.tipotransaAux.setId(this.iIdNuevoTipoTransa);
		this.tipotransaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotransaLogic.getTipoTransas().add(this.tipotransaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipotransas.add(this.tipotransaAux);
		}
		//ARCHITECTURE
		
		this.tipotransa=this.tipotransaAux;
		
		if(TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTransa(this.tipotransa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTransa(this.tipotransa);
		}
				
		//this.setDefaultControlesTipoTransa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTransa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTransa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTransa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTransa(this.tipotransaBean,this.tipotransa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTransaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
			classes=TipoTransaConstantesFunciones.getClassesRelationshipsOfTipoTransa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipotransaReturnGeneral=tipotransaLogic.procesarEventosTipoTransasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotransaLogic.getTipoTransas(),this.tipotransa,this.tipotransaParameterGeneral,this.isEsNuevoTipoTransa,classes);//this.tipotransaLogic.getTipoTransa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTransa(this.tipotransaReturnGeneral,this.tipotransaBean,false);
		
		if(this.tipotransaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTransa(this.tipotransaReturnGeneral.getTipoTransa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTransa(this.tipotransaReturnGeneral.getTipoTransa());
		}
		
		if(this.tipotransaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTransa(this.tipotransaReturnGeneral.getTipoTransa(),classes);//this.tipotransaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTransa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTransa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTransa(false);
						
			if(tipotransaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionSessionBean.getEsGuardarRelacionado() && TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTransa();
			}
			
			this.actualizarVisualTableDatosTipoTransa();
			
			this.jTableDatosTipoTransa.setRowSelectionInterval(this.getIndiceNuevoTipoTransa(), this.getIndiceNuevoTipoTransa());
			
			this.seleccionarFilaTablaTipoTransaActual();
						
			this.actualizarEstadoCeldasBotonesTipoTransa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTransa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.setEnabled(isHabilitar && this.tipotransaConstantesFunciones.activarnombreTipoTransa);	
		
	};
	
	public void setDefaultControlesTipoTransa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTransa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipotransaSessionBean.setConGuardarRelaciones(true);			
			this.tipotransaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipotransaSessionBean.setConGuardarRelaciones(false);			
			this.tipotransaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoTransa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
				if(tipotransaAux.getId().equals(this.iIdNuevoTipoTransa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransa tipotransaAux:this.tipotransas) {
				if(tipotransaAux.getId().equals(this.iIdNuevoTipoTransa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualTipoTransa(TipoTransa tipotransa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
				if(tipotransaAux.getId().equals(tipotransa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransa tipotransaAux:this.tipotransas) {
				if(tipotransaAux.getId().equals(tipotransa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalTipoTransa(TipoTransa tipotransaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
				if(tipotransaAux.getTipoTransaOriginal().getId().equals(tipotransaOriginal.getId())) {
					existe=true;
					tipotransaOriginal.setId(tipotransaAux.getId());
					tipotransaOriginal.setVersionRow(tipotransaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransa tipotransaAux:this.tipotransas) {
				if(tipotransaAux.getTipoTransaOriginal().getId().equals(tipotransaOriginal.getId())) {
					existe=true;
					tipotransaOriginal.setId(tipotransaAux.getId());
					tipotransaOriginal.setVersionRow(tipotransaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTransa(Boolean esParaCancelar) throws Exception {
		tipotransasAux=new ArrayList<TipoTransa>();
		tipotransaAux=new TipoTransa();
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
					if(tipotransaAux.getId()<0) {
						tipotransasAux.add(tipotransaAux);
					}		
				}
				this.iIdNuevoTipoTransa=0L;
				this.tipotransaLogic.getTipoTransas().removeAll(tipotransasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransa tipotransaAux:this.tipotransas) {
					if(tipotransaAux.getId()<0) {
						tipotransasAux.add(tipotransaAux);
					}		
				}
				this.iIdNuevoTipoTransa=0L;
				this.tipotransas.removeAll(tipotransasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTransa 
					&& this.tipotransaLogic.getTipoTransas().size()>0
					) {
					tipotransaAux=this.tipotransaLogic.getTipoTransas().get(this.tipotransaLogic.getTipoTransas().size() - 1);
				
					if(tipotransaAux.getId()<0) {
						this.tipotransaLogic.getTipoTransas().remove(tipotransaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTransa && this.tipotransas.size()>0) {
					tipotransaAux=this.tipotransas.get(this.tipotransas.size() - 1);
				
					if(tipotransaAux.getId()<0) {
						this.tipotransas.remove(tipotransaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTransa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipotransa.getId()<0) {
				this.tipotransaLogic.getTipoTransas().remove(this.tipotransa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipotransa.getId()<0) {
				this.tipotransas.remove(this.tipotransa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTransa(List<TipoTransa> tipotransasAux) throws Exception {
		TipoTransaConstantesFunciones.setEstadosInicialesTipoTransa(tipotransasAux);
	}
	
	public void setEstadosInicialesTipoTransa(TipoTransa tipotransaAux) throws Exception {
		TipoTransaConstantesFunciones.setEstadosInicialesTipoTransa(tipotransaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTransaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTransa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTransaActual()) {
				if(!this.isEsNuevoTipoTransa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTransa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTransa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTransaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Transa ?", "MANTENIMIENTO DE Tipo Transa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTransa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTransa tipotransa) throws Exception {
		TipoTransaConstantesFunciones.seleccionarAsignar(this.tipotransa,tipotransa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTransa=this.isPermisoActualizarOriginalTipoTransa;
			
			
			this.seleccionarAsignar(tipotransa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTransaConstantesFunciones.quitarEspaciosTipoTransa(this.tipotransa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTransa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipotransaSessionBean.setsFuncionBusquedaRapida(this.tipotransaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTransa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTransa(esParaCancelar);				
				this.cancelarNuevoTipoTransa(esParaCancelar);								
			}
			
			this.tipotransa=new TipoTransa();
			
			this.inicializarTipoTransa();
			
			this.actualizarEstadoCeldasBotonesTipoTransa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTransa() throws Exception {
		try {
			TipoTransaConstantesFunciones.inicializarTipoTransa(this.tipotransa);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipotransaLogic.getTipoTransas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTransas(String sAccionBusqueda,List<TipoTransa> tipotransasParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="TipoTransa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTransaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTransaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTransa"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Tipo Transas");		
		parameters.put("busquedapor", TipoTransaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Transaccion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoTransaLogic tipotransaLogicAuxiliar=new TipoTransaLogic();
					tipotransaLogicAuxiliar.setDatosCliente(tipotransaLogic.getDatosCliente());				
					tipotransaLogicAuxiliar.setTipoTransas(tipotransasParaReportes);
					
					tipotransaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoTransaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipotransasParaReportes=tipotransaLogicAuxiliar.getTipoTransas();
					
					//tipotransaLogic.getNewConnexionToDeep();
					
					//for (TipoTransa tipotransa:tipotransasParaReportes) {
					//	tipotransaLogic.deepLoad(tipotransa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipotransaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipotransaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransaccion = AuxiliarReportes.class.getResourceAsStream("TransaccionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccion", reportFileTransaccion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTransa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTransaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTransaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTransa=new JRBeanArrayDataSource(TipoTransaJInternalFrame.TraerTipoTransaBeans(tipotransasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTransa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTransaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTransaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTransaBean.TraerTipoTransaBeans(tipotransasParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteTipoTransas(sAccionBusqueda,sTipoArchivoReporte,tipotransasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTransas(sAccionBusqueda,sTipoArchivoReporte,tipotransasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTransaActionPerformed(null);
					//this.generarExcelReporteTipoTransas(sAccionBusqueda,sTipoArchivoReporte,tipotransasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTransas(sAccionBusqueda,sTipoArchivoReporte,tipotransasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTransas(sAccionBusqueda,sTipoArchivoReporte,tipotransasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTransas(sAccionBusqueda,sTipoArchivoReporte,tipotransasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTransas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTransa> tipotransasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTransas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTransa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTransa tipotransa : tipotransasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTransaConstantesFunciones.generarExcelReporteDataTipoTransa("NORMAL",row,workbook,tipotransa,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTransa(String sTipo,Row row,Workbook workbook) {
		
		TipoTransaConstantesFunciones.generarExcelReporteHeaderTipoTransa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTransas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTransa> tipotransasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTransas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTransa tipotransa : tipotransasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTransaConstantesFunciones.getTipoTransaDescripcion(tipotransa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTransaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTransaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotransa.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTransas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTransa> tipotransasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTransa> tipotransasRespaldo=null;
		
		classes=TipoTransaConstantesFunciones.getClassesRelationshipsOfTipoTransa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipotransaLogic.setDatosCliente(this.datosCliente);
		this.tipotransaLogic.setDatosDeep(this.datosDeep);
		this.tipotransaLogic.setIsConDeep(true);
		
		tipotransasRespaldo=this.tipotransaLogic.getTipoTransas();
		
		this.tipotransaLogic.setTipoTransas(tipotransasParaReportes);	
		this.tipotransaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipotransasParaReportes=this.tipotransaLogic.getTipoTransas();
		this.tipotransaLogic.setTipoTransas(tipotransasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTransas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTransa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTransa tipotransa : tipotransasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTransa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTransaConstantesFunciones.generarExcelReporteDataTipoTransa("NORMAL",row,workbook,tipotransa,cellStyleDataAux);
		
			
			


				//Transaccion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipotransa.getTransaccions()!=null && tipotransa.getTransaccions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionConstantesFunciones.generarExcelReporteHeaderTransaccion("RELACIONADO",row,workbook);
				}

				if(tipotransa.getTransaccions()!=null) {
					i2=0;
					for(Transaccion transaccion : tipotransa.getTransaccions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionConstantesFunciones.generarExcelReporteDataTransaccion("RELACIONADO",row,workbook,transaccion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoTransaConstantesFunciones.getTipoTransaDescripcion(tipotransa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTransa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTransa() throws Exception {		
		this.startProcessTipoTransa(true);
	}
	
	public void startProcessTipoTransa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoTransa, this.jScrollPanelDatosTipoTransa,this.jPanelPaginacionTipoTransa, this.jScrollPanelDatosEdicionTipoTransa, this.jPanelAccionesTipoTransa,this.jPanelAccionesFormularioTipoTransa,this.jmenuBarTipoTransa,this.jmenuBarDetalleTipoTransa,this.jTtoolBarTipoTransa,this.jTtoolBarDetalleTipoTransa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTransa=null; 
		
		final JPanel jPanelParametrosReportesTipoTransa=this.jPanelParametrosReportesTipoTransa;
		//final JScrollPane jScrollPanelDatosTipoTransa=this.jScrollPanelDatosTipoTransa;
		final JTable jTableDatosTipoTransa=this.jTableDatosTipoTransa;		
		final JPanel jPanelPaginacionTipoTransa=this.jPanelPaginacionTipoTransa;
		//final JScrollPane jScrollPanelDatosEdicionTipoTransa=this.jScrollPanelDatosEdicionTipoTransa;
		final JPanel jPanelAccionesTipoTransa=this.jPanelAccionesTipoTransa;
		
		JPanel jPanelCamposAuxiliarTipoTransa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTransa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			jPanelCamposAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jPanelCamposTipoTransa;
			jPanelAccionesFormularioAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jPanelAccionesFormularioTipoTransa;
		}
		
		final JPanel jPanelCamposTipoTransa=jPanelCamposAuxiliarTipoTransa;
		final JPanel jPanelAccionesFormularioTipoTransa=jPanelAccionesFormularioAuxiliarTipoTransa;
		
		
		final JMenuBar jmenuBarTipoTransa=this.jmenuBarTipoTransa;
		final JToolBar jTtoolBarTipoTransa=this.jTtoolBarTipoTransa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTransa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTransa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			jmenuBarDetalleAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jmenuBarDetalleTipoTransa;
			jTtoolBarDetalleAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jTtoolBarDetalleTipoTransa;
		}
		
		final JMenuBar jmenuBarDetalleTipoTransa=jmenuBarDetalleAuxiliarTipoTransa;
		final JToolBar jTtoolBarDetalleTipoTransa=jTtoolBarDetalleAuxiliarTipoTransa;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTransa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTransa;
			processRunnable.jTableDatos=jTableDatosTipoTransa;
			processRunnable.jPanelCampos=jPanelCamposTipoTransa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTransa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTransa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTransa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTransa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTransa;
			processRunnable.jTtoolBar=jTtoolBarTipoTransa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTransa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTransa ,jPanelParametrosReportesTipoTransa,jTableDatosTipoTransa, /*jScrollPanelDatosTipoTransa,*/jPanelCamposTipoTransa,jPanelPaginacionTipoTransa, /*jScrollPanelDatosEdicionTipoTransa,*/ jPanelAccionesTipoTransa,jPanelAccionesFormularioTipoTransa,jmenuBarTipoTransa,jmenuBarDetalleTipoTransa,jTtoolBarTipoTransa,jTtoolBarDetalleTipoTransa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoTransa, jScrollPanelDatosTipoTransa,jPanelPaginacionTipoTransa, jScrollPanelDatosEdicionTipoTransa, jPanelAccionesTipoTransa,jPanelAccionesFormularioTipoTransa,jmenuBarTipoTransa,jmenuBarDetalleTipoTransa,jTtoolBarTipoTransa,jTtoolBarDetalleTipoTransa);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessTipoTransa() {// throws Exception 
		this.finishProcessTipoTransa(true);
	}
	
	public void finishProcessTipoTransa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoTransa, this.jScrollPanelDatosTipoTransa,this.jPanelPaginacionTipoTransa, this.jScrollPanelDatosEdicionTipoTransa, this.jPanelAccionesTipoTransa,this.jPanelAccionesFormularioTipoTransa,this.jmenuBarTipoTransa,this.jmenuBarDetalleTipoTransa,this.jTtoolBarTipoTransa,this.jTtoolBarDetalleTipoTransa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTransa=null; 
		
		final JPanel jPanelParametrosReportesTipoTransa=this.jPanelParametrosReportesTipoTransa;
		//final JScrollPane jScrollPanelDatosTipoTransa=this.jScrollPanelDatosTipoTransa;
		final JTable jTableDatosTipoTransa=this.jTableDatosTipoTransa;		
		final JPanel jPanelPaginacionTipoTransa=this.jPanelPaginacionTipoTransa;
		//final JScrollPane jScrollPanelDatosEdicionTipoTransa=this.jScrollPanelDatosEdicionTipoTransa;
		final JPanel jPanelAccionesTipoTransa=this.jPanelAccionesTipoTransa;
		
		JPanel jPanelCamposAuxiliarTipoTransa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTransa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			jPanelCamposAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jPanelCamposTipoTransa;
			jPanelAccionesFormularioAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jPanelAccionesFormularioTipoTransa;
		}
		
		final JPanel jPanelCamposTipoTransa=jPanelCamposAuxiliarTipoTransa;
		final JPanel jPanelAccionesFormularioTipoTransa=jPanelAccionesFormularioAuxiliarTipoTransa;
		
		
		final JMenuBar jmenuBarTipoTransa=this.jmenuBarTipoTransa;		
		final JToolBar jTtoolBarTipoTransa=this.jTtoolBarTipoTransa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTransa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTransa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			jmenuBarDetalleAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jmenuBarDetalleTipoTransa;
			jTtoolBarDetalleAuxiliarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jTtoolBarDetalleTipoTransa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTransa=jmenuBarDetalleAuxiliarTipoTransa;
		final JToolBar jTtoolBarDetalleTipoTransa=jTtoolBarDetalleAuxiliarTipoTransa;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTransa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTransa;
			processRunnable.jTableDatos=jTableDatosTipoTransa;
			processRunnable.jPanelCampos=jPanelCamposTipoTransa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTransa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTransa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTransa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTransa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTransa;
			processRunnable.jTtoolBar=jTtoolBarTipoTransa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTransa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTransa ,jPanelParametrosReportesTipoTransa, jTableDatosTipoTransa,/*jScrollPanelDatosTipoTransa,*/jPanelCamposTipoTransa,jPanelPaginacionTipoTransa, /*jScrollPanelDatosEdicionTipoTransa,*/ jPanelAccionesTipoTransa,jPanelAccionesFormularioTipoTransa,jmenuBarTipoTransa,jmenuBarDetalleTipoTransa,jTtoolBarTipoTransa,jTtoolBarDetalleTipoTransa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTransa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTransa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTransa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTransa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTransa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTransa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTransa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTransa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTransa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipotransaConstantesFunciones.getsFinalQueryTipoTransa();
		String  finalQueryPaginacionTodos=this.tipotransaConstantesFunciones.getsFinalQueryTipoTransa();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTransaConstantesFunciones.getArrayColumnasGlobalesNoTipoTransa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTransaConstantesFunciones.getArrayColumnasGlobalesTipoTransa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTransaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipotransasEliminados= new ArrayList<TipoTransa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTransa();
		
				///*TipoTransaSessionBean*/this.tipotransaSessionBean=new TipoTransaSessionBean();
			
			if(this.tipotransaSessionBean==null) {
				this.tipotransaSessionBean=new TipoTransaSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=TipoTransaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTransaConstantesFunciones.getClassesForeignKeysOfTipoTransa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipotransa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipotransasAux= new ArrayList<TipoTransa>();
			
				
			tipotransaLogic.setDatosCliente(this.datosCliente);
			tipotransaLogic.setDatosDeep(this.datosDeep);
			tipotransaLogic.setIsConDeep(true);
			
			
			tipotransaLogic.getTipoTransaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipotransaLogic.getTodosTipoTransas(finalQueryGlobal,pagination);
					
					//tipotransaLogic.getTodosTipoTransasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipotransaLogic.getTipoTransas()==null|| tipotransaLogic.getTipoTransas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotransasAux= new ArrayList<TipoTransa>();
							tipotransasAux.addAll(tipotransaLogic.getTipoTransas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransasAux= new ArrayList<TipoTransa>();
							tipotransasAux.addAll(tipotransas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotransaLogic.getTodosTipoTransas(finalQueryGlobal+"",this.pagination);												
							
							//tipotransaLogic.getTodosTipoTransasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTransas("Todos",tipotransaLogic.getTipoTransas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotransaLogic.setTipoTransas(new ArrayList<TipoTransa>());					
							tipotransaLogic.getTipoTransas().addAll(tipotransasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransas=new ArrayList<TipoTransa>();
							tipotransas.addAll(tipotransasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTransa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTransa=this.idActual;
				
				} else if(this.idTipoTransaActual!=null && this.idTipoTransaActual!=0L) {
					idTipoTransa=idTipoTransaActual;
				}
				
					
				this.sDetalleReporte=TipoTransaConstantesFunciones.getDetalleIndicePorId(idTipoTransa);
				
				this.tipotransas=new ArrayList<TipoTransa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipotransaLogic.getEntity(idTipoTransa);
					
					//tipotransaLogic.getEntityWithConnection(idTipoTransa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaLogic.setTipoTransas(new ArrayList<TipoTransa>());
					tipotransaLogic.getTipoTransas().add(tipotransaLogic.getTipoTransa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotransas=new ArrayList<TipoTransa>();
					this.tipotransas.add(tipotransa);
				}
				
				if(tipotransaLogic.getTipoTransa()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTransa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTransa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotransaLogic.getTipoTransas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotransas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotransaLogic.getTipoTransas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotransas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTransa tipotransa) {
		Boolean permite=true;
		
		if(this.tipotransa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTransaConstantesFunciones.getOrderByListaTipoTransa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTransaConstantesFunciones.getOrderByListaTipoTransa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransa tipotransa:tipotransaLogic.getTipoTransas()) {
				if(tipotransa.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaTotales=tipotransa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransa tipotransa:this.tipotransas) {
				if(tipotransa.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaTotales=tipotransa;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.tipotransaAux=new TipoTransa();
			this.tipotransaAux.setsType(Constantes2.S_TOTALES);
			this.tipotransaAux.setIsNew(false);
			this.tipotransaAux.setIsChanged(false);
			this.tipotransaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTransaConstantesFunciones.TotalizarValoresFilaTipoTransa(this.tipotransaLogic.getTipoTransas(),this.tipotransaAux);
				
				this.tipotransaLogic.getTipoTransas().add(this.tipotransaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTransaConstantesFunciones.TotalizarValoresFilaTipoTransa(this.tipotransas,this.tipotransaAux);
				
				this.tipotransas.add(this.tipotransaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipotransaTotales=new TipoTransa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotransaLogic.getTipoTransas().remove(tipotransaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotransas.remove(tipotransaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipotransaTotales=new TipoTransa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransa tipotransa:tipotransaLogic.getTipoTransas()) {
				if(tipotransa.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaTotales=tipotransa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTransaConstantesFunciones.TotalizarValoresFilaTipoTransa(this.tipotransaLogic.getTipoTransas(),tipotransaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransa tipotransa:this.tipotransas) {
				if(tipotransa.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaTotales=tipotransa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTransaConstantesFunciones.TotalizarValoresFilaTipoTransa(this.tipotransas,tipotransaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoTransaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoTransaPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaLogic.getTipoTransaPorNombre(nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTipoTransa() {
		this.isPermisoTodoTipoTransa=false;
		this.isPermisoNuevoTipoTransa=false;
		this.isPermisoActualizarTipoTransa=false;
		this.isPermisoActualizarOriginalTipoTransa=false;
		this.isPermisoEliminarTipoTransa=false;
		this.isPermisoGuardarCambiosTipoTransa=false;
		this.isPermisoConsultaTipoTransa=false;
		this.isPermisoBusquedaTipoTransa=false;
		this.isPermisoReporteTipoTransa=false;		
		this.isPermisoOrdenTipoTransa=false;		
		this.isPermisoPaginacionMedioTipoTransa=false;		
		this.isPermisoPaginacionAltoTipoTransa=false;
		this.isPermisoPaginacionTodoTipoTransa=false;
		this.isPermisoCopiarTipoTransa=false;		
		this.isPermisoVerFormTipoTransa=false;		
		this.isPermisoDuplicarTipoTransa=false;		
		this.isPermisoOrdenTipoTransa=false;		
	}
	
	public void setPermisosUsuarioTipoTransa(Boolean isPermiso) {
		this.isPermisoTodoTipoTransa=isPermiso;
		this.isPermisoNuevoTipoTransa=isPermiso;
		this.isPermisoActualizarTipoTransa=isPermiso;
		this.isPermisoActualizarOriginalTipoTransa=isPermiso;
		this.isPermisoEliminarTipoTransa=isPermiso;
		this.isPermisoGuardarCambiosTipoTransa=isPermiso;
		this.isPermisoConsultaTipoTransa=isPermiso;
		this.isPermisoBusquedaTipoTransa=isPermiso;
		this.isPermisoReporteTipoTransa=isPermiso;
		this.isPermisoOrdenTipoTransa=isPermiso;		
		this.isPermisoPaginacionMedioTipoTransa=isPermiso;		
		this.isPermisoPaginacionAltoTipoTransa=isPermiso;		
		this.isPermisoPaginacionTodoTipoTransa=isPermiso;		
		this.isPermisoCopiarTipoTransa=isPermiso;		
		this.isPermisoVerFormTipoTransa=isPermiso;		
		this.isPermisoDuplicarTipoTransa=isPermiso;
		this.isPermisoOrdenTipoTransa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTransa(Boolean isPermiso) {
		//this.isPermisoTodoTipoTransa=isPermiso;
		this.isPermisoNuevoTipoTransa=isPermiso;
		this.isPermisoActualizarTipoTransa=isPermiso;
		this.isPermisoActualizarOriginalTipoTransa=isPermiso;
		this.isPermisoEliminarTipoTransa=isPermiso;
		this.isPermisoGuardarCambiosTipoTransa=isPermiso;
		//this.isPermisoConsultaTipoTransa=isPermiso;
		//this.isPermisoBusquedaTipoTransa=isPermiso;
		//this.isPermisoReporteTipoTransa=isPermiso;
		//this.isPermisoOrdenTipoTransa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTransa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTransa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTransa=isPermiso;		
		//this.isPermisoCopiarTipoTransa=isPermiso;		
		//this.isPermisoDuplicarTipoTransa=isPermiso;
		//this.isPermisoOrdenTipoTransa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTransaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransaccionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoTransaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransaccion=false;
		this.isTienePermisosTransaccion=this.verificarGetPermisosUsuarioOpcionTipoTransaClaseRelacionada(this.opcionsRelacionadas,TransaccionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTransa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTransaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransaccion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTransaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTransaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTransaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransaccion && this.jInternalFrameDetalleFormTipoTransa!=null && this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.remove(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoTransa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTransaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTransaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTransa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTransa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTransa=this.isPermisoActualizarTipoTransa;
			this.isPermisoEliminarTipoTransa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTransa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTransa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTransa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTransa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTransa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTransa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTransa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTransa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTransa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTransa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTransa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTransa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTransa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTransa.setToolTipText(this.jTableDatosTipoTransa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTransa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTransa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTransaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(TipoTransaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioTipoTransa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransaccion && this.tipotransaConstantesFunciones.mostrarTransaccionTipoTransa && !TipoTransaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion");
			reporte.setsDescripcion("Transaccion");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoTransaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTransaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTransaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTransaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoTransaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTransa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoTransa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTransa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTransa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTransa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTransa(TipoTransa tipotransa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTransa(TipoTransa tipotransa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTransa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTransa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTransa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTransa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTransa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTransa()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTransa(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTransa()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoTransaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTransaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTransaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipotransaSessionBean=new TipoTransaSessionBean(); 
		this.tipotransaConstantesFunciones=new TipoTransaConstantesFunciones(); 
		this.tipotransaBean=new TipoTransa();//(this.tipotransaConstantesFunciones); 		
		this.tipotransaReturnGeneral=new TipoTransaParameterReturnGeneral(); 
		
		this.tipotransaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotransaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTransaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTransaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTransaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTransa(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.tipotransaConstantesFunciones=new TipoTransaConstantesFunciones(); 
			this.tipotransaBean=new TipoTransa();//this.tipotransaConstantesFunciones); 			
			this.tipotransaReturnGeneral=new TipoTransaParameterReturnGeneral(); 
		
			TipoTransaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Transa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipotransa=new TipoTransa();
			this.tipotransas = new ArrayList<TipoTransa>();
			this.tipotransasAux = new ArrayList<TipoTransa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic=new TipoTransaLogic();
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipotransaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipotransaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTransa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTransa);	
					}
					
					if(this.jInternalFrameImportacionTipoTransa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTransa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTransa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTransa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTransa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTransa);
				this.jInternalFrameDetalleFormTipoTransa.setVisible(false);
				this.jInternalFrameDetalleFormTipoTransa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTransa);
					this.jInternalFrameReporteDinamicoTipoTransa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTransa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTransa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTransa);
					this.jInternalFrameImportacionTipoTransa.setVisible(false);
					this.jInternalFrameImportacionTipoTransa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTransa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTransa);
					this.jInternalFrameOrderByTipoTransa.setVisible(false);
					this.jInternalFrameOrderByTipoTransa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTransaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTransaConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.tipotransaReturnGeneral=new TipoTransaParameterReturnGeneral();
			
			this.tipotransaParameterGeneral=new TipoTransaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipotransaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(TipoTransaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransaccionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTransaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotransaSessionBean.getEsGuardarRelacionado(),this.tipotransaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTransaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotransaSessionBean.getEsGuardarRelacionado(),this.tipotransaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoTipoTransa=false;
			this.isVisibilidadCeldaDuplicarTipoTransa=true;
			this.isVisibilidadCeldaCopiarTipoTransa=true;
			this.isVisibilidadCeldaVerFormTipoTransa=true;
			this.isVisibilidadCeldaOrdenTipoTransa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
			this.isVisibilidadCeldaModificarTipoTransa=false;
			this.isVisibilidadCeldaActualizarTipoTransa=false;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
			this.isVisibilidadCeldaCancelarTipoTransa=false;
			this.isVisibilidadCeldaGuardarTipoTransa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTransa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTransa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTransa(false);
			
			this.setPermisosUsuarioTipoTransa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotransaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipotransaSessionBean.getEsGuardarRelacionado() && this.tipotransaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTransaClasesRelacionadas();
			}
			
			if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTransaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTransaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTransa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTransa();
			}
			
			if(!this.isPermisoBusquedaTipoTransa) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTransa,this.isPermisoPaginacionMedioTipoTransa,this.isPermisoPaginacionTodoTipoTransa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTransaConstantesFunciones.getTiposSeleccionarTipoTransa());
				
				this.tiposColumnasSelect=TipoTransaConstantesFunciones.getTiposSeleccionarTipoTransa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoTransa();				
				//this.tiposRelacionesSelect=TipoTransaConstantesFunciones.getTiposRelacionesTipoTransa(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTransa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoTransa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoTransa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransa() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.transaccionLogic=new TransaccionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipotransaImplementable= (TipoTransaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTransaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipotransaImplementableHome= (TipoTransaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTransaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipotransas= new ArrayList<TipoTransa>();
			this.tipotransasEliminados= new ArrayList<TipoTransa>();
						
			this.isEsNuevoTipoTransa=false;
			this.esParaAccionDesdeFormularioTipoTransa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTransa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTransa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTransaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTransa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTransa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTransa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTransa();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTransa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTransa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTransa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTransa")) {
				iIndex=this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();	
				
				

				if(sTitle.equals("Transacciones")) {
					if(!TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoTransa();

						this.cargarParteTabPanelRelacionadaTransaccion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTransa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaTransaccion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoTransa.cargarSessionConBeanSwingJInternalFrameTransaccion(false,true,iIndex);
		this.jButtonTransaccionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccion();

		//this.jTabbedPaneRelacionesTipoTransa.updateUI();
		//this.jTabbedPaneRelacionesTipoTransa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoTransa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Transaccion")) {
				int row=this.jTableDatosTipoTransa.getSelectedRow();
				jButtonTransaccionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transaccion")) {

					if(this.isTienePermisosTransaccion && this.tipotransaConstantesFunciones.mostrarTransaccionTipoTransa && !TipoTransaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transacciones"+"("+TransaccionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transacciones");

						if(tipotransaConstantesFunciones.resaltarTransaccionTipoTransa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipotransaConstantesFunciones.resaltarTransaccionTipoTransa);
						}

						jmenuItem.setEnabled(this.tipotransaConstantesFunciones.activarTransaccionTipoTransa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Transaccion"));

						

						this.jInternalFrameDetalleFormTipoTransa.jmenuDetalleTipoTransa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoTransa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTransa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTransa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTransaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTransa();
		
		this.cargarCombosFrameForeignKeyTipoTransa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTransa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTransa();
		}
	}
	
	
	
	public void jButtonNuevoTipoTransaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			
			if(jTableDatosTipoTransa.getRowCount()>=1) {
				jTableDatosTipoTransa.removeRowSelectionInterval(0, jTableDatosTipoTransa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTransa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTransa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTransa(true);			
			//this.tipotransa=new TipoTransa();
			//this.tipotransa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTransa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransa() ;
			
			if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTransa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipotransa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);				
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTransa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTransaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTransa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTransa.getSelectedRows().length;			
			}
			
			tipotransasSeleccionados=this.getTipoTransasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTransa--;			
				//TipoTransa tipotransaAux= new TipoTransa();			
				//tipotransaAux.setId(this.iIdNuevoTipoTransa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTransa tipotransaOrigen=new TipoTransa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTransa tipotransaOrigen : tipotransasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipotransaOrigen =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaOrigen =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTransa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipotransa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTransa(tipotransaOrigen,this.tipotransa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotransaLogic.getTipoTransas().add(this.tipotransaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotransas.add(this.tipotransaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTransa(false);
				
				this.jTableDatosTipoTransa.setRowSelectionInterval(this.getIndiceNuevoTipoTransa(), this.getIndiceNuevoTipoTransa());
				
				int iLastRow =  this.jTableDatosTipoTransa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTransa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTransa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTransa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();									
		
			TipoTransa tipotransaOrigen=new TipoTransa();
			TipoTransa tipotransaDestino=new TipoTransa();
				
			tipotransasSeleccionados=this.getTipoTransasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTransa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipotransasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTransa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaOrigen =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotransaOrigen =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaDestino =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotransaDestino =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipotransaOrigen =tipotransasSeleccionados.get(0);
				tipotransaDestino =tipotransasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTransa(tipotransaOrigen,tipotransaDestino,true,false);
				
				tipotransaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotransaDestino,tipotransaLogic.getTipoTransas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaDestino,tipotransas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTransa(false);
				
				//this.jTableDatosTipoTransa.setRowSelectionInterval(this.getIndiceNuevoTipoTransa(), this.getIndiceNuevoTipoTransa());
				
				int iLastRow =  this.jTableDatosTipoTransa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTransa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTransa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTransa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTransa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTransa.isVisible();
			
			
			this.jPanelParametrosReportesTipoTransa.setVisible(!isVisible);
			this.jPanelPaginacionTipoTransa.setVisible(!isVisible);
			this.jPanelAccionesTipoTransa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTransa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTransa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTransa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTransa();
			
			this.abrirFrameOrderByTipoTransa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTransa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTransa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTransa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTransa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTransa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTransa.setSize(this.jInternalFrameDetalleFormTipoTransa.iWidthFormulario,this.jInternalFrameDetalleFormTipoTransa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTransa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTransa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTransa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTransa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTransa.jContentPaneDetalleTipoTransa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTransa.jContentPaneDetalleTipoTransa.getWidth(),TipoTransaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTransa.jContentPaneDetalleTipoTransa.getWidth(),TipoTransaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTransa.jContentPaneDetalleTipoTransa.getWidth(),TipoTransaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTransa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTransa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTransa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTransa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTransa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransa,false,this);
				} else {
					this.jInternalFrameOrderByTipoTransa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTransa);
				this.jInternalFrameOrderByTipoTransa.setVisible(false);
				this.jInternalFrameOrderByTipoTransa.setSelected(false);
				
				this.jInternalFrameOrderByTipoTransa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTransa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTransa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTransa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTransa==null) {
				
				this.jInternalFrameImportacionTipoTransa=new ImportacionJInternalFrame(TipoTransaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTransa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTransa);
				this.jInternalFrameImportacionTipoTransa.setVisible(false);
				this.jInternalFrameImportacionTipoTransa.setSelected(false);


				this.jInternalFrameImportacionTipoTransa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTransa"));
				this.jInternalFrameImportacionTipoTransa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTransa"));
				this.jInternalFrameImportacionTipoTransa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTransa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTransa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTransa==null) {
				this.jInternalFrameReporteDinamicoTipoTransa=new ReporteDinamicoJInternalFrame(TipoTransaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTransa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTransa);
				this.jInternalFrameReporteDinamicoTipoTransa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTransa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTransa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTransa"));
				this.jInternalFrameReporteDinamicoTipoTransa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTransa"));
				this.jInternalFrameReporteDinamicoTipoTransa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTransa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTransa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaTransaccion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoTransa.jContentPaneDetalleTipoTransa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoTransa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTransa);
			
	       	this.jInternalFrameDetalleFormTipoTransa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTransa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTransa.dispose();
			//this.jInternalFrameDetalleFormTipoTransa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTransa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTransa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTransa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTransa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTransa.setVisible(true);
	        this.jInternalFrameImportacionTipoTransa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTransa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTransa.setVisible(true);
	        this.jInternalFrameOrderByTipoTransa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTransa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTransa.setVisible(false);
	        this.jInternalFrameOrderByTipoTransa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTransa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTransa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTransa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTransa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTransa.setVisible(false);
	        this.jInternalFrameImportacionTipoTransa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTransa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTransa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTransa(true);
			//this.isEsNuevoTipoTransa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTransa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTransa(false) ;
			
			if(tipotransaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionSessionBean.getEsGuardarRelacionado() && TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTransa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTransaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTransa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTransa(true);
			//this.isEsNuevoTipoTransa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipotransa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTransa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTransa(false) ;
			
			if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTransa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTransa(false);
			
			//if(!this.isEsNuevoTipoTransa) {								
				int intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
				
			}
			
			if(this.permiteMantenimiento(this.tipotransa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTransa=true;
					this.inicializarActualizarBindingTablaTipoTransa(false);
					this.isEsNuevoTipoTransa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTransa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTransa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTransa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTransa(false);
				
				this.habilitarDeshabilitarControlesTipoTransa(false);
			
												
				
				if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTransa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTransaActionPerformed(evt,tipotransaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTransa(this.tipotransa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTransa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipotransaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipotransa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTransaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				this.tipotransa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				this.tipotransa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipotransa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTransaModel) this.jTableDatosTipoTransa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTransa=true;
				this.inicializarActualizarBindingTablaTipoTransa(false);
				this.isEsNuevoTipoTransa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTransa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTransa(false);
				
				this.habilitarDeshabilitarControlesTipoTransa(false);
				
				
				
				if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTransa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTransaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTransa.getRowCount()>=1) {
				jTableDatosTipoTransa.removeRowSelectionInterval(0, jTableDatosTipoTransa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTransa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTransa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTransa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransa(false) ;
			
			this.isEsNuevoTipoTransa=false;
			
			if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTransa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTransaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTransa(false);
				
				//SI ES MANUAL
				if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTransa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTransaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTransa--;			
			//TipoTransa tipotransaAux= new TipoTransa();			
			//tipotransaAux.setId(this.iIdNuevoTipoTransa);
			
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTransa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
			
			this.tipotransa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipotransaLogic.getTipoTransas().add(this.tipotransaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipotransas.add(this.tipotransaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTransa(false);
			
			this.jTableDatosTipoTransa.setRowSelectionInterval(this.getIndiceNuevoTipoTransa(), this.getIndiceNuevoTipoTransa());
			
			int iLastRow =  this.jTableDatosTipoTransa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTransa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTransa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTransa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTransaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTransa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransa(false);
			
			//SI ES MANUAL
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTransa();
			}
			
			//this.abrirFrameTreeTipoTransa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTransaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo TransaS ?", "MANTENIMIENTO DE Tipo Transa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTransa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTransa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipotransaReturnGeneral=tipotransaLogic.procesarImportacionTipoTransasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipotransaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTransaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTransaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTransa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTransa.setFileImportacion(this.jInternalFrameImportacionTipoTransa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTransa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTransa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTransa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTransa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTransaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		

		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTransaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTransaBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteTipoTransas("Todos",tipotransasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTransaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoTipoTransa.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTransaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTransaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTransaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTipoTransaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransa";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("TipoTransas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTransaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTransaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTransa tipotransa:tipotransasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotransa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelTipoTransa(row);				
			//	iRow++;
			//}				
			
			//for(TipoTransa tipotransaAux:tipotransasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTransa(tipotransaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransa(false);
			
			//SI ES MANUAL
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTransa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTransaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransa(false);
			
			//SI ES MANUAL
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTransa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTransaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransa(false);
			
			//SI ES MANUAL
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTransa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTransa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTransa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTransa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTransa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTransa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTransa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTransa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTransa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTransa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTransa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTransa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTransa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTransa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTransa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTransa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTransaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTransa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTransa();
		
		this.inicializarActualizarBindingBotonesManualTipoTransa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTransa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTransa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTransa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTransa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTransa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTransa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTransa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTransa.jCheckBoxPostAccionNuevoTipoTransa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTransa.jCheckBoxPostAccionSinCerrarTipoTransa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTransa.jCheckBoxPostAccionSinMensajeTipoTransa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTransa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTransa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTransa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTransa!=null) {
				this.jInternalFrameDetalleFormTipoTransa.jCheckBoxPostAccionNuevoTipoTransa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTransa.jCheckBoxPostAccionSinCerrarTipoTransa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTransa.jCheckBoxPostAccionSinMensajeTipoTransa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTransa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTransa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTransa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTransa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTransa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTransa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTransa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTransa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTransa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTransa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTransa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransa() throws Exception {
		try	{
			if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTransa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTransa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTransa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTransa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTransa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTransa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTransa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTransa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTransa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTransa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTransa.addItem(reporte);
			}
			
			
			if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTransa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTransa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTransa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTransa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTransa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTransa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTransa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTransa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTransa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTransa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTransa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
				this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
				this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTransa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTransa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTransa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTransa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTransa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTransa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTransa(Boolean esInicializar) throws Exception {				
		if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTransa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTransa() throws Exception {
		this.inicializarActualizarBindingTablaTipoTransa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTransa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTransaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTransaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTransaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTransaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTransaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTransa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipotransaLogic.getTipoTransas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipotransas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTransa.setModel(new TipoTransaModel(this.tipotransaLogic.getTipoTransas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTransa.setModel(new TipoTransaModel(this.tipotransas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTransa!=null && this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTransa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTransa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTransaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTransaConstantesFunciones.SCLASSWEBTITULO,tipotransaConstantesFunciones.resaltarSeleccionarTipoTransa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTransaConstantesFunciones.SCLASSWEBTITULO,tipotransaConstantesFunciones.resaltarSeleccionarTipoTransa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTransa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransa,TipoTransaConstantesFunciones.LABEL_ID));

		if(this.tipotransaConstantesFunciones.mostraridTipoTransa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTransaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipotransaConstantesFunciones.resaltaridTipoTransa,this.tipotransaConstantesFunciones.activaridTipoTransa,this,true,"idTipoTransa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotransaConstantesFunciones.resaltaridTipoTransa,this.tipotransaConstantesFunciones.activaridTipoTransa,this,true,"idTipoTransa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTransa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransa,TipoTransaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipotransaConstantesFunciones.mostrarnombreTipoTransa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTransaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotransaConstantesFunciones.resaltarnombreTipoTransa,this.tipotransaConstantesFunciones.activarnombreTipoTransa,this,true,"nombreTipoTransa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotransaConstantesFunciones.resaltarnombreTipoTransa,this.tipotransaConstantesFunciones.activarnombreTipoTransa,this,true,"nombreTipoTransa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTransaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransaccion && this.tipotransaConstantesFunciones.mostrarTransaccionTipoTransa && !TipoTransaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transacciones");
				tableColumn.setHeaderValue("Transacciones");
				tableColumn.setCellRenderer(new TransaccionTableCell(tipotransaConstantesFunciones.resaltarTransaccionTipoTransa,this,this.tipotransaConstantesFunciones.activarTransaccionTipoTransa));
				tableColumn.setCellEditor(new TransaccionTableCell(tipotransaConstantesFunciones.resaltarTransaccionTipoTransa,this,this.tipotransaConstantesFunciones.activarTransaccionTipoTransa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoTransa.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotransaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotransaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTransa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotransaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotransaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTransa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTransa && this.isPermisoGuardarCambiosTipoTransa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipotransaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipotransaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTransa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipotransaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoTransa.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosTipoTransa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTransa && this.isPermisoGuardarCambiosTipoTransa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipotransaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTransa && this.isPermisoGuardarCambiosTipoTransa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTransa.moveColumn(this.jTableDatosTipoTransa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTransa.moveColumn(this.jTableDatosTipoTransa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipotransaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoTransa.moveColumn(this.jTableDatosTipoTransa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTransa.moveColumn(this.jTableDatosTipoTransa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTransa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTransa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTransa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTransa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTransa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTransa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTransa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTransa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=tipotransaLogic.getTipoTransas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipotransas.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosTipoTransa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTransa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTransa();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoTipoTransa=false;
					
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
				if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTransa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTransa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTransa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipotransa.getsType().equals("DUPLICADO")
				   || this.tipotransa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTransa=true;
				
				} else {
					this.isEsNuevoTipoTransa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipotransa.getId()>=0 && !this.tipotransa.getIsNew()) {						
						this.isEsNuevoTipoTransa=false;
						
					} else {
						this.isEsNuevoTipoTransa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTransa(esRelaciones);						
				
				this.seleccionarTipoTransa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipotransa.getId()<0) {
					this.isEsNuevoTipoTransa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTransa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTransa(evt,rowIndex);
				}	
				
				if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTransa: " + this.dDif); 
					}
				}								
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTransa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipotransa)) {
					if(this.tipotransa.getId()>0) {
						this.tipotransa.setIsDeleted(true);
						
						this.tipotransasEliminados.add(this.tipotransa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotransaLogic.getTipoTransas().remove(this.tipotransa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotransas.remove(this.tipotransa);				
					}
					
					
					((TipoTransaModel) this.jTableDatosTipoTransa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTransa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTransa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTransa) {
			
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTransa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTransa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTransa(this.tipotransa);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTransa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTransa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTransa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTransa(TipoTransa tipotransa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTransa(tipotransa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTransa(TipoTransa tipotransa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTransa(tipotransa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTransa(tipotransa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTransa(tipotransa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTransa(TipoTransa tipotransa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.setText(tipotransa.getId().toString());
			this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.setText(tipotransa.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTransa tipotransaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipotransaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTransa tipotransaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipotransaLocal=this.tipotransa;
			} else {
				tipotransaLocal=this.tipotransaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipotransaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTransa(tipotransaLocal,true);
					
					if(tipotransaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipotransaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipotransaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTransa(TipoTransa tipotransa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTransa(tipotransa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(tipotransa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTransa(TipoTransa tipotransa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTransa(tipotransa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTransa(TipoTransa tipotransa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.getText()==null || this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.getText()=="" || this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.setText("0");
			}

			if(conColumnasBase) {tipotransa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTransaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransa.jLabelIdTipoTransa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotransa.setnombre(this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTransaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransa.jLabelnombreTipoTransa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTransa(TipoTransa tipotransaBean,TipoTransa tipotransa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTransa(TipoTransa tipotransaOrigen,TipoTransa tipotransa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotransaOrigen.getId()!=null && !tipotransaOrigen.getId().equals(0L))) {tipotransa.setId(tipotransaOrigen.getId());}}
			if(conDefault || (!conDefault && tipotransaOrigen.getnombre()!=null && !tipotransaOrigen.getnombre().equals(""))) {tipotransa.setnombre(tipotransaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTransa(TipoTransa tipotransa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.setText(tipotransa.getId().toString());
			this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.setText(tipotransa.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTransa(TipoTransaBean tipotransaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.setText(tipotransaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.setText(tipotransaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTransa(TipoTransaParameterReturnGeneral tipotransaReturnGeneral,TipoTransaBean tipotransaBean,Boolean conDefault) throws Exception { 
		try {
			TipoTransa tipotransaLocal=new TipoTransa();
			
			tipotransaLocal=tipotransaReturnGeneral.getTipoTransa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotransaLocal.getId()!=null && !tipotransaLocal.getId().equals(0L))) {tipotransaBean.setId(tipotransaLocal.getId());}}
			if(conDefault || (!conDefault && tipotransaLocal.getnombre()!=null && !tipotransaLocal.getnombre().equals(""))) {tipotransaBean.setnombre(tipotransaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTransaGenerico(Long idTipoTransaSeleccionado,JComboBox jComboBoxTipoTransa,List<TipoTransa> tipotransasLocal)throws Exception {
		try {
			TipoTransa  tipotransaTemp=null;

			for(TipoTransa tipotransaAux:tipotransasLocal) {
				if(tipotransaAux.getId()!=null && tipotransaAux.getId().equals(idTipoTransaSeleccionado)) {
					tipotransaTemp=tipotransaAux;
					break;
				}
			}

			jComboBoxTipoTransa.setSelectedItem(tipotransaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTransaGenerico(JComboBox jComboBoxTipoTransa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxTipoTransa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTransa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTransa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTransa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTransa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTransa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTransa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTransa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTransa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTransa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("Transaccion")) {
			jButtonTransaccionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotransa=(TipoTransa) tipotransaLogic.getTipoTransas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotransa =(TipoTransa) tipotransas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTransa tipotransaRow=new TipoTransa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotransaRow=(TipoTransa) tipotransaLogic.getTipoTransas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotransaRow=(TipoTransa) tipotransas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransaccionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoTransa tipotransa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoTransa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransa = (TipoTransa)this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipotransa = (TipoTransa)this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipotransa!=null) {
						this.tipotransa = tipotransa;
					} else {
						this.tipotransa = new TipoTransa();
					}
				}

				if(this.isTienePermisosTransaccion && this.permiteMantenimiento(this.tipotransa)) {
					TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFramePopup=new TransaccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFramePopup;
					} else {
						transaccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame;
					}

					List<TipoTransa> tipotransas=new ArrayList<TipoTransa>();
					tipotransas.add(this.tipotransa);
					if(!esRelacionado) {
						//transaccionBeanSwingJInternalFrame.transaccionSessionBean.setConGuardarRelaciones(false);
						//transaccionBeanSwingJInternalFrame.transaccionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoTransa.cargarTransaccionBeanSwingJInternalFrame(tipotransas,this.tipotransa,transaccionBeanSwingJInternalFrame,/*conInicializar,*/transaccionBeanSwingJInternalFrame.transaccionSessionBean.getConGuardarRelaciones(),transaccionBeanSwingJInternalFrame.transaccionSessionBean.getEsGuardarRelacionado());
					transaccionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccion("no_relacionado");

						transaccionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionConstantesFunciones.ITAMANIOFILATABLA + (TransaccionConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoTransa=(TitledBorder)this.jScrollPanelDatosTipoTransa.getBorder();
						TitledBorder titledBorderTransaccion=(TitledBorder)transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

						titledBorderTransaccion.setTitle(titledBorderTipoTransa.getTitle() + " -> Transaccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionBeanSwingJInternalFrame);
						}

						transaccionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionBeanSwingJInternalFrame);

						transaccionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipotransaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTransa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTransa.setVisible((this.isVisibilidadCeldaNuevoTipoTransa && this.isPermisoNuevoTipoTransa));			
			this.jButtonDuplicarTipoTransa.setVisible((this.isVisibilidadCeldaDuplicarTipoTransa && this.isPermisoDuplicarTipoTransa));			
			this.jButtonCopiarTipoTransa.setVisible((this.isVisibilidadCeldaCopiarTipoTransa && this.isPermisoCopiarTipoTransa));
			this.jButtonVerFormTipoTransa.setVisible((this.isVisibilidadCeldaVerFormTipoTransa && this.isPermisoVerFormTipoTransa));
			
			this.jButtonAbrirOrderByTipoTransa.setVisible((this.isVisibilidadCeldaOrdenTipoTransa && this.isPermisoOrdenTipoTransa));			
			
			this.jButtonNuevoRelacionesTipoTransa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTransa && this.isPermisoNuevoTipoTransa));			
			this.jButtonNuevoGuardarCambiosTipoTransa.setVisible((this.isVisibilidadCeldaNuevoTipoTransa && this.isPermisoNuevoTipoTransa && this.isPermisoGuardarCambiosTipoTransa));
			
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonModificarTipoTransa.setVisible((this.isVisibilidadCeldaModificarTipoTransa && this.isPermisoActualizarTipoTransa));	
			this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarTipoTransa.setVisible((this.isVisibilidadCeldaActualizarTipoTransa && this.isPermisoActualizarTipoTransa));	
			this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarTipoTransa.setVisible((this.isVisibilidadCeldaEliminarTipoTransa && this.isPermisoEliminarTipoTransa));
			this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarTipoTransa.setVisible(this.isVisibilidadCeldaCancelarTipoTransa);							
			this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.setVisible((this.isVisibilidadCeldaGuardarTipoTransa && this.isPermisoGuardarCambiosTipoTransa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTransa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTransa && this.isPermisoGuardarCambiosTipoTransa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTransa.setVisible((this.isVisibilidadCeldaNuevoTipoTransa && this.isPermisoNuevoTipoTransa));						
			this.jButtonDuplicarToolBarTipoTransa.setVisible((this.isVisibilidadCeldaDuplicarTipoTransa && this.isPermisoDuplicarTipoTransa));						
			this.jButtonCopiarToolBarTipoTransa.setVisible((this.isVisibilidadCeldaCopiarTipoTransa && this.isPermisoCopiarTipoTransa));			
			this.jButtonVerFormToolBarTipoTransa.setVisible((this.isVisibilidadCeldaVerFormTipoTransa && this.isPermisoVerFormTipoTransa));			
			this.jButtonAbrirOrderByToolBarTipoTransa.setVisible((this.isVisibilidadCeldaOrdenTipoTransa && this.isPermisoOrdenTipoTransa));
			this.jButtonNuevoRelacionesToolBarTipoTransa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTransa && this.isPermisoNuevoTipoTransa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTransa.setVisible((this.isVisibilidadCeldaNuevoTipoTransa && this.isPermisoNuevoTipoTransa && this.isPermisoGuardarCambiosTipoTransa));			
			
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonModificarToolBarTipoTransa.setVisible((this.isVisibilidadCeldaModificarTipoTransa && this.isPermisoActualizarTipoTransa));	
			this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarToolBarTipoTransa.setVisible((this.isVisibilidadCeldaActualizarTipoTransa  && this.isPermisoActualizarTipoTransa));	
			this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarToolBarTipoTransa.setVisible((this.isVisibilidadCeldaEliminarTipoTransa && this.isPermisoEliminarTipoTransa));
			this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarToolBarTipoTransa.setVisible(this.isVisibilidadCeldaCancelarTipoTransa);				
			this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosToolBarTipoTransa.setVisible((this.isVisibilidadCeldaGuardarTipoTransa && this.isPermisoGuardarCambiosTipoTransa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTransa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTransa && this.isPermisoGuardarCambiosTipoTransa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTransa.setVisible((this.isVisibilidadCeldaNuevoTipoTransa && this.isPermisoNuevoTipoTransa));			
			this.jMenuItemDuplicarTipoTransa.setVisible((this.isVisibilidadCeldaDuplicarTipoTransa && this.isPermisoDuplicarTipoTransa));			
			this.jMenuItemCopiarTipoTransa.setVisible((this.isVisibilidadCeldaCopiarTipoTransa && this.isPermisoCopiarTipoTransa));			
			this.jMenuItemVerFormTipoTransa.setVisible((this.isVisibilidadCeldaVerFormTipoTransa && this.isPermisoVerFormTipoTransa));			
			this.jMenuItemAbrirOrderByTipoTransa.setVisible((this.isVisibilidadCeldaOrdenTipoTransa && this.isPermisoOrdenTipoTransa));			
			//this.jMenuItemMostrarOcultarTipoTransa.setVisible((this.isVisibilidadCeldaOrdenTipoTransa && this.isPermisoOrdenTipoTransa));
			this.jMenuItemDetalleAbrirOrderByTipoTransa.setVisible((this.isVisibilidadCeldaOrdenTipoTransa && this.isPermisoOrdenTipoTransa));			
			//this.jMenuItemDetalleMostrarOcultarTipoTransa.setVisible((this.isVisibilidadCeldaOrdenTipoTransa && this.isPermisoOrdenTipoTransa));			
			this.jMenuItemNuevoRelacionesTipoTransa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTransa && this.isPermisoNuevoTipoTransa));			
			this.jMenuItemNuevoGuardarCambiosTipoTransa.setVisible((this.isVisibilidadCeldaNuevoTipoTransa && this.isPermisoNuevoTipoTransa && this.isPermisoGuardarCambiosTipoTransa));									
			
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemModificarTipoTransa.setVisible((this.isVisibilidadCeldaModificarTipoTransa && this.isPermisoActualizarTipoTransa));	
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemActualizarTipoTransa.setVisible((this.isVisibilidadCeldaActualizarTipoTransa && this.isPermisoActualizarTipoTransa));	
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemEliminarTipoTransa.setVisible((this.isVisibilidadCeldaEliminarTipoTransa && this.isPermisoEliminarTipoTransa));
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemCancelarTipoTransa.setVisible(this.isVisibilidadCeldaCancelarTipoTransa);				
			}
			
			this.jMenuItemGuardarCambiosTipoTransa.setVisible((this.isVisibilidadCeldaGuardarTipoTransa && this.isPermisoGuardarCambiosTipoTransa));						
			this.jMenuItemGuardarCambiosTablaTipoTransa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTransa && this.isPermisoGuardarCambiosTipoTransa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTransa=this.jButtonNuevoTipoTransa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTransa=this.jButtonDuplicarTipoTransa.isVisible();
			this.isVisibilidadCeldaCopiarTipoTransa=this.jButtonCopiarTipoTransa.isVisible();
			this.isVisibilidadCeldaVerFormTipoTransa=this.jButtonVerFormTipoTransa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTransa=this.jButtonAbrirOrderByTipoTransa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=this.jButtonNuevoRelacionesTipoTransa.isVisible();
			this.isVisibilidadCeldaModificarTipoTransa=this.jButtonModificarTipoTransa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.isVisibilidadCeldaActualizarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarTipoTransa.isVisible();
			this.isVisibilidadCeldaEliminarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarTipoTransa.isVisible();
			this.isVisibilidadCeldaCancelarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarTipoTransa.isVisible();
			this.isVisibilidadCeldaGuardarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=this.jButtonGuardarCambiosTablaTipoTransa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTransa=this.jButtonNuevoToolBarTipoTransa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=this.jButtonNuevoRelacionesToolBarTipoTransa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.isVisibilidadCeldaModificarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonModificarToolBarTipoTransa.isVisible();
			this.isVisibilidadCeldaActualizarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarToolBarTipoTransa.isVisible();
			this.isVisibilidadCeldaEliminarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarToolBarTipoTransa.isVisible();
			this.isVisibilidadCeldaCancelarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarToolBarTipoTransa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTransa=this.jButtonGuardarCambiosToolBarTipoTransa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=this.jButtonGuardarCambiosTablaToolBarTipoTransa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTransa=this.jMenuItemNuevoTipoTransa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=this.jMenuItemNuevoRelacionesTipoTransa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.isVisibilidadCeldaModificarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jMenuItemModificarTipoTransa.isVisible();
			this.isVisibilidadCeldaActualizarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jMenuItemActualizarTipoTransa.isVisible();
			this.isVisibilidadCeldaEliminarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jMenuItemEliminarTipoTransa.isVisible();
			this.isVisibilidadCeldaCancelarTipoTransa=this.jInternalFrameDetalleFormTipoTransa.jMenuItemCancelarTipoTransa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTransa=this.jMenuItemGuardarCambiosTipoTransa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=this.jMenuItemGuardarCambiosTablaTipoTransa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTransa(Boolean esInicializar) {
		if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipotransaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTransa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTransa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTransa() {
		this.jButtonNuevoTipoTransa.setVisible(this.isPermisoNuevoTipoTransa);			
		this.jButtonDuplicarTipoTransa.setVisible(this.isPermisoDuplicarTipoTransa);			
		this.jButtonCopiarTipoTransa.setVisible(this.isPermisoCopiarTipoTransa);			
		this.jButtonVerFormTipoTransa.setVisible(this.isPermisoVerFormTipoTransa);			
		
		this.jButtonAbrirOrderByTipoTransa.setVisible(this.isPermisoOrdenTipoTransa);					
		
		this.jButtonNuevoRelacionesTipoTransa.setVisible(this.isPermisoNuevoTipoTransa);			
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonModificarTipoTransa.setVisible(this.isPermisoActualizarTipoTransa);	
			this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarTipoTransa.setVisible(this.isPermisoActualizarTipoTransa);	
			this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarTipoTransa.setVisible(this.isPermisoEliminarTipoTransa);
			this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarTipoTransa.setVisible(this.isVisibilidadCeldaCancelarTipoTransa);						
			this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.setVisible(this.isPermisoGuardarCambiosTipoTransa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTransa.setVisible(this.isPermisoActualizarTipoTransa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTransa() {
		this.jInternalFrameDetalleFormTipoTransa.jButtonModificarTipoTransa.setVisible(this.isPermisoActualizarTipoTransa);	
		this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarTipoTransa.setVisible(this.isPermisoActualizarTipoTransa);	
		this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarTipoTransa.setVisible(this.isPermisoEliminarTipoTransa);
		this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarTipoTransa.setVisible(this.isVisibilidadCeldaCancelarTipoTransa);							
		this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.setVisible((this.isVisibilidadCeldaGuardarTipoTransa && this.isPermisoGuardarCambiosTipoTransa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTransa() {
		if(TipoTransaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTransa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTransa() {
	}
	
	public void jTableDatosTipoTransaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTransa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTransaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTransa(this.gettipotransa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotransa==null) {
						this.tipotransa = new TipoTransa();
					}

					this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
				}

				if(this.tipotransa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipotransa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTransa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTransaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTransa(this.gettipotransa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotransa==null) {
						this.tipotransa = new TipoTransa();
					}

					this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);
				}

				if(this.tipotransa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipotransa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTransa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoTransa() {
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
		

		if(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
			this.jInternalFrameDetalleFormTipoTransa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTransa.dispose();
			this.jInternalFrameDetalleFormTipoTransa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
			this.jInternalFrameReporteDinamicoTipoTransa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTransa.dispose();
			this.jInternalFrameReporteDinamicoTipoTransa=null;
		}
		
		if(this.jInternalFrameImportacionTipoTransa!=null) {
			this.jInternalFrameImportacionTipoTransa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTransa.dispose();
			this.jInternalFrameImportacionTipoTransa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTransa();
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTransa")) {
				jButtonDuplicarTipoTransaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTransa")) {
				jButtonCopiarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTransa")) {
				jButtonVerFormTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTransa")) {
				jButtonDuplicarTipoTransaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTransa")) {
				jButtonDuplicarTipoTransaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTransa")) {
				jButtonModificarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTransa")) {
				jButtonModificarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTransa")) {
				jButtonModificarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTransa")) {
				jButtonActualizarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTransa")) {
				jButtonActualizarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTransa")) {
				jButtonActualizarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTransa")) {
				jButtonEliminarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTransa")) {
				jButtonEliminarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTransa")) {
				jButtonEliminarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTransa")) {
				jButtonCancelarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTransa")) {
				jButtonCancelarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTransa")) {
				jButtonCancelarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTransa")) {
				jButtonCerrarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTransa")) {
				jButtonCerrarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTransa")) {
				jButtonCerrarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTransa")) {
				jButtonMostrarOcultarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTransa")) {
				jButtonCancelarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTransa")) {
				jButtonCopiarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTransa")) {
				jButtonVerFormTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTransa")) {
				jButtonCopiarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTransa")) {
				jButtonVerFormTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTransa")) {
				jButtonRecargarInformacionTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTransa")) {
				jButtonRecargarInformacionTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTransa")) {
				jButtonRecargarInformacionTipoTransaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTransa")) {
				jButtonAnterioresTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTransa")) {
				jButtonAnterioresTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTransa")) {
				jButtonAnterioresTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTransa")) {
				jButtonSiguientesTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTransa")) {
				jButtonSiguientesTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTransa")) {
				jButtonSiguientesTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTransa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTransa")) {
				jButtonAbrirOrderByTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTransa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTransa")) {
				jButtonMostrarOcultarTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTransa")) {
				jButtonNuevoGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTransa")) {
				jButtonNuevoGuardarCambiosTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTransa")) {
				jButtonNuevoGuardarCambiosTipoTransaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTransa")) {
				jButtonCerrarReporteDinamicoTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTransa")) {
				jButtonGenerarReporteDinamicoTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTransa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTransa")) {
				jButtonCerrarImportacionTipoTransaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTransa")) {
				
				jButtonGenerarImportacionTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTransa")) {
				
				jButtonAbrirImportacionTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTransa")) {
				jComboBoxTiposAccionesTipoTransaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTransa")) {
				jComboBoxTiposRelacionesTipoTransaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTransa")) {
				jComboBoxTiposAccionesTipoTransaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTransa")) {
				
				jComboBoxTiposSeleccionarTipoTransaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTransa")) {
				jTextFieldValorCampoGeneralTipoTransaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTransa")) {
				jButtonAbrirOrderByTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTransa")) {
				jButtonAbrirOrderByTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTransa")) {
				jButtonCerrarOrderByTipoTransaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTransaBusqueda")) {
				this.jButtonidTipoTransaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTransaBusqueda")) {
				this.jButtonnombreTipoTransaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTransa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTransa tipotransaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipotransaLocal=this.tipotransa;
			} else {
				tipotransaLocal=this.tipotransaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
							
				
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
								
						
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
								
				
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
							
				
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaAnterior =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotransaAnterior =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
								
				
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTransa")) {
					jCheckBoxSeleccionarTodosTipoTransaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTransa")) {
					jCheckBoxSeleccionadosTipoTransaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTransa")) {
					
				}
				
				


				
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
												
				
				


				
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaAnterior =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotransaAnterior =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransa);
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaAnterior =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTransa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTransaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTransa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipotransa =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipotransa =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipotransa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTransa")) {
				
				}
				
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTransa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTransa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTransa")) {
			
			}
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTransa();
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTransa")) {
				jButtonDuplicarTipoTransaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTransa")) {
				jButtonCopiarTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTransa")) {
				jButtonVerFormTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTransa")) {
				jButtonNuevoTipoTransaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTransa")) {
				jButtonModificarTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTransa")) {
				jButtonActualizarTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTransa")) {
				jButtonEliminarTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTransa")) {
				jButtonCancelarTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTransa")) {
				jButtonCerrarTipoTransaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTransa")) {
				jButtonGuardarCambiosTipoTransaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTransa")) {
				jButtonNuevoGuardarCambiosTipoTransaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTransa")) {
				jButtonAbrirOrderByTipoTransaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTransa")) {
				jButtonRecargarInformacionTipoTransaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTransa")) {
				jButtonAnterioresTipoTransaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTransa")) {
				jButtonSiguientesTipoTransaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTransaBusqueda")) {
				this.jButtonidTipoTransaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTransaBusqueda")) {
				this.jButtonnombreTipoTransaBusquedaActionPerformed(evt);
			}
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTransa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTransa")) {
				closingInternalFrameTipoTransa();
				
			} else if(sTipo.equals("jButtonCancelarTipoTransa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTransa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTransaBeanSwingJInternalFrame jInternalFrameParent=(TipoTransaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTransa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTransaActionPerformed(null);
			}
			
			TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotransa,new Object(),this.tipotransaParameterGeneral,this.tipotransaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTransa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTransa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTransa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipotransa)) {
			if(!esControlTabla) {
				if(TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);			
				}
				
				if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTransa(this.tipotransa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotransaReturnGeneral=tipotransaLogic.procesarEventosTipoTransasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransaLogic.getTipoTransas(),this.tipotransa,this.tipotransaParameterGeneral,this.isEsNuevoTipoTransa,classes);//this.tipotransaLogic.getTipoTransa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTransa(this.tipotransaReturnGeneral,this.tipotransaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTransa(classes,this.tipotransaReturnGeneral,this.tipotransaBean,false);
					}
						
					if(this.tipotransaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTransa(this.tipotransaReturnGeneral.getTipoTransa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTransa(this.tipotransaReturnGeneral.getTipoTransa());	
					}
						
					if(this.tipotransaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTransa(this.tipotransaReturnGeneral.getTipoTransa(),classes);//this.tipotransaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTransa(this.tipotransa,classes);//this.tipotransaBean);									
				}
			
				if(TipoTransaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTransa(this.tipotransa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransa(this.tipotransa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipotransaAnterior!=null) {
						this.tipotransa=this.tipotransaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotransaReturnGeneral=tipotransaLogic.procesarEventosTipoTransasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransaLogic.getTipoTransas(),this.tipotransa,this.tipotransaParameterGeneral,this.isEsNuevoTipoTransa,classes);//this.tipotransaLogic.getTipoTransa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotransaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotransaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipotransaReturnGeneral.getTipoTransa(),tipotransaLogic.getTipoTransas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipotransaReturnGeneral.getTipoTransa(),this.tipotransas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTransa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTransa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTransa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTransa() throws Exception {
		
		TipoTransaModel tipotransaModel=(TipoTransaModel)this.jTableDatosTipoTransa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotransaModel.tipotransas=this.tipotransaLogic.getTipoTransas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipotransaModel.tipotransas=this.tipotransas;
		}
		
		
		((TipoTransaModel) this.jTableDatosTipoTransa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTransa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipotransaAnterior(),this.tipotransaLogic.getTipoTransas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipotransaAnterior(),this.tipotransas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTransa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTransa(TipoTransa tipotransa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Transaccion.class)) {
					this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionLogic.setTransaccions(tipotransa.getTransaccions());
					this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransa,new Object(),generalEntityParameterGeneral,this.tipotransaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTransaConstantesFunciones.getClassesRelationshipsOfTipoTransa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTransaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTransa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTransa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTransaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransa,new Object(),generalEntityParameterGeneral,this.tipotransaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTransa(TipoTransaBean tipotransaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Transaccion.class)) {
					this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionLogic.setTransaccions(tipotransa.getTransaccions());
					this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTransa(ArrayList<Classe> classes,TipoTransaReturnGeneral tipotransaReturnGeneral,TipoTransaBean tipotransaBean,Boolean conDefault) throws Exception {
		
			this.tipotransaBean.setTransaccions(tipotransaReturnGeneral.getTipoTransa().getTransaccions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTransa(TipoTransa tipotransa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Transaccion.class)) {
					tipotransa.setTransaccions(this.jInternalFrameDetalleFormTipoTransa.transaccionBeanSwingJInternalFrame.transaccionLogic.getTransaccions());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipotransa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTransa = new TipoTransaDetalleFormJInternalFrame(jDesktopPane,this.tipotransaSessionBean.getConGuardarRelaciones(),this.tipotransaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTransa);
		this.jInternalFrameDetalleFormTipoTransa.setVisible(false);
		this.jInternalFrameDetalleFormTipoTransa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTransa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTransa.tipotransaLogic=this.tipotransaLogic;
		
		this.cargarCombosFrameForeignKeyTipoTransa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTransa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTransa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTransa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTransa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTransa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTransa"));
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonModificarTipoTransa.addActionListener(new ButtonActionListener(this,"ModificarTipoTransa"));

		
		this.jInternalFrameDetalleFormTipoTransa.jButtonModificarToolBarTipoTransa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTransa"));
					
		this.jInternalFrameDetalleFormTipoTransa.jMenuItemModificarTipoTransa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTransa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarTipoTransa.addActionListener (new ButtonActionListener(this,"ActualizarTipoTransa"));
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarToolBarTipoTransa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTransa"));
						
		this.jInternalFrameDetalleFormTipoTransa.jMenuItemActualizarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTransa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarTipoTransa.addActionListener (new ButtonActionListener(this,"EliminarTipoTransa"));
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTransa"));
								
		this.jInternalFrameDetalleFormTipoTransa.jMenuItemEliminarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTransa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarTipoTransa.addActionListener (new ButtonActionListener(this,"CancelarTipoTransa"));
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTransa"));
					
		this.jInternalFrameDetalleFormTipoTransa.jMenuItemCancelarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTransa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTransa.jMenuItemDetalleCerrarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTransa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTransa"));
		
		
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTransa"));
		
		
		
		this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTransa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransa.jButtonidTipoTransaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTransaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransa.jButtonnombreTipoTransaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTransaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTransa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTransa"));
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTransa"));
		}
		
		this.jTableDatosTipoTransa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTransa"));
		
		this.jTableDatosTipoTransa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTransa"));
		
		this.jButtonNuevoTipoTransa.addActionListener(new ButtonActionListener(this,"NuevoTipoTransa"));
		
		this.jButtonDuplicarTipoTransa.addActionListener(new ButtonActionListener(this,"DuplicarTipoTransa"));
		
		this.jButtonCopiarTipoTransa.addActionListener(new ButtonActionListener(this,"CopiarTipoTransa"));
		
		this.jButtonVerFormTipoTransa.addActionListener(new ButtonActionListener(this,"VerFormTipoTransa"));
		
		
		this.jButtonNuevoToolBarTipoTransa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTransa"));
			
		this.jButtonDuplicarToolBarTipoTransa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTransa"));
			
		this.jMenuItemNuevoTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTransa"));
			
		this.jMenuItemDuplicarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTransa"));		
		
		
		this.jButtonNuevoRelacionesTipoTransa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTransa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTransa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTransa"));
			
		this.jMenuItemNuevoRelacionesTipoTransa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTransa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonModificarTipoTransa.addActionListener(new ButtonActionListener(this,"ModificarTipoTransa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonModificarToolBarTipoTransa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTransa"));
			
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemModificarTipoTransa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTransa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarTipoTransa.addActionListener (new ButtonActionListener(this,"ActualizarTipoTransa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonActualizarToolBarTipoTransa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTransa"));
				
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemActualizarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTransa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarTipoTransa.addActionListener (new ButtonActionListener(this,"EliminarTipoTransa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonEliminarToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTransa"));
						
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemEliminarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTransa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarTipoTransa.addActionListener (new ButtonActionListener(this,"CancelarTipoTransa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonCancelarToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTransa"));
			
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemCancelarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTransa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTransa"));		
		
		
		this.jButtonCerrarTipoTransa.addActionListener (new ButtonActionListener(this,"CerrarTipoTransa"));
		
		
		this.jButtonCerrarToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTransa"));
			
		this.jMenuItemCerrarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTransa"));
			
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jMenuItemDetalleCerrarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTransa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTransa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTransa"));
		}
		
		this.jButtonCopiarToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTransa"));
			
		this.jButtonVerFormToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTransa"));
		
		this.jMenuItemGuardarCambiosTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTransa"));
			
		this.jMenuItemCopiarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTransa"));		
		
		this.jMenuItemVerFormTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTransa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTransa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTransa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTransa"));
			
		this.jMenuItemGuardarCambiosTablaTipoTransa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTransa"));		
		
		
		
		this.jButtonRecargarInformacionTipoTransa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTransa"));
					
		this.jButtonRecargarInformacionToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTransa"));
		
		this.jMenuItemRecargarInformacionTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTransa"));		
		
		
		
		this.jButtonAnterioresTipoTransa.addActionListener (new ButtonActionListener(this,"AnterioresTipoTransa"));
		
		
		this.jButtonAnterioresToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTransa"));
		
		this.jMenuItemAnterioresTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTransa"));		
		
		
		this.jButtonSiguientesTipoTransa.addActionListener (new ButtonActionListener(this,"SiguientesTipoTransa"));
		
		
		this.jButtonSiguientesToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTransa"));
			
		this.jMenuItemSiguientesTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTransa"));
			
		this.jMenuItemAbrirOrderByTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTransa"));
			
		this.jMenuItemMostrarOcultarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTransa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTransa"));
			
		this.jMenuItemDetalleMostarOcultarTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTransa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTransa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTransa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTransa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTransa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTransa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTransa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTransa"));

		this.jCheckBoxSeleccionadosTipoTransa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTransa"));
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTransa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTransa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTransa"));
			
		this.jComboBoxTiposAccionesTipoTransa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTransa"));
					
		this.jComboBoxTiposSeleccionarTipoTransa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTransa"));
			
		this.jTextFieldValorCampoGeneralTipoTransa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTransa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransa.jButtonidTipoTransaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTransaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransa.jButtonnombreTipoTransaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTransaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTransa!=null) {
				this.jInternalFrameReporteDinamicoTipoTransa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTransa"));
				this.jInternalFrameReporteDinamicoTipoTransa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTransa"));
				this.jInternalFrameReporteDinamicoTipoTransa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTransa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTransa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTransa"));				
			//this.jButtonGenerarReporteDinamicoTipoTransa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTransa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTransa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTransa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTransa!=null) {
				this.jInternalFrameImportacionTipoTransa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTransa"));
				this.jInternalFrameImportacionTipoTransa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTransa"));
				this.jInternalFrameImportacionTipoTransa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTransa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTransa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTransa"));
			
			this.jButtonAbrirOrderByToolBarTipoTransa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTransa"));			
			
			if(this.jInternalFrameOrderByTipoTransa!=null) {
				this.jInternalFrameOrderByTipoTransa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTransa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTransa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransa.jTabbedPaneRelacionesTipoTransa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTransa"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameTipoTransa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTransa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTransa = (JInternalFrameBase)event.getSource();
	            	
	            TipoTransaBeanSwingJInternalFrame jInternalFrameParent=(TipoTransaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTransa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTransaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTransa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTransaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTransa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTransa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTransa";
		inputMap = this.jButtonNuevoTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTransaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTransa";
		inputMap = this.jButtonNuevoRelacionesTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTransaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTransa";
		inputMap = this.jButtonModificarTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTransaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTransa";
		inputMap = this.jButtonActualizarTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTransaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTransa";
		inputMap = this.jButtonEliminarTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTransaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTransa";
		inputMap = this.jButtonCancelarTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTransaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTransa";
		inputMap = this.jButtonCerrarTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTransaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTransa";
		inputMap = this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTransa.jButtonGuardarCambiosTipoTransa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTransaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTransa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTransaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTransa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTransaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTransa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTransaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTransa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTransaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransa.jButtonidTipoTransaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTransaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransa.jButtonnombreTipoTransaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTransaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTransa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTransaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTransaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTransa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTransa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
					tipotransaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransa tipotransaAux:tipotransas) {
					tipotransaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTransaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTransa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
						tipotransaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTransa tipotransaAux:tipotransas) {
						tipotransaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTransa tipotransaAux:tipotransas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTransa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTransa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTransa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTransa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTransaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTransa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTransa.getSelectedRows();
			
			TipoTransa tipotransaLocal=new TipoTransa();
			
			//this.seleccionarTodosTipoTransa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaLocal =(TipoTransa) this.tipotransaLogic.getTipoTransas().toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipotransaLocal =(TipoTransa) this.tipotransas.toArray()[this.jTableDatosTipoTransa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipotransaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
						tipotransaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTransa tipotransaAux:tipotransas) {
						tipotransaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTransa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTransa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTransa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTransa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTransaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTransaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTransaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTransa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTransa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTransa tipotransaAux:this.tipotransaLogic.getTipoTransas()) {
				
						if(sTipoSeleccionar.equals(TipoTransaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotransaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransa tipotransaAux:tipotransas) {
					
						if(sTipoSeleccionar.equals(TipoTransaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotransaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTransa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTransaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTransa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTransa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTransa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTransa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTransa(conSplash);
				
					this.generarReporteTipoTransasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTransasSeleccionados();
				//this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTransasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTransasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTransa();
				
				this.exportarTipoTransasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTransas();
				//this.importarTipoTransas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTransa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTransasSeleccionados();
				//this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Transa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTransa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTransa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTransa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransa.jComboBoxTiposAccionesFormularioTipoTransa.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTransa();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTransa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTransaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTransa();
			
			if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
			TipoTransa tipotransa=new TipoTransa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTransa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTransa.getSelectedItem();
			
			
			
			
			tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipotransasSeleccionados.size()==1) {
				for(TipoTransa tipotransaAux:tipotransasSeleccionados) {
					tipotransa=tipotransaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transaccion")) {
					jButtonTransaccionActionPerformed(null,rowIndex,true,false,tipotransa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTransa();
			
      		//this.finishProcessTipoTransa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTransaReturnGeneral() throws Exception {
		if(this.tipotransaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipotransaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipotransaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipotransaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipotransaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipotransaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTransa(false);
		}
		
		if(this.tipotransaReturnGeneral.getConRetornoLista() || this.tipotransaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipotransaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotransaLogic.setTipoTransas(this.tipotransaReturnGeneral.getTipoTransas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipotransaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotransaLogic.setTipoTransa(this.tipotransaReturnGeneral.getTipoTransa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTransa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTransa() throws Exception {
		
		
	}
	
	public ArrayList<TipoTransa> getTipoTransasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTransa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTransa tipotransaAux:tipotransaLogic.getTipoTransas()) {
					if(tipotransaAux.getIsSelected()) {
						tipotransasSeleccionados.add(tipotransaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransa tipotransaAux:this.tipotransas) {
					if(tipotransaAux.getIsSelected()) {
						tipotransasSeleccionados.add(tipotransaAux);				
					}
				}
			}
			
			if(tipotransasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipotransasSeleccionados.addAll(this.tipotransaLogic.getTipoTransas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipotransasSeleccionados.addAll(this.tipotransas);				
					}
				}
			}
		} else {
			tipotransasSeleccionados.add(this.tipotransa);
		}
		
		return tipotransasSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteTipoTransasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTransasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTransasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTransasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTransasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoTransasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Transa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTransasSeleccionados() throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTransas("Todos",tipotransasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTransasSeleccionados() throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTransas("Todos",tipotransasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTransasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTransas("Todos",tipotransasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTransasSeleccionados() throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTransa();
		
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTransa();
		
		
		//this.generarReporteTipoTransas("Todos",tipotransasSeleccionados ,tipotransaImplementable,tipotransaImplementableHome);
	}
	
	public void mostrarImportacionTipoTransas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTransa();
		
		this.abrirFrameImportacionTipoTransa();		
		
			
		//this.generarReporteTipoTransas("Todos",tipotransasSeleccionados ,tipotransaImplementable,tipotransaImplementableHome);
	}
	
	public void importarTipoTransas() throws Exception {		
	
	}
	
	public void exportarTipoTransasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTransasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTransasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTransasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Transa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTransasSeleccionados() throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTransa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTransa tipotransaAux:tipotransasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTransa(tipotransaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipotransaAux.setsDetalleGeneralEntityReporte(tipotransaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTransa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTransaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTransaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTransaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTransa(TipoTransa tipotransa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipotransa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotransa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotransa.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTransasSeleccionados() throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTransas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTransa(row);				
				iRow++;
			}				
			
			for(TipoTransa tipotransaAux:tipotransasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTransa(tipotransaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTransasSeleccionados() throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();		
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipotransas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipotransa");
			//elementRoot.appendChild(element);
		
			for(TipoTransa tipotransaAux:tipotransasSeleccionados) {
				element = document.createElement("tipotransa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTransa(tipotransaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTransa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTransa(TipoTransa tipotransa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipotransa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotransa.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoTransa(TipoTransa tipotransa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTransaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipotransa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTransaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipotransa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoTransaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipotransa.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoTransasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTransa> tipotransasSeleccionados=new ArrayList<TipoTransa>();
		
		tipotransasSeleccionados=this.getTipoTransasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTransa(tipotransasSeleccionados);
		
		this.generarReporteTipoTransas("Todos",tipotransasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTransa(ArrayList<TipoTransa> tipotransasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTransa tipotransaAux:tipotransasSeleccionados) {
				tipotransaAux.setsDetalleGeneralEntityReporte(tipotransaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTransaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipotransaAux.setsDescripcionGeneralEntityReporte1(tipotransaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTransa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTransa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTransa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTransa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTransa=false;
			this.isVisibilidadCeldaActualizarTipoTransa=false;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
			this.isVisibilidadCeldaCancelarTipoTransa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTransa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
			this.isVisibilidadCeldaModificarTipoTransa=false;
			this.isVisibilidadCeldaActualizarTipoTransa=true;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
			this.isVisibilidadCeldaCancelarTipoTransa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTransa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
			this.isVisibilidadCeldaModificarTipoTransa=false;
			this.isVisibilidadCeldaActualizarTipoTransa=true;
			this.isVisibilidadCeldaEliminarTipoTransa=true;
			this.isVisibilidadCeldaCancelarTipoTransa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTransa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
			this.isVisibilidadCeldaModificarTipoTransa=false;
			this.isVisibilidadCeldaActualizarTipoTransa=true;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
			this.isVisibilidadCeldaCancelarTipoTransa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTransa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=true;
			this.isVisibilidadCeldaModificarTipoTransa=false;
			this.isVisibilidadCeldaActualizarTipoTransa=false;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
			this.isVisibilidadCeldaCancelarTipoTransa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTransa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
			this.isVisibilidadCeldaActualizarTipoTransa=false;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
			this.isVisibilidadCeldaCancelarTipoTransa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTransa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
			this.isVisibilidadCeldaModificarTipoTransa=true;
			this.isVisibilidadCeldaActualizarTipoTransa=false;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
			this.isVisibilidadCeldaCancelarTipoTransa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTransaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTransa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=true;
		} else {
			this.actualizarEstadoPanelsTipoTransa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTransa=false;
			//this.isVisibilidadCeldaVerFormTipoTransa=false;
			this.isVisibilidadCeldaDuplicarTipoTransa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipotransaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTransa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipotransaSessionBean.getEsGuardarRelacionado()) {
			if(!tipotransaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;												
			}
			
			this.jButtonCerrarTipoTransa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTransa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipotransa)) {
			this.isVisibilidadCeldaActualizarTipoTransa=false;
			this.isVisibilidadCeldaEliminarTipoTransa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTransa() {
		this.isVisibilidadCeldaNuevoTipoTransa=false;
		this.isVisibilidadCeldaGuardarCambiosTipoTransa=false;
	}
	
	public void actualizarEstadoPanelsTipoTransa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTransa!=null) {
				this.jScrollPanelDatosEdicionTipoTransa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransa!=null) {
				this.jScrollPanelDatosTipoTransa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransa!=null) {
				this.jPanelPaginacionTipoTransa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransa!=null) {
				this.jPanelParametrosReportesTipoTransa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTransa!=null) {
				this.jScrollPanelDatosEdicionTipoTransa.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTransa!=null) {
				this.jScrollPanelDatosTipoTransa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTransa!=null) {
				this.jPanelPaginacionTipoTransa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTransa!=null) {
				this.jPanelParametrosReportesTipoTransa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTransa!=null) {
				this.jScrollPanelDatosEdicionTipoTransa.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoTransa!=null) {
				this.jScrollPanelDatosTipoTransa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTransa!=null) {
				this.jPanelPaginacionTipoTransa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTransa!=null) {
				this.jPanelParametrosReportesTipoTransa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTransa!=null) {
				this.jScrollPanelDatosEdicionTipoTransa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransa!=null) {
				this.jScrollPanelDatosTipoTransa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTransa!=null) {
				this.jPanelPaginacionTipoTransa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTransa!=null) {
				this.jPanelParametrosReportesTipoTransa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTransa!=null) {
				this.jScrollPanelDatosEdicionTipoTransa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransa!=null) {
				this.jScrollPanelDatosTipoTransa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransa!=null) {
				this.jPanelPaginacionTipoTransa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransa!=null) {
				this.jPanelParametrosReportesTipoTransa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTransa!=null) {
				this.jScrollPanelDatosEdicionTipoTransa.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTransa!=null) {
				this.jScrollPanelDatosTipoTransa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransa!=null) {
				this.jPanelPaginacionTipoTransa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransa!=null) {
				this.jPanelParametrosReportesTipoTransa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTransa!=null) {
				this.jScrollPanelDatosEdicionTipoTransa.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTransa!=null) {
				this.jScrollPanelDatosTipoTransa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransa!=null) {
				this.jPanelPaginacionTipoTransa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransa!=null) {
				this.jPanelParametrosReportesTipoTransa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipotransaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoTransaParaTransacciones() throws Exception {
		Boolean isPaginaPopupTransaccion=false;

		try {

			if(this.tipotransaSessionBean==null) {
				this.tipotransaSessionBean=new TipoTransaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean=new TransaccionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean.setsPathNavegacionActual(tipotransaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccion=this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccion(true);
			this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccion(TipoTransaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoTransa(true);
			this.jInternalFrameDetalleFormTipoTransa.transaccionSessionBean.setlidTipoTransaActual(this.idTipoTransaActual);

			tipotransaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoTransa(true);
			tipotransaSessionBean.setlIdTipoTransaActualForeignKey(this.idTipoTransaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTransaSessionBean tipotransaSessionBean=new TipoTransaSessionBean();
		
		if(this.tipotransaSessionBean==null) {
			this.tipotransaSessionBean=new TipoTransaSessionBean();
		}
		
		this.tipotransaSessionBean.setsUltimaBusquedaTipoTransa(this.getsAccionBusqueda());
		this.tipotransaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipotransaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTransaSessionBean tipotransaSessionBean=new TipoTransaSessionBean();
		
		if(this.tipotransaSessionBean==null) {
			this.tipotransaSessionBean=new TipoTransaSessionBean();
		}
		
		if(this.tipotransaSessionBean.getsUltimaBusquedaTipoTransa()!=null&&!this.tipotransaSessionBean.getsUltimaBusquedaTipoTransa().equals("")) {
			this.setsAccionBusqueda(tipotransaSessionBean.getsUltimaBusquedaTipoTransa());
			this.setiNumeroPaginacion(tipotransaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipotransaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipotransaSessionBean.setsUltimaBusquedaTipoTransa("");
		this.tipotransaSessionBean.setiNumeroPaginacion(TipoTransaConstantesFunciones.INUMEROPAGINACION);
		this.tipotransaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTransa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTransa() {
		this.updateBorderResaltarBusquedasFormularioTipoTransa();
		this.updateVisibilidadBusquedasFormularioTipoTransa();
		this.updateHabilitarBusquedasFormularioTipoTransa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTransa() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTransa() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoTransa() {
	}
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioTipoTransa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTransa();
		this.updateVisibilidadResaltarControlesFormularioTipoTransa();
		this.updateHabilitarResaltarControlesFormularioTipoTransa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTransa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipotransaConstantesFunciones.resaltaridTipoTransa!=null && this.jInternalFrameDetalleFormTipoTransa!=null) {this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.setBorder(this.tipotransaConstantesFunciones.resaltaridTipoTransa);}
		if(this.tipotransaConstantesFunciones.resaltarnombreTipoTransa!=null && this.jInternalFrameDetalleFormTipoTransa!=null) {this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.setBorder(this.tipotransaConstantesFunciones.resaltarnombreTipoTransa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTransa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
	
		//this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.setVisible(this.tipotransaConstantesFunciones.mostraridTipoTransa);
		this.jInternalFrameDetalleFormTipoTransa.jPanelidTipoTransa.setVisible(this.tipotransaConstantesFunciones.mostraridTipoTransa);
		//this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.setVisible(this.tipotransaConstantesFunciones.mostrarnombreTipoTransa);
		this.jInternalFrameDetalleFormTipoTransa.jPanelnombreTipoTransa.setVisible(this.tipotransaConstantesFunciones.mostrarnombreTipoTransa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTransa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTransa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTransa!=null) {
	
		this.jInternalFrameDetalleFormTipoTransa.jTextFieldidTipoTransa.setEnabled(this.tipotransaConstantesFunciones.activaridTipoTransa);
		this.jInternalFrameDetalleFormTipoTransa.jTextFieldnombreTipoTransa.setEnabled(this.tipotransaConstantesFunciones.activarnombreTipoTransa);
		}
	}
	
		
}