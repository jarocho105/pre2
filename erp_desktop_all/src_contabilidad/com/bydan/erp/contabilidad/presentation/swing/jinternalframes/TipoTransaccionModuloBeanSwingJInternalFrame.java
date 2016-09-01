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

import com.bydan.erp.contabilidad.util.TipoTransaccionModuloConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoTransaccionModuloParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoTransaccionModuloParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoTransaccionModuloBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.sris.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoTransaccionModuloBeanSwingJInternalFrame extends TipoTransaccionModuloJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTransaccionModuloBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTransaccionModulo> tipotransaccionmoduloValidator = new ClassValidator<TipoTransaccionModulo>(TipoTransaccionModulo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTransaccionModulo tipotransaccionmodulo;	
	public TipoTransaccionModulo tipotransaccionmoduloAux;
	public TipoTransaccionModulo tipotransaccionmoduloAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTransaccionModulo tipotransaccionmoduloTotales;
	public Long idTipoTransaccionModuloActual;
	public Long iIdNuevoTipoTransaccionModulo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
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
	
	public Boolean isPermisoTodoTipoTransaccionModulo;
	public Boolean isPermisoNuevoTipoTransaccionModulo;
	public Boolean isPermisoActualizarTipoTransaccionModulo;
	public Boolean isPermisoActualizarOriginalTipoTransaccionModulo;
	public Boolean isPermisoEliminarTipoTransaccionModulo;
	public Boolean isPermisoGuardarCambiosTipoTransaccionModulo;
	public Boolean isPermisoConsultaTipoTransaccionModulo;
	public Boolean isPermisoBusquedaTipoTransaccionModulo;
	public Boolean isPermisoReporteTipoTransaccionModulo;
	public Boolean isPermisoPaginacionMedioTipoTransaccionModulo;
	public Boolean isPermisoPaginacionAltoTipoTransaccionModulo;
	public Boolean isPermisoPaginacionTodoTipoTransaccionModulo;
	public Boolean isPermisoCopiarTipoTransaccionModulo;
	public Boolean isPermisoVerFormTipoTransaccionModulo;
	public Boolean isPermisoDuplicarTipoTransaccionModulo;
	public Boolean isPermisoOrdenTipoTransaccionModulo;
	
	
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
	
	public TipoTransaccionModuloParameterReturnGeneral tipotransaccionmoduloReturnGeneral;
	public TipoTransaccionModuloParameterReturnGeneral tipotransaccionmoduloParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTransaccionModulo=false;
	public Boolean esParaAccionDesdeFormularioTipoTransaccionModulo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoTransaccionModuloSessionBeanAdditional tipotransaccionmoduloSessionBeanAdditional=null;
	
	public TipoTransaccionModuloSessionBeanAdditional getTipoTransaccionModuloSessionBeanAdditional() {
		return this.tipotransaccionmoduloSessionBeanAdditional;
	}
	
	public void setTipoTransaccionModuloSessionBeanAdditional(TipoTransaccionModuloSessionBeanAdditional tipotransaccionmoduloSessionBeanAdditional) {
		try {
			this.tipotransaccionmoduloSessionBeanAdditional=tipotransaccionmoduloSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoTransaccionModuloBeanSwingJInternalFrameAdditional tipotransaccionmoduloBeanSwingJInternalFrameAdditional=null;
	//public class TipoTransaccionModuloBeanSwingJInternalFrame
	
	public TipoTransaccionModuloBeanSwingJInternalFrameAdditional getTipoTransaccionModuloBeanSwingJInternalFrameAdditional() {
		return this.tipotransaccionmoduloBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoTransaccionModuloBeanSwingJInternalFrameAdditional(TipoTransaccionModuloBeanSwingJInternalFrameAdditional tipotransaccionmoduloBeanSwingJInternalFrameAdditional) {
		try {
			this.tipotransaccionmoduloBeanSwingJInternalFrameAdditional=tipotransaccionmoduloBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTransaccionModulo tipotransaccionmoduloBean;
	public TipoTransaccionModuloConstantesFunciones tipotransaccionmoduloConstantesFunciones;
	//public TipoTransaccionModuloParameterReturnGeneral tipotransaccionmoduloReturnGeneral;
	
	//FK
	
	public ModuloLogic moduloLogic;
	
	//PARAMETROS
	
	
	//public List<TipoTransaccionModulo> tipotransaccionmodulos;	
	//public List<TipoTransaccionModulo> tipotransaccionmodulosEliminados;
	//public List<TipoTransaccionModulo> tipotransaccionmodulosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTransaccionModulo=true;
	public Boolean isVisibilidadCeldaCopiarTipoTransaccionModulo=true;
	public Boolean isVisibilidadCeldaVerFormTipoTransaccionModulo=true;
	public Boolean isVisibilidadCeldaOrdenTipoTransaccionModulo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
	public Boolean isVisibilidadCeldaModificarTipoTransaccionModulo=false;
	public Boolean isVisibilidadCeldaActualizarTipoTransaccionModulo=false;
	public Boolean isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
	public Boolean isVisibilidadCeldaCancelarTipoTransaccionModulo=false;
	public Boolean isVisibilidadCeldaGuardarTipoTransaccionModulo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdModuloPorNombre=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	
	public Long getiIdNuevoTipoTransaccionModulo() {
		return this.iIdNuevoTipoTransaccionModulo;
	}

	public void setiIdNuevoTipoTransaccionModulo(Long iIdNuevoTipoTransaccionModulo) {
		this.iIdNuevoTipoTransaccionModulo = iIdNuevoTipoTransaccionModulo;
	}
	
	public Long getidTipoTransaccionModuloActual() {
		return this.idTipoTransaccionModuloActual;
	}

	public void setidTipoTransaccionModuloActual(Long idTipoTransaccionModuloActual) {
		this.idTipoTransaccionModuloActual = idTipoTransaccionModuloActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTransaccionModulo gettipotransaccionmodulo() {
		return this.tipotransaccionmodulo;
	}

	public void settipotransaccionmodulo(TipoTransaccionModulo tipotransaccionmodulo) {
		this.tipotransaccionmodulo = tipotransaccionmodulo;
	}
	
	public TipoTransaccionModulo gettipotransaccionmoduloAux() {
		return this.tipotransaccionmoduloAux;
	}

	public void settipotransaccionmoduloAux(TipoTransaccionModulo tipotransaccionmoduloAux) {
		this.tipotransaccionmoduloAux = tipotransaccionmoduloAux;
	}				
	
	public TipoTransaccionModulo gettipotransaccionmoduloAnterior() {
		return this.tipotransaccionmoduloAnterior;
	}

	public void settipotransaccionmoduloAnterior(TipoTransaccionModulo tipotransaccionmoduloAnterior) {
		this.tipotransaccionmoduloAnterior = tipotransaccionmoduloAnterior;
	}	
	
	public TipoTransaccionModulo gettipotransaccionmoduloTotales() {
		return this.tipotransaccionmoduloTotales;
	}

	public void settipotransaccionmoduloTotales(TipoTransaccionModulo tipotransaccionmoduloTotales) {
		this.tipotransaccionmoduloTotales = tipotransaccionmoduloTotales;
	}	
	
	public TipoTransaccionModulo gettipotransaccionmoduloBean() {
		return this.tipotransaccionmoduloBean;
	}

	public void settipotransaccionmoduloBean(TipoTransaccionModulo tipotransaccionmoduloBean) {
		this.tipotransaccionmoduloBean = tipotransaccionmoduloBean;
	}	
	
	public TipoTransaccionModuloParameterReturnGeneral gettipotransaccionmoduloReturnGeneral() {
		return this.tipotransaccionmoduloReturnGeneral;
	}

	public void settipotransaccionmoduloReturnGeneral(TipoTransaccionModuloParameterReturnGeneral tipotransaccionmoduloReturnGeneral) {
		this.tipotransaccionmoduloReturnGeneral = tipotransaccionmoduloReturnGeneral;
	}	
	
	
	public Long id_moduloBusquedaPorIdModuloPorNombre=-1L;

	public Long getid_moduloBusquedaPorIdModuloPorNombre() {
		return this.id_moduloBusquedaPorIdModuloPorNombre;
	}

	public void setid_moduloBusquedaPorIdModuloPorNombre(Long id_moduloBusquedaPorIdModuloPorNombre) {
		this.id_moduloBusquedaPorIdModuloPorNombre = id_moduloBusquedaPorIdModuloPorNombre;
	}

;
	public String nombreBusquedaPorIdModuloPorNombre="";

	public String getnombreBusquedaPorIdModuloPorNombre() {
		return this.nombreBusquedaPorIdModuloPorNombre;
	}

	public void setnombreBusquedaPorIdModuloPorNombre(String nombreBusquedaPorIdModuloPorNombre) {
		this.nombreBusquedaPorIdModuloPorNombre = nombreBusquedaPorIdModuloPorNombre;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoTransaccionModuloLogic getTipoTransaccionModuloLogic()	{		
		return tipotransaccionmoduloLogic;
	}

	public void setTipoTransaccionModuloLogic(TipoTransaccionModuloLogic tipotransaccionmoduloLogic) {
		this.tipotransaccionmoduloLogic = tipotransaccionmoduloLogic;
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
	
	public Boolean getIsEsNuevoTipoTransaccionModulo() {
		return isEsNuevoTipoTransaccionModulo;
	}

	public void setIsEsNuevoTipoTransaccionModulo(Boolean isEsNuevoTipoTransaccionModulo) {
		this.isEsNuevoTipoTransaccionModulo = isEsNuevoTipoTransaccionModulo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTransaccionModulo() {
		return esParaAccionDesdeFormularioTipoTransaccionModulo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTransaccionModulo(Boolean esParaAccionDesdeFormularioTipoTransaccionModulo) {
		this.esParaAccionDesdeFormularioTipoTransaccionModulo = esParaAccionDesdeFormularioTipoTransaccionModulo;
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
	
	
	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.tipotransaccionmoduloSessionBean==null) {
				this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
			}

			if(!this.tipotransaccionmoduloSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(tipotransaccionmoduloSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.tipotransaccionmodulo!=null) {
						this.tipotransaccionmodulo.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
						this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTipoTransaccionModulo.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
						if(this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo!=null) {
						jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo!=null) {
							//jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo!=null) {
						jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo!=null) {
							//jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTipoTransaccionModuloGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloTipoTransaccionModuloGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTipoTransaccionModuloGenerico!=null && jComboBoxid_moduloTipoTransaccionModuloGenerico.getItemCount()>0) {
					jComboBoxid_moduloTipoTransaccionModuloGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(TipoTransaccionModulo tipotransaccionmodulo,JComboBox jComboBoxid_moduloTipoTransaccionModuloGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTipoTransaccionModuloGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTipoTransaccionModuloGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				tipotransaccionmodulo.setid_modulo(moduloAux.getId());
				tipotransaccionmodulo.setmodulo_descripcion(TipoTransaccionModuloConstantesFunciones.getModuloDescripcion(moduloAux));
				tipotransaccionmodulo.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { 
							this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { 
					}

					if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.addItem(modulo);
							}
						}

						if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.addItem(modulo);
							}
						}

						if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
							this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
							this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoTransaccionModulo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTransaccionModuloConstantesFunciones.refrescarForeignKeysDescripcionesTipoTransaccionModulo(this.tipotransaccionmoduloLogic.getTipoTransaccionModulos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTransaccionModuloConstantesFunciones.refrescarForeignKeysDescripcionesTipoTransaccionModulo(this.tipotransaccionmodulos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Modulo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipotransaccionmoduloLogic.setTipoTransaccionModulos(this.tipotransaccionmodulos);
			tipotransaccionmoduloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoTransaccionModuloParameterReturnGeneral getTipoTransaccionModuloParameterGeneral() {
		return this.tipotransaccionmoduloParameterGeneral;
	}
	
	public void setTipoTransaccionModuloParameterGeneral(TipoTransaccionModuloParameterReturnGeneral tipotransaccionmoduloParameterGeneral) {
		this.tipotransaccionmoduloParameterGeneral = tipotransaccionmoduloParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoTransaccionModulo() {
		return isPermisoTodoTipoTransaccionModulo;
	}

	public void setIsPermisoTodoTipoTransaccionModulo(Boolean isPermisoTodoTipoTransaccionModulo) {
		this.isPermisoTodoTipoTransaccionModulo = isPermisoTodoTipoTransaccionModulo;
	}

	public Boolean getIsPermisoNuevoTipoTransaccionModulo() {
		return isPermisoNuevoTipoTransaccionModulo;
	}

	public void setIsPermisoNuevoTipoTransaccionModulo(Boolean isPermisoNuevoTipoTransaccionModulo) {
		this.isPermisoNuevoTipoTransaccionModulo = isPermisoNuevoTipoTransaccionModulo;
	}

	public Boolean getIsPermisoActualizarTipoTransaccionModulo() {
		return isPermisoActualizarTipoTransaccionModulo;
	}

	public void setIsPermisoActualizarTipoTransaccionModulo(Boolean isPermisoActualizarTipoTransaccionModulo) {
		this.isPermisoActualizarTipoTransaccionModulo = isPermisoActualizarTipoTransaccionModulo;
	}

	public Boolean getIsPermisoEliminarTipoTransaccionModulo() {
		return isPermisoEliminarTipoTransaccionModulo;
	}

	public void setIsPermisoEliminarTipoTransaccionModulo(Boolean isPermisoEliminarTipoTransaccionModulo) {
		this.isPermisoEliminarTipoTransaccionModulo = isPermisoEliminarTipoTransaccionModulo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTransaccionModulo() {
		return isPermisoGuardarCambiosTipoTransaccionModulo;
	}

	public void setIsPermisoGuardarCambiosTipoTransaccionModulo(Boolean isPermisoGuardarCambiosTipoTransaccionModulo) {
		this.isPermisoGuardarCambiosTipoTransaccionModulo = isPermisoGuardarCambiosTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoConsultaTipoTransaccionModulo() {
		return isPermisoConsultaTipoTransaccionModulo;
	}

	public void setIsPermisoConsultaTipoTransaccionModulo(Boolean isPermisoConsultaTipoTransaccionModulo) {
		this.isPermisoConsultaTipoTransaccionModulo = isPermisoConsultaTipoTransaccionModulo;
	}

	public Boolean getIsPermisoBusquedaTipoTransaccionModulo() {
		return isPermisoBusquedaTipoTransaccionModulo;
	}

	public void setIsPermisoBusquedaTipoTransaccionModulo(Boolean isPermisoBusquedaTipoTransaccionModulo) {
		this.isPermisoBusquedaTipoTransaccionModulo = isPermisoBusquedaTipoTransaccionModulo;
	}

	public Boolean getIsPermisoReporteTipoTransaccionModulo() {
		return isPermisoReporteTipoTransaccionModulo;
	}

	public void setIsPermisoReporteTipoTransaccionModulo(Boolean isPermisoReporteTipoTransaccionModulo) {
		this.isPermisoReporteTipoTransaccionModulo = isPermisoReporteTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTransaccionModulo() {
		return isPermisoPaginacionMedioTipoTransaccionModulo;
	}

	public void setIsPermisoPaginacionMedioTipoTransaccionModulo(Boolean isPermisoPaginacionMedioTipoTransaccionModulo) {
		this.isPermisoPaginacionMedioTipoTransaccionModulo = isPermisoPaginacionMedioTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTransaccionModulo() {
		return isPermisoPaginacionTodoTipoTransaccionModulo;
	}

	public void setIsPermisoPaginacionTodoTipoTransaccionModulo(Boolean isPermisoPaginacionTodoTipoTransaccionModulo) {
		this.isPermisoPaginacionTodoTipoTransaccionModulo = isPermisoPaginacionTodoTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTransaccionModulo() {
		return isPermisoPaginacionAltoTipoTransaccionModulo;
	}

	public void setIsPermisoPaginacionAltoTipoTransaccionModulo(Boolean isPermisoPaginacionAltoTipoTransaccionModulo) {
		this.isPermisoPaginacionAltoTipoTransaccionModulo = isPermisoPaginacionAltoTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoCopiarTipoTransaccionModulo() {
		return isPermisoCopiarTipoTransaccionModulo;
	}

	public void setIsPermisoCopiarTipoTransaccionModulo(Boolean isPermisoCopiarTipoTransaccionModulo) {
		this.isPermisoCopiarTipoTransaccionModulo = isPermisoCopiarTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoVerFormTipoTransaccionModulo() {
		return isPermisoVerFormTipoTransaccionModulo;
	}

	public void setIsPermisoVerFormTipoTransaccionModulo(Boolean isPermisoVerFormTipoTransaccionModulo) {
		this.isPermisoVerFormTipoTransaccionModulo = isPermisoVerFormTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoDuplicarTipoTransaccionModulo() {
		return isPermisoDuplicarTipoTransaccionModulo;
	}

	public void setIsPermisoDuplicarTipoTransaccionModulo(Boolean isPermisoDuplicarTipoTransaccionModulo) {
		this.isPermisoDuplicarTipoTransaccionModulo = isPermisoDuplicarTipoTransaccionModulo;
	}
	
	public Boolean getIsPermisoOrdenTipoTransaccionModulo() {
		return isPermisoOrdenTipoTransaccionModulo;
	}

	public void setIsPermisoOrdenTipoTransaccionModulo(Boolean isPermisoOrdenTipoTransaccionModulo) {
		this.isPermisoOrdenTipoTransaccionModulo = isPermisoOrdenTipoTransaccionModulo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTransaccionModulo() {
		return isVisibilidadCeldaNuevoTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaNuevoTipoTransaccionModulo(Boolean isVisibilidadCeldaNuevoTipoTransaccionModulo) {
		this.isVisibilidadCeldaNuevoTipoTransaccionModulo = isVisibilidadCeldaNuevoTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTransaccionModulo() {
		return isVisibilidadCeldaDuplicarTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTransaccionModulo(Boolean isVisibilidadCeldaDuplicarTipoTransaccionModulo) {
		this.isVisibilidadCeldaDuplicarTipoTransaccionModulo = isVisibilidadCeldaDuplicarTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTransaccionModulo() {
		return isVisibilidadCeldaCopiarTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaCopiarTipoTransaccionModulo(Boolean isVisibilidadCeldaCopiarTipoTransaccionModulo) {
		this.isVisibilidadCeldaCopiarTipoTransaccionModulo = isVisibilidadCeldaCopiarTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTransaccionModulo() {
		return isVisibilidadCeldaVerFormTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaVerFormTipoTransaccionModulo(Boolean isVisibilidadCeldaVerFormTipoTransaccionModulo) {
		this.isVisibilidadCeldaVerFormTipoTransaccionModulo = isVisibilidadCeldaVerFormTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTransaccionModulo() {
		return isVisibilidadCeldaOrdenTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaOrdenTipoTransaccionModulo(Boolean isVisibilidadCeldaOrdenTipoTransaccionModulo) {
		this.isVisibilidadCeldaOrdenTipoTransaccionModulo = isVisibilidadCeldaOrdenTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo() {
		return isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo(Boolean isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo = isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTransaccionModulo() {
		return isVisibilidadCeldaModificarTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaModificarTipoTransaccionModulo(Boolean isVisibilidadCeldaModificarTipoTransaccionModulo) {
		this.isVisibilidadCeldaModificarTipoTransaccionModulo = isVisibilidadCeldaModificarTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTransaccionModulo() {
		return isVisibilidadCeldaActualizarTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaActualizarTipoTransaccionModulo(Boolean isVisibilidadCeldaActualizarTipoTransaccionModulo) {
		this.isVisibilidadCeldaActualizarTipoTransaccionModulo = isVisibilidadCeldaActualizarTipoTransaccionModulo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTransaccionModulo() {
		return isVisibilidadCeldaEliminarTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaEliminarTipoTransaccionModulo(Boolean isVisibilidadCeldaEliminarTipoTransaccionModulo) {
		this.isVisibilidadCeldaEliminarTipoTransaccionModulo = isVisibilidadCeldaEliminarTipoTransaccionModulo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTransaccionModulo() {
		return isVisibilidadCeldaCancelarTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaCancelarTipoTransaccionModulo(Boolean isVisibilidadCeldaCancelarTipoTransaccionModulo) {
		this.isVisibilidadCeldaCancelarTipoTransaccionModulo = isVisibilidadCeldaCancelarTipoTransaccionModulo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTransaccionModulo() {
		return isVisibilidadCeldaGuardarTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaGuardarTipoTransaccionModulo(Boolean isVisibilidadCeldaGuardarTipoTransaccionModulo) {
		this.isVisibilidadCeldaGuardarTipoTransaccionModulo = isVisibilidadCeldaGuardarTipoTransaccionModulo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTransaccionModulo() {
		return isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTransaccionModulo(Boolean isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo) {
		this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo = isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo;
	}
		
	public TipoTransaccionModuloSessionBean gettipotransaccionmoduloSessionBean() {
		return this.tipotransaccionmoduloSessionBean;
	}
	
	public void settipotransaccionmoduloSessionBean(TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean) {
		this.tipotransaccionmoduloSessionBean=tipotransaccionmoduloSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdModuloPorNombre() {
		return this.isVisibilidadBusquedaPorIdModuloPorNombre;
	}

	public void setisVisibilidadBusquedaPorIdModuloPorNombre(Boolean isVisibilidadBusquedaPorIdModuloPorNombre) {
		this.isVisibilidadBusquedaPorIdModuloPorNombre=isVisibilidadBusquedaPorIdModuloPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo)throws Exception {
		try {
			
				this.setActualParaGuardarModuloForeignKey(tipotransaccionmodulo,null);
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
	
	public void bugActualizarReferenciaActual(TipoTransaccionModulo tipotransaccionmodulo,TipoTransaccionModulo tipotransaccionmoduloAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTransaccionModulo(tipotransaccionmodulo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipotransaccionmoduloAux.setId(tipotransaccionmodulo.getId());
		tipotransaccionmoduloAux.setVersionRow(tipotransaccionmodulo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTransaccionModulo();
		
			int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipotransaccionmoduloValidator.getInvalidValues(this.tipotransaccionmodulo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipotransaccionmoduloLogic.setDatosCliente(datosCliente);
			tipotransaccionmoduloLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipotransaccionmoduloAux=new  TipoTransaccionModulo();
				
				tipotransaccionmoduloAux.setIsNew(true);
				tipotransaccionmoduloAux.setIsChanged(true);
				
				tipotransaccionmoduloAux.setTipoTransaccionModuloOriginal(this.tipotransaccionmodulo);
				
				tipotransaccionmoduloAux.setId(this.tipotransaccionmodulo.getId());	
				tipotransaccionmoduloAux.setVersionRow(this.tipotransaccionmodulo.getVersionRow());	
				tipotransaccionmoduloAux.setid_modulo(this.tipotransaccionmodulo.getid_modulo());	
				tipotransaccionmoduloAux.setnombre(this.tipotransaccionmodulo.getnombre());	
				tipotransaccionmoduloAux.setsiglas(this.tipotransaccionmodulo.getsiglas());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipotransaccionmoduloAux,tipotransaccionmoduloLogic.getTipoTransaccionModulos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaccionmoduloAux,tipotransaccionmodulos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloLogic.saveTipoTransaccionModulos();//WithConnection
						//tipotransaccionmoduloLogic.getSetVersionRowTipoTransaccionModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotransaccionmodulo,tipotransaccionmoduloAux);
					
					this.refrescarForeignKeysDescripcionesTipoTransaccionModulo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipotransaccionmoduloAux=new  TipoTransaccionModulo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado() 
					|| (this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado() && this.tipotransaccionmodulo.getId()>=0)) {
						
					tipotransaccionmoduloAux.setIsNew(false);
				}
				
				tipotransaccionmoduloAux.setIsDeleted(false);
			
				tipotransaccionmoduloAux.setId(this.tipotransaccionmodulo.getId());	
				tipotransaccionmoduloAux.setVersionRow(this.tipotransaccionmodulo.getVersionRow());	
				tipotransaccionmoduloAux.setid_modulo(this.tipotransaccionmodulo.getid_modulo());	
				tipotransaccionmoduloAux.setnombre(this.tipotransaccionmodulo.getnombre());	
				tipotransaccionmoduloAux.setsiglas(this.tipotransaccionmodulo.getsiglas());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotransaccionmoduloAux,tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaccionmoduloAux,tipotransaccionmodulos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloLogic.saveTipoTransaccionModulos();//WithConnection
						//tipotransaccionmoduloLogic.getSetVersionRowTipoTransaccionModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotransaccionmodulo,tipotransaccionmoduloAux);
					
					this.refrescarForeignKeysDescripcionesTipoTransaccionModulo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipotransaccionmoduloAux=new  TipoTransaccionModulo();
				
				tipotransaccionmoduloAux.setIsNew(false);
				tipotransaccionmoduloAux.setIsChanged(false);
				
				tipotransaccionmoduloAux.setIsDeleted(true);
				
				tipotransaccionmoduloAux.setId(this.tipotransaccionmodulo.getId());	
				tipotransaccionmoduloAux.setVersionRow(this.tipotransaccionmodulo.getVersionRow());	
				tipotransaccionmoduloAux.setid_modulo(this.tipotransaccionmodulo.getid_modulo());	
				tipotransaccionmoduloAux.setnombre(this.tipotransaccionmodulo.getnombre());	
				tipotransaccionmoduloAux.setsiglas(this.tipotransaccionmodulo.getsiglas());	
				
				if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipotransaccionmoduloAux.getId()>=0) {	
						this.tipotransaccionmodulosEliminados.add(tipotransaccionmoduloAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipotransaccionmoduloAux,tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaccionmoduloAux,tipotransaccionmodulos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloLogic.saveTipoTransaccionModulos();//WithConnection
						//tipotransaccionmoduloLogic.getSetVersionRowTipoTransaccionModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().addAll(this.tipotransaccionmodulosEliminados);
					
					tipotransaccionmoduloLogic.saveTipoTransaccionModulos();//WithConnection
					//tipotransaccionmoduloLogic.getSetVersionRowTipoTransaccionModulos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoTransaccionModulo();
				
				this.tipotransaccionmodulosEliminados= new ArrayList<TipoTransaccionModulo>();		
			}
			
			if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Transaccion Modulo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipotransaccionmodulo=tipotransaccionmoduloAux;
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
      		//this.finishProcessTipoTransaccionModulo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTransaccionModulo tipotransaccionmoduloLocal) throws Exception {
		
		if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTransaccionModulo tipotransaccionmoduloLocal) throws Exception {	
		if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				tipotransaccionmoduloLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoTransaccionModuloActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipotransaccionmoduloValidator.getInvalidValues(this.tipotransaccionmodulo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTransaccionModulo tipotransaccionmodulo,List<TipoTransaccionModulo> tipotransaccionmodulos) throws Exception {
		try	{		
			TipoTransaccionModuloConstantesFunciones.actualizarLista(tipotransaccionmodulo,tipotransaccionmodulos,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTransaccionModulo tipotransaccionmodulo,List<TipoTransaccionModulo> tipotransaccionmodulos) throws Exception {
		try	{			
			TipoTransaccionModuloConstantesFunciones.actualizarSelectedLista(tipotransaccionmodulo,tipotransaccionmodulos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTransaccionModulo> tipotransaccionmodulosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipotransaccionmodulosLocal=this.tipotransaccionmoduloLogic.getTipoTransaccionModulos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipotransaccionmodulosLocal=this.tipotransaccionmodulos;
			}
			//ARCHITECTURE
		
			for(TipoTransaccionModulo tipotransaccionmoduloLocal:tipotransaccionmodulosLocal) {
				if(this.permiteMantenimiento(tipotransaccionmoduloLocal) && tipotransaccionmoduloLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTransaccionModuloConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelid_moduloTipoTransaccionModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTransaccionModuloConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelnombreTipoTransaccionModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTransaccionModuloConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelsiglasTipoTransaccionModulo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelid_moduloTipoTransaccionModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelnombreTipoTransaccionModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelsiglasTipoTransaccionModulo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoTransaccionModulo--;	
		
		
		this.tipotransaccionmoduloAux=new TipoTransaccionModulo();
		
		this.tipotransaccionmoduloAux.setId(this.iIdNuevoTipoTransaccionModulo);
		this.tipotransaccionmoduloAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().add(this.tipotransaccionmoduloAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipotransaccionmodulos.add(this.tipotransaccionmoduloAux);
		}
		//ARCHITECTURE
		
		this.tipotransaccionmodulo=this.tipotransaccionmoduloAux;
		
		if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTransaccionModulo(this.tipotransaccionmodulo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTransaccionModulo(this.tipotransaccionmodulo);
		}
				
		//this.setDefaultControlesTipoTransaccionModulo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTransaccionModulo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTransaccionModulo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTransaccionModulo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTransaccionModulo(this.tipotransaccionmoduloBean,this.tipotransaccionmodulo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
			classes=TipoTransaccionModuloConstantesFunciones.getClassesRelationshipsOfTipoTransaccionModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipotransaccionmoduloReturnGeneral=tipotransaccionmoduloLogic.procesarEventosTipoTransaccionModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotransaccionmoduloLogic.getTipoTransaccionModulos(),this.tipotransaccionmodulo,this.tipotransaccionmoduloParameterGeneral,this.isEsNuevoTipoTransaccionModulo,classes);//this.tipotransaccionmoduloLogic.getTipoTransaccionModulo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral,this.tipotransaccionmoduloBean,false);
		
		if(this.tipotransaccionmoduloReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo());
		}
		
		if(this.tipotransaccionmoduloReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo(),classes);//this.tipotransaccionmoduloBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTransaccionModulo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTransaccionModulo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.RecargarFormTipoTransaccionModulo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTransaccionModulo(false);
						
			if(tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTransaccionModulo();
			}
			
			this.actualizarVisualTableDatosTipoTransaccionModulo();
			
			this.jTableDatosTipoTransaccionModulo.setRowSelectionInterval(this.getIndiceNuevoTipoTransaccionModulo(), this.getIndiceNuevoTipoTransaccionModulo());
			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
						
			this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTransaccionModulo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.setEnabled(isHabilitar && this.tipotransaccionmoduloConstantesFunciones.activarnombreTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.setEnabled(isHabilitar && this.tipotransaccionmoduloConstantesFunciones.activarsiglasTipoTransaccionModulo);	
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setEnabled(isHabilitar && this.tipotransaccionmoduloConstantesFunciones.activarid_moduloTipoTransaccionModulo);
	};
	
	public void setDefaultControlesTipoTransaccionModulo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTransaccionModulo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipotransaccionmoduloSessionBean.setConGuardarRelaciones(true);			
			this.tipotransaccionmoduloSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.setVisible(true);
			
					
		} else {
			//this.tipotransaccionmoduloSessionBean.setConGuardarRelaciones(false);			
			this.tipotransaccionmoduloSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoTransaccionModulo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
				if(tipotransaccionmoduloAux.getId().equals(this.iIdNuevoTipoTransaccionModulo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmodulos) {
				if(tipotransaccionmoduloAux.getId().equals(this.iIdNuevoTipoTransaccionModulo)) {
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
	
	public int getIndiceActualTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
				if(tipotransaccionmoduloAux.getId().equals(tipotransaccionmodulo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmodulos) {
				if(tipotransaccionmoduloAux.getId().equals(tipotransaccionmodulo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmoduloOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
				if(tipotransaccionmoduloAux.getTipoTransaccionModuloOriginal().getId().equals(tipotransaccionmoduloOriginal.getId())) {
					existe=true;
					tipotransaccionmoduloOriginal.setId(tipotransaccionmoduloAux.getId());
					tipotransaccionmoduloOriginal.setVersionRow(tipotransaccionmoduloAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmodulos) {
				if(tipotransaccionmoduloAux.getTipoTransaccionModuloOriginal().getId().equals(tipotransaccionmoduloOriginal.getId())) {
					existe=true;
					tipotransaccionmoduloOriginal.setId(tipotransaccionmoduloAux.getId());
					tipotransaccionmoduloOriginal.setVersionRow(tipotransaccionmoduloAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTransaccionModulo(Boolean esParaCancelar) throws Exception {
		tipotransaccionmodulosAux=new ArrayList<TipoTransaccionModulo>();
		tipotransaccionmoduloAux=new TipoTransaccionModulo();
		
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
					if(tipotransaccionmoduloAux.getId()<0) {
						tipotransaccionmodulosAux.add(tipotransaccionmoduloAux);
					}		
				}
				this.iIdNuevoTipoTransaccionModulo=0L;
				this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().removeAll(tipotransaccionmodulosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmodulos) {
					if(tipotransaccionmoduloAux.getId()<0) {
						tipotransaccionmodulosAux.add(tipotransaccionmoduloAux);
					}		
				}
				this.iIdNuevoTipoTransaccionModulo=0L;
				this.tipotransaccionmodulos.removeAll(tipotransaccionmodulosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTransaccionModulo 
					&& this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()>0
					) {
					tipotransaccionmoduloAux=this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().get(this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().size() - 1);
				
					if(tipotransaccionmoduloAux.getId()<0) {
						this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().remove(tipotransaccionmoduloAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTransaccionModulo && this.tipotransaccionmodulos.size()>0) {
					tipotransaccionmoduloAux=this.tipotransaccionmodulos.get(this.tipotransaccionmodulos.size() - 1);
				
					if(tipotransaccionmoduloAux.getId()<0) {
						this.tipotransaccionmodulos.remove(tipotransaccionmoduloAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTransaccionModulo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipotransaccionmodulo.getId()<0) {
				this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().remove(this.tipotransaccionmodulo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipotransaccionmodulo.getId()<0) {
				this.tipotransaccionmodulos.remove(this.tipotransaccionmodulo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTransaccionModulo(List<TipoTransaccionModulo> tipotransaccionmodulosAux) throws Exception {
		TipoTransaccionModuloConstantesFunciones.setEstadosInicialesTipoTransaccionModulo(tipotransaccionmodulosAux);
	}
	
	public void setEstadosInicialesTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmoduloAux) throws Exception {
		TipoTransaccionModuloConstantesFunciones.setEstadosInicialesTipoTransaccionModulo(tipotransaccionmoduloAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTransaccionModuloActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTransaccionModuloActual()) {
				if(!this.isEsNuevoTipoTransaccionModulo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTransaccionModulo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTransaccionModuloActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Transaccion Modulo ?", "MANTENIMIENTO DE Tipo Transaccion Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTransaccionModulo tipotransaccionmodulo) throws Exception {
		TipoTransaccionModuloConstantesFunciones.seleccionarAsignar(this.tipotransaccionmodulo,tipotransaccionmodulo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTransaccionModulo=this.isPermisoActualizarOriginalTipoTransaccionModulo;
			
			
			this.seleccionarAsignar(tipotransaccionmodulo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTransaccionModuloConstantesFunciones.quitarEspaciosTipoTransaccionModulo(this.tipotransaccionmodulo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipotransaccionmoduloSessionBean.setsFuncionBusquedaRapida(this.tipotransaccionmoduloSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTransaccionModulo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTransaccionModulo(esParaCancelar);				
				this.cancelarNuevoTipoTransaccionModulo(esParaCancelar);								
			}
			
			this.tipotransaccionmodulo=new TipoTransaccionModulo();
			
			this.inicializarTipoTransaccionModulo();
			
			this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTransaccionModulo() throws Exception {
		try {
			TipoTransaccionModuloConstantesFunciones.inicializarTipoTransaccionModulo(this.tipotransaccionmodulo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTransaccionModulos(String sAccionBusqueda,List<TipoTransaccionModulo> tipotransaccionmodulosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoTransaccionModulo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTransaccionModuloMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTransaccionModuloMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTransaccionModulo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Transaccion Modulos");		
		parameters.put("busquedapor", TipoTransaccionModuloConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTransaccionModulo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTransaccionModuloConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTransaccionModuloConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTransaccionModulo=new JRBeanArrayDataSource(TipoTransaccionModuloJInternalFrame.TraerTipoTransaccionModuloBeans(tipotransaccionmodulosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTransaccionModulo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTransaccionModuloConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTransaccionModuloConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTransaccionModuloBean.TraerTipoTransaccionModuloBeans(tipotransaccionmodulosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoTransaccionModulos(sAccionBusqueda,sTipoArchivoReporte,tipotransaccionmodulosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTransaccionModulos(sAccionBusqueda,sTipoArchivoReporte,tipotransaccionmodulosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModuloActionPerformed(null);
					//this.generarExcelReporteTipoTransaccionModulos(sAccionBusqueda,sTipoArchivoReporte,tipotransaccionmodulosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTransaccionModulos(sAccionBusqueda,sTipoArchivoReporte,tipotransaccionmodulosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTransaccionModulos(sAccionBusqueda,sTipoArchivoReporte,tipotransaccionmodulosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTransaccionModulos(sAccionBusqueda,sTipoArchivoReporte,tipotransaccionmodulosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTransaccionModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTransaccionModulo> tipotransaccionmodulosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransaccionmodulo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTransaccionModulos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTransaccionModulo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTransaccionModulo tipotransaccionmodulo : tipotransaccionmodulosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTransaccionModuloConstantesFunciones.generarExcelReporteDataTipoTransaccionModulo("NORMAL",row,workbook,tipotransaccionmodulo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTransaccionModulo(String sTipo,Row row,Workbook workbook) {
		
		TipoTransaccionModuloConstantesFunciones.generarExcelReporteHeaderTipoTransaccionModulo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTransaccionModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTransaccionModulo> tipotransaccionmodulosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransaccionmodulo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTransaccionModulos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTransaccionModulo tipotransaccionmodulo : tipotransaccionmodulosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmodulo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotransaccionmodulo.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotransaccionmodulo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotransaccionmodulo.getsiglas());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTransaccionModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTransaccionModulo> tipotransaccionmodulosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTransaccionModulo> tipotransaccionmodulosRespaldo=null;
		
		classes=TipoTransaccionModuloConstantesFunciones.getClassesRelationshipsOfTipoTransaccionModulo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipotransaccionmoduloLogic.setDatosCliente(this.datosCliente);
		this.tipotransaccionmoduloLogic.setDatosDeep(this.datosDeep);
		this.tipotransaccionmoduloLogic.setIsConDeep(true);
		
		tipotransaccionmodulosRespaldo=this.tipotransaccionmoduloLogic.getTipoTransaccionModulos();
		
		this.tipotransaccionmoduloLogic.setTipoTransaccionModulos(tipotransaccionmodulosParaReportes);	
		this.tipotransaccionmoduloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipotransaccionmodulosParaReportes=this.tipotransaccionmoduloLogic.getTipoTransaccionModulos();
		this.tipotransaccionmoduloLogic.setTipoTransaccionModulos(tipotransaccionmodulosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransaccionmodulo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTransaccionModulos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTransaccionModulo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTransaccionModulo tipotransaccionmodulo : tipotransaccionmodulosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTransaccionModulo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTransaccionModuloConstantesFunciones.generarExcelReporteDataTipoTransaccionModulo("NORMAL",row,workbook,tipotransaccionmodulo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmodulo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTransaccionModulo() throws Exception {		
		this.startProcessTipoTransaccionModulo(true);
	}
	
	public void startProcessTipoTransaccionModulo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoTransaccionModulo ,this.jPanelParametrosReportesTipoTransaccionModulo, this.jScrollPanelDatosTipoTransaccionModulo,this.jPanelPaginacionTipoTransaccionModulo, this.jScrollPanelDatosEdicionTipoTransaccionModulo, this.jPanelAccionesTipoTransaccionModulo,this.jPanelAccionesFormularioTipoTransaccionModulo,this.jmenuBarTipoTransaccionModulo,this.jmenuBarDetalleTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,this.jTtoolBarDetalleTipoTransaccionModulo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTransaccionModulo=this.jTabbedPaneBusquedasTipoTransaccionModulo; 
		
		final JPanel jPanelParametrosReportesTipoTransaccionModulo=this.jPanelParametrosReportesTipoTransaccionModulo;
		//final JScrollPane jScrollPanelDatosTipoTransaccionModulo=this.jScrollPanelDatosTipoTransaccionModulo;
		final JTable jTableDatosTipoTransaccionModulo=this.jTableDatosTipoTransaccionModulo;		
		final JPanel jPanelPaginacionTipoTransaccionModulo=this.jPanelPaginacionTipoTransaccionModulo;
		//final JScrollPane jScrollPanelDatosEdicionTipoTransaccionModulo=this.jScrollPanelDatosEdicionTipoTransaccionModulo;
		final JPanel jPanelAccionesTipoTransaccionModulo=this.jPanelAccionesTipoTransaccionModulo;
		
		JPanel jPanelCamposAuxiliarTipoTransaccionModulo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTransaccionModulo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			jPanelCamposAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelCamposTipoTransaccionModulo;
			jPanelAccionesFormularioAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelAccionesFormularioTipoTransaccionModulo;
		}
		
		final JPanel jPanelCamposTipoTransaccionModulo=jPanelCamposAuxiliarTipoTransaccionModulo;
		final JPanel jPanelAccionesFormularioTipoTransaccionModulo=jPanelAccionesFormularioAuxiliarTipoTransaccionModulo;
		
		
		final JMenuBar jmenuBarTipoTransaccionModulo=this.jmenuBarTipoTransaccionModulo;
		final JToolBar jTtoolBarTipoTransaccionModulo=this.jTtoolBarTipoTransaccionModulo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTransaccionModulo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTransaccionModulo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			jmenuBarDetalleAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jmenuBarDetalleTipoTransaccionModulo;
			jTtoolBarDetalleAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jTtoolBarDetalleTipoTransaccionModulo;
		}
		
		final JMenuBar jmenuBarDetalleTipoTransaccionModulo=jmenuBarDetalleAuxiliarTipoTransaccionModulo;
		final JToolBar jTtoolBarDetalleTipoTransaccionModulo=jTtoolBarDetalleAuxiliarTipoTransaccionModulo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTransaccionModulo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTransaccionModulo;
			processRunnable.jTableDatos=jTableDatosTipoTransaccionModulo;
			processRunnable.jPanelCampos=jPanelCamposTipoTransaccionModulo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTransaccionModulo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTransaccionModulo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTransaccionModulo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTransaccionModulo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTransaccionModulo;
			processRunnable.jTtoolBar=jTtoolBarTipoTransaccionModulo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTransaccionModulo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTransaccionModulo ,jPanelParametrosReportesTipoTransaccionModulo,jTableDatosTipoTransaccionModulo, /*jScrollPanelDatosTipoTransaccionModulo,*/jPanelCamposTipoTransaccionModulo,jPanelPaginacionTipoTransaccionModulo, /*jScrollPanelDatosEdicionTipoTransaccionModulo,*/ jPanelAccionesTipoTransaccionModulo,jPanelAccionesFormularioTipoTransaccionModulo,jmenuBarTipoTransaccionModulo,jmenuBarDetalleTipoTransaccionModulo,jTtoolBarTipoTransaccionModulo,jTtoolBarDetalleTipoTransaccionModulo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTransaccionModulo ,jPanelParametrosReportesTipoTransaccionModulo, jScrollPanelDatosTipoTransaccionModulo,jPanelPaginacionTipoTransaccionModulo, jScrollPanelDatosEdicionTipoTransaccionModulo, jPanelAccionesTipoTransaccionModulo,jPanelAccionesFormularioTipoTransaccionModulo,jmenuBarTipoTransaccionModulo,jmenuBarDetalleTipoTransaccionModulo,jTtoolBarTipoTransaccionModulo,jTtoolBarDetalleTipoTransaccionModulo);
						
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
	
	public void finishProcessTipoTransaccionModulo() {// throws Exception 
		this.finishProcessTipoTransaccionModulo(true);
	}
	
	public void finishProcessTipoTransaccionModulo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoTransaccionModulo ,this.jPanelParametrosReportesTipoTransaccionModulo, this.jScrollPanelDatosTipoTransaccionModulo,this.jPanelPaginacionTipoTransaccionModulo, this.jScrollPanelDatosEdicionTipoTransaccionModulo, this.jPanelAccionesTipoTransaccionModulo,this.jPanelAccionesFormularioTipoTransaccionModulo,this.jmenuBarTipoTransaccionModulo,this.jmenuBarDetalleTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,this.jTtoolBarDetalleTipoTransaccionModulo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTransaccionModulo=this.jTabbedPaneBusquedasTipoTransaccionModulo; 
		
		final JPanel jPanelParametrosReportesTipoTransaccionModulo=this.jPanelParametrosReportesTipoTransaccionModulo;
		//final JScrollPane jScrollPanelDatosTipoTransaccionModulo=this.jScrollPanelDatosTipoTransaccionModulo;
		final JTable jTableDatosTipoTransaccionModulo=this.jTableDatosTipoTransaccionModulo;		
		final JPanel jPanelPaginacionTipoTransaccionModulo=this.jPanelPaginacionTipoTransaccionModulo;
		//final JScrollPane jScrollPanelDatosEdicionTipoTransaccionModulo=this.jScrollPanelDatosEdicionTipoTransaccionModulo;
		final JPanel jPanelAccionesTipoTransaccionModulo=this.jPanelAccionesTipoTransaccionModulo;
		
		JPanel jPanelCamposAuxiliarTipoTransaccionModulo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTransaccionModulo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			jPanelCamposAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelCamposTipoTransaccionModulo;
			jPanelAccionesFormularioAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelAccionesFormularioTipoTransaccionModulo;
		}
		
		final JPanel jPanelCamposTipoTransaccionModulo=jPanelCamposAuxiliarTipoTransaccionModulo;
		final JPanel jPanelAccionesFormularioTipoTransaccionModulo=jPanelAccionesFormularioAuxiliarTipoTransaccionModulo;
		
		
		final JMenuBar jmenuBarTipoTransaccionModulo=this.jmenuBarTipoTransaccionModulo;		
		final JToolBar jTtoolBarTipoTransaccionModulo=this.jTtoolBarTipoTransaccionModulo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTransaccionModulo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTransaccionModulo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			jmenuBarDetalleAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jmenuBarDetalleTipoTransaccionModulo;
			jTtoolBarDetalleAuxiliarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jTtoolBarDetalleTipoTransaccionModulo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTransaccionModulo=jmenuBarDetalleAuxiliarTipoTransaccionModulo;
		final JToolBar jTtoolBarDetalleTipoTransaccionModulo=jTtoolBarDetalleAuxiliarTipoTransaccionModulo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTransaccionModulo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTransaccionModulo;
			processRunnable.jTableDatos=jTableDatosTipoTransaccionModulo;
			processRunnable.jPanelCampos=jPanelCamposTipoTransaccionModulo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTransaccionModulo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTransaccionModulo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTransaccionModulo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTransaccionModulo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTransaccionModulo;
			processRunnable.jTtoolBar=jTtoolBarTipoTransaccionModulo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTransaccionModulo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTransaccionModulo ,jPanelParametrosReportesTipoTransaccionModulo, jTableDatosTipoTransaccionModulo,/*jScrollPanelDatosTipoTransaccionModulo,*/jPanelCamposTipoTransaccionModulo,jPanelPaginacionTipoTransaccionModulo, /*jScrollPanelDatosEdicionTipoTransaccionModulo,*/ jPanelAccionesTipoTransaccionModulo,jPanelAccionesFormularioTipoTransaccionModulo,jmenuBarTipoTransaccionModulo,jmenuBarDetalleTipoTransaccionModulo,jTtoolBarTipoTransaccionModulo,jTtoolBarDetalleTipoTransaccionModulo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTransaccionModulo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTransaccionModulo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTransaccionModulo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTransaccionModulo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTransaccionModulo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTransaccionModulo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTransaccionModulo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTransaccionModulo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTransaccionModulo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipotransaccionmoduloConstantesFunciones.getsFinalQueryTipoTransaccionModulo();
		String  finalQueryPaginacionTodos=this.tipotransaccionmoduloConstantesFunciones.getsFinalQueryTipoTransaccionModulo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesNoTipoTransaccionModulo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipotransaccionmodulosEliminados= new ArrayList<TipoTransaccionModulo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTransaccionModulo();
		
				///*TipoTransaccionModuloSessionBean*/this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
			
			if(this.tipotransaccionmoduloSessionBean==null) {
				this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
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
					this.iNumeroPaginacion=TipoTransaccionModuloConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTransaccionModuloConstantesFunciones.getClassesForeignKeysOfTipoTransaccionModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipotransaccionmodulo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipotransaccionmodulosAux= new ArrayList<TipoTransaccionModulo>();
			
				
			tipotransaccionmoduloLogic.setDatosCliente(this.datosCliente);
			tipotransaccionmoduloLogic.setDatosDeep(this.datosDeep);
			tipotransaccionmoduloLogic.setIsConDeep(true);
			
			
			tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipotransaccionmoduloLogic.getTodosTipoTransaccionModulos(finalQueryGlobal,pagination);
					
					//tipotransaccionmoduloLogic.getTodosTipoTransaccionModulosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipotransaccionmoduloLogic.getTipoTransaccionModulos()==null|| tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotransaccionmodulosAux= new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulosAux.addAll(tipotransaccionmoduloLogic.getTipoTransaccionModulos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulosAux= new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulosAux.addAll(tipotransaccionmodulos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotransaccionmoduloLogic.getTodosTipoTransaccionModulos(finalQueryGlobal+"",this.pagination);												
							
							//tipotransaccionmoduloLogic.getTodosTipoTransaccionModulosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmoduloLogic.getTipoTransaccionModulos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotransaccionmoduloLogic.setTipoTransaccionModulos(new ArrayList<TipoTransaccionModulo>());					
							tipotransaccionmoduloLogic.getTipoTransaccionModulos().addAll(tipotransaccionmodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulos=new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulos.addAll(tipotransaccionmodulosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTransaccionModulo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTransaccionModulo=this.idActual;
				
				} else if(this.idTipoTransaccionModuloActual!=null && this.idTipoTransaccionModuloActual!=0L) {
					idTipoTransaccionModulo=idTipoTransaccionModuloActual;
				}
				
					
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndicePorId(idTipoTransaccionModulo);
				
				this.tipotransaccionmodulos=new ArrayList<TipoTransaccionModulo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipotransaccionmoduloLogic.getEntity(idTipoTransaccionModulo);
					
					//tipotransaccionmoduloLogic.getEntityWithConnection(idTipoTransaccionModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.setTipoTransaccionModulos(new ArrayList<TipoTransaccionModulo>());
					tipotransaccionmoduloLogic.getTipoTransaccionModulos().add(tipotransaccionmoduloLogic.getTipoTransaccionModulo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotransaccionmodulos=new ArrayList<TipoTransaccionModulo>();
					this.tipotransaccionmodulos.add(tipotransaccionmodulo);
				}
				
				if(tipotransaccionmoduloLogic.getTipoTransaccionModulo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdModuloPorNombre")) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotransaccionmoduloLogic.getTipoTransaccionModulosBusquedaPorIdModuloPorNombre(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotransaccionmoduloLogic.getTipoTransaccionModulos()==null||tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotransaccionmodulos==null|| tipotransaccionmodulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmodulosAux=new ArrayList<TipoTransaccionModulo>();
						tipotransaccionmodulosAux.addAll(tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulosAux=new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulosAux.addAll(tipotransaccionmodulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotransaccionmoduloLogic.getTipoTransaccionModulosBusquedaPorIdModuloPorNombre(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTransaccionModulos("BusquedaPorIdModuloPorNombre",tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTransaccionModulos("BusquedaPorIdModuloPorNombre",tipotransaccionmodulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloLogic.setTipoTransaccionModulos(new ArrayList<TipoTransaccionModulo>());
						tipotransaccionmoduloLogic.getTipoTransaccionModulos().addAll(tipotransaccionmodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulos=new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulos.addAll(tipotransaccionmodulosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotransaccionmoduloLogic.getTipoTransaccionModulosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotransaccionmoduloLogic.getTipoTransaccionModulos()==null||tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotransaccionmodulos==null|| tipotransaccionmodulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmodulosAux=new ArrayList<TipoTransaccionModulo>();
						tipotransaccionmodulosAux.addAll(tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulosAux=new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulosAux.addAll(tipotransaccionmodulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotransaccionmoduloLogic.getTipoTransaccionModulosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTransaccionModulos("BusquedaPorNombre",tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTransaccionModulos("BusquedaPorNombre",tipotransaccionmodulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloLogic.setTipoTransaccionModulos(new ArrayList<TipoTransaccionModulo>());
						tipotransaccionmoduloLogic.getTipoTransaccionModulos().addAll(tipotransaccionmodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulos=new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulos.addAll(tipotransaccionmodulosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotransaccionmoduloLogic.getTipoTransaccionModulosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotransaccionmoduloLogic.getTipoTransaccionModulos()==null||tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotransaccionmodulos==null|| tipotransaccionmodulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmodulosAux=new ArrayList<TipoTransaccionModulo>();
						tipotransaccionmodulosAux.addAll(tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulosAux=new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulosAux.addAll(tipotransaccionmodulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotransaccionmoduloLogic.getTipoTransaccionModulosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTransaccionModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTransaccionModulos("FK_IdModulo",tipotransaccionmoduloLogic.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTransaccionModulos("FK_IdModulo",tipotransaccionmodulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloLogic.setTipoTransaccionModulos(new ArrayList<TipoTransaccionModulo>());
						tipotransaccionmoduloLogic.getTipoTransaccionModulos().addAll(tipotransaccionmodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmodulos=new ArrayList<TipoTransaccionModulo>();
							tipotransaccionmodulos.addAll(tipotransaccionmodulosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTransaccionModulo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTransaccionModulo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotransaccionmoduloLogic.getTipoTransaccionModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotransaccionmodulos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotransaccionmoduloLogic.getTipoTransaccionModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotransaccionmodulos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTransaccionModulo tipotransaccionmodulo) {
		Boolean permite=true;
		
		if(this.tipotransaccionmodulo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTransaccionModuloConstantesFunciones.getOrderByListaTipoTransaccionModulo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTransaccionModuloConstantesFunciones.getOrderByListaTipoTransaccionModulo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransaccionModulo tipotransaccionmodulo:tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
				if(tipotransaccionmodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaccionmoduloTotales=tipotransaccionmodulo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulos) {
				if(tipotransaccionmodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaccionmoduloTotales=tipotransaccionmodulo;
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
			this.tipotransaccionmoduloAux=new TipoTransaccionModulo();
			this.tipotransaccionmoduloAux.setsType(Constantes2.S_TOTALES);
			this.tipotransaccionmoduloAux.setIsNew(false);
			this.tipotransaccionmoduloAux.setIsChanged(false);
			this.tipotransaccionmoduloAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTransaccionModuloConstantesFunciones.TotalizarValoresFilaTipoTransaccionModulo(this.tipotransaccionmoduloLogic.getTipoTransaccionModulos(),this.tipotransaccionmoduloAux);
				
				this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().add(this.tipotransaccionmoduloAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTransaccionModuloConstantesFunciones.TotalizarValoresFilaTipoTransaccionModulo(this.tipotransaccionmodulos,this.tipotransaccionmoduloAux);
				
				this.tipotransaccionmodulos.add(this.tipotransaccionmoduloAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipotransaccionmoduloTotales=new TipoTransaccionModulo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().remove(tipotransaccionmoduloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotransaccionmodulos.remove(tipotransaccionmoduloTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipotransaccionmoduloTotales=new TipoTransaccionModulo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTransaccionModulo tipotransaccionmodulo:tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
				if(tipotransaccionmodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaccionmoduloTotales=tipotransaccionmodulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTransaccionModuloConstantesFunciones.TotalizarValoresFilaTipoTransaccionModulo(this.tipotransaccionmoduloLogic.getTipoTransaccionModulos(),tipotransaccionmoduloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulos) {
				if(tipotransaccionmodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotransaccionmoduloTotales=tipotransaccionmodulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTransaccionModuloConstantesFunciones.TotalizarValoresFilaTipoTransaccionModulo(this.tipotransaccionmodulos,tipotransaccionmoduloTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoTransaccionModulosBusquedaPorIdModuloPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdModuloPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTransaccionModulosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTransaccionModulosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTransaccionModuloPorIdModuloPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdModuloPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTransaccionModuloPorIdPorIdModulo()throws Exception {
		try {
			sAccionBusqueda="PorIdPorIdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoTransaccionModulosBusquedaPorIdModuloPorNombre(String sFinalQuery,Long id_modulo,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getTipoTransaccionModulosBusquedaPorIdModuloPorNombre(sFinalQuery,this.pagination,id_modulo,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTransaccionModulosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getTipoTransaccionModulosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTransaccionModulosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getTipoTransaccionModulosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTransaccionModuloPorIdModuloPorNombre(Long id_modulo,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getTipoTransaccionModuloPorIdModuloPorNombre(id_modulo,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTransaccionModuloPorIdPorIdModulo(Long id,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getTipoTransaccionModuloPorIdPorIdModulo(id,id_modulo);
				
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
	
	public void inicializarPermisosTipoTransaccionModulo() {
		this.isPermisoTodoTipoTransaccionModulo=false;
		this.isPermisoNuevoTipoTransaccionModulo=false;
		this.isPermisoActualizarTipoTransaccionModulo=false;
		this.isPermisoActualizarOriginalTipoTransaccionModulo=false;
		this.isPermisoEliminarTipoTransaccionModulo=false;
		this.isPermisoGuardarCambiosTipoTransaccionModulo=false;
		this.isPermisoConsultaTipoTransaccionModulo=false;
		this.isPermisoBusquedaTipoTransaccionModulo=false;
		this.isPermisoReporteTipoTransaccionModulo=false;		
		this.isPermisoOrdenTipoTransaccionModulo=false;		
		this.isPermisoPaginacionMedioTipoTransaccionModulo=false;		
		this.isPermisoPaginacionAltoTipoTransaccionModulo=false;
		this.isPermisoPaginacionTodoTipoTransaccionModulo=false;
		this.isPermisoCopiarTipoTransaccionModulo=false;		
		this.isPermisoVerFormTipoTransaccionModulo=false;		
		this.isPermisoDuplicarTipoTransaccionModulo=false;		
		this.isPermisoOrdenTipoTransaccionModulo=false;		
	}
	
	public void setPermisosUsuarioTipoTransaccionModulo(Boolean isPermiso) {
		this.isPermisoTodoTipoTransaccionModulo=isPermiso;
		this.isPermisoNuevoTipoTransaccionModulo=isPermiso;
		this.isPermisoActualizarTipoTransaccionModulo=isPermiso;
		this.isPermisoActualizarOriginalTipoTransaccionModulo=isPermiso;
		this.isPermisoEliminarTipoTransaccionModulo=isPermiso;
		this.isPermisoGuardarCambiosTipoTransaccionModulo=isPermiso;
		this.isPermisoConsultaTipoTransaccionModulo=isPermiso;
		this.isPermisoBusquedaTipoTransaccionModulo=isPermiso;
		this.isPermisoReporteTipoTransaccionModulo=isPermiso;
		this.isPermisoOrdenTipoTransaccionModulo=isPermiso;		
		this.isPermisoPaginacionMedioTipoTransaccionModulo=isPermiso;		
		this.isPermisoPaginacionAltoTipoTransaccionModulo=isPermiso;		
		this.isPermisoPaginacionTodoTipoTransaccionModulo=isPermiso;		
		this.isPermisoCopiarTipoTransaccionModulo=isPermiso;		
		this.isPermisoVerFormTipoTransaccionModulo=isPermiso;		
		this.isPermisoDuplicarTipoTransaccionModulo=isPermiso;
		this.isPermisoOrdenTipoTransaccionModulo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTransaccionModulo(Boolean isPermiso) {
		//this.isPermisoTodoTipoTransaccionModulo=isPermiso;
		this.isPermisoNuevoTipoTransaccionModulo=isPermiso;
		this.isPermisoActualizarTipoTransaccionModulo=isPermiso;
		this.isPermisoActualizarOriginalTipoTransaccionModulo=isPermiso;
		this.isPermisoEliminarTipoTransaccionModulo=isPermiso;
		this.isPermisoGuardarCambiosTipoTransaccionModulo=isPermiso;
		//this.isPermisoConsultaTipoTransaccionModulo=isPermiso;
		//this.isPermisoBusquedaTipoTransaccionModulo=isPermiso;
		//this.isPermisoReporteTipoTransaccionModulo=isPermiso;
		//this.isPermisoOrdenTipoTransaccionModulo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTransaccionModulo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTransaccionModulo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTransaccionModulo=isPermiso;		
		//this.isPermisoCopiarTipoTransaccionModulo=isPermiso;		
		//this.isPermisoDuplicarTipoTransaccionModulo=isPermiso;
		//this.isPermisoOrdenTipoTransaccionModulo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTransaccionModuloClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoTransaccionModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTransaccionModulo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTransaccionModuloClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTransaccionModuloClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTransaccionModuloClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTransaccionModuloClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoTransaccionModulo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTransaccionModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTransaccionModuloConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTransaccionModulo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTransaccionModulo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTransaccionModulo=this.isPermisoActualizarTipoTransaccionModulo;
			this.isPermisoEliminarTipoTransaccionModulo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTransaccionModulo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTransaccionModulo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTransaccionModulo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTransaccionModulo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTransaccionModulo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTransaccionModulo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTransaccionModulo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTransaccionModulo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTransaccionModulo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTransaccionModulo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTransaccionModulo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTransaccionModulo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTransaccionModulo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTransaccionModulo.setToolTipText(this.jTableDatosTipoTransaccionModulo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTransaccionModulo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTransaccionModulo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTransaccionModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoTransaccionModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoTransaccionModulo() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoTransaccionModuloListas()throws Exception {
		try	{						
			
				this.modulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTransaccionModuloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTransaccionModuloJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTransaccionModuloListas(false);
			} else {
			
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoTransaccionModuloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoTransaccionModuloParameterReturnGeneral tipotransaccionmoduloReturnGeneral=new TipoTransaccionModuloParameterReturnGeneral();
						
			


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.tipotransaccionmoduloConstantesFunciones.cargarid_moduloTipoTransaccionModulo)
					 || (this.esRecargarFks && this.tipotransaccionmoduloConstantesFunciones.cargarid_moduloTipoTransaccionModulo)) {

					if(!this.tipotransaccionmoduloSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+tipotransaccionmoduloSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipotransaccionmoduloReturnGeneral=tipotransaccionmoduloLogic.cargarCombosLoteForeignKeyTipoTransaccionModulo(finalQueryGlobalModulo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=tipotransaccionmoduloReturnGeneral.getmodulosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTransaccionModulo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {
			if(this.tipotransaccionmoduloSessionBean==null) {
				this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
			}

			if(!this.tipotransaccionmoduloSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoTransaccionModulo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTransaccionModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTransaccionModulo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTransaccionModulo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(tipotransaccionmodulo.getid_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTransaccionModulo()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.tipotransaccionmoduloConstantesFunciones.getid_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTransaccionModulo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTransaccionModulo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTransaccionModulo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTransaccionModulo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTransaccionModulo()throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTransaccionModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTransaccionModulo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo!=null && this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoTransaccionModuloBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTransaccionModuloBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTransaccionModuloBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean(); 
		this.tipotransaccionmoduloConstantesFunciones=new TipoTransaccionModuloConstantesFunciones(); 
		this.tipotransaccionmoduloBean=new TipoTransaccionModulo();//(this.tipotransaccionmoduloConstantesFunciones); 		
		this.tipotransaccionmoduloReturnGeneral=new TipoTransaccionModuloParameterReturnGeneral(); 
		
		this.tipotransaccionmoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotransaccionmoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTransaccionModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTransaccionModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTransaccionModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTransaccionModulo(true);
			
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
			
			this.tipotransaccionmoduloConstantesFunciones=new TipoTransaccionModuloConstantesFunciones(); 
			this.tipotransaccionmoduloBean=new TipoTransaccionModulo();//this.tipotransaccionmoduloConstantesFunciones); 			
			this.tipotransaccionmoduloReturnGeneral=new TipoTransaccionModuloParameterReturnGeneral(); 
		
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Transaccion Modulo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipotransaccionmodulo=new TipoTransaccionModulo();
			this.tipotransaccionmodulos = new ArrayList<TipoTransaccionModulo>();
			this.tipotransaccionmodulosAux = new ArrayList<TipoTransaccionModulo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			//this.tipotransaccionmoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipotransaccionmoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTransaccionModulo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTransaccionModulo);	
					}
					
					if(this.jInternalFrameImportacionTipoTransaccionModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTransaccionModulo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTransaccionModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTransaccionModulo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTransaccionModulo);
				this.jInternalFrameDetalleFormTipoTransaccionModulo.setVisible(false);
				this.jInternalFrameDetalleFormTipoTransaccionModulo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTransaccionModulo);
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTransaccionModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTransaccionModulo);
					this.jInternalFrameImportacionTipoTransaccionModulo.setVisible(false);
					this.jInternalFrameImportacionTipoTransaccionModulo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTransaccionModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTransaccionModulo);
					this.jInternalFrameOrderByTipoTransaccionModulo.setVisible(false);
					this.jInternalFrameOrderByTipoTransaccionModulo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTransaccionModuloActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTransaccionModuloConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipotransaccionmoduloReturnGeneral=new TipoTransaccionModuloParameterReturnGeneral();
			
			this.tipotransaccionmoduloParameterGeneral=new TipoTransaccionModuloParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipotransaccionmoduloLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoTransaccionModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTransaccionModuloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado(),this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTransaccionModuloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado(),this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
			this.isVisibilidadCeldaDuplicarTipoTransaccionModulo=true;
			this.isVisibilidadCeldaCopiarTipoTransaccionModulo=true;
			this.isVisibilidadCeldaVerFormTipoTransaccionModulo=true;
			this.isVisibilidadCeldaOrdenTipoTransaccionModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;
			
			
			this.isVisibilidadBusquedaPorIdModuloPorNombre=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTransaccionModulo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTransaccionModulo(false);
			
			this.setPermisosUsuarioTipoTransaccionModulo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado() 
				|| (this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado() && this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTransaccionModuloClasesRelacionadas();
			}
			
			if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTransaccionModuloClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTransaccionModulo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTransaccionModulo();
			}
			
			if(!this.isPermisoBusquedaTipoTransaccionModulo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTransaccionModulo,this.isPermisoPaginacionMedioTipoTransaccionModulo,this.isPermisoPaginacionTodoTipoTransaccionModulo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTransaccionModuloConstantesFunciones.getTiposSeleccionarTipoTransaccionModulo());
				
				this.tiposColumnasSelect=TipoTransaccionModuloConstantesFunciones.getTiposSeleccionarTipoTransaccionModulo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTransaccionModulo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoTransaccionModulo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoTransaccionModulo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransaccionModulo() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.moduloLogic=new ModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipotransaccionmoduloImplementable= (TipoTransaccionModuloImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTransaccionModuloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipotransaccionmoduloImplementableHome= (TipoTransaccionModuloImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTransaccionModuloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipotransaccionmodulos= new ArrayList<TipoTransaccionModulo>();
			this.tipotransaccionmodulosEliminados= new ArrayList<TipoTransaccionModulo>();
						
			this.isEsNuevoTipoTransaccionModulo=false;
			this.esParaAccionDesdeFormularioTipoTransaccionModulo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTransaccionModulo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTransaccionModulo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTransaccionModuloConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTransaccionModulo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTransaccionModulo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTransaccionModulo();
			}
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoTransaccionModulo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoTransaccionModulo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoTransaccionModulo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTransaccionModulo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTransaccionModulo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTransaccionModulo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTransaccionModulo")) {
				iIndex=this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTransaccionModulo();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyTipoTransaccionModulo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTransaccionModulo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTransaccionModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTransaccionModulo();
		
		this.cargarCombosFrameForeignKeyTipoTransaccionModulo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTransaccionModulo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTransaccionModulo();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoTransaccionModuloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
			
			if(jTableDatosTipoTransaccionModulo.getRowCount()>=1) {
				jTableDatosTipoTransaccionModulo.removeRowSelectionInterval(0, jTableDatosTipoTransaccionModulo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTransaccionModulo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTransaccionModulo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTransaccionModulo(true);			
			//this.tipotransaccionmodulo=new TipoTransaccionModulo();
			//this.tipotransaccionmodulo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTransaccionModulo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo() ;
			
			if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTransaccionModulo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipotransaccionmodulo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);				
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
			if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTransaccionModulo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTransaccionModuloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTransaccionModulo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTransaccionModulo.getSelectedRows().length;			
			}
			
			tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTransaccionModulo--;			
				//TipoTransaccionModulo tipotransaccionmoduloAux= new TipoTransaccionModulo();			
				//tipotransaccionmoduloAux.setId(this.iIdNuevoTipoTransaccionModulo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTransaccionModulo tipotransaccionmoduloOrigen=new TipoTransaccionModulo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTransaccionModulo tipotransaccionmoduloOrigen : tipotransaccionmodulosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipotransaccionmoduloOrigen =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotransaccionmoduloOrigen =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTransaccionModulo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipotransaccionmodulo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTransaccionModulo(tipotransaccionmoduloOrigen,this.tipotransaccionmodulo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().add(this.tipotransaccionmoduloAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotransaccionmodulos.add(this.tipotransaccionmoduloAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
				
				this.jTableDatosTipoTransaccionModulo.setRowSelectionInterval(this.getIndiceNuevoTipoTransaccionModulo(), this.getIndiceNuevoTipoTransaccionModulo());
				
				int iLastRow =  this.jTableDatosTipoTransaccionModulo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTransaccionModulo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTransaccionModulo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();									
		
			TipoTransaccionModulo tipotransaccionmoduloOrigen=new TipoTransaccionModulo();
			TipoTransaccionModulo tipotransaccionmoduloDestino=new TipoTransaccionModulo();
				
			tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTransaccionModulo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipotransaccionmodulosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTransaccionModulo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloOrigen =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotransaccionmoduloOrigen =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotransaccionmoduloDestino =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotransaccionmoduloDestino =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipotransaccionmoduloOrigen =tipotransaccionmodulosSeleccionados.get(0);
				tipotransaccionmoduloDestino =tipotransaccionmodulosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTransaccionModulo(tipotransaccionmoduloOrigen,tipotransaccionmoduloDestino,true,false);
				
				tipotransaccionmoduloDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotransaccionmoduloDestino,tipotransaccionmoduloLogic.getTipoTransaccionModulos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotransaccionmoduloDestino,tipotransaccionmodulos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
				
				//this.jTableDatosTipoTransaccionModulo.setRowSelectionInterval(this.getIndiceNuevoTipoTransaccionModulo(), this.getIndiceNuevoTipoTransaccionModulo());
				
				int iLastRow =  this.jTableDatosTipoTransaccionModulo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTransaccionModulo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTransaccionModulo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTransaccionModulo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(!isVisible);
			this.jPanelPaginacionTipoTransaccionModulo.setVisible(!isVisible);
			this.jPanelAccionesTipoTransaccionModulo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTransaccionModulo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTransaccionModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTransaccionModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTransaccionModulo();
			
			this.abrirFrameOrderByTipoTransaccionModulo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTransaccionModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTransaccionModulo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTransaccionModulo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTransaccionModulo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTransaccionModulo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTransaccionModulo.setSize(this.jInternalFrameDetalleFormTipoTransaccionModulo.iWidthFormulario,this.jInternalFrameDetalleFormTipoTransaccionModulo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTransaccionModulo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTransaccionModulo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTransaccionModulo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTransaccionModulo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTransaccionModulo.jContentPaneDetalleTipoTransaccionModulo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTransaccionModulo.jContentPaneDetalleTipoTransaccionModulo.getWidth(),TipoTransaccionModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTransaccionModulo.jContentPaneDetalleTipoTransaccionModulo.getWidth(),TipoTransaccionModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTransaccionModulo.jContentPaneDetalleTipoTransaccionModulo.getWidth(),TipoTransaccionModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTransaccionModulo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTransaccionModulo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTransaccionModulo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTransaccionModulo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTransaccionModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransaccionModulo,false,this);
				} else {
					this.jInternalFrameOrderByTipoTransaccionModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransaccionModulo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTransaccionModulo);
				this.jInternalFrameOrderByTipoTransaccionModulo.setVisible(false);
				this.jInternalFrameOrderByTipoTransaccionModulo.setSelected(false);
				
				this.jInternalFrameOrderByTipoTransaccionModulo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTransaccionModulo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTransaccionModulo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTransaccionModulo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTransaccionModulo==null) {
				
				this.jInternalFrameImportacionTipoTransaccionModulo=new ImportacionJInternalFrame(TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTransaccionModulo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTransaccionModulo);
				this.jInternalFrameImportacionTipoTransaccionModulo.setVisible(false);
				this.jInternalFrameImportacionTipoTransaccionModulo.setSelected(false);


				this.jInternalFrameImportacionTipoTransaccionModulo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTransaccionModulo"));
				this.jInternalFrameImportacionTipoTransaccionModulo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTransaccionModulo"));
				this.jInternalFrameImportacionTipoTransaccionModulo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTransaccionModulo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTransaccionModulo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo==null) {
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo=new ReporteDinamicoJInternalFrame(TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTransaccionModulo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTransaccionModulo);
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTransaccionModulo"));
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTransaccionModulo"));
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTransaccionModulo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTransaccionModulo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoTransaccionModulo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTransaccionModulo);
			
	       	this.jInternalFrameDetalleFormTipoTransaccionModulo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTransaccionModulo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTransaccionModulo.dispose();
			//this.jInternalFrameDetalleFormTipoTransaccionModulo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTransaccionModulo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTransaccionModulo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTransaccionModulo.setVisible(true);
	        this.jInternalFrameImportacionTipoTransaccionModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTransaccionModulo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTransaccionModulo.setVisible(true);
	        this.jInternalFrameOrderByTipoTransaccionModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTransaccionModulo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTransaccionModulo.setVisible(false);
	        this.jInternalFrameOrderByTipoTransaccionModulo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTransaccionModulo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTransaccionModulo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTransaccionModulo.setVisible(false);
	        this.jInternalFrameImportacionTipoTransaccionModulo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTransaccionModulo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTransaccionModulo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTransaccionModulo(true);
			//this.isEsNuevoTipoTransaccionModulo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTransaccionModulo(false) ;
			
			if(tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTransaccionModulo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTransaccionModuloActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTransaccionModulo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTransaccionModulo(true);
			//this.isEsNuevoTipoTransaccionModulo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipotransaccionmodulo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTransaccionModulo(false) ;
			
			if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTransaccionModulo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoTransaccionModulo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTransaccionModulo(false);
			
			//if(!this.isEsNuevoTipoTransaccionModulo) {								
				int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
				
			}
			
			if(this.permiteMantenimiento(this.tipotransaccionmodulo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTransaccionModulo=true;
					this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
					this.isEsNuevoTipoTransaccionModulo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTransaccionModulo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTransaccionModulo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTransaccionModulo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo(false);
				
				this.habilitarDeshabilitarControlesTipoTransaccionModulo(false);
			
												
				
				if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTransaccionModulo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTransaccionModuloActionPerformed(evt,tipotransaccionmoduloSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTransaccionModulo(this.tipotransaccionmodulo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTransaccionModulo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipotransaccionmoduloSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipotransaccionmodulo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				this.tipotransaccionmodulo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				this.tipotransaccionmodulo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipotransaccionmodulo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTransaccionModuloModel) this.jTableDatosTipoTransaccionModulo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTransaccionModulo=true;
				this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
				this.isEsNuevoTipoTransaccionModulo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTransaccionModulo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo(false);
				
				this.habilitarDeshabilitarControlesTipoTransaccionModulo(false);
				
				
				
				if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTransaccionModulo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTransaccionModulo.getRowCount()>=1) {
				jTableDatosTipoTransaccionModulo.removeRowSelectionInterval(0, jTableDatosTipoTransaccionModulo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTransaccionModulo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTransaccionModulo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo(false) ;
			
			this.isEsNuevoTipoTransaccionModulo=false;
			
			if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTransaccionModulo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTransaccionModulo(false);
				
				//SI ES MANUAL
				if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTransaccionModulo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTransaccionModulo--;			
			//TipoTransaccionModulo tipotransaccionmoduloAux= new TipoTransaccionModulo();			
			//tipotransaccionmoduloAux.setId(this.iIdNuevoTipoTransaccionModulo);
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTransaccionModulo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
			
			this.tipotransaccionmodulo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().add(this.tipotransaccionmoduloAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipotransaccionmodulos.add(this.tipotransaccionmoduloAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
			
			this.jTableDatosTipoTransaccionModulo.setRowSelectionInterval(this.getIndiceNuevoTipoTransaccionModulo(), this.getIndiceNuevoTipoTransaccionModulo());
			
			int iLastRow =  this.jTableDatosTipoTransaccionModulo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTransaccionModulo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTransaccionModulo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransaccionModulo(false);
			
			//SI ES MANUAL
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTransaccionModulo();
			}
			
			//this.abrirFrameTreeTipoTransaccionModulo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Transaccion ModuloS ?", "MANTENIMIENTO DE Tipo Transaccion Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTransaccionModulo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTransaccionModulo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipotransaccionmoduloReturnGeneral=tipotransaccionmoduloLogic.procesarImportacionTipoTransaccionModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipotransaccionmoduloParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTransaccionModuloReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTransaccionModulo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTransaccionModulo.setFileImportacion(this.jInternalFrameImportacionTipoTransaccionModulo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTransaccionModulo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTransaccionModulo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTransaccionModulo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTransaccionModulo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		

		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTransaccionModuloBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTransaccionModuloBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmodulosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransaccionmodulo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoTransaccionModulos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(TipoTransaccionModulo tipotransaccionmodulo:tipotransaccionmodulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotransaccionmodulo.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTransaccionModulo tipotransaccionmodulo:tipotransaccionmodulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotransaccionmodulo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(TipoTransaccionModulo tipotransaccionmodulo:tipotransaccionmodulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotransaccionmodulo.getsiglas());
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
			//	this.getFilaCabeceraExportarExcelTipoTransaccionModulo(row);				
			//	iRow++;
			//}				
			
			//for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTransaccionModulo(tipotransaccionmoduloAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransaccionModulo(false);
			
			//SI ES MANUAL
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTransaccionModulo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransaccionModulo(false);
			
			//SI ES MANUAL
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTransaccionModulo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTransaccionModulo(false);
			
			//SI ES MANUAL
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTransaccionModulo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTransaccionModulo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTransaccionModulo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTransaccionModulo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTransaccionModulo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTransaccionModulo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTransaccionModulo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTransaccionModulo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTransaccionModulo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTransaccionModulo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTransaccionModulo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTransaccionModulo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTransaccionModulo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTransaccionModulo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTransaccionModulo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransaccionModulo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTransaccionModulo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTransaccionModulo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTransaccionModulo();
		
		this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTransaccionModulo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransaccionModulo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTransaccionModulo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTransaccionModulo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTransaccionModulo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTransaccionModulo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jCheckBoxPostAccionNuevoTipoTransaccionModulo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTransaccionModulo.jCheckBoxPostAccionSinCerrarTipoTransaccionModulo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTransaccionModulo.jCheckBoxPostAccionSinMensajeTipoTransaccionModulo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTransaccionModulo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTransaccionModulo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
				this.jInternalFrameDetalleFormTipoTransaccionModulo.jCheckBoxPostAccionNuevoTipoTransaccionModulo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTransaccionModulo.jCheckBoxPostAccionSinCerrarTipoTransaccionModulo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTransaccionModulo.jCheckBoxPostAccionSinMensajeTipoTransaccionModulo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTransaccionModulo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTransaccionModulo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTransaccionModulo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTransaccionModulo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTransaccionModulo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTransaccionModulo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTransaccionModulo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTransaccionModulo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTransaccionModulo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTransaccionModulo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTransaccionModulo() throws Exception {
		try	{
			if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTransaccionModulo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTransaccionModulo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTransaccionModulo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTransaccionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTransaccionModulo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTransaccionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTransaccionModulo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTransaccionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTransaccionModulo.addItem(reporte);
			}
			
			
			if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTransaccionModulo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTransaccionModulo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTransaccionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTransaccionModulo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTransaccionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTransaccionModulo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTransaccionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTransaccionModulo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTransaccionModulo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTransaccionModulo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTransaccionModulo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTransaccionModulo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.getSelectedItem()!=null){this.id_moduloBusquedaPorIdModuloPorNombre=((Modulo)this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdModuloPorNombre=this.jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoTransaccionModulo.getText();
		if(this.jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTransaccionModulo(Boolean esInicializar) throws Exception {				
		if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTransaccionModulo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTransaccionModulo() throws Exception {
		this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTransaccionModulo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTransaccionModuloOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModuloOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTransaccionModulo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipotransaccionmodulos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTransaccionModulo.setModel(new TipoTransaccionModuloModel(this.tipotransaccionmoduloLogic.getTipoTransaccionModulos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTransaccionModulo.setModel(new TipoTransaccionModuloModel(this.tipotransaccionmodulos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTransaccionModulo!=null && this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTransaccionModulo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO,tipotransaccionmoduloConstantesFunciones.resaltarSeleccionarTipoTransaccionModulo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO,tipotransaccionmoduloConstantesFunciones.resaltarSeleccionarTipoTransaccionModulo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,TipoTransaccionModuloConstantesFunciones.LABEL_ID));

		if(this.tipotransaccionmoduloConstantesFunciones.mostraridTipoTransaccionModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTransaccionModuloConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipotransaccionmoduloConstantesFunciones.resaltaridTipoTransaccionModulo,this.tipotransaccionmoduloConstantesFunciones.activaridTipoTransaccionModulo,this,true,"idTipoTransaccionModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotransaccionmoduloConstantesFunciones.resaltaridTipoTransaccionModulo,this.tipotransaccionmoduloConstantesFunciones.activaridTipoTransaccionModulo,this,true,"idTipoTransaccionModulo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO));

		if(this.tipotransaccionmoduloConstantesFunciones.mostrarid_moduloTipoTransaccionModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.tipotransaccionmoduloConstantesFunciones.resaltarid_moduloTipoTransaccionModulo,this,this.tipotransaccionmoduloConstantesFunciones.activarid_moduloTipoTransaccionModulo));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.tipotransaccionmoduloConstantesFunciones.resaltarid_moduloTipoTransaccionModulo,this,this.tipotransaccionmoduloConstantesFunciones.activarid_moduloTipoTransaccionModulo,true,"id_moduloTipoTransaccionModulo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE));

		if(this.tipotransaccionmoduloConstantesFunciones.mostrarnombreTipoTransaccionModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotransaccionmoduloConstantesFunciones.resaltarnombreTipoTransaccionModulo,this.tipotransaccionmoduloConstantesFunciones.activarnombreTipoTransaccionModulo,this,true,"nombreTipoTransaccionModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotransaccionmoduloConstantesFunciones.resaltarnombreTipoTransaccionModulo,this.tipotransaccionmoduloConstantesFunciones.activarnombreTipoTransaccionModulo,this,true,"nombreTipoTransaccionModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS));

		if(this.tipotransaccionmoduloConstantesFunciones.mostrarsiglasTipoTransaccionModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotransaccionmoduloConstantesFunciones.resaltarsiglasTipoTransaccionModulo,this.tipotransaccionmoduloConstantesFunciones.activarsiglasTipoTransaccionModulo,this,true,"siglasTipoTransaccionModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotransaccionmoduloConstantesFunciones.resaltarsiglasTipoTransaccionModulo,this.tipotransaccionmoduloConstantesFunciones.activarsiglasTipoTransaccionModulo,this,true,"siglasTipoTransaccionModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTransaccionModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTransaccionModulo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTransaccionModulo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTransaccionModulo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoTransaccionModulo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTransaccionModulo.moveColumn(this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTransaccionModulo.moveColumn(this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTransaccionModulo.moveColumn(this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTransaccionModulo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTransaccionModulo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTransaccionModulo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTransaccionModulo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTransaccionModulo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTransaccionModulo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipotransaccionmoduloLogic.getTipoTransaccionModulos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipotransaccionmodulos.size()-1;
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
		//this.jTableDatosTipoTransaccionModulo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTransaccionModulo();
			
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
				
				//this.isEsNuevoTipoTransaccionModulo=false;
					
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
				if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTransaccionModulo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTransaccionModulo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipotransaccionmodulo.getsType().equals("DUPLICADO")
				   || this.tipotransaccionmodulo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTransaccionModulo=true;
				
				} else {
					this.isEsNuevoTipoTransaccionModulo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
					if(this.tipotransaccionmodulo.getId()>=0 && !this.tipotransaccionmodulo.getIsNew()) {						
						this.isEsNuevoTipoTransaccionModulo=false;
						
					} else {
						this.isEsNuevoTipoTransaccionModulo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTransaccionModulo(esRelaciones);						
				
				this.seleccionarTipoTransaccionModulo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipotransaccionmodulo.getId()<0) {
					this.isEsNuevoTipoTransaccionModulo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTransaccionModulo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTransaccionModulo(evt,rowIndex);
				}	
				
				if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTransaccionModulo: " + this.dDif); 
					}
				}								
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTransaccionModulo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipotransaccionmodulo)) {
					if(this.tipotransaccionmodulo.getId()>0) {
						this.tipotransaccionmodulo.setIsDeleted(true);
						
						this.tipotransaccionmodulosEliminados.add(this.tipotransaccionmodulo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().remove(this.tipotransaccionmodulo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotransaccionmodulos.remove(this.tipotransaccionmodulo);				
					}
					
					
					((TipoTransaccionModuloModel) this.jTableDatosTipoTransaccionModulo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTransaccionModulo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTransaccionModulo) {
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTransaccionModulo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTransaccionModulo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTransaccionModulo(this.tipotransaccionmodulo);
				}
				
				//ARCHITECTURE
				try {
					

					//Modulo
					if(!this.tipotransaccionmoduloConstantesFunciones.cargarid_moduloTipoTransaccionModulo || this.tipotransaccionmoduloConstantesFunciones.event_dependid_moduloTipoTransaccionModulo) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.tipotransaccionmodulo.getid_modulo());
									//this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(tipotransaccionmodulo.getModulo()!=null) {
							this.modulosForeignKey.add(tipotransaccionmodulo.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.tipotransaccionmodulo.getid_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTransaccionModulo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTransaccionModulo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTransaccionModulo(tipotransaccionmodulo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTransaccionModulo(tipotransaccionmodulo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTransaccionModulo(tipotransaccionmodulo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTransaccionModulo(tipotransaccionmodulo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.setText(tipotransaccionmodulo.getId().toString());
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.setText(tipotransaccionmodulo.getnombre());
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.setText(tipotransaccionmodulo.getsiglas());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTransaccionModulo tipotransaccionmoduloLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipotransaccionmoduloLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTransaccionModulo tipotransaccionmoduloLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipotransaccionmoduloLocal=this.tipotransaccionmodulo;
			} else {
				tipotransaccionmoduloLocal=this.tipotransaccionmoduloAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipotransaccionmoduloLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(tipotransaccionmoduloLocal,true);
					
					if(tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipotransaccionmoduloLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipotransaccionmoduloLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(tipotransaccionmodulo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(tipotransaccionmodulo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(tipotransaccionmodulo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.getText()==null || this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.getText()=="" || this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.setText("0");
			}

			if(conColumnasBase) {tipotransaccionmodulo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTransaccionModuloConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelIdTipoTransaccionModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotransaccionmodulo.setnombre(this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelnombreTipoTransaccionModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotransaccionmodulo.setsiglas(this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTransaccionModulo.jLabelsiglasTipoTransaccionModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmoduloBean,TipoTransaccionModulo tipotransaccionmodulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipotransaccionmoduloBean.getid_modulo()!=null && !tipotransaccionmoduloBean.getid_modulo().equals(-1L))) {tipotransaccionmodulo.setid_modulo(tipotransaccionmoduloBean.getid_modulo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmoduloOrigen,TipoTransaccionModulo tipotransaccionmodulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotransaccionmoduloOrigen.getId()!=null && !tipotransaccionmoduloOrigen.getId().equals(0L))) {tipotransaccionmodulo.setId(tipotransaccionmoduloOrigen.getId());}}
			if(conDefault || (!conDefault && tipotransaccionmoduloOrigen.getid_modulo()!=null && !tipotransaccionmoduloOrigen.getid_modulo().equals(-1L))) {tipotransaccionmodulo.setid_modulo(tipotransaccionmoduloOrigen.getid_modulo());}
			if(conDefault || (!conDefault && tipotransaccionmoduloOrigen.getnombre()!=null && !tipotransaccionmoduloOrigen.getnombre().equals(""))) {tipotransaccionmodulo.setnombre(tipotransaccionmoduloOrigen.getnombre());}
			if(conDefault || (!conDefault && tipotransaccionmoduloOrigen.getsiglas()!=null && !tipotransaccionmoduloOrigen.getsiglas().equals(""))) {tipotransaccionmodulo.setsiglas(tipotransaccionmoduloOrigen.getsiglas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.setText(tipotransaccionmodulo.getId().toString());
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.setText(tipotransaccionmodulo.getnombre());
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.setText(tipotransaccionmodulo.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTransaccionModulo(TipoTransaccionModuloBean tipotransaccionmoduloBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.setText(tipotransaccionmoduloBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.setText(tipotransaccionmoduloBean.getnombre());
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.setText(tipotransaccionmoduloBean.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTransaccionModulo(TipoTransaccionModuloParameterReturnGeneral tipotransaccionmoduloReturnGeneral,TipoTransaccionModuloBean tipotransaccionmoduloBean,Boolean conDefault) throws Exception { 
		try {
			TipoTransaccionModulo tipotransaccionmoduloLocal=new TipoTransaccionModulo();
			
			tipotransaccionmoduloLocal=tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotransaccionmoduloLocal.getId()!=null && !tipotransaccionmoduloLocal.getId().equals(0L))) {tipotransaccionmoduloBean.setId(tipotransaccionmoduloLocal.getId());}}
			if(conDefault || (!conDefault && tipotransaccionmoduloLocal.getid_modulo()!=null && !tipotransaccionmoduloLocal.getid_modulo().equals(-1L))) {tipotransaccionmoduloBean.setid_modulo(tipotransaccionmoduloLocal.getid_modulo());}
			if(conDefault || (!conDefault && tipotransaccionmoduloLocal.getnombre()!=null && !tipotransaccionmoduloLocal.getnombre().equals(""))) {tipotransaccionmoduloBean.setnombre(tipotransaccionmoduloLocal.getnombre());}
			if(conDefault || (!conDefault && tipotransaccionmoduloLocal.getsiglas()!=null && !tipotransaccionmoduloLocal.getsiglas().equals(""))) {tipotransaccionmoduloBean.setsiglas(tipotransaccionmoduloLocal.getsiglas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTransaccionModuloGenerico(Long idTipoTransaccionModuloSeleccionado,JComboBox jComboBoxTipoTransaccionModulo,List<TipoTransaccionModulo> tipotransaccionmodulosLocal)throws Exception {
		try {
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosLocal) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			jComboBoxTipoTransaccionModulo.setSelectedItem(tipotransaccionmoduloTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTransaccionModuloGenerico(JComboBox jComboBoxTipoTransaccionModulo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTransaccionModulo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTransaccionModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTransaccionModulo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTransaccionModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotransaccionmodulo=(TipoTransaccionModulo) tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotransaccionmodulo =(TipoTransaccionModulo) tipotransaccionmodulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!tipotransaccionmodulo.getIsNew() && !tipotransaccionmodulo.getIsChanged() && !tipotransaccionmodulo.getIsDeleted()) {
				sDescripcion=tipotransaccionmodulo.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=tipotransaccionmodulo.getmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTransaccionModulo tipotransaccionmoduloRow=new TipoTransaccionModulo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotransaccionmoduloRow=(TipoTransaccionModulo) tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotransaccionmoduloRow=(TipoTransaccionModulo) tipotransaccionmodulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTransaccionModulo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo));			
			this.jButtonDuplicarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaDuplicarTipoTransaccionModulo && this.isPermisoDuplicarTipoTransaccionModulo));			
			this.jButtonCopiarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaCopiarTipoTransaccionModulo && this.isPermisoCopiarTipoTransaccionModulo));
			this.jButtonVerFormTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaVerFormTipoTransaccionModulo && this.isPermisoVerFormTipoTransaccionModulo));
			
			this.jButtonAbrirOrderByTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaOrdenTipoTransaccionModulo && this.isPermisoOrdenTipoTransaccionModulo));			
			
			this.jButtonNuevoRelacionesTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo));			
			this.jButtonNuevoGuardarCambiosTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaModificarTipoTransaccionModulo && this.isPermisoActualizarTipoTransaccionModulo));	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaActualizarTipoTransaccionModulo && this.isPermisoActualizarTipoTransaccionModulo));	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaEliminarTipoTransaccionModulo && this.isPermisoEliminarTipoTransaccionModulo));
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarTipoTransaccionModulo.setVisible(this.isVisibilidadCeldaCancelarTipoTransaccionModulo);							
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaGuardarTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo));						
			this.jButtonDuplicarToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaDuplicarTipoTransaccionModulo && this.isPermisoDuplicarTipoTransaccionModulo));						
			this.jButtonCopiarToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaCopiarTipoTransaccionModulo && this.isPermisoCopiarTipoTransaccionModulo));			
			this.jButtonVerFormToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaVerFormTipoTransaccionModulo && this.isPermisoVerFormTipoTransaccionModulo));			
			this.jButtonAbrirOrderByToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaOrdenTipoTransaccionModulo && this.isPermisoOrdenTipoTransaccionModulo));
			this.jButtonNuevoRelacionesToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));			
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaModificarTipoTransaccionModulo && this.isPermisoActualizarTipoTransaccionModulo));	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaActualizarTipoTransaccionModulo  && this.isPermisoActualizarTipoTransaccionModulo));	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaEliminarTipoTransaccionModulo && this.isPermisoEliminarTipoTransaccionModulo));
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarToolBarTipoTransaccionModulo.setVisible(this.isVisibilidadCeldaCancelarTipoTransaccionModulo);				
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaGuardarTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo));			
			this.jMenuItemDuplicarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaDuplicarTipoTransaccionModulo && this.isPermisoDuplicarTipoTransaccionModulo));			
			this.jMenuItemCopiarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaCopiarTipoTransaccionModulo && this.isPermisoCopiarTipoTransaccionModulo));			
			this.jMenuItemVerFormTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaVerFormTipoTransaccionModulo && this.isPermisoVerFormTipoTransaccionModulo));			
			this.jMenuItemAbrirOrderByTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaOrdenTipoTransaccionModulo && this.isPermisoOrdenTipoTransaccionModulo));			
			//this.jMenuItemMostrarOcultarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaOrdenTipoTransaccionModulo && this.isPermisoOrdenTipoTransaccionModulo));
			this.jMenuItemDetalleAbrirOrderByTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaOrdenTipoTransaccionModulo && this.isPermisoOrdenTipoTransaccionModulo));			
			//this.jMenuItemDetalleMostrarOcultarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaOrdenTipoTransaccionModulo && this.isPermisoOrdenTipoTransaccionModulo));			
			this.jMenuItemNuevoRelacionesTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo));			
			this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaNuevoTipoTransaccionModulo && this.isPermisoNuevoTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));									
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemModificarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaModificarTipoTransaccionModulo && this.isPermisoActualizarTipoTransaccionModulo));	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemActualizarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaActualizarTipoTransaccionModulo && this.isPermisoActualizarTipoTransaccionModulo));	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemEliminarTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaEliminarTipoTransaccionModulo && this.isPermisoEliminarTipoTransaccionModulo));
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemCancelarTipoTransaccionModulo.setVisible(this.isVisibilidadCeldaCancelarTipoTransaccionModulo);				
			}
			
			this.jMenuItemGuardarCambiosTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaGuardarTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));						
			this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=this.jButtonNuevoTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTransaccionModulo=this.jButtonDuplicarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaCopiarTipoTransaccionModulo=this.jButtonCopiarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaVerFormTipoTransaccionModulo=this.jButtonVerFormTipoTransaccionModulo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTransaccionModulo=this.jButtonAbrirOrderByTipoTransaccionModulo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=this.jButtonNuevoRelacionesTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=this.jButtonModificarTipoTransaccionModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaGuardarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=this.jButtonGuardarCambiosTablaTipoTransaccionModulo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=this.jButtonNuevoToolBarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=this.jButtonNuevoRelacionesToolBarTipoTransaccionModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarToolBarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarToolBarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarToolBarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarToolBarTipoTransaccionModulo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTransaccionModulo=this.jButtonGuardarCambiosToolBarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=this.jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=this.jMenuItemNuevoTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=this.jMenuItemNuevoRelacionesTipoTransaccionModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemModificarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemActualizarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemEliminarTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemCancelarTipoTransaccionModulo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTransaccionModulo=this.jMenuItemGuardarCambiosTipoTransaccionModulo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTransaccionModulo(Boolean esInicializar) {
		if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
				//if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTransaccionModulo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTransaccionModulo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTransaccionModulo() {
		this.jButtonNuevoTipoTransaccionModulo.setVisible(this.isPermisoNuevoTipoTransaccionModulo);			
		this.jButtonDuplicarTipoTransaccionModulo.setVisible(this.isPermisoDuplicarTipoTransaccionModulo);			
		this.jButtonCopiarTipoTransaccionModulo.setVisible(this.isPermisoCopiarTipoTransaccionModulo);			
		this.jButtonVerFormTipoTransaccionModulo.setVisible(this.isPermisoVerFormTipoTransaccionModulo);			
		
		this.jButtonAbrirOrderByTipoTransaccionModulo.setVisible(this.isPermisoOrdenTipoTransaccionModulo);					
		
		this.jButtonNuevoRelacionesTipoTransaccionModulo.setVisible(this.isPermisoNuevoTipoTransaccionModulo);			
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarTipoTransaccionModulo.setVisible(this.isPermisoActualizarTipoTransaccionModulo);	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarTipoTransaccionModulo.setVisible(this.isPermisoActualizarTipoTransaccionModulo);	
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarTipoTransaccionModulo.setVisible(this.isPermisoEliminarTipoTransaccionModulo);
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarTipoTransaccionModulo.setVisible(this.isVisibilidadCeldaCancelarTipoTransaccionModulo);						
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.setVisible(this.isPermisoGuardarCambiosTipoTransaccionModulo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.setVisible(this.isPermisoActualizarTipoTransaccionModulo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTransaccionModulo() {
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarTipoTransaccionModulo.setVisible(this.isPermisoActualizarTipoTransaccionModulo);	
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarTipoTransaccionModulo.setVisible(this.isPermisoActualizarTipoTransaccionModulo);	
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarTipoTransaccionModulo.setVisible(this.isPermisoEliminarTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarTipoTransaccionModulo.setVisible(this.isVisibilidadCeldaCancelarTipoTransaccionModulo);							
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.setVisible((this.isVisibilidadCeldaGuardarTipoTransaccionModulo && this.isPermisoGuardarCambiosTipoTransaccionModulo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTransaccionModulo() {
		if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTransaccionModulo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTransaccionModulo() {
	}
	
	public void jTableDatosTipoTransaccionModuloListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTransaccionModulo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTransaccionModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.gettipotransaccionmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotransaccionmodulo==null) {
						this.tipotransaccionmodulo = new TipoTransaccionModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
				}

				if(this.tipotransaccionmodulo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipotransaccionmodulo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTransaccionModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTipoTransaccionModuloUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTipoTransaccionModulo(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoTransaccionModulo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoTransaccionModulo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.gettipotransaccionmodulo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.tipotransaccionmoduloLogic.getConnexion());

				if(this.tipotransaccionmodulo.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.tipotransaccionmodulo.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoTransaccionModulo=(TitledBorder)this.jScrollPanelDatosTipoTransaccionModulo.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTipoTransaccionModulo.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTipoTransaccionModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.gettipotransaccionmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotransaccionmodulo==null) {
						this.tipotransaccionmodulo = new TipoTransaccionModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
				}

				if(this.tipotransaccionmodulo.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.tipotransaccionmodulo.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTransaccionModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTransaccionModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.gettipotransaccionmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotransaccionmodulo==null) {
						this.tipotransaccionmodulo = new TipoTransaccionModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
				}

				if(this.tipotransaccionmodulo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipotransaccionmodulo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTransaccionModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasTipoTransaccionModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.gettipotransaccionmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotransaccionmodulo==null) {
						this.tipotransaccionmodulo = new TipoTransaccionModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);
				}

				if(this.tipotransaccionmodulo.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.tipotransaccionmodulo.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTransaccionModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);

			this.getTipoTransaccionModulosBusquedaPorIdModuloPorNombre();

			this.inicializarActualizarBindingTipoTransaccionModulo(false);

			//if(TipoTransaccionModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);

			this.getTipoTransaccionModulosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoTransaccionModulo(false);

			//if(TipoTransaccionModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloTipoTransaccionModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);

			this.getTipoTransaccionModulosFK_IdModulo();

			this.inicializarActualizarBindingTipoTransaccionModulo(false);

			//if(TipoTransaccionModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotransaccionmoduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoTransaccionModulo() {
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.dispose();
			this.jInternalFrameDetalleFormTipoTransaccionModulo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
			this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTransaccionModulo.dispose();
			this.jInternalFrameReporteDinamicoTipoTransaccionModulo=null;
		}
		
		if(this.jInternalFrameImportacionTipoTransaccionModulo!=null) {
			this.jInternalFrameImportacionTipoTransaccionModulo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTransaccionModulo.dispose();
			this.jInternalFrameImportacionTipoTransaccionModulo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTransaccionModulo();
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTransaccionModulo")) {
				jButtonDuplicarTipoTransaccionModuloActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTransaccionModulo")) {
				jButtonCopiarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTransaccionModulo")) {
				jButtonVerFormTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTransaccionModulo")) {
				jButtonDuplicarTipoTransaccionModuloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTransaccionModulo")) {
				jButtonDuplicarTipoTransaccionModuloActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTransaccionModulo")) {
				jButtonModificarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTransaccionModulo")) {
				jButtonModificarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTransaccionModulo")) {
				jButtonModificarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTransaccionModulo")) {
				jButtonActualizarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTransaccionModulo")) {
				jButtonActualizarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTransaccionModulo")) {
				jButtonActualizarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTransaccionModulo")) {
				jButtonEliminarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTransaccionModulo")) {
				jButtonEliminarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTransaccionModulo")) {
				jButtonEliminarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTransaccionModulo")) {
				jButtonCancelarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTransaccionModulo")) {
				jButtonCancelarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTransaccionModulo")) {
				jButtonCancelarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTransaccionModulo")) {
				jButtonCerrarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTransaccionModulo")) {
				jButtonCerrarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTransaccionModulo")) {
				jButtonCerrarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTransaccionModulo")) {
				jButtonMostrarOcultarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTransaccionModulo")) {
				jButtonCancelarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTransaccionModulo")) {
				jButtonCopiarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTransaccionModulo")) {
				jButtonVerFormTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTransaccionModulo")) {
				jButtonCopiarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTransaccionModulo")) {
				jButtonVerFormTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTransaccionModulo")) {
				jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTransaccionModulo")) {
				jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTransaccionModulo")) {
				jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTransaccionModulo")) {
				jButtonAnterioresTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTransaccionModulo")) {
				jButtonAnterioresTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTransaccionModulo")) {
				jButtonAnterioresTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTransaccionModulo")) {
				jButtonSiguientesTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTransaccionModulo")) {
				jButtonSiguientesTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTransaccionModulo")) {
				jButtonSiguientesTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTransaccionModulo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTransaccionModulo")) {
				jButtonAbrirOrderByTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTransaccionModulo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTransaccionModulo")) {
				jButtonMostrarOcultarTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTransaccionModulo")) {
				jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTransaccionModulo")) {
				jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTransaccionModulo")) {
				jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTransaccionModulo")) {
				jButtonCerrarReporteDinamicoTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTransaccionModulo")) {
				jButtonGenerarReporteDinamicoTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTransaccionModulo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTransaccionModulo")) {
				jButtonCerrarImportacionTipoTransaccionModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTransaccionModulo")) {
				
				jButtonGenerarImportacionTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTransaccionModulo")) {
				
				jButtonAbrirImportacionTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTransaccionModulo")) {
				jComboBoxTiposAccionesTipoTransaccionModuloActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTransaccionModulo")) {
				jComboBoxTiposRelacionesTipoTransaccionModuloActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTransaccionModulo")) {
				jComboBoxTiposAccionesTipoTransaccionModuloActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTransaccionModulo")) {
				
				jComboBoxTiposSeleccionarTipoTransaccionModuloActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTransaccionModulo")) {
				jTextFieldValorCampoGeneralTipoTransaccionModuloActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTransaccionModulo")) {
				jButtonAbrirOrderByTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTransaccionModulo")) {
				jButtonAbrirOrderByTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTransaccionModulo")) {
				jButtonCerrarOrderByTipoTransaccionModuloActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTransaccionModuloBusqueda")) {
				this.jButtonidTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoTransaccionModuloUpdate")) {
				this.jButtonid_moduloTipoTransaccionModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoTransaccionModuloBusqueda")) {
				this.jButtonid_moduloTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTransaccionModuloBusqueda")) {
				this.jButtonnombreTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTipoTransaccionModuloBusqueda")) {
				this.jButtonsiglasTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdModuloPorNombreTipoTransaccionModulo")) {
				this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModuloActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoTransaccionModulo")) {
				this.jButtonBusquedaPorNombreTipoTransaccionModuloActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdModuloTipoTransaccionModulo")) {
				this.jButtonFK_IdModuloTipoTransaccionModuloActionPerformed(evt);
			}
			
			;
			
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTransaccionModulo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTransaccionModulo tipotransaccionmoduloLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipotransaccionmoduloLocal=this.tipotransaccionmodulo;
			} else {
				tipotransaccionmoduloLocal=this.tipotransaccionmoduloAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
							
				
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
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
			
			


			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaccionModuloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
								
						
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
								
				
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
							
				
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
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
			
			


			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
								
				
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaccionModuloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTransaccionModulo")) {
					jCheckBoxSeleccionarTodosTipoTransaccionModuloItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTransaccionModulo")) {
					jCheckBoxSeleccionadosTipoTransaccionModuloItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTransaccionModulo")) {
					
				}
				
				


				
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
												
				
				


				
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaccionModuloActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
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
			
			


			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotransaccionmodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotransaccionmodulo);
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
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
				
				


				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTransaccionModulo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTransaccionModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTransaccionModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotransaccionmoduloAnterior =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTransaccionModulo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTransaccionModuloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTransaccionModulo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipotransaccionmodulo =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipotransaccionmodulo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTransaccionModulo")) {
				
				}
				
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTransaccionModulo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTransaccionModulo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTransaccionModulo")) {
			
			}
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTransaccionModulo();
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTransaccionModulo")) {
				jButtonDuplicarTipoTransaccionModuloActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTransaccionModulo")) {
				jButtonCopiarTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTransaccionModulo")) {
				jButtonVerFormTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTransaccionModulo")) {
				jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTransaccionModulo")) {
				jButtonModificarTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTransaccionModulo")) {
				jButtonActualizarTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTransaccionModulo")) {
				jButtonEliminarTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTransaccionModulo")) {
				jButtonCancelarTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTransaccionModulo")) {
				jButtonCerrarTipoTransaccionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTransaccionModulo")) {
				jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTransaccionModulo")) {
				jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTransaccionModulo")) {
				jButtonAbrirOrderByTipoTransaccionModuloActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTransaccionModulo")) {
				jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTransaccionModulo")) {
				jButtonAnterioresTipoTransaccionModuloActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTransaccionModulo")) {
				jButtonSiguientesTipoTransaccionModuloActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTransaccionModuloBusqueda")) {
				this.jButtonidTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoTransaccionModuloUpdate")) {
				this.jButtonid_moduloTipoTransaccionModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoTransaccionModuloBusqueda")) {
				this.jButtonid_moduloTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTransaccionModuloBusqueda")) {
				this.jButtonnombreTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTipoTransaccionModuloBusqueda")) {
				this.jButtonsiglasTipoTransaccionModuloBusquedaActionPerformed(evt);
			}
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTransaccionModulo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTransaccionModulo")) {
				closingInternalFrameTipoTransaccionModulo();
				
			} else if(sTipo.equals("jButtonCancelarTipoTransaccionModulo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTransaccionModulo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTransaccionModuloBeanSwingJInternalFrame jInternalFrameParent=(TipoTransaccionModuloBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTransaccionModulo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTransaccionModuloActionPerformed(null);
			}
			
			TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotransaccionmodulo,new Object(),this.tipotransaccionmoduloParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTransaccionModulo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTransaccionModulo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTransaccionModulo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipotransaccionmodulo)) {
			if(!esControlTabla) {
				if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);			
				}
				
				if(this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotransaccionmoduloReturnGeneral=tipotransaccionmoduloLogic.procesarEventosTipoTransaccionModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransaccionmoduloLogic.getTipoTransaccionModulos(),this.tipotransaccionmodulo,this.tipotransaccionmoduloParameterGeneral,this.isEsNuevoTipoTransaccionModulo,classes);//this.tipotransaccionmoduloLogic.getTipoTransaccionModulo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral,this.tipotransaccionmoduloBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTransaccionModulo(classes,this.tipotransaccionmoduloReturnGeneral,this.tipotransaccionmoduloBean,false);
					}
						
					if(this.tipotransaccionmoduloReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo());	
					}
						
					if(this.tipotransaccionmoduloReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo(),classes);//this.tipotransaccionmoduloBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTransaccionModulo(this.tipotransaccionmodulo,classes);//this.tipotransaccionmoduloBean);									
				}
			
				if(TipoTransaccionModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTransaccionModulo(this.tipotransaccionmodulo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTransaccionModulo(this.tipotransaccionmodulo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipotransaccionmoduloAnterior!=null) {
						this.tipotransaccionmodulo=this.tipotransaccionmoduloAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotransaccionmoduloReturnGeneral=tipotransaccionmoduloLogic.procesarEventosTipoTransaccionModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransaccionmoduloLogic.getTipoTransaccionModulos(),this.tipotransaccionmodulo,this.tipotransaccionmoduloParameterGeneral,this.isEsNuevoTipoTransaccionModulo,classes);//this.tipotransaccionmoduloLogic.getTipoTransaccionModulo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo(),tipotransaccionmoduloLogic.getTipoTransaccionModulos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo(),this.tipotransaccionmodulos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTransaccionModulo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTransaccionModulo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTransaccionModulo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTransaccionModulo() throws Exception {
		
		TipoTransaccionModuloModel tipotransaccionmoduloModel=(TipoTransaccionModuloModel)this.jTableDatosTipoTransaccionModulo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotransaccionmoduloModel.tipotransaccionmodulos=this.tipotransaccionmoduloLogic.getTipoTransaccionModulos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipotransaccionmoduloModel.tipotransaccionmodulos=this.tipotransaccionmodulos;
		}
		
		
		((TipoTransaccionModuloModel) this.jTableDatosTipoTransaccionModulo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTransaccionModulo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipotransaccionmoduloAnterior(),this.tipotransaccionmoduloLogic.getTipoTransaccionModulos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipotransaccionmoduloAnterior(),this.tipotransaccionmodulos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTransaccionModulo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
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
										
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransaccionmodulo,new Object(),generalEntityParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTransaccionModuloConstantesFunciones.getClassesRelationshipsOfTipoTransaccionModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTransaccionModuloConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTransaccionModulo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTransaccionModulo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTransaccionModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotransaccionmodulo,new Object(),generalEntityParameterGeneral,this.tipotransaccionmoduloReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTransaccionModulo(TipoTransaccionModuloBean tipotransaccionmoduloBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTransaccionModulo(ArrayList<Classe> classes,TipoTransaccionModuloReturnGeneral tipotransaccionmoduloReturnGeneral,TipoTransaccionModuloBean tipotransaccionmoduloBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipotransaccionmodulo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo = new TipoTransaccionModuloDetalleFormJInternalFrame(jDesktopPane,this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones(),this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.setVisible(false);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.tipotransaccionmoduloLogic=this.tipotransaccionmoduloLogic;
		
		this.cargarCombosFrameForeignKeyTipoTransaccionModulo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTransaccionModulo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTransaccionModulo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTransaccionModulo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTransaccionModulo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTransaccionModulo"));
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"ModificarTipoTransaccionModulo"));

		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarToolBarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTransaccionModulo"));
					
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemModificarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTransaccionModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"ActualizarTipoTransaccionModulo"));
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarToolBarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTransaccionModulo"));
						
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemActualizarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTransaccionModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"EliminarTipoTransaccionModulo"));
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTransaccionModulo"));
								
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemEliminarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTransaccionModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CancelarTipoTransaccionModulo"));
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTransaccionModulo"));
					
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemCancelarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTransaccionModulo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemDetalleCerrarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTransaccionModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTransaccionModulo"));
		
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTransaccionModulo"));
		
		
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTransaccionModulo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonidTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTransaccionModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonid_moduloTipoTransaccionModuloUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoTransaccionModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonid_moduloTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoTransaccionModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonnombreTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTransaccionModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonsiglasTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoTransaccionModuloBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTransaccionModulo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTransaccionModulo"));
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTransaccionModulo"));
		}
		
		this.jTableDatosTipoTransaccionModulo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTransaccionModulo"));
		
		this.jTableDatosTipoTransaccionModulo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTransaccionModulo"));
		
		this.jButtonNuevoTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"NuevoTipoTransaccionModulo"));
		
		this.jButtonDuplicarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"DuplicarTipoTransaccionModulo"));
		
		this.jButtonCopiarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"CopiarTipoTransaccionModulo"));
		
		this.jButtonVerFormTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"VerFormTipoTransaccionModulo"));
		
		
		this.jButtonNuevoToolBarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTransaccionModulo"));
			
		this.jButtonDuplicarToolBarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTransaccionModulo"));
			
		this.jMenuItemNuevoTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTransaccionModulo"));
			
		this.jMenuItemDuplicarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTransaccionModulo"));		
		
		
		this.jButtonNuevoRelacionesTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTransaccionModulo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTransaccionModulo"));
			
		this.jMenuItemNuevoRelacionesTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTransaccionModulo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"ModificarTipoTransaccionModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonModificarToolBarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTransaccionModulo"));
			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemModificarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTransaccionModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"ActualizarTipoTransaccionModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonActualizarToolBarTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTransaccionModulo"));
				
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemActualizarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTransaccionModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"EliminarTipoTransaccionModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonEliminarToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTransaccionModulo"));
						
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemEliminarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTransaccionModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CancelarTipoTransaccionModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonCancelarToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTransaccionModulo"));
			
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemCancelarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTransaccionModulo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTransaccionModulo"));		
		
		
		this.jButtonCerrarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CerrarTipoTransaccionModulo"));
		
		
		this.jButtonCerrarToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTransaccionModulo"));
			
		this.jMenuItemCerrarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTransaccionModulo"));
			
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jMenuItemDetalleCerrarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTransaccionModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTransaccionModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTransaccionModulo"));
		}
		
		this.jButtonCopiarToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTransaccionModulo"));
			
		this.jButtonVerFormToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTransaccionModulo"));
		
		this.jMenuItemGuardarCambiosTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTransaccionModulo"));
			
		this.jMenuItemCopiarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTransaccionModulo"));		
		
		this.jMenuItemVerFormTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTransaccionModulo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTransaccionModulo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTransaccionModulo"));
			
		this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTransaccionModulo"));		
		
		
		
		this.jButtonRecargarInformacionTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTransaccionModulo"));
					
		this.jButtonRecargarInformacionToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTransaccionModulo"));
		
		this.jMenuItemRecargarInformacionTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTransaccionModulo"));		
		
		
		
		this.jButtonAnterioresTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"AnterioresTipoTransaccionModulo"));
		
		
		this.jButtonAnterioresToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTransaccionModulo"));
		
		this.jMenuItemAnterioresTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTransaccionModulo"));		
		
		
		this.jButtonSiguientesTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"SiguientesTipoTransaccionModulo"));
		
		
		this.jButtonSiguientesToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTransaccionModulo"));
			
		this.jMenuItemSiguientesTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTransaccionModulo"));
			
		this.jMenuItemAbrirOrderByTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTransaccionModulo"));
			
		this.jMenuItemMostrarOcultarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTransaccionModulo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTransaccionModulo"));
			
		this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTransaccionModulo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTransaccionModulo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTransaccionModulo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTransaccionModulo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTransaccionModulo"));

		this.jCheckBoxSeleccionadosTipoTransaccionModulo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTransaccionModulo"));
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTransaccionModulo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTransaccionModulo"));
			
		this.jComboBoxTiposAccionesTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTransaccionModulo"));
					
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTransaccionModulo"));
			
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTransaccionModulo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonidTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTransaccionModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonid_moduloTipoTransaccionModuloUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoTransaccionModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonid_moduloTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoTransaccionModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonnombreTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTransaccionModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonsiglasTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoTransaccionModuloBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorNombreTipoTransaccionModulo"));

			this.jButtonBusquedaPorNombreTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoTransaccionModulo"));

			this.jButtonFK_IdModuloTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoTransaccionModulo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTransaccionModulo!=null) {
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTransaccionModulo"));
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTransaccionModulo"));
				this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTransaccionModulo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTransaccionModulo"));				
			//this.jButtonGenerarReporteDinamicoTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTransaccionModulo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTransaccionModulo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTransaccionModulo!=null) {
				this.jInternalFrameImportacionTipoTransaccionModulo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTransaccionModulo"));
				this.jInternalFrameImportacionTipoTransaccionModulo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTransaccionModulo"));
				this.jInternalFrameImportacionTipoTransaccionModulo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTransaccionModulo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTransaccionModulo"));
			
			this.jButtonAbrirOrderByToolBarTipoTransaccionModulo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTransaccionModulo"));			
			
			if(this.jInternalFrameOrderByTipoTransaccionModulo!=null) {
				this.jInternalFrameOrderByTipoTransaccionModulo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTransaccionModulo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTransaccionModulo.jTabbedPaneRelacionesTipoTransaccionModulo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTransaccionModulo"));
		
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
            		closingInternalFrameTipoTransaccionModulo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTransaccionModulo = (JInternalFrameBase)event.getSource();
	            	
	            TipoTransaccionModuloBeanSwingJInternalFrame jInternalFrameParent=(TipoTransaccionModuloBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTransaccionModulo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTransaccionModuloActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTransaccionModulo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTransaccionModuloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTransaccionModulo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTransaccionModulo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTransaccionModulo";
		inputMap = this.jButtonNuevoTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTransaccionModulo";
		inputMap = this.jButtonNuevoRelacionesTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTransaccionModuloActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTransaccionModulo";
		inputMap = this.jButtonModificarTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTransaccionModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTransaccionModulo";
		inputMap = this.jButtonActualizarTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTransaccionModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTransaccionModulo";
		inputMap = this.jButtonEliminarTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTransaccionModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTransaccionModulo";
		inputMap = this.jButtonCancelarTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTransaccionModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTransaccionModulo";
		inputMap = this.jButtonCerrarTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTransaccionModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTransaccionModulo";
		inputMap = this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonGuardarCambiosTipoTransaccionModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTransaccionModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTransaccionModuloItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTransaccionModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTransaccionModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTransaccionModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTransaccionModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonidTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTransaccionModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonid_moduloTipoTransaccionModuloUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoTransaccionModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonid_moduloTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoTransaccionModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonnombreTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTransaccionModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jButtonsiglasTipoTransaccionModuloBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoTransaccionModuloBusqueda"));
		
		
		this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorNombreTipoTransaccionModulo"));

		this.jButtonBusquedaPorNombreTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoTransaccionModulo"));

		this.jButtonFK_IdModuloTipoTransaccionModulo.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoTransaccionModulo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTransaccionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTransaccionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTransaccionModuloActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTransaccionModulo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTransaccionModulo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
					tipotransaccionmoduloAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulos) {
					tipotransaccionmoduloAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTransaccionModuloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
						tipotransaccionmoduloAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulos) {
						tipotransaccionmoduloAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTransaccionModulo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTransaccionModulo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTransaccionModuloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTransaccionModulo.getSelectedRows();
			
			TipoTransaccionModulo tipotransaccionmoduloLocal=new TipoTransaccionModulo();
			
			//this.seleccionarTodosTipoTransaccionModulo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLocal =(TipoTransaccionModulo) this.tipotransaccionmoduloLogic.getTipoTransaccionModulos().toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipotransaccionmoduloLocal =(TipoTransaccionModulo) this.tipotransaccionmodulos.toArray()[this.jTableDatosTipoTransaccionModulo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipotransaccionmoduloLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
						tipotransaccionmoduloAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulos) {
						tipotransaccionmoduloAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTransaccionModulo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTransaccionModulo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTransaccionModulo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTransaccionModuloItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTransaccionModuloParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTransaccionModuloActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTransaccionModulo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
				
						if(sTipoSeleccionar.equals(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotransaccionmoduloAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tipotransaccionmoduloAux.setsiglas(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulos) {
					
						if(sTipoSeleccionar.equals(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotransaccionmoduloAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tipotransaccionmoduloAux.setsiglas(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTransaccionModuloActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTransaccionModulo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTransaccionModulo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTransaccionModulo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTransaccionModulo(conSplash);
				
					this.generarReporteTipoTransaccionModulosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTransaccionModulosSeleccionados();
				//this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTransaccionModulosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTransaccionModulosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTransaccionModulo();
				
				this.exportarTipoTransaccionModulosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTransaccionModulos();
				//this.importarTipoTransaccionModulos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTransaccionModulo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTransaccionModulosSeleccionados();
				//this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Transaccion Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTransaccionModulo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTransaccionModulo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTransaccionModulo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoTransaccionModuloBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoTransaccionModulo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoTransaccionModulo(conSplash);
					
						//this.actualizarParametrosGeneralTipoTransaccionModulo();
						
						this.generarReporteProcesoAccionTipoTransaccionModulosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoTransaccionModuloBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Transaccion ModuloS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Transaccion Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoTransaccionModulo();
				
						this.actualizarParametrosGeneralTipoTransaccionModulo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipotransaccionmoduloReturnGeneral=tipotransaccionmoduloLogic.procesarAccionTipoTransaccionModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipotransaccionmoduloLogic.getTipoTransaccionModulos(),this.tipotransaccionmoduloParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoTransaccionModuloReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTransaccionModulo();
					
					TipoTransaccionModuloBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoTransaccionModuloReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoTransaccionModulo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTransaccionModulo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTransaccionModuloActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTransaccionModulo();
			
			if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
			TipoTransaccionModulo tipotransaccionmodulo=new TipoTransaccionModulo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTransaccionModulo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTransaccionModulo.getSelectedItem();
			
			
			
			
			tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipotransaccionmodulosSeleccionados.size()==1) {
				for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosSeleccionados) {
					tipotransaccionmodulo=tipotransaccionmoduloAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTransaccionModulo();
			
      		//this.finishProcessTipoTransaccionModulo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTransaccionModuloReturnGeneral() throws Exception {
		if(this.tipotransaccionmoduloReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipotransaccionmoduloReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipotransaccionmoduloReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipotransaccionmoduloReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipotransaccionmoduloReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipotransaccionmoduloReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTransaccionModulo(false);
		}
		
		if(this.tipotransaccionmoduloReturnGeneral.getConRetornoLista() || this.tipotransaccionmoduloReturnGeneral.getConRetornoObjeto()) {
			if(this.tipotransaccionmoduloReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotransaccionmoduloLogic.setTipoTransaccionModulos(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipotransaccionmoduloReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotransaccionmoduloLogic.setTipoTransaccionModulo(this.tipotransaccionmoduloReturnGeneral.getTipoTransaccionModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTransaccionModulo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTransaccionModulo() throws Exception {
		
		
	}
	
	public ArrayList<TipoTransaccionModulo> getTipoTransaccionModulosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTransaccionModulo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmoduloLogic.getTipoTransaccionModulos()) {
					if(tipotransaccionmoduloAux.getIsSelected()) {
						tipotransaccionmodulosSeleccionados.add(tipotransaccionmoduloAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTransaccionModulo tipotransaccionmoduloAux:this.tipotransaccionmodulos) {
					if(tipotransaccionmoduloAux.getIsSelected()) {
						tipotransaccionmodulosSeleccionados.add(tipotransaccionmoduloAux);				
					}
				}
			}
			
			if(tipotransaccionmodulosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipotransaccionmodulosSeleccionados.addAll(this.tipotransaccionmoduloLogic.getTipoTransaccionModulos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipotransaccionmodulosSeleccionados.addAll(this.tipotransaccionmodulos);				
					}
				}
			}
		} else {
			tipotransaccionmodulosSeleccionados.add(this.tipotransaccionmodulo);
		}
		
		return tipotransaccionmodulosSeleccionados;
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
	
	public void generarReporteTipoTransaccionModulosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTransaccionModulosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTransaccionModulosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTransaccionModulosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTransaccionModulosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Transaccion Modulo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTransaccionModulosSeleccionados() throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmodulosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTransaccionModulosSeleccionados() throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmodulosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTransaccionModulosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmodulosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTransaccionModulosSeleccionados() throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTransaccionModulo();
		
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTransaccionModulo();
		
		
		//this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmodulosSeleccionados ,tipotransaccionmoduloImplementable,tipotransaccionmoduloImplementableHome);
	}
	
	public void mostrarImportacionTipoTransaccionModulos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTransaccionModulo();
		
		this.abrirFrameImportacionTipoTransaccionModulo();		
		
			
		//this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmodulosSeleccionados ,tipotransaccionmoduloImplementable,tipotransaccionmoduloImplementableHome);
	}
	
	public void importarTipoTransaccionModulos() throws Exception {		
	
	}
	
	public void exportarTipoTransaccionModulosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTransaccionModulosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTransaccionModulosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTransaccionModulosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Transaccion Modulo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTransaccionModulosSeleccionados() throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransaccionmodulo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTransaccionModulo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTransaccionModulo(tipotransaccionmoduloAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipotransaccionmoduloAux.setsDetalleGeneralEntityReporte(tipotransaccionmoduloAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTransaccionModulo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTransaccionModuloConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTransaccionModuloConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipotransaccionmodulo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotransaccionmodulo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotransaccionmodulo.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotransaccionmodulo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotransaccionmodulo.getsiglas();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTransaccionModulosSeleccionados() throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransaccionmodulo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTransaccionModulos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTransaccionModulo(row);				
				iRow++;
			}				
			
			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTransaccionModulo(tipotransaccionmoduloAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTransaccionModulosSeleccionados() throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();		
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotransaccionmodulo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipotransaccionmodulos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipotransaccionmodulo");
			//elementRoot.appendChild(element);
		
			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosSeleccionados) {
				element = document.createElement("tipotransaccionmodulo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTransaccionModulo(tipotransaccionmoduloAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Transaccion Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTransaccionModulo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipotransaccionmodulo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotransaccionmodulo.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotransaccionmodulo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotransaccionmodulo.getsiglas());				
	}
	
	public void setFilaDatosExportarXmlTipoTransaccionModulo(TipoTransaccionModulo tipotransaccionmodulo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTransaccionModuloConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipotransaccionmodulo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTransaccionModuloConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipotransaccionmodulo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmodulo_descripcion = document.createElement(TipoTransaccionModuloConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(tipotransaccionmodulo.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementnombre = document.createElement(TipoTransaccionModuloConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipotransaccionmodulo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(TipoTransaccionModuloConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(tipotransaccionmodulo.getsiglas().trim()));
		element.appendChild(elementsiglas);
	}
	
	public void generarReporteGroupGenericoTipoTransaccionModulosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados=new ArrayList<TipoTransaccionModulo>();
		
		tipotransaccionmodulosSeleccionados=this.getTipoTransaccionModulosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTransaccionModulo(tipotransaccionmodulosSeleccionados);
		
		this.generarReporteTipoTransaccionModulos("Todos",tipotransaccionmodulosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTransaccionModulo(ArrayList<TipoTransaccionModulo> tipotransaccionmodulosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosSeleccionados) {
				tipotransaccionmoduloAux.setsDetalleGeneralEntityReporte(tipotransaccionmoduloAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					tipotransaccionmoduloAux.setsDescripcionGeneralEntityReporte1(tipotransaccionmoduloAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipotransaccionmoduloAux.setsDescripcionGeneralEntityReporte1(tipotransaccionmoduloAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					tipotransaccionmoduloAux.setsDescripcionGeneralEntityReporte1(tipotransaccionmoduloAux.getsiglas());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTransaccionModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTransaccionModulo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTransaccionModulo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=true;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=true;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=true;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=true;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=true;
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;
			this.isVisibilidadCeldaModificarTipoTransaccionModulo=true;
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaCancelarTipoTransaccionModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTransaccionModulo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=true;
		} else {
			this.actualizarEstadoPanelsTipoTransaccionModulo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTransaccionModulo=false;
			//this.isVisibilidadCeldaVerFormTipoTransaccionModulo=false;
			this.isVisibilidadCeldaDuplicarTipoTransaccionModulo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTransaccionModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTransaccionModulo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			if(!tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;												
			}
			
			this.jButtonCerrarTipoTransaccionModulo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTransaccionModulo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipotransaccionmodulo)) {
			this.isVisibilidadCeldaActualizarTipoTransaccionModulo=false;
			this.isVisibilidadCeldaEliminarTipoTransaccionModulo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTransaccionModulo() {
	}
	
	public void actualizarEstadoPanelsTipoTransaccionModulo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosEdicionTipoTransaccionModulo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransaccionModulo!=null) {
				this.jPanelPaginacionTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosEdicionTipoTransaccionModulo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosTipoTransaccionModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTransaccionModulo!=null) {
				this.jPanelPaginacionTipoTransaccionModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosEdicionTipoTransaccionModulo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosTipoTransaccionModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTransaccionModulo!=null) {
				this.jPanelPaginacionTipoTransaccionModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosEdicionTipoTransaccionModulo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosTipoTransaccionModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTransaccionModulo!=null) {
				this.jPanelPaginacionTipoTransaccionModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosEdicionTipoTransaccionModulo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransaccionModulo!=null) {
				this.jPanelPaginacionTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosEdicionTipoTransaccionModulo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransaccionModulo!=null) {
				this.jPanelPaginacionTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosEdicionTipoTransaccionModulo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTransaccionModulo!=null) {
				this.jScrollPanelDatosTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTransaccionModulo!=null) {
				this.jPanelPaginacionTipoTransaccionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
					this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTransaccionModulo!=null) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoTransaccionModulo!=null) {
				this.jPanelParametrosReportesTipoTransaccionModulo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorIdModuloPorNombre=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorNombre) {this.jTabbedPaneBusquedasTipoTransaccionModulo.remove(jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo);}

			this.isVisibilidadBusquedaPorNombre=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoTransaccionModulo.remove(jPanelBusquedaPorNombreTipoTransaccionModulo);}

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoTransaccionModulo.remove(jPanelFK_IdModuloTipoTransaccionModulo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
		
		if(this.tipotransaccionmoduloSessionBean==null) {
			this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
		}
		
		this.tipotransaccionmoduloSessionBean.setsUltimaBusquedaTipoTransaccionModulo(this.getsAccionBusqueda());
		this.tipotransaccionmoduloSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipotransaccionmoduloSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorNombre")) {
			tipotransaccionmoduloSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdModuloPorNombre());	
			tipotransaccionmoduloSessionBean.setnombre(this.getnombreBusquedaPorIdModuloPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipotransaccionmoduloSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			tipotransaccionmoduloSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
		
		if(this.tipotransaccionmoduloSessionBean==null) {
			this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
		}
		
		if(this.tipotransaccionmoduloSessionBean.getsUltimaBusquedaTipoTransaccionModulo()!=null&&!this.tipotransaccionmoduloSessionBean.getsUltimaBusquedaTipoTransaccionModulo().equals("")) {
			this.setsAccionBusqueda(tipotransaccionmoduloSessionBean.getsUltimaBusquedaTipoTransaccionModulo());
			this.setiNumeroPaginacion(tipotransaccionmoduloSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipotransaccionmoduloSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorNombre")) {
				this.setid_moduloBusquedaPorIdModuloPorNombre(tipotransaccionmoduloSessionBean.getid_modulo());
				tipotransaccionmoduloSessionBean.setid_modulo(-1L);
				this.setnombreBusquedaPorIdModuloPorNombre(tipotransaccionmoduloSessionBean.getnombre());
				tipotransaccionmoduloSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipotransaccionmoduloSessionBean.getnombre());
				tipotransaccionmoduloSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(tipotransaccionmoduloSessionBean.getid_modulo());
				tipotransaccionmoduloSessionBean.setid_modulo(-1L);
			}
		}
		
		this.tipotransaccionmoduloSessionBean.setsUltimaBusquedaTipoTransaccionModulo("");
		this.tipotransaccionmoduloSessionBean.setiNumeroPaginacion(TipoTransaccionModuloConstantesFunciones.INUMEROPAGINACION);
		this.tipotransaccionmoduloSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTransaccionModulo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTransaccionModulo() {
		this.updateBorderResaltarBusquedasFormularioTipoTransaccionModulo();
		this.updateVisibilidadBusquedasFormularioTipoTransaccionModulo();
		this.updateHabilitarBusquedasFormularioTipoTransaccionModulo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTransaccionModulo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponents().length>0) {
	

		if(this.tipotransaccionmoduloConstantesFunciones.resaltarBusquedaPorIdModuloPorNombreTipoTransaccionModulo!=null) {
			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
				jPanel.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
			}
		}

		if(this.tipotransaccionmoduloConstantesFunciones.resaltarBusquedaPorNombreTipoTransaccionModulo!=null) {
			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoTransaccionModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
				jPanel.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarBusquedaPorNombreTipoTransaccionModulo);
			}
		}

		if(this.tipotransaccionmoduloConstantesFunciones.resaltarFK_IdModuloTipoTransaccionModulo!=null) {
			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelFK_IdModuloTipoTransaccionModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
				jPanel.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarFK_IdModuloTipoTransaccionModulo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTransaccionModulo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
			if(!this.tipotransaccionmoduloConstantesFunciones.mostrarBusquedaPorIdModuloPorNombreTipoTransaccionModulo && index>-1) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoTransaccionModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarBusquedaPorNombreTipoTransaccionModulo);
			if(!this.tipotransaccionmoduloConstantesFunciones.mostrarBusquedaPorNombreTipoTransaccionModulo && index>-1) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelFK_IdModuloTipoTransaccionModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarFK_IdModuloTipoTransaccionModulo);
			if(!this.tipotransaccionmoduloConstantesFunciones.mostrarFK_IdModuloTipoTransaccionModulo && index>-1) {
				this.jTabbedPaneBusquedasTipoTransaccionModulo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoTransaccionModulo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotransaccionmoduloConstantesFunciones.activarBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setEnabledAt(index,this.tipotransaccionmoduloConstantesFunciones.activarBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
			}

			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoTransaccionModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotransaccionmoduloConstantesFunciones.activarBusquedaPorNombreTipoTransaccionModulo);
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setEnabledAt(index,this.tipotransaccionmoduloConstantesFunciones.activarBusquedaPorNombreTipoTransaccionModulo);
			}

			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelFK_IdModuloTipoTransaccionModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotransaccionmoduloConstantesFunciones.activarFK_IdModuloTipoTransaccionModulo);
				this.jTabbedPaneBusquedasTipoTransaccionModulo.setEnabledAt(index,this.tipotransaccionmoduloConstantesFunciones.activarFK_IdModuloTipoTransaccionModulo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoTransaccionModulo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdModuloPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo);

			this.jTabbedPaneBusquedasTipoTransaccionModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);

			this.tipotransaccionmoduloConstantesFunciones.setResaltarBusquedaPorIdModuloPorNombreTipoTransaccionModulo(resaltar);

			jPanel.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoTransaccionModulo);

			this.jTabbedPaneBusquedasTipoTransaccionModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);

			this.tipotransaccionmoduloConstantesFunciones.setResaltarBusquedaPorNombreTipoTransaccionModulo(resaltar);

			jPanel.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarBusquedaPorNombreTipoTransaccionModulo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasTipoTransaccionModulo.indexOfComponent(this.jPanelFK_IdModuloTipoTransaccionModulo);

			this.jTabbedPaneBusquedasTipoTransaccionModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTransaccionModulo.getComponent(index);

			this.tipotransaccionmoduloConstantesFunciones.setResaltarFK_IdModuloTipoTransaccionModulo(resaltar);

			jPanel.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarFK_IdModuloTipoTransaccionModulo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoTransaccionModulo.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioTipoTransaccionModulo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTransaccionModulo();
		this.updateVisibilidadResaltarControlesFormularioTipoTransaccionModulo();
		this.updateHabilitarResaltarControlesFormularioTipoTransaccionModulo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTransaccionModulo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipotransaccionmoduloConstantesFunciones.resaltaridTipoTransaccionModulo!=null && this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltaridTipoTransaccionModulo);}
		if(this.tipotransaccionmoduloConstantesFunciones.resaltarid_moduloTipoTransaccionModulo!=null && this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarid_moduloTipoTransaccionModulo);}
		if(this.tipotransaccionmoduloConstantesFunciones.resaltarnombreTipoTransaccionModulo!=null && this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarnombreTipoTransaccionModulo);}
		if(this.tipotransaccionmoduloConstantesFunciones.resaltarsiglasTipoTransaccionModulo!=null && this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.setBorder(this.tipotransaccionmoduloConstantesFunciones.resaltarsiglasTipoTransaccionModulo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTransaccionModulo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
	
		//this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostraridTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelidTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostraridTipoTransaccionModulo);
		//this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarid_moduloTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelid_moduloTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarid_moduloTipoTransaccionModulo);
		//this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarnombreTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelnombreTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarnombreTipoTransaccionModulo);
		//this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarsiglasTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jPanelsiglasTipoTransaccionModulo.setVisible(this.tipotransaccionmoduloConstantesFunciones.mostrarsiglasTipoTransaccionModulo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTransaccionModulo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTransaccionModulo!=null) {
	
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldidTipoTransaccionModulo.setEnabled(this.tipotransaccionmoduloConstantesFunciones.activaridTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jComboBoxid_moduloTipoTransaccionModulo.setEnabled(this.tipotransaccionmoduloConstantesFunciones.activarid_moduloTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextAreanombreTipoTransaccionModulo.setEnabled(this.tipotransaccionmoduloConstantesFunciones.activarnombreTipoTransaccionModulo);
		this.jInternalFrameDetalleFormTipoTransaccionModulo.jTextFieldsiglasTipoTransaccionModulo.setEnabled(this.tipotransaccionmoduloConstantesFunciones.activarsiglasTipoTransaccionModulo);
		}
	}
	
		
}