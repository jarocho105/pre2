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

//import com.bydan.erp.sris.util.TransaccionesLocalesNotasCreditosConstantesFunciones;
import com.bydan.erp.sris.util.report.TransaccionesLocalesNotasCreditosParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.TransaccionesLocalesNotasCreditosParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.TransaccionesLocalesNotasCreditosBean;
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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame extends TransaccionesLocalesNotasCreditosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditosValidator = new ClassValidator<TransaccionesLocalesNotasCreditos>(TransaccionesLocalesNotasCreditos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos;	
	public TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux;
	public TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosTotales;
	public Long idTransaccionesLocalesNotasCreditosActual;
	public Long iIdNuevoTransaccionesLocalesNotasCreditos=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
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
	
	public Boolean isPermisoTodoTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoNuevoTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoActualizarTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoActualizarOriginalTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoEliminarTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoConsultaTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoBusquedaTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoReporteTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoCopiarTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoVerFormTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoDuplicarTransaccionesLocalesNotasCreditos;
	public Boolean isPermisoOrdenTransaccionesLocalesNotasCreditos;
	
	
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
	
	public TransaccionesLocalesNotasCreditosParameterReturnGeneral transaccioneslocalesnotascreditosReturnGeneral;
	public TransaccionesLocalesNotasCreditosParameterReturnGeneral transaccioneslocalesnotascreditosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransaccionesLocalesNotasCreditos=false;
	public Boolean esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransaccionesLocalesNotasCreditosSessionBeanAdditional transaccioneslocalesnotascreditosSessionBeanAdditional=null;
	
	public TransaccionesLocalesNotasCreditosSessionBeanAdditional getTransaccionesLocalesNotasCreditosSessionBeanAdditional() {
		return this.transaccioneslocalesnotascreditosSessionBeanAdditional;
	}
	
	public void setTransaccionesLocalesNotasCreditosSessionBeanAdditional(TransaccionesLocalesNotasCreditosSessionBeanAdditional transaccioneslocalesnotascreditosSessionBeanAdditional) {
		try {
			this.transaccioneslocalesnotascreditosSessionBeanAdditional=transaccioneslocalesnotascreditosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional transaccioneslocalesnotascreditosBeanSwingJInternalFrameAdditional=null;
	//public class TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame
	
	public TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional getTransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional() {
		return this.transaccioneslocalesnotascreditosBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional transaccioneslocalesnotascreditosBeanSwingJInternalFrameAdditional) {
		try {
			this.transaccioneslocalesnotascreditosBeanSwingJInternalFrameAdditional=transaccioneslocalesnotascreditosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransaccionesLocalesNotasCreditosLogic transaccioneslocalesnotascreditosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosBean;
	public TransaccionesLocalesNotasCreditosConstantesFunciones transaccioneslocalesnotascreditosConstantesFunciones;
	//public TransaccionesLocalesNotasCreditosParameterReturnGeneral transaccioneslocalesnotascreditosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditoss;	
	//public List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossEliminados;
	//public List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
	public Boolean isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos=true;
	public Boolean isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos=true;
	public Boolean isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos=true;
	public Boolean isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
	public Boolean isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=false;
	public Boolean isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
	public Boolean isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
	public Boolean isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=false;
	public Boolean isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;	
	
	
	public Boolean isVisibilidadBusquedaTransaccionesLocalesNotasCreditos=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTransaccionesLocalesNotasCreditos() {
		return this.iIdNuevoTransaccionesLocalesNotasCreditos;
	}

	public void setiIdNuevoTransaccionesLocalesNotasCreditos(Long iIdNuevoTransaccionesLocalesNotasCreditos) {
		this.iIdNuevoTransaccionesLocalesNotasCreditos = iIdNuevoTransaccionesLocalesNotasCreditos;
	}
	
	public Long getidTransaccionesLocalesNotasCreditosActual() {
		return this.idTransaccionesLocalesNotasCreditosActual;
	}

	public void setidTransaccionesLocalesNotasCreditosActual(Long idTransaccionesLocalesNotasCreditosActual) {
		this.idTransaccionesLocalesNotasCreditosActual = idTransaccionesLocalesNotasCreditosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TransaccionesLocalesNotasCreditos gettransaccioneslocalesnotascreditos() {
		return this.transaccioneslocalesnotascreditos;
	}

	public void settransaccioneslocalesnotascreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos) {
		this.transaccioneslocalesnotascreditos = transaccioneslocalesnotascreditos;
	}
	
	public TransaccionesLocalesNotasCreditos gettransaccioneslocalesnotascreditosAux() {
		return this.transaccioneslocalesnotascreditosAux;
	}

	public void settransaccioneslocalesnotascreditosAux(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux) {
		this.transaccioneslocalesnotascreditosAux = transaccioneslocalesnotascreditosAux;
	}				
	
	public TransaccionesLocalesNotasCreditos gettransaccioneslocalesnotascreditosAnterior() {
		return this.transaccioneslocalesnotascreditosAnterior;
	}

	public void settransaccioneslocalesnotascreditosAnterior(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAnterior) {
		this.transaccioneslocalesnotascreditosAnterior = transaccioneslocalesnotascreditosAnterior;
	}	
	
	public TransaccionesLocalesNotasCreditos gettransaccioneslocalesnotascreditosTotales() {
		return this.transaccioneslocalesnotascreditosTotales;
	}

	public void settransaccioneslocalesnotascreditosTotales(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosTotales) {
		this.transaccioneslocalesnotascreditosTotales = transaccioneslocalesnotascreditosTotales;
	}	
	
	public TransaccionesLocalesNotasCreditos gettransaccioneslocalesnotascreditosBean() {
		return this.transaccioneslocalesnotascreditosBean;
	}

	public void settransaccioneslocalesnotascreditosBean(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosBean) {
		this.transaccioneslocalesnotascreditosBean = transaccioneslocalesnotascreditosBean;
	}	
	
	public TransaccionesLocalesNotasCreditosParameterReturnGeneral gettransaccioneslocalesnotascreditosReturnGeneral() {
		return this.transaccioneslocalesnotascreditosReturnGeneral;
	}

	public void settransaccioneslocalesnotascreditosReturnGeneral(TransaccionesLocalesNotasCreditosParameterReturnGeneral transaccioneslocalesnotascreditosReturnGeneral) {
		this.transaccioneslocalesnotascreditosReturnGeneral = transaccioneslocalesnotascreditosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaTransaccionesLocalesNotasCreditos=-1L;

	public Long getid_ejercicioBusquedaTransaccionesLocalesNotasCreditos() {
		return this.id_ejercicioBusquedaTransaccionesLocalesNotasCreditos;
	}

	public void setid_ejercicioBusquedaTransaccionesLocalesNotasCreditos(Long id_ejercicioBusquedaTransaccionesLocalesNotasCreditos) {
		this.id_ejercicioBusquedaTransaccionesLocalesNotasCreditos = id_ejercicioBusquedaTransaccionesLocalesNotasCreditos;
	}

;
	public Date fecha_desdeBusquedaTransaccionesLocalesNotasCreditos=new Date();

	public Date getfecha_desdeBusquedaTransaccionesLocalesNotasCreditos() {
		return this.fecha_desdeBusquedaTransaccionesLocalesNotasCreditos;
	}

	public void setfecha_desdeBusquedaTransaccionesLocalesNotasCreditos(Date fecha_desdeBusquedaTransaccionesLocalesNotasCreditos) {
		this.fecha_desdeBusquedaTransaccionesLocalesNotasCreditos = fecha_desdeBusquedaTransaccionesLocalesNotasCreditos;
	}

;
	public Date fecha_hastaBusquedaTransaccionesLocalesNotasCreditos=new Date();

	public Date getfecha_hastaBusquedaTransaccionesLocalesNotasCreditos() {
		return this.fecha_hastaBusquedaTransaccionesLocalesNotasCreditos;
	}

	public void setfecha_hastaBusquedaTransaccionesLocalesNotasCreditos(Date fecha_hastaBusquedaTransaccionesLocalesNotasCreditos) {
		this.fecha_hastaBusquedaTransaccionesLocalesNotasCreditos = fecha_hastaBusquedaTransaccionesLocalesNotasCreditos;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransaccionesLocalesNotasCreditosLogic getTransaccionesLocalesNotasCreditosLogic()	{		
		return transaccioneslocalesnotascreditosLogic;
	}

	public void setTransaccionesLocalesNotasCreditosLogic(TransaccionesLocalesNotasCreditosLogic transaccioneslocalesnotascreditosLogic) {
		this.transaccioneslocalesnotascreditosLogic = transaccioneslocalesnotascreditosLogic;
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
	
	public Boolean getIsEsNuevoTransaccionesLocalesNotasCreditos() {
		return isEsNuevoTransaccionesLocalesNotasCreditos;
	}

	public void setIsEsNuevoTransaccionesLocalesNotasCreditos(Boolean isEsNuevoTransaccionesLocalesNotasCreditos) {
		this.isEsNuevoTransaccionesLocalesNotasCreditos = isEsNuevoTransaccionesLocalesNotasCreditos;
	}

	public Boolean getEsParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos() {
		return esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos;
	}
	
	public void setEsParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos(Boolean esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos) {
		this.esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos = esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos;
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

			if(this.transaccioneslocalesnotascreditosSessionBean==null) {
				this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean();
			}

			if(!this.transaccioneslocalesnotascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(transaccioneslocalesnotascreditosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.transaccioneslocalesnotascreditosSessionBean==null) {
				this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean();
			}

			if(!this.transaccioneslocalesnotascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(transaccioneslocalesnotascreditosSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

					if(this.transaccioneslocalesnotascreditos!=null) {
						this.transaccioneslocalesnotascreditos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
						this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico)throws Exception
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
				jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico!=null && jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.transaccioneslocalesnotascreditos!=null) {
						this.transaccioneslocalesnotascreditos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
						this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransaccionesLocalesNotasCreditos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos!=null) {
						jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos!=null) {
							//jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico!=null && jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,JComboBox jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransaccionesLocalesNotasCreditosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transaccioneslocalesnotascreditos.setid_empresa(empresaAux.getId());
				transaccioneslocalesnotascreditos.setempresa_descripcion(TransaccionesLocalesNotasCreditosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transaccioneslocalesnotascreditos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,JComboBox jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioTransaccionesLocalesNotasCreditosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				transaccioneslocalesnotascreditos.setid_ejercicio(ejercicioAux.getId());
				transaccioneslocalesnotascreditos.setejercicio_descripcion(TransaccionesLocalesNotasCreditosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				transaccioneslocalesnotascreditos.setEjercicio(ejercicioAux);			}
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

					if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { 
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { 
					}

					if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { 
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { 
					}

					if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransaccionesLocalesNotasCreditos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.addItem(ejercicio);
							}
						}

						if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransaccionesLocalesNotasCreditos() throws Exception {
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
		
	public TransaccionesLocalesNotasCreditosParameterReturnGeneral getTransaccionesLocalesNotasCreditosParameterGeneral() {
		return this.transaccioneslocalesnotascreditosParameterGeneral;
	}
	
	public void setTransaccionesLocalesNotasCreditosParameterGeneral(TransaccionesLocalesNotasCreditosParameterReturnGeneral transaccioneslocalesnotascreditosParameterGeneral) {
		this.transaccioneslocalesnotascreditosParameterGeneral = transaccioneslocalesnotascreditosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransaccionesLocalesNotasCreditos() {
		return isPermisoTodoTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoTodoTransaccionesLocalesNotasCreditos(Boolean isPermisoTodoTransaccionesLocalesNotasCreditos) {
		this.isPermisoTodoTransaccionesLocalesNotasCreditos = isPermisoTodoTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsPermisoNuevoTransaccionesLocalesNotasCreditos() {
		return isPermisoNuevoTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoNuevoTransaccionesLocalesNotasCreditos(Boolean isPermisoNuevoTransaccionesLocalesNotasCreditos) {
		this.isPermisoNuevoTransaccionesLocalesNotasCreditos = isPermisoNuevoTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsPermisoActualizarTransaccionesLocalesNotasCreditos() {
		return isPermisoActualizarTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoActualizarTransaccionesLocalesNotasCreditos(Boolean isPermisoActualizarTransaccionesLocalesNotasCreditos) {
		this.isPermisoActualizarTransaccionesLocalesNotasCreditos = isPermisoActualizarTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsPermisoEliminarTransaccionesLocalesNotasCreditos() {
		return isPermisoEliminarTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoEliminarTransaccionesLocalesNotasCreditos(Boolean isPermisoEliminarTransaccionesLocalesNotasCreditos) {
		this.isPermisoEliminarTransaccionesLocalesNotasCreditos = isPermisoEliminarTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsPermisoGuardarCambiosTransaccionesLocalesNotasCreditos() {
		return isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoGuardarCambiosTransaccionesLocalesNotasCreditos(Boolean isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos) {
		this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos = isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoConsultaTransaccionesLocalesNotasCreditos() {
		return isPermisoConsultaTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoConsultaTransaccionesLocalesNotasCreditos(Boolean isPermisoConsultaTransaccionesLocalesNotasCreditos) {
		this.isPermisoConsultaTransaccionesLocalesNotasCreditos = isPermisoConsultaTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsPermisoBusquedaTransaccionesLocalesNotasCreditos() {
		return isPermisoBusquedaTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoBusquedaTransaccionesLocalesNotasCreditos(Boolean isPermisoBusquedaTransaccionesLocalesNotasCreditos) {
		this.isPermisoBusquedaTransaccionesLocalesNotasCreditos = isPermisoBusquedaTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsPermisoReporteTransaccionesLocalesNotasCreditos() {
		return isPermisoReporteTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoReporteTransaccionesLocalesNotasCreditos(Boolean isPermisoReporteTransaccionesLocalesNotasCreditos) {
		this.isPermisoReporteTransaccionesLocalesNotasCreditos = isPermisoReporteTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransaccionesLocalesNotasCreditos() {
		return isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoPaginacionMedioTransaccionesLocalesNotasCreditos(Boolean isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos) {
		this.isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos = isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransaccionesLocalesNotasCreditos() {
		return isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoPaginacionTodoTransaccionesLocalesNotasCreditos(Boolean isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos) {
		this.isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos = isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransaccionesLocalesNotasCreditos() {
		return isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoPaginacionAltoTransaccionesLocalesNotasCreditos(Boolean isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos) {
		this.isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos = isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoCopiarTransaccionesLocalesNotasCreditos() {
		return isPermisoCopiarTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoCopiarTransaccionesLocalesNotasCreditos(Boolean isPermisoCopiarTransaccionesLocalesNotasCreditos) {
		this.isPermisoCopiarTransaccionesLocalesNotasCreditos = isPermisoCopiarTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoVerFormTransaccionesLocalesNotasCreditos() {
		return isPermisoVerFormTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoVerFormTransaccionesLocalesNotasCreditos(Boolean isPermisoVerFormTransaccionesLocalesNotasCreditos) {
		this.isPermisoVerFormTransaccionesLocalesNotasCreditos = isPermisoVerFormTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoDuplicarTransaccionesLocalesNotasCreditos() {
		return isPermisoDuplicarTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoDuplicarTransaccionesLocalesNotasCreditos(Boolean isPermisoDuplicarTransaccionesLocalesNotasCreditos) {
		this.isPermisoDuplicarTransaccionesLocalesNotasCreditos = isPermisoDuplicarTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsPermisoOrdenTransaccionesLocalesNotasCreditos() {
		return isPermisoOrdenTransaccionesLocalesNotasCreditos;
	}

	public void setIsPermisoOrdenTransaccionesLocalesNotasCreditos(Boolean isPermisoOrdenTransaccionesLocalesNotasCreditos) {
		this.isPermisoOrdenTransaccionesLocalesNotasCreditos = isPermisoOrdenTransaccionesLocalesNotasCreditos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos = isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos = isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos = isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos = isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos = isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos = isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos = isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos = isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos = isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos = isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos = isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos() {
		return isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos(Boolean isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos = isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos;
	}
		
	public TransaccionesLocalesNotasCreditosSessionBean gettransaccioneslocalesnotascreditosSessionBean() {
		return this.transaccioneslocalesnotascreditosSessionBean;
	}
	
	public void settransaccioneslocalesnotascreditosSessionBean(TransaccionesLocalesNotasCreditosSessionBean transaccioneslocalesnotascreditosSessionBean) {
		this.transaccioneslocalesnotascreditosSessionBean=transaccioneslocalesnotascreditosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaTransaccionesLocalesNotasCreditos() {
		return this.isVisibilidadBusquedaTransaccionesLocalesNotasCreditos;
	}

	public void setisVisibilidadBusquedaTransaccionesLocalesNotasCreditos(Boolean isVisibilidadBusquedaTransaccionesLocalesNotasCreditos) {
		this.isVisibilidadBusquedaTransaccionesLocalesNotasCreditos=isVisibilidadBusquedaTransaccionesLocalesNotasCreditos;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transaccioneslocalesnotascreditos,null);
				this.setActualParaGuardarEjercicioForeignKey(transaccioneslocalesnotascreditos,null);
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
	
	public void bugActualizarReferenciaActual(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transaccioneslocalesnotascreditosAux.setId(transaccioneslocalesnotascreditos.getId());
		transaccioneslocalesnotascreditosAux.setVersionRow(transaccioneslocalesnotascreditos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal) throws Exception {
		
		if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal) throws Exception {	
		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transaccioneslocalesnotascreditosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				transaccioneslocalesnotascreditosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransaccionesLocalesNotasCreditosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transaccioneslocalesnotascreditosValidator.getInvalidValues(this.transaccioneslocalesnotascreditos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditoss) throws Exception {
		try	{			
			TransaccionesLocalesNotasCreditosConstantesFunciones.actualizarSelectedLista(transaccioneslocalesnotascreditos,transaccioneslocalesnotascreditoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transaccioneslocalesnotascreditossLocal=this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transaccioneslocalesnotascreditossLocal=this.transaccioneslocalesnotascreditoss;
			}
			//ARCHITECTURE
		
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal:transaccioneslocalesnotascreditossLocal) {
				if(this.permiteMantenimiento(transaccioneslocalesnotascreditosLocal) && transaccioneslocalesnotascreditosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.getTransaccionesLocalesNotasCreditosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesNotasCreditosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesNotasCreditosConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotal_ivaTransaccionesLocalesNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesNotasCreditosConstantesFunciones.TOTALSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesNotasCreditosConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelivaTransaccionesLocalesNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesNotasCreditosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotalTransaccionesLocalesNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesNotasCreditosConstantesFunciones.RUCCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelruc_clienteTransaccionesLocalesNotasCreditos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotal_ivaTransaccionesLocalesNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelivaTransaccionesLocalesNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotalTransaccionesLocalesNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelruc_clienteTransaccionesLocalesNotasCreditos,"");
		
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
		this.iIdNuevoTransaccionesLocalesNotasCreditos--;	
		
		
		this.transaccioneslocalesnotascreditosAux=new TransaccionesLocalesNotasCreditos();
		
		this.transaccioneslocalesnotascreditosAux.setId(this.iIdNuevoTransaccionesLocalesNotasCreditos);
		this.transaccioneslocalesnotascreditosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().add(this.transaccioneslocalesnotascreditosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transaccioneslocalesnotascreditoss.add(this.transaccioneslocalesnotascreditosAux);
		}
		//ARCHITECTURE
		
		this.transaccioneslocalesnotascreditos=this.transaccioneslocalesnotascreditosAux;
		
		if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
		}
				
		//this.setDefaultControlesTransaccionesLocalesNotasCreditos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransaccionesLocalesNotasCreditos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransaccionesLocalesNotasCreditos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionesLocalesNotasCreditos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosBean,this.transaccioneslocalesnotascreditos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral,this.transaccioneslocalesnotascreditosBean,false);
		
		if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos());
		}
		
		if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos(),classes);//this.transaccioneslocalesnotascreditosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransaccionesLocalesNotasCreditos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransaccionesLocalesNotasCreditos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.RecargarFormTransaccionesLocalesNotasCreditos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
						
			if(transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionesLocalesNotasCreditos();
			}
			
			this.actualizarVisualTableDatosTransaccionesLocalesNotasCreditos();
			
			this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesNotasCreditos(), this.getIndiceNuevoTransaccionesLocalesNotasCreditos());
			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
						
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activarfecha_desdeTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activarfecha_hastaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_ivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activarivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activartotalTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activarruc_clienteTransaccionesLocalesNotasCreditos);	
		//
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activarid_empresaTransaccionesLocalesNotasCreditos);//
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setEnabled(isHabilitar && this.transaccioneslocalesnotascreditosConstantesFunciones.activarid_ejercicioTransaccionesLocalesNotasCreditos);
	};
	
	public void setDefaultControlesTransaccionesLocalesNotasCreditos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransaccionesLocalesNotasCreditos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transaccioneslocalesnotascreditosSessionBean.setConGuardarRelaciones(true);			
			this.transaccioneslocalesnotascreditosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setVisible(true);
			
					
		} else {
			//this.transaccioneslocalesnotascreditosSessionBean.setConGuardarRelaciones(false);			
			this.transaccioneslocalesnotascreditosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransaccionesLocalesNotasCreditos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
				if(transaccioneslocalesnotascreditosAux.getId().equals(this.iIdNuevoTransaccionesLocalesNotasCreditos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditoss) {
				if(transaccioneslocalesnotascreditosAux.getId().equals(this.iIdNuevoTransaccionesLocalesNotasCreditos)) {
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
	
	public int getIndiceActualTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
				if(transaccioneslocalesnotascreditosAux.getId().equals(transaccioneslocalesnotascreditos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditoss) {
				if(transaccioneslocalesnotascreditosAux.getId().equals(transaccioneslocalesnotascreditos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
				if(transaccioneslocalesnotascreditosAux.getTransaccionesLocalesNotasCreditosOriginal().getId().equals(transaccioneslocalesnotascreditosOriginal.getId())) {
					existe=true;
					transaccioneslocalesnotascreditosOriginal.setId(transaccioneslocalesnotascreditosAux.getId());
					transaccioneslocalesnotascreditosOriginal.setVersionRow(transaccioneslocalesnotascreditosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditoss) {
				if(transaccioneslocalesnotascreditosAux.getTransaccionesLocalesNotasCreditosOriginal().getId().equals(transaccioneslocalesnotascreditosOriginal.getId())) {
					existe=true;
					transaccioneslocalesnotascreditosOriginal.setId(transaccioneslocalesnotascreditosAux.getId());
					transaccioneslocalesnotascreditosOriginal.setVersionRow(transaccioneslocalesnotascreditosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransaccionesLocalesNotasCreditos(Boolean esParaCancelar) throws Exception {
		transaccioneslocalesnotascreditossAux=new ArrayList<TransaccionesLocalesNotasCreditos>();
		transaccioneslocalesnotascreditosAux=new TransaccionesLocalesNotasCreditos();
		
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
					if(transaccioneslocalesnotascreditosAux.getId()<0) {
						transaccioneslocalesnotascreditossAux.add(transaccioneslocalesnotascreditosAux);
					}		
				}
				this.iIdNuevoTransaccionesLocalesNotasCreditos=0L;
				this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().removeAll(transaccioneslocalesnotascreditossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditoss) {
					if(transaccioneslocalesnotascreditosAux.getId()<0) {
						transaccioneslocalesnotascreditossAux.add(transaccioneslocalesnotascreditosAux);
					}		
				}
				this.iIdNuevoTransaccionesLocalesNotasCreditos=0L;
				this.transaccioneslocalesnotascreditoss.removeAll(transaccioneslocalesnotascreditossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransaccionesLocalesNotasCreditos 
					&& this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size()>0
					) {
					transaccioneslocalesnotascreditosAux=this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().get(this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size() - 1);
				
					if(transaccioneslocalesnotascreditosAux.getId()<0) {
						this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().remove(transaccioneslocalesnotascreditosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransaccionesLocalesNotasCreditos && this.transaccioneslocalesnotascreditoss.size()>0) {
					transaccioneslocalesnotascreditosAux=this.transaccioneslocalesnotascreditoss.get(this.transaccioneslocalesnotascreditoss.size() - 1);
				
					if(transaccioneslocalesnotascreditosAux.getId()<0) {
						this.transaccioneslocalesnotascreditoss.remove(transaccioneslocalesnotascreditosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransaccionesLocalesNotasCreditos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transaccioneslocalesnotascreditos.getId()<0) {
				this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().remove(this.transaccioneslocalesnotascreditos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transaccioneslocalesnotascreditos.getId()<0) {
				this.transaccioneslocalesnotascreditoss.remove(this.transaccioneslocalesnotascreditos);
			}
		}			
	}
	
	public void setEstadosInicialesTransaccionesLocalesNotasCreditos(List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossAux) throws Exception {
		TransaccionesLocalesNotasCreditosConstantesFunciones.setEstadosInicialesTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditossAux);
	}
	
	public void setEstadosInicialesTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux) throws Exception {
		TransaccionesLocalesNotasCreditosConstantesFunciones.setEstadosInicialesTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransaccionesLocalesNotasCreditosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransaccionesLocalesNotasCreditosActual()) {
				if(!this.isEsNuevoTransaccionesLocalesNotasCreditos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransaccionesLocalesNotasCreditosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transacciones Locales Notas Creditos ?", "MANTENIMIENTO DE Transacciones Locales Notas Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos) throws Exception {
		TransaccionesLocalesNotasCreditosConstantesFunciones.seleccionarAsignar(this.transaccioneslocalesnotascreditos,transaccioneslocalesnotascreditos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransaccionesLocalesNotasCreditos=this.isPermisoActualizarOriginalTransaccionesLocalesNotasCreditos;
			
			
			this.seleccionarAsignar(transaccioneslocalesnotascreditos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transaccioneslocalesnotascreditosSessionBean.setsFuncionBusquedaRapida(this.transaccioneslocalesnotascreditosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransaccionesLocalesNotasCreditos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransaccionesLocalesNotasCreditos(esParaCancelar);				
				this.cancelarNuevoTransaccionesLocalesNotasCreditos(esParaCancelar);								
			}
			
			this.transaccioneslocalesnotascreditos=new TransaccionesLocalesNotasCreditos();
			
			this.inicializarTransaccionesLocalesNotasCreditos();
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransaccionesLocalesNotasCreditos() throws Exception {
		try {
			TransaccionesLocalesNotasCreditosConstantesFunciones.inicializarTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
			
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
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransaccionesLocalesNotasCreditoss(String sAccionBusqueda,List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossParaReportes) throws Exception {
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
					sPathReporteFinal="TransaccionesLocalesNotasCreditos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransaccionesLocalesNotasCreditosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransaccionesLocalesNotasCreditosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TransaccionesLocalesNotasCreditos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transacciones Locales Notas Creditoses");		
		parameters.put("busquedapor", TransaccionesLocalesNotasCreditosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransaccionesLocalesNotasCreditos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransaccionesLocalesNotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransaccionesLocalesNotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransaccionesLocalesNotasCreditos=new JRBeanArrayDataSource(TransaccionesLocalesNotasCreditosJInternalFrame.TraerTransaccionesLocalesNotasCreditosBeans(transaccioneslocalesnotascreditossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransaccionesLocalesNotasCreditos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransaccionesLocalesNotasCreditosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransaccionesLocalesNotasCreditosBean.TraerTransaccionesLocalesNotasCreditosBeans(transaccioneslocalesnotascreditossParaReportes).toArray()));
							
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
				this.generarExcelReporteTransaccionesLocalesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesnotascreditossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransaccionesLocalesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesnotascreditossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(null);
					//this.generarExcelReporteTransaccionesLocalesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesnotascreditossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransaccionesLocalesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesnotascreditossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransaccionesLocalesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesnotascreditossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransaccionesLocalesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesnotascreditossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransaccionesLocalesNotasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesnotascreditos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionesLocalesNotasCreditoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionesLocalesNotasCreditos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos : transaccioneslocalesnotascreditossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransaccionesLocalesNotasCreditosConstantesFunciones.generarExcelReporteDataTransaccionesLocalesNotasCreditos("NORMAL",row,workbook,transaccioneslocalesnotascreditos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransaccionesLocalesNotasCreditos(String sTipo,Row row,Workbook workbook) {
		
		TransaccionesLocalesNotasCreditosConstantesFunciones.generarExcelReporteHeaderTransaccionesLocalesNotasCreditos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransaccionesLocalesNotasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesnotascreditos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionesLocalesNotasCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos : transaccioneslocalesnotascreditossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.getTransaccionesLocalesNotasCreditosDescripcion(transaccioneslocalesnotascreditos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.gettotal_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesnotascreditos.getruc_cliente());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransaccionesLocalesNotasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossRespaldo=null;
		
		classes=TransaccionesLocalesNotasCreditosConstantesFunciones.getClassesRelationshipsOfTransaccionesLocalesNotasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transaccioneslocalesnotascreditosLogic.setDatosCliente(this.datosCliente);
		this.transaccioneslocalesnotascreditosLogic.setDatosDeep(this.datosDeep);
		this.transaccioneslocalesnotascreditosLogic.setIsConDeep(true);
		
		transaccioneslocalesnotascreditossRespaldo=this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss();
		
		this.transaccioneslocalesnotascreditosLogic.setTransaccionesLocalesNotasCreditoss(transaccioneslocalesnotascreditossParaReportes);	
		this.transaccioneslocalesnotascreditosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transaccioneslocalesnotascreditossParaReportes=this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss();
		this.transaccioneslocalesnotascreditosLogic.setTransaccionesLocalesNotasCreditoss(transaccioneslocalesnotascreditossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesnotascreditos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionesLocalesNotasCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionesLocalesNotasCreditos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos : transaccioneslocalesnotascreditossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransaccionesLocalesNotasCreditos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransaccionesLocalesNotasCreditosConstantesFunciones.generarExcelReporteDataTransaccionesLocalesNotasCreditos("NORMAL",row,workbook,transaccioneslocalesnotascreditos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.getTransaccionesLocalesNotasCreditosDescripcion(transaccioneslocalesnotascreditos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransaccionesLocalesNotasCreditos() throws Exception {		
		this.startProcessTransaccionesLocalesNotasCreditos(true);
	}
	
	public void startProcessTransaccionesLocalesNotasCreditos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos ,this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos, this.jScrollPanelDatosTransaccionesLocalesNotasCreditos,this.jPanelPaginacionTransaccionesLocalesNotasCreditos, this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos, this.jPanelAccionesTransaccionesLocalesNotasCreditos,this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos,this.jmenuBarTransaccionesLocalesNotasCreditos,this.jmenuBarDetalleTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos=this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos; 
		
		final JPanel jPanelParametrosReportesTransaccionesLocalesNotasCreditos=this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos;
		//final JScrollPane jScrollPanelDatosTransaccionesLocalesNotasCreditos=this.jScrollPanelDatosTransaccionesLocalesNotasCreditos;
		final JTable jTableDatosTransaccionesLocalesNotasCreditos=this.jTableDatosTransaccionesLocalesNotasCreditos;		
		final JPanel jPanelPaginacionTransaccionesLocalesNotasCreditos=this.jPanelPaginacionTransaccionesLocalesNotasCreditos;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos=this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos;
		final JPanel jPanelAccionesTransaccionesLocalesNotasCreditos=this.jPanelAccionesTransaccionesLocalesNotasCreditos;
		
		JPanel jPanelCamposAuxiliarTransaccionesLocalesNotasCreditos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionesLocalesNotasCreditos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			jPanelCamposAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelCamposTransaccionesLocalesNotasCreditos;
			jPanelAccionesFormularioAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos;
		}
		
		final JPanel jPanelCamposTransaccionesLocalesNotasCreditos=jPanelCamposAuxiliarTransaccionesLocalesNotasCreditos;
		final JPanel jPanelAccionesFormularioTransaccionesLocalesNotasCreditos=jPanelAccionesFormularioAuxiliarTransaccionesLocalesNotasCreditos;
		
		
		final JMenuBar jmenuBarTransaccionesLocalesNotasCreditos=this.jmenuBarTransaccionesLocalesNotasCreditos;
		final JToolBar jTtoolBarTransaccionesLocalesNotasCreditos=this.jTtoolBarTransaccionesLocalesNotasCreditos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			jmenuBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jmenuBarDetalleTransaccionesLocalesNotasCreditos;
			jTtoolBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTtoolBarDetalleTransaccionesLocalesNotasCreditos;
		}
		
		final JMenuBar jmenuBarDetalleTransaccionesLocalesNotasCreditos=jmenuBarDetalleAuxiliarTransaccionesLocalesNotasCreditos;
		final JToolBar jTtoolBarDetalleTransaccionesLocalesNotasCreditos=jTtoolBarDetalleAuxiliarTransaccionesLocalesNotasCreditos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionesLocalesNotasCreditos;
			processRunnable.jTableDatos=jTableDatosTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelCampos=jPanelCamposTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionesLocalesNotasCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionesLocalesNotasCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionesLocalesNotasCreditos;
			processRunnable.jTtoolBar=jTtoolBarTransaccionesLocalesNotasCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionesLocalesNotasCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos ,jPanelParametrosReportesTransaccionesLocalesNotasCreditos,jTableDatosTransaccionesLocalesNotasCreditos, /*jScrollPanelDatosTransaccionesLocalesNotasCreditos,*/jPanelCamposTransaccionesLocalesNotasCreditos,jPanelPaginacionTransaccionesLocalesNotasCreditos, /*jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos,*/ jPanelAccionesTransaccionesLocalesNotasCreditos,jPanelAccionesFormularioTransaccionesLocalesNotasCreditos,jmenuBarTransaccionesLocalesNotasCreditos,jmenuBarDetalleTransaccionesLocalesNotasCreditos,jTtoolBarTransaccionesLocalesNotasCreditos,jTtoolBarDetalleTransaccionesLocalesNotasCreditos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos ,jPanelParametrosReportesTransaccionesLocalesNotasCreditos, jScrollPanelDatosTransaccionesLocalesNotasCreditos,jPanelPaginacionTransaccionesLocalesNotasCreditos, jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos, jPanelAccionesTransaccionesLocalesNotasCreditos,jPanelAccionesFormularioTransaccionesLocalesNotasCreditos,jmenuBarTransaccionesLocalesNotasCreditos,jmenuBarDetalleTransaccionesLocalesNotasCreditos,jTtoolBarTransaccionesLocalesNotasCreditos,jTtoolBarDetalleTransaccionesLocalesNotasCreditos);
						
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
	
	public void finishProcessTransaccionesLocalesNotasCreditos() {// throws Exception 
		this.finishProcessTransaccionesLocalesNotasCreditos(true);
	}
	
	public void finishProcessTransaccionesLocalesNotasCreditos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos ,this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos, this.jScrollPanelDatosTransaccionesLocalesNotasCreditos,this.jPanelPaginacionTransaccionesLocalesNotasCreditos, this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos, this.jPanelAccionesTransaccionesLocalesNotasCreditos,this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos,this.jmenuBarTransaccionesLocalesNotasCreditos,this.jmenuBarDetalleTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos=this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos; 
		
		final JPanel jPanelParametrosReportesTransaccionesLocalesNotasCreditos=this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos;
		//final JScrollPane jScrollPanelDatosTransaccionesLocalesNotasCreditos=this.jScrollPanelDatosTransaccionesLocalesNotasCreditos;
		final JTable jTableDatosTransaccionesLocalesNotasCreditos=this.jTableDatosTransaccionesLocalesNotasCreditos;		
		final JPanel jPanelPaginacionTransaccionesLocalesNotasCreditos=this.jPanelPaginacionTransaccionesLocalesNotasCreditos;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos=this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos;
		final JPanel jPanelAccionesTransaccionesLocalesNotasCreditos=this.jPanelAccionesTransaccionesLocalesNotasCreditos;
		
		JPanel jPanelCamposAuxiliarTransaccionesLocalesNotasCreditos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionesLocalesNotasCreditos=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			jPanelCamposAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelCamposTransaccionesLocalesNotasCreditos;
			jPanelAccionesFormularioAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos;
		}
		
		final JPanel jPanelCamposTransaccionesLocalesNotasCreditos=jPanelCamposAuxiliarTransaccionesLocalesNotasCreditos;
		final JPanel jPanelAccionesFormularioTransaccionesLocalesNotasCreditos=jPanelAccionesFormularioAuxiliarTransaccionesLocalesNotasCreditos;
		
		
		final JMenuBar jmenuBarTransaccionesLocalesNotasCreditos=this.jmenuBarTransaccionesLocalesNotasCreditos;		
		final JToolBar jTtoolBarTransaccionesLocalesNotasCreditos=this.jTtoolBarTransaccionesLocalesNotasCreditos;
				
		JMenuBar jmenuBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			jmenuBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jmenuBarDetalleTransaccionesLocalesNotasCreditos;
			jTtoolBarDetalleAuxiliarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTtoolBarDetalleTransaccionesLocalesNotasCreditos;		
		}
		
		final JMenuBar jmenuBarDetalleTransaccionesLocalesNotasCreditos=jmenuBarDetalleAuxiliarTransaccionesLocalesNotasCreditos;
		final JToolBar jTtoolBarDetalleTransaccionesLocalesNotasCreditos=jTtoolBarDetalleAuxiliarTransaccionesLocalesNotasCreditos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionesLocalesNotasCreditos;
			processRunnable.jTableDatos=jTableDatosTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelCampos=jPanelCamposTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionesLocalesNotasCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionesLocalesNotasCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionesLocalesNotasCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionesLocalesNotasCreditos;
			processRunnable.jTtoolBar=jTtoolBarTransaccionesLocalesNotasCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionesLocalesNotasCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos ,jPanelParametrosReportesTransaccionesLocalesNotasCreditos, jTableDatosTransaccionesLocalesNotasCreditos,/*jScrollPanelDatosTransaccionesLocalesNotasCreditos,*/jPanelCamposTransaccionesLocalesNotasCreditos,jPanelPaginacionTransaccionesLocalesNotasCreditos, /*jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos,*/ jPanelAccionesTransaccionesLocalesNotasCreditos,jPanelAccionesFormularioTransaccionesLocalesNotasCreditos,jmenuBarTransaccionesLocalesNotasCreditos,jmenuBarDetalleTransaccionesLocalesNotasCreditos,jTtoolBarTransaccionesLocalesNotasCreditos,jTtoolBarDetalleTransaccionesLocalesNotasCreditos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransaccionesLocalesNotasCreditos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransaccionesLocalesNotasCreditos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransaccionesLocalesNotasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransaccionesLocalesNotasCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransaccionesLocalesNotasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransaccionesLocalesNotasCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransaccionesLocalesNotasCreditos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transaccioneslocalesnotascreditosConstantesFunciones.getsFinalQueryTransaccionesLocalesNotasCreditos();
		String  finalQueryPaginacionTodos=this.transaccioneslocalesnotascreditosConstantesFunciones.getsFinalQueryTransaccionesLocalesNotasCreditos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransaccionesLocalesNotasCreditosConstantesFunciones.getArrayColumnasGlobalesNoTransaccionesLocalesNotasCreditos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransaccionesLocalesNotasCreditosConstantesFunciones.getArrayColumnasGlobalesTransaccionesLocalesNotasCreditos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransaccionesLocalesNotasCreditosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transaccioneslocalesnotascreditossEliminados= new ArrayList<TransaccionesLocalesNotasCreditos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransaccionesLocalesNotasCreditos();
		
				///*TransaccionesLocalesNotasCreditosSessionBean*/this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean();
			
			if(this.transaccioneslocalesnotascreditosSessionBean==null) {
				this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean();
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
					this.iNumeroPaginacion=TransaccionesLocalesNotasCreditosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransaccionesLocalesNotasCreditosConstantesFunciones.getClassesForeignKeysOfTransaccionesLocalesNotasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transaccioneslocalesnotascreditos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transaccioneslocalesnotascreditossAux= new ArrayList<TransaccionesLocalesNotasCreditos>();
			
				
			transaccioneslocalesnotascreditosLogic.setDatosCliente(this.datosCliente);
			transaccioneslocalesnotascreditosLogic.setDatosDeep(this.datosDeep);
			transaccioneslocalesnotascreditosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaTransaccionesLocalesNotasCreditos")) {
				this.sDetalleReporte=TransaccionesLocalesNotasCreditosConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesNotasCreditos(id_ejercicioBusquedaTransaccionesLocalesNotasCreditos,fecha_desdeBusquedaTransaccionesLocalesNotasCreditos,fecha_hastaBusquedaTransaccionesLocalesNotasCreditos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditossBusquedaTransaccionesLocalesNotasCreditos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaTransaccionesLocalesNotasCreditos,fecha_desdeBusquedaTransaccionesLocalesNotasCreditos,fecha_hastaBusquedaTransaccionesLocalesNotasCreditos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionesLocalesNotasCreditosConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesNotasCreditos(id_ejercicioBusquedaTransaccionesLocalesNotasCreditos,fecha_desdeBusquedaTransaccionesLocalesNotasCreditos,fecha_hastaBusquedaTransaccionesLocalesNotasCreditos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionesLocalesNotasCreditosConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesNotasCreditos(id_ejercicioBusquedaTransaccionesLocalesNotasCreditos,fecha_desdeBusquedaTransaccionesLocalesNotasCreditos,fecha_hastaBusquedaTransaccionesLocalesNotasCreditos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()==null||transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioneslocalesnotascreditoss==null|| transaccioneslocalesnotascreditoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesnotascreditossAux=new ArrayList<TransaccionesLocalesNotasCreditos>();
						transaccioneslocalesnotascreditossAux.addAll(transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioneslocalesnotascreditossAux=new ArrayList<TransaccionesLocalesNotasCreditos>();
							transaccioneslocalesnotascreditossAux.addAll(transaccioneslocalesnotascreditoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditossBusquedaTransaccionesLocalesNotasCreditos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaTransaccionesLocalesNotasCreditos,fecha_desdeBusquedaTransaccionesLocalesNotasCreditos,fecha_hastaBusquedaTransaccionesLocalesNotasCreditos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionesLocalesNotasCreditosConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesNotasCreditos(id_ejercicioBusquedaTransaccionesLocalesNotasCreditos,fecha_desdeBusquedaTransaccionesLocalesNotasCreditos,fecha_hastaBusquedaTransaccionesLocalesNotasCreditos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionesLocalesNotasCreditosConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesNotasCreditos(id_ejercicioBusquedaTransaccionesLocalesNotasCreditos,fecha_desdeBusquedaTransaccionesLocalesNotasCreditos,fecha_hastaBusquedaTransaccionesLocalesNotasCreditos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionesLocalesNotasCreditoss("BusquedaTransaccionesLocalesNotasCreditos",transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionesLocalesNotasCreditoss("BusquedaTransaccionesLocalesNotasCreditos",transaccioneslocalesnotascreditoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesnotascreditosLogic.setTransaccionesLocalesNotasCreditoss(new ArrayList<TransaccionesLocalesNotasCreditos>());
						transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().addAll(transaccioneslocalesnotascreditossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioneslocalesnotascreditoss=new ArrayList<TransaccionesLocalesNotasCreditos>();
							transaccioneslocalesnotascreditoss.addAll(transaccioneslocalesnotascreditossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransaccionesLocalesNotasCreditos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransaccionesLocalesNotasCreditos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioneslocalesnotascreditoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioneslocalesnotascreditoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos) {
		Boolean permite=true;
		
		if(this.transaccioneslocalesnotascreditos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransaccionesLocalesNotasCreditosConstantesFunciones.getOrderByListaTransaccionesLocalesNotasCreditos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransaccionesLocalesNotasCreditosConstantesFunciones.getOrderByListaTransaccionesLocalesNotasCreditos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
				if(transaccioneslocalesnotascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesnotascreditosTotales=transaccioneslocalesnotascreditos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:this.transaccioneslocalesnotascreditoss) {
				if(transaccioneslocalesnotascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesnotascreditosTotales=transaccioneslocalesnotascreditos;
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
			this.transaccioneslocalesnotascreditosAux=new TransaccionesLocalesNotasCreditos();
			this.transaccioneslocalesnotascreditosAux.setsType(Constantes2.S_TOTALES);
			this.transaccioneslocalesnotascreditosAux.setIsNew(false);
			this.transaccioneslocalesnotascreditosAux.setIsChanged(false);
			this.transaccioneslocalesnotascreditosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//TransaccionesLocalesNotasCreditosConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss(),this.transaccioneslocalesnotascreditosAux);
				
				//this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().add(this.transaccioneslocalesnotascreditosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransaccionesLocalesNotasCreditosConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditoss,this.transaccioneslocalesnotascreditosAux);
				
				this.transaccioneslocalesnotascreditoss.add(this.transaccioneslocalesnotascreditosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transaccioneslocalesnotascreditosTotales=new TransaccionesLocalesNotasCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().remove(transaccioneslocalesnotascreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioneslocalesnotascreditoss.remove(transaccioneslocalesnotascreditosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transaccioneslocalesnotascreditosTotales=new TransaccionesLocalesNotasCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
				if(transaccioneslocalesnotascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesnotascreditosTotales=transaccioneslocalesnotascreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionesLocalesNotasCreditosConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss(),transaccioneslocalesnotascreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:this.transaccioneslocalesnotascreditoss) {
				if(transaccioneslocalesnotascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesnotascreditosTotales=transaccioneslocalesnotascreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionesLocalesNotasCreditosConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditoss,transaccioneslocalesnotascreditosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransaccionesLocalesNotasCreditossBusquedaTransaccionesLocalesNotasCreditos()throws Exception {
		try {
			sAccionBusqueda="BusquedaTransaccionesLocalesNotasCreditos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionesLocalesNotasCreditossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionesLocalesNotasCreditossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransaccionesLocalesNotasCreditossBusquedaTransaccionesLocalesNotasCreditos(String sFinalQuery,Long id_ejercicio,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditossBusquedaTransaccionesLocalesNotasCreditos(sFinalQuery,this.pagination,id_ejercicio,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionesLocalesNotasCreditossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionesLocalesNotasCreditossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTransaccionesLocalesNotasCreditos() {
		this.isPermisoTodoTransaccionesLocalesNotasCreditos=false;
		this.isPermisoNuevoTransaccionesLocalesNotasCreditos=false;
		this.isPermisoActualizarTransaccionesLocalesNotasCreditos=false;
		this.isPermisoActualizarOriginalTransaccionesLocalesNotasCreditos=false;
		this.isPermisoEliminarTransaccionesLocalesNotasCreditos=false;
		this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos=false;
		this.isPermisoConsultaTransaccionesLocalesNotasCreditos=true;
		this.isPermisoBusquedaTransaccionesLocalesNotasCreditos=true;
		this.isPermisoReporteTransaccionesLocalesNotasCreditos=true;
		this.isPermisoOrdenTransaccionesLocalesNotasCreditos=false;		
		this.isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos=false;		
		this.isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos=false;		
		this.isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos=false;		
		this.isPermisoCopiarTransaccionesLocalesNotasCreditos=false;		
		this.isPermisoVerFormTransaccionesLocalesNotasCreditos=false;		
		this.isPermisoDuplicarTransaccionesLocalesNotasCreditos=false;
		this.isPermisoOrdenTransaccionesLocalesNotasCreditos=false;
	}
	
	public void setPermisosUsuarioTransaccionesLocalesNotasCreditos(Boolean isPermiso) {
		this.isPermisoTodoTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoNuevoTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoActualizarTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoActualizarOriginalTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoEliminarTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoConsultaTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoBusquedaTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoReporteTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoOrdenTransaccionesLocalesNotasCreditos=isPermiso;		
		this.isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos=isPermiso;		
		this.isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos=isPermiso;		
		this.isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos=isPermiso;		
		this.isPermisoCopiarTransaccionesLocalesNotasCreditos=isPermiso;		
		this.isPermisoVerFormTransaccionesLocalesNotasCreditos=isPermiso;		
		this.isPermisoDuplicarTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoOrdenTransaccionesLocalesNotasCreditos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransaccionesLocalesNotasCreditos(Boolean isPermiso) {
		//this.isPermisoTodoTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoNuevoTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoActualizarTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoActualizarOriginalTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoEliminarTransaccionesLocalesNotasCreditos=isPermiso;
		this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos=isPermiso;
		//this.isPermisoConsultaTransaccionesLocalesNotasCreditos=isPermiso;
		//this.isPermisoBusquedaTransaccionesLocalesNotasCreditos=isPermiso;
		//this.isPermisoReporteTransaccionesLocalesNotasCreditos=isPermiso;
		//this.isPermisoOrdenTransaccionesLocalesNotasCreditos=isPermiso;		
		//this.isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos=isPermiso;		
		//this.isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos=isPermiso;		
		//this.isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos=isPermiso;		
		//this.isPermisoCopiarTransaccionesLocalesNotasCreditos=isPermiso;		
		//this.isPermisoDuplicarTransaccionesLocalesNotasCreditos=isPermiso;
		//this.isPermisoOrdenTransaccionesLocalesNotasCreditos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionesLocalesNotasCreditosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransaccionesLocalesNotasCreditos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionesLocalesNotasCreditosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransaccionesLocalesNotasCreditosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransaccionesLocalesNotasCreditosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransaccionesLocalesNotasCreditosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransaccionesLocalesNotasCreditos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransaccionesLocalesNotasCreditosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransaccionesLocalesNotasCreditos=this.isPermisoActualizarTransaccionesLocalesNotasCreditos;
			this.isPermisoEliminarTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransaccionesLocalesNotasCreditos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionesLocalesNotasCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransaccionesLocalesNotasCreditos.setToolTipText(this.jTableDatosTransaccionesLocalesNotasCreditos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransaccionesLocalesNotasCreditos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransaccionesLocalesNotasCreditos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransaccionesLocalesNotasCreditos() throws Exception {
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
	public void inicializarCombosForeignKeyTransaccionesLocalesNotasCreditosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransaccionesLocalesNotasCreditosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transaccioneslocalesnotascreditosSessionBean==null) {
				this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean();
			}

			if(!this.transaccioneslocalesnotascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.transaccioneslocalesnotascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionesLocalesNotasCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionesLocalesNotasCreditos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransaccionesLocalesNotasCreditos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransaccionesLocalesNotasCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransaccionesLocalesNotasCreditos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean(); 
		this.transaccioneslocalesnotascreditosConstantesFunciones=new TransaccionesLocalesNotasCreditosConstantesFunciones(); 
		this.transaccioneslocalesnotascreditosBean=new TransaccionesLocalesNotasCreditos();//(this.transaccioneslocalesnotascreditosConstantesFunciones); 		
		this.transaccioneslocalesnotascreditosReturnGeneral=new TransaccionesLocalesNotasCreditosParameterReturnGeneral(); 
		
		this.transaccioneslocalesnotascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioneslocalesnotascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransaccionesLocalesNotasCreditos(true);
			
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
			
			this.transaccioneslocalesnotascreditosConstantesFunciones=new TransaccionesLocalesNotasCreditosConstantesFunciones(); 
			this.transaccioneslocalesnotascreditosBean=new TransaccionesLocalesNotasCreditos();//this.transaccioneslocalesnotascreditosConstantesFunciones); 			
			this.transaccioneslocalesnotascreditosReturnGeneral=new TransaccionesLocalesNotasCreditosParameterReturnGeneral(); 
		
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transacciones Locales Notas Creditos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.transaccioneslocalesnotascreditos=new TransaccionesLocalesNotasCreditos();
			this.transaccioneslocalesnotascreditoss = new ArrayList<TransaccionesLocalesNotasCreditos>();
			this.transaccioneslocalesnotascreditossAux = new ArrayList<TransaccionesLocalesNotasCreditos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic=new TransaccionesLocalesNotasCreditosLogic();
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.transaccioneslocalesnotascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transaccioneslocalesnotascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos);	
					}
					
					if(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos);
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setVisible(false);
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos);
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setVisible(false);
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos);
					this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setVisible(false);
					this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos);
					this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setVisible(false);
					this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransaccionesLocalesNotasCreditosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransaccionesLocalesNotasCreditosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transaccioneslocalesnotascreditosReturnGeneral=new TransaccionesLocalesNotasCreditosParameterReturnGeneral();
			
			this.transaccioneslocalesnotascreditosParameterGeneral=new TransaccionesLocalesNotasCreditosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transaccioneslocalesnotascreditosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionesLocalesNotasCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionesLocalesNotasCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
			
			
			this.isVisibilidadBusquedaTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransaccionesLocalesNotasCreditos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransaccionesLocalesNotasCreditos(false);
			
			this.setPermisosUsuarioTransaccionesLocalesNotasCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() 
				|| (this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() && this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransaccionesLocalesNotasCreditosClasesRelacionadas();
			}
			
			if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransaccionesLocalesNotasCreditosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransaccionesLocalesNotasCreditos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransaccionesLocalesNotasCreditos();
			}
			
			if(!this.isPermisoBusquedaTransaccionesLocalesNotasCreditos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransaccionesLocalesNotasCreditosConstantesFunciones.getTiposSeleccionarTransaccionesLocalesNotasCreditos());
				
				this.tiposColumnasSelect=TransaccionesLocalesNotasCreditosConstantesFunciones.getTiposSeleccionarTransaccionesLocalesNotasCreditos(true);
				
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
			//if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransaccionesLocalesNotasCreditos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioTransaccionesLocalesNotasCreditos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioTransaccionesLocalesNotasCreditos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesNotasCreditos() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transaccioneslocalesnotascreditosImplementable= (TransaccionesLocalesNotasCreditosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionesLocalesNotasCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transaccioneslocalesnotascreditosImplementableHome= (TransaccionesLocalesNotasCreditosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionesLocalesNotasCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transaccioneslocalesnotascreditoss= new ArrayList<TransaccionesLocalesNotasCreditos>();
			this.transaccioneslocalesnotascreditossEliminados= new ArrayList<TransaccionesLocalesNotasCreditos>();
						
			this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
			this.esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransaccionesLocalesNotasCreditos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransaccionesLocalesNotasCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransaccionesLocalesNotasCreditosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransaccionesLocalesNotasCreditos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransaccionesLocalesNotasCreditos();
			}
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransaccionesLocalesNotasCreditos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TransaccionesLocalesNotasCreditos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransaccionesLocalesNotasCreditos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransaccionesLocalesNotasCreditos")) {
				iIndex=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransaccionesLocalesNotasCreditos();	
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
	
	public void cargarCombosForeignKeyTransaccionesLocalesNotasCreditos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransaccionesLocalesNotasCreditos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransaccionesLocalesNotasCreditos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransaccionesLocalesNotasCreditosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransaccionesLocalesNotasCreditos();
		
		this.cargarCombosFrameForeignKeyTransaccionesLocalesNotasCreditos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransaccionesLocalesNotasCreditos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransaccionesLocalesNotasCreditos();
		}
	}
	
	
	
	public void jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
			
			if(jTableDatosTransaccionesLocalesNotasCreditos.getRowCount()>=1) {
				jTableDatosTransaccionesLocalesNotasCreditos.removeRowSelectionInterval(0, jTableDatosTransaccionesLocalesNotasCreditos.getRowCount()-1);						
			}
			
			this.isEsNuevoTransaccionesLocalesNotasCreditos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransaccionesLocalesNotasCreditos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(true);			
			//this.transaccioneslocalesnotascreditos=new TransaccionesLocalesNotasCreditos();
			//this.transaccioneslocalesnotascreditos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos() ;
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionesLocalesNotasCreditos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transaccioneslocalesnotascreditos);	
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);				
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
			if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TransaccionesLocalesNotasCreditos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRows().length;			
			}
			
			transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransaccionesLocalesNotasCreditos--;			
				//TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux= new TransaccionesLocalesNotasCreditos();			
				//transaccioneslocalesnotascreditosAux.setId(this.iIdNuevoTransaccionesLocalesNotasCreditos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosOrigen=new TransaccionesLocalesNotasCreditos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosOrigen : transaccioneslocalesnotascreditossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transaccioneslocalesnotascreditosOrigen =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioneslocalesnotascreditosOrigen =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransaccionesLocalesNotasCreditos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transaccioneslocalesnotascreditos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosOrigen,this.transaccioneslocalesnotascreditos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().add(this.transaccioneslocalesnotascreditosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditoss.add(this.transaccioneslocalesnotascreditosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
				
				this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesNotasCreditos(), this.getIndiceNuevoTransaccionesLocalesNotasCreditos());
				
				int iLastRow =  this.jTableDatosTransaccionesLocalesNotasCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionesLocalesNotasCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionesLocalesNotasCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();									
		
			TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosOrigen=new TransaccionesLocalesNotasCreditos();
			TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosDestino=new TransaccionesLocalesNotasCreditos();
				
			transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transaccioneslocalesnotascreditossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesnotascreditosOrigen =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioneslocalesnotascreditosOrigen =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesnotascreditosDestino =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioneslocalesnotascreditosDestino =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transaccioneslocalesnotascreditosOrigen =transaccioneslocalesnotascreditossSeleccionados.get(0);
				transaccioneslocalesnotascreditosDestino =transaccioneslocalesnotascreditossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosOrigen,transaccioneslocalesnotascreditosDestino,true,false);
				
				transaccioneslocalesnotascreditosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccioneslocalesnotascreditosDestino,transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioneslocalesnotascreditosDestino,transaccioneslocalesnotascreditoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
				
				//this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesNotasCreditos(), this.getIndiceNuevoTransaccionesLocalesNotasCreditos());
				
				int iLastRow =  this.jTableDatosTransaccionesLocalesNotasCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionesLocalesNotasCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionesLocalesNotasCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(!isVisible);
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(!isVisible);
			this.jPanelAccionesTransaccionesLocalesNotasCreditos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransaccionesLocalesNotasCreditos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransaccionesLocalesNotasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransaccionesLocalesNotasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransaccionesLocalesNotasCreditos();
			
			this.abrirFrameOrderByTransaccionesLocalesNotasCreditos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransaccionesLocalesNotasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransaccionesLocalesNotasCreditos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.isMaximum()) {
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setSize(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.iWidthFormulario,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.isMaximum()) {
						this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jContentPaneDetalleTransaccionesLocalesNotasCreditos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jContentPaneDetalleTransaccionesLocalesNotasCreditos.getWidth(),TransaccionesLocalesNotasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jContentPaneDetalleTransaccionesLocalesNotasCreditos.getWidth(),TransaccionesLocalesNotasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jContentPaneDetalleTransaccionesLocalesNotasCreditos.getWidth(),TransaccionesLocalesNotasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setVisible(true);
	        this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransaccionesLocalesNotasCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos,false,this);
				} else {
					this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos);
				this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setVisible(false);
				this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setSelected(false);
				
				this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionesLocalesNotasCreditos"));
				
				this.inicializarActualizarBindingTablaOrderByTransaccionesLocalesNotasCreditos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransaccionesLocalesNotasCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos==null) {
				
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos=new ImportacionJInternalFrame(TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos);
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setVisible(false);
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setSelected(false);


				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionesLocalesNotasCreditos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransaccionesLocalesNotasCreditos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos==null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos=new ReporteDinamicoJInternalFrame(TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos);
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setVisible(false);
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionesLocalesNotasCreditos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTransaccionesLocalesNotasCreditos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos);
			
	       	this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setVisible(false);
	        this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.dispose();
			//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransaccionesLocalesNotasCreditos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransaccionesLocalesNotasCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setVisible(true);
	        this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransaccionesLocalesNotasCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setVisible(true);
	        this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransaccionesLocalesNotasCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setVisible(false);
	        this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransaccionesLocalesNotasCreditos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransaccionesLocalesNotasCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setVisible(false);
	        this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransaccionesLocalesNotasCreditos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransaccionesLocalesNotasCreditos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(true);
			//this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(false) ;
			
			if(transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionesLocalesNotasCreditos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransaccionesLocalesNotasCreditos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(true);
			//this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transaccioneslocalesnotascreditos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(false) ;
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionesLocalesNotasCreditos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransaccionesLocalesNotasCreditos(false);
			
			//if(!this.isEsNuevoTransaccionesLocalesNotasCreditos) {								
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				
			}
			
			if(this.permiteMantenimiento(this.transaccioneslocalesnotascreditos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransaccionesLocalesNotasCreditos=true;
					this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
					this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransaccionesLocalesNotasCreditos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(false);
				
				this.habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(false);
			
												
				
				if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransaccionesLocalesNotasCreditos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transaccioneslocalesnotascreditos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				this.transaccioneslocalesnotascreditos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				this.transaccioneslocalesnotascreditos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transaccioneslocalesnotascreditos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransaccionesLocalesNotasCreditosModel) this.jTableDatosTransaccionesLocalesNotasCreditos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransaccionesLocalesNotasCreditos=true;
				this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
				this.isEsNuevoTransaccionesLocalesNotasCreditos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(false);
				
				this.habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(false);
				
				
				
				if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransaccionesLocalesNotasCreditos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransaccionesLocalesNotasCreditos.getRowCount()>=1) {
				jTableDatosTransaccionesLocalesNotasCreditos.removeRowSelectionInterval(0, jTableDatosTransaccionesLocalesNotasCreditos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransaccionesLocalesNotasCreditos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(false) ;
			
			this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
			
			if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransaccionesLocalesNotasCreditos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				
				//SI ES MANUAL
				if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransaccionesLocalesNotasCreditos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransaccionesLocalesNotasCreditos--;			
			//TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux= new TransaccionesLocalesNotasCreditos();			
			//transaccioneslocalesnotascreditosAux.setId(this.iIdNuevoTransaccionesLocalesNotasCreditos);
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransaccionesLocalesNotasCreditos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
			
			this.transaccioneslocalesnotascreditos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().add(this.transaccioneslocalesnotascreditosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transaccioneslocalesnotascreditoss.add(this.transaccioneslocalesnotascreditosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
			
			this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesNotasCreditos(), this.getIndiceNuevoTransaccionesLocalesNotasCreditos());
			
			int iLastRow =  this.jTableDatosTransaccionesLocalesNotasCreditos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransaccionesLocalesNotasCreditos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransaccionesLocalesNotasCreditos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionesLocalesNotasCreditos();
			}
			
			//this.abrirFrameTreeTransaccionesLocalesNotasCreditos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setFileImportacion(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransaccionesLocalesNotasCreditos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		

		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransaccionesLocalesNotasCreditosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransaccionesLocalesNotasCreditosBaseDesign.jrxml";
			
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
			
			this.generarReporteTransaccionesLocalesNotasCreditoss("Todos",transaccioneslocalesnotascreditossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE:
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
		
		if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoria="total_sin_iva";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoria="ruc_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoriaValor="total_sin_iva";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoriaValor="ruc_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_sin_iva");
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesnotascreditos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TransaccionesLocalesNotasCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.gettotal_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE);
					iRow++;

					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesnotascreditos.getruc_cliente());
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
			//	this.getFilaCabeceraExportarExcelTransaccionesLocalesNotasCreditos(row);				
			//	iRow++;
			//}				
			
			//for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
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
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionesLocalesNotasCreditos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionesLocalesNotasCreditos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionesLocalesNotasCreditos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransaccionesLocalesNotasCreditos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransaccionesLocalesNotasCreditos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransaccionesLocalesNotasCreditos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransaccionesLocalesNotasCreditos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransaccionesLocalesNotasCreditos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransaccionesLocalesNotasCreditos.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransaccionesLocalesNotasCreditos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransaccionesLocalesNotasCreditos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransaccionesLocalesNotasCreditos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransaccionesLocalesNotasCreditos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesNotasCreditos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransaccionesLocalesNotasCreditos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransaccionesLocalesNotasCreditos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos();
		
		this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionesLocalesNotasCreditos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesNotasCreditos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionesLocalesNotasCreditos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionesLocalesNotasCreditos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jCheckBoxPostAccionNuevoTransaccionesLocalesNotasCreditos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jCheckBoxPostAccionSinCerrarTransaccionesLocalesNotasCreditos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jCheckBoxPostAccionSinMensajeTransaccionesLocalesNotasCreditos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jCheckBoxPostAccionNuevoTransaccionesLocalesNotasCreditos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jCheckBoxPostAccionSinCerrarTransaccionesLocalesNotasCreditos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jCheckBoxPostAccionSinMensajeTransaccionesLocalesNotasCreditos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransaccionesLocalesNotasCreditos(Boolean esInicializar) throws Exception {
		try	{	
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionesLocalesNotasCreditos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesNotasCreditos() throws Exception {
		try	{
			if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionesLocalesNotasCreditos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionesLocalesNotasCreditos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionesLocalesNotasCreditos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.addItem(reporte);
			}
			
			
			if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionesLocalesNotasCreditos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionesLocalesNotasCreditos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TransaccionesLocalesNotasCreditosConstantesFunciones.getTiposSeleccionarTransaccionesLocalesNotasCreditos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TransaccionesLocalesNotasCreditosConstantesFunciones.getTiposSeleccionarTransaccionesLocalesNotasCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TransaccionesLocalesNotasCreditosConstantesFunciones.getTiposSeleccionarTransaccionesLocalesNotasCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransaccionesLocalesNotasCreditos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.getSelectedItem()!=null){this.id_ejercicioBusquedaTransaccionesLocalesNotasCreditos=((Ejercicio)this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaTransaccionesLocalesNotasCreditos=new Date(this.jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.getDate().getTime());
		this.fecha_hastaBusquedaTransaccionesLocalesNotasCreditos=new Date(this.jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransaccionesLocalesNotasCreditos(Boolean esInicializar) throws Exception {				
		if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionesLocalesNotasCreditos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos() throws Exception {
		this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransaccionesLocalesNotasCreditos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transaccioneslocalesnotascreditoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransaccionesLocalesNotasCreditos.setModel(new TransaccionesLocalesNotasCreditosModel(this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransaccionesLocalesNotasCreditos.setModel(new TransaccionesLocalesNotasCreditosModel(this.transaccioneslocalesnotascreditoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransaccionesLocalesNotasCreditos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO,transaccioneslocalesnotascreditosConstantesFunciones.resaltarSeleccionarTransaccionesLocalesNotasCreditos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO,transaccioneslocalesnotascreditosConstantesFunciones.resaltarSeleccionarTransaccionesLocalesNotasCreditos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_ID));

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.mostraridTransaccionesLocalesNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltaridTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activaridTransaccionesLocalesNotasCreditos,iSizeTabla,this,true,"idTransaccionesLocalesNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltaridTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activaridTransaccionesLocalesNotasCreditos,this,true,"idTransaccionesLocalesNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarnombre_completo_clienteTransaccionesLocalesNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesNotasCreditos,iSizeTabla,this,true,"nombre_completo_clienteTransaccionesLocalesNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesNotasCreditos,this,true,"nombre_completo_clienteTransaccionesLocalesNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA));

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotal_ivaTransaccionesLocalesNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_ivaTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_ivaTransaccionesLocalesNotasCreditos,iSizeTabla,this,true,"total_ivaTransaccionesLocalesNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_ivaTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_ivaTransaccionesLocalesNotasCreditos,this,true,"total_ivaTransaccionesLocalesNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA));

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotal_sin_ivaTransaccionesLocalesNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesNotasCreditos,iSizeTabla,this,true,"total_sin_ivaTransaccionesLocalesNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesNotasCreditos,this,true,"total_sin_ivaTransaccionesLocalesNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA));

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarivaTransaccionesLocalesNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarivaTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activarivaTransaccionesLocalesNotasCreditos,iSizeTabla,this,true,"ivaTransaccionesLocalesNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarivaTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activarivaTransaccionesLocalesNotasCreditos,this,true,"ivaTransaccionesLocalesNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL));

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotalTransaccionesLocalesNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotalTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activartotalTransaccionesLocalesNotasCreditos,iSizeTabla,this,true,"totalTransaccionesLocalesNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotalTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activartotalTransaccionesLocalesNotasCreditos,this,true,"totalTransaccionesLocalesNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE));

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarruc_clienteTransaccionesLocalesNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarruc_clienteTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activarruc_clienteTransaccionesLocalesNotasCreditos,iSizeTabla,this,true,"ruc_clienteTransaccionesLocalesNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarruc_clienteTransaccionesLocalesNotasCreditos,this.transaccioneslocalesnotascreditosConstantesFunciones.activarruc_clienteTransaccionesLocalesNotasCreditos,this,true,"ruc_clienteTransaccionesLocalesNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesNotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionesLocalesNotasCreditos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionesLocalesNotasCreditos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransaccionesLocalesNotasCreditos.addColumn(tableColumn);
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
			
			this.jTableDatosTransaccionesLocalesNotasCreditos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransaccionesLocalesNotasCreditos.moveColumn(this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransaccionesLocalesNotasCreditos.moveColumn(this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransaccionesLocalesNotasCreditos.moveColumn(this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransaccionesLocalesNotasCreditos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransaccionesLocalesNotasCreditos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransaccionesLocalesNotasCreditos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransaccionesLocalesNotasCreditos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transaccioneslocalesnotascreditoss.size()-1;
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
		//this.jTableDatosTransaccionesLocalesNotasCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransaccionesLocalesNotasCreditos();
			
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
				
				//this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
					
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
				if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transaccioneslocalesnotascreditos.getsType().equals("DUPLICADO")
				   || this.transaccioneslocalesnotascreditos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransaccionesLocalesNotasCreditos=true;
				
				} else {
					this.isEsNuevoTransaccionesLocalesNotasCreditos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
					if(this.transaccioneslocalesnotascreditos.getId()>=0 && !this.transaccioneslocalesnotascreditos.getIsNew()) {						
						this.isEsNuevoTransaccionesLocalesNotasCreditos=false;
						
					} else {
						this.isEsNuevoTransaccionesLocalesNotasCreditos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransaccionesLocalesNotasCreditos(esRelaciones);						
				
				this.seleccionarTransaccionesLocalesNotasCreditos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transaccioneslocalesnotascreditos.getId()<0) {
					this.isEsNuevoTransaccionesLocalesNotasCreditos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransaccionesLocalesNotasCreditos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransaccionesLocalesNotasCreditos(evt,rowIndex);
				}	
				
				if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TransaccionesLocalesNotasCreditos: " + this.dDif); 
					}
				}								
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransaccionesLocalesNotasCreditos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transaccioneslocalesnotascreditos)) {
					if(this.transaccioneslocalesnotascreditos.getId()>0) {
						this.transaccioneslocalesnotascreditos.setIsDeleted(true);
						
						this.transaccioneslocalesnotascreditossEliminados.add(this.transaccioneslocalesnotascreditos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().remove(this.transaccioneslocalesnotascreditos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditoss.remove(this.transaccioneslocalesnotascreditos);				
					}
					
					
					((TransaccionesLocalesNotasCreditosModel) this.jTableDatosTransaccionesLocalesNotasCreditos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransaccionesLocalesNotasCreditos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransaccionesLocalesNotasCreditos) {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos);
	}
	
	public void setVariablesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getId().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.gettotal_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getiva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.gettotal().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getruc_cliente());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transaccioneslocalesnotascreditosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transaccioneslocalesnotascreditosLocal=this.transaccioneslocalesnotascreditos;
			} else {
				transaccioneslocalesnotascreditosLocal=this.transaccioneslocalesnotascreditosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transaccioneslocalesnotascreditosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosLocal,true);
					
					if(transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transaccioneslocalesnotascreditosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transaccioneslocalesnotascreditosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.getText()==null || this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.getText()=="" || this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.getText()=="Id") {
				this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.setText("0");
			}

			if(conColumnasBase) {transaccioneslocalesnotascreditos.setId(Long.parseLong(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelIdTransaccionesLocalesNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesnotascreditos.setnombre_completo_cliente(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesnotascreditos.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotal_ivaTransaccionesLocalesNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesnotascreditos.settotal_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesnotascreditos.setiva(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelivaTransaccionesLocalesNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesnotascreditos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabeltotalTransaccionesLocalesNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesnotascreditos.setruc_cliente(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelruc_clienteTransaccionesLocalesNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosBean,TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosOrigen,TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.getId()!=null && !transaccioneslocalesnotascreditosOrigen.getId().equals(0L))) {transaccioneslocalesnotascreditos.setId(transaccioneslocalesnotascreditosOrigen.getId());}}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.getfecha_desde()!=null && !transaccioneslocalesnotascreditosOrigen.getfecha_desde().equals(new Date()))) {transaccioneslocalesnotascreditos.setfecha_desde(transaccioneslocalesnotascreditosOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.getfecha_hasta()!=null && !transaccioneslocalesnotascreditosOrigen.getfecha_hasta().equals(new Date()))) {transaccioneslocalesnotascreditos.setfecha_hasta(transaccioneslocalesnotascreditosOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.getnombre_completo_cliente()!=null && !transaccioneslocalesnotascreditosOrigen.getnombre_completo_cliente().equals(""))) {transaccioneslocalesnotascreditos.setnombre_completo_cliente(transaccioneslocalesnotascreditosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.gettotal_iva()!=null && !transaccioneslocalesnotascreditosOrigen.gettotal_iva().equals(0.0))) {transaccioneslocalesnotascreditos.settotal_iva(transaccioneslocalesnotascreditosOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.gettotal_sin_iva()!=null && !transaccioneslocalesnotascreditosOrigen.gettotal_sin_iva().equals(0.0))) {transaccioneslocalesnotascreditos.settotal_sin_iva(transaccioneslocalesnotascreditosOrigen.gettotal_sin_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.getiva()!=null && !transaccioneslocalesnotascreditosOrigen.getiva().equals(0.0))) {transaccioneslocalesnotascreditos.setiva(transaccioneslocalesnotascreditosOrigen.getiva());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.gettotal()!=null && !transaccioneslocalesnotascreditosOrigen.gettotal().equals(0.0))) {transaccioneslocalesnotascreditos.settotal(transaccioneslocalesnotascreditosOrigen.gettotal());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosOrigen.getruc_cliente()!=null && !transaccioneslocalesnotascreditosOrigen.getruc_cliente().equals(""))) {transaccioneslocalesnotascreditos.setruc_cliente(transaccioneslocalesnotascreditosOrigen.getruc_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getId().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.gettotal_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getiva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.gettotal().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditos.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditosBean transaccioneslocalesnotascreditosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditosBean.getId().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditosBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditosBean.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditosBean.getiva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditosBean.gettotal().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setText(transaccioneslocalesnotascreditosBean.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditosParameterReturnGeneral transaccioneslocalesnotascreditosReturnGeneral,TransaccionesLocalesNotasCreditosBean transaccioneslocalesnotascreditosBean,Boolean conDefault) throws Exception { 
		try {
			TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal=new TransaccionesLocalesNotasCreditos();
			
			transaccioneslocalesnotascreditosLocal=transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioneslocalesnotascreditosLocal.getId()!=null && !transaccioneslocalesnotascreditosLocal.getId().equals(0L))) {transaccioneslocalesnotascreditosBean.setId(transaccioneslocalesnotascreditosLocal.getId());}}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosLocal.getnombre_completo_cliente()!=null && !transaccioneslocalesnotascreditosLocal.getnombre_completo_cliente().equals(""))) {transaccioneslocalesnotascreditosBean.setnombre_completo_cliente(transaccioneslocalesnotascreditosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosLocal.gettotal_iva()!=null && !transaccioneslocalesnotascreditosLocal.gettotal_iva().equals(0.0))) {transaccioneslocalesnotascreditosBean.settotal_iva(transaccioneslocalesnotascreditosLocal.gettotal_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosLocal.gettotal_sin_iva()!=null && !transaccioneslocalesnotascreditosLocal.gettotal_sin_iva().equals(0.0))) {transaccioneslocalesnotascreditosBean.settotal_sin_iva(transaccioneslocalesnotascreditosLocal.gettotal_sin_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosLocal.getiva()!=null && !transaccioneslocalesnotascreditosLocal.getiva().equals(0.0))) {transaccioneslocalesnotascreditosBean.setiva(transaccioneslocalesnotascreditosLocal.getiva());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosLocal.gettotal()!=null && !transaccioneslocalesnotascreditosLocal.gettotal().equals(0.0))) {transaccioneslocalesnotascreditosBean.settotal(transaccioneslocalesnotascreditosLocal.gettotal());}
			if(conDefault || (!conDefault && transaccioneslocalesnotascreditosLocal.getruc_cliente()!=null && !transaccioneslocalesnotascreditosLocal.getruc_cliente().equals(""))) {transaccioneslocalesnotascreditosBean.setruc_cliente(transaccioneslocalesnotascreditosLocal.getruc_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransaccionesLocalesNotasCreditosGenerico(Long idTransaccionesLocalesNotasCreditosSeleccionado,JComboBox jComboBoxTransaccionesLocalesNotasCreditos,List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossLocal)throws Exception {
		try {
			TransaccionesLocalesNotasCreditos  transaccioneslocalesnotascreditosTemp=null;

			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditossLocal) {
				if(transaccioneslocalesnotascreditosAux.getId()!=null && transaccioneslocalesnotascreditosAux.getId().equals(idTransaccionesLocalesNotasCreditosSeleccionado)) {
					transaccioneslocalesnotascreditosTemp=transaccioneslocalesnotascreditosAux;
					break;
				}
			}

			jComboBoxTransaccionesLocalesNotasCreditos.setSelectedItem(transaccioneslocalesnotascreditosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransaccionesLocalesNotasCreditosGenerico(JComboBox jComboBoxTransaccionesLocalesNotasCreditos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionesLocalesNotasCreditos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransaccionesLocalesNotasCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionesLocalesNotasCreditos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransaccionesLocalesNotasCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioneslocalesnotascreditos=(TransaccionesLocalesNotasCreditos) transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) transaccioneslocalesnotascreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transaccioneslocalesnotascreditos.getIsNew() && !transaccioneslocalesnotascreditos.getIsChanged() && !transaccioneslocalesnotascreditos.getIsDeleted()) {
				sDescripcion=transaccioneslocalesnotascreditos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioneslocalesnotascreditos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!transaccioneslocalesnotascreditos.getIsNew() && !transaccioneslocalesnotascreditos.getIsChanged() && !transaccioneslocalesnotascreditos.getIsDeleted()) {
				sDescripcion=transaccioneslocalesnotascreditos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioneslocalesnotascreditos.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosRow=new TransaccionesLocalesNotasCreditos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioneslocalesnotascreditosRow=(TransaccionesLocalesNotasCreditos) transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioneslocalesnotascreditosRow=(TransaccionesLocalesNotasCreditos) transaccioneslocalesnotascreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos));			
			this.jButtonDuplicarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos && this.isPermisoDuplicarTransaccionesLocalesNotasCreditos));			
			this.jButtonCopiarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos && this.isPermisoCopiarTransaccionesLocalesNotasCreditos));
			this.jButtonVerFormTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos && this.isPermisoVerFormTransaccionesLocalesNotasCreditos));
			
			this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos && this.isPermisoOrdenTransaccionesLocalesNotasCreditos));			
			
			this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos));			
			this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos && this.isPermisoActualizarTransaccionesLocalesNotasCreditos));	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos && this.isPermisoActualizarTransaccionesLocalesNotasCreditos));	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos && this.isPermisoEliminarTransaccionesLocalesNotasCreditos));
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarTransaccionesLocalesNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos);							
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos));						
			this.jButtonDuplicarToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos && this.isPermisoDuplicarTransaccionesLocalesNotasCreditos));						
			this.jButtonCopiarToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos && this.isPermisoCopiarTransaccionesLocalesNotasCreditos));			
			this.jButtonVerFormToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos && this.isPermisoVerFormTransaccionesLocalesNotasCreditos));			
			this.jButtonAbrirOrderByToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos && this.isPermisoOrdenTransaccionesLocalesNotasCreditos));
			this.jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos));			
			this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));			
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos && this.isPermisoActualizarTransaccionesLocalesNotasCreditos));	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos  && this.isPermisoActualizarTransaccionesLocalesNotasCreditos));	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos && this.isPermisoEliminarTransaccionesLocalesNotasCreditos));
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos);				
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos));			
			this.jMenuItemDuplicarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos && this.isPermisoDuplicarTransaccionesLocalesNotasCreditos));			
			this.jMenuItemCopiarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos && this.isPermisoCopiarTransaccionesLocalesNotasCreditos));			
			this.jMenuItemVerFormTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos && this.isPermisoVerFormTransaccionesLocalesNotasCreditos));			
			this.jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos && this.isPermisoOrdenTransaccionesLocalesNotasCreditos));			
			//this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos && this.isPermisoOrdenTransaccionesLocalesNotasCreditos));
			this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos && this.isPermisoOrdenTransaccionesLocalesNotasCreditos));			
			//this.jMenuItemDetalleMostrarOcultarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos && this.isPermisoOrdenTransaccionesLocalesNotasCreditos));			
			this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos));			
			this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos && this.isPermisoNuevoTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));									
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemModificarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos && this.isPermisoActualizarTransaccionesLocalesNotasCreditos));	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemActualizarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos && this.isPermisoActualizarTransaccionesLocalesNotasCreditos));	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemEliminarTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos && this.isPermisoEliminarTransaccionesLocalesNotasCreditos));
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemCancelarTransaccionesLocalesNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos);				
			}
			
			this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));						
			this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=this.jButtonNuevoTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos=this.jButtonDuplicarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos=this.jButtonCopiarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos=this.jButtonVerFormTransaccionesLocalesNotasCreditos.isVisible();
			
			this.isVisibilidadCeldaOrdenTransaccionesLocalesNotasCreditos=this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=this.jButtonModificarTransaccionesLocalesNotasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=this.jButtonNuevoToolBarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=this.jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarToolBarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=this.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=this.jMenuItemNuevoTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemModificarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemActualizarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemEliminarTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemCancelarTransaccionesLocalesNotasCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransaccionesLocalesNotasCreditos(Boolean esInicializar) {
		if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
				//if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionesLocalesNotasCreditos();
			}
			
			this.inicializarActualizarBindingBotonesManualTransaccionesLocalesNotasCreditos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransaccionesLocalesNotasCreditos() {
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoNuevoTransaccionesLocalesNotasCreditos);			
		this.jButtonDuplicarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoDuplicarTransaccionesLocalesNotasCreditos);			
		this.jButtonCopiarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoCopiarTransaccionesLocalesNotasCreditos);			
		this.jButtonVerFormTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoVerFormTransaccionesLocalesNotasCreditos);			
		
		this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoOrdenTransaccionesLocalesNotasCreditos);					
		
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoNuevoTransaccionesLocalesNotasCreditos);			
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoActualizarTransaccionesLocalesNotasCreditos);	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoActualizarTransaccionesLocalesNotasCreditos);	
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoEliminarTransaccionesLocalesNotasCreditos);
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarTransaccionesLocalesNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos);						
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos);							
		}
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoActualizarTransaccionesLocalesNotasCreditos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionesLocalesNotasCreditos() {
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoActualizarTransaccionesLocalesNotasCreditos);	
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoActualizarTransaccionesLocalesNotasCreditos);	
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarTransaccionesLocalesNotasCreditos.setVisible(this.isPermisoEliminarTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarTransaccionesLocalesNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos);							
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos && this.isPermisoGuardarCambiosTransaccionesLocalesNotasCreditos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransaccionesLocalesNotasCreditos() {
		if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransaccionesLocalesNotasCreditos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransaccionesLocalesNotasCreditos() {
	}
	
	public void jTableDatosTransaccionesLocalesNotasCreditosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransaccionesLocalesNotasCreditos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transaccioneslocalesnotascreditos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransaccionesLocalesNotasCreditosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransaccionesLocalesNotasCreditos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionesLocalesNotasCreditos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transaccioneslocalesnotascreditosLogic.getConnexion());

				if(this.transaccioneslocalesnotascreditos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transaccioneslocalesnotascreditos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionesLocalesNotasCreditos=(TitledBorder)this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransaccionesLocalesNotasCreditos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transaccioneslocalesnotascreditos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebTransaccionesLocalesNotasCreditos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionesLocalesNotasCreditos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.transaccioneslocalesnotascreditosLogic.getConnexion());

				if(this.transaccioneslocalesnotascreditos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.transaccioneslocalesnotascreditos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionesLocalesNotasCreditos=(TitledBorder)this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderTransaccionesLocalesNotasCreditos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.transaccioneslocalesnotascreditos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.transaccioneslocalesnotascreditos.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.transaccioneslocalesnotascreditos.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.transaccioneslocalesnotascreditos.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.transaccioneslocalesnotascreditos.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.gettotal_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_sin_iva = "+this.transaccioneslocalesnotascreditos.gettotal_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.transaccioneslocalesnotascreditos.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.transaccioneslocalesnotascreditos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_clienteTransaccionesLocalesNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.gettransaccioneslocalesnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesnotascreditos==null) {
						this.transaccioneslocalesnotascreditos = new TransaccionesLocalesNotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);
				}

				if(this.transaccioneslocalesnotascreditos.getruc_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_cliente like '%"+this.transaccioneslocalesnotascreditos.getruc_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);

			this.getTransaccionesLocalesNotasCreditossBusquedaTransaccionesLocalesNotasCreditos();

			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);

			//if(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);

			this.getTransaccionesLocalesNotasCreditossFK_IdEjercicio();

			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);

			//if(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransaccionesLocalesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);

			this.getTransaccionesLocalesNotasCreditossFK_IdEmpresa();

			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);

			//if(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesnotascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransaccionesLocalesNotasCreditos() {
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.dispose();
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
			this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.dispose();
			this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos=null;
		}
		
		if(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos!=null) {
			this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setVisible(false);	    			
			this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.dispose();
			this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransaccionesLocalesNotasCreditos();
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransaccionesLocalesNotasCreditos")) {
				jButtonDuplicarTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransaccionesLocalesNotasCreditos")) {
				jButtonCopiarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransaccionesLocalesNotasCreditos")) {
				jButtonVerFormTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonDuplicarTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransaccionesLocalesNotasCreditos")) {
				jButtonDuplicarTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransaccionesLocalesNotasCreditos")) {
				jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransaccionesLocalesNotasCreditos")) {
				jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransaccionesLocalesNotasCreditos")) {
				jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransaccionesLocalesNotasCreditos")) {
				jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransaccionesLocalesNotasCreditos")) {
				jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransaccionesLocalesNotasCreditos")) {
				jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransaccionesLocalesNotasCreditos")) {
				jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransaccionesLocalesNotasCreditos")) {
				jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransaccionesLocalesNotasCreditos")) {
				jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransaccionesLocalesNotasCreditos")) {
				jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonMostrarOcultarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransaccionesLocalesNotasCreditos")) {
				jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonCopiarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonVerFormTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransaccionesLocalesNotasCreditos")) {
				jButtonCopiarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransaccionesLocalesNotasCreditos")) {
				jButtonVerFormTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransaccionesLocalesNotasCreditos")) {
				jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransaccionesLocalesNotasCreditos")) {
				jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransaccionesLocalesNotasCreditos")) {
				jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransaccionesLocalesNotasCreditos")) {
				jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransaccionesLocalesNotasCreditos")) {
				jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransaccionesLocalesNotasCreditos")) {
				jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransaccionesLocalesNotasCreditos") || sTipo.equals("MenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos")) {
				jButtonAbrirOrderByTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransaccionesLocalesNotasCreditos") || sTipo.equals("MenuItemDetalleMostrarOcultarTransaccionesLocalesNotasCreditos")) {
				jButtonMostrarOcultarTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransaccionesLocalesNotasCreditos")) {
				jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransaccionesLocalesNotasCreditos")) {
				jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos")) {
				
				jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransaccionesLocalesNotasCreditos")) {
				jButtonCerrarImportacionTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransaccionesLocalesNotasCreditos")) {
				
				jButtonGenerarImportacionTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransaccionesLocalesNotasCreditos")) {
				
				jButtonAbrirImportacionTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransaccionesLocalesNotasCreditos")) {
				jComboBoxTiposAccionesTransaccionesLocalesNotasCreditosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransaccionesLocalesNotasCreditos")) {
				jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransaccionesLocalesNotasCreditos")) {
				jComboBoxTiposAccionesTransaccionesLocalesNotasCreditosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransaccionesLocalesNotasCreditos")) {
				
				jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransaccionesLocalesNotasCreditos")) {
				jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransaccionesLocalesNotasCreditos")) {
				jButtonAbrirOrderByTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransaccionesLocalesNotasCreditos")) {
				jButtonAbrirOrderByTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransaccionesLocalesNotasCreditos")) {
				jButtonCerrarOrderByTransaccionesLocalesNotasCreditosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonidTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesNotasCreditosUpdate")) {
				this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesNotasCreditosUpdate")) {
				this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtontotalTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos")) {
				this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			}
			
			;
			
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransaccionesLocalesNotasCreditos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal=null;
			
			if(!this.getEsControlTabla()) {
				transaccioneslocalesnotascreditosLocal=this.transaccioneslocalesnotascreditos;
			} else {
				transaccioneslocalesnotascreditosLocal=this.transaccioneslocalesnotascreditosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
							
				
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
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
			
			


			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
								
						
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
								
				
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
							
				
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
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
			
			


			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
								
				
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransaccionesLocalesNotasCreditos")) {
					jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransaccionesLocalesNotasCreditos")) {
					jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransaccionesLocalesNotasCreditos")) {
					
				}
				
				


				
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
												
				
				


				
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
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
			
			


			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesnotascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesnotascreditos);
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
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
				
				


				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesNotasCreditos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesNotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesnotascreditosAnterior =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransaccionesLocalesNotasCreditos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransaccionesLocalesNotasCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transaccioneslocalesnotascreditos =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transaccioneslocalesnotascreditos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransaccionesLocalesNotasCreditos")) {
				
				}
				
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransaccionesLocalesNotasCreditos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransaccionesLocalesNotasCreditos")) {
			
			}
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransaccionesLocalesNotasCreditos();
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
			if(sTipo.equals("NuevoTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransaccionesLocalesNotasCreditos")) {
				jButtonDuplicarTransaccionesLocalesNotasCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransaccionesLocalesNotasCreditos")) {
				jButtonCopiarTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransaccionesLocalesNotasCreditos")) {
				jButtonVerFormTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransaccionesLocalesNotasCreditos")) {
				jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransaccionesLocalesNotasCreditos")) {
				jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransaccionesLocalesNotasCreditos")) {
				jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransaccionesLocalesNotasCreditos")) {
				jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransaccionesLocalesNotasCreditos")) {
				jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransaccionesLocalesNotasCreditos")) {
				jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionesLocalesNotasCreditos")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransaccionesLocalesNotasCreditos")) {
				jButtonAbrirOrderByTransaccionesLocalesNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransaccionesLocalesNotasCreditos")) {
				jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransaccionesLocalesNotasCreditos")) {
				jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransaccionesLocalesNotasCreditos")) {
				jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonidTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesNotasCreditosUpdate")) {
				this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesNotasCreditosUpdate")) {
				this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonivaTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtontotalTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteTransaccionesLocalesNotasCreditosBusqueda")) {
				this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusquedaActionPerformed(evt);
			}
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransaccionesLocalesNotasCreditos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransaccionesLocalesNotasCreditos")) {
				closingInternalFrameTransaccionesLocalesNotasCreditos();
				
			} else if(sTipo.equals("jButtonCancelarTransaccionesLocalesNotasCreditos")) {
				JInternalFrameBase jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos = (JInternalFrameBase)evt.getSource();
	            	
	            TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame jInternalFrameParent=(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(null);
			}
			
			TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioneslocalesnotascreditos,new Object(),this.transaccioneslocalesnotascreditosParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransaccionesLocalesNotasCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransaccionesLocalesNotasCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransaccionesLocalesNotasCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transaccioneslocalesnotascreditos)) {
			if(!esControlTabla) {
				if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);			
				}
				
				if(this.transaccioneslocalesnotascreditosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral,this.transaccioneslocalesnotascreditosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transaccioneslocalesnotascreditosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionesLocalesNotasCreditos(classes,this.transaccioneslocalesnotascreditosReturnGeneral,this.transaccioneslocalesnotascreditosBean,false);
					}
						
					if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos());	
					}
						
					if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos(),classes);//this.transaccioneslocalesnotascreditosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,classes);//this.transaccioneslocalesnotascreditosBean);									
				}
			
				if(TransaccionesLocalesNotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesNotasCreditos(this.transaccioneslocalesnotascreditos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transaccioneslocalesnotascreditosAnterior!=null) {
						this.transaccioneslocalesnotascreditos=this.transaccioneslocalesnotascreditosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccioneslocalesnotascreditosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos(),transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditos(),this.transaccioneslocalesnotascreditoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransaccionesLocalesNotasCreditos.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransaccionesLocalesNotasCreditos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransaccionesLocalesNotasCreditos();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransaccionesLocalesNotasCreditos() throws Exception {
		
		TransaccionesLocalesNotasCreditosModel transaccioneslocalesnotascreditosModel=(TransaccionesLocalesNotasCreditosModel)this.jTableDatosTransaccionesLocalesNotasCreditos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioneslocalesnotascreditosModel.transaccioneslocalesnotascreditoss=this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transaccioneslocalesnotascreditosModel.transaccioneslocalesnotascreditoss=this.transaccioneslocalesnotascreditoss;
		}
		
		
		((TransaccionesLocalesNotasCreditosModel) this.jTableDatosTransaccionesLocalesNotasCreditos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransaccionesLocalesNotasCreditos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransaccioneslocalesnotascreditosAnterior(),this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransaccioneslocalesnotascreditosAnterior(),this.transaccioneslocalesnotascreditoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransaccionesLocalesNotasCreditos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
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
										
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioneslocalesnotascreditos,new Object(),generalEntityParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransaccionesLocalesNotasCreditosConstantesFunciones.getClassesRelationshipsOfTransaccionesLocalesNotasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransaccionesLocalesNotasCreditosConstantesFunciones.getClassesRelationshipsFromStringsOfTransaccionesLocalesNotasCreditos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransaccionesLocalesNotasCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioneslocalesnotascreditos,new Object(),generalEntityParameterGeneral,this.transaccioneslocalesnotascreditosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditosBean transaccioneslocalesnotascreditosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionesLocalesNotasCreditos(ArrayList<Classe> classes,TransaccionesLocalesNotasCreditosReturnGeneral transaccioneslocalesnotascreditosReturnGeneral,TransaccionesLocalesNotasCreditosBean transaccioneslocalesnotascreditosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transaccioneslocalesnotascreditos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos = new TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame(jDesktopPane,this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones(),this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setVisible(false);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.transaccioneslocalesnotascreditosLogic=this.transaccioneslocalesnotascreditosLogic;
		
		this.cargarCombosFrameForeignKeyTransaccionesLocalesNotasCreditos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionesLocalesNotasCreditos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionesLocalesNotasCreditos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransaccionesLocalesNotasCreditos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransaccionesLocalesNotasCreditos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionesLocalesNotasCreditos"));
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarTransaccionesLocalesNotasCreditos"));

		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarToolBarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionesLocalesNotasCreditos"));
					
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemModificarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionesLocalesNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionesLocalesNotasCreditos"));
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionesLocalesNotasCreditos"));
						
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemActualizarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionesLocalesNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarTransaccionesLocalesNotasCreditos"));
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionesLocalesNotasCreditos"));
								
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemEliminarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionesLocalesNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarTransaccionesLocalesNotasCreditos"));
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionesLocalesNotasCreditos"));
					
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemCancelarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionesLocalesNotasCreditos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionesLocalesNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionesLocalesNotasCreditos"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionesLocalesNotasCreditos"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionesLocalesNotasCreditos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonidTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionesLocalesNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteTransaccionesLocalesNotasCreditosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionesLocalesNotasCreditos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransaccionesLocalesNotasCreditos"));
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionesLocalesNotasCreditos"));
		}
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransaccionesLocalesNotasCreditos"));
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransaccionesLocalesNotasCreditos"));
		
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"NuevoTransaccionesLocalesNotasCreditos"));
		
		this.jButtonDuplicarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"DuplicarTransaccionesLocalesNotasCreditos"));
		
		this.jButtonCopiarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"CopiarTransaccionesLocalesNotasCreditos"));
		
		this.jButtonVerFormTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"VerFormTransaccionesLocalesNotasCreditos"));
		
		
		this.jButtonNuevoToolBarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jButtonDuplicarToolBarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemNuevoTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemDuplicarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransaccionesLocalesNotasCreditos"));		
		
		
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransaccionesLocalesNotasCreditos"));
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarTransaccionesLocalesNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonModificarToolBarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionesLocalesNotasCreditos"));
			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemModificarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionesLocalesNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionesLocalesNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionesLocalesNotasCreditos"));
				
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemActualizarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionesLocalesNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarTransaccionesLocalesNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionesLocalesNotasCreditos"));
						
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemEliminarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionesLocalesNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarTransaccionesLocalesNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionesLocalesNotasCreditos"));
			
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemCancelarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionesLocalesNotasCreditos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransaccionesLocalesNotasCreditos"));		
		
		
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CerrarTransaccionesLocalesNotasCreditos"));
		
		
		this.jButtonCerrarToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemCerrarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransaccionesLocalesNotasCreditos"));
			
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionesLocalesNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransaccionesLocalesNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionesLocalesNotasCreditos"));
		}
		
		this.jButtonCopiarToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jButtonVerFormToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransaccionesLocalesNotasCreditos"));
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemCopiarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransaccionesLocalesNotasCreditos"));		
		
		this.jMenuItemVerFormTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransaccionesLocalesNotasCreditos"));		
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionesLocalesNotasCreditos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionesLocalesNotasCreditos"));		
		
		
		
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransaccionesLocalesNotasCreditos"));
					
		this.jButtonRecargarInformacionToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransaccionesLocalesNotasCreditos"));
		
		this.jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransaccionesLocalesNotasCreditos"));		
		
		
		
		this.jButtonAnterioresTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"AnterioresTransaccionesLocalesNotasCreditos"));
		
		
		this.jButtonAnterioresToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransaccionesLocalesNotasCreditos"));
		
		this.jMenuItemAnterioresTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransaccionesLocalesNotasCreditos"));		
		
		
		this.jButtonSiguientesTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"SiguientesTransaccionesLocalesNotasCreditos"));
		
		
		this.jButtonSiguientesToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemSiguientesTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransaccionesLocalesNotasCreditos"));		
		
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransaccionesLocalesNotasCreditos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos"));
			
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransaccionesLocalesNotasCreditos"));

		this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransaccionesLocalesNotasCreditos"));
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionesLocalesNotasCreditos"));
		}
		
		
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransaccionesLocalesNotasCreditos"));
			
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesTransaccionesLocalesNotasCreditos"));
					
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransaccionesLocalesNotasCreditos"));
			
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransaccionesLocalesNotasCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonidTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionesLocalesNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteTransaccionesLocalesNotasCreditosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"BusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos!=null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionesLocalesNotasCreditos"));				
			//this.jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionesLocalesNotasCreditos"));
			//this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos!=null) {
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionesLocalesNotasCreditos"));
				this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionesLocalesNotasCreditos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransaccionesLocalesNotasCreditos"));
			
			this.jButtonAbrirOrderByToolBarTransaccionesLocalesNotasCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransaccionesLocalesNotasCreditos"));			
			
			if(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos!=null) {
				this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionesLocalesNotasCreditos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionesLocalesNotasCreditos"));
		
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
            		closingInternalFrameTransaccionesLocalesNotasCreditos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos = (JInternalFrameBase)event.getSource();
	            	
	            TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame jInternalFrameParent=(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransaccionesLocalesNotasCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonNuevoTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionesLocalesNotasCreditosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonModificarTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransaccionesLocalesNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonActualizarTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransaccionesLocalesNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonEliminarTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransaccionesLocalesNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonCancelarTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonCerrarTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransaccionesLocalesNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransaccionesLocalesNotasCreditos";
		inputMap = this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransaccionesLocalesNotasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonidTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionesLocalesNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ivaTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalTransaccionesLocalesNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteTransaccionesLocalesNotasCreditosBusqueda"));
		
		
		this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.addActionListener(new ButtonActionListener(this,"BusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransaccionesLocalesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransaccionesLocalesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransaccionesLocalesNotasCreditos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
					transaccioneslocalesnotascreditosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditoss) {
					transaccioneslocalesnotascreditosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
						transaccioneslocalesnotascreditosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditoss) {
						transaccioneslocalesnotascreditosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesNotasCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionesLocalesNotasCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesNotasCreditos.getSelectedRows();
			
			TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosLocal=new TransaccionesLocalesNotasCreditos();
			
			//this.seleccionarTodosTransaccionesLocalesNotasCreditos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioneslocalesnotascreditosLocal =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transaccioneslocalesnotascreditosLocal =(TransaccionesLocalesNotasCreditos) this.transaccioneslocalesnotascreditoss.toArray()[this.jTableDatosTransaccionesLocalesNotasCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transaccioneslocalesnotascreditosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
						transaccioneslocalesnotascreditosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditoss) {
						transaccioneslocalesnotascreditosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesNotasCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionesLocalesNotasCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesNotasCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransaccionesLocalesNotasCreditosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransaccionesLocalesNotasCreditosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
				
						if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditoss) {
					
						if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							transaccioneslocalesnotascreditosAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransaccionesLocalesNotasCreditosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransaccionesLocalesNotasCreditos) {				
					conSplash=true;//false;										
					
					//this.startProcessTransaccionesLocalesNotasCreditos(conSplash);
				
					this.generarReporteTransaccionesLocalesNotasCreditossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransaccionesLocalesNotasCreditossSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionesLocalesNotasCreditossSeleccionados(false);
				//this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionesLocalesNotasCreditossSeleccionados(true);
				//this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionesLocalesNotasCreditos();
				
				this.exportarTransaccionesLocalesNotasCreditossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransaccionesLocalesNotasCreditoss();
				//this.importarTransaccionesLocalesNotasCreditoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionesLocalesNotasCreditos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransaccionesLocalesNotasCreditossSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transacciones Locales Notas Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransaccionesLocalesNotasCreditos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransaccionesLocalesNotasCreditos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransaccionesLocalesNotasCreditos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
				}	
			} 			
			else if(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransaccionesLocalesNotasCreditos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransaccionesLocalesNotasCreditos(conSplash);
					
						//this.actualizarParametrosGeneralTransaccionesLocalesNotasCreditos();
						
						this.generarReporteProcesoAccionTransaccionesLocalesNotasCreditossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Transacciones Locales Notas CreditosES SELECCIONADOS?", "MANTENIMIENTO DE Transacciones Locales Notas Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransaccionesLocalesNotasCreditos();
				
						this.actualizarParametrosGeneralTransaccionesLocalesNotasCreditos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transaccioneslocalesnotascreditosReturnGeneral=transaccioneslocalesnotascreditosLogic.procesarAccionTransaccionesLocalesNotasCreditossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss(),this.transaccioneslocalesnotascreditosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransaccionesLocalesNotasCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransaccionesLocalesNotasCreditos();
					
					TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransaccionesLocalesNotasCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransaccionesLocalesNotasCreditos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransaccionesLocalesNotasCreditos();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
			TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos=new TransaccionesLocalesNotasCreditos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.getSelectedItem();
			
			
			
			
			transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
			//this.sTipoAccion;
			
			if(transaccioneslocalesnotascreditossSeleccionados.size()==1) {
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditossSeleccionados) {
					transaccioneslocalesnotascreditos=transaccioneslocalesnotascreditosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransaccionesLocalesNotasCreditos();
			
      		//this.finishProcessTransaccionesLocalesNotasCreditos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransaccionesLocalesNotasCreditosReturnGeneral() throws Exception {
		if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transaccioneslocalesnotascreditosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transaccioneslocalesnotascreditosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transaccioneslocalesnotascreditosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transaccioneslocalesnotascreditosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
		}
		
		if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRetornoLista() || this.transaccioneslocalesnotascreditosReturnGeneral.getConRetornoObjeto()) {
			if(this.transaccioneslocalesnotascreditosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccioneslocalesnotascreditosLogic.setTransaccionesLocalesNotasCreditoss(this.transaccioneslocalesnotascreditosReturnGeneral.getTransaccionesLocalesNotasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingTransaccionesLocalesNotasCreditos(false);
		}
	}
	
	public void actualizarParametrosGeneralTransaccionesLocalesNotasCreditos() throws Exception {
		
		
	}
	
	public ArrayList<TransaccionesLocalesNotasCreditos> getTransaccionesLocalesNotasCreditossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransaccionesLocalesNotasCreditos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss()) {
					if(transaccioneslocalesnotascreditosAux.getIsSelected()) {
						transaccioneslocalesnotascreditossSeleccionados.add(transaccioneslocalesnotascreditosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:this.transaccioneslocalesnotascreditoss) {
					if(transaccioneslocalesnotascreditosAux.getIsSelected()) {
						transaccioneslocalesnotascreditossSeleccionados.add(transaccioneslocalesnotascreditosAux);				
					}
				}
			}
			
			if(transaccioneslocalesnotascreditossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transaccioneslocalesnotascreditossSeleccionados.addAll(this.transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transaccioneslocalesnotascreditossSeleccionados.addAll(this.transaccioneslocalesnotascreditoss);				
					}
				}
			}
		} else {
			transaccioneslocalesnotascreditossSeleccionados.add(this.transaccioneslocalesnotascreditos);
		}
		
		return transaccioneslocalesnotascreditossSeleccionados;
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
	
	public void generarReporteTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransaccionesLocalesNotasCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransaccionesLocalesNotasCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionesLocalesNotasCreditossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionesLocalesNotasCreditossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transacciones Locales Notas Creditos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransaccionesLocalesNotasCreditoss("Todos",transaccioneslocalesnotascreditossSeleccionados);
		
	}	
	
	public void generarReporteNormalTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransaccionesLocalesNotasCreditoss("Todos",transaccioneslocalesnotascreditossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransaccionesLocalesNotasCreditossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransaccionesLocalesNotasCreditoss("Todos",transaccioneslocalesnotascreditossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransaccionesLocalesNotasCreditos();
		
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransaccionesLocalesNotasCreditos();
		
		
		//this.generarReporteTransaccionesLocalesNotasCreditoss("Todos",transaccioneslocalesnotascreditossSeleccionados ,transaccioneslocalesnotascreditosImplementable,transaccioneslocalesnotascreditosImplementableHome);
	}
	
	public void mostrarImportacionTransaccionesLocalesNotasCreditoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransaccionesLocalesNotasCreditos();
		
		this.abrirFrameImportacionTransaccionesLocalesNotasCreditos();		
		
			
		//this.generarReporteTransaccionesLocalesNotasCreditoss("Todos",transaccioneslocalesnotascreditossSeleccionados ,transaccioneslocalesnotascreditosImplementable,transaccioneslocalesnotascreditosImplementableHome);
	}
	
	public void importarTransaccionesLocalesNotasCreditoss() throws Exception {		
	
	}
	
	public void exportarTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransaccionesLocalesNotasCreditossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransaccionesLocalesNotasCreditossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransaccionesLocalesNotasCreditossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transacciones Locales Notas Creditos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesnotascreditos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransaccionesLocalesNotasCreditos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transaccioneslocalesnotascreditosAux.setsDetalleGeneralEntityReporte(transaccioneslocalesnotascreditosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransaccionesLocalesNotasCreditos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transaccioneslocalesnotascreditos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.gettotal_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesnotascreditos.getruc_cliente();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesnotascreditos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TransaccionesLocalesNotasCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransaccionesLocalesNotasCreditos(row);				
				iRow++;
			}				
			
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransaccionesLocalesNotasCreditossSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();		
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesnotascreditos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transaccioneslocalesnotascreditoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transaccioneslocalesnotascreditos");
			//elementRoot.appendChild(element);
		
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditossSeleccionados) {
				element = document.createElement("transaccioneslocalesnotascreditos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransaccionesLocalesNotasCreditos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.gettotal_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesnotascreditos.getruc_cliente());				
	}
	
	public void setFilaDatosExportarXmlTransaccionesLocalesNotasCreditos(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementfecha_desde = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementnombre_completo_cliente = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementtotal_iva = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementtotal_sin_iva = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.TOTALSINIVA);
		elementtotal_sin_iva.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.gettotal_sin_iva().toString().trim()));
		element.appendChild(elementtotal_sin_iva);

		Element elementiva = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementtotal = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementruc_cliente = document.createElement(TransaccionesLocalesNotasCreditosConstantesFunciones.RUCCLIENTE);
		elementruc_cliente.appendChild(document.createTextNode(transaccioneslocalesnotascreditos.getruc_cliente().trim()));
		element.appendChild(elementruc_cliente);
	}
	
	public void generarReporteGroupGenericoTransaccionesLocalesNotasCreditossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados=new ArrayList<TransaccionesLocalesNotasCreditos>();
		
		transaccioneslocalesnotascreditossSeleccionados=this.getTransaccionesLocalesNotasCreditossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransaccionesLocalesNotasCreditos(transaccioneslocalesnotascreditossSeleccionados);
		
		this.generarReporteTransaccionesLocalesNotasCreditoss("Todos",transaccioneslocalesnotascreditossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransaccionesLocalesNotasCreditos(ArrayList<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditosAux:transaccioneslocalesnotascreditossSeleccionados) {
				transaccioneslocalesnotascreditosAux.setsDetalleGeneralEntityReporte(transaccioneslocalesnotascreditosAux.toString());
			
				if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transaccioneslocalesnotascreditosAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesnotascreditosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					transaccioneslocalesnotascreditosAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesnotascreditosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					transaccioneslocalesnotascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(transaccioneslocalesnotascreditosAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					transaccioneslocalesnotascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(transaccioneslocalesnotascreditosAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					transaccioneslocalesnotascreditosAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesnotascreditosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE)) {
					existe=true;
					transaccioneslocalesnotascreditosAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesnotascreditosAux.getruc_cliente());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransaccionesLocalesNotasCreditos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=true;
				this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=true;
				this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=true;
			}
			
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=true;
		} else {
			this.actualizarEstadoPanelsTransaccionesLocalesNotasCreditos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransaccionesLocalesNotasCreditos=false;
			//this.isVisibilidadCeldaVerFormTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaDuplicarTransaccionesLocalesNotasCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
		} else {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			if(!transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;												
			}
			
			this.jButtonCerrarTransaccionesLocalesNotasCreditos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
		}
		
		if(!this.permiteMantenimiento(this.transaccioneslocalesnotascreditos)) {
			this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoTransaccionesLocalesNotasCreditos=false;
		this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesNotasCreditos=false;
		this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesNotasCreditos=false;
		//this.isVisibilidadCeldaModificarTransaccionesLocalesNotasCreditos=true;
		this.isVisibilidadCeldaActualizarTransaccionesLocalesNotasCreditos=false;
		this.isVisibilidadCeldaEliminarTransaccionesLocalesNotasCreditos=false;
		//this.isVisibilidadCeldaCancelarTransaccionesLocalesNotasCreditos=true;			
		this.isVisibilidadCeldaGuardarTransaccionesLocalesNotasCreditos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionesLocalesNotasCreditos() {
	}
	
	public void actualizarEstadoPanelsTransaccionesLocalesNotasCreditos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos!=null) {
				this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
					this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaTransaccionesLocalesNotasCreditos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaTransaccionesLocalesNotasCreditos) {this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.remove(jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaTransaccionesLocalesNotasCreditos=isParaEjercicio;
			if(!this.isVisibilidadBusquedaTransaccionesLocalesNotasCreditos) {this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.remove(jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);}
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
			
			this.inicializarActualizarBindingTablaTransaccionesLocalesNotasCreditos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransaccionesLocalesNotasCreditos() {
		this.updateBorderResaltarBusquedasFormularioTransaccionesLocalesNotasCreditos();
		this.updateVisibilidadBusquedasFormularioTransaccionesLocalesNotasCreditos();
		this.updateHabilitarBusquedasFormularioTransaccionesLocalesNotasCreditos();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransaccionesLocalesNotasCreditos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getComponents().length>0) {
	

		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos!=null) {
			index= this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getComponent(index);
				jPanel.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransaccionesLocalesNotasCreditos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
			if(!this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos && index>-1) {
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransaccionesLocalesNotasCreditos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
				this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setEnabledAt(index,this.transaccioneslocalesnotascreditosConstantesFunciones.activarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransaccionesLocalesNotasCreditos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaTransaccionesLocalesNotasCreditos")) {
			index= this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);

			this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.getComponent(index);

			this.transaccioneslocalesnotascreditosConstantesFunciones.setResaltarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos(resaltar);

			jPanel.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransaccionesLocalesNotasCreditos() throws Exception {

		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransaccionesLocalesNotasCreditos();
		this.updateVisibilidadResaltarControlesFormularioTransaccionesLocalesNotasCreditos();
		this.updateHabilitarResaltarControlesFormularioTransaccionesLocalesNotasCreditos();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransaccionesLocalesNotasCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltaridTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltaridTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarid_empresaTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarid_empresaTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarid_ejercicioTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarid_ejercicioTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarfecha_desdeTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarfecha_desdeTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarfecha_hastaTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarfecha_hastaTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_ivaTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_ivaTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarivaTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarivaTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotalTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltartotalTransaccionesLocalesNotasCreditos);}
		if(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarruc_clienteTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setBorder(this.transaccioneslocalesnotascreditosConstantesFunciones.resaltarruc_clienteTransaccionesLocalesNotasCreditos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransaccionesLocalesNotasCreditos() throws Exception {		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
	
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostraridTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelidTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostraridTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarid_empresaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelid_empresaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarid_empresaTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarid_ejercicioTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelid_ejercicioTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarid_ejercicioTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarfecha_desdeTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelfecha_desdeTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarfecha_desdeTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarfecha_hastaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelfecha_hastaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarfecha_hastaTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarnombre_completo_clienteTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarnombre_completo_clienteTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotal_ivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPaneltotal_ivaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotal_ivaTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotal_sin_ivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotal_sin_ivaTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelivaTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarivaTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotalTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPaneltotalTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrartotalTransaccionesLocalesNotasCreditos);
		//this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarruc_clienteTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jPanelruc_clienteTransaccionesLocalesNotasCreditos.setVisible(this.transaccioneslocalesnotascreditosConstantesFunciones.mostrarruc_clienteTransaccionesLocalesNotasCreditos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransaccionesLocalesNotasCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos!=null) {
	
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jLabelidTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activaridTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarid_empresaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarid_ejercicioTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarfecha_desdeTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarfecha_hastaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_ivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldivaTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarivaTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldtotalTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activartotalTransaccionesLocalesNotasCreditos);
		this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos.jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setEnabled(this.transaccioneslocalesnotascreditosConstantesFunciones.activarruc_clienteTransaccionesLocalesNotasCreditos);
		}
	}
	
		
}