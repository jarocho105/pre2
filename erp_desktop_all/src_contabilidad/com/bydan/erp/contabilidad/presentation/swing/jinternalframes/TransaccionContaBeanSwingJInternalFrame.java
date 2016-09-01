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

import com.bydan.erp.contabilidad.util.TransaccionContaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TransaccionContaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TransaccionContaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TransaccionContaBean;
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

import com.bydan.erp.sris.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransaccionContaBeanSwingJInternalFrame extends TransaccionContaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransaccionContaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TransaccionConta> transaccioncontaValidator = new ClassValidator<TransaccionConta>(TransaccionConta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TransaccionConta transaccionconta;	
	public TransaccionConta transaccioncontaAux;
	public TransaccionConta transaccioncontaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TransaccionConta transaccioncontaTotales;
	public Long idTransaccionContaActual;
	public Long iIdNuevoTransaccionConta=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosTransaccionLocal=false;

	public Boolean getIsTienePermisosTransaccionLocal() {
		return isTienePermisosTransaccionLocal;
	}

	public void setIsTienePermisosTransaccionLocal(Boolean isTienePermisosTransaccionLocal) {
		this.isTienePermisosTransaccionLocal= isTienePermisosTransaccionLocal;
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
	
	public Boolean isPermisoTodoTransaccionConta;
	public Boolean isPermisoNuevoTransaccionConta;
	public Boolean isPermisoActualizarTransaccionConta;
	public Boolean isPermisoActualizarOriginalTransaccionConta;
	public Boolean isPermisoEliminarTransaccionConta;
	public Boolean isPermisoGuardarCambiosTransaccionConta;
	public Boolean isPermisoConsultaTransaccionConta;
	public Boolean isPermisoBusquedaTransaccionConta;
	public Boolean isPermisoReporteTransaccionConta;
	public Boolean isPermisoPaginacionMedioTransaccionConta;
	public Boolean isPermisoPaginacionAltoTransaccionConta;
	public Boolean isPermisoPaginacionTodoTransaccionConta;
	public Boolean isPermisoCopiarTransaccionConta;
	public Boolean isPermisoVerFormTransaccionConta;
	public Boolean isPermisoDuplicarTransaccionConta;
	public Boolean isPermisoOrdenTransaccionConta;
	
	
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
	
	public TransaccionContaParameterReturnGeneral transaccioncontaReturnGeneral;
	public TransaccionContaParameterReturnGeneral transaccioncontaParameterGeneral;
	
	

	public TransaccionLocalLogic transaccionlocalLogic=null;

	public TransaccionLocalLogic getTransaccionLocalLogic() {
		return transaccionlocalLogic;
	}

	public void setTransaccionLocalLogic(TransaccionLocalLogic transaccionlocalLogic) {
		this.transaccionlocalLogic = transaccionlocalLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransaccionConta=false;
	public Boolean esParaAccionDesdeFormularioTransaccionConta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransaccionContaSessionBeanAdditional transaccioncontaSessionBeanAdditional=null;
	
	public TransaccionContaSessionBeanAdditional getTransaccionContaSessionBeanAdditional() {
		return this.transaccioncontaSessionBeanAdditional;
	}
	
	public void setTransaccionContaSessionBeanAdditional(TransaccionContaSessionBeanAdditional transaccioncontaSessionBeanAdditional) {
		try {
			this.transaccioncontaSessionBeanAdditional=transaccioncontaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransaccionContaBeanSwingJInternalFrameAdditional transaccioncontaBeanSwingJInternalFrameAdditional=null;
	//public class TransaccionContaBeanSwingJInternalFrame
	
	public TransaccionContaBeanSwingJInternalFrameAdditional getTransaccionContaBeanSwingJInternalFrameAdditional() {
		return this.transaccioncontaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransaccionContaBeanSwingJInternalFrameAdditional(TransaccionContaBeanSwingJInternalFrameAdditional transaccioncontaBeanSwingJInternalFrameAdditional) {
		try {
			this.transaccioncontaBeanSwingJInternalFrameAdditional=transaccioncontaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransaccionContaLogic transaccioncontaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TransaccionConta transaccioncontaBean;
	public TransaccionContaConstantesFunciones transaccioncontaConstantesFunciones;
	//public TransaccionContaParameterReturnGeneral transaccioncontaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TransaccionConta> transaccioncontas;	
	//public List<TransaccionConta> transaccioncontasEliminados;
	//public List<TransaccionConta> transaccioncontasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransaccionConta=false;
	public Boolean isVisibilidadCeldaDuplicarTransaccionConta=true;
	public Boolean isVisibilidadCeldaCopiarTransaccionConta=true;
	public Boolean isVisibilidadCeldaVerFormTransaccionConta=true;
	public Boolean isVisibilidadCeldaOrdenTransaccionConta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
	public Boolean isVisibilidadCeldaModificarTransaccionConta=false;
	public Boolean isVisibilidadCeldaActualizarTransaccionConta=false;
	public Boolean isVisibilidadCeldaEliminarTransaccionConta=false;
	public Boolean isVisibilidadCeldaCancelarTransaccionConta=false;
	public Boolean isVisibilidadCeldaGuardarTransaccionConta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransaccionConta=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTransaccionConta() {
		return this.iIdNuevoTransaccionConta;
	}

	public void setiIdNuevoTransaccionConta(Long iIdNuevoTransaccionConta) {
		this.iIdNuevoTransaccionConta = iIdNuevoTransaccionConta;
	}
	
	public Long getidTransaccionContaActual() {
		return this.idTransaccionContaActual;
	}

	public void setidTransaccionContaActual(Long idTransaccionContaActual) {
		this.idTransaccionContaActual = idTransaccionContaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TransaccionConta gettransaccionconta() {
		return this.transaccionconta;
	}

	public void settransaccionconta(TransaccionConta transaccionconta) {
		this.transaccionconta = transaccionconta;
	}
	
	public TransaccionConta gettransaccioncontaAux() {
		return this.transaccioncontaAux;
	}

	public void settransaccioncontaAux(TransaccionConta transaccioncontaAux) {
		this.transaccioncontaAux = transaccioncontaAux;
	}				
	
	public TransaccionConta gettransaccioncontaAnterior() {
		return this.transaccioncontaAnterior;
	}

	public void settransaccioncontaAnterior(TransaccionConta transaccioncontaAnterior) {
		this.transaccioncontaAnterior = transaccioncontaAnterior;
	}	
	
	public TransaccionConta gettransaccioncontaTotales() {
		return this.transaccioncontaTotales;
	}

	public void settransaccioncontaTotales(TransaccionConta transaccioncontaTotales) {
		this.transaccioncontaTotales = transaccioncontaTotales;
	}	
	
	public TransaccionConta gettransaccioncontaBean() {
		return this.transaccioncontaBean;
	}

	public void settransaccioncontaBean(TransaccionConta transaccioncontaBean) {
		this.transaccioncontaBean = transaccioncontaBean;
	}	
	
	public TransaccionContaParameterReturnGeneral gettransaccioncontaReturnGeneral() {
		return this.transaccioncontaReturnGeneral;
	}

	public void settransaccioncontaReturnGeneral(TransaccionContaParameterReturnGeneral transaccioncontaReturnGeneral) {
		this.transaccioncontaReturnGeneral = transaccioncontaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransaccionContaLogic getTransaccionContaLogic()	{		
		return transaccioncontaLogic;
	}

	public void setTransaccionContaLogic(TransaccionContaLogic transaccioncontaLogic) {
		this.transaccioncontaLogic = transaccioncontaLogic;
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
	
	public Boolean getIsEsNuevoTransaccionConta() {
		return isEsNuevoTransaccionConta;
	}

	public void setIsEsNuevoTransaccionConta(Boolean isEsNuevoTransaccionConta) {
		this.isEsNuevoTransaccionConta = isEsNuevoTransaccionConta;
	}

	public Boolean getEsParaAccionDesdeFormularioTransaccionConta() {
		return esParaAccionDesdeFormularioTransaccionConta;
	}
	
	public void setEsParaAccionDesdeFormularioTransaccionConta(Boolean esParaAccionDesdeFormularioTransaccionConta) {
		this.esParaAccionDesdeFormularioTransaccionConta = esParaAccionDesdeFormularioTransaccionConta;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTransaccionConta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TransaccionContaConstantesFunciones.refrescarForeignKeysDescripcionesTransaccionConta(this.transaccioncontaLogic.getTransaccionContas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TransaccionContaConstantesFunciones.refrescarForeignKeysDescripcionesTransaccionConta(this.transaccioncontas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//transaccioncontaLogic.setTransaccionContas(this.transaccioncontas);
			transaccioncontaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TransaccionContaParameterReturnGeneral getTransaccionContaParameterGeneral() {
		return this.transaccioncontaParameterGeneral;
	}
	
	public void setTransaccionContaParameterGeneral(TransaccionContaParameterReturnGeneral transaccioncontaParameterGeneral) {
		this.transaccioncontaParameterGeneral = transaccioncontaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransaccionConta() {
		return isPermisoTodoTransaccionConta;
	}

	public void setIsPermisoTodoTransaccionConta(Boolean isPermisoTodoTransaccionConta) {
		this.isPermisoTodoTransaccionConta = isPermisoTodoTransaccionConta;
	}

	public Boolean getIsPermisoNuevoTransaccionConta() {
		return isPermisoNuevoTransaccionConta;
	}

	public void setIsPermisoNuevoTransaccionConta(Boolean isPermisoNuevoTransaccionConta) {
		this.isPermisoNuevoTransaccionConta = isPermisoNuevoTransaccionConta;
	}

	public Boolean getIsPermisoActualizarTransaccionConta() {
		return isPermisoActualizarTransaccionConta;
	}

	public void setIsPermisoActualizarTransaccionConta(Boolean isPermisoActualizarTransaccionConta) {
		this.isPermisoActualizarTransaccionConta = isPermisoActualizarTransaccionConta;
	}

	public Boolean getIsPermisoEliminarTransaccionConta() {
		return isPermisoEliminarTransaccionConta;
	}

	public void setIsPermisoEliminarTransaccionConta(Boolean isPermisoEliminarTransaccionConta) {
		this.isPermisoEliminarTransaccionConta = isPermisoEliminarTransaccionConta;
	}

	public Boolean getIsPermisoGuardarCambiosTransaccionConta() {
		return isPermisoGuardarCambiosTransaccionConta;
	}

	public void setIsPermisoGuardarCambiosTransaccionConta(Boolean isPermisoGuardarCambiosTransaccionConta) {
		this.isPermisoGuardarCambiosTransaccionConta = isPermisoGuardarCambiosTransaccionConta;
	}
	
	public Boolean getIsPermisoConsultaTransaccionConta() {
		return isPermisoConsultaTransaccionConta;
	}

	public void setIsPermisoConsultaTransaccionConta(Boolean isPermisoConsultaTransaccionConta) {
		this.isPermisoConsultaTransaccionConta = isPermisoConsultaTransaccionConta;
	}

	public Boolean getIsPermisoBusquedaTransaccionConta() {
		return isPermisoBusquedaTransaccionConta;
	}

	public void setIsPermisoBusquedaTransaccionConta(Boolean isPermisoBusquedaTransaccionConta) {
		this.isPermisoBusquedaTransaccionConta = isPermisoBusquedaTransaccionConta;
	}

	public Boolean getIsPermisoReporteTransaccionConta() {
		return isPermisoReporteTransaccionConta;
	}

	public void setIsPermisoReporteTransaccionConta(Boolean isPermisoReporteTransaccionConta) {
		this.isPermisoReporteTransaccionConta = isPermisoReporteTransaccionConta;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransaccionConta() {
		return isPermisoPaginacionMedioTransaccionConta;
	}

	public void setIsPermisoPaginacionMedioTransaccionConta(Boolean isPermisoPaginacionMedioTransaccionConta) {
		this.isPermisoPaginacionMedioTransaccionConta = isPermisoPaginacionMedioTransaccionConta;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransaccionConta() {
		return isPermisoPaginacionTodoTransaccionConta;
	}

	public void setIsPermisoPaginacionTodoTransaccionConta(Boolean isPermisoPaginacionTodoTransaccionConta) {
		this.isPermisoPaginacionTodoTransaccionConta = isPermisoPaginacionTodoTransaccionConta;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransaccionConta() {
		return isPermisoPaginacionAltoTransaccionConta;
	}

	public void setIsPermisoPaginacionAltoTransaccionConta(Boolean isPermisoPaginacionAltoTransaccionConta) {
		this.isPermisoPaginacionAltoTransaccionConta = isPermisoPaginacionAltoTransaccionConta;
	}
	
	public Boolean getIsPermisoCopiarTransaccionConta() {
		return isPermisoCopiarTransaccionConta;
	}

	public void setIsPermisoCopiarTransaccionConta(Boolean isPermisoCopiarTransaccionConta) {
		this.isPermisoCopiarTransaccionConta = isPermisoCopiarTransaccionConta;
	}
	
	public Boolean getIsPermisoVerFormTransaccionConta() {
		return isPermisoVerFormTransaccionConta;
	}

	public void setIsPermisoVerFormTransaccionConta(Boolean isPermisoVerFormTransaccionConta) {
		this.isPermisoVerFormTransaccionConta = isPermisoVerFormTransaccionConta;
	}
	
	public Boolean getIsPermisoDuplicarTransaccionConta() {
		return isPermisoDuplicarTransaccionConta;
	}

	public void setIsPermisoDuplicarTransaccionConta(Boolean isPermisoDuplicarTransaccionConta) {
		this.isPermisoDuplicarTransaccionConta = isPermisoDuplicarTransaccionConta;
	}
	
	public Boolean getIsPermisoOrdenTransaccionConta() {
		return isPermisoOrdenTransaccionConta;
	}

	public void setIsPermisoOrdenTransaccionConta(Boolean isPermisoOrdenTransaccionConta) {
		this.isPermisoOrdenTransaccionConta = isPermisoOrdenTransaccionConta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransaccionConta() {
		return isVisibilidadCeldaNuevoTransaccionConta;
	}

	public void setIsVisibilidadCeldaNuevoTransaccionConta(Boolean isVisibilidadCeldaNuevoTransaccionConta) {
		this.isVisibilidadCeldaNuevoTransaccionConta = isVisibilidadCeldaNuevoTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransaccionConta() {
		return isVisibilidadCeldaDuplicarTransaccionConta;
	}

	public void setIsVisibilidadCeldaDuplicarTransaccionConta(Boolean isVisibilidadCeldaDuplicarTransaccionConta) {
		this.isVisibilidadCeldaDuplicarTransaccionConta = isVisibilidadCeldaDuplicarTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransaccionConta() {
		return isVisibilidadCeldaCopiarTransaccionConta;
	}

	public void setIsVisibilidadCeldaCopiarTransaccionConta(Boolean isVisibilidadCeldaCopiarTransaccionConta) {
		this.isVisibilidadCeldaCopiarTransaccionConta = isVisibilidadCeldaCopiarTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransaccionConta() {
		return isVisibilidadCeldaVerFormTransaccionConta;
	}

	public void setIsVisibilidadCeldaVerFormTransaccionConta(Boolean isVisibilidadCeldaVerFormTransaccionConta) {
		this.isVisibilidadCeldaVerFormTransaccionConta = isVisibilidadCeldaVerFormTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransaccionConta() {
		return isVisibilidadCeldaOrdenTransaccionConta;
	}

	public void setIsVisibilidadCeldaOrdenTransaccionConta(Boolean isVisibilidadCeldaOrdenTransaccionConta) {
		this.isVisibilidadCeldaOrdenTransaccionConta = isVisibilidadCeldaOrdenTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransaccionConta() {
		return isVisibilidadCeldaNuevoRelacionesTransaccionConta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransaccionConta(Boolean isVisibilidadCeldaNuevoRelacionesTransaccionConta) {
		this.isVisibilidadCeldaNuevoRelacionesTransaccionConta = isVisibilidadCeldaNuevoRelacionesTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransaccionConta() {
		return isVisibilidadCeldaModificarTransaccionConta;
	}

	public void setIsVisibilidadCeldaModificarTransaccionConta(Boolean isVisibilidadCeldaModificarTransaccionConta) {
		this.isVisibilidadCeldaModificarTransaccionConta = isVisibilidadCeldaModificarTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransaccionConta() {
		return isVisibilidadCeldaActualizarTransaccionConta;
	}

	public void setIsVisibilidadCeldaActualizarTransaccionConta(Boolean isVisibilidadCeldaActualizarTransaccionConta) {
		this.isVisibilidadCeldaActualizarTransaccionConta = isVisibilidadCeldaActualizarTransaccionConta;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransaccionConta() {
		return isVisibilidadCeldaEliminarTransaccionConta;
	}

	public void setIsVisibilidadCeldaEliminarTransaccionConta(Boolean isVisibilidadCeldaEliminarTransaccionConta) {
		this.isVisibilidadCeldaEliminarTransaccionConta = isVisibilidadCeldaEliminarTransaccionConta;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransaccionConta() {
		return isVisibilidadCeldaCancelarTransaccionConta;
	}

	public void setIsVisibilidadCeldaCancelarTransaccionConta(Boolean isVisibilidadCeldaCancelarTransaccionConta) {
		this.isVisibilidadCeldaCancelarTransaccionConta = isVisibilidadCeldaCancelarTransaccionConta;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransaccionConta() {
		return isVisibilidadCeldaGuardarTransaccionConta;
	}

	public void setIsVisibilidadCeldaGuardarTransaccionConta(Boolean isVisibilidadCeldaGuardarTransaccionConta) {
		this.isVisibilidadCeldaGuardarTransaccionConta = isVisibilidadCeldaGuardarTransaccionConta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransaccionConta() {
		return isVisibilidadCeldaGuardarCambiosTransaccionConta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransaccionConta(Boolean isVisibilidadCeldaGuardarCambiosTransaccionConta) {
		this.isVisibilidadCeldaGuardarCambiosTransaccionConta = isVisibilidadCeldaGuardarCambiosTransaccionConta;
	}
		
	public TransaccionContaSessionBean gettransaccioncontaSessionBean() {
		return this.transaccioncontaSessionBean;
	}
	
	public void settransaccioncontaSessionBean(TransaccionContaSessionBean transaccioncontaSessionBean) {
		this.transaccioncontaSessionBean=transaccioncontaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(TransaccionConta transaccionconta)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TransaccionConta transaccionconta,TransaccionConta transaccioncontaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransaccionConta(transaccionconta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transaccioncontaAux.setId(transaccionconta.getId());
		transaccioncontaAux.setVersionRow(transaccionconta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTransaccionConta();
		
			int intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = transaccioncontaValidator.getInvalidValues(this.transaccionconta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			transaccioncontaLogic.setDatosCliente(datosCliente);
			transaccioncontaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				transaccioncontaAux=new  TransaccionConta();
				
				transaccioncontaAux.setIsNew(true);
				transaccioncontaAux.setIsChanged(true);
				
				transaccioncontaAux.setTransaccionContaOriginal(this.transaccionconta);
				
				transaccioncontaAux.setId(this.transaccionconta.getId());	
				transaccioncontaAux.setVersionRow(this.transaccionconta.getVersionRow());	
				transaccioncontaAux.setcodigo(this.transaccionconta.getcodigo());	
				transaccioncontaAux.setnombre(this.transaccionconta.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(transaccioncontaAux,transaccioncontaLogic.getTransaccionContas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioncontaAux,transaccioncontas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaLogic.saveTransaccionContas();//WithConnection
						//transaccioncontaLogic.getSetVersionRowTransaccionContas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccionconta,transaccioncontaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccioncontaLogic.saveTransaccionContaRelaciones(transaccioncontaAux,this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());//WithConnection
								//transaccioncontaLogic.getSetVersionRowTransaccionContas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.transaccionconta,transaccioncontaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							transaccioncontaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(transaccioncontaAux,transaccioncontaLogic.getTransaccionContas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(transaccioncontaAux,transaccioncontas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.transaccionconta,transaccioncontaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				transaccioncontaAux=new  TransaccionConta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado() 
					|| (this.transaccioncontaSessionBean.getEsGuardarRelacionado() && this.transaccionconta.getId()>=0)) {
						
					transaccioncontaAux.setIsNew(false);
				}
				
				transaccioncontaAux.setIsDeleted(false);
			
				transaccioncontaAux.setId(this.transaccionconta.getId());	
				transaccioncontaAux.setVersionRow(this.transaccionconta.getVersionRow());	
				transaccioncontaAux.setcodigo(this.transaccionconta.getcodigo());	
				transaccioncontaAux.setnombre(this.transaccionconta.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccioncontaAux,transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioncontaAux,transaccioncontas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaLogic.saveTransaccionContas();//WithConnection
						//transaccioncontaLogic.getSetVersionRowTransaccionContas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccionconta,transaccioncontaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccioncontaLogic.saveTransaccionContaRelaciones(transaccioncontaAux,this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());//WithConnection
								//transaccioncontaLogic.getSetVersionRowTransaccionContas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.transaccionconta,transaccioncontaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							transaccioncontaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(transaccioncontaAux,transaccioncontaLogic.getTransaccionContas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(transaccioncontaAux,transaccioncontas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.transaccionconta,transaccioncontaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				transaccioncontaAux=new  TransaccionConta();
				
				transaccioncontaAux.setIsNew(false);
				transaccioncontaAux.setIsChanged(false);
				
				transaccioncontaAux.setIsDeleted(true);
				
				transaccioncontaAux.setId(this.transaccionconta.getId());	
				transaccioncontaAux.setVersionRow(this.transaccionconta.getVersionRow());	
				transaccioncontaAux.setcodigo(this.transaccionconta.getcodigo());	
				transaccioncontaAux.setnombre(this.transaccionconta.getnombre());	
				
				if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.transaccioncontaAux.getId()>=0) {	
						this.transaccioncontasEliminados.add(transaccioncontaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(transaccioncontaAux,transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioncontaAux,transaccioncontas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaLogic.saveTransaccionContas();//WithConnection
						//transaccioncontaLogic.getSetVersionRowTransaccionContas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccioncontaLogic.saveTransaccionContaRelaciones(transaccioncontaAux,this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());//WithConnection
								//transaccioncontaLogic.getSetVersionRowTransaccionContas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							transaccioncontaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(transaccioncontaAux,transaccioncontaLogic.getTransaccionContas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(transaccioncontaAux,transaccioncontas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.getTransaccionContas().addAll(this.transaccioncontasEliminados);
					
					transaccioncontaLogic.saveTransaccionContas();//WithConnection
					//transaccioncontaLogic.getSetVersionRowTransaccionContas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.transaccioncontasEliminados= new ArrayList<TransaccionConta>();		
			}
			
			if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Transaccion Contablilidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.transaccionconta=transaccioncontaAux;
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
      		//this.finishProcessTransaccionConta();
      	}
		
	}	
	
	public void actualizarRelaciones(TransaccionConta transaccioncontaLocal) throws Exception {
		
		if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				transaccioncontaLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
			
			} else {
			
				transaccioncontaLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TransaccionConta transaccioncontaLocal) throws Exception {	
		if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTransaccionContaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transaccioncontaValidator.getInvalidValues(this.transaccionconta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TransaccionConta transaccionconta,List<TransaccionConta> transaccioncontas) throws Exception {
		try	{		
			TransaccionContaConstantesFunciones.actualizarLista(transaccionconta,transaccioncontas,this.transaccioncontaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TransaccionConta transaccionconta,List<TransaccionConta> transaccioncontas) throws Exception {
		try	{			
			TransaccionContaConstantesFunciones.actualizarSelectedLista(transaccionconta,transaccioncontas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TransaccionConta> transaccioncontasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transaccioncontasLocal=this.transaccioncontaLogic.getTransaccionContas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transaccioncontasLocal=this.transaccioncontas;
			}
			//ARCHITECTURE
		
			for(TransaccionConta transaccioncontaLocal:transaccioncontasLocal) {
				if(this.permiteMantenimiento(transaccioncontaLocal) && transaccioncontaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransaccionContaConstantesFunciones.getTransaccionContaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransaccionContaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionConta.jLabelcodigoTransaccionConta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionContaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionConta.jLabelnombreTransaccionConta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionConta.jLabelcodigoTransaccionConta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionConta.jLabelnombreTransaccionConta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TransaccionLocal")) {
			if(this.transaccionconta==null) {
				this.transaccionconta= new TransaccionConta();
			}

			if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTransaccionConta
				this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);

				this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.gettransaccionlocal().setTransaccionConta(this.transaccionconta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTransaccionConta--;	
		
		
		this.transaccioncontaAux=new TransaccionConta();
		
		this.transaccioncontaAux.setId(this.iIdNuevoTransaccionConta);
		this.transaccioncontaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioncontaLogic.getTransaccionContas().add(this.transaccioncontaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transaccioncontas.add(this.transaccioncontaAux);
		}
		//ARCHITECTURE
		
		this.transaccionconta=this.transaccioncontaAux;
		
		if(TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransaccionConta(this.transaccionconta);
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionConta(this.transaccionconta);
		}
				
		//this.setDefaultControlesTransaccionConta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransaccionConta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransaccionConta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionConta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionConta(this.transaccioncontaBean,this.transaccionconta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TransaccionContaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
			classes=TransaccionContaConstantesFunciones.getClassesRelationshipsOfTransaccionConta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.transaccioncontaReturnGeneral=transaccioncontaLogic.procesarEventosTransaccionContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioncontaLogic.getTransaccionContas(),this.transaccionconta,this.transaccioncontaParameterGeneral,this.isEsNuevoTransaccionConta,classes);//this.transaccioncontaLogic.getTransaccionConta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransaccionConta(this.transaccioncontaReturnGeneral,this.transaccioncontaBean,false);
		
		if(this.transaccioncontaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionConta(this.transaccioncontaReturnGeneral.getTransaccionConta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransaccionConta(this.transaccioncontaReturnGeneral.getTransaccionConta());
		}
		
		if(this.transaccioncontaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransaccionConta(this.transaccioncontaReturnGeneral.getTransaccionConta(),classes);//this.transaccioncontaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransaccionConta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransaccionConta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionContaBeanSwingJInternalFrameAdditional.RecargarFormTransaccionConta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransaccionConta(false);
						
			if(transaccioncontaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionConta();
			}
			
			this.actualizarVisualTableDatosTransaccionConta();
			
			this.jTableDatosTransaccionConta.setRowSelectionInterval(this.getIndiceNuevoTransaccionConta(), this.getIndiceNuevoTransaccionConta());
			
			this.seleccionarFilaTablaTransaccionContaActual();
						
			this.actualizarEstadoCeldasBotonesTransaccionConta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransaccionConta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.setEnabled(isHabilitar && this.transaccioncontaConstantesFunciones.activarcodigoTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.setEnabled(isHabilitar && this.transaccioncontaConstantesFunciones.activarnombreTransaccionConta);	
		
	};
	
	public void setDefaultControlesTransaccionConta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransaccionConta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transaccioncontaSessionBean.setConGuardarRelaciones(true);			
			this.transaccioncontaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.transaccioncontaSessionBean.setConGuardarRelaciones(false);			
			this.transaccioncontaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTransaccionConta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
				if(transaccioncontaAux.getId().equals(this.iIdNuevoTransaccionConta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionConta transaccioncontaAux:this.transaccioncontas) {
				if(transaccioncontaAux.getId().equals(this.iIdNuevoTransaccionConta)) {
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
	
	public int getIndiceActualTransaccionConta(TransaccionConta transaccionconta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
				if(transaccioncontaAux.getId().equals(transaccionconta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionConta transaccioncontaAux:this.transaccioncontas) {
				if(transaccioncontaAux.getId().equals(transaccionconta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransaccionConta(TransaccionConta transaccioncontaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
				if(transaccioncontaAux.getTransaccionContaOriginal().getId().equals(transaccioncontaOriginal.getId())) {
					existe=true;
					transaccioncontaOriginal.setId(transaccioncontaAux.getId());
					transaccioncontaOriginal.setVersionRow(transaccioncontaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionConta transaccioncontaAux:this.transaccioncontas) {
				if(transaccioncontaAux.getTransaccionContaOriginal().getId().equals(transaccioncontaOriginal.getId())) {
					existe=true;
					transaccioncontaOriginal.setId(transaccioncontaAux.getId());
					transaccioncontaOriginal.setVersionRow(transaccioncontaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransaccionConta(Boolean esParaCancelar) throws Exception {
		transaccioncontasAux=new ArrayList<TransaccionConta>();
		transaccioncontaAux=new TransaccionConta();
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
					if(transaccioncontaAux.getId()<0) {
						transaccioncontasAux.add(transaccioncontaAux);
					}		
				}
				this.iIdNuevoTransaccionConta=0L;
				this.transaccioncontaLogic.getTransaccionContas().removeAll(transaccioncontasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionConta transaccioncontaAux:this.transaccioncontas) {
					if(transaccioncontaAux.getId()<0) {
						transaccioncontasAux.add(transaccioncontaAux);
					}		
				}
				this.iIdNuevoTransaccionConta=0L;
				this.transaccioncontas.removeAll(transaccioncontasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransaccionConta 
					&& this.transaccioncontaLogic.getTransaccionContas().size()>0
					) {
					transaccioncontaAux=this.transaccioncontaLogic.getTransaccionContas().get(this.transaccioncontaLogic.getTransaccionContas().size() - 1);
				
					if(transaccioncontaAux.getId()<0) {
						this.transaccioncontaLogic.getTransaccionContas().remove(transaccioncontaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransaccionConta && this.transaccioncontas.size()>0) {
					transaccioncontaAux=this.transaccioncontas.get(this.transaccioncontas.size() - 1);
				
					if(transaccioncontaAux.getId()<0) {
						this.transaccioncontas.remove(transaccioncontaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransaccionConta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transaccionconta.getId()<0) {
				this.transaccioncontaLogic.getTransaccionContas().remove(this.transaccionconta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transaccionconta.getId()<0) {
				this.transaccioncontas.remove(this.transaccionconta);
			}
		}			
	}
	
	public void setEstadosInicialesTransaccionConta(List<TransaccionConta> transaccioncontasAux) throws Exception {
		TransaccionContaConstantesFunciones.setEstadosInicialesTransaccionConta(transaccioncontasAux);
	}
	
	public void setEstadosInicialesTransaccionConta(TransaccionConta transaccioncontaAux) throws Exception {
		TransaccionContaConstantesFunciones.setEstadosInicialesTransaccionConta(transaccioncontaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransaccionContaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransaccionConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransaccionContaActual()) {
				if(!this.isEsNuevoTransaccionConta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransaccionConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransaccionConta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransaccionContaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transaccion Contablilidad ?", "MANTENIMIENTO DE Transaccion Contablilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransaccionConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TransaccionConta transaccionconta) throws Exception {
		TransaccionContaConstantesFunciones.seleccionarAsignar(this.transaccionconta,transaccionconta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransaccionConta=this.isPermisoActualizarOriginalTransaccionConta;
			
			
			this.seleccionarAsignar(transaccionconta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionContaConstantesFunciones.quitarEspaciosTransaccionConta(this.transaccionconta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTransaccionConta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transaccioncontaSessionBean.setsFuncionBusquedaRapida(this.transaccioncontaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransaccionConta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransaccionConta(esParaCancelar);				
				this.cancelarNuevoTransaccionConta(esParaCancelar);								
			}
			
			this.transaccionconta=new TransaccionConta();
			
			this.inicializarTransaccionConta();
			
			this.actualizarEstadoCeldasBotonesTransaccionConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransaccionConta() throws Exception {
		try {
			TransaccionContaConstantesFunciones.inicializarTransaccionConta(this.transaccionconta);
			
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
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transaccioncontaLogic.getTransaccionContas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransaccionContas(String sAccionBusqueda,List<TransaccionConta> transaccioncontasParaReportes) throws Exception {
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
					sPathReporteFinal="TransaccionConta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransaccionContaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransaccionContaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TransaccionConta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transaccion Contablilidads");		
		parameters.put("busquedapor", TransaccionContaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TransaccionLocal.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TransaccionContaLogic transaccioncontaLogicAuxiliar=new TransaccionContaLogic();
					transaccioncontaLogicAuxiliar.setDatosCliente(transaccioncontaLogic.getDatosCliente());				
					transaccioncontaLogicAuxiliar.setTransaccionContas(transaccioncontasParaReportes);
					
					transaccioncontaLogicAuxiliar.cargarRelacionesLoteForeignKeyTransaccionContaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					transaccioncontasParaReportes=transaccioncontaLogicAuxiliar.getTransaccionContas();
					
					//transaccioncontaLogic.getNewConnexionToDeep();
					
					//for (TransaccionConta transaccionconta:transaccioncontasParaReportes) {
					//	transaccioncontaLogic.deepLoad(transaccionconta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//transaccioncontaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//transaccioncontaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransaccionLocal = AuxiliarReportes.class.getResourceAsStream("TransaccionLocalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccionlocal", reportFileTransaccionLocal);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransaccionConta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransaccionContaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransaccionContaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransaccionConta=new JRBeanArrayDataSource(TransaccionContaJInternalFrame.TraerTransaccionContaBeans(transaccioncontasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransaccionConta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransaccionContaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransaccionContaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransaccionContaBean.TraerTransaccionContaBeans(transaccioncontasParaReportes).toArray()));
							
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
				this.generarExcelReporteTransaccionContas(sAccionBusqueda,sTipoArchivoReporte,transaccioncontasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransaccionContas(sAccionBusqueda,sTipoArchivoReporte,transaccioncontasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransaccionContaActionPerformed(null);
					//this.generarExcelReporteTransaccionContas(sAccionBusqueda,sTipoArchivoReporte,transaccioncontasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransaccionContas(sAccionBusqueda,sTipoArchivoReporte,transaccioncontasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransaccionContas(sAccionBusqueda,sTipoArchivoReporte,transaccioncontasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransaccionContas(sAccionBusqueda,sTipoArchivoReporte,transaccioncontasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransaccionContas(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionConta> transaccioncontasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccionconta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionContas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionConta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TransaccionConta transaccionconta : transaccioncontasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransaccionContaConstantesFunciones.generarExcelReporteDataTransaccionConta("NORMAL",row,workbook,transaccionconta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransaccionConta(String sTipo,Row row,Workbook workbook) {
		
		TransaccionContaConstantesFunciones.generarExcelReporteHeaderTransaccionConta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransaccionContas(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionConta> transaccioncontasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccionconta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionContas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TransaccionConta transaccionconta : transaccioncontasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransaccionContaConstantesFunciones.getTransaccionContaDescripcion(transaccionconta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionContaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccionconta.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionContaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccionconta.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransaccionContas(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionConta> transaccioncontasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TransaccionConta> transaccioncontasRespaldo=null;
		
		classes=TransaccionContaConstantesFunciones.getClassesRelationshipsOfTransaccionConta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transaccioncontaLogic.setDatosCliente(this.datosCliente);
		this.transaccioncontaLogic.setDatosDeep(this.datosDeep);
		this.transaccioncontaLogic.setIsConDeep(true);
		
		transaccioncontasRespaldo=this.transaccioncontaLogic.getTransaccionContas();
		
		this.transaccioncontaLogic.setTransaccionContas(transaccioncontasParaReportes);	
		this.transaccioncontaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transaccioncontasParaReportes=this.transaccioncontaLogic.getTransaccionContas();
		this.transaccioncontaLogic.setTransaccionContas(transaccioncontasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccionconta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionContas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionConta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TransaccionConta transaccionconta : transaccioncontasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransaccionConta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransaccionContaConstantesFunciones.generarExcelReporteDataTransaccionConta("NORMAL",row,workbook,transaccionconta,cellStyleDataAux);
		
			
			


				//TransaccionLocal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO))) {

				if(transaccionconta.getTransaccionLocals()!=null && transaccionconta.getTransaccionLocals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionLocalConstantesFunciones.generarExcelReporteHeaderTransaccionLocal("RELACIONADO",row,workbook);
				}

				if(transaccionconta.getTransaccionLocals()!=null) {
					i2=0;
					for(TransaccionLocal transaccionlocal : transaccionconta.getTransaccionLocals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionLocalConstantesFunciones.generarExcelReporteDataTransaccionLocal("RELACIONADO",row,workbook,transaccionlocal,cellStyleDataAuxHijo);
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
		cell.setCellValue(TransaccionContaConstantesFunciones.getTransaccionContaDescripcion(transaccionconta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionConta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransaccionConta() throws Exception {		
		this.startProcessTransaccionConta(true);
	}
	
	public void startProcessTransaccionConta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransaccionConta ,this.jPanelParametrosReportesTransaccionConta, this.jScrollPanelDatosTransaccionConta,this.jPanelPaginacionTransaccionConta, this.jScrollPanelDatosEdicionTransaccionConta, this.jPanelAccionesTransaccionConta,this.jPanelAccionesFormularioTransaccionConta,this.jmenuBarTransaccionConta,this.jmenuBarDetalleTransaccionConta,this.jTtoolBarTransaccionConta,this.jTtoolBarDetalleTransaccionConta);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionConta=this.jTabbedPaneBusquedasTransaccionConta; 
		
		final JPanel jPanelParametrosReportesTransaccionConta=this.jPanelParametrosReportesTransaccionConta;
		//final JScrollPane jScrollPanelDatosTransaccionConta=this.jScrollPanelDatosTransaccionConta;
		final JTable jTableDatosTransaccionConta=this.jTableDatosTransaccionConta;		
		final JPanel jPanelPaginacionTransaccionConta=this.jPanelPaginacionTransaccionConta;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionConta=this.jScrollPanelDatosEdicionTransaccionConta;
		final JPanel jPanelAccionesTransaccionConta=this.jPanelAccionesTransaccionConta;
		
		JPanel jPanelCamposAuxiliarTransaccionConta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionConta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			jPanelCamposAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jPanelCamposTransaccionConta;
			jPanelAccionesFormularioAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jPanelAccionesFormularioTransaccionConta;
		}
		
		final JPanel jPanelCamposTransaccionConta=jPanelCamposAuxiliarTransaccionConta;
		final JPanel jPanelAccionesFormularioTransaccionConta=jPanelAccionesFormularioAuxiliarTransaccionConta;
		
		
		final JMenuBar jmenuBarTransaccionConta=this.jmenuBarTransaccionConta;
		final JToolBar jTtoolBarTransaccionConta=this.jTtoolBarTransaccionConta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransaccionConta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionConta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			jmenuBarDetalleAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jmenuBarDetalleTransaccionConta;
			jTtoolBarDetalleAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jTtoolBarDetalleTransaccionConta;
		}
		
		final JMenuBar jmenuBarDetalleTransaccionConta=jmenuBarDetalleAuxiliarTransaccionConta;
		final JToolBar jTtoolBarDetalleTransaccionConta=jTtoolBarDetalleAuxiliarTransaccionConta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionConta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionConta;
			processRunnable.jTableDatos=jTableDatosTransaccionConta;
			processRunnable.jPanelCampos=jPanelCamposTransaccionConta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionConta;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionConta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionConta;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionConta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionConta;
			processRunnable.jTtoolBar=jTtoolBarTransaccionConta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionConta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionConta ,jPanelParametrosReportesTransaccionConta,jTableDatosTransaccionConta, /*jScrollPanelDatosTransaccionConta,*/jPanelCamposTransaccionConta,jPanelPaginacionTransaccionConta, /*jScrollPanelDatosEdicionTransaccionConta,*/ jPanelAccionesTransaccionConta,jPanelAccionesFormularioTransaccionConta,jmenuBarTransaccionConta,jmenuBarDetalleTransaccionConta,jTtoolBarTransaccionConta,jTtoolBarDetalleTransaccionConta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionConta ,jPanelParametrosReportesTransaccionConta, jScrollPanelDatosTransaccionConta,jPanelPaginacionTransaccionConta, jScrollPanelDatosEdicionTransaccionConta, jPanelAccionesTransaccionConta,jPanelAccionesFormularioTransaccionConta,jmenuBarTransaccionConta,jmenuBarDetalleTransaccionConta,jTtoolBarTransaccionConta,jTtoolBarDetalleTransaccionConta);
						
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
	
	public void finishProcessTransaccionConta() {// throws Exception 
		this.finishProcessTransaccionConta(true);
	}
	
	public void finishProcessTransaccionConta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransaccionConta ,this.jPanelParametrosReportesTransaccionConta, this.jScrollPanelDatosTransaccionConta,this.jPanelPaginacionTransaccionConta, this.jScrollPanelDatosEdicionTransaccionConta, this.jPanelAccionesTransaccionConta,this.jPanelAccionesFormularioTransaccionConta,this.jmenuBarTransaccionConta,this.jmenuBarDetalleTransaccionConta,this.jTtoolBarTransaccionConta,this.jTtoolBarDetalleTransaccionConta);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionConta=this.jTabbedPaneBusquedasTransaccionConta; 
		
		final JPanel jPanelParametrosReportesTransaccionConta=this.jPanelParametrosReportesTransaccionConta;
		//final JScrollPane jScrollPanelDatosTransaccionConta=this.jScrollPanelDatosTransaccionConta;
		final JTable jTableDatosTransaccionConta=this.jTableDatosTransaccionConta;		
		final JPanel jPanelPaginacionTransaccionConta=this.jPanelPaginacionTransaccionConta;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionConta=this.jScrollPanelDatosEdicionTransaccionConta;
		final JPanel jPanelAccionesTransaccionConta=this.jPanelAccionesTransaccionConta;
		
		JPanel jPanelCamposAuxiliarTransaccionConta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionConta=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			jPanelCamposAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jPanelCamposTransaccionConta;
			jPanelAccionesFormularioAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jPanelAccionesFormularioTransaccionConta;
		}
		
		final JPanel jPanelCamposTransaccionConta=jPanelCamposAuxiliarTransaccionConta;
		final JPanel jPanelAccionesFormularioTransaccionConta=jPanelAccionesFormularioAuxiliarTransaccionConta;
		
		
		final JMenuBar jmenuBarTransaccionConta=this.jmenuBarTransaccionConta;		
		final JToolBar jTtoolBarTransaccionConta=this.jTtoolBarTransaccionConta;
				
		JMenuBar jmenuBarDetalleAuxiliarTransaccionConta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionConta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			jmenuBarDetalleAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jmenuBarDetalleTransaccionConta;
			jTtoolBarDetalleAuxiliarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jTtoolBarDetalleTransaccionConta;		
		}
		
		final JMenuBar jmenuBarDetalleTransaccionConta=jmenuBarDetalleAuxiliarTransaccionConta;
		final JToolBar jTtoolBarDetalleTransaccionConta=jTtoolBarDetalleAuxiliarTransaccionConta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionConta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionConta;
			processRunnable.jTableDatos=jTableDatosTransaccionConta;
			processRunnable.jPanelCampos=jPanelCamposTransaccionConta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionConta;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionConta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionConta;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionConta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionConta;
			processRunnable.jTtoolBar=jTtoolBarTransaccionConta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionConta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransaccionConta ,jPanelParametrosReportesTransaccionConta, jTableDatosTransaccionConta,/*jScrollPanelDatosTransaccionConta,*/jPanelCamposTransaccionConta,jPanelPaginacionTransaccionConta, /*jScrollPanelDatosEdicionTransaccionConta,*/ jPanelAccionesTransaccionConta,jPanelAccionesFormularioTransaccionConta,jmenuBarTransaccionConta,jmenuBarDetalleTransaccionConta,jTtoolBarTransaccionConta,jTtoolBarDetalleTransaccionConta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransaccionConta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransaccionConta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransaccionConta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransaccionConta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransaccionConta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransaccionConta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransaccionConta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransaccionConta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransaccionConta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transaccioncontaConstantesFunciones.getsFinalQueryTransaccionConta();
		String  finalQueryPaginacionTodos=this.transaccioncontaConstantesFunciones.getsFinalQueryTransaccionConta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransaccionContaConstantesFunciones.getArrayColumnasGlobalesNoTransaccionConta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransaccionContaConstantesFunciones.getArrayColumnasGlobalesTransaccionConta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransaccionContaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transaccioncontasEliminados= new ArrayList<TransaccionConta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransaccionConta();
		
				///*TransaccionContaSessionBean*/this.transaccioncontaSessionBean=new TransaccionContaSessionBean();
			
			if(this.transaccioncontaSessionBean==null) {
				this.transaccioncontaSessionBean=new TransaccionContaSessionBean();
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
					this.iNumeroPaginacion=TransaccionContaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransaccionContaConstantesFunciones.getClassesForeignKeysOfTransaccionConta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transaccionconta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transaccioncontasAux= new ArrayList<TransaccionConta>();
			
				
			transaccioncontaLogic.setDatosCliente(this.datosCliente);
			transaccioncontaLogic.setDatosDeep(this.datosDeep);
			transaccioncontaLogic.setIsConDeep(true);
			
			
			transaccioncontaLogic.getTransaccionContaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					transaccioncontaLogic.getTodosTransaccionContas(finalQueryGlobal,pagination);
					
					//transaccioncontaLogic.getTodosTransaccionContasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(transaccioncontaLogic.getTransaccionContas()==null|| transaccioncontaLogic.getTransaccionContas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccioncontasAux= new ArrayList<TransaccionConta>();
							transaccioncontasAux.addAll(transaccioncontaLogic.getTransaccionContas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontasAux= new ArrayList<TransaccionConta>();
							transaccioncontasAux.addAll(transaccioncontas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccioncontaLogic.getTodosTransaccionContas(finalQueryGlobal+"",this.pagination);												
							
							//transaccioncontaLogic.getTodosTransaccionContasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTransaccionContas("Todos",transaccioncontaLogic.getTransaccionContas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccioncontaLogic.setTransaccionContas(new ArrayList<TransaccionConta>());					
							transaccioncontaLogic.getTransaccionContas().addAll(transaccioncontasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontas=new ArrayList<TransaccionConta>();
							transaccioncontas.addAll(transaccioncontasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTransaccionConta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTransaccionConta=this.idActual;
				
				} else if(this.idTransaccionContaActual!=null && this.idTransaccionContaActual!=0L) {
					idTransaccionConta=idTransaccionContaActual;
				}
				
					
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndicePorId(idTransaccionConta);
				
				this.transaccioncontas=new ArrayList<TransaccionConta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					transaccioncontaLogic.getEntity(idTransaccionConta);
					
					//transaccioncontaLogic.getEntityWithConnection(idTransaccionConta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioncontaLogic.setTransaccionContas(new ArrayList<TransaccionConta>());
					transaccioncontaLogic.getTransaccionContas().add(transaccioncontaLogic.getTransaccionConta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncontas=new ArrayList<TransaccionConta>();
					this.transaccioncontas.add(transaccionconta);
				}
				
				if(transaccioncontaLogic.getTransaccionConta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioncontaLogic.getTransaccionContasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioncontaLogic.getTransaccionContas()==null||transaccioncontaLogic.getTransaccionContas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioncontas==null|| transaccioncontas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontasAux=new ArrayList<TransaccionConta>();
						transaccioncontasAux.addAll(transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontasAux=new ArrayList<TransaccionConta>();
							transaccioncontasAux.addAll(transaccioncontas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioncontaLogic.getTransaccionContasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionContas("BusquedaPorCodigo",transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionContas("BusquedaPorCodigo",transaccioncontas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaLogic.setTransaccionContas(new ArrayList<TransaccionConta>());
						transaccioncontaLogic.getTransaccionContas().addAll(transaccioncontasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontas=new ArrayList<TransaccionConta>();
							transaccioncontas.addAll(transaccioncontasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioncontaLogic.getTransaccionContasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioncontaLogic.getTransaccionContas()==null||transaccioncontaLogic.getTransaccionContas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioncontas==null|| transaccioncontas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontasAux=new ArrayList<TransaccionConta>();
						transaccioncontasAux.addAll(transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontasAux=new ArrayList<TransaccionConta>();
							transaccioncontasAux.addAll(transaccioncontas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioncontaLogic.getTransaccionContasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionContas("BusquedaPorId",transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionContas("BusquedaPorId",transaccioncontas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaLogic.setTransaccionContas(new ArrayList<TransaccionConta>());
						transaccioncontaLogic.getTransaccionContas().addAll(transaccioncontasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontas=new ArrayList<TransaccionConta>();
							transaccioncontas.addAll(transaccioncontasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioncontaLogic.getTransaccionContasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioncontaLogic.getTransaccionContas()==null||transaccioncontaLogic.getTransaccionContas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioncontas==null|| transaccioncontas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontasAux=new ArrayList<TransaccionConta>();
						transaccioncontasAux.addAll(transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontasAux=new ArrayList<TransaccionConta>();
							transaccioncontasAux.addAll(transaccioncontas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioncontaLogic.getTransaccionContasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionContaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionContas("BusquedaPorNombre",transaccioncontaLogic.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionContas("BusquedaPorNombre",transaccioncontas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaLogic.setTransaccionContas(new ArrayList<TransaccionConta>());
						transaccioncontaLogic.getTransaccionContas().addAll(transaccioncontasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontas=new ArrayList<TransaccionConta>();
							transaccioncontas.addAll(transaccioncontasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransaccionConta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransaccionConta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioncontaLogic.getTransaccionContas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioncontas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioncontaLogic.getTransaccionContas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioncontas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TransaccionConta transaccionconta) {
		Boolean permite=true;
		
		if(this.transaccionconta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransaccionContaConstantesFunciones.getOrderByListaTransaccionConta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransaccionContaConstantesFunciones.getOrderByListaTransaccionConta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionConta transaccionconta:transaccioncontaLogic.getTransaccionContas()) {
				if(transaccionconta.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioncontaTotales=transaccionconta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionConta transaccionconta:this.transaccioncontas) {
				if(transaccionconta.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioncontaTotales=transaccionconta;
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
			this.transaccioncontaAux=new TransaccionConta();
			this.transaccioncontaAux.setsType(Constantes2.S_TOTALES);
			this.transaccioncontaAux.setIsNew(false);
			this.transaccioncontaAux.setIsChanged(false);
			this.transaccioncontaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TransaccionContaConstantesFunciones.TotalizarValoresFilaTransaccionConta(this.transaccioncontaLogic.getTransaccionContas(),this.transaccioncontaAux);
				
				this.transaccioncontaLogic.getTransaccionContas().add(this.transaccioncontaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransaccionContaConstantesFunciones.TotalizarValoresFilaTransaccionConta(this.transaccioncontas,this.transaccioncontaAux);
				
				this.transaccioncontas.add(this.transaccioncontaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transaccioncontaTotales=new TransaccionConta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioncontaLogic.getTransaccionContas().remove(transaccioncontaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioncontas.remove(transaccioncontaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transaccioncontaTotales=new TransaccionConta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionConta transaccionconta:transaccioncontaLogic.getTransaccionContas()) {
				if(transaccionconta.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioncontaTotales=transaccionconta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionContaConstantesFunciones.TotalizarValoresFilaTransaccionConta(this.transaccioncontaLogic.getTransaccionContas(),transaccioncontaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionConta transaccionconta:this.transaccioncontas) {
				if(transaccionconta.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioncontaTotales=transaccionconta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionContaConstantesFunciones.TotalizarValoresFilaTransaccionConta(this.transaccioncontas,transaccioncontaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransaccionContasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionContasBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionContasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionContaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTransaccionContasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioncontaLogic.getTransaccionContasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionContasBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioncontaLogic.getTransaccionContasBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionContasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioncontaLogic.getTransaccionContasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionContaPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioncontaLogic.getTransaccionContaPorCodigo(codigo);
				
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
	
	public void inicializarPermisosTransaccionConta() {
		this.isPermisoTodoTransaccionConta=false;
		this.isPermisoNuevoTransaccionConta=false;
		this.isPermisoActualizarTransaccionConta=false;
		this.isPermisoActualizarOriginalTransaccionConta=false;
		this.isPermisoEliminarTransaccionConta=false;
		this.isPermisoGuardarCambiosTransaccionConta=false;
		this.isPermisoConsultaTransaccionConta=false;
		this.isPermisoBusquedaTransaccionConta=false;
		this.isPermisoReporteTransaccionConta=false;		
		this.isPermisoOrdenTransaccionConta=false;		
		this.isPermisoPaginacionMedioTransaccionConta=false;		
		this.isPermisoPaginacionAltoTransaccionConta=false;
		this.isPermisoPaginacionTodoTransaccionConta=false;
		this.isPermisoCopiarTransaccionConta=false;		
		this.isPermisoVerFormTransaccionConta=false;		
		this.isPermisoDuplicarTransaccionConta=false;		
		this.isPermisoOrdenTransaccionConta=false;		
	}
	
	public void setPermisosUsuarioTransaccionConta(Boolean isPermiso) {
		this.isPermisoTodoTransaccionConta=isPermiso;
		this.isPermisoNuevoTransaccionConta=isPermiso;
		this.isPermisoActualizarTransaccionConta=isPermiso;
		this.isPermisoActualizarOriginalTransaccionConta=isPermiso;
		this.isPermisoEliminarTransaccionConta=isPermiso;
		this.isPermisoGuardarCambiosTransaccionConta=isPermiso;
		this.isPermisoConsultaTransaccionConta=isPermiso;
		this.isPermisoBusquedaTransaccionConta=isPermiso;
		this.isPermisoReporteTransaccionConta=isPermiso;
		this.isPermisoOrdenTransaccionConta=isPermiso;		
		this.isPermisoPaginacionMedioTransaccionConta=isPermiso;		
		this.isPermisoPaginacionAltoTransaccionConta=isPermiso;		
		this.isPermisoPaginacionTodoTransaccionConta=isPermiso;		
		this.isPermisoCopiarTransaccionConta=isPermiso;		
		this.isPermisoVerFormTransaccionConta=isPermiso;		
		this.isPermisoDuplicarTransaccionConta=isPermiso;
		this.isPermisoOrdenTransaccionConta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransaccionConta(Boolean isPermiso) {
		//this.isPermisoTodoTransaccionConta=isPermiso;
		this.isPermisoNuevoTransaccionConta=isPermiso;
		this.isPermisoActualizarTransaccionConta=isPermiso;
		this.isPermisoActualizarOriginalTransaccionConta=isPermiso;
		this.isPermisoEliminarTransaccionConta=isPermiso;
		this.isPermisoGuardarCambiosTransaccionConta=isPermiso;
		//this.isPermisoConsultaTransaccionConta=isPermiso;
		//this.isPermisoBusquedaTransaccionConta=isPermiso;
		//this.isPermisoReporteTransaccionConta=isPermiso;
		//this.isPermisoOrdenTransaccionConta=isPermiso;		
		//this.isPermisoPaginacionMedioTransaccionConta=isPermiso;		
		//this.isPermisoPaginacionAltoTransaccionConta=isPermiso;		
		//this.isPermisoPaginacionTodoTransaccionConta=isPermiso;		
		//this.isPermisoCopiarTransaccionConta=isPermiso;		
		//this.isPermisoDuplicarTransaccionConta=isPermiso;
		//this.isPermisoOrdenTransaccionConta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionContaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		
		if(TransaccionContaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransaccionLocal=false;
		this.isTienePermisosTransaccionLocal=this.verificarGetPermisosUsuarioOpcionTransaccionContaClaseRelacionada(this.opcionsRelacionadas,TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransaccionConta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionContaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransaccionLocal=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTransaccionContaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransaccionContaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransaccionContaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransaccionLocal && this.jInternalFrameDetalleFormTransaccionConta!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.remove(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTransaccionConta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransaccionContaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransaccionContaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransaccionConta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransaccionConta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransaccionConta=this.isPermisoActualizarTransaccionConta;
			this.isPermisoEliminarTransaccionConta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransaccionConta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransaccionConta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransaccionConta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransaccionConta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransaccionConta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionConta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransaccionConta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransaccionConta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransaccionConta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransaccionConta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransaccionConta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransaccionConta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionConta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransaccionConta.setToolTipText(this.jTableDatosTransaccionConta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransaccionConta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransaccionConta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransaccionContaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransaccionContaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransaccionConta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransaccionLocal && this.transaccioncontaConstantesFunciones.mostrarTransaccionLocalTransaccionConta && !TransaccionContaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion Local");
			reporte.setsDescripcion("Transaccion Local");
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
	
		
	public void inicializarCombosForeignKeyTransaccionContaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransaccionContaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransaccionContaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTransaccionContaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTransaccionContaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTransaccionConta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTransaccionConta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionConta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransaccionConta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionConta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransaccionConta(TransaccionConta transaccionconta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransaccionConta(TransaccionConta transaccionconta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransaccionConta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionConta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransaccionConta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransaccionConta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransaccionConta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransaccionConta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransaccionConta(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransaccionConta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TransaccionContaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransaccionContaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransaccionContaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transaccioncontaSessionBean=new TransaccionContaSessionBean(); 
		this.transaccioncontaConstantesFunciones=new TransaccionContaConstantesFunciones(); 
		this.transaccioncontaBean=new TransaccionConta();//(this.transaccioncontaConstantesFunciones); 		
		this.transaccioncontaReturnGeneral=new TransaccionContaParameterReturnGeneral(); 
		
		this.transaccioncontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioncontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransaccionContaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransaccionContaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransaccionContaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransaccionConta(true);
			
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
			
			this.transaccioncontaConstantesFunciones=new TransaccionContaConstantesFunciones(); 
			this.transaccioncontaBean=new TransaccionConta();//this.transaccioncontaConstantesFunciones); 			
			this.transaccioncontaReturnGeneral=new TransaccionContaParameterReturnGeneral(); 
		
			TransaccionContaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transaccion Contablilidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.transaccionconta=new TransaccionConta();
			this.transaccioncontas = new ArrayList<TransaccionConta>();
			this.transaccioncontasAux = new ArrayList<TransaccionConta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic=new TransaccionContaLogic();
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			//this.transaccioncontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transaccioncontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransaccionConta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionConta);	
					}
					
					if(this.jInternalFrameImportacionTransaccionConta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionConta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransaccionConta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransaccionConta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionConta);
				this.jInternalFrameDetalleFormTransaccionConta.setVisible(false);
				this.jInternalFrameDetalleFormTransaccionConta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionConta);
					this.jInternalFrameReporteDinamicoTransaccionConta.setVisible(false);
					this.jInternalFrameReporteDinamicoTransaccionConta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransaccionConta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionConta);
					this.jInternalFrameImportacionTransaccionConta.setVisible(false);
					this.jInternalFrameImportacionTransaccionConta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransaccionConta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionConta);
					this.jInternalFrameOrderByTransaccionConta.setVisible(false);
					this.jInternalFrameOrderByTransaccionConta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransaccionContaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransaccionContaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transaccioncontaReturnGeneral=new TransaccionContaParameterReturnGeneral();
			
			this.transaccioncontaParameterGeneral=new TransaccionContaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transaccioncontaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransaccionContaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionContaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioncontaSessionBean.getEsGuardarRelacionado(),this.transaccioncontaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionContaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioncontaSessionBean.getEsGuardarRelacionado(),this.transaccioncontaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransaccionConta=false;
			this.isVisibilidadCeldaDuplicarTransaccionConta=true;
			this.isVisibilidadCeldaCopiarTransaccionConta=true;
			this.isVisibilidadCeldaVerFormTransaccionConta=true;
			this.isVisibilidadCeldaOrdenTransaccionConta=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
			this.isVisibilidadCeldaModificarTransaccionConta=false;
			this.isVisibilidadCeldaActualizarTransaccionConta=false;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
			this.isVisibilidadCeldaCancelarTransaccionConta=false;
			this.isVisibilidadCeldaGuardarTransaccionConta=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransaccionConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransaccionConta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransaccionConta(false);
			
			this.setPermisosUsuarioTransaccionConta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado() 
				|| (this.transaccioncontaSessionBean.getEsGuardarRelacionado() && this.transaccioncontaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransaccionContaClasesRelacionadas();
			}
			
			if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransaccionContaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransaccionConta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransaccionConta();
			}
			
			if(!this.isPermisoBusquedaTransaccionConta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTransaccionConta,this.isPermisoPaginacionMedioTransaccionConta,this.isPermisoPaginacionTodoTransaccionConta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransaccionContaConstantesFunciones.getTiposSeleccionarTransaccionConta());
				
				this.tiposColumnasSelect=TransaccionContaConstantesFunciones.getTiposSeleccionarTransaccionConta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTransaccionConta();				
				//this.tiposRelacionesSelect=TransaccionContaConstantesFunciones.getTiposRelacionesTransaccionConta(true);
				
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
			//if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransaccionConta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTransaccionConta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTransaccionConta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionConta() ;
			
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
			
			
			this.transaccionlocalLogic=new TransaccionLocalLogic(); 
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
				transaccioncontaImplementable= (TransaccionContaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionContaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transaccioncontaImplementableHome= (TransaccionContaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionContaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transaccioncontas= new ArrayList<TransaccionConta>();
			this.transaccioncontasEliminados= new ArrayList<TransaccionConta>();
						
			this.isEsNuevoTransaccionConta=false;
			this.esParaAccionDesdeFormularioTransaccionConta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransaccionConta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransaccionConta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransaccionContaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransaccionContaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransaccionConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransaccionConta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransaccionConta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransaccionConta();
			}
			
			TransaccionContaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransaccionConta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransaccionConta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransaccionConta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransaccionConta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TransaccionConta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransaccionConta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransaccionConta")) {
				iIndex=this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();	
				
				

				if(sTitle.equals("Transaccion Locales")) {
					if(!TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTransaccionConta();

						this.cargarParteTabPanelRelacionadaTransaccionLocal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransaccionConta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaTransaccionLocal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTransaccionConta.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(false,true,iIndex);
		this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccionLocal();

		//this.jTabbedPaneRelacionesTransaccionConta.updateUI();
		//this.jTabbedPaneRelacionesTransaccionConta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTransaccionConta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TransaccionLocal")) {
				int row=this.jTableDatosTransaccionConta.getSelectedRow();
				jButtonTransaccionLocalActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transaccion Local")) {

					if(this.isTienePermisosTransaccionLocal && this.transaccioncontaConstantesFunciones.mostrarTransaccionLocalTransaccionConta && !TransaccionContaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transaccion Locales"+"("+TransaccionLocalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transaccion Locales");

						if(transaccioncontaConstantesFunciones.resaltarTransaccionLocalTransaccionConta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(transaccioncontaConstantesFunciones.resaltarTransaccionLocalTransaccionConta);
						}

						jmenuItem.setEnabled(this.transaccioncontaConstantesFunciones.activarTransaccionLocalTransaccionConta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TransaccionLocal"));

						

						this.jInternalFrameDetalleFormTransaccionConta.jmenuDetalleTransaccionConta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTransaccionConta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransaccionConta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransaccionConta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransaccionContaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransaccionConta();
		
		this.cargarCombosFrameForeignKeyTransaccionConta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransaccionConta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransaccionConta();
		}
	}
	
	
	
	public void jButtonNuevoTransaccionContaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
			
			if(jTableDatosTransaccionConta.getRowCount()>=1) {
				jTableDatosTransaccionConta.removeRowSelectionInterval(0, jTableDatosTransaccionConta.getRowCount()-1);						
			}
			
			this.isEsNuevoTransaccionConta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransaccionConta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransaccionConta(true);			
			//this.transaccionconta=new TransaccionConta();
			//this.transaccionconta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionConta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionConta() ;
			
			if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionConta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transaccionconta);	
			this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);				
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
			if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TransaccionConta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransaccionContaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransaccionConta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransaccionConta.getSelectedRows().length;			
			}
			
			transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransaccionConta--;			
				//TransaccionConta transaccioncontaAux= new TransaccionConta();			
				//transaccioncontaAux.setId(this.iIdNuevoTransaccionConta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TransaccionConta transaccioncontaOrigen=new TransaccionConta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TransaccionConta transaccioncontaOrigen : transaccioncontasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transaccioncontaOrigen =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioncontaOrigen =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransaccionConta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transaccionconta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransaccionConta(transaccioncontaOrigen,this.transaccionconta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioncontaLogic.getTransaccionContas().add(this.transaccioncontaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioncontas.add(this.transaccioncontaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransaccionConta(false);
				
				this.jTableDatosTransaccionConta.setRowSelectionInterval(this.getIndiceNuevoTransaccionConta(), this.getIndiceNuevoTransaccionConta());
				
				int iLastRow =  this.jTableDatosTransaccionConta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionConta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionConta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionConta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();									
		
			TransaccionConta transaccioncontaOrigen=new TransaccionConta();
			TransaccionConta transaccioncontaDestino=new TransaccionConta();
				
			transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransaccionConta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transaccioncontasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransaccionConta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaOrigen =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioncontaOrigen =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioncontaDestino =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioncontaDestino =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transaccioncontaOrigen =transaccioncontasSeleccionados.get(0);
				transaccioncontaDestino =transaccioncontasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransaccionConta(transaccioncontaOrigen,transaccioncontaDestino,true,false);
				
				transaccioncontaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccioncontaDestino,transaccioncontaLogic.getTransaccionContas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioncontaDestino,transaccioncontas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransaccionConta(false);
				
				//this.jTableDatosTransaccionConta.setRowSelectionInterval(this.getIndiceNuevoTransaccionConta(), this.getIndiceNuevoTransaccionConta());
				
				int iLastRow =  this.jTableDatosTransaccionConta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionConta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionConta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionConta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransaccionConta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransaccionConta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransaccionConta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransaccionConta.setVisible(!isVisible);
			this.jPanelPaginacionTransaccionConta.setVisible(!isVisible);
			this.jPanelAccionesTransaccionConta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransaccionConta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransaccionConta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransaccionConta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransaccionConta();
			
			this.abrirFrameOrderByTransaccionConta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransaccionConta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransaccionConta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionConta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransaccionConta.isMaximum()) {
					this.jInternalFrameDetalleFormTransaccionConta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransaccionConta.setSize(this.jInternalFrameDetalleFormTransaccionConta.iWidthFormulario,this.jInternalFrameDetalleFormTransaccionConta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransaccionConta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransaccionConta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransaccionConta.isMaximum()) {
						this.jInternalFrameDetalleFormTransaccionConta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransaccionConta.jContentPaneDetalleTransaccionConta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionConta.jContentPaneDetalleTransaccionConta.getWidth(),TransaccionContaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionConta.jContentPaneDetalleTransaccionConta.getWidth(),TransaccionContaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransaccionConta.jContentPaneDetalleTransaccionConta.getWidth(),TransaccionContaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccionLocal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransaccionConta.setVisible(true);
	        this.jInternalFrameDetalleFormTransaccionConta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransaccionConta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransaccionConta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransaccionConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionConta,false,this);
				} else {
					this.jInternalFrameOrderByTransaccionConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionConta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionConta);
				this.jInternalFrameOrderByTransaccionConta.setVisible(false);
				this.jInternalFrameOrderByTransaccionConta.setSelected(false);
				
				this.jInternalFrameOrderByTransaccionConta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionConta"));
				
				this.inicializarActualizarBindingTablaOrderByTransaccionConta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransaccionConta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransaccionConta==null) {
				
				this.jInternalFrameImportacionTransaccionConta=new ImportacionJInternalFrame(TransaccionContaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionConta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionConta);
				this.jInternalFrameImportacionTransaccionConta.setVisible(false);
				this.jInternalFrameImportacionTransaccionConta.setSelected(false);


				this.jInternalFrameImportacionTransaccionConta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionConta"));
				this.jInternalFrameImportacionTransaccionConta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionConta"));
				this.jInternalFrameImportacionTransaccionConta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionConta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransaccionConta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransaccionConta==null) {
				this.jInternalFrameReporteDinamicoTransaccionConta=new ReporteDinamicoJInternalFrame(TransaccionContaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionConta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionConta);
				this.jInternalFrameReporteDinamicoTransaccionConta.setVisible(false);
				this.jInternalFrameReporteDinamicoTransaccionConta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransaccionConta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionConta"));
				this.jInternalFrameReporteDinamicoTransaccionConta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionConta"));
				this.jInternalFrameReporteDinamicoTransaccionConta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionConta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionConta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaTransaccionLocal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTransaccionConta.jContentPaneDetalleTransaccionConta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTransaccionConta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionConta);
			
	       	this.jInternalFrameDetalleFormTransaccionConta.setVisible(false);
	        this.jInternalFrameDetalleFormTransaccionConta.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransaccionConta.dispose();
			//this.jInternalFrameDetalleFormTransaccionConta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransaccionConta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransaccionConta.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransaccionConta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransaccionConta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransaccionConta.setVisible(true);
	        this.jInternalFrameImportacionTransaccionConta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransaccionConta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransaccionConta.setVisible(true);
	        this.jInternalFrameOrderByTransaccionConta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransaccionConta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransaccionConta.setVisible(false);
	        this.jInternalFrameOrderByTransaccionConta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransaccionConta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransaccionConta.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransaccionConta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransaccionConta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransaccionConta.setVisible(false);
	        this.jInternalFrameImportacionTransaccionConta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransaccionConta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransaccionConta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransaccionConta(true);
			//this.isEsNuevoTransaccionConta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransaccionConta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionConta(false) ;
			
			if(transaccioncontaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionConta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionConta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransaccionContaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransaccionConta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransaccionConta(true);
			//this.isEsNuevoTransaccionConta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transaccionconta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransaccionConta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransaccionConta(false) ;
			
			if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionConta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionConta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransaccionConta(false);
			
			//if(!this.isEsNuevoTransaccionConta) {								
				int intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
				
			}
			
			if(this.permiteMantenimiento(this.transaccionconta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransaccionConta=true;
					this.inicializarActualizarBindingTablaTransaccionConta(false);
					this.isEsNuevoTransaccionConta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransaccionConta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransaccionConta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionConta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionConta(false);
				
				this.habilitarDeshabilitarControlesTransaccionConta(false);
			
												
				
				if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransaccionConta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransaccionContaActionPerformed(evt,transaccioncontaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransaccionConta(this.transaccionconta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransaccionConta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transaccioncontaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transaccionconta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransaccionContaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				this.transaccionconta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				this.transaccionconta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transaccionconta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransaccionContaModel) this.jTableDatosTransaccionConta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransaccionConta=true;
				this.inicializarActualizarBindingTablaTransaccionConta(false);
				this.isEsNuevoTransaccionConta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionConta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionConta(false);
				
				this.habilitarDeshabilitarControlesTransaccionConta(false);
				
				
				
				if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransaccionConta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransaccionContaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransaccionConta.getRowCount()>=1) {
				jTableDatosTransaccionConta.removeRowSelectionInterval(0, jTableDatosTransaccionConta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransaccionConta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransaccionConta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionConta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionConta(false) ;
			
			this.isEsNuevoTransaccionConta=false;
			
			if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransaccionConta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransaccionConta(false);
				
				//SI ES MANUAL
				if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransaccionConta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransaccionConta--;			
			//TransaccionConta transaccioncontaAux= new TransaccionConta();			
			//transaccioncontaAux.setId(this.iIdNuevoTransaccionConta);
			
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransaccionConta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
			
			this.transaccionconta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transaccioncontaLogic.getTransaccionContas().add(this.transaccioncontaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transaccioncontas.add(this.transaccioncontaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransaccionConta(false);
			
			this.jTableDatosTransaccionConta.setRowSelectionInterval(this.getIndiceNuevoTransaccionConta(), this.getIndiceNuevoTransaccionConta());
			
			int iLastRow =  this.jTableDatosTransaccionConta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransaccionConta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransaccionConta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransaccionConta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransaccionConta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionConta(false);
			
			//SI ES MANUAL
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionConta();
			}
			
			//this.abrirFrameTreeTransaccionConta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Transaccion ContablilidadS ?", "MANTENIMIENTO DE Transaccion Contablilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTransaccionConta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTransaccionConta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.transaccioncontaReturnGeneral=transaccioncontaLogic.procesarImportacionTransaccionContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.transaccioncontaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTransaccionContaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransaccionConta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransaccionConta.setFileImportacion(this.jInternalFrameImportacionTransaccionConta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransaccionConta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransaccionConta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransaccionConta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransaccionConta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		

		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransaccionContaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransaccionContaBaseDesign.jrxml";
			
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
			
			this.generarReporteTransaccionContas("Todos",transaccioncontasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionContaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionContaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTransaccionConta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransaccionContaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TransaccionContaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransaccionContaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TransaccionContaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionContaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TransaccionContaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTransaccionContaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccionconta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TransaccionContas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransaccionContaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TransaccionConta transaccionconta:transaccioncontasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccionconta.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionContaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TransaccionConta transaccionconta:transaccioncontasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccionconta.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTransaccionConta(row);				
			//	iRow++;
			//}				
			
			//for(TransaccionConta transaccioncontaAux:transaccioncontasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransaccionConta(transaccioncontaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionConta(false);
			
			//SI ES MANUAL
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionConta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionConta(false);
			
			//SI ES MANUAL
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionConta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransaccionContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionConta(false);
			
			//SI ES MANUAL
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionConta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransaccionConta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransaccionConta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransaccionConta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransaccionConta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransaccionConta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransaccionConta.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransaccionConta.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransaccionConta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransaccionConta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransaccionConta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransaccionConta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransaccionConta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransaccionConta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransaccionConta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionConta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransaccionConta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransaccionConta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransaccionConta();
		
		this.inicializarActualizarBindingBotonesManualTransaccionConta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionConta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionConta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionConta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionConta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransaccionConta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransaccionConta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransaccionConta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransaccionConta.jCheckBoxPostAccionNuevoTransaccionConta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransaccionConta.jCheckBoxPostAccionSinCerrarTransaccionConta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransaccionConta.jCheckBoxPostAccionSinMensajeTransaccionConta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransaccionConta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransaccionConta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransaccionConta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
				this.jInternalFrameDetalleFormTransaccionConta.jCheckBoxPostAccionNuevoTransaccionConta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransaccionConta.jCheckBoxPostAccionSinCerrarTransaccionConta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransaccionConta.jCheckBoxPostAccionSinMensajeTransaccionConta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransaccionConta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransaccionConta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransaccionConta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransaccionConta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransaccionConta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransaccionConta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransaccionConta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransaccionConta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransaccionConta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransaccionConta(Boolean esInicializar) throws Exception {
		try	{	
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionConta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionConta() throws Exception {
		try	{
			if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionConta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionConta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionConta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransaccionConta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransaccionConta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransaccionConta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransaccionConta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransaccionConta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransaccionConta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransaccionConta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransaccionConta.addItem(reporte);
			}
			
			
			if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransaccionConta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransaccionConta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransaccionConta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransaccionConta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransaccionConta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransaccionConta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransaccionConta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransaccionConta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransaccionConta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionConta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionConta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
				this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
				this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionConta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionConta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransaccionConta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionConta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionConta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransaccionConta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTransaccionConta.getText();
		//this.idBusquedaPorId=Long.parseLong(this.jTextFieldidTransaccionContaBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTransaccionConta.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransaccionConta(Boolean esInicializar) throws Exception {				
		if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionConta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransaccionConta() throws Exception {
		this.inicializarActualizarBindingTablaTransaccionConta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransaccionConta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransaccionContaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransaccionContaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransaccionContaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionContaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransaccionContaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransaccionContaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransaccionConta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transaccioncontaLogic.getTransaccionContas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transaccioncontas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransaccionConta.setModel(new TransaccionContaModel(this.transaccioncontaLogic.getTransaccionContas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransaccionConta.setModel(new TransaccionContaModel(this.transaccioncontas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransaccionConta!=null && this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransaccionConta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransaccionConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionConta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransaccionContaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO,transaccioncontaConstantesFunciones.resaltarSeleccionarTransaccionConta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO,transaccioncontaConstantesFunciones.resaltarSeleccionarTransaccionConta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransaccionConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionConta,TransaccionContaConstantesFunciones.LABEL_ID));

		if(this.transaccioncontaConstantesFunciones.mostraridTransaccionConta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionContaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioncontaConstantesFunciones.resaltaridTransaccionConta,this.transaccioncontaConstantesFunciones.activaridTransaccionConta,this,true,"idTransaccionConta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioncontaConstantesFunciones.resaltaridTransaccionConta,this.transaccioncontaConstantesFunciones.activaridTransaccionConta,this,true,"idTransaccionConta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionConta,TransaccionContaConstantesFunciones.LABEL_CODIGO));

		if(this.transaccioncontaConstantesFunciones.mostrarcodigoTransaccionConta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionContaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccioncontaConstantesFunciones.resaltarcodigoTransaccionConta,this.transaccioncontaConstantesFunciones.activarcodigoTransaccionConta,this,true,"codigoTransaccionConta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioncontaConstantesFunciones.resaltarcodigoTransaccionConta,this.transaccioncontaConstantesFunciones.activarcodigoTransaccionConta,this,true,"codigoTransaccionConta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionContaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionConta,TransaccionContaConstantesFunciones.LABEL_NOMBRE));

		if(this.transaccioncontaConstantesFunciones.mostrarnombreTransaccionConta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionContaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccioncontaConstantesFunciones.resaltarnombreTransaccionConta,this.transaccioncontaConstantesFunciones.activarnombreTransaccionConta,this,true,"nombreTransaccionConta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioncontaConstantesFunciones.resaltarnombreTransaccionConta,this.transaccioncontaConstantesFunciones.activarnombreTransaccionConta,this,true,"nombreTransaccionConta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionContaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransaccionLocal && this.transaccioncontaConstantesFunciones.mostrarTransaccionLocalTransaccionConta && !TransaccionContaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transaccion Locales");
				tableColumn.setHeaderValue("Transaccion Locales");
				tableColumn.setCellRenderer(new TransaccionLocalTableCell(transaccioncontaConstantesFunciones.resaltarTransaccionLocalTransaccionConta,this,this.transaccioncontaConstantesFunciones.activarTransaccionLocalTransaccionConta));
				tableColumn.setCellEditor(new TransaccionLocalTableCell(transaccioncontaConstantesFunciones.resaltarTransaccionLocalTransaccionConta,this,this.transaccioncontaConstantesFunciones.activarTransaccionLocalTransaccionConta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTransaccionConta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioncontaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioncontaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionConta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioncontaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioncontaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionConta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transaccioncontaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transaccioncontaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransaccionConta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTransaccionConta.addColumn(tableColumn);
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
			
			this.jTableDatosTransaccionConta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.transaccioncontaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransaccionConta.moveColumn(this.jTableDatosTransaccionConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransaccionConta.moveColumn(this.jTableDatosTransaccionConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.transaccioncontaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTransaccionConta.moveColumn(this.jTableDatosTransaccionConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransaccionConta.moveColumn(this.jTableDatosTransaccionConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransaccionConta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransaccionConta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransaccionConta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransaccionConta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransaccionConta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransaccionConta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransaccionConta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransaccionConta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=transaccioncontaLogic.getTransaccionContas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transaccioncontas.size()-1;
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
		//this.jTableDatosTransaccionConta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransaccionConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransaccionConta();
			
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
				
				//this.isEsNuevoTransaccionConta=false;
					
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
				if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransaccionConta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionConta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionConta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transaccionconta.getsType().equals("DUPLICADO")
				   || this.transaccionconta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransaccionConta=true;
				
				} else {
					this.isEsNuevoTransaccionConta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
					if(this.transaccionconta.getId()>=0 && !this.transaccionconta.getIsNew()) {						
						this.isEsNuevoTransaccionConta=false;
						
					} else {
						this.isEsNuevoTransaccionConta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransaccionConta(esRelaciones);						
				
				this.seleccionarTransaccionConta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transaccionconta.getId()<0) {
					this.isEsNuevoTransaccionConta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransaccionConta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransaccionConta(evt,rowIndex);
				}	
				
				if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TransaccionConta: " + this.dDif); 
					}
				}								
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransaccionConta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transaccionconta)) {
					if(this.transaccionconta.getId()>0) {
						this.transaccionconta.setIsDeleted(true);
						
						this.transaccioncontasEliminados.add(this.transaccionconta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioncontaLogic.getTransaccionContas().remove(this.transaccionconta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioncontas.remove(this.transaccionconta);				
					}
					
					
					((TransaccionContaModel) this.jTableDatosTransaccionConta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionConta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransaccionConta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransaccionConta) {
			
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionConta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionConta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransaccionConta(this.transaccionconta);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransaccionConta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransaccionConta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionConta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionConta(TransaccionConta transaccionconta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransaccionConta(transaccionconta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionConta(TransaccionConta transaccionconta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransaccionConta(transaccionconta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransaccionConta(transaccionconta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransaccionConta(transaccionconta);
	}
	
	public void setVariablesObjetoActualToFormularioTransaccionConta(TransaccionConta transaccionconta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.setText(transaccionconta.getId().toString());
			this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.setText(transaccionconta.getcodigo());
			this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.setText(transaccionconta.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TransaccionConta transaccioncontaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transaccioncontaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TransaccionConta transaccioncontaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transaccioncontaLocal=this.transaccionconta;
			} else {
				transaccioncontaLocal=this.transaccioncontaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transaccioncontaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransaccionConta(transaccioncontaLocal,true);
					
					if(transaccioncontaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transaccioncontaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transaccioncontaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransaccionConta(TransaccionConta transaccionconta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionConta(transaccionconta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(transaccionconta);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionConta(TransaccionConta transaccionconta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionConta(transaccionconta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionConta(TransaccionConta transaccionconta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.getText()==null || this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.getText()=="" || this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.getText()=="Id") {
				this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.setText("0");
			}

			if(conColumnasBase) {transaccionconta.setId(Long.parseLong(this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionContaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionConta.jLabelIdTransaccionConta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccionconta.setcodigo(this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionContaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionConta.jLabelcodigoTransaccionConta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccionconta.setnombre(this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionContaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionConta.jLabelnombreTransaccionConta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionConta(TransaccionConta transaccioncontaBean,TransaccionConta transaccionconta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransaccionConta(TransaccionConta transaccioncontaOrigen,TransaccionConta transaccionconta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioncontaOrigen.getId()!=null && !transaccioncontaOrigen.getId().equals(0L))) {transaccionconta.setId(transaccioncontaOrigen.getId());}}
			if(conDefault || (!conDefault && transaccioncontaOrigen.getcodigo()!=null && !transaccioncontaOrigen.getcodigo().equals(""))) {transaccionconta.setcodigo(transaccioncontaOrigen.getcodigo());}
			if(conDefault || (!conDefault && transaccioncontaOrigen.getnombre()!=null && !transaccioncontaOrigen.getnombre().equals(""))) {transaccionconta.setnombre(transaccioncontaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionConta(TransaccionConta transaccionconta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.setText(transaccionconta.getId().toString());
			this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.setText(transaccionconta.getcodigo());
			this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.setText(transaccionconta.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionConta(TransaccionContaBean transaccioncontaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.setText(transaccioncontaBean.getId().toString());
			this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.setText(transaccioncontaBean.getcodigo());
			this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.setText(transaccioncontaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransaccionConta(TransaccionContaParameterReturnGeneral transaccioncontaReturnGeneral,TransaccionContaBean transaccioncontaBean,Boolean conDefault) throws Exception { 
		try {
			TransaccionConta transaccioncontaLocal=new TransaccionConta();
			
			transaccioncontaLocal=transaccioncontaReturnGeneral.getTransaccionConta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioncontaLocal.getId()!=null && !transaccioncontaLocal.getId().equals(0L))) {transaccioncontaBean.setId(transaccioncontaLocal.getId());}}
			if(conDefault || (!conDefault && transaccioncontaLocal.getcodigo()!=null && !transaccioncontaLocal.getcodigo().equals(""))) {transaccioncontaBean.setcodigo(transaccioncontaLocal.getcodigo());}
			if(conDefault || (!conDefault && transaccioncontaLocal.getnombre()!=null && !transaccioncontaLocal.getnombre().equals(""))) {transaccioncontaBean.setnombre(transaccioncontaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransaccionContaGenerico(Long idTransaccionContaSeleccionado,JComboBox jComboBoxTransaccionConta,List<TransaccionConta> transaccioncontasLocal)throws Exception {
		try {
			TransaccionConta  transaccioncontaTemp=null;

			for(TransaccionConta transaccioncontaAux:transaccioncontasLocal) {
				if(transaccioncontaAux.getId()!=null && transaccioncontaAux.getId().equals(idTransaccionContaSeleccionado)) {
					transaccioncontaTemp=transaccioncontaAux;
					break;
				}
			}

			jComboBoxTransaccionConta.setSelectedItem(transaccioncontaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransaccionContaGenerico(JComboBox jComboBoxTransaccionConta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransaccionConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransaccionConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionConta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransaccionConta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionConta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransaccionConta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransaccionConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransaccionConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TransaccionLocal")) {
			jButtonTransaccionLocalActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccionconta=(TransaccionConta) transaccioncontaLogic.getTransaccionContas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccionconta =(TransaccionConta) transaccioncontas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TransaccionConta transaccioncontaRow=new TransaccionConta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioncontaRow=(TransaccionConta) transaccioncontaLogic.getTransaccionContas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioncontaRow=(TransaccionConta) transaccioncontas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransaccionLocalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TransaccionConta transaccionconta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTransaccionConta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionconta = (TransaccionConta)this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.transaccionconta = (TransaccionConta)this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(transaccionconta!=null) {
						this.transaccionconta = transaccionconta;
					} else {
						this.transaccionconta = new TransaccionConta();
					}
				}

				if(this.isTienePermisosTransaccionLocal && this.permiteMantenimiento(this.transaccionconta)) {
					TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFramePopup;
					} else {
						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame;
					}

					List<TransaccionConta> transaccioncontas=new ArrayList<TransaccionConta>();
					transaccioncontas.add(this.transaccionconta);
					if(!esRelacionado) {
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setConGuardarRelaciones(false);
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTransaccionConta.cargarTransaccionLocalBeanSwingJInternalFrame(transaccioncontas,this.transaccionconta,transaccionlocalBeanSwingJInternalFrame,/*conInicializar,*/transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getConGuardarRelaciones(),transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado());
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");

						transaccionlocalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA + (TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionlocalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTransaccionConta=(TitledBorder)this.jScrollPanelDatosTransaccionConta.getBorder();
						TitledBorder titledBorderTransaccionLocal=(TitledBorder)transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getBorder();

						titledBorderTransaccionLocal.setTitle(titledBorderTransaccionConta.getTitle() + " -> Transaccion Local");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionlocalBeanSwingJInternalFrame);
						}

						transaccionlocalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionlocalBeanSwingJInternalFrame);

						transaccionlocalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion Local",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransaccionConta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoTransaccionConta && this.isPermisoNuevoTransaccionConta));			
			this.jButtonDuplicarTransaccionConta.setVisible((this.isVisibilidadCeldaDuplicarTransaccionConta && this.isPermisoDuplicarTransaccionConta));			
			this.jButtonCopiarTransaccionConta.setVisible((this.isVisibilidadCeldaCopiarTransaccionConta && this.isPermisoCopiarTransaccionConta));
			this.jButtonVerFormTransaccionConta.setVisible((this.isVisibilidadCeldaVerFormTransaccionConta && this.isPermisoVerFormTransaccionConta));
			
			this.jButtonAbrirOrderByTransaccionConta.setVisible((this.isVisibilidadCeldaOrdenTransaccionConta && this.isPermisoOrdenTransaccionConta));			
			
			this.jButtonNuevoRelacionesTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionConta && this.isPermisoNuevoTransaccionConta));			
			this.jButtonNuevoGuardarCambiosTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoTransaccionConta && this.isPermisoNuevoTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));
			
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarTransaccionConta.setVisible((this.isVisibilidadCeldaModificarTransaccionConta && this.isPermisoActualizarTransaccionConta));	
			this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarTransaccionConta.setVisible((this.isVisibilidadCeldaActualizarTransaccionConta && this.isPermisoActualizarTransaccionConta));	
			this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarTransaccionConta.setVisible((this.isVisibilidadCeldaEliminarTransaccionConta && this.isPermisoEliminarTransaccionConta));
			this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarTransaccionConta.setVisible(this.isVisibilidadCeldaCancelarTransaccionConta);							
			this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.setVisible((this.isVisibilidadCeldaGuardarTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransaccionConta.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoTransaccionConta && this.isPermisoNuevoTransaccionConta));						
			this.jButtonDuplicarToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaDuplicarTransaccionConta && this.isPermisoDuplicarTransaccionConta));						
			this.jButtonCopiarToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaCopiarTransaccionConta && this.isPermisoCopiarTransaccionConta));			
			this.jButtonVerFormToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaVerFormTransaccionConta && this.isPermisoVerFormTransaccionConta));			
			this.jButtonAbrirOrderByToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaOrdenTransaccionConta && this.isPermisoOrdenTransaccionConta));
			this.jButtonNuevoRelacionesToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionConta && this.isPermisoNuevoTransaccionConta));			
			this.jButtonNuevoGuardarCambiosToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoTransaccionConta && this.isPermisoNuevoTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));			
			
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaModificarTransaccionConta && this.isPermisoActualizarTransaccionConta));	
			this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaActualizarTransaccionConta  && this.isPermisoActualizarTransaccionConta));	
			this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaEliminarTransaccionConta && this.isPermisoEliminarTransaccionConta));
			this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarToolBarTransaccionConta.setVisible(this.isVisibilidadCeldaCancelarTransaccionConta);				
			this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaGuardarTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransaccionConta.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoTransaccionConta && this.isPermisoNuevoTransaccionConta));			
			this.jMenuItemDuplicarTransaccionConta.setVisible((this.isVisibilidadCeldaDuplicarTransaccionConta && this.isPermisoDuplicarTransaccionConta));			
			this.jMenuItemCopiarTransaccionConta.setVisible((this.isVisibilidadCeldaCopiarTransaccionConta && this.isPermisoCopiarTransaccionConta));			
			this.jMenuItemVerFormTransaccionConta.setVisible((this.isVisibilidadCeldaVerFormTransaccionConta && this.isPermisoVerFormTransaccionConta));			
			this.jMenuItemAbrirOrderByTransaccionConta.setVisible((this.isVisibilidadCeldaOrdenTransaccionConta && this.isPermisoOrdenTransaccionConta));			
			//this.jMenuItemMostrarOcultarTransaccionConta.setVisible((this.isVisibilidadCeldaOrdenTransaccionConta && this.isPermisoOrdenTransaccionConta));
			this.jMenuItemDetalleAbrirOrderByTransaccionConta.setVisible((this.isVisibilidadCeldaOrdenTransaccionConta && this.isPermisoOrdenTransaccionConta));			
			//this.jMenuItemDetalleMostrarOcultarTransaccionConta.setVisible((this.isVisibilidadCeldaOrdenTransaccionConta && this.isPermisoOrdenTransaccionConta));			
			this.jMenuItemNuevoRelacionesTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionConta && this.isPermisoNuevoTransaccionConta));			
			this.jMenuItemNuevoGuardarCambiosTransaccionConta.setVisible((this.isVisibilidadCeldaNuevoTransaccionConta && this.isPermisoNuevoTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));									
			
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemModificarTransaccionConta.setVisible((this.isVisibilidadCeldaModificarTransaccionConta && this.isPermisoActualizarTransaccionConta));	
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemActualizarTransaccionConta.setVisible((this.isVisibilidadCeldaActualizarTransaccionConta && this.isPermisoActualizarTransaccionConta));	
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemEliminarTransaccionConta.setVisible((this.isVisibilidadCeldaEliminarTransaccionConta && this.isPermisoEliminarTransaccionConta));
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemCancelarTransaccionConta.setVisible(this.isVisibilidadCeldaCancelarTransaccionConta);				
			}
			
			this.jMenuItemGuardarCambiosTransaccionConta.setVisible((this.isVisibilidadCeldaGuardarTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));						
			this.jMenuItemGuardarCambiosTablaTransaccionConta.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransaccionConta=this.jButtonNuevoTransaccionConta.isVisible();
			this.isVisibilidadCeldaDuplicarTransaccionConta=this.jButtonDuplicarTransaccionConta.isVisible();
			this.isVisibilidadCeldaCopiarTransaccionConta=this.jButtonCopiarTransaccionConta.isVisible();
			this.isVisibilidadCeldaVerFormTransaccionConta=this.jButtonVerFormTransaccionConta.isVisible();
			
			this.isVisibilidadCeldaOrdenTransaccionConta=this.jButtonAbrirOrderByTransaccionConta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=this.jButtonNuevoRelacionesTransaccionConta.isVisible();
			this.isVisibilidadCeldaModificarTransaccionConta=this.jButtonModificarTransaccionConta.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.isVisibilidadCeldaActualizarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarTransaccionConta.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarTransaccionConta.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarTransaccionConta.isVisible();
			this.isVisibilidadCeldaGuardarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=this.jButtonGuardarCambiosTablaTransaccionConta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransaccionConta=this.jButtonNuevoToolBarTransaccionConta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=this.jButtonNuevoRelacionesToolBarTransaccionConta.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.isVisibilidadCeldaModificarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarToolBarTransaccionConta.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarToolBarTransaccionConta.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarToolBarTransaccionConta.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarToolBarTransaccionConta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionConta=this.jButtonGuardarCambiosToolBarTransaccionConta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=this.jButtonGuardarCambiosTablaToolBarTransaccionConta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransaccionConta=this.jMenuItemNuevoTransaccionConta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=this.jMenuItemNuevoRelacionesTransaccionConta.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.isVisibilidadCeldaModificarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jMenuItemModificarTransaccionConta.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jMenuItemActualizarTransaccionConta.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jMenuItemEliminarTransaccionConta.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionConta=this.jInternalFrameDetalleFormTransaccionConta.jMenuItemCancelarTransaccionConta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionConta=this.jMenuItemGuardarCambiosTransaccionConta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=this.jMenuItemGuardarCambiosTablaTransaccionConta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransaccionConta(Boolean esInicializar) {
		if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
				//if(this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionConta();
			}
			
			this.inicializarActualizarBindingBotonesManualTransaccionConta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransaccionConta() {
		this.jButtonNuevoTransaccionConta.setVisible(this.isPermisoNuevoTransaccionConta);			
		this.jButtonDuplicarTransaccionConta.setVisible(this.isPermisoDuplicarTransaccionConta);			
		this.jButtonCopiarTransaccionConta.setVisible(this.isPermisoCopiarTransaccionConta);			
		this.jButtonVerFormTransaccionConta.setVisible(this.isPermisoVerFormTransaccionConta);			
		
		this.jButtonAbrirOrderByTransaccionConta.setVisible(this.isPermisoOrdenTransaccionConta);					
		
		this.jButtonNuevoRelacionesTransaccionConta.setVisible(this.isPermisoNuevoTransaccionConta);			
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarTransaccionConta.setVisible(this.isPermisoActualizarTransaccionConta);	
			this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarTransaccionConta.setVisible(this.isPermisoActualizarTransaccionConta);	
			this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarTransaccionConta.setVisible(this.isPermisoEliminarTransaccionConta);
			this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarTransaccionConta.setVisible(this.isVisibilidadCeldaCancelarTransaccionConta);						
			this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.setVisible(this.isPermisoGuardarCambiosTransaccionConta);							
		}
		
		this.jButtonGuardarCambiosTablaTransaccionConta.setVisible(this.isPermisoActualizarTransaccionConta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionConta() {
		this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarTransaccionConta.setVisible(this.isPermisoActualizarTransaccionConta);	
		this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarTransaccionConta.setVisible(this.isPermisoActualizarTransaccionConta);	
		this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarTransaccionConta.setVisible(this.isPermisoEliminarTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarTransaccionConta.setVisible(this.isVisibilidadCeldaCancelarTransaccionConta);							
		this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.setVisible((this.isVisibilidadCeldaGuardarTransaccionConta && this.isPermisoGuardarCambiosTransaccionConta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransaccionConta() {
		if(TransaccionContaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransaccionConta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransaccionConta() {
	}
	
	public void jTableDatosTransaccionContaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransaccionConta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransaccionContaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionConta(this.gettransaccionconta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccionconta==null) {
						this.transaccionconta = new TransaccionConta();
					}

					this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
				}

				if(this.transaccionconta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transaccionconta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionConta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTransaccionContaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionConta(this.gettransaccionconta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccionconta==null) {
						this.transaccionconta = new TransaccionConta();
					}

					this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
				}

				if(this.transaccionconta.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.transaccionconta.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionConta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTransaccionContaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionConta(this.gettransaccionconta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccionconta==null) {
						this.transaccionconta = new TransaccionConta();
					}

					this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);
				}

				if(this.transaccionconta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.transaccionconta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionConta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTransaccionContaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionConta(false,false);

			this.getTransaccionContasBusquedaPorCodigo();

			this.inicializarActualizarBindingTransaccionConta(false);

			//if(TransaccionContaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionConta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdTransaccionContaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionConta(false,false);

			this.getTransaccionContasBusquedaPorId();

			this.inicializarActualizarBindingTransaccionConta(false);

			//if(TransaccionContaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionConta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTransaccionContaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionConta(false,false);

			this.getTransaccionContasBusquedaPorNombre();

			this.inicializarActualizarBindingTransaccionConta(false);

			//if(TransaccionContaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionConta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncontaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransaccionConta() {
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
		

		if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
			this.jInternalFrameDetalleFormTransaccionConta.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransaccionConta.dispose();
			this.jInternalFrameDetalleFormTransaccionConta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
			this.jInternalFrameReporteDinamicoTransaccionConta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransaccionConta.dispose();
			this.jInternalFrameReporteDinamicoTransaccionConta=null;
		}
		
		if(this.jInternalFrameImportacionTransaccionConta!=null) {
			this.jInternalFrameImportacionTransaccionConta.setVisible(false);	    			
			this.jInternalFrameImportacionTransaccionConta.dispose();
			this.jInternalFrameImportacionTransaccionConta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransaccionConta();
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransaccionConta")) {
				jButtonDuplicarTransaccionContaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransaccionConta")) {
				jButtonCopiarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransaccionConta")) {
				jButtonVerFormTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransaccionConta")) {
				jButtonDuplicarTransaccionContaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransaccionConta")) {
				jButtonDuplicarTransaccionContaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransaccionConta")) {
				jButtonModificarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransaccionConta")) {
				jButtonModificarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransaccionConta")) {
				jButtonModificarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransaccionConta")) {
				jButtonActualizarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransaccionConta")) {
				jButtonActualizarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransaccionConta")) {
				jButtonActualizarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransaccionConta")) {
				jButtonEliminarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransaccionConta")) {
				jButtonEliminarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransaccionConta")) {
				jButtonEliminarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransaccionConta")) {
				jButtonCancelarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransaccionConta")) {
				jButtonCancelarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransaccionConta")) {
				jButtonCancelarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransaccionConta")) {
				jButtonCerrarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransaccionConta")) {
				jButtonCerrarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransaccionConta")) {
				jButtonCerrarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransaccionConta")) {
				jButtonMostrarOcultarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransaccionConta")) {
				jButtonCancelarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransaccionConta")) {
				jButtonCopiarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransaccionConta")) {
				jButtonVerFormTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransaccionConta")) {
				jButtonCopiarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransaccionConta")) {
				jButtonVerFormTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransaccionConta")) {
				jButtonRecargarInformacionTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransaccionConta")) {
				jButtonRecargarInformacionTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransaccionConta")) {
				jButtonRecargarInformacionTransaccionContaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransaccionConta")) {
				jButtonAnterioresTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransaccionConta")) {
				jButtonAnterioresTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransaccionConta")) {
				jButtonAnterioresTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransaccionConta")) {
				jButtonSiguientesTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransaccionConta")) {
				jButtonSiguientesTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransaccionConta")) {
				jButtonSiguientesTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransaccionConta") || sTipo.equals("MenuItemDetalleAbrirOrderByTransaccionConta")) {
				jButtonAbrirOrderByTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransaccionConta") || sTipo.equals("MenuItemDetalleMostrarOcultarTransaccionConta")) {
				jButtonMostrarOcultarTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionConta")) {
				jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransaccionConta")) {
				jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransaccionConta")) {
				jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransaccionConta")) {
				jButtonCerrarReporteDinamicoTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransaccionConta")) {
				jButtonGenerarReporteDinamicoTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransaccionConta")) {
				
				jButtonGenerarExcelReporteDinamicoTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransaccionConta")) {
				jButtonCerrarImportacionTransaccionContaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransaccionConta")) {
				
				jButtonGenerarImportacionTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransaccionConta")) {
				
				jButtonAbrirImportacionTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransaccionConta")) {
				jComboBoxTiposAccionesTransaccionContaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransaccionConta")) {
				jComboBoxTiposRelacionesTransaccionContaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransaccionConta")) {
				jComboBoxTiposAccionesTransaccionContaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransaccionConta")) {
				
				jComboBoxTiposSeleccionarTransaccionContaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransaccionConta")) {
				jTextFieldValorCampoGeneralTransaccionContaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransaccionConta")) {
				jButtonAbrirOrderByTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransaccionConta")) {
				jButtonAbrirOrderByTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransaccionConta")) {
				jButtonCerrarOrderByTransaccionContaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionContaBusqueda")) {
				this.jButtonidTransaccionContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTransaccionContaBusqueda")) {
				this.jButtoncodigoTransaccionContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransaccionContaBusqueda")) {
				this.jButtonnombreTransaccionContaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTransaccionConta")) {
				this.jButtonBusquedaPorCodigoTransaccionContaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdTransaccionConta")) {
				this.jButtonBusquedaPorIdTransaccionContaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTransaccionConta")) {
				this.jButtonBusquedaPorNombreTransaccionContaActionPerformed(evt);
			}
			
			;
			
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransaccionConta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionContaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TransaccionConta transaccioncontaLocal=null;
			
			if(!this.getEsControlTabla()) {
				transaccioncontaLocal=this.transaccionconta;
			} else {
				transaccioncontaLocal=this.transaccioncontaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
							
				
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
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
			
			


			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionContaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
								
						
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
								
				
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
							
				
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionContaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
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
			
			


			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
								
				
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionContaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransaccionConta")) {
					jCheckBoxSeleccionarTodosTransaccionContaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransaccionConta")) {
					jCheckBoxSeleccionadosTransaccionContaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransaccionConta")) {
					
				}
				
				


				
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
												
				
				


				
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionContaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionContaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
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
			
			


			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionContaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccionconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccionconta);
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
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
				
				


				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionConta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncontaAnterior =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransaccionConta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransaccionContaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransaccionConta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transaccionconta =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transaccionconta =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transaccionconta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransaccionConta")) {
				
				}
				
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransaccionConta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransaccionConta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransaccionConta")) {
			
			}
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransaccionConta();
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
			if(sTipo.equals("NuevoTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransaccionConta")) {
				jButtonDuplicarTransaccionContaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransaccionConta")) {
				jButtonCopiarTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransaccionConta")) {
				jButtonVerFormTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransaccionConta")) {
				jButtonNuevoTransaccionContaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransaccionConta")) {
				jButtonModificarTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransaccionConta")) {
				jButtonActualizarTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransaccionConta")) {
				jButtonEliminarTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransaccionConta")) {
				jButtonCancelarTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransaccionConta")) {
				jButtonCerrarTransaccionContaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransaccionConta")) {
				jButtonGuardarCambiosTransaccionContaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionConta")) {
				jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransaccionConta")) {
				jButtonAbrirOrderByTransaccionContaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransaccionConta")) {
				jButtonRecargarInformacionTransaccionContaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransaccionConta")) {
				jButtonAnterioresTransaccionContaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransaccionConta")) {
				jButtonSiguientesTransaccionContaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionContaBusqueda")) {
				this.jButtonidTransaccionContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTransaccionContaBusqueda")) {
				this.jButtoncodigoTransaccionContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransaccionContaBusqueda")) {
				this.jButtonnombreTransaccionContaBusquedaActionPerformed(evt);
			}
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransaccionConta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransaccionConta")) {
				closingInternalFrameTransaccionConta();
				
			} else if(sTipo.equals("jButtonCancelarTransaccionConta")) {
				JInternalFrameBase jInternalFrameDetalleFormTransaccionConta = (JInternalFrameBase)evt.getSource();
	            	
	            TransaccionContaBeanSwingJInternalFrame jInternalFrameParent=(TransaccionContaBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionConta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransaccionContaActionPerformed(null);
			}
			
			TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccionconta,new Object(),this.transaccioncontaParameterGeneral,this.transaccioncontaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransaccionConta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransaccionConta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransaccionConta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transaccionconta)) {
			if(!esControlTabla) {
				if(TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);			
				}
				
				if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransaccionConta(this.transaccionconta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccioncontaReturnGeneral=transaccioncontaLogic.procesarEventosTransaccionContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioncontaLogic.getTransaccionContas(),this.transaccionconta,this.transaccioncontaParameterGeneral,this.isEsNuevoTransaccionConta,classes);//this.transaccioncontaLogic.getTransaccionConta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransaccionConta(this.transaccioncontaReturnGeneral,this.transaccioncontaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionConta(classes,this.transaccioncontaReturnGeneral,this.transaccioncontaBean,false);
					}
						
					if(this.transaccioncontaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransaccionConta(this.transaccioncontaReturnGeneral.getTransaccionConta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransaccionConta(this.transaccioncontaReturnGeneral.getTransaccionConta());	
					}
						
					if(this.transaccioncontaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransaccionConta(this.transaccioncontaReturnGeneral.getTransaccionConta(),classes);//this.transaccioncontaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransaccionConta(this.transaccionconta,classes);//this.transaccioncontaBean);									
				}
			
				if(TransaccionContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransaccionConta(this.transaccionconta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionConta(this.transaccionconta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transaccioncontaAnterior!=null) {
						this.transaccionconta=this.transaccioncontaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccioncontaReturnGeneral=transaccioncontaLogic.procesarEventosTransaccionContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioncontaLogic.getTransaccionContas(),this.transaccionconta,this.transaccioncontaParameterGeneral,this.isEsNuevoTransaccionConta,classes);//this.transaccioncontaLogic.getTransaccionConta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccioncontaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transaccioncontaReturnGeneral.getTransaccionConta(),transaccioncontaLogic.getTransaccionContas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transaccioncontaReturnGeneral.getTransaccionConta(),this.transaccioncontas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransaccionConta.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransaccionConta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransaccionConta();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransaccionConta() throws Exception {
		
		TransaccionContaModel transaccioncontaModel=(TransaccionContaModel)this.jTableDatosTransaccionConta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioncontaModel.transaccioncontas=this.transaccioncontaLogic.getTransaccionContas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transaccioncontaModel.transaccioncontas=this.transaccioncontas;
		}
		
		
		((TransaccionContaModel) this.jTableDatosTransaccionConta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransaccionConta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransaccioncontaAnterior(),this.transaccioncontaLogic.getTransaccionContas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransaccioncontaAnterior(),this.transaccioncontas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransaccionConta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransaccionConta(TransaccionConta transaccionconta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(transaccionconta.getTransaccionLocals());
					this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
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
										
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccionconta,new Object(),generalEntityParameterGeneral,this.transaccioncontaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransaccionContaConstantesFunciones.getClassesRelationshipsOfTransaccionConta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransaccionContaConstantesFunciones.getClassesRelationshipsFromStringsOfTransaccionConta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransaccionConta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransaccionContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccionconta,new Object(),generalEntityParameterGeneral,this.transaccioncontaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransaccionConta(TransaccionContaBean transaccioncontaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(transaccionconta.getTransaccionLocals());
					this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionConta(ArrayList<Classe> classes,TransaccionContaReturnGeneral transaccioncontaReturnGeneral,TransaccionContaBean transaccioncontaBean,Boolean conDefault) throws Exception {
		
			this.transaccioncontaBean.setTransaccionLocals(transaccioncontaReturnGeneral.getTransaccionConta().getTransaccionLocals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransaccionConta(TransaccionConta transaccionconta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					transaccionconta.setTransaccionLocals(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
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
		if(!paraTabla && !this.permiteMantenimiento(this.transaccionconta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionConta = new TransaccionContaDetalleFormJInternalFrame(jDesktopPane,this.transaccioncontaSessionBean.getConGuardarRelaciones(),this.transaccioncontaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.setVisible(false);
		this.jInternalFrameDetalleFormTransaccionConta.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransaccionConta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransaccionConta.transaccioncontaLogic=this.transaccioncontaLogic;
		
		this.cargarCombosFrameForeignKeyTransaccionConta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionConta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionConta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransaccionConta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransaccionConta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransaccionConta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionConta"));
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarTransaccionConta.addActionListener(new ButtonActionListener(this,"ModificarTransaccionConta"));

		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarToolBarTransaccionConta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionConta"));
					
		this.jInternalFrameDetalleFormTransaccionConta.jMenuItemModificarTransaccionConta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionConta"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarTransaccionConta.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionConta"));
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarToolBarTransaccionConta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionConta"));
						
		this.jInternalFrameDetalleFormTransaccionConta.jMenuItemActualizarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionConta"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarTransaccionConta.addActionListener (new ButtonActionListener(this,"EliminarTransaccionConta"));
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionConta"));
								
		this.jInternalFrameDetalleFormTransaccionConta.jMenuItemEliminarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionConta"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarTransaccionConta.addActionListener (new ButtonActionListener(this,"CancelarTransaccionConta"));
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionConta"));
					
		this.jInternalFrameDetalleFormTransaccionConta.jMenuItemCancelarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionConta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jMenuItemDetalleCerrarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionConta"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionConta"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionConta"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionConta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtonidTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtoncodigoTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransaccionContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtonnombreTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionContaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionConta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransaccionConta"));
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionConta"));
		}
		
		this.jTableDatosTransaccionConta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransaccionConta"));
		
		this.jTableDatosTransaccionConta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransaccionConta"));
		
		this.jButtonNuevoTransaccionConta.addActionListener(new ButtonActionListener(this,"NuevoTransaccionConta"));
		
		this.jButtonDuplicarTransaccionConta.addActionListener(new ButtonActionListener(this,"DuplicarTransaccionConta"));
		
		this.jButtonCopiarTransaccionConta.addActionListener(new ButtonActionListener(this,"CopiarTransaccionConta"));
		
		this.jButtonVerFormTransaccionConta.addActionListener(new ButtonActionListener(this,"VerFormTransaccionConta"));
		
		
		this.jButtonNuevoToolBarTransaccionConta.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransaccionConta"));
			
		this.jButtonDuplicarToolBarTransaccionConta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransaccionConta"));
			
		this.jMenuItemNuevoTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransaccionConta"));
			
		this.jMenuItemDuplicarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransaccionConta"));		
		
		
		this.jButtonNuevoRelacionesTransaccionConta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransaccionConta"));
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionConta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransaccionConta"));
			
		this.jMenuItemNuevoRelacionesTransaccionConta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransaccionConta"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarTransaccionConta.addActionListener(new ButtonActionListener(this,"ModificarTransaccionConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonModificarToolBarTransaccionConta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionConta"));
			
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemModificarTransaccionConta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarTransaccionConta.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonActualizarToolBarTransaccionConta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionConta"));
				
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemActualizarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarTransaccionConta.addActionListener (new ButtonActionListener(this,"EliminarTransaccionConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonEliminarToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionConta"));
						
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemEliminarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarTransaccionConta.addActionListener (new ButtonActionListener(this,"CancelarTransaccionConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonCancelarToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionConta"));
			
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemCancelarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionConta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransaccionConta"));		
		
		
		this.jButtonCerrarTransaccionConta.addActionListener (new ButtonActionListener(this,"CerrarTransaccionConta"));
		
		
		this.jButtonCerrarToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransaccionConta"));
			
		this.jMenuItemCerrarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransaccionConta"));
			
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jMenuItemDetalleCerrarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransaccionConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionConta"));
		}
		
		this.jButtonCopiarToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransaccionConta"));
			
		this.jButtonVerFormToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransaccionConta"));
		
		this.jMenuItemGuardarCambiosTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransaccionConta"));
			
		this.jMenuItemCopiarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransaccionConta"));		
		
		this.jMenuItemVerFormTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransaccionConta"));		
		
		
		this.jButtonGuardarCambiosTablaTransaccionConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionConta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransaccionConta"));
			
		this.jMenuItemGuardarCambiosTablaTransaccionConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionConta"));		
		
		
		
		this.jButtonRecargarInformacionTransaccionConta.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransaccionConta"));
					
		this.jButtonRecargarInformacionToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransaccionConta"));
		
		this.jMenuItemRecargarInformacionTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransaccionConta"));		
		
		
		
		this.jButtonAnterioresTransaccionConta.addActionListener (new ButtonActionListener(this,"AnterioresTransaccionConta"));
		
		
		this.jButtonAnterioresToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransaccionConta"));
		
		this.jMenuItemAnterioresTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransaccionConta"));		
		
		
		this.jButtonSiguientesTransaccionConta.addActionListener (new ButtonActionListener(this,"SiguientesTransaccionConta"));
		
		
		this.jButtonSiguientesToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransaccionConta"));
			
		this.jMenuItemSiguientesTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransaccionConta"));
			
		this.jMenuItemAbrirOrderByTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransaccionConta"));
			
		this.jMenuItemMostrarOcultarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransaccionConta"));
			
		this.jMenuItemDetalleAbrirOrderByTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransaccionConta"));
			
		this.jMenuItemDetalleMostarOcultarTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransaccionConta"));		
		
		
		this.jButtonNuevoGuardarCambiosTransaccionConta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransaccionConta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransaccionConta"));
			
		this.jMenuItemNuevoGuardarCambiosTransaccionConta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransaccionConta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransaccionConta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransaccionConta"));

		this.jCheckBoxSeleccionadosTransaccionConta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransaccionConta"));
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionConta"));
		}
		
		
		this.jComboBoxTiposRelacionesTransaccionConta.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransaccionConta"));
			
		this.jComboBoxTiposAccionesTransaccionConta.addActionListener (new ButtonActionListener(this,"TiposAccionesTransaccionConta"));
					
		this.jComboBoxTiposSeleccionarTransaccionConta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransaccionConta"));
			
		this.jTextFieldValorCampoGeneralTransaccionConta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransaccionConta"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtonidTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtoncodigoTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransaccionContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtonnombreTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionContaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTransaccionConta.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTransaccionConta"));

			this.jButtonBusquedaPorIdTransaccionConta.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTransaccionConta"));

			this.jButtonBusquedaPorNombreTransaccionConta.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransaccionConta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransaccionConta!=null) {
				this.jInternalFrameReporteDinamicoTransaccionConta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionConta"));
				this.jInternalFrameReporteDinamicoTransaccionConta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionConta"));
				this.jInternalFrameReporteDinamicoTransaccionConta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionConta"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransaccionConta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionConta"));				
			//this.jButtonGenerarReporteDinamicoTransaccionConta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionConta"));
			//this.jButtonGenerarExcelReporteDinamicoTransaccionConta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionConta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransaccionConta!=null) {
				this.jInternalFrameImportacionTransaccionConta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionConta"));
				this.jInternalFrameImportacionTransaccionConta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionConta"));
				this.jInternalFrameImportacionTransaccionConta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionConta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransaccionConta.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransaccionConta"));
			
			this.jButtonAbrirOrderByToolBarTransaccionConta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransaccionConta"));			
			
			if(this.jInternalFrameOrderByTransaccionConta!=null) {
				this.jInternalFrameOrderByTransaccionConta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionConta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionConta.jTabbedPaneRelacionesTransaccionConta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionConta"));
		
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
            		closingInternalFrameTransaccionConta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransaccionConta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransaccionConta = (JInternalFrameBase)event.getSource();
	            	
	            TransaccionContaBeanSwingJInternalFrame jInternalFrameParent=(TransaccionContaBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionConta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransaccionContaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransaccionConta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransaccionContaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransaccionConta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransaccionConta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionContaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionContaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionContaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransaccionConta";
		inputMap = this.jButtonNuevoTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionContaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionContaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionContaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionContaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransaccionConta";
		inputMap = this.jButtonNuevoRelacionesTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionContaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransaccionConta";
		inputMap = this.jButtonModificarTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransaccionContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransaccionConta";
		inputMap = this.jButtonActualizarTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransaccionContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransaccionConta";
		inputMap = this.jButtonEliminarTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransaccionContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransaccionConta";
		inputMap = this.jButtonCancelarTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransaccionContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransaccionConta";
		inputMap = this.jButtonCerrarTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransaccionContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransaccionConta";
		inputMap = this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransaccionConta.jButtonGuardarCambiosTransaccionConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransaccionContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransaccionConta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransaccionContaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransaccionConta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransaccionContaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransaccionConta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransaccionContaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransaccionConta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransaccionContaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtonidTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtoncodigoTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransaccionContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionConta.jButtonnombreTransaccionContaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionContaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTransaccionConta.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTransaccionConta"));

		this.jButtonBusquedaPorIdTransaccionConta.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTransaccionConta"));

		this.jButtonBusquedaPorNombreTransaccionConta.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransaccionConta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransaccionConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransaccionContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransaccionContaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransaccionConta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransaccionConta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
					transaccioncontaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionConta transaccioncontaAux:transaccioncontas) {
					transaccioncontaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransaccionContaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionConta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
						transaccioncontaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionConta transaccioncontaAux:transaccioncontas) {
						transaccioncontaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionConta transaccioncontaAux:transaccioncontas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionConta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionConta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionConta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionConta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransaccionContaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionConta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransaccionConta.getSelectedRows();
			
			TransaccionConta transaccioncontaLocal=new TransaccionConta();
			
			//this.seleccionarTodosTransaccionConta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioncontaLocal =(TransaccionConta) this.transaccioncontaLogic.getTransaccionContas().toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transaccioncontaLocal =(TransaccionConta) this.transaccioncontas.toArray()[this.jTableDatosTransaccionConta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transaccioncontaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
						transaccioncontaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionConta transaccioncontaAux:transaccioncontas) {
						transaccioncontaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransaccionConta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionConta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionConta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionConta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransaccionContaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransaccionContaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransaccionContaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransaccionConta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransaccionConta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionConta transaccioncontaAux:this.transaccioncontaLogic.getTransaccionContas()) {
				
						if(sTipoSeleccionar.equals(TransaccionContaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							transaccioncontaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionContaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transaccioncontaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionConta transaccioncontaAux:transaccioncontas) {
					
						if(sTipoSeleccionar.equals(TransaccionContaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							transaccioncontaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionContaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transaccioncontaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionConta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransaccionContaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransaccionConta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransaccionConta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransaccionConta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransaccionConta) {				
					conSplash=true;//false;										
					
					//this.startProcessTransaccionConta(conSplash);
				
					this.generarReporteTransaccionContasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransaccionContasSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionContasSeleccionados(false);
				//this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionContasSeleccionados(true);
				//this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionConta();
				
				this.exportarTransaccionContasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransaccionContas();
				//this.importarTransaccionContas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionConta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransaccionContasSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transaccion Contablilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransaccionConta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransaccionConta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransaccionConta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.setSelectedIndex(0);					
				}	
			} 			
			else if(TransaccionContaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransaccionConta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransaccionConta(conSplash);
					
						//this.actualizarParametrosGeneralTransaccionConta();
						
						this.generarReporteProcesoAccionTransaccionContasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransaccionContaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Transaccion ContablilidadS SELECCIONADOS?", "MANTENIMIENTO DE Transaccion Contablilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransaccionConta();
				
						this.actualizarParametrosGeneralTransaccionConta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transaccioncontaReturnGeneral=transaccioncontaLogic.procesarAccionTransaccionContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transaccioncontaLogic.getTransaccionContas(),this.transaccioncontaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransaccionContaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransaccionConta();
					
					TransaccionContaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransaccionContaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionConta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionConta.jComboBoxTiposAccionesFormularioTransaccionConta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransaccionConta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransaccionContaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransaccionConta();
			
			if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
			TransaccionConta transaccionconta=new TransaccionConta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransaccionConta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransaccionConta.getSelectedItem();
			
			
			
			
			transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
			//this.sTipoAccion;
			
			if(transaccioncontasSeleccionados.size()==1) {
				for(TransaccionConta transaccioncontaAux:transaccioncontasSeleccionados) {
					transaccionconta=transaccioncontaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transaccion Local")) {
					jButtonTransaccionLocalActionPerformed(null,rowIndex,true,false,transaccionconta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransaccionConta();
			
      		//this.finishProcessTransaccionConta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransaccionContaReturnGeneral() throws Exception {
		if(this.transaccioncontaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transaccioncontaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transaccioncontaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transaccioncontaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transaccioncontaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transaccioncontaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransaccionConta(false);
		}
		
		if(this.transaccioncontaReturnGeneral.getConRetornoLista() || this.transaccioncontaReturnGeneral.getConRetornoObjeto()) {
			if(this.transaccioncontaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccioncontaLogic.setTransaccionContas(this.transaccioncontaReturnGeneral.getTransaccionContas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.transaccioncontaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccioncontaLogic.setTransaccionConta(this.transaccioncontaReturnGeneral.getTransaccionConta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTransaccionConta(false);
		}
	}
	
	public void actualizarParametrosGeneralTransaccionConta() throws Exception {
		
		
	}
	
	public ArrayList<TransaccionConta> getTransaccionContasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransaccionConta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TransaccionConta transaccioncontaAux:transaccioncontaLogic.getTransaccionContas()) {
					if(transaccioncontaAux.getIsSelected()) {
						transaccioncontasSeleccionados.add(transaccioncontaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionConta transaccioncontaAux:this.transaccioncontas) {
					if(transaccioncontaAux.getIsSelected()) {
						transaccioncontasSeleccionados.add(transaccioncontaAux);				
					}
				}
			}
			
			if(transaccioncontasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transaccioncontasSeleccionados.addAll(this.transaccioncontaLogic.getTransaccionContas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transaccioncontasSeleccionados.addAll(this.transaccioncontas);				
					}
				}
			}
		} else {
			transaccioncontasSeleccionados.add(this.transaccionconta);
		}
		
		return transaccioncontasSeleccionados;
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
	
	public void generarReporteTransaccionContasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransaccionContasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransaccionContasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionContasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionContasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTransaccionContasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transaccion Contablilidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransaccionContasSeleccionados() throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransaccionContas("Todos",transaccioncontasSeleccionados);
		
	}	
	
	public void generarReporteNormalTransaccionContasSeleccionados() throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransaccionContas("Todos",transaccioncontasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransaccionContasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransaccionContas("Todos",transaccioncontasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransaccionContasSeleccionados() throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransaccionConta();
		
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransaccionConta();
		
		
		//this.generarReporteTransaccionContas("Todos",transaccioncontasSeleccionados ,transaccioncontaImplementable,transaccioncontaImplementableHome);
	}
	
	public void mostrarImportacionTransaccionContas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransaccionConta();
		
		this.abrirFrameImportacionTransaccionConta();		
		
			
		//this.generarReporteTransaccionContas("Todos",transaccioncontasSeleccionados ,transaccioncontaImplementable,transaccioncontaImplementableHome);
	}
	
	public void importarTransaccionContas() throws Exception {		
	
	}
	
	public void exportarTransaccionContasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransaccionContasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransaccionContasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransaccionContasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transaccion Contablilidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransaccionContasSeleccionados() throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccionconta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransaccionConta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TransaccionConta transaccioncontaAux:transaccioncontasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransaccionConta(transaccioncontaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transaccioncontaAux.setsDetalleGeneralEntityReporte(transaccioncontaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransaccionConta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransaccionContaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionContaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionContaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionContaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransaccionConta(TransaccionConta transaccionconta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transaccionconta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccionconta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccionconta.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccionconta.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransaccionContasSeleccionados() throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccionconta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TransaccionContas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransaccionConta(row);				
				iRow++;
			}				
			
			for(TransaccionConta transaccioncontaAux:transaccioncontasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransaccionConta(transaccioncontaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransaccionContasSeleccionados() throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();		
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccionconta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transaccioncontas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transaccionconta");
			//elementRoot.appendChild(element);
		
			for(TransaccionConta transaccioncontaAux:transaccioncontasSeleccionados) {
				element = document.createElement("transaccionconta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransaccionConta(transaccioncontaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Contablilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransaccionConta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionContaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransaccionConta(TransaccionConta transaccionconta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transaccionconta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccionconta.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccionconta.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTransaccionConta(TransaccionConta transaccionconta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransaccionContaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transaccionconta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransaccionContaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transaccionconta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TransaccionContaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(transaccionconta.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TransaccionContaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(transaccionconta.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTransaccionContasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TransaccionConta> transaccioncontasSeleccionados=new ArrayList<TransaccionConta>();
		
		transaccioncontasSeleccionados=this.getTransaccionContasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransaccionConta(transaccioncontasSeleccionados);
		
		this.generarReporteTransaccionContas("Todos",transaccioncontasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransaccionConta(ArrayList<TransaccionConta> transaccioncontasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TransaccionConta transaccioncontaAux:transaccioncontasSeleccionados) {
				transaccioncontaAux.setsDetalleGeneralEntityReporte(transaccioncontaAux.toString());
			
				if(sTipoSeleccionar.equals(TransaccionContaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					transaccioncontaAux.setsDescripcionGeneralEntityReporte1(transaccioncontaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TransaccionContaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					transaccioncontaAux.setsDescripcionGeneralEntityReporte1(transaccioncontaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransaccionConta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransaccionConta=true;
				this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=true;
				this.isVisibilidadCeldaGuardarCambiosTransaccionConta=true;
			}
			
			this.isVisibilidadCeldaModificarTransaccionConta=false;
			this.isVisibilidadCeldaActualizarTransaccionConta=false;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
			this.isVisibilidadCeldaCancelarTransaccionConta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransaccionConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
			this.isVisibilidadCeldaModificarTransaccionConta=false;
			this.isVisibilidadCeldaActualizarTransaccionConta=true;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
			this.isVisibilidadCeldaCancelarTransaccionConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransaccionConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
			this.isVisibilidadCeldaModificarTransaccionConta=false;
			this.isVisibilidadCeldaActualizarTransaccionConta=true;
			this.isVisibilidadCeldaEliminarTransaccionConta=true;
			this.isVisibilidadCeldaCancelarTransaccionConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransaccionConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
			this.isVisibilidadCeldaModificarTransaccionConta=false;
			this.isVisibilidadCeldaActualizarTransaccionConta=true;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
			this.isVisibilidadCeldaCancelarTransaccionConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransaccionConta=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=true;
			this.isVisibilidadCeldaModificarTransaccionConta=false;
			this.isVisibilidadCeldaActualizarTransaccionConta=false;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
			this.isVisibilidadCeldaCancelarTransaccionConta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransaccionConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
			this.isVisibilidadCeldaActualizarTransaccionConta=false;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
			this.isVisibilidadCeldaCancelarTransaccionConta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransaccionConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
			this.isVisibilidadCeldaModificarTransaccionConta=true;
			this.isVisibilidadCeldaActualizarTransaccionConta=false;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
			this.isVisibilidadCeldaCancelarTransaccionConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionConta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransaccionContaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransaccionConta=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=true;
		} else {
			this.actualizarEstadoPanelsTransaccionConta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransaccionConta=false;
			//this.isVisibilidadCeldaVerFormTransaccionConta=false;
			this.isVisibilidadCeldaDuplicarTransaccionConta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transaccioncontaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
		} else {
			this.isVisibilidadCeldaNuevoTransaccionConta=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			if(!transaccioncontaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;												
			}
			
			this.jButtonCerrarTransaccionConta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionConta=false;
		}
		
		if(!this.permiteMantenimiento(this.transaccionconta)) {
			this.isVisibilidadCeldaActualizarTransaccionConta=false;
			this.isVisibilidadCeldaEliminarTransaccionConta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionConta() {
		this.isVisibilidadCeldaNuevoTransaccionConta=false;
		this.isVisibilidadCeldaGuardarCambiosTransaccionConta=false;
	}
	
	public void actualizarEstadoPanelsTransaccionConta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransaccionConta!=null) {
				this.jScrollPanelDatosEdicionTransaccionConta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionConta!=null) {
				this.jScrollPanelDatosTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionConta!=null) {
				this.jPanelPaginacionTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransaccionConta!=null) {
				this.jScrollPanelDatosEdicionTransaccionConta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransaccionConta!=null) {
				this.jScrollPanelDatosTransaccionConta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionConta!=null) {
				this.jPanelPaginacionTransaccionConta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransaccionConta!=null) {
				this.jScrollPanelDatosEdicionTransaccionConta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionConta!=null) {
				this.jScrollPanelDatosTransaccionConta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionConta!=null) {
				this.jPanelPaginacionTransaccionConta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransaccionConta!=null) {
				this.jScrollPanelDatosEdicionTransaccionConta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionConta!=null) {
				this.jScrollPanelDatosTransaccionConta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionConta!=null) {
				this.jPanelPaginacionTransaccionConta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransaccionConta!=null) {
				this.jScrollPanelDatosEdicionTransaccionConta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionConta!=null) {
				this.jScrollPanelDatosTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionConta!=null) {
				this.jPanelPaginacionTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransaccionConta!=null) {
				this.jScrollPanelDatosEdicionTransaccionConta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionConta!=null) {
				this.jScrollPanelDatosTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionConta!=null) {
				this.jPanelPaginacionTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransaccionConta!=null) {
				this.jScrollPanelDatosEdicionTransaccionConta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionConta!=null) {
				this.jScrollPanelDatosTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionConta!=null) {
				this.jPanelPaginacionTransaccionConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
					this.jTabbedPaneBusquedasTransaccionConta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionConta!=null) {
				this.jTabbedPaneBusquedasTransaccionConta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransaccionConta!=null) {
				this.jPanelParametrosReportesTransaccionConta.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTransaccionContaParaTransaccionLocales() throws Exception {
		Boolean isPaginaPopupTransaccionLocal=false;

		try {

			if(this.transaccioncontaSessionBean==null) {
				this.transaccioncontaSessionBean=new TransaccionContaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean==null) {
				this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
			}

			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean.setsPathNavegacionActual(transaccioncontaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccionLocal=this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal(true);
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal(TransaccionContaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTransaccionConta(true);
			this.jInternalFrameDetalleFormTransaccionConta.transaccionlocalSessionBean.setlidTransaccionContaActual(this.idTransaccionContaActual);

			transaccioncontaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTransaccionConta(true);
			transaccioncontaSessionBean.setlIdTransaccionContaActualForeignKey(this.idTransaccionContaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TransaccionContaSessionBean transaccioncontaSessionBean=new TransaccionContaSessionBean();
		
		if(this.transaccioncontaSessionBean==null) {
			this.transaccioncontaSessionBean=new TransaccionContaSessionBean();
		}
		
		this.transaccioncontaSessionBean.setsUltimaBusquedaTransaccionConta(this.getsAccionBusqueda());
		this.transaccioncontaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.transaccioncontaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			transaccioncontaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			transaccioncontaSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			transaccioncontaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TransaccionContaSessionBean transaccioncontaSessionBean=new TransaccionContaSessionBean();
		
		if(this.transaccioncontaSessionBean==null) {
			this.transaccioncontaSessionBean=new TransaccionContaSessionBean();
		}
		
		if(this.transaccioncontaSessionBean.getsUltimaBusquedaTransaccionConta()!=null&&!this.transaccioncontaSessionBean.getsUltimaBusquedaTransaccionConta().equals("")) {
			this.setsAccionBusqueda(transaccioncontaSessionBean.getsUltimaBusquedaTransaccionConta());
			this.setiNumeroPaginacion(transaccioncontaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(transaccioncontaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(transaccioncontaSessionBean.getcodigo());
				transaccioncontaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(transaccioncontaSessionBean.getid());
				transaccioncontaSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(transaccioncontaSessionBean.getnombre());
				transaccioncontaSessionBean.setnombre("");
			}
		}
		
		this.transaccioncontaSessionBean.setsUltimaBusquedaTransaccionConta("");
		this.transaccioncontaSessionBean.setiNumeroPaginacion(TransaccionContaConstantesFunciones.INUMEROPAGINACION);
		this.transaccioncontaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransaccionConta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransaccionConta() {
		this.updateBorderResaltarBusquedasFormularioTransaccionConta();
		this.updateVisibilidadBusquedasFormularioTransaccionConta();
		this.updateHabilitarBusquedasFormularioTransaccionConta();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransaccionConta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransaccionConta.getComponents().length>0) {
	

		if(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorCodigoTransaccionConta!=null) {
			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccionConta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
				jPanel.setBorder(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorCodigoTransaccionConta);
			}
		}

		if(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorIdTransaccionConta!=null) {
			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorIdTransaccionConta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
				jPanel.setBorder(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorIdTransaccionConta);
			}
		}

		if(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorNombreTransaccionConta!=null) {
			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionConta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
				jPanel.setBorder(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorNombreTransaccionConta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransaccionConta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransaccionConta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccionConta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccioncontaConstantesFunciones.mostrarBusquedaPorCodigoTransaccionConta);
			if(!this.transaccioncontaConstantesFunciones.mostrarBusquedaPorCodigoTransaccionConta && index>-1) {
				this.jTabbedPaneBusquedasTransaccionConta.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorIdTransaccionConta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccioncontaConstantesFunciones.mostrarBusquedaPorIdTransaccionConta);
			if(!this.transaccioncontaConstantesFunciones.mostrarBusquedaPorIdTransaccionConta && index>-1) {
				this.jTabbedPaneBusquedasTransaccionConta.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionConta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccioncontaConstantesFunciones.mostrarBusquedaPorNombreTransaccionConta);
			if(!this.transaccioncontaConstantesFunciones.mostrarBusquedaPorNombreTransaccionConta && index>-1) {
				this.jTabbedPaneBusquedasTransaccionConta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransaccionConta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransaccionConta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccionConta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccioncontaConstantesFunciones.activarBusquedaPorCodigoTransaccionConta);
				this.jTabbedPaneBusquedasTransaccionConta.setEnabledAt(index,this.transaccioncontaConstantesFunciones.activarBusquedaPorCodigoTransaccionConta);
			}

			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorIdTransaccionConta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccioncontaConstantesFunciones.activarBusquedaPorIdTransaccionConta);
				this.jTabbedPaneBusquedasTransaccionConta.setEnabledAt(index,this.transaccioncontaConstantesFunciones.activarBusquedaPorIdTransaccionConta);
			}

			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionConta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccioncontaConstantesFunciones.activarBusquedaPorNombreTransaccionConta);
				this.jTabbedPaneBusquedasTransaccionConta.setEnabledAt(index,this.transaccioncontaConstantesFunciones.activarBusquedaPorNombreTransaccionConta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransaccionConta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccionConta);

			this.jTabbedPaneBusquedasTransaccionConta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);

			this.transaccioncontaConstantesFunciones.setResaltarBusquedaPorCodigoTransaccionConta(resaltar);

			jPanel.setBorder(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorCodigoTransaccionConta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorIdTransaccionConta);

			this.jTabbedPaneBusquedasTransaccionConta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);

			this.transaccioncontaConstantesFunciones.setResaltarBusquedaPorIdTransaccionConta(resaltar);

			jPanel.setBorder(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorIdTransaccionConta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTransaccionConta.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionConta);

			this.jTabbedPaneBusquedasTransaccionConta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionConta.getComponent(index);

			this.transaccioncontaConstantesFunciones.setResaltarBusquedaPorNombreTransaccionConta(resaltar);

			jPanel.setBorder(this.transaccioncontaConstantesFunciones.resaltarBusquedaPorNombreTransaccionConta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransaccionConta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransaccionConta() throws Exception {

		if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransaccionConta();
		this.updateVisibilidadResaltarControlesFormularioTransaccionConta();
		this.updateHabilitarResaltarControlesFormularioTransaccionConta();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransaccionConta() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transaccioncontaConstantesFunciones.resaltaridTransaccionConta!=null && this.jInternalFrameDetalleFormTransaccionConta!=null) {this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.setBorder(this.transaccioncontaConstantesFunciones.resaltaridTransaccionConta);}
		if(this.transaccioncontaConstantesFunciones.resaltarcodigoTransaccionConta!=null && this.jInternalFrameDetalleFormTransaccionConta!=null) {this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.setBorder(this.transaccioncontaConstantesFunciones.resaltarcodigoTransaccionConta);}
		if(this.transaccioncontaConstantesFunciones.resaltarnombreTransaccionConta!=null && this.jInternalFrameDetalleFormTransaccionConta!=null) {this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.setBorder(this.transaccioncontaConstantesFunciones.resaltarnombreTransaccionConta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransaccionConta() throws Exception {		
		if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
	
		//this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.setVisible(this.transaccioncontaConstantesFunciones.mostraridTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.jPanelidTransaccionConta.setVisible(this.transaccioncontaConstantesFunciones.mostraridTransaccionConta);
		//this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.setVisible(this.transaccioncontaConstantesFunciones.mostrarcodigoTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.jPanelcodigoTransaccionConta.setVisible(this.transaccioncontaConstantesFunciones.mostrarcodigoTransaccionConta);
		//this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.setVisible(this.transaccioncontaConstantesFunciones.mostrarnombreTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.jPanelnombreTransaccionConta.setVisible(this.transaccioncontaConstantesFunciones.mostrarnombreTransaccionConta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransaccionConta() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionConta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionConta!=null) {
	
		this.jInternalFrameDetalleFormTransaccionConta.jTextFieldidTransaccionConta.setEnabled(this.transaccioncontaConstantesFunciones.activaridTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.jTextFieldcodigoTransaccionConta.setEnabled(this.transaccioncontaConstantesFunciones.activarcodigoTransaccionConta);
		this.jInternalFrameDetalleFormTransaccionConta.jTextAreanombreTransaccionConta.setEnabled(this.transaccioncontaConstantesFunciones.activarnombreTransaccionConta);
		}
	}
	
		
}