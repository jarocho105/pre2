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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.sris.util.FacturacionesPorDiariosConstantesFunciones;
import com.bydan.erp.sris.util.report.FacturacionesPorDiariosParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.FacturacionesPorDiariosParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.FacturacionesPorDiariosBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FacturacionesPorDiariosBeanSwingJInternalFrame extends FacturacionesPorDiariosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturacionesPorDiariosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturacionesPorDiarios> facturacionespordiariosValidator = new ClassValidator<FacturacionesPorDiarios>(FacturacionesPorDiarios.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturacionesPorDiarios facturacionespordiarios;	
	public FacturacionesPorDiarios facturacionespordiariosAux;
	public FacturacionesPorDiarios facturacionespordiariosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturacionesPorDiarios facturacionespordiariosTotales;
	public Long idFacturacionesPorDiariosActual;
	public Long iIdNuevoFacturacionesPorDiarios=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
	}

	public String sFinalQueryComboTipoTransaccionModulo="";

	public List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey;

	public List<TipoTransaccionModulo> gettipotransaccionmodulosForeignKey() {
		return tipotransaccionmodulosForeignKey;
	}

	public void settipotransaccionmodulosForeignKey(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey) {
		this.tipotransaccionmodulosForeignKey = tipotransaccionmodulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTransaccionModulo tipotransaccionmoduloForeignKey;

	public TipoTransaccionModulo gettipotransaccionmoduloForeignKey() {
		return tipotransaccionmoduloForeignKey;
	}

	public void settipotransaccionmoduloForeignKey(TipoTransaccionModulo tipotransaccionmoduloForeignKey) {
		this.tipotransaccionmoduloForeignKey = tipotransaccionmoduloForeignKey;
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
	
	public Boolean isPermisoTodoFacturacionesPorDiarios;
	public Boolean isPermisoNuevoFacturacionesPorDiarios;
	public Boolean isPermisoActualizarFacturacionesPorDiarios;
	public Boolean isPermisoActualizarOriginalFacturacionesPorDiarios;
	public Boolean isPermisoEliminarFacturacionesPorDiarios;
	public Boolean isPermisoGuardarCambiosFacturacionesPorDiarios;
	public Boolean isPermisoConsultaFacturacionesPorDiarios;
	public Boolean isPermisoBusquedaFacturacionesPorDiarios;
	public Boolean isPermisoReporteFacturacionesPorDiarios;
	public Boolean isPermisoPaginacionMedioFacturacionesPorDiarios;
	public Boolean isPermisoPaginacionAltoFacturacionesPorDiarios;
	public Boolean isPermisoPaginacionTodoFacturacionesPorDiarios;
	public Boolean isPermisoCopiarFacturacionesPorDiarios;
	public Boolean isPermisoVerFormFacturacionesPorDiarios;
	public Boolean isPermisoDuplicarFacturacionesPorDiarios;
	public Boolean isPermisoOrdenFacturacionesPorDiarios;
	
	
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
	
	public FacturacionesPorDiariosParameterReturnGeneral facturacionespordiariosReturnGeneral;
	public FacturacionesPorDiariosParameterReturnGeneral facturacionespordiariosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturacionesPorDiarios=false;
	public Boolean esParaAccionDesdeFormularioFacturacionesPorDiarios=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturacionesPorDiariosSessionBeanAdditional facturacionespordiariosSessionBeanAdditional=null;
	
	public FacturacionesPorDiariosSessionBeanAdditional getFacturacionesPorDiariosSessionBeanAdditional() {
		return this.facturacionespordiariosSessionBeanAdditional;
	}
	
	public void setFacturacionesPorDiariosSessionBeanAdditional(FacturacionesPorDiariosSessionBeanAdditional facturacionespordiariosSessionBeanAdditional) {
		try {
			this.facturacionespordiariosSessionBeanAdditional=facturacionespordiariosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturacionesPorDiariosBeanSwingJInternalFrameAdditional facturacionespordiariosBeanSwingJInternalFrameAdditional=null;
	//public class FacturacionesPorDiariosBeanSwingJInternalFrame
	
	public FacturacionesPorDiariosBeanSwingJInternalFrameAdditional getFacturacionesPorDiariosBeanSwingJInternalFrameAdditional() {
		return this.facturacionespordiariosBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturacionesPorDiariosBeanSwingJInternalFrameAdditional(FacturacionesPorDiariosBeanSwingJInternalFrameAdditional facturacionespordiariosBeanSwingJInternalFrameAdditional) {
		try {
			this.facturacionespordiariosBeanSwingJInternalFrameAdditional=facturacionespordiariosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturacionesPorDiariosLogic facturacionespordiariosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturacionesPorDiarios facturacionespordiariosBean;
	public FacturacionesPorDiariosConstantesFunciones facturacionespordiariosConstantesFunciones;
	//public FacturacionesPorDiariosParameterReturnGeneral facturacionespordiariosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TransaccionLogic transaccionLogic;
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	
	//PARAMETROS
	
	
	//public List<FacturacionesPorDiarios> facturacionespordiarioss;	
	//public List<FacturacionesPorDiarios> facturacionespordiariossEliminados;
	//public List<FacturacionesPorDiarios> facturacionespordiariossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
	public Boolean isVisibilidadCeldaDuplicarFacturacionesPorDiarios=true;
	public Boolean isVisibilidadCeldaCopiarFacturacionesPorDiarios=true;
	public Boolean isVisibilidadCeldaVerFormFacturacionesPorDiarios=true;
	public Boolean isVisibilidadCeldaOrdenFacturacionesPorDiarios=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
	public Boolean isVisibilidadCeldaModificarFacturacionesPorDiarios=false;
	public Boolean isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
	public Boolean isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
	public Boolean isVisibilidadCeldaCancelarFacturacionesPorDiarios=false;
	public Boolean isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;	
	
	
	public Boolean isVisibilidadBusquedaFacturacionesPorDiarios=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoTransaccionModulo=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoFacturacionesPorDiarios() {
		return this.iIdNuevoFacturacionesPorDiarios;
	}

	public void setiIdNuevoFacturacionesPorDiarios(Long iIdNuevoFacturacionesPorDiarios) {
		this.iIdNuevoFacturacionesPorDiarios = iIdNuevoFacturacionesPorDiarios;
	}
	
	public Long getidFacturacionesPorDiariosActual() {
		return this.idFacturacionesPorDiariosActual;
	}

	public void setidFacturacionesPorDiariosActual(Long idFacturacionesPorDiariosActual) {
		this.idFacturacionesPorDiariosActual = idFacturacionesPorDiariosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturacionesPorDiarios getfacturacionespordiarios() {
		return this.facturacionespordiarios;
	}

	public void setfacturacionespordiarios(FacturacionesPorDiarios facturacionespordiarios) {
		this.facturacionespordiarios = facturacionespordiarios;
	}
	
	public FacturacionesPorDiarios getfacturacionespordiariosAux() {
		return this.facturacionespordiariosAux;
	}

	public void setfacturacionespordiariosAux(FacturacionesPorDiarios facturacionespordiariosAux) {
		this.facturacionespordiariosAux = facturacionespordiariosAux;
	}				
	
	public FacturacionesPorDiarios getfacturacionespordiariosAnterior() {
		return this.facturacionespordiariosAnterior;
	}

	public void setfacturacionespordiariosAnterior(FacturacionesPorDiarios facturacionespordiariosAnterior) {
		this.facturacionespordiariosAnterior = facturacionespordiariosAnterior;
	}	
	
	public FacturacionesPorDiarios getfacturacionespordiariosTotales() {
		return this.facturacionespordiariosTotales;
	}

	public void setfacturacionespordiariosTotales(FacturacionesPorDiarios facturacionespordiariosTotales) {
		this.facturacionespordiariosTotales = facturacionespordiariosTotales;
	}	
	
	public FacturacionesPorDiarios getfacturacionespordiariosBean() {
		return this.facturacionespordiariosBean;
	}

	public void setfacturacionespordiariosBean(FacturacionesPorDiarios facturacionespordiariosBean) {
		this.facturacionespordiariosBean = facturacionespordiariosBean;
	}	
	
	public FacturacionesPorDiariosParameterReturnGeneral getfacturacionespordiariosReturnGeneral() {
		return this.facturacionespordiariosReturnGeneral;
	}

	public void setfacturacionespordiariosReturnGeneral(FacturacionesPorDiariosParameterReturnGeneral facturacionespordiariosReturnGeneral) {
		this.facturacionespordiariosReturnGeneral = facturacionespordiariosReturnGeneral;
	}	
	
	
	public Long id_transaccionBusquedaFacturacionesPorDiarios=-1L;

	public Long getid_transaccionBusquedaFacturacionesPorDiarios() {
		return this.id_transaccionBusquedaFacturacionesPorDiarios;
	}

	public void setid_transaccionBusquedaFacturacionesPorDiarios(Long id_transaccionBusquedaFacturacionesPorDiarios) {
		this.id_transaccionBusquedaFacturacionesPorDiarios = id_transaccionBusquedaFacturacionesPorDiarios;
	}

;
	public Date fecha_emision_desdeBusquedaFacturacionesPorDiarios=new Date();

	public Date getfecha_emision_desdeBusquedaFacturacionesPorDiarios() {
		return this.fecha_emision_desdeBusquedaFacturacionesPorDiarios;
	}

	public void setfecha_emision_desdeBusquedaFacturacionesPorDiarios(Date fecha_emision_desdeBusquedaFacturacionesPorDiarios) {
		this.fecha_emision_desdeBusquedaFacturacionesPorDiarios = fecha_emision_desdeBusquedaFacturacionesPorDiarios;
	}

;
	public Date fecha_emision_hastaBusquedaFacturacionesPorDiarios=new Date();

	public Date getfecha_emision_hastaBusquedaFacturacionesPorDiarios() {
		return this.fecha_emision_hastaBusquedaFacturacionesPorDiarios;
	}

	public void setfecha_emision_hastaBusquedaFacturacionesPorDiarios(Date fecha_emision_hastaBusquedaFacturacionesPorDiarios) {
		this.fecha_emision_hastaBusquedaFacturacionesPorDiarios = fecha_emision_hastaBusquedaFacturacionesPorDiarios;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo=-1L;

	public Long getid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo() {
		return this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public void setid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo(Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo) {
		this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo = id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FacturacionesPorDiariosLogic getFacturacionesPorDiariosLogic()	{		
		return facturacionespordiariosLogic;
	}

	public void setFacturacionesPorDiariosLogic(FacturacionesPorDiariosLogic facturacionespordiariosLogic) {
		this.facturacionespordiariosLogic = facturacionespordiariosLogic;
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
	
	public Boolean getIsEsNuevoFacturacionesPorDiarios() {
		return isEsNuevoFacturacionesPorDiarios;
	}

	public void setIsEsNuevoFacturacionesPorDiarios(Boolean isEsNuevoFacturacionesPorDiarios) {
		this.isEsNuevoFacturacionesPorDiarios = isEsNuevoFacturacionesPorDiarios;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturacionesPorDiarios() {
		return esParaAccionDesdeFormularioFacturacionesPorDiarios;
	}
	
	public void setEsParaAccionDesdeFormularioFacturacionesPorDiarios(Boolean esParaAccionDesdeFormularioFacturacionesPorDiarios) {
		this.esParaAccionDesdeFormularioFacturacionesPorDiarios = esParaAccionDesdeFormularioFacturacionesPorDiarios;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.facturacionespordiariosSessionBean==null) {
				this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
			}

			if(!this.facturacionespordiariosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(facturacionespordiariosSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.facturacionespordiariosSessionBean==null) {
				this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
			}

			if(!this.facturacionespordiariosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(facturacionespordiariosSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTipoTransaccionModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTransaccionModuloLogic tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();

			//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

			if(this.facturacionespordiariosSessionBean==null) {
				this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
			}

			if(!this.facturacionespordiariosSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

					tipotransaccionmoduloLogic.getTodosTipoTransaccionModulosWithConnection(sFinalQuery,new Pagination());

					this.tipotransaccionmodulosForeignKey=tipotransaccionmoduloLogic.getTipoTransaccionModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTransaccionModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getEntityWithConnection(facturacionespordiariosSessionBean.getlidTipoTransaccionModuloActual());
					this.tipotransaccionmodulosForeignKey.add(tipotransaccionmoduloLogic.getTipoTransaccionModulo());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.facturacionespordiarios!=null) {
						this.facturacionespordiarios.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
						this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturacionesPorDiarios.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturacionesPorDiariosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaFacturacionesPorDiariosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturacionesPorDiariosGenerico!=null && jComboBoxid_empresaFacturacionesPorDiariosGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturacionesPorDiariosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.facturacionespordiarios!=null) {
						this.facturacionespordiarios.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
						this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionFacturacionesPorDiarios.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaFacturacionesPorDiarios") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios!=null) {
						jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios!=null) {
							//jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionFacturacionesPorDiariosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionFacturacionesPorDiariosGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionFacturacionesPorDiariosGenerico!=null && jComboBoxid_transaccionFacturacionesPorDiariosGenerico.getItemCount()>0) {
					jComboBoxid_transaccionFacturacionesPorDiariosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTransaccionModuloForeignKey(Long idTipoTransaccionModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotransaccionmoduloTemp!=null) {

					if(this.facturacionespordiarios!=null) {
						this.facturacionespordiarios.setTipoTransaccionModulo(tipotransaccionmoduloTemp);
					}

					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
						this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setSelectedItem(tipotransaccionmoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setSelectedItem(tipotransaccionmoduloTemp);
					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoTransaccionModuloForeignKeyDescripcion(Long idTipoTransaccionModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}


			sDescripcion=TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTransaccionModuloForeignKeyGenerico(Long idTipoTransaccionModuloSeleccionado,JComboBox jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(tipotransaccionmoduloTemp!=null) {
				jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico.setSelectedItem(tipotransaccionmoduloTemp);
			} else {
				if(jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico!=null && jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturacionesPorDiarios facturacionespordiarios,JComboBox jComboBoxid_empresaFacturacionesPorDiariosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturacionesPorDiariosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturacionesPorDiariosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturacionespordiarios.setid_empresa(empresaAux.getId());
				facturacionespordiarios.setempresa_descripcion(FacturacionesPorDiariosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturacionespordiarios.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(FacturacionesPorDiarios facturacionespordiarios,JComboBox jComboBoxid_transaccionFacturacionesPorDiariosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionFacturacionesPorDiariosGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionFacturacionesPorDiariosGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				facturacionespordiarios.setid_transaccion(transaccionAux.getId());
				facturacionespordiarios.settransaccion_descripcion(FacturacionesPorDiariosConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				facturacionespordiarios.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTransaccionModuloForeignKey(FacturacionesPorDiarios facturacionespordiarios,JComboBox jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloAux=new TipoTransaccionModulo();

			if(jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico==null) {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getSelectedItem();
			} else {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiariosGenerico.getSelectedItem();
			}

			if(tipotransaccionmoduloAux!=null && tipotransaccionmoduloAux.getId()!=null) {
				facturacionespordiarios.setid_tipo_transaccion_modulo(tipotransaccionmoduloAux.getId());
				facturacionespordiarios.settipotransaccionmodulo_descripcion(FacturacionesPorDiariosConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloAux));
				facturacionespordiarios.setTipoTransaccionModulo(tipotransaccionmoduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { 
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { 
					}

					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { 
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { 
					}

					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaFacturacionesPorDiarios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.addItem(transaccion);
							}
						}

						if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTransaccionModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTransaccionModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { 
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.addItem(tipotransaccionmodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { 
					}

					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTransaccionModuloForeignKey(TipoTransaccionModulo tipotransaccionmodulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setSelectedItem(tipotransaccionmodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFacturacionesPorDiarios() throws Exception {
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
		
	public FacturacionesPorDiariosParameterReturnGeneral getFacturacionesPorDiariosParameterGeneral() {
		return this.facturacionespordiariosParameterGeneral;
	}
	
	public void setFacturacionesPorDiariosParameterGeneral(FacturacionesPorDiariosParameterReturnGeneral facturacionespordiariosParameterGeneral) {
		this.facturacionespordiariosParameterGeneral = facturacionespordiariosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturacionesPorDiarios() {
		return isPermisoTodoFacturacionesPorDiarios;
	}

	public void setIsPermisoTodoFacturacionesPorDiarios(Boolean isPermisoTodoFacturacionesPorDiarios) {
		this.isPermisoTodoFacturacionesPorDiarios = isPermisoTodoFacturacionesPorDiarios;
	}

	public Boolean getIsPermisoNuevoFacturacionesPorDiarios() {
		return isPermisoNuevoFacturacionesPorDiarios;
	}

	public void setIsPermisoNuevoFacturacionesPorDiarios(Boolean isPermisoNuevoFacturacionesPorDiarios) {
		this.isPermisoNuevoFacturacionesPorDiarios = isPermisoNuevoFacturacionesPorDiarios;
	}

	public Boolean getIsPermisoActualizarFacturacionesPorDiarios() {
		return isPermisoActualizarFacturacionesPorDiarios;
	}

	public void setIsPermisoActualizarFacturacionesPorDiarios(Boolean isPermisoActualizarFacturacionesPorDiarios) {
		this.isPermisoActualizarFacturacionesPorDiarios = isPermisoActualizarFacturacionesPorDiarios;
	}

	public Boolean getIsPermisoEliminarFacturacionesPorDiarios() {
		return isPermisoEliminarFacturacionesPorDiarios;
	}

	public void setIsPermisoEliminarFacturacionesPorDiarios(Boolean isPermisoEliminarFacturacionesPorDiarios) {
		this.isPermisoEliminarFacturacionesPorDiarios = isPermisoEliminarFacturacionesPorDiarios;
	}

	public Boolean getIsPermisoGuardarCambiosFacturacionesPorDiarios() {
		return isPermisoGuardarCambiosFacturacionesPorDiarios;
	}

	public void setIsPermisoGuardarCambiosFacturacionesPorDiarios(Boolean isPermisoGuardarCambiosFacturacionesPorDiarios) {
		this.isPermisoGuardarCambiosFacturacionesPorDiarios = isPermisoGuardarCambiosFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoConsultaFacturacionesPorDiarios() {
		return isPermisoConsultaFacturacionesPorDiarios;
	}

	public void setIsPermisoConsultaFacturacionesPorDiarios(Boolean isPermisoConsultaFacturacionesPorDiarios) {
		this.isPermisoConsultaFacturacionesPorDiarios = isPermisoConsultaFacturacionesPorDiarios;
	}

	public Boolean getIsPermisoBusquedaFacturacionesPorDiarios() {
		return isPermisoBusquedaFacturacionesPorDiarios;
	}

	public void setIsPermisoBusquedaFacturacionesPorDiarios(Boolean isPermisoBusquedaFacturacionesPorDiarios) {
		this.isPermisoBusquedaFacturacionesPorDiarios = isPermisoBusquedaFacturacionesPorDiarios;
	}

	public Boolean getIsPermisoReporteFacturacionesPorDiarios() {
		return isPermisoReporteFacturacionesPorDiarios;
	}

	public void setIsPermisoReporteFacturacionesPorDiarios(Boolean isPermisoReporteFacturacionesPorDiarios) {
		this.isPermisoReporteFacturacionesPorDiarios = isPermisoReporteFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturacionesPorDiarios() {
		return isPermisoPaginacionMedioFacturacionesPorDiarios;
	}

	public void setIsPermisoPaginacionMedioFacturacionesPorDiarios(Boolean isPermisoPaginacionMedioFacturacionesPorDiarios) {
		this.isPermisoPaginacionMedioFacturacionesPorDiarios = isPermisoPaginacionMedioFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturacionesPorDiarios() {
		return isPermisoPaginacionTodoFacturacionesPorDiarios;
	}

	public void setIsPermisoPaginacionTodoFacturacionesPorDiarios(Boolean isPermisoPaginacionTodoFacturacionesPorDiarios) {
		this.isPermisoPaginacionTodoFacturacionesPorDiarios = isPermisoPaginacionTodoFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturacionesPorDiarios() {
		return isPermisoPaginacionAltoFacturacionesPorDiarios;
	}

	public void setIsPermisoPaginacionAltoFacturacionesPorDiarios(Boolean isPermisoPaginacionAltoFacturacionesPorDiarios) {
		this.isPermisoPaginacionAltoFacturacionesPorDiarios = isPermisoPaginacionAltoFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoCopiarFacturacionesPorDiarios() {
		return isPermisoCopiarFacturacionesPorDiarios;
	}

	public void setIsPermisoCopiarFacturacionesPorDiarios(Boolean isPermisoCopiarFacturacionesPorDiarios) {
		this.isPermisoCopiarFacturacionesPorDiarios = isPermisoCopiarFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoVerFormFacturacionesPorDiarios() {
		return isPermisoVerFormFacturacionesPorDiarios;
	}

	public void setIsPermisoVerFormFacturacionesPorDiarios(Boolean isPermisoVerFormFacturacionesPorDiarios) {
		this.isPermisoVerFormFacturacionesPorDiarios = isPermisoVerFormFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoDuplicarFacturacionesPorDiarios() {
		return isPermisoDuplicarFacturacionesPorDiarios;
	}

	public void setIsPermisoDuplicarFacturacionesPorDiarios(Boolean isPermisoDuplicarFacturacionesPorDiarios) {
		this.isPermisoDuplicarFacturacionesPorDiarios = isPermisoDuplicarFacturacionesPorDiarios;
	}
	
	public Boolean getIsPermisoOrdenFacturacionesPorDiarios() {
		return isPermisoOrdenFacturacionesPorDiarios;
	}

	public void setIsPermisoOrdenFacturacionesPorDiarios(Boolean isPermisoOrdenFacturacionesPorDiarios) {
		this.isPermisoOrdenFacturacionesPorDiarios = isPermisoOrdenFacturacionesPorDiarios;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturacionesPorDiarios() {
		return isVisibilidadCeldaNuevoFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaNuevoFacturacionesPorDiarios(Boolean isVisibilidadCeldaNuevoFacturacionesPorDiarios) {
		this.isVisibilidadCeldaNuevoFacturacionesPorDiarios = isVisibilidadCeldaNuevoFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturacionesPorDiarios() {
		return isVisibilidadCeldaDuplicarFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaDuplicarFacturacionesPorDiarios(Boolean isVisibilidadCeldaDuplicarFacturacionesPorDiarios) {
		this.isVisibilidadCeldaDuplicarFacturacionesPorDiarios = isVisibilidadCeldaDuplicarFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturacionesPorDiarios() {
		return isVisibilidadCeldaCopiarFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaCopiarFacturacionesPorDiarios(Boolean isVisibilidadCeldaCopiarFacturacionesPorDiarios) {
		this.isVisibilidadCeldaCopiarFacturacionesPorDiarios = isVisibilidadCeldaCopiarFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturacionesPorDiarios() {
		return isVisibilidadCeldaVerFormFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaVerFormFacturacionesPorDiarios(Boolean isVisibilidadCeldaVerFormFacturacionesPorDiarios) {
		this.isVisibilidadCeldaVerFormFacturacionesPorDiarios = isVisibilidadCeldaVerFormFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturacionesPorDiarios() {
		return isVisibilidadCeldaOrdenFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaOrdenFacturacionesPorDiarios(Boolean isVisibilidadCeldaOrdenFacturacionesPorDiarios) {
		this.isVisibilidadCeldaOrdenFacturacionesPorDiarios = isVisibilidadCeldaOrdenFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios() {
		return isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios(Boolean isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios) {
		this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios = isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturacionesPorDiarios() {
		return isVisibilidadCeldaModificarFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaModificarFacturacionesPorDiarios(Boolean isVisibilidadCeldaModificarFacturacionesPorDiarios) {
		this.isVisibilidadCeldaModificarFacturacionesPorDiarios = isVisibilidadCeldaModificarFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturacionesPorDiarios() {
		return isVisibilidadCeldaActualizarFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaActualizarFacturacionesPorDiarios(Boolean isVisibilidadCeldaActualizarFacturacionesPorDiarios) {
		this.isVisibilidadCeldaActualizarFacturacionesPorDiarios = isVisibilidadCeldaActualizarFacturacionesPorDiarios;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturacionesPorDiarios() {
		return isVisibilidadCeldaEliminarFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaEliminarFacturacionesPorDiarios(Boolean isVisibilidadCeldaEliminarFacturacionesPorDiarios) {
		this.isVisibilidadCeldaEliminarFacturacionesPorDiarios = isVisibilidadCeldaEliminarFacturacionesPorDiarios;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturacionesPorDiarios() {
		return isVisibilidadCeldaCancelarFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaCancelarFacturacionesPorDiarios(Boolean isVisibilidadCeldaCancelarFacturacionesPorDiarios) {
		this.isVisibilidadCeldaCancelarFacturacionesPorDiarios = isVisibilidadCeldaCancelarFacturacionesPorDiarios;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturacionesPorDiarios() {
		return isVisibilidadCeldaGuardarFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaGuardarFacturacionesPorDiarios(Boolean isVisibilidadCeldaGuardarFacturacionesPorDiarios) {
		this.isVisibilidadCeldaGuardarFacturacionesPorDiarios = isVisibilidadCeldaGuardarFacturacionesPorDiarios;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios() {
		return isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios(Boolean isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios) {
		this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios = isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios;
	}
		
	public FacturacionesPorDiariosSessionBean getfacturacionespordiariosSessionBean() {
		return this.facturacionespordiariosSessionBean;
	}
	
	public void setfacturacionespordiariosSessionBean(FacturacionesPorDiariosSessionBean facturacionespordiariosSessionBean) {
		this.facturacionespordiariosSessionBean=facturacionespordiariosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaFacturacionesPorDiarios() {
		return this.isVisibilidadBusquedaFacturacionesPorDiarios;
	}

	public void setisVisibilidadBusquedaFacturacionesPorDiarios(Boolean isVisibilidadBusquedaFacturacionesPorDiarios) {
		this.isVisibilidadBusquedaFacturacionesPorDiarios=isVisibilidadBusquedaFacturacionesPorDiarios;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoTransaccionModulo() {
		return this.isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public void setisVisibilidadFK_IdTipoTransaccionModulo(Boolean isVisibilidadFK_IdTipoTransaccionModulo) {
		this.isVisibilidadFK_IdTipoTransaccionModulo=isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(facturacionespordiarios,null);
				this.setActualParaGuardarTransaccionForeignKey(facturacionespordiarios,null);
				this.setActualParaGuardarTipoTransaccionModuloForeignKey(facturacionespordiarios,null);
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
	
	public void bugActualizarReferenciaActual(FacturacionesPorDiarios facturacionespordiarios,FacturacionesPorDiarios facturacionespordiariosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturacionesPorDiarios(facturacionespordiarios);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturacionespordiariosAux.setId(facturacionespordiarios.getId());
		facturacionespordiariosAux.setVersionRow(facturacionespordiarios.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(FacturacionesPorDiarios facturacionespordiariosLocal) throws Exception {
		
		if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturacionesPorDiarios facturacionespordiariosLocal) throws Exception {	
		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturacionespordiariosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				facturacionespordiariosLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTransaccionModuloDetalleFormJInternalFrame.class)) {
				TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrameLocal=(TipoTransaccionModuloBeanSwingJInternalFrame) ((TipoTransaccionModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.gettipotransaccionmodulo(),true);
				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarLista(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo,this.tipotransaccionmodulosForeignKey);

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				facturacionespordiariosLocal.setTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey("Formulario");
				this.setActualTipoTransaccionModuloForeignKey(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturacionesPorDiariosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturacionespordiariosValidator.getInvalidValues(this.facturacionespordiarios);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturacionesPorDiarios facturacionespordiarios,List<FacturacionesPorDiarios> facturacionespordiarioss) throws Exception {
	}		
	
	public void actualizarSelectedLista(FacturacionesPorDiarios facturacionespordiarios,List<FacturacionesPorDiarios> facturacionespordiarioss) throws Exception {
		try	{			
			FacturacionesPorDiariosConstantesFunciones.actualizarSelectedLista(facturacionespordiarios,facturacionespordiarioss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturacionesPorDiarios> facturacionespordiariossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturacionespordiariossLocal=this.facturacionespordiariosLogic.getFacturacionesPorDiarioss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturacionespordiariossLocal=this.facturacionespordiarioss;
			}
			//ARCHITECTURE
		
			for(FacturacionesPorDiarios facturacionespordiariosLocal:facturacionespordiariossLocal) {
				if(this.permiteMantenimiento(facturacionespordiariosLocal) && facturacionespordiariosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturacionesPorDiariosConstantesFunciones.getFacturacionesPorDiariosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_emisionFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnombre_sucursalFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnombre_completo_clienteFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.IDTIPOTRANSACCIONMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.CODIGOASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelcodigo_asiento_contableFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.FECHAVENCE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_venceFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.FECHAEMISIONDETALLECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.MONTOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelmonto_mone_localFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnumero_facturaFacturacionesPorDiarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturacionesPorDiariosConstantesFunciones.RUCCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelruc_clienteFacturacionesPorDiarios,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_emisionFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnombre_sucursalFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnombre_completo_clienteFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelcodigo_asiento_contableFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_venceFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelmonto_mone_localFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnumero_facturaFacturacionesPorDiarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelruc_clienteFacturacionesPorDiarios,"");
		
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
		this.iIdNuevoFacturacionesPorDiarios--;	
		
		
		this.facturacionespordiariosAux=new FacturacionesPorDiarios();
		
		this.facturacionespordiariosAux.setId(this.iIdNuevoFacturacionesPorDiarios);
		this.facturacionespordiariosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().add(this.facturacionespordiariosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturacionespordiarioss.add(this.facturacionespordiariosAux);
		}
		//ARCHITECTURE
		
		this.facturacionespordiarios=this.facturacionespordiariosAux;
		
		if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturacionesPorDiarios(this.facturacionespordiarios);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturacionesPorDiarios(this.facturacionespordiarios);
		}
				
		//this.setDefaultControlesFacturacionesPorDiarios();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturacionesPorDiarios();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturacionesPorDiarios();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturacionesPorDiarios();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturacionesPorDiarios(this.facturacionespordiariosBean,this.facturacionespordiarios,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral,this.facturacionespordiariosBean,false);
		
		if(this.facturacionespordiariosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios());
		}
		
		if(this.facturacionespordiariosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios(),classes);//this.facturacionespordiariosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturacionesPorDiarios();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturacionesPorDiarios();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.RecargarFormFacturacionesPorDiarios(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturacionesPorDiarios(false);
						
			if(facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturacionesPorDiarios();
			}
			
			this.actualizarVisualTableDatosFacturacionesPorDiarios();
			
			this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(this.getIndiceNuevoFacturacionesPorDiarios(), this.getIndiceNuevoFacturacionesPorDiarios());
			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
						
			this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturacionesPorDiarios(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarfecha_emision_desdeFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarfecha_emision_hastaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarfecha_emisionFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarnombre_sucursalFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarnombre_completo_clienteFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarcodigo_asiento_contableFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarfecha_venceFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarfecha_emision_detalle_clienteFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarmonto_mone_localFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarnumero_facturaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarruc_clienteFacturacionesPorDiarios);	
		//
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarid_empresaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarid_transaccionFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setEnabled(isHabilitar && this.facturacionespordiariosConstantesFunciones.activarid_tipo_transaccion_moduloFacturacionesPorDiarios);
	};
	
	public void setDefaultControlesFacturacionesPorDiarios() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturacionesPorDiarios(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturacionespordiariosSessionBean.setConGuardarRelaciones(true);			
			this.facturacionespordiariosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.setVisible(true);
			
					
		} else {
			//this.facturacionespordiariosSessionBean.setConGuardarRelaciones(false);			
			this.facturacionespordiariosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturacionesPorDiarios() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
				if(facturacionespordiariosAux.getId().equals(this.iIdNuevoFacturacionesPorDiarios)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiarioss) {
				if(facturacionespordiariosAux.getId().equals(this.iIdNuevoFacturacionesPorDiarios)) {
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
	
	public int getIndiceActualFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
				if(facturacionespordiariosAux.getId().equals(facturacionespordiarios.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiarioss) {
				if(facturacionespordiariosAux.getId().equals(facturacionespordiarios.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiariosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
				if(facturacionespordiariosAux.getFacturacionesPorDiariosOriginal().getId().equals(facturacionespordiariosOriginal.getId())) {
					existe=true;
					facturacionespordiariosOriginal.setId(facturacionespordiariosAux.getId());
					facturacionespordiariosOriginal.setVersionRow(facturacionespordiariosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiarioss) {
				if(facturacionespordiariosAux.getFacturacionesPorDiariosOriginal().getId().equals(facturacionespordiariosOriginal.getId())) {
					existe=true;
					facturacionespordiariosOriginal.setId(facturacionespordiariosAux.getId());
					facturacionespordiariosOriginal.setVersionRow(facturacionespordiariosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturacionesPorDiarios(Boolean esParaCancelar) throws Exception {
		facturacionespordiariossAux=new ArrayList<FacturacionesPorDiarios>();
		facturacionespordiariosAux=new FacturacionesPorDiarios();
		
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
					if(facturacionespordiariosAux.getId()<0) {
						facturacionespordiariossAux.add(facturacionespordiariosAux);
					}		
				}
				this.iIdNuevoFacturacionesPorDiarios=0L;
				this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().removeAll(facturacionespordiariossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiarioss) {
					if(facturacionespordiariosAux.getId()<0) {
						facturacionespordiariossAux.add(facturacionespordiariosAux);
					}		
				}
				this.iIdNuevoFacturacionesPorDiarios=0L;
				this.facturacionespordiarioss.removeAll(facturacionespordiariossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturacionesPorDiarios 
					&& this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().size()>0
					) {
					facturacionespordiariosAux=this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().get(this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().size() - 1);
				
					if(facturacionespordiariosAux.getId()<0) {
						this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().remove(facturacionespordiariosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturacionesPorDiarios && this.facturacionespordiarioss.size()>0) {
					facturacionespordiariosAux=this.facturacionespordiarioss.get(this.facturacionespordiarioss.size() - 1);
				
					if(facturacionespordiariosAux.getId()<0) {
						this.facturacionespordiarioss.remove(facturacionespordiariosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturacionesPorDiarios(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturacionespordiarios.getId()<0) {
				this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().remove(this.facturacionespordiarios);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturacionespordiarios.getId()<0) {
				this.facturacionespordiarioss.remove(this.facturacionespordiarios);
			}
		}			
	}
	
	public void setEstadosInicialesFacturacionesPorDiarios(List<FacturacionesPorDiarios> facturacionespordiariossAux) throws Exception {
		FacturacionesPorDiariosConstantesFunciones.setEstadosInicialesFacturacionesPorDiarios(facturacionespordiariossAux);
	}
	
	public void setEstadosInicialesFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiariosAux) throws Exception {
		FacturacionesPorDiariosConstantesFunciones.setEstadosInicialesFacturacionesPorDiarios(facturacionespordiariosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturacionesPorDiariosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturacionesPorDiariosActual()) {
				if(!this.isEsNuevoFacturacionesPorDiarios) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturacionesPorDiarios=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturacionesPorDiariosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Facturaciones Por Diarios ?", "MANTENIMIENTO DE Facturaciones Por Diarios", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturacionesPorDiarios facturacionespordiarios) throws Exception {
		FacturacionesPorDiariosConstantesFunciones.seleccionarAsignar(this.facturacionespordiarios,facturacionespordiarios);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturacionesPorDiarios=this.isPermisoActualizarOriginalFacturacionesPorDiarios;
			
			
			this.seleccionarAsignar(facturacionespordiarios);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturacionespordiariosSessionBean.setsFuncionBusquedaRapida(this.facturacionespordiariosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturacionesPorDiarios) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturacionesPorDiarios(esParaCancelar);				
				this.cancelarNuevoFacturacionesPorDiarios(esParaCancelar);								
			}
			
			this.facturacionespordiarios=new FacturacionesPorDiarios();
			
			this.inicializarFacturacionesPorDiarios();
			
			this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturacionesPorDiarios() throws Exception {
		try {
			FacturacionesPorDiariosConstantesFunciones.inicializarFacturacionesPorDiarios(this.facturacionespordiarios);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturacionesPorDiarioss(String sAccionBusqueda,List<FacturacionesPorDiarios> facturacionespordiariossParaReportes) throws Exception {
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
					sPathReporteFinal="FacturacionesPorDiarios"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturacionesPorDiariosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturacionesPorDiariosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturacionesPorDiarios"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Facturaciones Por Diarioses");		
		parameters.put("busquedapor", FacturacionesPorDiariosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturacionesPorDiarios=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturacionesPorDiariosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturacionesPorDiariosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturacionesPorDiarios=new JRBeanArrayDataSource(FacturacionesPorDiariosJInternalFrame.TraerFacturacionesPorDiariosBeans(facturacionespordiariossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturacionesPorDiarios);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturacionesPorDiariosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturacionesPorDiariosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturacionesPorDiariosBean.TraerFacturacionesPorDiariosBeans(facturacionespordiariossParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturacionesPorDiarioss(sAccionBusqueda,sTipoArchivoReporte,facturacionespordiariossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturacionesPorDiarioss(sAccionBusqueda,sTipoArchivoReporte,facturacionespordiariossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiariosActionPerformed(null);
					//this.generarExcelReporteFacturacionesPorDiarioss(sAccionBusqueda,sTipoArchivoReporte,facturacionespordiariossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturacionesPorDiarioss(sAccionBusqueda,sTipoArchivoReporte,facturacionespordiariossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturacionesPorDiarioss(sAccionBusqueda,sTipoArchivoReporte,facturacionespordiariossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturacionesPorDiarioss(sAccionBusqueda,sTipoArchivoReporte,facturacionespordiariossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturacionesPorDiarioss(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturacionesPorDiarios> facturacionespordiariossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacionespordiarios";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturacionesPorDiarioss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturacionesPorDiarios("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturacionesPorDiarios facturacionespordiarios : facturacionespordiariossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturacionesPorDiariosConstantesFunciones.generarExcelReporteDataFacturacionesPorDiarios("NORMAL",row,workbook,facturacionespordiarios,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturacionesPorDiarios(String sTipo,Row row,Workbook workbook) {
		
		FacturacionesPorDiariosConstantesFunciones.generarExcelReporteHeaderFacturacionesPorDiarios(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturacionesPorDiarioss(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturacionesPorDiarios> facturacionespordiariossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacionespordiarios_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturacionesPorDiarioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturacionesPorDiarios facturacionespordiarios : facturacionespordiariossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.getFacturacionesPorDiariosDescripcion(facturacionespordiarios));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.gettipotransaccionmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getcodigo_asiento_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getfecha_emision_detalle_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getmonto_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacionespordiarios.getruc_cliente());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturacionesPorDiarioss(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturacionesPorDiarios> facturacionespordiariossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturacionesPorDiarios> facturacionespordiariossRespaldo=null;
		
		classes=FacturacionesPorDiariosConstantesFunciones.getClassesRelationshipsOfFacturacionesPorDiarios(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturacionespordiariosLogic.setDatosCliente(this.datosCliente);
		this.facturacionespordiariosLogic.setDatosDeep(this.datosDeep);
		this.facturacionespordiariosLogic.setIsConDeep(true);
		
		facturacionespordiariossRespaldo=this.facturacionespordiariosLogic.getFacturacionesPorDiarioss();
		
		this.facturacionespordiariosLogic.setFacturacionesPorDiarioss(facturacionespordiariossParaReportes);	
		this.facturacionespordiariosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturacionespordiariossParaReportes=this.facturacionespordiariosLogic.getFacturacionesPorDiarioss();
		this.facturacionespordiariosLogic.setFacturacionesPorDiarioss(facturacionespordiariossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacionespordiarios_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturacionesPorDiarioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturacionesPorDiarios("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturacionesPorDiarios facturacionespordiarios : facturacionespordiariossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturacionesPorDiarios("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturacionesPorDiariosConstantesFunciones.generarExcelReporteDataFacturacionesPorDiarios("NORMAL",row,workbook,facturacionespordiarios,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.getFacturacionesPorDiariosDescripcion(facturacionespordiarios));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturacionesPorDiarios() throws Exception {		
		this.startProcessFacturacionesPorDiarios(true);
	}
	
	public void startProcessFacturacionesPorDiarios(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturacionesPorDiarios ,this.jPanelParametrosReportesFacturacionesPorDiarios, this.jScrollPanelDatosFacturacionesPorDiarios,this.jPanelPaginacionFacturacionesPorDiarios, this.jScrollPanelDatosEdicionFacturacionesPorDiarios, this.jPanelAccionesFacturacionesPorDiarios,this.jPanelAccionesFormularioFacturacionesPorDiarios,this.jmenuBarFacturacionesPorDiarios,this.jmenuBarDetalleFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,this.jTtoolBarDetalleFacturacionesPorDiarios);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturacionesPorDiarios=this.jTabbedPaneBusquedasFacturacionesPorDiarios; 
		
		final JPanel jPanelParametrosReportesFacturacionesPorDiarios=this.jPanelParametrosReportesFacturacionesPorDiarios;
		//final JScrollPane jScrollPanelDatosFacturacionesPorDiarios=this.jScrollPanelDatosFacturacionesPorDiarios;
		final JTable jTableDatosFacturacionesPorDiarios=this.jTableDatosFacturacionesPorDiarios;		
		final JPanel jPanelPaginacionFacturacionesPorDiarios=this.jPanelPaginacionFacturacionesPorDiarios;
		//final JScrollPane jScrollPanelDatosEdicionFacturacionesPorDiarios=this.jScrollPanelDatosEdicionFacturacionesPorDiarios;
		final JPanel jPanelAccionesFacturacionesPorDiarios=this.jPanelAccionesFacturacionesPorDiarios;
		
		JPanel jPanelCamposAuxiliarFacturacionesPorDiarios=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturacionesPorDiarios=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			jPanelCamposAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelCamposFacturacionesPorDiarios;
			jPanelAccionesFormularioAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelAccionesFormularioFacturacionesPorDiarios;
		}
		
		final JPanel jPanelCamposFacturacionesPorDiarios=jPanelCamposAuxiliarFacturacionesPorDiarios;
		final JPanel jPanelAccionesFormularioFacturacionesPorDiarios=jPanelAccionesFormularioAuxiliarFacturacionesPorDiarios;
		
		
		final JMenuBar jmenuBarFacturacionesPorDiarios=this.jmenuBarFacturacionesPorDiarios;
		final JToolBar jTtoolBarFacturacionesPorDiarios=this.jTtoolBarFacturacionesPorDiarios;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturacionesPorDiarios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturacionesPorDiarios=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			jmenuBarDetalleAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jmenuBarDetalleFacturacionesPorDiarios;
			jTtoolBarDetalleAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTtoolBarDetalleFacturacionesPorDiarios;
		}
		
		final JMenuBar jmenuBarDetalleFacturacionesPorDiarios=jmenuBarDetalleAuxiliarFacturacionesPorDiarios;
		final JToolBar jTtoolBarDetalleFacturacionesPorDiarios=jTtoolBarDetalleAuxiliarFacturacionesPorDiarios;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturacionesPorDiarios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturacionesPorDiarios;
			processRunnable.jTableDatos=jTableDatosFacturacionesPorDiarios;
			processRunnable.jPanelCampos=jPanelCamposFacturacionesPorDiarios;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturacionesPorDiarios;
			processRunnable.jPanelAcciones=jPanelAccionesFacturacionesPorDiarios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturacionesPorDiarios;
			
			
			processRunnable.jmenuBar=jmenuBarFacturacionesPorDiarios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturacionesPorDiarios;
			processRunnable.jTtoolBar=jTtoolBarFacturacionesPorDiarios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturacionesPorDiarios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturacionesPorDiarios ,jPanelParametrosReportesFacturacionesPorDiarios,jTableDatosFacturacionesPorDiarios, /*jScrollPanelDatosFacturacionesPorDiarios,*/jPanelCamposFacturacionesPorDiarios,jPanelPaginacionFacturacionesPorDiarios, /*jScrollPanelDatosEdicionFacturacionesPorDiarios,*/ jPanelAccionesFacturacionesPorDiarios,jPanelAccionesFormularioFacturacionesPorDiarios,jmenuBarFacturacionesPorDiarios,jmenuBarDetalleFacturacionesPorDiarios,jTtoolBarFacturacionesPorDiarios,jTtoolBarDetalleFacturacionesPorDiarios);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturacionesPorDiarios ,jPanelParametrosReportesFacturacionesPorDiarios, jScrollPanelDatosFacturacionesPorDiarios,jPanelPaginacionFacturacionesPorDiarios, jScrollPanelDatosEdicionFacturacionesPorDiarios, jPanelAccionesFacturacionesPorDiarios,jPanelAccionesFormularioFacturacionesPorDiarios,jmenuBarFacturacionesPorDiarios,jmenuBarDetalleFacturacionesPorDiarios,jTtoolBarFacturacionesPorDiarios,jTtoolBarDetalleFacturacionesPorDiarios);
						
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
	
	public void finishProcessFacturacionesPorDiarios() {// throws Exception 
		this.finishProcessFacturacionesPorDiarios(true);
	}
	
	public void finishProcessFacturacionesPorDiarios(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturacionesPorDiarios ,this.jPanelParametrosReportesFacturacionesPorDiarios, this.jScrollPanelDatosFacturacionesPorDiarios,this.jPanelPaginacionFacturacionesPorDiarios, this.jScrollPanelDatosEdicionFacturacionesPorDiarios, this.jPanelAccionesFacturacionesPorDiarios,this.jPanelAccionesFormularioFacturacionesPorDiarios,this.jmenuBarFacturacionesPorDiarios,this.jmenuBarDetalleFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,this.jTtoolBarDetalleFacturacionesPorDiarios);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturacionesPorDiarios=this.jTabbedPaneBusquedasFacturacionesPorDiarios; 
		
		final JPanel jPanelParametrosReportesFacturacionesPorDiarios=this.jPanelParametrosReportesFacturacionesPorDiarios;
		//final JScrollPane jScrollPanelDatosFacturacionesPorDiarios=this.jScrollPanelDatosFacturacionesPorDiarios;
		final JTable jTableDatosFacturacionesPorDiarios=this.jTableDatosFacturacionesPorDiarios;		
		final JPanel jPanelPaginacionFacturacionesPorDiarios=this.jPanelPaginacionFacturacionesPorDiarios;
		//final JScrollPane jScrollPanelDatosEdicionFacturacionesPorDiarios=this.jScrollPanelDatosEdicionFacturacionesPorDiarios;
		final JPanel jPanelAccionesFacturacionesPorDiarios=this.jPanelAccionesFacturacionesPorDiarios;
		
		JPanel jPanelCamposAuxiliarFacturacionesPorDiarios=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturacionesPorDiarios=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			jPanelCamposAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelCamposFacturacionesPorDiarios;
			jPanelAccionesFormularioAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelAccionesFormularioFacturacionesPorDiarios;
		}
		
		final JPanel jPanelCamposFacturacionesPorDiarios=jPanelCamposAuxiliarFacturacionesPorDiarios;
		final JPanel jPanelAccionesFormularioFacturacionesPorDiarios=jPanelAccionesFormularioAuxiliarFacturacionesPorDiarios;
		
		
		final JMenuBar jmenuBarFacturacionesPorDiarios=this.jmenuBarFacturacionesPorDiarios;		
		final JToolBar jTtoolBarFacturacionesPorDiarios=this.jTtoolBarFacturacionesPorDiarios;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturacionesPorDiarios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturacionesPorDiarios=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			jmenuBarDetalleAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jmenuBarDetalleFacturacionesPorDiarios;
			jTtoolBarDetalleAuxiliarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTtoolBarDetalleFacturacionesPorDiarios;		
		}
		
		final JMenuBar jmenuBarDetalleFacturacionesPorDiarios=jmenuBarDetalleAuxiliarFacturacionesPorDiarios;
		final JToolBar jTtoolBarDetalleFacturacionesPorDiarios=jTtoolBarDetalleAuxiliarFacturacionesPorDiarios;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturacionesPorDiarios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturacionesPorDiarios;
			processRunnable.jTableDatos=jTableDatosFacturacionesPorDiarios;
			processRunnable.jPanelCampos=jPanelCamposFacturacionesPorDiarios;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturacionesPorDiarios;
			processRunnable.jPanelAcciones=jPanelAccionesFacturacionesPorDiarios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturacionesPorDiarios;
			
			
			processRunnable.jmenuBar=jmenuBarFacturacionesPorDiarios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturacionesPorDiarios;
			processRunnable.jTtoolBar=jTtoolBarFacturacionesPorDiarios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturacionesPorDiarios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturacionesPorDiarios ,jPanelParametrosReportesFacturacionesPorDiarios, jTableDatosFacturacionesPorDiarios,/*jScrollPanelDatosFacturacionesPorDiarios,*/jPanelCamposFacturacionesPorDiarios,jPanelPaginacionFacturacionesPorDiarios, /*jScrollPanelDatosEdicionFacturacionesPorDiarios,*/ jPanelAccionesFacturacionesPorDiarios,jPanelAccionesFormularioFacturacionesPorDiarios,jmenuBarFacturacionesPorDiarios,jmenuBarDetalleFacturacionesPorDiarios,jTtoolBarFacturacionesPorDiarios,jTtoolBarDetalleFacturacionesPorDiarios));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturacionesPorDiarios(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturacionesPorDiarios(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturacionesPorDiarios(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturacionesPorDiarios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturacionesPorDiarios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturacionesPorDiarios,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturacionesPorDiarios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturacionesPorDiarios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturacionesPorDiarios,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturacionespordiariosConstantesFunciones.getsFinalQueryFacturacionesPorDiarios();
		String  finalQueryPaginacionTodos=this.facturacionespordiariosConstantesFunciones.getsFinalQueryFacturacionesPorDiarios();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturacionesPorDiariosConstantesFunciones.getArrayColumnasGlobalesNoFacturacionesPorDiarios(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturacionesPorDiariosConstantesFunciones.getArrayColumnasGlobalesFacturacionesPorDiarios(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturacionesPorDiariosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturacionespordiariossEliminados= new ArrayList<FacturacionesPorDiarios>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturacionesPorDiarios();
		
				///*FacturacionesPorDiariosSessionBean*/this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
			
			if(this.facturacionespordiariosSessionBean==null) {
				this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
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
					this.iNumeroPaginacion=FacturacionesPorDiariosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturacionesPorDiariosConstantesFunciones.getClassesForeignKeysOfFacturacionesPorDiarios(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturacionespordiarios."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturacionespordiariossAux= new ArrayList<FacturacionesPorDiarios>();
			
				
			facturacionespordiariosLogic.setDatosCliente(this.datosCliente);
			facturacionespordiariosLogic.setDatosDeep(this.datosDeep);
			facturacionespordiariosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaFacturacionesPorDiarios")) {
				this.sDetalleReporte=FacturacionesPorDiariosConstantesFunciones.getDetalleIndiceBusquedaFacturacionesPorDiarios(id_transaccionBusquedaFacturacionesPorDiarios,fecha_emision_desdeBusquedaFacturacionesPorDiarios,fecha_emision_hastaBusquedaFacturacionesPorDiarios);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturacionespordiariosLogic.getFacturacionesPorDiariossBusquedaFacturacionesPorDiarios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaFacturacionesPorDiarios,fecha_emision_desdeBusquedaFacturacionesPorDiarios,fecha_emision_hastaBusquedaFacturacionesPorDiarios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturacionesPorDiariosConstantesFunciones.getDetalleIndiceBusquedaFacturacionesPorDiarios(id_transaccionBusquedaFacturacionesPorDiarios,fecha_emision_desdeBusquedaFacturacionesPorDiarios,fecha_emision_hastaBusquedaFacturacionesPorDiarios);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturacionesPorDiariosConstantesFunciones.getDetalleIndiceBusquedaFacturacionesPorDiarios(id_transaccionBusquedaFacturacionesPorDiarios,fecha_emision_desdeBusquedaFacturacionesPorDiarios,fecha_emision_hastaBusquedaFacturacionesPorDiarios);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturacionespordiariosLogic.getFacturacionesPorDiarioss()==null||facturacionespordiariosLogic.getFacturacionesPorDiarioss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturacionespordiarioss==null|| facturacionespordiarioss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionespordiariossAux=new ArrayList<FacturacionesPorDiarios>();
						facturacionespordiariossAux.addAll(facturacionespordiariosLogic.getFacturacionesPorDiarioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturacionespordiariossAux=new ArrayList<FacturacionesPorDiarios>();
							facturacionespordiariossAux.addAll(facturacionespordiarioss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturacionespordiariosLogic.getFacturacionesPorDiariossBusquedaFacturacionesPorDiarios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaFacturacionesPorDiarios,fecha_emision_desdeBusquedaFacturacionesPorDiarios,fecha_emision_hastaBusquedaFacturacionesPorDiarios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturacionesPorDiariosConstantesFunciones.getDetalleIndiceBusquedaFacturacionesPorDiarios(id_transaccionBusquedaFacturacionesPorDiarios,fecha_emision_desdeBusquedaFacturacionesPorDiarios,fecha_emision_hastaBusquedaFacturacionesPorDiarios);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturacionesPorDiariosConstantesFunciones.getDetalleIndiceBusquedaFacturacionesPorDiarios(id_transaccionBusquedaFacturacionesPorDiarios,fecha_emision_desdeBusquedaFacturacionesPorDiarios,fecha_emision_hastaBusquedaFacturacionesPorDiarios);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturacionesPorDiarioss("BusquedaFacturacionesPorDiarios",facturacionespordiariosLogic.getFacturacionesPorDiarioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturacionesPorDiarioss("BusquedaFacturacionesPorDiarios",facturacionespordiarioss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionespordiariosLogic.setFacturacionesPorDiarioss(new ArrayList<FacturacionesPorDiarios>());
						facturacionespordiariosLogic.getFacturacionesPorDiarioss().addAll(facturacionespordiariossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturacionespordiarioss=new ArrayList<FacturacionesPorDiarios>();
							facturacionespordiarioss.addAll(facturacionespordiariossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturacionesPorDiarios();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturacionesPorDiarios();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturacionespordiariosLogic.getFacturacionesPorDiarioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturacionespordiarioss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturacionespordiariosLogic.getFacturacionesPorDiarioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturacionespordiarioss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturacionesPorDiarios facturacionespordiarios) {
		Boolean permite=true;
		
		if(this.facturacionespordiarios.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturacionesPorDiariosConstantesFunciones.getOrderByListaFacturacionesPorDiarios();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturacionesPorDiariosConstantesFunciones.getOrderByListaFacturacionesPorDiarios();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
				if(facturacionespordiarios.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionespordiariosTotales=facturacionespordiarios;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturacionesPorDiarios facturacionespordiarios:this.facturacionespordiarioss) {
				if(facturacionespordiarios.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionespordiariosTotales=facturacionespordiarios;
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
			this.facturacionespordiariosAux=new FacturacionesPorDiarios();
			this.facturacionespordiariosAux.setsType(Constantes2.S_TOTALES);
			this.facturacionespordiariosAux.setIsNew(false);
			this.facturacionespordiariosAux.setIsChanged(false);
			this.facturacionespordiariosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//FacturacionesPorDiariosConstantesFunciones.TotalizarValoresFilaFacturacionesPorDiarios(this.facturacionespordiariosLogic.getFacturacionesPorDiarioss(),this.facturacionespordiariosAux);
				
				//this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().add(this.facturacionespordiariosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturacionesPorDiariosConstantesFunciones.TotalizarValoresFilaFacturacionesPorDiarios(this.facturacionespordiarioss,this.facturacionespordiariosAux);
				
				this.facturacionespordiarioss.add(this.facturacionespordiariosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturacionespordiariosTotales=new FacturacionesPorDiarios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().remove(facturacionespordiariosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturacionespordiarioss.remove(facturacionespordiariosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturacionespordiariosTotales=new FacturacionesPorDiarios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
				if(facturacionespordiarios.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionespordiariosTotales=facturacionespordiarios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturacionesPorDiariosConstantesFunciones.TotalizarValoresFilaFacturacionesPorDiarios(this.facturacionespordiariosLogic.getFacturacionesPorDiarioss(),facturacionespordiariosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturacionesPorDiarios facturacionespordiarios:this.facturacionespordiarioss) {
				if(facturacionespordiarios.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionespordiariosTotales=facturacionespordiarios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturacionesPorDiariosConstantesFunciones.TotalizarValoresFilaFacturacionesPorDiarios(this.facturacionespordiarioss,facturacionespordiariosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturacionesPorDiariossBusquedaFacturacionesPorDiarios()throws Exception {
		try {
			sAccionBusqueda="BusquedaFacturacionesPorDiarios";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturacionesPorDiariossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturacionesPorDiariossFK_IdTipoTransaccionModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTransaccionModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturacionesPorDiariossFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturacionesPorDiariossBusquedaFacturacionesPorDiarios(String sFinalQuery,Long id_transaccion,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturacionespordiariosLogic.getFacturacionesPorDiariossBusquedaFacturacionesPorDiarios(sFinalQuery,this.pagination,id_transaccion,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturacionesPorDiariossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturacionespordiariosLogic.getFacturacionesPorDiariossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturacionesPorDiariossFK_IdTipoTransaccionModulo(String sFinalQuery,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturacionespordiariosLogic.getFacturacionesPorDiariossFK_IdTipoTransaccionModulo(sFinalQuery,this.pagination,id_tipo_transaccion_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturacionesPorDiariossFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturacionespordiariosLogic.getFacturacionesPorDiariossFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosFacturacionesPorDiarios() {
		this.isPermisoTodoFacturacionesPorDiarios=false;
		this.isPermisoNuevoFacturacionesPorDiarios=false;
		this.isPermisoActualizarFacturacionesPorDiarios=false;
		this.isPermisoActualizarOriginalFacturacionesPorDiarios=false;
		this.isPermisoEliminarFacturacionesPorDiarios=false;
		this.isPermisoGuardarCambiosFacturacionesPorDiarios=false;
		this.isPermisoConsultaFacturacionesPorDiarios=true;
		this.isPermisoBusquedaFacturacionesPorDiarios=true;
		this.isPermisoReporteFacturacionesPorDiarios=true;
		this.isPermisoOrdenFacturacionesPorDiarios=false;		
		this.isPermisoPaginacionMedioFacturacionesPorDiarios=false;		
		this.isPermisoPaginacionAltoFacturacionesPorDiarios=false;		
		this.isPermisoPaginacionTodoFacturacionesPorDiarios=false;		
		this.isPermisoCopiarFacturacionesPorDiarios=false;		
		this.isPermisoVerFormFacturacionesPorDiarios=false;		
		this.isPermisoDuplicarFacturacionesPorDiarios=false;
		this.isPermisoOrdenFacturacionesPorDiarios=false;
	}
	
	public void setPermisosUsuarioFacturacionesPorDiarios(Boolean isPermiso) {
		this.isPermisoTodoFacturacionesPorDiarios=isPermiso;
		this.isPermisoNuevoFacturacionesPorDiarios=isPermiso;
		this.isPermisoActualizarFacturacionesPorDiarios=isPermiso;
		this.isPermisoActualizarOriginalFacturacionesPorDiarios=isPermiso;
		this.isPermisoEliminarFacturacionesPorDiarios=isPermiso;
		this.isPermisoGuardarCambiosFacturacionesPorDiarios=isPermiso;
		this.isPermisoConsultaFacturacionesPorDiarios=isPermiso;
		this.isPermisoBusquedaFacturacionesPorDiarios=isPermiso;
		this.isPermisoReporteFacturacionesPorDiarios=isPermiso;
		this.isPermisoOrdenFacturacionesPorDiarios=isPermiso;		
		this.isPermisoPaginacionMedioFacturacionesPorDiarios=isPermiso;		
		this.isPermisoPaginacionAltoFacturacionesPorDiarios=isPermiso;		
		this.isPermisoPaginacionTodoFacturacionesPorDiarios=isPermiso;		
		this.isPermisoCopiarFacturacionesPorDiarios=isPermiso;		
		this.isPermisoVerFormFacturacionesPorDiarios=isPermiso;		
		this.isPermisoDuplicarFacturacionesPorDiarios=isPermiso;
		this.isPermisoOrdenFacturacionesPorDiarios=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturacionesPorDiarios(Boolean isPermiso) {
		//this.isPermisoTodoFacturacionesPorDiarios=isPermiso;
		this.isPermisoNuevoFacturacionesPorDiarios=isPermiso;
		this.isPermisoActualizarFacturacionesPorDiarios=isPermiso;
		this.isPermisoActualizarOriginalFacturacionesPorDiarios=isPermiso;
		this.isPermisoEliminarFacturacionesPorDiarios=isPermiso;
		this.isPermisoGuardarCambiosFacturacionesPorDiarios=isPermiso;
		//this.isPermisoConsultaFacturacionesPorDiarios=isPermiso;
		//this.isPermisoBusquedaFacturacionesPorDiarios=isPermiso;
		//this.isPermisoReporteFacturacionesPorDiarios=isPermiso;
		//this.isPermisoOrdenFacturacionesPorDiarios=isPermiso;		
		//this.isPermisoPaginacionMedioFacturacionesPorDiarios=isPermiso;		
		//this.isPermisoPaginacionAltoFacturacionesPorDiarios=isPermiso;		
		//this.isPermisoPaginacionTodoFacturacionesPorDiarios=isPermiso;		
		//this.isPermisoCopiarFacturacionesPorDiarios=isPermiso;		
		//this.isPermisoDuplicarFacturacionesPorDiarios=isPermiso;
		//this.isPermisoOrdenFacturacionesPorDiarios=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturacionesPorDiariosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturacionesPorDiariosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturacionesPorDiarios(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturacionesPorDiariosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturacionesPorDiariosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturacionesPorDiariosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturacionesPorDiariosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturacionesPorDiarios() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturacionesPorDiariosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturacionesPorDiariosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturacionesPorDiarios=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturacionesPorDiarios=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturacionesPorDiarios=this.isPermisoActualizarFacturacionesPorDiarios;
			this.isPermisoEliminarFacturacionesPorDiarios=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturacionesPorDiarios=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturacionesPorDiarios=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturacionesPorDiarios=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturacionesPorDiarios=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturacionesPorDiarios=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturacionesPorDiarios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturacionesPorDiarios=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturacionesPorDiarios=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturacionesPorDiarios=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturacionesPorDiarios=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturacionesPorDiarios=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturacionesPorDiarios=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturacionesPorDiarios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturacionesPorDiarios.setToolTipText(this.jTableDatosFacturacionesPorDiarios.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturacionesPorDiarios(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturacionesPorDiarios(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturacionesPorDiariosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturacionesPorDiariosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturacionesPorDiarios() throws Exception {
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
	public void inicializarCombosForeignKeyFacturacionesPorDiariosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.tipotransaccionmodulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturacionesPorDiariosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturacionesPorDiariosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTransaccionModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyFacturacionesPorDiarios()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.facturacionespordiariosSessionBean==null) {
				this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
			}

			if(!this.facturacionespordiariosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.facturacionespordiariosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoTransaccionModulo()throws Exception {
		try {

			if(!this.facturacionespordiariosSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				TipoTransaccionModulo tipotransaccionmodulo=new TipoTransaccionModulo();
				TipoTransaccionModuloConstantesFunciones.setTipoTransaccionModuloDescripcion(tipotransaccionmodulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotransaccionmodulo.setId(null);

				if(!TipoTransaccionModuloConstantesFunciones.ExisteEnLista(this.tipotransaccionmodulosForeignKey,tipotransaccionmodulo,true)) {

					this.tipotransaccionmodulosForeignKey.add(0,tipotransaccionmodulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFacturacionesPorDiarios()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturacionesPorDiarios(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturacionesPorDiarios()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturacionesPorDiarios();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios)throws Exception {	
		try {
			
			this.setActualTipoTransaccionModuloForeignKey(facturacionespordiarios.getid_tipo_transaccion_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturacionesPorDiarios()throws Exception {	
		try {
			
			this.setActualTipoTransaccionModuloForeignKey(this.facturacionespordiariosConstantesFunciones.getid_tipo_transaccion_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturacionesPorDiarios()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturacionesPorDiarios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturacionesPorDiarios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturacionesPorDiarios()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturacionesPorDiarios()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturacionesPorDiarios(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturacionesPorDiarios()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public FacturacionesPorDiariosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturacionesPorDiariosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturacionesPorDiariosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean(); 
		this.facturacionespordiariosConstantesFunciones=new FacturacionesPorDiariosConstantesFunciones(); 
		this.facturacionespordiariosBean=new FacturacionesPorDiarios();//(this.facturacionespordiariosConstantesFunciones); 		
		this.facturacionespordiariosReturnGeneral=new FacturacionesPorDiariosParameterReturnGeneral(); 
		
		this.facturacionespordiariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturacionespordiariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturacionesPorDiariosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturacionesPorDiariosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturacionesPorDiariosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturacionesPorDiarios(true);
			
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
			
			this.facturacionespordiariosConstantesFunciones=new FacturacionesPorDiariosConstantesFunciones(); 
			this.facturacionespordiariosBean=new FacturacionesPorDiarios();//this.facturacionespordiariosConstantesFunciones); 			
			this.facturacionespordiariosReturnGeneral=new FacturacionesPorDiariosParameterReturnGeneral(); 
		
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturaciones Por Diarios Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.facturacionespordiarios=new FacturacionesPorDiarios();
			this.facturacionespordiarioss = new ArrayList<FacturacionesPorDiarios>();
			this.facturacionespordiariossAux = new ArrayList<FacturacionesPorDiarios>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic=new FacturacionesPorDiariosLogic();
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			//this.facturacionespordiariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturacionespordiariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturacionesPorDiarios);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturacionesPorDiarios);	
					}
					
					if(this.jInternalFrameImportacionFacturacionesPorDiarios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturacionesPorDiarios);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturacionesPorDiarios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturacionesPorDiarios);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturacionesPorDiarios);
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.setVisible(false);
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios);
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturacionesPorDiarios!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturacionesPorDiarios);
					this.jInternalFrameImportacionFacturacionesPorDiarios.setVisible(false);
					this.jInternalFrameImportacionFacturacionesPorDiarios.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturacionesPorDiarios!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturacionesPorDiarios);
					this.jInternalFrameOrderByFacturacionesPorDiarios.setVisible(false);
					this.jInternalFrameOrderByFacturacionesPorDiarios.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturacionesPorDiariosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturacionesPorDiariosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturacionespordiariosReturnGeneral=new FacturacionesPorDiariosParameterReturnGeneral();
			
			this.facturacionespordiariosParameterGeneral=new FacturacionesPorDiariosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturacionespordiariosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturacionesPorDiariosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturacionesPorDiariosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),this.facturacionespordiariosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturacionesPorDiariosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),this.facturacionespordiariosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaDuplicarFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaCopiarFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaVerFormFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaOrdenFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
			
			
			this.isVisibilidadBusquedaFacturacionesPorDiarios=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoTransaccionModulo=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturacionesPorDiarios();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturacionesPorDiarios(false);
			
			this.setPermisosUsuarioFacturacionesPorDiarios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() 
				|| (this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() && this.facturacionespordiariosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturacionesPorDiariosClasesRelacionadas();
			}
			
			if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturacionesPorDiariosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturacionesPorDiarios();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturacionesPorDiarios();
			}
			
			if(!this.isPermisoBusquedaFacturacionesPorDiarios) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturacionesPorDiariosConstantesFunciones.getTiposSeleccionarFacturacionesPorDiarios());
				
				this.tiposColumnasSelect=FacturacionesPorDiariosConstantesFunciones.getTiposSeleccionarFacturacionesPorDiarios(true);
				
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
			//if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturacionesPorDiarios();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioFacturacionesPorDiarios(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioFacturacionesPorDiarios(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturacionesPorDiarios() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				facturacionespordiariosImplementable= (FacturacionesPorDiariosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturacionesPorDiariosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturacionespordiariosImplementableHome= (FacturacionesPorDiariosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturacionesPorDiariosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturacionespordiarioss= new ArrayList<FacturacionesPorDiarios>();
			this.facturacionespordiariossEliminados= new ArrayList<FacturacionesPorDiarios>();
						
			this.isEsNuevoFacturacionesPorDiarios=false;
			this.esParaAccionDesdeFormularioFacturacionesPorDiarios=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturacionesPorDiarios(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturacionesPorDiarios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturacionesPorDiariosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturacionesPorDiarios(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturacionesPorDiarios();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturacionesPorDiarios();
			}
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturacionesPorDiarios.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturacionesPorDiarios.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturacionesPorDiarios.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturacionesPorDiarios(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturacionesPorDiarios: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturacionesPorDiarios() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturacionesPorDiarios")) {
				iIndex=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturacionesPorDiarios();	
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
	
	public void cargarCombosForeignKeyFacturacionesPorDiarios(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturacionesPorDiarios(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturacionesPorDiarios(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturacionesPorDiariosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturacionesPorDiarios();
		
		this.cargarCombosFrameForeignKeyFacturacionesPorDiarios();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturacionesPorDiarios();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturacionesPorDiarios();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTransaccionModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoTransaccionModulo(this.tipotransaccionmodulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFacturacionesPorDiariosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
			
			if(jTableDatosFacturacionesPorDiarios.getRowCount()>=1) {
				jTableDatosFacturacionesPorDiarios.removeRowSelectionInterval(0, jTableDatosFacturacionesPorDiarios.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturacionesPorDiarios=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturacionesPorDiarios(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturacionesPorDiarios(true);			
			//this.facturacionespordiarios=new FacturacionesPorDiarios();
			//this.facturacionespordiarios.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios() ;
			
			if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturacionesPorDiarios(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturacionespordiarios);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);				
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
			if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturacionesPorDiarios: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturacionesPorDiariosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturacionesPorDiarios.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturacionesPorDiarios.getSelectedRows().length;			
			}
			
			facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturacionesPorDiarios--;			
				//FacturacionesPorDiarios facturacionespordiariosAux= new FacturacionesPorDiarios();			
				//facturacionespordiariosAux.setId(this.iIdNuevoFacturacionesPorDiarios);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturacionesPorDiarios facturacionespordiariosOrigen=new FacturacionesPorDiarios();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturacionesPorDiarios facturacionespordiariosOrigen : facturacionespordiariossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturacionespordiariosOrigen =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturacionespordiariosOrigen =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturacionesPorDiarios();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturacionespordiarios.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturacionesPorDiarios(facturacionespordiariosOrigen,this.facturacionespordiarios,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().add(this.facturacionespordiariosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarioss.add(this.facturacionespordiariosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
				
				this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(this.getIndiceNuevoFacturacionesPorDiarios(), this.getIndiceNuevoFacturacionesPorDiarios());
				
				int iLastRow =  this.jTableDatosFacturacionesPorDiarios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturacionesPorDiarios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturacionesPorDiarios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();									
		
			FacturacionesPorDiarios facturacionespordiariosOrigen=new FacturacionesPorDiarios();
			FacturacionesPorDiarios facturacionespordiariosDestino=new FacturacionesPorDiarios();
				
			facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturacionesPorDiarios.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturacionespordiariossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturacionesPorDiarios.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionespordiariosOrigen =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturacionespordiariosOrigen =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionespordiariosDestino =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturacionespordiariosDestino =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturacionespordiariosOrigen =facturacionespordiariossSeleccionados.get(0);
				facturacionespordiariosDestino =facturacionespordiariossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturacionesPorDiarios(facturacionespordiariosOrigen,facturacionespordiariosDestino,true,false);
				
				facturacionespordiariosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturacionespordiariosDestino,facturacionespordiariosLogic.getFacturacionesPorDiarioss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturacionespordiariosDestino,facturacionespordiarioss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
				
				//this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(this.getIndiceNuevoFacturacionesPorDiarios(), this.getIndiceNuevoFacturacionesPorDiarios());
				
				int iLastRow =  this.jTableDatosFacturacionesPorDiarios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturacionesPorDiarios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturacionesPorDiarios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturacionesPorDiarios.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(!isVisible);
			this.jPanelPaginacionFacturacionesPorDiarios.setVisible(!isVisible);
			this.jPanelAccionesFacturacionesPorDiarios.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturacionesPorDiarios();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturacionesPorDiarios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturacionesPorDiarios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturacionesPorDiarios();
			
			this.abrirFrameOrderByFacturacionesPorDiarios();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturacionesPorDiarios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturacionesPorDiarios(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturacionesPorDiarios);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.isMaximum()) {
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturacionesPorDiarios.setSize(this.jInternalFrameDetalleFormFacturacionesPorDiarios.iWidthFormulario,this.jInternalFrameDetalleFormFacturacionesPorDiarios.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturacionesPorDiarios.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturacionesPorDiarios.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturacionesPorDiarios.isMaximum()) {
						this.jInternalFrameDetalleFormFacturacionesPorDiarios.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jContentPaneDetalleFacturacionesPorDiarios.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jContentPaneDetalleFacturacionesPorDiarios.getWidth(),FacturacionesPorDiariosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jContentPaneDetalleFacturacionesPorDiarios.getWidth(),FacturacionesPorDiariosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jContentPaneDetalleFacturacionesPorDiarios.getWidth(),FacturacionesPorDiariosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturacionesPorDiarios.setVisible(true);
	        this.jInternalFrameDetalleFormFacturacionesPorDiarios.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturacionesPorDiarios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturacionesPorDiarios==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturacionesPorDiarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacionesPorDiarios,false,this);
				} else {
					this.jInternalFrameOrderByFacturacionesPorDiarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacionesPorDiarios,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturacionesPorDiarios);
				this.jInternalFrameOrderByFacturacionesPorDiarios.setVisible(false);
				this.jInternalFrameOrderByFacturacionesPorDiarios.setSelected(false);
				
				this.jInternalFrameOrderByFacturacionesPorDiarios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturacionesPorDiarios"));
				
				this.inicializarActualizarBindingTablaOrderByFacturacionesPorDiarios();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturacionesPorDiarios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturacionesPorDiarios==null) {
				
				this.jInternalFrameImportacionFacturacionesPorDiarios=new ImportacionJInternalFrame(FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturacionesPorDiarios);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturacionesPorDiarios);
				this.jInternalFrameImportacionFacturacionesPorDiarios.setVisible(false);
				this.jInternalFrameImportacionFacturacionesPorDiarios.setSelected(false);


				this.jInternalFrameImportacionFacturacionesPorDiarios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturacionesPorDiarios"));
				this.jInternalFrameImportacionFacturacionesPorDiarios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturacionesPorDiarios"));
				this.jInternalFrameImportacionFacturacionesPorDiarios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturacionesPorDiarios"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturacionesPorDiarios() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios==null) {
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios=new ReporteDinamicoJInternalFrame(FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturacionesPorDiarios);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios);
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturacionesPorDiarios"));
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturacionesPorDiarios"));
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturacionesPorDiarios"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturacionesPorDiarios();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturacionesPorDiarios() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturacionesPorDiarios);
			
	       	this.jInternalFrameDetalleFormFacturacionesPorDiarios.setVisible(false);
	        this.jInternalFrameDetalleFormFacturacionesPorDiarios.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturacionesPorDiarios.dispose();
			//this.jInternalFrameDetalleFormFacturacionesPorDiarios=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturacionesPorDiarios() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturacionesPorDiarios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturacionesPorDiarios.setVisible(true);
	        this.jInternalFrameImportacionFacturacionesPorDiarios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturacionesPorDiarios() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturacionesPorDiarios.setVisible(true);
	        this.jInternalFrameOrderByFacturacionesPorDiarios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturacionesPorDiarios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturacionesPorDiarios.setVisible(false);
	        this.jInternalFrameOrderByFacturacionesPorDiarios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturacionesPorDiarios() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturacionesPorDiarios() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturacionesPorDiarios.setVisible(false);
	        this.jInternalFrameImportacionFacturacionesPorDiarios.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturacionesPorDiarios(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturacionesPorDiarios(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturacionesPorDiarios(true);
			//this.isEsNuevoFacturacionesPorDiarios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(false) ;
			
			if(facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturacionesPorDiarios(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturacionesPorDiariosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturacionesPorDiarios(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturacionesPorDiarios(true);
			//this.isEsNuevoFacturacionesPorDiarios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturacionespordiarios.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(false) ;
			
			if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturacionesPorDiarios(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTransaccionModulo(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoTransaccionModulo=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));
		TableCellEditor tableCellEditorTipoTransaccionModulo =tableColumnTipoTransaccionModulo.getCellEditor();

		TipoTransaccionModuloTableCell tipotransaccionmoduloTableCellFk=(TipoTransaccionModuloTableCell)tableCellEditorTipoTransaccionModulo;

		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKey(tipotransaccionmodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotransaccionmoduloTableCellFk.setRowActual(intSelectedRow);
			//tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKeyActual(tipotransaccionmodulosForeignKey);
		//}


		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.RecargarTipoTransaccionModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturacionesPorDiarios(false);
			
			//if(!this.isEsNuevoFacturacionesPorDiarios) {								
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				
			}
			
			if(this.permiteMantenimiento(this.facturacionespordiarios)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturacionesPorDiarios=true;
					this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
					this.isEsNuevoFacturacionesPorDiarios=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturacionesPorDiarios=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturacionesPorDiarios=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(false);
				
				this.habilitarDeshabilitarControlesFacturacionesPorDiarios(false);
			
												
				
				if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturacionesPorDiarios();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,facturacionespordiariosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturacionesPorDiarios(this.facturacionespordiarios,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturacionespordiariosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturacionespordiarios.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				this.facturacionespordiarios.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				this.facturacionespordiarios.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturacionespordiarios)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturacionesPorDiariosModel) this.jTableDatosFacturacionesPorDiarios.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturacionesPorDiarios=true;
				this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
				this.isEsNuevoFacturacionesPorDiarios=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(false);
				
				this.habilitarDeshabilitarControlesFacturacionesPorDiarios(false);
				
				
				
				if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturacionesPorDiarios();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturacionesPorDiarios.getRowCount()>=1) {
				jTableDatosFacturacionesPorDiarios.removeRowSelectionInterval(0, jTableDatosFacturacionesPorDiarios.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturacionesPorDiarios(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(false) ;
			
			this.isEsNuevoFacturacionesPorDiarios=false;
			
			if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturacionesPorDiarios();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				
				//SI ES MANUAL
				if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturacionesPorDiarios();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturacionesPorDiarios--;			
			//FacturacionesPorDiarios facturacionespordiariosAux= new FacturacionesPorDiarios();			
			//facturacionespordiariosAux.setId(this.iIdNuevoFacturacionesPorDiarios);
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturacionesPorDiarios();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
			
			this.facturacionespordiarios.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().add(this.facturacionespordiariosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturacionespordiarioss.add(this.facturacionespordiariosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
			
			this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(this.getIndiceNuevoFacturacionesPorDiarios(), this.getIndiceNuevoFacturacionesPorDiarios());
			
			int iLastRow =  this.jTableDatosFacturacionesPorDiarios.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturacionesPorDiarios.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturacionesPorDiarios.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacionesPorDiarios(false);
			
			//SI ES MANUAL
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturacionesPorDiarios();
			}
			
			//this.abrirFrameTreeFacturacionesPorDiarios();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturacionesPorDiarios.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturacionesPorDiarios.setFileImportacion(this.jInternalFrameImportacionFacturacionesPorDiarios.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturacionesPorDiarios.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturacionesPorDiarios.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturacionesPorDiarios.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturacionesPorDiarios.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		

		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturacionesPorDiariosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturacionesPorDiariosBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturacionesPorDiarioss("Todos",facturacionespordiariossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTransaccionModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTransaccionModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTransaccionModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTransaccionModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoAsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoAsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoAsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoAsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVence_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVence_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVence_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVence_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmisionDetalleCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmisionDetalleCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmisionDetalleCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmisionDetalleCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cCliente_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoria="id_tipo_transaccion_modulo";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoria="codigo_asiento_contable";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoria="fecha_vence";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE:
					sNombreCampoCategoria="fecha_emision_detalle_cliente";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL:
					sNombreCampoCategoria="monto_mone_local";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoria="ruc_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoriaValor="id_tipo_transaccion_modulo";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoriaValor="codigo_asiento_contable";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoriaValor="fecha_vence";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE:
					sNombreCampoCategoriaValor="fecha_emision_detalle_cliente";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL:
					sNombreCampoCategoriaValor="monto_mone_local";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoriaValor="ruc_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Transaccion Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_transaccion_modulo");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_asiento_contable");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vence",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vence");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision Detalle Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision_detalle_cliente");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_mone_local");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_cliente");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacionespordiarios";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturacionesPorDiarioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.gettipotransaccionmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getcodigo_asiento_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getfecha_emision_detalle_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getmonto_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE);
					iRow++;

					for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacionespordiarios.getruc_cliente());
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
			//	this.getFilaCabeceraExportarExcelFacturacionesPorDiarios(row);				
			//	iRow++;
			//}				
			
			//for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturacionesPorDiarios(facturacionespordiariosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacionesPorDiarios(false);
			
			//SI ES MANUAL
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturacionesPorDiarios();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacionesPorDiarios(false);
			
			//SI ES MANUAL
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturacionesPorDiarios();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacionesPorDiarios(false);
			
			//SI ES MANUAL
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturacionesPorDiarios();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturacionesPorDiarios() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturacionesPorDiarios.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturacionesPorDiarios.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturacionesPorDiarios.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturacionesPorDiarios.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturacionesPorDiarios.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturacionesPorDiarios.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturacionesPorDiarios.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturacionesPorDiarios(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturacionesPorDiarios(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturacionesPorDiarios(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturacionesPorDiarios(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturacionesPorDiarios(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturacionesPorDiarios(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturacionesPorDiarios(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturacionesPorDiarios() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturacionesPorDiarios();
		
		this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturacionesPorDiarios();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturacionesPorDiarios() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturacionesPorDiarios(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturacionesPorDiarios(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturacionesPorDiarios.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturacionesPorDiarios.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jCheckBoxPostAccionNuevoFacturacionesPorDiarios.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jCheckBoxPostAccionSinCerrarFacturacionesPorDiarios.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jCheckBoxPostAccionSinMensajeFacturacionesPorDiarios.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturacionesPorDiarios.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturacionesPorDiarios.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jCheckBoxPostAccionNuevoFacturacionesPorDiarios.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jCheckBoxPostAccionSinCerrarFacturacionesPorDiarios.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jCheckBoxPostAccionSinMensajeFacturacionesPorDiarios.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturacionesPorDiarios.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturacionesPorDiarios.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturacionesPorDiarios.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturacionesPorDiarios.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturacionesPorDiarios.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturacionesPorDiarios.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturacionesPorDiarios(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturacionesPorDiarios(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturacionesPorDiarios() throws Exception {
		try	{
			if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturacionesPorDiarios();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturacionesPorDiarios() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturacionesPorDiarios() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturacionesPorDiarios.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturacionesPorDiarios.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturacionesPorDiarios.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturacionesPorDiarios.addItem(reporte);
			}
			
			
			if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturacionesPorDiarios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturacionesPorDiarios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturacionesPorDiarios.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturacionesPorDiarios.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturacionesPorDiarios.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturacionesPorDiarios.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturacionesPorDiarios();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturacionesPorDiarios() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FacturacionesPorDiariosConstantesFunciones.getTiposSeleccionarFacturacionesPorDiarios(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FacturacionesPorDiariosConstantesFunciones.getTiposSeleccionarFacturacionesPorDiarios(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FacturacionesPorDiariosConstantesFunciones.getTiposSeleccionarFacturacionesPorDiarios(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturacionesPorDiarios()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.getSelectedItem()!=null){this.id_transaccionBusquedaFacturacionesPorDiarios=((Transaccion)this.jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaFacturacionesPorDiarios=new Date(this.jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.getDate().getTime());
		this.fecha_emision_hastaBusquedaFacturacionesPorDiarios=new Date(this.jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturacionesPorDiarios(Boolean esInicializar) throws Exception {				
		if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturacionesPorDiarios();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturacionesPorDiarios() throws Exception {
		this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturacionesPorDiarios() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturacionesPorDiariosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiariosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturacionesPorDiarios(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturacionespordiariosLogic.getFacturacionesPorDiarioss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturacionespordiarioss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturacionesPorDiarios.setModel(new FacturacionesPorDiariosModel(this.facturacionespordiariosLogic.getFacturacionesPorDiarioss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturacionesPorDiarios.setModel(new FacturacionesPorDiariosModel(this.facturacionespordiarioss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturacionesPorDiarios!=null && this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturacionesPorDiarios();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO,facturacionespordiariosConstantesFunciones.resaltarSeleccionarFacturacionesPorDiarios,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO,facturacionespordiariosConstantesFunciones.resaltarSeleccionarFacturacionesPorDiarios,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_ID));

		if(this.facturacionespordiariosConstantesFunciones.mostraridFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturacionespordiariosConstantesFunciones.resaltaridFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activaridFacturacionesPorDiarios,iSizeTabla,this,true,"idFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltaridFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activaridFacturacionesPorDiarios,this,true,"idFacturacionesPorDiarios","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emisionFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emisionFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarfecha_emisionFacturacionesPorDiarios,iSizeTabla,this,true,"fecha_emisionFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emisionFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarfecha_emisionFacturacionesPorDiarios,this,true,"fecha_emisionFacturacionesPorDiarios","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.facturacionespordiariosConstantesFunciones.mostrarnombre_sucursalFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturacionespordiariosConstantesFunciones.resaltarnombre_sucursalFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarnombre_sucursalFacturacionesPorDiarios,iSizeTabla,this,true,"nombre_sucursalFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarnombre_sucursalFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarnombre_sucursalFacturacionesPorDiarios,this,true,"nombre_sucursalFacturacionesPorDiarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.facturacionespordiariosConstantesFunciones.mostrarnombre_completo_clienteFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturacionespordiariosConstantesFunciones.resaltarnombre_completo_clienteFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarnombre_completo_clienteFacturacionesPorDiarios,iSizeTabla,this,true,"nombre_completo_clienteFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarnombre_completo_clienteFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarnombre_completo_clienteFacturacionesPorDiarios,this,true,"nombre_completo_clienteFacturacionesPorDiarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));

		if(this.facturacionespordiariosConstantesFunciones.mostrarid_tipo_transaccion_moduloFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoTransaccionModuloTableCell(this.tipotransaccionmodulosForeignKey,this.facturacionespordiariosConstantesFunciones.resaltarid_tipo_transaccion_moduloFacturacionesPorDiarios,this,this.facturacionespordiariosConstantesFunciones.activarid_tipo_transaccion_moduloFacturacionesPorDiarios,iSizeTabla));
			tableColumn.setCellEditor(new TipoTransaccionModuloTableCell(this.tipotransaccionmodulosForeignKey,this.facturacionespordiariosConstantesFunciones.resaltarid_tipo_transaccion_moduloFacturacionesPorDiarios,this,this.facturacionespordiariosConstantesFunciones.activarid_tipo_transaccion_moduloFacturacionesPorDiarios,true,"id_tipo_transaccion_moduloFacturacionesPorDiarios","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE));

		if(this.facturacionespordiariosConstantesFunciones.mostrarcodigo_asiento_contableFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturacionespordiariosConstantesFunciones.resaltarcodigo_asiento_contableFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarcodigo_asiento_contableFacturacionesPorDiarios,iSizeTabla,this,true,"codigo_asiento_contableFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarcodigo_asiento_contableFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarcodigo_asiento_contableFacturacionesPorDiarios,this,true,"codigo_asiento_contableFacturacionesPorDiarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE));

		if(this.facturacionespordiariosConstantesFunciones.mostrarfecha_venceFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturacionespordiariosConstantesFunciones.resaltarfecha_venceFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarfecha_venceFacturacionesPorDiarios,iSizeTabla,this,true,"fecha_venceFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarfecha_venceFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarfecha_venceFacturacionesPorDiarios,this,true,"fecha_venceFacturacionesPorDiarios","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE));

		if(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emision_detalle_clienteFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_detalle_clienteFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarfecha_emision_detalle_clienteFacturacionesPorDiarios,iSizeTabla,this,true,"fecha_emision_detalle_clienteFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_detalle_clienteFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarfecha_emision_detalle_clienteFacturacionesPorDiarios,this,true,"fecha_emision_detalle_clienteFacturacionesPorDiarios","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL));

		if(this.facturacionespordiariosConstantesFunciones.mostrarmonto_mone_localFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturacionespordiariosConstantesFunciones.resaltarmonto_mone_localFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarmonto_mone_localFacturacionesPorDiarios,iSizeTabla,this,true,"monto_mone_localFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarmonto_mone_localFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarmonto_mone_localFacturacionesPorDiarios,this,true,"monto_mone_localFacturacionesPorDiarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.facturacionespordiariosConstantesFunciones.mostrarnumero_facturaFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturacionespordiariosConstantesFunciones.resaltarnumero_facturaFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarnumero_facturaFacturacionesPorDiarios,iSizeTabla,this,true,"numero_facturaFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarnumero_facturaFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarnumero_facturaFacturacionesPorDiarios,this,true,"numero_facturaFacturacionesPorDiarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE));

		if(this.facturacionespordiariosConstantesFunciones.mostrarruc_clienteFacturacionesPorDiarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturacionespordiariosConstantesFunciones.resaltarruc_clienteFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarruc_clienteFacturacionesPorDiarios,iSizeTabla,this,true,"ruc_clienteFacturacionesPorDiarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionespordiariosConstantesFunciones.resaltarruc_clienteFacturacionesPorDiarios,this.facturacionespordiariosConstantesFunciones.activarruc_clienteFacturacionesPorDiarios,this,true,"ruc_clienteFacturacionesPorDiarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturacionesPorDiariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturacionesPorDiarios.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturacionesPorDiarios.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturacionesPorDiarios.addColumn(tableColumn);
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
			
			this.jTableDatosFacturacionesPorDiarios.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturacionesPorDiarios.moveColumn(this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturacionesPorDiarios.moveColumn(this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturacionesPorDiarios.moveColumn(this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturacionesPorDiarios.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturacionesPorDiarios.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturacionesPorDiarios,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturacionesPorDiarios.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturacionesPorDiarios.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturacionesPorDiarios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=facturacionespordiariosLogic.getFacturacionesPorDiarioss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturacionespordiarioss.size()-1;
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
		//this.jTableDatosFacturacionesPorDiarios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturacionesPorDiarios();
			
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
				
				//this.isEsNuevoFacturacionesPorDiarios=false;
					
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
				if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturacionesPorDiarios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturacionesPorDiarios.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturacionespordiarios.getsType().equals("DUPLICADO")
				   || this.facturacionespordiarios.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturacionesPorDiarios=true;
				
				} else {
					this.isEsNuevoFacturacionesPorDiarios=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
					if(this.facturacionespordiarios.getId()>=0 && !this.facturacionespordiarios.getIsNew()) {						
						this.isEsNuevoFacturacionesPorDiarios=false;
						
					} else {
						this.isEsNuevoFacturacionesPorDiarios=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturacionesPorDiarios(esRelaciones);						
				
				this.seleccionarFacturacionesPorDiarios(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturacionespordiarios.getId()<0) {
					this.isEsNuevoFacturacionesPorDiarios=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturacionesPorDiarios(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturacionesPorDiarios(evt,rowIndex);
				}	
				
				if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturacionesPorDiarios: " + this.dDif); 
					}
				}								
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturacionesPorDiarios(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturacionespordiarios)) {
					if(this.facturacionespordiarios.getId()>0) {
						this.facturacionespordiarios.setIsDeleted(true);
						
						this.facturacionespordiariossEliminados.add(this.facturacionespordiarios);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().remove(this.facturacionespordiarios);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarioss.remove(this.facturacionespordiarios);				
					}
					
					
					((FacturacionesPorDiariosModel) this.jTableDatosFacturacionesPorDiarios.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturacionesPorDiarios(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturacionesPorDiarios) {
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturacionesPorDiarios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturacionesPorDiarios.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturacionesPorDiarios(this.facturacionespordiarios);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoTransaccionModulo
					if(!this.facturacionespordiariosConstantesFunciones.cargarid_tipo_transaccion_moduloFacturacionesPorDiarios || this.facturacionespordiariosConstantesFunciones.event_dependid_tipo_transaccion_moduloFacturacionesPorDiarios) {
						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(" where id="+this.facturacionespordiarios.getid_tipo_transaccion_modulo());
									//this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
						this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

						if(facturacionespordiarios.getTipoTransaccionModulo()!=null) {
							this.tipotransaccionmodulosForeignKey.add(facturacionespordiarios.getTipoTransaccionModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
						this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
					}
					this.setActualTipoTransaccionModuloForeignKey(this.facturacionespordiarios.getid_tipo_transaccion_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturacionesPorDiarios("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturacionesPorDiarios(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturacionesPorDiarios(facturacionespordiarios,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturacionesPorDiarios(facturacionespordiarios);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturacionesPorDiarios(facturacionespordiarios,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturacionesPorDiarios(facturacionespordiarios);
	}
	
	public void setVariablesObjetoActualToFormularioFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.setText(facturacionespordiarios.getId().toString());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.setDate(facturacionespordiarios.getfecha_emision());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.setText(facturacionespordiarios.getnombre_sucursal());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.setText(facturacionespordiarios.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setText(facturacionespordiarios.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.setDate(facturacionespordiarios.getfecha_vence());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setDate(facturacionespordiarios.getfecha_emision_detalle_cliente());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.setText(facturacionespordiarios.getmonto_mone_local().toString());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.setText(facturacionespordiarios.getnumero_factura());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.setText(facturacionespordiarios.getruc_cliente());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturacionesPorDiarios facturacionespordiariosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturacionespordiariosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturacionesPorDiarios facturacionespordiariosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturacionespordiariosLocal=this.facturacionespordiarios;
			} else {
				facturacionespordiariosLocal=this.facturacionespordiariosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturacionespordiariosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturacionesPorDiarios(facturacionespordiariosLocal,true);
					
					if(facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturacionespordiariosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturacionespordiariosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(facturacionespordiarios,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(facturacionespordiarios);
	}
	
	public void setVariablesFormularioToObjetoActualFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(facturacionespordiarios,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.getText()==null || this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.getText()=="" || this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.setText("0");
			}

			if(conColumnasBase) {facturacionespordiarios.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelIdFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setfecha_emision(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_emisionFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setnombre_sucursal(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnombre_sucursalFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setnombre_completo_cliente(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnombre_completo_clienteFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setcodigo_asiento_contable(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelcodigo_asiento_contableFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setfecha_vence(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_venceFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setfecha_emision_detalle_cliente(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setmonto_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelmonto_mone_localFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setnumero_factura(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelnumero_facturaFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacionespordiarios.setruc_cliente(this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelruc_clienteFacturacionesPorDiarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiariosBean,FacturacionesPorDiarios facturacionespordiarios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && facturacionespordiariosBean.getid_tipo_transaccion_modulo()!=null && !facturacionespordiariosBean.getid_tipo_transaccion_modulo().equals(-1L))) {facturacionespordiarios.setid_tipo_transaccion_modulo(facturacionespordiariosBean.getid_tipo_transaccion_modulo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiariosOrigen,FacturacionesPorDiarios facturacionespordiarios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturacionespordiariosOrigen.getId()!=null && !facturacionespordiariosOrigen.getId().equals(0L))) {facturacionespordiarios.setId(facturacionespordiariosOrigen.getId());}}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getfecha_emision_desde()!=null && !facturacionespordiariosOrigen.getfecha_emision_desde().equals(new Date()))) {facturacionespordiarios.setfecha_emision_desde(facturacionespordiariosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getfecha_emision_hasta()!=null && !facturacionespordiariosOrigen.getfecha_emision_hasta().equals(new Date()))) {facturacionespordiarios.setfecha_emision_hasta(facturacionespordiariosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getfecha_emision()!=null && !facturacionespordiariosOrigen.getfecha_emision().equals(new Date()))) {facturacionespordiarios.setfecha_emision(facturacionespordiariosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getnombre_sucursal()!=null && !facturacionespordiariosOrigen.getnombre_sucursal().equals(""))) {facturacionespordiarios.setnombre_sucursal(facturacionespordiariosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getnombre_completo_cliente()!=null && !facturacionespordiariosOrigen.getnombre_completo_cliente().equals(""))) {facturacionespordiarios.setnombre_completo_cliente(facturacionespordiariosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getid_tipo_transaccion_modulo()!=null && !facturacionespordiariosOrigen.getid_tipo_transaccion_modulo().equals(-1L))) {facturacionespordiarios.setid_tipo_transaccion_modulo(facturacionespordiariosOrigen.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getcodigo_asiento_contable()!=null && !facturacionespordiariosOrigen.getcodigo_asiento_contable().equals(""))) {facturacionespordiarios.setcodigo_asiento_contable(facturacionespordiariosOrigen.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getfecha_vence()!=null && !facturacionespordiariosOrigen.getfecha_vence().equals(new Date()))) {facturacionespordiarios.setfecha_vence(facturacionespordiariosOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getfecha_emision_detalle_cliente()!=null && !facturacionespordiariosOrigen.getfecha_emision_detalle_cliente().equals(new Date()))) {facturacionespordiarios.setfecha_emision_detalle_cliente(facturacionespordiariosOrigen.getfecha_emision_detalle_cliente());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getmonto_mone_local()!=null && !facturacionespordiariosOrigen.getmonto_mone_local().equals(0.0))) {facturacionespordiarios.setmonto_mone_local(facturacionespordiariosOrigen.getmonto_mone_local());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getnumero_factura()!=null && !facturacionespordiariosOrigen.getnumero_factura().equals(""))) {facturacionespordiarios.setnumero_factura(facturacionespordiariosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && facturacionespordiariosOrigen.getruc_cliente()!=null && !facturacionespordiariosOrigen.getruc_cliente().equals(""))) {facturacionespordiarios.setruc_cliente(facturacionespordiariosOrigen.getruc_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.setText(facturacionespordiarios.getId().toString());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.setDate(facturacionespordiarios.getfecha_emision());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.setText(facturacionespordiarios.getnombre_sucursal());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.setText(facturacionespordiarios.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setText(facturacionespordiarios.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.setDate(facturacionespordiarios.getfecha_vence());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setDate(facturacionespordiarios.getfecha_emision_detalle_cliente());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.setText(facturacionespordiarios.getmonto_mone_local().toString());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.setText(facturacionespordiarios.getnumero_factura());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.setText(facturacionespordiarios.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturacionesPorDiarios(FacturacionesPorDiariosBean facturacionespordiariosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.setText(facturacionespordiariosBean.getId().toString());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.setDate(facturacionespordiariosBean.getfecha_emision());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.setText(facturacionespordiariosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.setText(facturacionespordiariosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setText(facturacionespordiariosBean.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.setDate(facturacionespordiariosBean.getfecha_vence());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setDate(facturacionespordiariosBean.getfecha_emision_detalle_cliente());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.setText(facturacionespordiariosBean.getmonto_mone_local().toString());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.setText(facturacionespordiariosBean.getnumero_factura());
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.setText(facturacionespordiariosBean.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturacionesPorDiarios(FacturacionesPorDiariosParameterReturnGeneral facturacionespordiariosReturnGeneral,FacturacionesPorDiariosBean facturacionespordiariosBean,Boolean conDefault) throws Exception { 
		try {
			FacturacionesPorDiarios facturacionespordiariosLocal=new FacturacionesPorDiarios();
			
			facturacionespordiariosLocal=facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturacionespordiariosLocal.getId()!=null && !facturacionespordiariosLocal.getId().equals(0L))) {facturacionespordiariosBean.setId(facturacionespordiariosLocal.getId());}}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getfecha_emision()!=null && !facturacionespordiariosLocal.getfecha_emision().equals(new Date()))) {facturacionespordiariosBean.setfecha_emision(facturacionespordiariosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getnombre_sucursal()!=null && !facturacionespordiariosLocal.getnombre_sucursal().equals(""))) {facturacionespordiariosBean.setnombre_sucursal(facturacionespordiariosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getnombre_completo_cliente()!=null && !facturacionespordiariosLocal.getnombre_completo_cliente().equals(""))) {facturacionespordiariosBean.setnombre_completo_cliente(facturacionespordiariosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getid_tipo_transaccion_modulo()!=null && !facturacionespordiariosLocal.getid_tipo_transaccion_modulo().equals(-1L))) {facturacionespordiariosBean.setid_tipo_transaccion_modulo(facturacionespordiariosLocal.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getcodigo_asiento_contable()!=null && !facturacionespordiariosLocal.getcodigo_asiento_contable().equals(""))) {facturacionespordiariosBean.setcodigo_asiento_contable(facturacionespordiariosLocal.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getfecha_vence()!=null && !facturacionespordiariosLocal.getfecha_vence().equals(new Date()))) {facturacionespordiariosBean.setfecha_vence(facturacionespordiariosLocal.getfecha_vence());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getfecha_emision_detalle_cliente()!=null && !facturacionespordiariosLocal.getfecha_emision_detalle_cliente().equals(new Date()))) {facturacionespordiariosBean.setfecha_emision_detalle_cliente(facturacionespordiariosLocal.getfecha_emision_detalle_cliente());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getmonto_mone_local()!=null && !facturacionespordiariosLocal.getmonto_mone_local().equals(0.0))) {facturacionespordiariosBean.setmonto_mone_local(facturacionespordiariosLocal.getmonto_mone_local());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getnumero_factura()!=null && !facturacionespordiariosLocal.getnumero_factura().equals(""))) {facturacionespordiariosBean.setnumero_factura(facturacionespordiariosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && facturacionespordiariosLocal.getruc_cliente()!=null && !facturacionespordiariosLocal.getruc_cliente().equals(""))) {facturacionespordiariosBean.setruc_cliente(facturacionespordiariosLocal.getruc_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturacionesPorDiariosGenerico(Long idFacturacionesPorDiariosSeleccionado,JComboBox jComboBoxFacturacionesPorDiarios,List<FacturacionesPorDiarios> facturacionespordiariossLocal)throws Exception {
		try {
			FacturacionesPorDiarios  facturacionespordiariosTemp=null;

			for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariossLocal) {
				if(facturacionespordiariosAux.getId()!=null && facturacionespordiariosAux.getId().equals(idFacturacionesPorDiariosSeleccionado)) {
					facturacionespordiariosTemp=facturacionespordiariosAux;
					break;
				}
			}

			jComboBoxFacturacionesPorDiarios.setSelectedItem(facturacionespordiariosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturacionesPorDiariosGenerico(JComboBox jComboBoxFacturacionesPorDiarios,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturacionesPorDiarios.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturacionesPorDiarios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturacionesPorDiarios.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturacionesPorDiarios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturacionespordiarios=(FacturacionesPorDiarios) facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturacionespordiarios =(FacturacionesPorDiarios) facturacionespordiarioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturacionespordiarios.getIsNew() && !facturacionespordiarios.getIsChanged() && !facturacionespordiarios.getIsDeleted()) {
				sDescripcion=facturacionespordiarios.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturacionespordiarios.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!facturacionespordiarios.getIsNew() && !facturacionespordiarios.getIsChanged() && !facturacionespordiarios.getIsDeleted()) {
				sDescripcion=facturacionespordiarios.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=facturacionespordiarios.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("TipoTransaccionModulo")) {
			//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
			if(!facturacionespordiarios.getIsNew() && !facturacionespordiarios.getIsChanged() && !facturacionespordiarios.getIsDeleted()) {
				sDescripcion=facturacionespordiarios.gettipotransaccionmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
				sDescripcion=facturacionespordiarios.gettipotransaccionmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturacionesPorDiarios facturacionespordiariosRow=new FacturacionesPorDiarios();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturacionespordiariosRow=(FacturacionesPorDiarios) facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturacionespordiariosRow=(FacturacionesPorDiarios) facturacionespordiarioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios));			
			this.jButtonDuplicarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaDuplicarFacturacionesPorDiarios && this.isPermisoDuplicarFacturacionesPorDiarios));			
			this.jButtonCopiarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaCopiarFacturacionesPorDiarios && this.isPermisoCopiarFacturacionesPorDiarios));
			this.jButtonVerFormFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaVerFormFacturacionesPorDiarios && this.isPermisoVerFormFacturacionesPorDiarios));
			
			this.jButtonAbrirOrderByFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaOrdenFacturacionesPorDiarios && this.isPermisoOrdenFacturacionesPorDiarios));			
			
			this.jButtonNuevoRelacionesFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios));			
			this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaModificarFacturacionesPorDiarios && this.isPermisoActualizarFacturacionesPorDiarios));	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaActualizarFacturacionesPorDiarios && this.isPermisoActualizarFacturacionesPorDiarios));	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaEliminarFacturacionesPorDiarios && this.isPermisoEliminarFacturacionesPorDiarios));
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarFacturacionesPorDiarios.setVisible(this.isVisibilidadCeldaCancelarFacturacionesPorDiarios);							
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaGuardarFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios));						
			this.jButtonDuplicarToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaDuplicarFacturacionesPorDiarios && this.isPermisoDuplicarFacturacionesPorDiarios));						
			this.jButtonCopiarToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaCopiarFacturacionesPorDiarios && this.isPermisoCopiarFacturacionesPorDiarios));			
			this.jButtonVerFormToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaVerFormFacturacionesPorDiarios && this.isPermisoVerFormFacturacionesPorDiarios));			
			this.jButtonAbrirOrderByToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaOrdenFacturacionesPorDiarios && this.isPermisoOrdenFacturacionesPorDiarios));
			this.jButtonNuevoRelacionesToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios));			
			this.jButtonNuevoGuardarCambiosToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));			
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaModificarFacturacionesPorDiarios && this.isPermisoActualizarFacturacionesPorDiarios));	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaActualizarFacturacionesPorDiarios  && this.isPermisoActualizarFacturacionesPorDiarios));	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaEliminarFacturacionesPorDiarios && this.isPermisoEliminarFacturacionesPorDiarios));
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarToolBarFacturacionesPorDiarios.setVisible(this.isVisibilidadCeldaCancelarFacturacionesPorDiarios);				
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaGuardarFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios));			
			this.jMenuItemDuplicarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaDuplicarFacturacionesPorDiarios && this.isPermisoDuplicarFacturacionesPorDiarios));			
			this.jMenuItemCopiarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaCopiarFacturacionesPorDiarios && this.isPermisoCopiarFacturacionesPorDiarios));			
			this.jMenuItemVerFormFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaVerFormFacturacionesPorDiarios && this.isPermisoVerFormFacturacionesPorDiarios));			
			this.jMenuItemAbrirOrderByFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaOrdenFacturacionesPorDiarios && this.isPermisoOrdenFacturacionesPorDiarios));			
			//this.jMenuItemMostrarOcultarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaOrdenFacturacionesPorDiarios && this.isPermisoOrdenFacturacionesPorDiarios));
			this.jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaOrdenFacturacionesPorDiarios && this.isPermisoOrdenFacturacionesPorDiarios));			
			//this.jMenuItemDetalleMostrarOcultarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaOrdenFacturacionesPorDiarios && this.isPermisoOrdenFacturacionesPorDiarios));			
			this.jMenuItemNuevoRelacionesFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios));			
			this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaNuevoFacturacionesPorDiarios && this.isPermisoNuevoFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));									
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemModificarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaModificarFacturacionesPorDiarios && this.isPermisoActualizarFacturacionesPorDiarios));	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemActualizarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaActualizarFacturacionesPorDiarios && this.isPermisoActualizarFacturacionesPorDiarios));	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemEliminarFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaEliminarFacturacionesPorDiarios && this.isPermisoEliminarFacturacionesPorDiarios));
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemCancelarFacturacionesPorDiarios.setVisible(this.isVisibilidadCeldaCancelarFacturacionesPorDiarios);				
			}
			
			this.jMenuItemGuardarCambiosFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaGuardarFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));						
			this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=this.jButtonNuevoFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaDuplicarFacturacionesPorDiarios=this.jButtonDuplicarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaCopiarFacturacionesPorDiarios=this.jButtonCopiarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaVerFormFacturacionesPorDiarios=this.jButtonVerFormFacturacionesPorDiarios.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturacionesPorDiarios=this.jButtonAbrirOrderByFacturacionesPorDiarios.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=this.jButtonNuevoRelacionesFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=this.jButtonModificarFacturacionesPorDiarios.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=this.jButtonNuevoToolBarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=this.jButtonNuevoRelacionesToolBarFacturacionesPorDiarios.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarToolBarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarToolBarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarToolBarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarToolBarFacturacionesPorDiarios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=this.jButtonGuardarCambiosToolBarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=this.jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=this.jMenuItemNuevoFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=this.jMenuItemNuevoRelacionesFacturacionesPorDiarios.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemModificarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemActualizarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemEliminarFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemCancelarFacturacionesPorDiarios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=this.jMenuItemGuardarCambiosFacturacionesPorDiarios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturacionesPorDiarios(Boolean esInicializar) {
		if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
				//if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturacionesPorDiarios();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturacionesPorDiarios(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturacionesPorDiarios() {
		this.jButtonNuevoFacturacionesPorDiarios.setVisible(this.isPermisoNuevoFacturacionesPorDiarios);			
		this.jButtonDuplicarFacturacionesPorDiarios.setVisible(this.isPermisoDuplicarFacturacionesPorDiarios);			
		this.jButtonCopiarFacturacionesPorDiarios.setVisible(this.isPermisoCopiarFacturacionesPorDiarios);			
		this.jButtonVerFormFacturacionesPorDiarios.setVisible(this.isPermisoVerFormFacturacionesPorDiarios);			
		
		this.jButtonAbrirOrderByFacturacionesPorDiarios.setVisible(this.isPermisoOrdenFacturacionesPorDiarios);					
		
		this.jButtonNuevoRelacionesFacturacionesPorDiarios.setVisible(this.isPermisoNuevoFacturacionesPorDiarios);			
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarFacturacionesPorDiarios.setVisible(this.isPermisoActualizarFacturacionesPorDiarios);	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarFacturacionesPorDiarios.setVisible(this.isPermisoActualizarFacturacionesPorDiarios);	
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarFacturacionesPorDiarios.setVisible(this.isPermisoEliminarFacturacionesPorDiarios);
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarFacturacionesPorDiarios.setVisible(this.isVisibilidadCeldaCancelarFacturacionesPorDiarios);						
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.setVisible(this.isPermisoGuardarCambiosFacturacionesPorDiarios);							
		}
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.setVisible(this.isPermisoActualizarFacturacionesPorDiarios);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturacionesPorDiarios() {
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarFacturacionesPorDiarios.setVisible(this.isPermisoActualizarFacturacionesPorDiarios);	
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarFacturacionesPorDiarios.setVisible(this.isPermisoActualizarFacturacionesPorDiarios);	
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarFacturacionesPorDiarios.setVisible(this.isPermisoEliminarFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarFacturacionesPorDiarios.setVisible(this.isVisibilidadCeldaCancelarFacturacionesPorDiarios);							
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.setVisible((this.isVisibilidadCeldaGuardarFacturacionesPorDiarios && this.isPermisoGuardarCambiosFacturacionesPorDiarios));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturacionesPorDiarios() {
		if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturacionesPorDiarios();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturacionesPorDiarios() {
	}
	
	public void jTableDatosFacturacionesPorDiariosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturacionesPorDiarios(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturacionespordiarios.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturacionesPorDiariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturacionesPorDiarios(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturacionesPorDiarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturacionespordiariosLogic.getConnexion());

				if(this.facturacionespordiarios.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturacionespordiarios.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturacionesPorDiarios=(TitledBorder)this.jScrollPanelDatosFacturacionesPorDiarios.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturacionesPorDiarios.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturacionespordiarios.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionFacturacionesPorDiariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebFacturacionesPorDiarios(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturacionesPorDiarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.facturacionespordiariosLogic.getConnexion());

				if(this.facturacionespordiarios.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.facturacionespordiarios.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturacionesPorDiarios=(TitledBorder)this.jScrollPanelDatosFacturacionesPorDiarios.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderFacturacionesPorDiarios.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.facturacionespordiarios.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.facturacionespordiarios.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.facturacionespordiarios.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.facturacionespordiarios.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.facturacionespordiarios.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.facturacionespordiarios.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotransaccionmodulo=true;

			idTienePermisotipotransaccionmodulo=this.tienePermisosUsuarioEnPaginaWebFacturacionesPorDiarios(TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotransaccionmodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturacionesPorDiarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturacionesPorDiarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);

				this.tipotransaccionmoduloBeanSwingJInternalFrame=new TipoTransaccionModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotransaccionmoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotransaccionmoduloBeanSwingJInternalFrame.getTipoTransaccionModuloLogic().setConnexion(this.facturacionespordiariosLogic.getConnexion());

				if(this.facturacionespordiarios.getid_tipo_transaccion_modulo()!=null) {
					this.tipotransaccionmoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setIdActual(this.facturacionespordiarios.getid_tipo_transaccion_modulo());
					this.tipotransaccionmoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTransaccionModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipotransaccionmoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturacionesPorDiarios=(TitledBorder)this.jScrollPanelDatosFacturacionesPorDiarios.getBorder();
				TitledBorder titledBordertipotransaccionmodulo=(TitledBorder)this.tipotransaccionmoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoTransaccionModulo.getBorder();

				titledBordertipotransaccionmodulo.setTitle(titledBorderFacturacionesPorDiarios.getTitle() + " -> Tipo Transaccion Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getid_tipo_transaccion_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_transaccion_modulo = "+this.facturacionespordiarios.getid_tipo_transaccion_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_asiento_contableFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getcodigo_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_asiento_contable like '%"+this.facturacionespordiarios.getcodigo_asiento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.facturacionespordiarios.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getfecha_emision_detalle_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_detalle_cliente = '"+Funciones2.getStringPostgresDate(this.facturacionespordiarios.getfecha_emision_detalle_cliente())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_mone_localFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getmonto_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_mone_local = "+this.facturacionespordiarios.getmonto_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.facturacionespordiarios.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_clienteFacturacionesPorDiariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.getfacturacionespordiarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacionespordiarios==null) {
						this.facturacionespordiarios = new FacturacionesPorDiarios();
					}

					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);
				}

				if(this.facturacionespordiarios.getruc_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_cliente like '%"+this.facturacionespordiarios.getruc_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacionesPorDiarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);

			this.getFacturacionesPorDiariossBusquedaFacturacionesPorDiarios();

			this.inicializarActualizarBindingFacturacionesPorDiarios(false);

			//if(FacturacionesPorDiariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);

			this.getFacturacionesPorDiariossFK_IdEmpresa();

			this.inicializarActualizarBindingFacturacionesPorDiarios(false);

			//if(FacturacionesPorDiariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTransaccionModuloFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);

			this.getFacturacionesPorDiariossFK_IdTipoTransaccionModulo();

			this.inicializarActualizarBindingFacturacionesPorDiarios(false);

			//if(FacturacionesPorDiariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionFacturacionesPorDiariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);

			this.getFacturacionesPorDiariossFK_IdTransaccion();

			this.inicializarActualizarBindingFacturacionesPorDiarios(false);

			//if(FacturacionesPorDiariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionespordiariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturacionesPorDiarios() {
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.dispose();
			this.jInternalFrameDetalleFormFacturacionesPorDiarios=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
			this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.dispose();
			this.jInternalFrameReporteDinamicoFacturacionesPorDiarios=null;
		}
		
		if(this.jInternalFrameImportacionFacturacionesPorDiarios!=null) {
			this.jInternalFrameImportacionFacturacionesPorDiarios.setVisible(false);	    			
			this.jInternalFrameImportacionFacturacionesPorDiarios.dispose();
			this.jInternalFrameImportacionFacturacionesPorDiarios=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturacionesPorDiarios();
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturacionesPorDiarios")) {
				jButtonDuplicarFacturacionesPorDiariosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturacionesPorDiarios")) {
				jButtonCopiarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturacionesPorDiarios")) {
				jButtonVerFormFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturacionesPorDiarios")) {
				jButtonDuplicarFacturacionesPorDiariosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturacionesPorDiarios")) {
				jButtonDuplicarFacturacionesPorDiariosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturacionesPorDiarios")) {
				jButtonModificarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturacionesPorDiarios")) {
				jButtonModificarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturacionesPorDiarios")) {
				jButtonModificarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturacionesPorDiarios")) {
				jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturacionesPorDiarios")) {
				jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturacionesPorDiarios")) {
				jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturacionesPorDiarios")) {
				jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturacionesPorDiarios")) {
				jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturacionesPorDiarios")) {
				jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturacionesPorDiarios")) {
				jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturacionesPorDiarios")) {
				jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturacionesPorDiarios")) {
				jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturacionesPorDiarios")) {
				jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturacionesPorDiarios")) {
				jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturacionesPorDiarios")) {
				jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturacionesPorDiarios")) {
				jButtonMostrarOcultarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturacionesPorDiarios")) {
				jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturacionesPorDiarios")) {
				jButtonCopiarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturacionesPorDiarios")) {
				jButtonVerFormFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturacionesPorDiarios")) {
				jButtonCopiarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturacionesPorDiarios")) {
				jButtonVerFormFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturacionesPorDiarios")) {
				jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturacionesPorDiarios")) {
				jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturacionesPorDiarios")) {
				jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturacionesPorDiarios")) {
				jButtonAnterioresFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturacionesPorDiarios")) {
				jButtonAnterioresFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturacionesPorDiarios")) {
				jButtonAnterioresFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturacionesPorDiarios")) {
				jButtonSiguientesFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturacionesPorDiarios")) {
				jButtonSiguientesFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturacionesPorDiarios")) {
				jButtonSiguientesFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturacionesPorDiarios") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturacionesPorDiarios")) {
				jButtonAbrirOrderByFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturacionesPorDiarios") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturacionesPorDiarios")) {
				jButtonMostrarOcultarFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturacionesPorDiarios")) {
				jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturacionesPorDiarios")) {
				jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturacionesPorDiarios")) {
				jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturacionesPorDiarios")) {
				jButtonCerrarReporteDinamicoFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturacionesPorDiarios")) {
				jButtonGenerarReporteDinamicoFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturacionesPorDiarios")) {
				
				jButtonGenerarExcelReporteDinamicoFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturacionesPorDiarios")) {
				jButtonCerrarImportacionFacturacionesPorDiariosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturacionesPorDiarios")) {
				
				jButtonGenerarImportacionFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturacionesPorDiarios")) {
				
				jButtonAbrirImportacionFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturacionesPorDiarios")) {
				jComboBoxTiposAccionesFacturacionesPorDiariosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturacionesPorDiarios")) {
				jComboBoxTiposRelacionesFacturacionesPorDiariosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturacionesPorDiarios")) {
				jComboBoxTiposAccionesFacturacionesPorDiariosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturacionesPorDiarios")) {
				
				jComboBoxTiposSeleccionarFacturacionesPorDiariosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturacionesPorDiarios")) {
				jTextFieldValorCampoGeneralFacturacionesPorDiariosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturacionesPorDiarios")) {
				jButtonAbrirOrderByFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturacionesPorDiarios")) {
				jButtonAbrirOrderByFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturacionesPorDiarios")) {
				jButtonCerrarOrderByFacturacionesPorDiariosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturacionesPorDiariosBusqueda")) {
				this.jButtonidFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturacionesPorDiariosUpdate")) {
				this.jButtonid_empresaFacturacionesPorDiariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturacionesPorDiariosBusqueda")) {
				this.jButtonid_empresaFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionFacturacionesPorDiariosUpdate")) {
				this.jButtonid_transaccionFacturacionesPorDiariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionFacturacionesPorDiariosBusqueda")) {
				this.jButtonid_transaccionFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emisionFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalFacturacionesPorDiariosBusqueda")) {
				this.jButtonnombre_sucursalFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturacionesPorDiariosBusqueda")) {
				this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloFacturacionesPorDiariosUpdate")) {
				this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contableFacturacionesPorDiariosBusqueda")) {
				this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_venceFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_mone_localFacturacionesPorDiariosBusqueda")) {
				this.jButtonmonto_mone_localFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaFacturacionesPorDiariosBusqueda")) {
				this.jButtonnumero_facturaFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteFacturacionesPorDiariosBusqueda")) {
				this.jButtonruc_clienteFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaFacturacionesPorDiariosFacturacionesPorDiarios")) {
				this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiariosActionPerformed(evt);
			}
			
			;
			
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturacionesPorDiarios();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturacionesPorDiarios facturacionespordiariosLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturacionespordiariosLocal=this.facturacionespordiarios;
			} else {
				facturacionespordiariosLocal=this.facturacionespordiariosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
							
				
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
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
			
			


			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionesPorDiariosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
								
						
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
								
				
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
							
				
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
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
			
			


			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
								
				
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionesPorDiariosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturacionesPorDiarios")) {
					jCheckBoxSeleccionarTodosFacturacionesPorDiariosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturacionesPorDiarios")) {
					jCheckBoxSeleccionadosFacturacionesPorDiariosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturacionesPorDiarios")) {
					
				}
				
				


				
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
												
				
				


				
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionesPorDiariosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
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
			
			


			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacionespordiarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacionespordiarios);
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
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
				
				


				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturacionesPorDiarios.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturacionesPorDiarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionesPorDiariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionespordiariosAnterior =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturacionesPorDiarios")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturacionesPorDiariosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturacionesPorDiarios.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturacionespordiarios =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturacionespordiarios);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturacionesPorDiarios")) {
				
				}
				
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturacionesPorDiarios")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturacionesPorDiarios.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturacionesPorDiarios")) {
			
			}
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturacionesPorDiarios();
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
			if(sTipo.equals("NuevoFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturacionesPorDiarios")) {
				jButtonDuplicarFacturacionesPorDiariosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturacionesPorDiarios")) {
				jButtonCopiarFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturacionesPorDiarios")) {
				jButtonVerFormFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturacionesPorDiarios")) {
				jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturacionesPorDiarios")) {
				jButtonModificarFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturacionesPorDiarios")) {
				jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturacionesPorDiarios")) {
				jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturacionesPorDiarios")) {
				jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturacionesPorDiarios")) {
				jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturacionesPorDiarios")) {
				jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturacionesPorDiarios")) {
				jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturacionesPorDiarios")) {
				jButtonAbrirOrderByFacturacionesPorDiariosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturacionesPorDiarios")) {
				jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturacionesPorDiarios")) {
				jButtonAnterioresFacturacionesPorDiariosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturacionesPorDiarios")) {
				jButtonSiguientesFacturacionesPorDiariosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturacionesPorDiariosBusqueda")) {
				this.jButtonidFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturacionesPorDiariosUpdate")) {
				this.jButtonid_empresaFacturacionesPorDiariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturacionesPorDiariosBusqueda")) {
				this.jButtonid_empresaFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionFacturacionesPorDiariosUpdate")) {
				this.jButtonid_transaccionFacturacionesPorDiariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionFacturacionesPorDiariosBusqueda")) {
				this.jButtonid_transaccionFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emisionFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalFacturacionesPorDiariosBusqueda")) {
				this.jButtonnombre_sucursalFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturacionesPorDiariosBusqueda")) {
				this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloFacturacionesPorDiariosUpdate")) {
				this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contableFacturacionesPorDiariosBusqueda")) {
				this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_venceFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda")) {
				this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_mone_localFacturacionesPorDiariosBusqueda")) {
				this.jButtonmonto_mone_localFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaFacturacionesPorDiariosBusqueda")) {
				this.jButtonnumero_facturaFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteFacturacionesPorDiariosBusqueda")) {
				this.jButtonruc_clienteFacturacionesPorDiariosBusquedaActionPerformed(evt);
			}
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturacionesPorDiarios();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturacionesPorDiarios")) {
				closingInternalFrameFacturacionesPorDiarios();
				
			} else if(sTipo.equals("jButtonCancelarFacturacionesPorDiarios")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturacionesPorDiarios = (JInternalFrameBase)evt.getSource();
	            	
	            FacturacionesPorDiariosBeanSwingJInternalFrame jInternalFrameParent=(FacturacionesPorDiariosBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturacionesPorDiarios.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturacionesPorDiariosActionPerformed(null);
			}
			
			FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturacionespordiarios,new Object(),this.facturacionespordiariosParameterGeneral,this.facturacionespordiariosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturacionesPorDiarios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturacionesPorDiarios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturacionesPorDiarios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturacionespordiarios)) {
			if(!esControlTabla) {
				if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);			
				}
				
				if(this.facturacionespordiariosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral,this.facturacionespordiariosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturacionespordiariosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturacionesPorDiarios(classes,this.facturacionespordiariosReturnGeneral,this.facturacionespordiariosBean,false);
					}
						
					if(this.facturacionespordiariosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios());	
					}
						
					if(this.facturacionespordiariosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturacionesPorDiarios(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios(),classes);//this.facturacionespordiariosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturacionesPorDiarios(this.facturacionespordiarios,classes);//this.facturacionespordiariosBean);									
				}
			
				if(FacturacionesPorDiariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturacionesPorDiarios(this.facturacionespordiarios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacionesPorDiarios(this.facturacionespordiarios);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturacionespordiariosAnterior!=null) {
						this.facturacionespordiarios=this.facturacionespordiariosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturacionespordiariosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturacionespordiariosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios(),facturacionespordiariosLogic.getFacturacionesPorDiarioss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarios(),this.facturacionespordiarioss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturacionesPorDiarios.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturacionesPorDiarios.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturacionesPorDiarios();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturacionesPorDiarios() throws Exception {
		
		FacturacionesPorDiariosModel facturacionespordiariosModel=(FacturacionesPorDiariosModel)this.jTableDatosFacturacionesPorDiarios.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturacionespordiariosModel.facturacionespordiarioss=this.facturacionespordiariosLogic.getFacturacionesPorDiarioss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturacionespordiariosModel.facturacionespordiarioss=this.facturacionespordiarioss;
		}
		
		
		((FacturacionesPorDiariosModel) this.jTableDatosFacturacionesPorDiarios.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturacionesPorDiarios() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturacionespordiariosAnterior(),this.facturacionespordiariosLogic.getFacturacionesPorDiarioss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturacionespordiariosAnterior(),this.facturacionespordiarioss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturacionesPorDiarios();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
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
										
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturacionespordiarios,new Object(),generalEntityParameterGeneral,this.facturacionespordiariosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturacionesPorDiariosConstantesFunciones.getClassesRelationshipsOfFacturacionesPorDiarios(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturacionesPorDiariosConstantesFunciones.getClassesRelationshipsFromStringsOfFacturacionesPorDiarios(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturacionesPorDiarios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturacionespordiarios,new Object(),generalEntityParameterGeneral,this.facturacionespordiariosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturacionesPorDiarios(FacturacionesPorDiariosBean facturacionespordiariosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturacionesPorDiarios(ArrayList<Classe> classes,FacturacionesPorDiariosReturnGeneral facturacionespordiariosReturnGeneral,FacturacionesPorDiariosBean facturacionespordiariosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturacionespordiarios)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios = new FacturacionesPorDiariosDetalleFormJInternalFrame(jDesktopPane,this.facturacionespordiariosSessionBean.getConGuardarRelaciones(),this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.setVisible(false);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.facturacionespordiariosLogic=this.facturacionespordiariosLogic;
		
		this.cargarCombosFrameForeignKeyFacturacionesPorDiarios("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturacionesPorDiarios();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturacionesPorDiarios();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturacionesPorDiarios("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturacionesPorDiarios();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturacionesPorDiarios"));
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"ModificarFacturacionesPorDiarios"));

		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarToolBarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturacionesPorDiarios"));
					
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemModificarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturacionesPorDiarios"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"ActualizarFacturacionesPorDiarios"));
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarToolBarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturacionesPorDiarios"));
						
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemActualizarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturacionesPorDiarios"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"EliminarFacturacionesPorDiarios"));
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturacionesPorDiarios"));
								
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemEliminarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturacionesPorDiarios"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CancelarFacturacionesPorDiarios"));
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturacionesPorDiarios"));
					
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemCancelarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturacionesPorDiarios"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemDetalleCerrarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturacionesPorDiarios"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturacionesPorDiarios"));
		
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturacionesPorDiarios"));
		
		
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturacionesPorDiarios"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonidFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"idFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_empresaFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_empresaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_transaccionFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_transaccionFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_venceFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"monto_mone_localFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonruc_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteFacturacionesPorDiariosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturacionesPorDiarios"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturacionesPorDiarios"));
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturacionesPorDiarios"));
		}
		
		this.jTableDatosFacturacionesPorDiarios.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturacionesPorDiarios"));
		
		this.jTableDatosFacturacionesPorDiarios.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturacionesPorDiarios"));
		
		this.jButtonNuevoFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"NuevoFacturacionesPorDiarios"));
		
		this.jButtonDuplicarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"DuplicarFacturacionesPorDiarios"));
		
		this.jButtonCopiarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"CopiarFacturacionesPorDiarios"));
		
		this.jButtonVerFormFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"VerFormFacturacionesPorDiarios"));
		
		
		this.jButtonNuevoToolBarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturacionesPorDiarios"));
			
		this.jButtonDuplicarToolBarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturacionesPorDiarios"));
			
		this.jMenuItemNuevoFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturacionesPorDiarios"));
			
		this.jMenuItemDuplicarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturacionesPorDiarios"));		
		
		
		this.jButtonNuevoRelacionesFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturacionesPorDiarios"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturacionesPorDiarios"));
			
		this.jMenuItemNuevoRelacionesFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturacionesPorDiarios"));		
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"ModificarFacturacionesPorDiarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonModificarToolBarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturacionesPorDiarios"));
			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemModificarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturacionesPorDiarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"ActualizarFacturacionesPorDiarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonActualizarToolBarFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturacionesPorDiarios"));
				
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemActualizarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturacionesPorDiarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"EliminarFacturacionesPorDiarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonEliminarToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturacionesPorDiarios"));
						
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemEliminarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturacionesPorDiarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CancelarFacturacionesPorDiarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonCancelarToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturacionesPorDiarios"));
			
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemCancelarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturacionesPorDiarios"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturacionesPorDiarios"));		
		
		
		this.jButtonCerrarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CerrarFacturacionesPorDiarios"));
		
		
		this.jButtonCerrarToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturacionesPorDiarios"));
			
		this.jMenuItemCerrarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturacionesPorDiarios"));
			
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jMenuItemDetalleCerrarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturacionesPorDiarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturacionesPorDiarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturacionesPorDiarios"));
		}
		
		this.jButtonCopiarToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturacionesPorDiarios"));
			
		this.jButtonVerFormToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturacionesPorDiarios"));
		
		this.jMenuItemGuardarCambiosFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturacionesPorDiarios"));
			
		this.jMenuItemCopiarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturacionesPorDiarios"));		
		
		this.jMenuItemVerFormFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturacionesPorDiarios"));		
		
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturacionesPorDiarios"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturacionesPorDiarios"));
			
		this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturacionesPorDiarios"));		
		
		
		
		this.jButtonRecargarInformacionFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturacionesPorDiarios"));
					
		this.jButtonRecargarInformacionToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturacionesPorDiarios"));
		
		this.jMenuItemRecargarInformacionFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturacionesPorDiarios"));		
		
		
		
		this.jButtonAnterioresFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"AnterioresFacturacionesPorDiarios"));
		
		
		this.jButtonAnterioresToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturacionesPorDiarios"));
		
		this.jMenuItemAnterioresFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturacionesPorDiarios"));		
		
		
		this.jButtonSiguientesFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"SiguientesFacturacionesPorDiarios"));
		
		
		this.jButtonSiguientesToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturacionesPorDiarios"));
			
		this.jMenuItemSiguientesFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturacionesPorDiarios"));
			
		this.jMenuItemAbrirOrderByFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturacionesPorDiarios"));
			
		this.jMenuItemMostrarOcultarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturacionesPorDiarios"));
			
		this.jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturacionesPorDiarios"));
			
		this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturacionesPorDiarios"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturacionesPorDiarios"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturacionesPorDiarios"));
			
		this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturacionesPorDiarios"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturacionesPorDiarios"));

		this.jCheckBoxSeleccionadosFacturacionesPorDiarios.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturacionesPorDiarios"));
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturacionesPorDiarios"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturacionesPorDiarios"));
			
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturacionesPorDiarios"));
					
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturacionesPorDiarios"));
			
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturacionesPorDiarios"));		
		
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonidFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"idFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_empresaFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_empresaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_transaccionFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_transaccionFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_venceFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"monto_mone_localFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonruc_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteFacturacionesPorDiariosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"BusquedaFacturacionesPorDiariosFacturacionesPorDiarios"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturacionesPorDiarios!=null) {
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturacionesPorDiarios"));
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturacionesPorDiarios"));
				this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturacionesPorDiarios"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturacionesPorDiarios"));				
			//this.jButtonGenerarReporteDinamicoFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturacionesPorDiarios"));
			//this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturacionesPorDiarios"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturacionesPorDiarios!=null) {
				this.jInternalFrameImportacionFacturacionesPorDiarios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturacionesPorDiarios"));
				this.jInternalFrameImportacionFacturacionesPorDiarios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturacionesPorDiarios"));
				this.jInternalFrameImportacionFacturacionesPorDiarios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturacionesPorDiarios"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturacionesPorDiarios"));
			
			this.jButtonAbrirOrderByToolBarFacturacionesPorDiarios.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturacionesPorDiarios"));			
			
			if(this.jInternalFrameOrderByFacturacionesPorDiarios!=null) {
				this.jInternalFrameOrderByFacturacionesPorDiarios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturacionesPorDiarios"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTabbedPaneRelacionesFacturacionesPorDiarios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturacionesPorDiarios"));
		
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
            		closingInternalFrameFacturacionesPorDiarios();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturacionesPorDiarios = (JInternalFrameBase)event.getSource();
	            	
	            FacturacionesPorDiariosBeanSwingJInternalFrame jInternalFrameParent=(FacturacionesPorDiariosBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturacionesPorDiarios.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturacionesPorDiariosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturacionesPorDiarios.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturacionesPorDiariosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturacionesPorDiarios.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturacionesPorDiarios.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturacionesPorDiarios";
		inputMap = this.jButtonNuevoFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturacionesPorDiarios";
		inputMap = this.jButtonNuevoRelacionesFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturacionesPorDiariosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturacionesPorDiarios";
		inputMap = this.jButtonModificarFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturacionesPorDiariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturacionesPorDiarios";
		inputMap = this.jButtonActualizarFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturacionesPorDiariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturacionesPorDiarios";
		inputMap = this.jButtonEliminarFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturacionesPorDiariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturacionesPorDiarios";
		inputMap = this.jButtonCancelarFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturacionesPorDiarios";
		inputMap = this.jButtonCerrarFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturacionesPorDiariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturacionesPorDiarios";
		inputMap = this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonGuardarCambiosFacturacionesPorDiarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturacionesPorDiariosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturacionesPorDiarios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturacionesPorDiariosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturacionesPorDiariosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturacionesPorDiariosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonidFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"idFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_empresaFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_empresaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_transaccionFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_transaccionFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturacionesPorDiariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_venceFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"monto_mone_localFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaFacturacionesPorDiariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jButtonruc_clienteFacturacionesPorDiariosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteFacturacionesPorDiariosBusqueda"));
		
		
		this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.addActionListener(new ButtonActionListener(this,"BusquedaFacturacionesPorDiariosFacturacionesPorDiarios"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturacionesPorDiarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturacionesPorDiariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturacionesPorDiariosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturacionesPorDiarios(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
					facturacionespordiariosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiarioss) {
					facturacionespordiariosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturacionesPorDiariosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
						facturacionespordiariosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiarioss) {
						facturacionespordiariosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiarioss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturacionesPorDiarios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturacionesPorDiarios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturacionesPorDiariosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturacionesPorDiarios.getSelectedRows();
			
			FacturacionesPorDiarios facturacionespordiariosLocal=new FacturacionesPorDiarios();
			
			//this.seleccionarTodosFacturacionesPorDiarios(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturacionespordiariosLocal =(FacturacionesPorDiarios) this.facturacionespordiariosLogic.getFacturacionesPorDiarioss().toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturacionespordiariosLocal =(FacturacionesPorDiarios) this.facturacionespordiarioss.toArray()[this.jTableDatosFacturacionesPorDiarios.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturacionespordiariosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
						facturacionespordiariosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiarioss) {
						facturacionespordiariosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturacionesPorDiarios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturacionesPorDiarios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturacionesPorDiarios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturacionesPorDiariosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturacionesPorDiariosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturacionesPorDiariosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturacionesPorDiarios.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
				
						if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							facturacionespordiariosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturacionespordiariosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							facturacionespordiariosAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							facturacionespordiariosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision_detalle_cliente(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL)) {
							existe=true;
							facturacionespordiariosAux.setmonto_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							facturacionespordiariosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							facturacionespordiariosAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiarioss) {
					
						if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							facturacionespordiariosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturacionespordiariosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							facturacionespordiariosAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							facturacionespordiariosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE)) {
							existe=true;
							facturacionespordiariosAux.setfecha_emision_detalle_cliente(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL)) {
							existe=true;
							facturacionespordiariosAux.setmonto_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							facturacionespordiariosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							facturacionespordiariosAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturacionesPorDiariosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturacionesPorDiarios=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturacionesPorDiarios.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturacionesPorDiarios) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturacionesPorDiarios(conSplash);
				
					this.generarReporteFacturacionesPorDiariossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturacionesPorDiariossSeleccionados();
				//this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturacionesPorDiariossSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturacionesPorDiariossSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturacionesPorDiarios();
				
				this.exportarFacturacionesPorDiariossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturacionesPorDiarioss();
				//this.importarFacturacionesPorDiarioss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturacionesPorDiarios();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturacionesPorDiariossSeleccionados();
				//this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Facturaciones Por Diarios", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturacionesPorDiarios();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturacionesPorDiarios)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturacionesPorDiarios(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturacionesPorDiariosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturacionesPorDiarios) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturacionesPorDiarios(conSplash);
					
						//this.actualizarParametrosGeneralFacturacionesPorDiarios();
						
						this.generarReporteProcesoAccionFacturacionesPorDiariossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Facturaciones Por DiariosES SELECCIONADOS?", "MANTENIMIENTO DE Facturaciones Por Diarios", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturacionesPorDiarios();
				
						this.actualizarParametrosGeneralFacturacionesPorDiarios();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturacionespordiariosReturnGeneral=facturacionespordiariosLogic.procesarAccionFacturacionesPorDiariossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturacionespordiariosLogic.getFacturacionesPorDiarioss(),this.facturacionespordiariosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturacionesPorDiariosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturacionesPorDiarios();
					
					FacturacionesPorDiariosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturacionesPorDiariosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturacionesPorDiarios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturacionesPorDiarios(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturacionesPorDiariosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturacionesPorDiarios();
			
			if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
			FacturacionesPorDiarios facturacionespordiarios=new FacturacionesPorDiarios();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturacionesPorDiarios(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturacionesPorDiarios.getSelectedItem();
			
			
			
			
			facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturacionespordiariossSeleccionados.size()==1) {
				for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariossSeleccionados) {
					facturacionespordiarios=facturacionespordiariosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturacionesPorDiarios();
			
      		//this.finishProcessFacturacionesPorDiarios(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturacionesPorDiariosReturnGeneral() throws Exception {
		if(this.facturacionespordiariosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturacionespordiariosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturacionespordiariosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturacionespordiariosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturacionespordiariosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturacionespordiariosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturacionesPorDiarios(false);
		}
		
		if(this.facturacionespordiariosReturnGeneral.getConRetornoLista() || this.facturacionespordiariosReturnGeneral.getConRetornoObjeto()) {
			if(this.facturacionespordiariosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturacionespordiariosLogic.setFacturacionesPorDiarioss(this.facturacionespordiariosReturnGeneral.getFacturacionesPorDiarioss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingFacturacionesPorDiarios(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturacionesPorDiarios() throws Exception {
		
		
	}
	
	public ArrayList<FacturacionesPorDiarios> getFacturacionesPorDiariossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturacionesPorDiarios) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariosLogic.getFacturacionesPorDiarioss()) {
					if(facturacionespordiariosAux.getIsSelected()) {
						facturacionespordiariossSeleccionados.add(facturacionespordiariosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturacionesPorDiarios facturacionespordiariosAux:this.facturacionespordiarioss) {
					if(facturacionespordiariosAux.getIsSelected()) {
						facturacionespordiariossSeleccionados.add(facturacionespordiariosAux);				
					}
				}
			}
			
			if(facturacionespordiariossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturacionespordiariossSeleccionados.addAll(this.facturacionespordiariosLogic.getFacturacionesPorDiarioss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturacionespordiariossSeleccionados.addAll(this.facturacionespordiarioss);				
					}
				}
			}
		} else {
			facturacionespordiariossSeleccionados.add(this.facturacionespordiarios);
		}
		
		return facturacionespordiariossSeleccionados;
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
	
	public void generarReporteFacturacionesPorDiariossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturacionesPorDiariossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturacionesPorDiariossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturacionesPorDiariossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturacionesPorDiariossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Facturaciones Por Diarios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturacionesPorDiariossSeleccionados() throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturacionesPorDiarioss("Todos",facturacionespordiariossSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturacionesPorDiariossSeleccionados() throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturacionesPorDiarioss("Todos",facturacionespordiariossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturacionesPorDiariossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturacionesPorDiarioss("Todos",facturacionespordiariossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturacionesPorDiariossSeleccionados() throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturacionesPorDiarios();
		
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturacionesPorDiarios();
		
		
		//this.generarReporteFacturacionesPorDiarioss("Todos",facturacionespordiariossSeleccionados ,facturacionespordiariosImplementable,facturacionespordiariosImplementableHome);
	}
	
	public void mostrarImportacionFacturacionesPorDiarioss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturacionesPorDiarios();
		
		this.abrirFrameImportacionFacturacionesPorDiarios();		
		
			
		//this.generarReporteFacturacionesPorDiarioss("Todos",facturacionespordiariossSeleccionados ,facturacionespordiariosImplementable,facturacionespordiariosImplementableHome);
	}
	
	public void importarFacturacionesPorDiarioss() throws Exception {		
	
	}
	
	public void exportarFacturacionesPorDiariossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturacionesPorDiariossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturacionesPorDiariossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturacionesPorDiariossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Facturaciones Por Diarios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturacionesPorDiariossSeleccionados() throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacionespordiarios."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturacionesPorDiarios(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturacionesPorDiarios(facturacionespordiariosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturacionespordiariosAux.setsDetalleGeneralEntityReporte(facturacionespordiariosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturacionesPorDiarios(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturacionespordiarios.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.gettipotransaccionmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getcodigo_asiento_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getfecha_emision_detalle_cliente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getmonto_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacionespordiarios.getruc_cliente();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturacionesPorDiariossSeleccionados() throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacionespordiarios.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturacionesPorDiarioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturacionesPorDiarios(row);				
				iRow++;
			}				
			
			for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturacionesPorDiarios(facturacionespordiariosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturacionesPorDiariossSeleccionados() throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();		
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacionespordiarios.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturacionespordiarioss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturacionespordiarios");
			//elementRoot.appendChild(element);
		
			for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariossSeleccionados) {
				element = document.createElement("facturacionespordiarios");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturacionesPorDiarios(facturacionespordiariosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturaciones Por Diarios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturacionesPorDiarios(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.gettipotransaccionmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getcodigo_asiento_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getfecha_emision_detalle_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getmonto_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacionespordiarios.getruc_cliente());				
	}
	
	public void setFilaDatosExportarXmlFacturacionesPorDiarios(FacturacionesPorDiarios facturacionespordiarios,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturacionesPorDiariosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturacionespordiarios.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturacionesPorDiariosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturacionespordiarios.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FacturacionesPorDiariosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturacionespordiarios.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtransaccion_descripcion = document.createElement(FacturacionesPorDiariosConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(facturacionespordiarios.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementfecha_emision_desde = document.createElement(FacturacionesPorDiariosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(facturacionespordiarios.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(FacturacionesPorDiariosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(facturacionespordiarios.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementfecha_emision = document.createElement(FacturacionesPorDiariosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(facturacionespordiarios.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnombre_sucursal = document.createElement(FacturacionesPorDiariosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(facturacionespordiarios.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_completo_cliente = document.createElement(FacturacionesPorDiariosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(facturacionespordiarios.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementtipotransaccionmodulo_descripcion = document.createElement(FacturacionesPorDiariosConstantesFunciones.IDTIPOTRANSACCIONMODULO);
		elementtipotransaccionmodulo_descripcion.appendChild(document.createTextNode(facturacionespordiarios.gettipotransaccionmodulo_descripcion()));
		element.appendChild(elementtipotransaccionmodulo_descripcion);

		Element elementcodigo_asiento_contable = document.createElement(FacturacionesPorDiariosConstantesFunciones.CODIGOASIENTOCONTABLE);
		elementcodigo_asiento_contable.appendChild(document.createTextNode(facturacionespordiarios.getcodigo_asiento_contable().trim()));
		element.appendChild(elementcodigo_asiento_contable);

		Element elementfecha_vence = document.createElement(FacturacionesPorDiariosConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(facturacionespordiarios.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementfecha_emision_detalle_cliente = document.createElement(FacturacionesPorDiariosConstantesFunciones.FECHAEMISIONDETALLECLIENTE);
		elementfecha_emision_detalle_cliente.appendChild(document.createTextNode(facturacionespordiarios.getfecha_emision_detalle_cliente().toString().trim()));
		element.appendChild(elementfecha_emision_detalle_cliente);

		Element elementmonto_mone_local = document.createElement(FacturacionesPorDiariosConstantesFunciones.MONTOMONELOCAL);
		elementmonto_mone_local.appendChild(document.createTextNode(facturacionespordiarios.getmonto_mone_local().toString().trim()));
		element.appendChild(elementmonto_mone_local);

		Element elementnumero_factura = document.createElement(FacturacionesPorDiariosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(facturacionespordiarios.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementruc_cliente = document.createElement(FacturacionesPorDiariosConstantesFunciones.RUCCLIENTE);
		elementruc_cliente.appendChild(document.createTextNode(facturacionespordiarios.getruc_cliente().trim()));
		element.appendChild(elementruc_cliente);
	}
	
	public void generarReporteGroupGenericoFacturacionesPorDiariossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados=new ArrayList<FacturacionesPorDiarios>();
		
		facturacionespordiariossSeleccionados=this.getFacturacionesPorDiariossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturacionesPorDiarios(facturacionespordiariossSeleccionados);
		
		this.generarReporteFacturacionesPorDiarioss("Todos",facturacionespordiariossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturacionesPorDiarios(ArrayList<FacturacionesPorDiarios> facturacionespordiariossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturacionesPorDiarios facturacionespordiariosAux:facturacionespordiariossSeleccionados) {
				facturacionespordiariosAux.setsDetalleGeneralEntityReporte(facturacionespordiariosAux.toString());
			
				if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturacionespordiariosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturacionespordiariosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturacionespordiariosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.gettipotransaccionmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.getcodigo_asiento_contable());
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturacionespordiariosAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturacionespordiariosAux.getfecha_emision_detalle_cliente()));
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE)) {
					existe=true;
					facturacionespordiariosAux.setsDescripcionGeneralEntityReporte1(facturacionespordiariosAux.getruc_cliente());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionesPorDiariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturacionesPorDiarios(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=true;
				this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=true;
			}
			
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaModificarFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=true;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=true;
		} else {
			this.actualizarEstadoPanelsFacturacionesPorDiarios(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturacionesPorDiarios=false;
			//this.isVisibilidadCeldaVerFormFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaDuplicarFacturacionesPorDiarios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			if(!facturacionespordiariosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;												
			}
			
			this.jButtonCerrarFacturacionesPorDiarios.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
		}
		
		if(!this.permiteMantenimiento(this.facturacionespordiarios)) {
			this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
			this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoFacturacionesPorDiarios=false;
		this.isVisibilidadCeldaNuevoRelacionesFacturacionesPorDiarios=false;
		this.isVisibilidadCeldaGuardarCambiosFacturacionesPorDiarios=false;
		//this.isVisibilidadCeldaModificarFacturacionesPorDiarios=true;
		this.isVisibilidadCeldaActualizarFacturacionesPorDiarios=false;
		this.isVisibilidadCeldaEliminarFacturacionesPorDiarios=false;
		//this.isVisibilidadCeldaCancelarFacturacionesPorDiarios=true;			
		this.isVisibilidadCeldaGuardarFacturacionesPorDiarios=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturacionesPorDiarios() {
	}
	
	public void actualizarEstadoPanelsFacturacionesPorDiarios(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacionesPorDiarios!=null) {
				this.jPanelPaginacionFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosFacturacionesPorDiarios.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturacionesPorDiarios!=null) {
				this.jPanelPaginacionFacturacionesPorDiarios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosFacturacionesPorDiarios.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturacionesPorDiarios!=null) {
				this.jPanelPaginacionFacturacionesPorDiarios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosFacturacionesPorDiarios.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturacionesPorDiarios!=null) {
				this.jPanelPaginacionFacturacionesPorDiarios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacionesPorDiarios!=null) {
				this.jPanelPaginacionFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacionesPorDiarios!=null) {
				this.jPanelPaginacionFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturacionesPorDiarios!=null) {
				this.jScrollPanelDatosFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacionesPorDiarios!=null) {
				this.jPanelPaginacionFacturacionesPorDiarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
					this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturacionesPorDiarios!=null) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturacionesPorDiarios!=null) {
				this.jPanelParametrosReportesFacturacionesPorDiarios.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaFacturacionesPorDiarios=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaFacturacionesPorDiarios) {this.jTabbedPaneBusquedasFacturacionesPorDiarios.remove(jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaFacturacionesPorDiarios=isParaTransaccion;
			if(!this.isVisibilidadBusquedaFacturacionesPorDiarios) {this.jTabbedPaneBusquedasFacturacionesPorDiarios.remove(jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTransaccionModulo(Boolean isParaTipoTransaccionModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTransaccionModuloNegation=!isParaTipoTransaccionModulo;

			this.isVisibilidadBusquedaFacturacionesPorDiarios=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadBusquedaFacturacionesPorDiarios) {this.jTabbedPaneBusquedasFacturacionesPorDiarios.remove(jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFacturacionesPorDiarios(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturacionesPorDiarios() {
		this.updateBorderResaltarBusquedasFormularioFacturacionesPorDiarios();
		this.updateVisibilidadBusquedasFormularioFacturacionesPorDiarios();
		this.updateHabilitarBusquedasFormularioFacturacionesPorDiarios();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturacionesPorDiarios() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturacionesPorDiarios.getComponents().length>0) {
	

		if(this.facturacionespordiariosConstantesFunciones.resaltarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios!=null) {
			index= this.jTabbedPaneBusquedasFacturacionesPorDiarios.indexOfComponent(this.jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturacionesPorDiarios.getComponent(index);
				jPanel.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturacionesPorDiarios() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturacionesPorDiarios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturacionesPorDiarios.indexOfComponent(this.jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturacionesPorDiarios.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
			if(!this.facturacionespordiariosConstantesFunciones.mostrarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios && index>-1) {
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturacionesPorDiarios() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturacionesPorDiarios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturacionesPorDiarios.indexOfComponent(this.jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturacionesPorDiarios.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturacionespordiariosConstantesFunciones.activarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
				this.jTabbedPaneBusquedasFacturacionesPorDiarios.setEnabledAt(index,this.facturacionespordiariosConstantesFunciones.activarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturacionesPorDiarios(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaFacturacionesPorDiarios")) {
			index= this.jTabbedPaneBusquedasFacturacionesPorDiarios.indexOfComponent(this.jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);

			this.jTabbedPaneBusquedasFacturacionesPorDiarios.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturacionesPorDiarios.getComponent(index);

			this.facturacionespordiariosConstantesFunciones.setResaltarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios(resaltar);

			jPanel.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturacionesPorDiarios.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFacturacionesPorDiarios() throws Exception {

		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturacionesPorDiarios();
		this.updateVisibilidadResaltarControlesFormularioFacturacionesPorDiarios();
		this.updateHabilitarResaltarControlesFormularioFacturacionesPorDiarios();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturacionesPorDiarios() throws Exception {
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturacionespordiariosConstantesFunciones.resaltaridFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltaridFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarid_empresaFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarid_empresaFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarid_transaccionFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarid_transaccionFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_desdeFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_desdeFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_hastaFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_hastaFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emisionFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emisionFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarnombre_sucursalFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarnombre_sucursalFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarnombre_completo_clienteFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarnombre_completo_clienteFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarid_tipo_transaccion_moduloFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarid_tipo_transaccion_moduloFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarcodigo_asiento_contableFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarcodigo_asiento_contableFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarfecha_venceFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarfecha_venceFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_detalle_clienteFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarfecha_emision_detalle_clienteFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarmonto_mone_localFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarmonto_mone_localFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarnumero_facturaFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarnumero_facturaFacturacionesPorDiarios);}
		if(this.facturacionespordiariosConstantesFunciones.resaltarruc_clienteFacturacionesPorDiarios!=null && this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.setBorder(this.facturacionespordiariosConstantesFunciones.resaltarruc_clienteFacturacionesPorDiarios);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturacionesPorDiarios() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
	
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostraridFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelidFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostraridFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarid_empresaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelid_empresaFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarid_empresaFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarid_transaccionFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelid_transaccionFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarid_transaccionFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emision_desdeFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelfecha_emision_desdeFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emision_desdeFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emision_hastaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelfecha_emision_hastaFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emision_hastaFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emisionFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelfecha_emisionFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emisionFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarnombre_sucursalFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelnombre_sucursalFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarnombre_sucursalFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarnombre_completo_clienteFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelnombre_completo_clienteFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarnombre_completo_clienteFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarid_tipo_transaccion_moduloFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarid_tipo_transaccion_moduloFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarcodigo_asiento_contableFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelcodigo_asiento_contableFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarcodigo_asiento_contableFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_venceFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelfecha_venceFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_venceFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emision_detalle_clienteFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarfecha_emision_detalle_clienteFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarmonto_mone_localFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelmonto_mone_localFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarmonto_mone_localFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarnumero_facturaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelnumero_facturaFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarnumero_facturaFacturacionesPorDiarios);
		//this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarruc_clienteFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jPanelruc_clienteFacturacionesPorDiarios.setVisible(this.facturacionespordiariosConstantesFunciones.mostrarruc_clienteFacturacionesPorDiarios);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturacionesPorDiarios() throws Exception {
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturacionesPorDiarios!=null) {
	
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jLabelidFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activaridFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_empresaFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarid_empresaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_transaccionFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarid_transaccionFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarfecha_emision_desdeFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarfecha_emision_hastaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emisionFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarfecha_emisionFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_sucursalFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarnombre_sucursalFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextAreanombre_completo_clienteFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarnombre_completo_clienteFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarid_tipo_transaccion_moduloFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarcodigo_asiento_contableFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_venceFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarfecha_venceFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarfecha_emision_detalle_clienteFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldmonto_mone_localFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarmonto_mone_localFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldnumero_facturaFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarnumero_facturaFacturacionesPorDiarios);
		this.jInternalFrameDetalleFormFacturacionesPorDiarios.jTextFieldruc_clienteFacturacionesPorDiarios.setEnabled(this.facturacionespordiariosConstantesFunciones.activarruc_clienteFacturacionesPorDiarios);
		}
	}
	
		
}