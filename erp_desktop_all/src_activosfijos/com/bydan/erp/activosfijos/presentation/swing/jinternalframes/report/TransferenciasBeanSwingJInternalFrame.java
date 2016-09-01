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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.activosfijos.util.TransferenciasConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.TransferenciasParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.TransferenciasParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.TransferenciasBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransferenciasBeanSwingJInternalFrame extends TransferenciasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransferenciasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Transferencias> transferenciasValidator = new ClassValidator<Transferencias>(Transferencias.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Transferencias transferencias;	
	public Transferencias transferenciasAux;
	public Transferencias transferenciasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Transferencias transferenciasTotales;
	public Long idTransferenciasActual;
	public Long iIdNuevoTransferencias=0L;
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
	
	public Boolean isPermisoTodoTransferencias;
	public Boolean isPermisoNuevoTransferencias;
	public Boolean isPermisoActualizarTransferencias;
	public Boolean isPermisoActualizarOriginalTransferencias;
	public Boolean isPermisoEliminarTransferencias;
	public Boolean isPermisoGuardarCambiosTransferencias;
	public Boolean isPermisoConsultaTransferencias;
	public Boolean isPermisoBusquedaTransferencias;
	public Boolean isPermisoReporteTransferencias;
	public Boolean isPermisoPaginacionMedioTransferencias;
	public Boolean isPermisoPaginacionAltoTransferencias;
	public Boolean isPermisoPaginacionTodoTransferencias;
	public Boolean isPermisoCopiarTransferencias;
	public Boolean isPermisoVerFormTransferencias;
	public Boolean isPermisoDuplicarTransferencias;
	public Boolean isPermisoOrdenTransferencias;
	
	
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
	
	public TransferenciasParameterReturnGeneral transferenciasReturnGeneral;
	public TransferenciasParameterReturnGeneral transferenciasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransferencias=false;
	public Boolean esParaAccionDesdeFormularioTransferencias=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransferenciasSessionBeanAdditional transferenciasSessionBeanAdditional=null;
	
	public TransferenciasSessionBeanAdditional getTransferenciasSessionBeanAdditional() {
		return this.transferenciasSessionBeanAdditional;
	}
	
	public void setTransferenciasSessionBeanAdditional(TransferenciasSessionBeanAdditional transferenciasSessionBeanAdditional) {
		try {
			this.transferenciasSessionBeanAdditional=transferenciasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransferenciasBeanSwingJInternalFrameAdditional transferenciasBeanSwingJInternalFrameAdditional=null;
	//public class TransferenciasBeanSwingJInternalFrame
	
	public TransferenciasBeanSwingJInternalFrameAdditional getTransferenciasBeanSwingJInternalFrameAdditional() {
		return this.transferenciasBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransferenciasBeanSwingJInternalFrameAdditional(TransferenciasBeanSwingJInternalFrameAdditional transferenciasBeanSwingJInternalFrameAdditional) {
		try {
			this.transferenciasBeanSwingJInternalFrameAdditional=transferenciasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransferenciasLogic transferenciasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Transferencias transferenciasBean;
	public TransferenciasConstantesFunciones transferenciasConstantesFunciones;
	//public TransferenciasParameterReturnGeneral transferenciasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Transferencias> transferenciass;	
	//public List<Transferencias> transferenciassEliminados;
	//public List<Transferencias> transferenciassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransferencias=false;
	public Boolean isVisibilidadCeldaDuplicarTransferencias=true;
	public Boolean isVisibilidadCeldaCopiarTransferencias=true;
	public Boolean isVisibilidadCeldaVerFormTransferencias=true;
	public Boolean isVisibilidadCeldaOrdenTransferencias=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransferencias=false;
	public Boolean isVisibilidadCeldaModificarTransferencias=false;
	public Boolean isVisibilidadCeldaActualizarTransferencias=false;
	public Boolean isVisibilidadCeldaEliminarTransferencias=false;
	public Boolean isVisibilidadCeldaCancelarTransferencias=false;
	public Boolean isVisibilidadCeldaGuardarTransferencias=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransferencias=false;	
	
	
	public Boolean isVisibilidadBusquedaTransferencias=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTransferencias() {
		return this.iIdNuevoTransferencias;
	}

	public void setiIdNuevoTransferencias(Long iIdNuevoTransferencias) {
		this.iIdNuevoTransferencias = iIdNuevoTransferencias;
	}
	
	public Long getidTransferenciasActual() {
		return this.idTransferenciasActual;
	}

	public void setidTransferenciasActual(Long idTransferenciasActual) {
		this.idTransferenciasActual = idTransferenciasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Transferencias gettransferencias() {
		return this.transferencias;
	}

	public void settransferencias(Transferencias transferencias) {
		this.transferencias = transferencias;
	}
	
	public Transferencias gettransferenciasAux() {
		return this.transferenciasAux;
	}

	public void settransferenciasAux(Transferencias transferenciasAux) {
		this.transferenciasAux = transferenciasAux;
	}				
	
	public Transferencias gettransferenciasAnterior() {
		return this.transferenciasAnterior;
	}

	public void settransferenciasAnterior(Transferencias transferenciasAnterior) {
		this.transferenciasAnterior = transferenciasAnterior;
	}	
	
	public Transferencias gettransferenciasTotales() {
		return this.transferenciasTotales;
	}

	public void settransferenciasTotales(Transferencias transferenciasTotales) {
		this.transferenciasTotales = transferenciasTotales;
	}	
	
	public Transferencias gettransferenciasBean() {
		return this.transferenciasBean;
	}

	public void settransferenciasBean(Transferencias transferenciasBean) {
		this.transferenciasBean = transferenciasBean;
	}	
	
	public TransferenciasParameterReturnGeneral gettransferenciasReturnGeneral() {
		return this.transferenciasReturnGeneral;
	}

	public void settransferenciasReturnGeneral(TransferenciasParameterReturnGeneral transferenciasReturnGeneral) {
		this.transferenciasReturnGeneral = transferenciasReturnGeneral;
	}	
	
	
	public Long idBusquedaTransferencias=0L;

	public Long getidBusquedaTransferencias() {
		return this.idBusquedaTransferencias;
	}

	public void setidBusquedaTransferencias(Long idBusquedaTransferencias) {
		this.idBusquedaTransferencias = idBusquedaTransferencias;
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
	
	
	public TransferenciasLogic getTransferenciasLogic()	{		
		return transferenciasLogic;
	}

	public void setTransferenciasLogic(TransferenciasLogic transferenciasLogic) {
		this.transferenciasLogic = transferenciasLogic;
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
	
	public Boolean getIsEsNuevoTransferencias() {
		return isEsNuevoTransferencias;
	}

	public void setIsEsNuevoTransferencias(Boolean isEsNuevoTransferencias) {
		this.isEsNuevoTransferencias = isEsNuevoTransferencias;
	}

	public Boolean getEsParaAccionDesdeFormularioTransferencias() {
		return esParaAccionDesdeFormularioTransferencias;
	}
	
	public void setEsParaAccionDesdeFormularioTransferencias(Boolean esParaAccionDesdeFormularioTransferencias) {
		this.esParaAccionDesdeFormularioTransferencias = esParaAccionDesdeFormularioTransferencias;
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

			if(this.transferenciasSessionBean==null) {
				this.transferenciasSessionBean=new TransferenciasSessionBean();
			}

			if(!this.transferenciasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(transferenciasSessionBean.getlidEmpresaActual());
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

					if(this.transferencias!=null) {
						this.transferencias.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransferencias!=null) {
						this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransferencias.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransferencias!=null) {
						if(this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransferenciasGenerico)throws Exception
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
				jComboBoxid_empresaTransferenciasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransferenciasGenerico!=null && jComboBoxid_empresaTransferenciasGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransferenciasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Transferencias transferencias,JComboBox jComboBoxid_empresaTransferenciasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransferenciasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransferenciasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transferencias.setid_empresa(empresaAux.getId());
				transferencias.setempresa_descripcion(TransferenciasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transferencias.setEmpresa(empresaAux);			}
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

					if(!TransferenciasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferencias!=null) { 
							this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferencias!=null) { 
					}

					if(!TransferenciasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTransferencias!=null) {
							this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferencias!=null) {
							this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTransferencias() throws Exception {
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
		
	public TransferenciasParameterReturnGeneral getTransferenciasParameterGeneral() {
		return this.transferenciasParameterGeneral;
	}
	
	public void setTransferenciasParameterGeneral(TransferenciasParameterReturnGeneral transferenciasParameterGeneral) {
		this.transferenciasParameterGeneral = transferenciasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransferencias() {
		return isPermisoTodoTransferencias;
	}

	public void setIsPermisoTodoTransferencias(Boolean isPermisoTodoTransferencias) {
		this.isPermisoTodoTransferencias = isPermisoTodoTransferencias;
	}

	public Boolean getIsPermisoNuevoTransferencias() {
		return isPermisoNuevoTransferencias;
	}

	public void setIsPermisoNuevoTransferencias(Boolean isPermisoNuevoTransferencias) {
		this.isPermisoNuevoTransferencias = isPermisoNuevoTransferencias;
	}

	public Boolean getIsPermisoActualizarTransferencias() {
		return isPermisoActualizarTransferencias;
	}

	public void setIsPermisoActualizarTransferencias(Boolean isPermisoActualizarTransferencias) {
		this.isPermisoActualizarTransferencias = isPermisoActualizarTransferencias;
	}

	public Boolean getIsPermisoEliminarTransferencias() {
		return isPermisoEliminarTransferencias;
	}

	public void setIsPermisoEliminarTransferencias(Boolean isPermisoEliminarTransferencias) {
		this.isPermisoEliminarTransferencias = isPermisoEliminarTransferencias;
	}

	public Boolean getIsPermisoGuardarCambiosTransferencias() {
		return isPermisoGuardarCambiosTransferencias;
	}

	public void setIsPermisoGuardarCambiosTransferencias(Boolean isPermisoGuardarCambiosTransferencias) {
		this.isPermisoGuardarCambiosTransferencias = isPermisoGuardarCambiosTransferencias;
	}
	
	public Boolean getIsPermisoConsultaTransferencias() {
		return isPermisoConsultaTransferencias;
	}

	public void setIsPermisoConsultaTransferencias(Boolean isPermisoConsultaTransferencias) {
		this.isPermisoConsultaTransferencias = isPermisoConsultaTransferencias;
	}

	public Boolean getIsPermisoBusquedaTransferencias() {
		return isPermisoBusquedaTransferencias;
	}

	public void setIsPermisoBusquedaTransferencias(Boolean isPermisoBusquedaTransferencias) {
		this.isPermisoBusquedaTransferencias = isPermisoBusquedaTransferencias;
	}

	public Boolean getIsPermisoReporteTransferencias() {
		return isPermisoReporteTransferencias;
	}

	public void setIsPermisoReporteTransferencias(Boolean isPermisoReporteTransferencias) {
		this.isPermisoReporteTransferencias = isPermisoReporteTransferencias;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransferencias() {
		return isPermisoPaginacionMedioTransferencias;
	}

	public void setIsPermisoPaginacionMedioTransferencias(Boolean isPermisoPaginacionMedioTransferencias) {
		this.isPermisoPaginacionMedioTransferencias = isPermisoPaginacionMedioTransferencias;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransferencias() {
		return isPermisoPaginacionTodoTransferencias;
	}

	public void setIsPermisoPaginacionTodoTransferencias(Boolean isPermisoPaginacionTodoTransferencias) {
		this.isPermisoPaginacionTodoTransferencias = isPermisoPaginacionTodoTransferencias;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransferencias() {
		return isPermisoPaginacionAltoTransferencias;
	}

	public void setIsPermisoPaginacionAltoTransferencias(Boolean isPermisoPaginacionAltoTransferencias) {
		this.isPermisoPaginacionAltoTransferencias = isPermisoPaginacionAltoTransferencias;
	}
	
	public Boolean getIsPermisoCopiarTransferencias() {
		return isPermisoCopiarTransferencias;
	}

	public void setIsPermisoCopiarTransferencias(Boolean isPermisoCopiarTransferencias) {
		this.isPermisoCopiarTransferencias = isPermisoCopiarTransferencias;
	}
	
	public Boolean getIsPermisoVerFormTransferencias() {
		return isPermisoVerFormTransferencias;
	}

	public void setIsPermisoVerFormTransferencias(Boolean isPermisoVerFormTransferencias) {
		this.isPermisoVerFormTransferencias = isPermisoVerFormTransferencias;
	}
	
	public Boolean getIsPermisoDuplicarTransferencias() {
		return isPermisoDuplicarTransferencias;
	}

	public void setIsPermisoDuplicarTransferencias(Boolean isPermisoDuplicarTransferencias) {
		this.isPermisoDuplicarTransferencias = isPermisoDuplicarTransferencias;
	}
	
	public Boolean getIsPermisoOrdenTransferencias() {
		return isPermisoOrdenTransferencias;
	}

	public void setIsPermisoOrdenTransferencias(Boolean isPermisoOrdenTransferencias) {
		this.isPermisoOrdenTransferencias = isPermisoOrdenTransferencias;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransferencias() {
		return isVisibilidadCeldaNuevoTransferencias;
	}

	public void setIsVisibilidadCeldaNuevoTransferencias(Boolean isVisibilidadCeldaNuevoTransferencias) {
		this.isVisibilidadCeldaNuevoTransferencias = isVisibilidadCeldaNuevoTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransferencias() {
		return isVisibilidadCeldaDuplicarTransferencias;
	}

	public void setIsVisibilidadCeldaDuplicarTransferencias(Boolean isVisibilidadCeldaDuplicarTransferencias) {
		this.isVisibilidadCeldaDuplicarTransferencias = isVisibilidadCeldaDuplicarTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransferencias() {
		return isVisibilidadCeldaCopiarTransferencias;
	}

	public void setIsVisibilidadCeldaCopiarTransferencias(Boolean isVisibilidadCeldaCopiarTransferencias) {
		this.isVisibilidadCeldaCopiarTransferencias = isVisibilidadCeldaCopiarTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransferencias() {
		return isVisibilidadCeldaVerFormTransferencias;
	}

	public void setIsVisibilidadCeldaVerFormTransferencias(Boolean isVisibilidadCeldaVerFormTransferencias) {
		this.isVisibilidadCeldaVerFormTransferencias = isVisibilidadCeldaVerFormTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransferencias() {
		return isVisibilidadCeldaOrdenTransferencias;
	}

	public void setIsVisibilidadCeldaOrdenTransferencias(Boolean isVisibilidadCeldaOrdenTransferencias) {
		this.isVisibilidadCeldaOrdenTransferencias = isVisibilidadCeldaOrdenTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransferencias() {
		return isVisibilidadCeldaNuevoRelacionesTransferencias;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransferencias(Boolean isVisibilidadCeldaNuevoRelacionesTransferencias) {
		this.isVisibilidadCeldaNuevoRelacionesTransferencias = isVisibilidadCeldaNuevoRelacionesTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransferencias() {
		return isVisibilidadCeldaModificarTransferencias;
	}

	public void setIsVisibilidadCeldaModificarTransferencias(Boolean isVisibilidadCeldaModificarTransferencias) {
		this.isVisibilidadCeldaModificarTransferencias = isVisibilidadCeldaModificarTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransferencias() {
		return isVisibilidadCeldaActualizarTransferencias;
	}

	public void setIsVisibilidadCeldaActualizarTransferencias(Boolean isVisibilidadCeldaActualizarTransferencias) {
		this.isVisibilidadCeldaActualizarTransferencias = isVisibilidadCeldaActualizarTransferencias;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransferencias() {
		return isVisibilidadCeldaEliminarTransferencias;
	}

	public void setIsVisibilidadCeldaEliminarTransferencias(Boolean isVisibilidadCeldaEliminarTransferencias) {
		this.isVisibilidadCeldaEliminarTransferencias = isVisibilidadCeldaEliminarTransferencias;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransferencias() {
		return isVisibilidadCeldaCancelarTransferencias;
	}

	public void setIsVisibilidadCeldaCancelarTransferencias(Boolean isVisibilidadCeldaCancelarTransferencias) {
		this.isVisibilidadCeldaCancelarTransferencias = isVisibilidadCeldaCancelarTransferencias;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransferencias() {
		return isVisibilidadCeldaGuardarTransferencias;
	}

	public void setIsVisibilidadCeldaGuardarTransferencias(Boolean isVisibilidadCeldaGuardarTransferencias) {
		this.isVisibilidadCeldaGuardarTransferencias = isVisibilidadCeldaGuardarTransferencias;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransferencias() {
		return isVisibilidadCeldaGuardarCambiosTransferencias;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransferencias(Boolean isVisibilidadCeldaGuardarCambiosTransferencias) {
		this.isVisibilidadCeldaGuardarCambiosTransferencias = isVisibilidadCeldaGuardarCambiosTransferencias;
	}
		
	public TransferenciasSessionBean gettransferenciasSessionBean() {
		return this.transferenciasSessionBean;
	}
	
	public void settransferenciasSessionBean(TransferenciasSessionBean transferenciasSessionBean) {
		this.transferenciasSessionBean=transferenciasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaTransferencias() {
		return this.isVisibilidadBusquedaTransferencias;
	}

	public void setisVisibilidadBusquedaTransferencias(Boolean isVisibilidadBusquedaTransferencias) {
		this.isVisibilidadBusquedaTransferencias=isVisibilidadBusquedaTransferencias;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransferencias(Transferencias transferencias)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transferencias,null);
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
	
	public void bugActualizarReferenciaActual(Transferencias transferencias,Transferencias transferenciasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransferencias(transferencias);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transferenciasAux.setId(transferencias.getId());
		transferenciasAux.setVersionRow(transferencias.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(Transferencias transferenciasLocal) throws Exception {
		
		if(this.transferenciasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Transferencias transferenciasLocal) throws Exception {	
		if(this.transferenciasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transferenciasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransferenciasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transferenciasValidator.getInvalidValues(this.transferencias);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Transferencias transferencias,List<Transferencias> transferenciass) throws Exception {
	}		
	
	public void actualizarSelectedLista(Transferencias transferencias,List<Transferencias> transferenciass) throws Exception {
		try	{			
			TransferenciasConstantesFunciones.actualizarSelectedLista(transferencias,transferenciass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Transferencias> transferenciassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transferenciassLocal=this.transferenciasLogic.getTransferenciass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transferenciassLocal=this.transferenciass;
			}
			//ARCHITECTURE
		
			for(Transferencias transferenciasLocal:transferenciassLocal) {
				if(this.permiteMantenimiento(transferenciasLocal) && transferenciasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransferenciasConstantesFunciones.getTransferenciasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.EMPRESAORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelempresa_origenTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.SUCURSALORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsucursal_origenTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.SUBGRUPOORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsub_grupo_origenTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.GRUPOORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelgrupo_origenTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.ACTIVOORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelactivo_origenTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.EMPRESADESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelempresa_destinoTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.SUCURSALDESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsucursal_destinoTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.SUBGRUPODESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsub_grupo_destinoTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.GRUPODESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelgrupo_destinoTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.ACTIVODESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelactivo_destinoTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsecuencialTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelfechaTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelnumero_documentoTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelcostoTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.DEPRECIACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeldepreciacionTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.COSTOORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelcosto_origenTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.DEPRECIACIONORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeldepreciacion_origenTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.RAZON)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelrazonTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeldescripcionTransferencias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeltipoTransferencias,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelempresa_origenTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelsucursal_origenTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelsub_grupo_origenTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelgrupo_origenTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelactivo_origenTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelempresa_destinoTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelsucursal_destinoTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelsub_grupo_destinoTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelgrupo_destinoTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelactivo_destinoTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelsecuencialTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelfechaTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelnumero_documentoTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelcostoTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabeldepreciacionTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelcosto_origenTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabeldepreciacion_origenTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabelrazonTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabeldescripcionTransferencias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferencias.jLabeltipoTransferencias,"");
		
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
		this.iIdNuevoTransferencias--;	
		
		
		this.transferenciasAux=new Transferencias();
		
		this.transferenciasAux.setId(this.iIdNuevoTransferencias);
		this.transferenciasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transferenciasLogic.getTransferenciass().add(this.transferenciasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transferenciass.add(this.transferenciasAux);
		}
		//ARCHITECTURE
		
		this.transferencias=this.transferenciasAux;
		
		if(TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransferencias(this.transferencias);
			this.setVariablesObjetoActualToFormularioForeignKeyTransferencias(this.transferencias);
		}
				
		//this.setDefaultControlesTransferencias();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransferencias();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransferencias();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransferencias();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransferencias(this.transferenciasBean,this.transferencias,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransferencias(this.transferenciasReturnGeneral,this.transferenciasBean,false);
		
		if(this.transferenciasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransferencias(this.transferenciasReturnGeneral.getTransferencias());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransferencias(this.transferenciasReturnGeneral.getTransferencias());
		}
		
		if(this.transferenciasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransferencias(this.transferenciasReturnGeneral.getTransferencias(),classes);//this.transferenciasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransferencias();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransferencias();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransferenciasBeanSwingJInternalFrameAdditional.RecargarFormTransferencias(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransferencias(false);
						
			if(transferenciasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransferencias();
			}
			
			this.actualizarVisualTableDatosTransferencias();
			
			this.jTableDatosTransferencias.setRowSelectionInterval(this.getIndiceNuevoTransferencias(), this.getIndiceNuevoTransferencias());
			
			this.seleccionarFilaTablaTransferenciasActual();
						
			this.actualizarEstadoCeldasBotonesTransferencias("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransferencias(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarempresa_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarsucursal_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarsub_grupo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activargrupo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activaractivo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarempresa_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarsucursal_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarsub_grupo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activargrupo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activaractivo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarsecuencialTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarfechaTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarnumero_documentoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarcostoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activardepreciacionTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarcosto_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activardepreciacion_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarrazonTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activardescripcionTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activartipoTransferencias);	
		//
		this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setEnabled(isHabilitar && this.transferenciasConstantesFunciones.activarid_empresaTransferencias);
	};
	
	public void setDefaultControlesTransferencias() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransferencias(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transferenciasSessionBean.setConGuardarRelaciones(true);			
			this.transferenciasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.setVisible(true);
			
					
		} else {
			//this.transferenciasSessionBean.setConGuardarRelaciones(false);			
			this.transferenciasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransferencias() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
				if(transferenciasAux.getId().equals(this.iIdNuevoTransferencias)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transferencias transferenciasAux:this.transferenciass) {
				if(transferenciasAux.getId().equals(this.iIdNuevoTransferencias)) {
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
	
	public int getIndiceActualTransferencias(Transferencias transferencias,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
				if(transferenciasAux.getId().equals(transferencias.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transferencias transferenciasAux:this.transferenciass) {
				if(transferenciasAux.getId().equals(transferencias.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransferencias(Transferencias transferenciasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
				if(transferenciasAux.getTransferenciasOriginal().getId().equals(transferenciasOriginal.getId())) {
					existe=true;
					transferenciasOriginal.setId(transferenciasAux.getId());
					transferenciasOriginal.setVersionRow(transferenciasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transferencias transferenciasAux:this.transferenciass) {
				if(transferenciasAux.getTransferenciasOriginal().getId().equals(transferenciasOriginal.getId())) {
					existe=true;
					transferenciasOriginal.setId(transferenciasAux.getId());
					transferenciasOriginal.setVersionRow(transferenciasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransferencias(Boolean esParaCancelar) throws Exception {
		transferenciassAux=new ArrayList<Transferencias>();
		transferenciasAux=new Transferencias();
		
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
					if(transferenciasAux.getId()<0) {
						transferenciassAux.add(transferenciasAux);
					}		
				}
				this.iIdNuevoTransferencias=0L;
				this.transferenciasLogic.getTransferenciass().removeAll(transferenciassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transferencias transferenciasAux:this.transferenciass) {
					if(transferenciasAux.getId()<0) {
						transferenciassAux.add(transferenciasAux);
					}		
				}
				this.iIdNuevoTransferencias=0L;
				this.transferenciass.removeAll(transferenciassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransferencias 
					&& this.transferenciasLogic.getTransferenciass().size()>0
					) {
					transferenciasAux=this.transferenciasLogic.getTransferenciass().get(this.transferenciasLogic.getTransferenciass().size() - 1);
				
					if(transferenciasAux.getId()<0) {
						this.transferenciasLogic.getTransferenciass().remove(transferenciasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransferencias && this.transferenciass.size()>0) {
					transferenciasAux=this.transferenciass.get(this.transferenciass.size() - 1);
				
					if(transferenciasAux.getId()<0) {
						this.transferenciass.remove(transferenciasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransferencias(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transferencias.getId()<0) {
				this.transferenciasLogic.getTransferenciass().remove(this.transferencias);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transferencias.getId()<0) {
				this.transferenciass.remove(this.transferencias);
			}
		}			
	}
	
	public void setEstadosInicialesTransferencias(List<Transferencias> transferenciassAux) throws Exception {
		TransferenciasConstantesFunciones.setEstadosInicialesTransferencias(transferenciassAux);
	}
	
	public void setEstadosInicialesTransferencias(Transferencias transferenciasAux) throws Exception {
		TransferenciasConstantesFunciones.setEstadosInicialesTransferencias(transferenciasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransferenciasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransferencias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransferenciasActual()) {
				if(!this.isEsNuevoTransferencias) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransferencias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransferencias=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransferenciasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transferencias ?", "MANTENIMIENTO DE Transferencias", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransferencias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Transferencias transferencias) throws Exception {
		TransferenciasConstantesFunciones.seleccionarAsignar(this.transferencias,transferencias);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransferencias=this.isPermisoActualizarOriginalTransferencias;
			
			
			this.seleccionarAsignar(transferencias);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesTransferencias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transferenciasSessionBean.setsFuncionBusquedaRapida(this.transferenciasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransferencias) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransferencias(esParaCancelar);				
				this.cancelarNuevoTransferencias(esParaCancelar);								
			}
			
			this.transferencias=new Transferencias();
			
			this.inicializarTransferencias();
			
			this.actualizarEstadoCeldasBotonesTransferencias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransferencias() throws Exception {
		try {
			TransferenciasConstantesFunciones.inicializarTransferencias(this.transferencias);
			
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
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transferenciasLogic.getTransferenciass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransferenciass(String sAccionBusqueda,List<Transferencias> transferenciassParaReportes) throws Exception {
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
					sPathReporteFinal="Transferencias"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransferenciasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransferenciasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Transferencias"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transferenciases");		
		parameters.put("busquedapor", TransferenciasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransferencias=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransferenciasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransferenciasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransferencias=new JRBeanArrayDataSource(TransferenciasJInternalFrame.TraerTransferenciasBeans(transferenciassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransferencias);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransferenciasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransferenciasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransferenciasBean.TraerTransferenciasBeans(transferenciassParaReportes).toArray()));
							
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
				this.generarExcelReporteTransferenciass(sAccionBusqueda,sTipoArchivoReporte,transferenciassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransferenciass(sAccionBusqueda,sTipoArchivoReporte,transferenciassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransferenciasActionPerformed(null);
					//this.generarExcelReporteTransferenciass(sAccionBusqueda,sTipoArchivoReporte,transferenciassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransferenciass(sAccionBusqueda,sTipoArchivoReporte,transferenciassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransferenciass(sAccionBusqueda,sTipoArchivoReporte,transferenciassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransferenciass(sAccionBusqueda,sTipoArchivoReporte,transferenciassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransferenciass(String sAccionBusqueda,String sTipoArchivoReporte,List<Transferencias> transferenciassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferencias";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transferenciass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransferencias("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Transferencias transferencias : transferenciassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransferenciasConstantesFunciones.generarExcelReporteDataTransferencias("NORMAL",row,workbook,transferencias,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransferencias(String sTipo,Row row,Workbook workbook) {
		
		TransferenciasConstantesFunciones.generarExcelReporteHeaderTransferencias(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransferenciass(String sAccionBusqueda,String sTipoArchivoReporte,List<Transferencias> transferenciassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferencias_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transferenciass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Transferencias transferencias : transferenciassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransferenciasConstantesFunciones.getTransferenciasDescripcion(transferencias));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getempresa_origen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getsucursal_origen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getsub_grupo_origen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getgrupo_origen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getactivo_origen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getempresa_destino());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getsucursal_destino());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getsub_grupo_destino());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getgrupo_destino());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getactivo_destino());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_DEPRECIACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DEPRECIACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getdepreciacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_COSTOORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_COSTOORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getcosto_origen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getdepreciacion_origen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_RAZON))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_RAZON);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getrazon());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferencias.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransferenciass(String sAccionBusqueda,String sTipoArchivoReporte,List<Transferencias> transferenciassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Transferencias> transferenciassRespaldo=null;
		
		classes=TransferenciasConstantesFunciones.getClassesRelationshipsOfTransferencias(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transferenciasLogic.setDatosCliente(this.datosCliente);
		this.transferenciasLogic.setDatosDeep(this.datosDeep);
		this.transferenciasLogic.setIsConDeep(true);
		
		transferenciassRespaldo=this.transferenciasLogic.getTransferenciass();
		
		this.transferenciasLogic.setTransferenciass(transferenciassParaReportes);	
		this.transferenciasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transferenciassParaReportes=this.transferenciasLogic.getTransferenciass();
		this.transferenciasLogic.setTransferenciass(transferenciassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferencias_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transferenciass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransferencias("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Transferencias transferencias : transferenciassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransferencias("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransferenciasConstantesFunciones.generarExcelReporteDataTransferencias("NORMAL",row,workbook,transferencias,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransferenciasConstantesFunciones.getTransferenciasDescripcion(transferencias));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransferencias.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransferencias() throws Exception {		
		this.startProcessTransferencias(true);
	}
	
	public void startProcessTransferencias(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransferencias ,this.jPanelParametrosReportesTransferencias, this.jScrollPanelDatosTransferencias,this.jPanelPaginacionTransferencias, this.jScrollPanelDatosEdicionTransferencias, this.jPanelAccionesTransferencias,this.jPanelAccionesFormularioTransferencias,this.jmenuBarTransferencias,this.jmenuBarDetalleTransferencias,this.jTtoolBarTransferencias,this.jTtoolBarDetalleTransferencias);		
		
		final JTabbedPane jTabbedPaneBusquedasTransferencias=this.jTabbedPaneBusquedasTransferencias; 
		
		final JPanel jPanelParametrosReportesTransferencias=this.jPanelParametrosReportesTransferencias;
		//final JScrollPane jScrollPanelDatosTransferencias=this.jScrollPanelDatosTransferencias;
		final JTable jTableDatosTransferencias=this.jTableDatosTransferencias;		
		final JPanel jPanelPaginacionTransferencias=this.jPanelPaginacionTransferencias;
		//final JScrollPane jScrollPanelDatosEdicionTransferencias=this.jScrollPanelDatosEdicionTransferencias;
		final JPanel jPanelAccionesTransferencias=this.jPanelAccionesTransferencias;
		
		JPanel jPanelCamposAuxiliarTransferencias=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransferencias=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
			jPanelCamposAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jPanelCamposTransferencias;
			jPanelAccionesFormularioAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jPanelAccionesFormularioTransferencias;
		}
		
		final JPanel jPanelCamposTransferencias=jPanelCamposAuxiliarTransferencias;
		final JPanel jPanelAccionesFormularioTransferencias=jPanelAccionesFormularioAuxiliarTransferencias;
		
		
		final JMenuBar jmenuBarTransferencias=this.jmenuBarTransferencias;
		final JToolBar jTtoolBarTransferencias=this.jTtoolBarTransferencias;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransferencias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransferencias=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
			jmenuBarDetalleAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jmenuBarDetalleTransferencias;
			jTtoolBarDetalleAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jTtoolBarDetalleTransferencias;
		}
		
		final JMenuBar jmenuBarDetalleTransferencias=jmenuBarDetalleAuxiliarTransferencias;
		final JToolBar jTtoolBarDetalleTransferencias=jTtoolBarDetalleAuxiliarTransferencias;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransferencias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransferencias;
			processRunnable.jTableDatos=jTableDatosTransferencias;
			processRunnable.jPanelCampos=jPanelCamposTransferencias;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransferencias;
			processRunnable.jPanelAcciones=jPanelAccionesTransferencias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransferencias;
			
			
			processRunnable.jmenuBar=jmenuBarTransferencias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransferencias;
			processRunnable.jTtoolBar=jTtoolBarTransferencias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransferencias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransferencias ,jPanelParametrosReportesTransferencias,jTableDatosTransferencias, /*jScrollPanelDatosTransferencias,*/jPanelCamposTransferencias,jPanelPaginacionTransferencias, /*jScrollPanelDatosEdicionTransferencias,*/ jPanelAccionesTransferencias,jPanelAccionesFormularioTransferencias,jmenuBarTransferencias,jmenuBarDetalleTransferencias,jTtoolBarTransferencias,jTtoolBarDetalleTransferencias);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransferencias ,jPanelParametrosReportesTransferencias, jScrollPanelDatosTransferencias,jPanelPaginacionTransferencias, jScrollPanelDatosEdicionTransferencias, jPanelAccionesTransferencias,jPanelAccionesFormularioTransferencias,jmenuBarTransferencias,jmenuBarDetalleTransferencias,jTtoolBarTransferencias,jTtoolBarDetalleTransferencias);
						
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
	
	public void finishProcessTransferencias() {// throws Exception 
		this.finishProcessTransferencias(true);
	}
	
	public void finishProcessTransferencias(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransferencias ,this.jPanelParametrosReportesTransferencias, this.jScrollPanelDatosTransferencias,this.jPanelPaginacionTransferencias, this.jScrollPanelDatosEdicionTransferencias, this.jPanelAccionesTransferencias,this.jPanelAccionesFormularioTransferencias,this.jmenuBarTransferencias,this.jmenuBarDetalleTransferencias,this.jTtoolBarTransferencias,this.jTtoolBarDetalleTransferencias);		
		
		final JTabbedPane jTabbedPaneBusquedasTransferencias=this.jTabbedPaneBusquedasTransferencias; 
		
		final JPanel jPanelParametrosReportesTransferencias=this.jPanelParametrosReportesTransferencias;
		//final JScrollPane jScrollPanelDatosTransferencias=this.jScrollPanelDatosTransferencias;
		final JTable jTableDatosTransferencias=this.jTableDatosTransferencias;		
		final JPanel jPanelPaginacionTransferencias=this.jPanelPaginacionTransferencias;
		//final JScrollPane jScrollPanelDatosEdicionTransferencias=this.jScrollPanelDatosEdicionTransferencias;
		final JPanel jPanelAccionesTransferencias=this.jPanelAccionesTransferencias;
		
		JPanel jPanelCamposAuxiliarTransferencias=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransferencias=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
			jPanelCamposAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jPanelCamposTransferencias;
			jPanelAccionesFormularioAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jPanelAccionesFormularioTransferencias;
		}
		
		final JPanel jPanelCamposTransferencias=jPanelCamposAuxiliarTransferencias;
		final JPanel jPanelAccionesFormularioTransferencias=jPanelAccionesFormularioAuxiliarTransferencias;
		
		
		final JMenuBar jmenuBarTransferencias=this.jmenuBarTransferencias;		
		final JToolBar jTtoolBarTransferencias=this.jTtoolBarTransferencias;
				
		JMenuBar jmenuBarDetalleAuxiliarTransferencias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransferencias=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
			jmenuBarDetalleAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jmenuBarDetalleTransferencias;
			jTtoolBarDetalleAuxiliarTransferencias=this.jInternalFrameDetalleFormTransferencias.jTtoolBarDetalleTransferencias;		
		}
		
		final JMenuBar jmenuBarDetalleTransferencias=jmenuBarDetalleAuxiliarTransferencias;
		final JToolBar jTtoolBarDetalleTransferencias=jTtoolBarDetalleAuxiliarTransferencias;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransferencias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransferencias;
			processRunnable.jTableDatos=jTableDatosTransferencias;
			processRunnable.jPanelCampos=jPanelCamposTransferencias;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransferencias;
			processRunnable.jPanelAcciones=jPanelAccionesTransferencias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransferencias;
			
			
			processRunnable.jmenuBar=jmenuBarTransferencias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransferencias;
			processRunnable.jTtoolBar=jTtoolBarTransferencias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransferencias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransferencias ,jPanelParametrosReportesTransferencias, jTableDatosTransferencias,/*jScrollPanelDatosTransferencias,*/jPanelCamposTransferencias,jPanelPaginacionTransferencias, /*jScrollPanelDatosEdicionTransferencias,*/ jPanelAccionesTransferencias,jPanelAccionesFormularioTransferencias,jmenuBarTransferencias,jmenuBarDetalleTransferencias,jTtoolBarTransferencias,jTtoolBarDetalleTransferencias));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransferencias(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransferencias(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransferencias(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransferencias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransferencias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransferencias,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransferencias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransferencias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransferencias,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transferenciasConstantesFunciones.getsFinalQueryTransferencias();
		String  finalQueryPaginacionTodos=this.transferenciasConstantesFunciones.getsFinalQueryTransferencias();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransferenciasConstantesFunciones.getArrayColumnasGlobalesNoTransferencias(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransferenciasConstantesFunciones.getArrayColumnasGlobalesTransferencias(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransferenciasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transferenciassEliminados= new ArrayList<Transferencias>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransferencias();
		
				///*TransferenciasSessionBean*/this.transferenciasSessionBean=new TransferenciasSessionBean();
			
			if(this.transferenciasSessionBean==null) {
				this.transferenciasSessionBean=new TransferenciasSessionBean();
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
					this.iNumeroPaginacion=TransferenciasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransferenciasConstantesFunciones.getClassesForeignKeysOfTransferencias(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transferencias."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transferenciassAux= new ArrayList<Transferencias>();
			
				
			transferenciasLogic.setDatosCliente(this.datosCliente);
			transferenciasLogic.setDatosDeep(this.datosDeep);
			transferenciasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaTransferencias")) {
				this.sDetalleReporte=TransferenciasConstantesFunciones.getDetalleIndiceBusquedaTransferencias(idBusquedaTransferencias);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transferenciasLogic.getTransferenciassBusquedaTransferencias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaTransferencias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransferenciasConstantesFunciones.getDetalleIndiceBusquedaTransferencias(idBusquedaTransferencias);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransferenciasConstantesFunciones.getDetalleIndiceBusquedaTransferencias(idBusquedaTransferencias);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transferenciasLogic.getTransferenciass()==null||transferenciasLogic.getTransferenciass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transferenciass==null|| transferenciass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciassAux=new ArrayList<Transferencias>();
						transferenciassAux.addAll(transferenciasLogic.getTransferenciass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transferenciassAux=new ArrayList<Transferencias>();
							transferenciassAux.addAll(transferenciass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transferenciasLogic.getTransferenciassBusquedaTransferencias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaTransferencias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransferenciasConstantesFunciones.getDetalleIndiceBusquedaTransferencias(idBusquedaTransferencias);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransferenciasConstantesFunciones.getDetalleIndiceBusquedaTransferencias(idBusquedaTransferencias);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransferenciass("BusquedaTransferencias",transferenciasLogic.getTransferenciass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransferenciass("BusquedaTransferencias",transferenciass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciasLogic.setTransferenciass(new ArrayList<Transferencias>());
						transferenciasLogic.getTransferenciass().addAll(transferenciassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transferenciass=new ArrayList<Transferencias>();
							transferenciass.addAll(transferenciassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransferencias();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransferencias();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transferenciasLogic.getTransferenciass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transferenciass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transferenciasLogic.getTransferenciass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transferenciass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Transferencias transferencias) {
		Boolean permite=true;
		
		if(this.transferencias.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransferenciasConstantesFunciones.getOrderByListaTransferencias();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransferenciasConstantesFunciones.getOrderByListaTransferencias();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transferencias transferencias:transferenciasLogic.getTransferenciass()) {
				if(transferencias.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasTotales=transferencias;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transferencias transferencias:this.transferenciass) {
				if(transferencias.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasTotales=transferencias;
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
			this.transferenciasAux=new Transferencias();
			this.transferenciasAux.setsType(Constantes2.S_TOTALES);
			this.transferenciasAux.setIsNew(false);
			this.transferenciasAux.setIsChanged(false);
			this.transferenciasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//TransferenciasConstantesFunciones.TotalizarValoresFilaTransferencias(this.transferenciasLogic.getTransferenciass(),this.transferenciasAux);
				
				//this.transferenciasLogic.getTransferenciass().add(this.transferenciasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransferenciasConstantesFunciones.TotalizarValoresFilaTransferencias(this.transferenciass,this.transferenciasAux);
				
				this.transferenciass.add(this.transferenciasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transferenciasTotales=new Transferencias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transferenciasLogic.getTransferenciass().remove(transferenciasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transferenciass.remove(transferenciasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transferenciasTotales=new Transferencias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transferencias transferencias:transferenciasLogic.getTransferenciass()) {
				if(transferencias.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasTotales=transferencias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransferenciasConstantesFunciones.TotalizarValoresFilaTransferencias(this.transferenciasLogic.getTransferenciass(),transferenciasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transferencias transferencias:this.transferenciass) {
				if(transferencias.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasTotales=transferencias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransferenciasConstantesFunciones.TotalizarValoresFilaTransferencias(this.transferenciass,transferenciasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransferenciassBusquedaTransferencias()throws Exception {
		try {
			sAccionBusqueda="BusquedaTransferencias";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransferenciassBusquedaTransferencias(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasLogic.getTransferenciassBusquedaTransferencias(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasLogic.getTransferenciassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTransferencias() {
		this.isPermisoTodoTransferencias=false;
		this.isPermisoNuevoTransferencias=false;
		this.isPermisoActualizarTransferencias=false;
		this.isPermisoActualizarOriginalTransferencias=false;
		this.isPermisoEliminarTransferencias=false;
		this.isPermisoGuardarCambiosTransferencias=false;
		this.isPermisoConsultaTransferencias=true;
		this.isPermisoBusquedaTransferencias=true;
		this.isPermisoReporteTransferencias=true;
		this.isPermisoOrdenTransferencias=false;		
		this.isPermisoPaginacionMedioTransferencias=false;		
		this.isPermisoPaginacionAltoTransferencias=false;		
		this.isPermisoPaginacionTodoTransferencias=false;		
		this.isPermisoCopiarTransferencias=false;		
		this.isPermisoVerFormTransferencias=false;		
		this.isPermisoDuplicarTransferencias=false;
		this.isPermisoOrdenTransferencias=false;
	}
	
	public void setPermisosUsuarioTransferencias(Boolean isPermiso) {
		this.isPermisoTodoTransferencias=isPermiso;
		this.isPermisoNuevoTransferencias=isPermiso;
		this.isPermisoActualizarTransferencias=isPermiso;
		this.isPermisoActualizarOriginalTransferencias=isPermiso;
		this.isPermisoEliminarTransferencias=isPermiso;
		this.isPermisoGuardarCambiosTransferencias=isPermiso;
		this.isPermisoConsultaTransferencias=isPermiso;
		this.isPermisoBusquedaTransferencias=isPermiso;
		this.isPermisoReporteTransferencias=isPermiso;
		this.isPermisoOrdenTransferencias=isPermiso;		
		this.isPermisoPaginacionMedioTransferencias=isPermiso;		
		this.isPermisoPaginacionAltoTransferencias=isPermiso;		
		this.isPermisoPaginacionTodoTransferencias=isPermiso;		
		this.isPermisoCopiarTransferencias=isPermiso;		
		this.isPermisoVerFormTransferencias=isPermiso;		
		this.isPermisoDuplicarTransferencias=isPermiso;
		this.isPermisoOrdenTransferencias=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransferencias(Boolean isPermiso) {
		//this.isPermisoTodoTransferencias=isPermiso;
		this.isPermisoNuevoTransferencias=isPermiso;
		this.isPermisoActualizarTransferencias=isPermiso;
		this.isPermisoActualizarOriginalTransferencias=isPermiso;
		this.isPermisoEliminarTransferencias=isPermiso;
		this.isPermisoGuardarCambiosTransferencias=isPermiso;
		//this.isPermisoConsultaTransferencias=isPermiso;
		//this.isPermisoBusquedaTransferencias=isPermiso;
		//this.isPermisoReporteTransferencias=isPermiso;
		//this.isPermisoOrdenTransferencias=isPermiso;		
		//this.isPermisoPaginacionMedioTransferencias=isPermiso;		
		//this.isPermisoPaginacionAltoTransferencias=isPermiso;		
		//this.isPermisoPaginacionTodoTransferencias=isPermiso;		
		//this.isPermisoCopiarTransferencias=isPermiso;		
		//this.isPermisoDuplicarTransferencias=isPermiso;
		//this.isPermisoOrdenTransferencias=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransferenciasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransferenciasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransferencias(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransferenciasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransferenciasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransferenciasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransferenciasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransferencias() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransferenciasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transferenciasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransferenciasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransferencias=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransferencias=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransferencias=this.isPermisoActualizarTransferencias;
			this.isPermisoEliminarTransferencias=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransferencias=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransferencias=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransferencias=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransferencias=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransferencias=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransferencias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransferencias=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransferencias=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransferencias=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransferencias=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransferencias=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransferencias=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransferencias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transferenciasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransferencias.setToolTipText(this.jTableDatosTransferencias.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransferencias(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransferencias(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransferenciasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransferenciasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransferencias() throws Exception {
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
	public void inicializarCombosForeignKeyTransferenciasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransferenciasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransferenciasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyTransferencias()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transferenciasSessionBean==null) {
				this.transferenciasSessionBean=new TransferenciasSessionBean();
			}

			if(!this.transferenciasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTransferencias()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransferencias(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransferencias()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransferencias();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransferencias(Transferencias transferencias)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransferencias(Transferencias transferencias,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransferencias()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransferencias()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransferencias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransferencias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransferencias()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransferencias()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransferencias(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransferencias()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias!=null && this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TransferenciasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransferenciasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransferenciasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transferenciasSessionBean=new TransferenciasSessionBean(); 
		this.transferenciasConstantesFunciones=new TransferenciasConstantesFunciones(); 
		this.transferenciasBean=new Transferencias();//(this.transferenciasConstantesFunciones); 		
		this.transferenciasReturnGeneral=new TransferenciasParameterReturnGeneral(); 
		
		this.transferenciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransferenciasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransferenciasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransferenciasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransferencias(true);
			
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
			
			this.transferenciasConstantesFunciones=new TransferenciasConstantesFunciones(); 
			this.transferenciasBean=new Transferencias();//this.transferenciasConstantesFunciones); 			
			this.transferenciasReturnGeneral=new TransferenciasParameterReturnGeneral(); 
		
			TransferenciasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transferencias Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.transferencias=new Transferencias();
			this.transferenciass = new ArrayList<Transferencias>();
			this.transferenciassAux = new ArrayList<Transferencias>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic=new TransferenciasLogic();
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			//this.transferenciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transferenciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransferencias);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransferencias);	
					}
					
					if(this.jInternalFrameImportacionTransferencias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransferencias);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransferencias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransferencias);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransferencias!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransferencias);
				this.jInternalFrameDetalleFormTransferencias.setVisible(false);
				this.jInternalFrameDetalleFormTransferencias.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransferencias);
					this.jInternalFrameReporteDinamicoTransferencias.setVisible(false);
					this.jInternalFrameReporteDinamicoTransferencias.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransferencias!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransferencias);
					this.jInternalFrameImportacionTransferencias.setVisible(false);
					this.jInternalFrameImportacionTransferencias.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransferencias!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransferencias);
					this.jInternalFrameOrderByTransferencias.setVisible(false);
					this.jInternalFrameOrderByTransferencias.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransferenciasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransferenciasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transferenciasReturnGeneral=new TransferenciasParameterReturnGeneral();
			
			this.transferenciasParameterGeneral=new TransferenciasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transferenciasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransferenciasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transferenciasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransferenciasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transferenciasSessionBean.getEsGuardarRelacionado(),this.transferenciasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransferenciasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transferenciasSessionBean.getEsGuardarRelacionado(),this.transferenciasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransferencias=false;
			this.isVisibilidadCeldaDuplicarTransferencias=true;
			this.isVisibilidadCeldaCopiarTransferencias=true;
			this.isVisibilidadCeldaVerFormTransferencias=true;
			this.isVisibilidadCeldaOrdenTransferencias=true;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
			this.isVisibilidadCeldaModificarTransferencias=false;
			this.isVisibilidadCeldaActualizarTransferencias=false;
			this.isVisibilidadCeldaEliminarTransferencias=false;
			this.isVisibilidadCeldaCancelarTransferencias=false;
			this.isVisibilidadCeldaGuardarTransferencias=false;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
			
			
			this.isVisibilidadBusquedaTransferencias=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransferencias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransferencias();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransferencias(false);
			
			this.setPermisosUsuarioTransferencias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transferenciasSessionBean.getEsGuardarRelacionado() 
				|| (this.transferenciasSessionBean.getEsGuardarRelacionado() && this.transferenciasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransferenciasClasesRelacionadas();
			}
			
			if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransferenciasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransferenciasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransferencias();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransferencias();
			}
			
			if(!this.isPermisoBusquedaTransferencias) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransferencias.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransferenciasConstantesFunciones.getTiposSeleccionarTransferencias());
				
				this.tiposColumnasSelect=TransferenciasConstantesFunciones.getTiposSeleccionarTransferencias(true);
				
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
			//if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransferencias();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioTransferencias(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioTransferencias(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransferencias() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transferenciasImplementable= (TransferenciasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransferenciasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transferenciasImplementableHome= (TransferenciasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransferenciasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transferenciass= new ArrayList<Transferencias>();
			this.transferenciassEliminados= new ArrayList<Transferencias>();
						
			this.isEsNuevoTransferencias=false;
			this.esParaAccionDesdeFormularioTransferencias=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransferencias(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransferencias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransferenciasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransferenciasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransferencias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransferencias(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransferencias!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransferencias();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransferencias();
			}
			
			TransferenciasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransferencias.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransferencias.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransferencias.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransferencias(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Transferencias: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransferencias() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransferencias")) {
				iIndex=this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransferencias();	
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
	
	public void cargarCombosForeignKeyTransferencias(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransferencias(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransferencias(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransferenciasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransferencias();
		
		this.cargarCombosFrameForeignKeyTransferencias();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransferencias();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransferencias();
		}
	}
	
	
	
	public void jButtonNuevoTransferenciasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
			
			if(jTableDatosTransferencias.getRowCount()>=1) {
				jTableDatosTransferencias.removeRowSelectionInterval(0, jTableDatosTransferencias.getRowCount()-1);						
			}
			
			this.isEsNuevoTransferencias=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransferencias(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransferencias(true);			
			//this.transferencias=new Transferencias();
			//this.transferencias.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransferencias(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferencias() ;
			
			if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransferencias(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transferencias);	
			this.actualizarInformacion("INFO_PADRE",false,this.transferencias);				
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
			if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Transferencias: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransferenciasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransferencias.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransferencias.getSelectedRows().length;			
			}
			
			transferenciassSeleccionados=this.getTransferenciassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransferencias--;			
				//Transferencias transferenciasAux= new Transferencias();			
				//transferenciasAux.setId(this.iIdNuevoTransferencias);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Transferencias transferenciasOrigen=new Transferencias();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Transferencias transferenciasOrigen : transferenciassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transferenciasOrigen =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transferenciasOrigen =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransferencias();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transferencias.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransferencias(transferenciasOrigen,this.transferencias,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transferenciasLogic.getTransferenciass().add(this.transferenciasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transferenciass.add(this.transferenciasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransferencias(false);
				
				this.jTableDatosTransferencias.setRowSelectionInterval(this.getIndiceNuevoTransferencias(), this.getIndiceNuevoTransferencias());
				
				int iLastRow =  this.jTableDatosTransferencias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransferencias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransferencias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransferencias(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();									
		
			Transferencias transferenciasOrigen=new Transferencias();
			Transferencias transferenciasDestino=new Transferencias();
				
			transferenciassSeleccionados=this.getTransferenciassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransferencias.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transferenciassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransferencias.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciasOrigen =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transferenciasOrigen =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciasDestino =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transferenciasDestino =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transferenciasOrigen =transferenciassSeleccionados.get(0);
				transferenciasDestino =transferenciassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransferencias(transferenciasOrigen,transferenciasDestino,true,false);
				
				transferenciasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transferenciasDestino,transferenciasLogic.getTransferenciass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transferenciasDestino,transferenciass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransferencias(false);
				
				//this.jTableDatosTransferencias.setRowSelectionInterval(this.getIndiceNuevoTransferencias(), this.getIndiceNuevoTransferencias());
				
				int iLastRow =  this.jTableDatosTransferencias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransferencias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransferencias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransferencias(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransferencias.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransferencias.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransferencias.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransferencias.setVisible(!isVisible);
			this.jPanelPaginacionTransferencias.setVisible(!isVisible);
			this.jPanelAccionesTransferencias.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransferencias();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransferencias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransferencias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransferencias();
			
			this.abrirFrameOrderByTransferencias();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransferencias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransferencias(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransferencias);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransferencias.isMaximum()) {
					this.jInternalFrameDetalleFormTransferencias.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransferencias.setSize(this.jInternalFrameDetalleFormTransferencias.iWidthFormulario,this.jInternalFrameDetalleFormTransferencias.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransferencias.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransferencias.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransferencias.isMaximum()) {
						this.jInternalFrameDetalleFormTransferencias.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransferencias.jContentPaneDetalleTransferencias.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransferencias.jContentPaneDetalleTransferencias.getWidth(),TransferenciasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransferencias.jContentPaneDetalleTransferencias.getWidth(),TransferenciasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransferencias.jContentPaneDetalleTransferencias.getWidth(),TransferenciasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransferencias.setVisible(true);
	        this.jInternalFrameDetalleFormTransferencias.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransferencias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransferencias==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransferencias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferencias,false,this);
				} else {
					this.jInternalFrameOrderByTransferencias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferencias,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransferencias);
				this.jInternalFrameOrderByTransferencias.setVisible(false);
				this.jInternalFrameOrderByTransferencias.setSelected(false);
				
				this.jInternalFrameOrderByTransferencias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransferencias"));
				
				this.inicializarActualizarBindingTablaOrderByTransferencias();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransferencias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransferencias==null) {
				
				this.jInternalFrameImportacionTransferencias=new ImportacionJInternalFrame(TransferenciasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransferencias);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransferencias);
				this.jInternalFrameImportacionTransferencias.setVisible(false);
				this.jInternalFrameImportacionTransferencias.setSelected(false);


				this.jInternalFrameImportacionTransferencias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransferencias"));
				this.jInternalFrameImportacionTransferencias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransferencias"));
				this.jInternalFrameImportacionTransferencias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransferencias"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransferencias() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransferencias==null) {
				this.jInternalFrameReporteDinamicoTransferencias=new ReporteDinamicoJInternalFrame(TransferenciasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransferencias);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransferencias);
				this.jInternalFrameReporteDinamicoTransferencias.setVisible(false);
				this.jInternalFrameReporteDinamicoTransferencias.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransferencias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransferencias"));
				this.jInternalFrameReporteDinamicoTransferencias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransferencias"));
				this.jInternalFrameReporteDinamicoTransferencias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransferencias"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransferencias();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTransferencias() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransferencias);
			
	       	this.jInternalFrameDetalleFormTransferencias.setVisible(false);
	        this.jInternalFrameDetalleFormTransferencias.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransferencias.dispose();
			//this.jInternalFrameDetalleFormTransferencias=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransferencias() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransferencias.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransferencias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransferencias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransferencias.setVisible(true);
	        this.jInternalFrameImportacionTransferencias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransferencias() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransferencias.setVisible(true);
	        this.jInternalFrameOrderByTransferencias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransferencias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransferencias.setVisible(false);
	        this.jInternalFrameOrderByTransferencias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransferencias() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransferencias.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransferencias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransferencias() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransferencias.setVisible(false);
	        this.jInternalFrameImportacionTransferencias.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransferencias(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransferencias(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransferencias(true);
			//this.isEsNuevoTransferencias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransferencias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransferencias(false) ;
			
			if(transferenciasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransferencias(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferencias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransferenciasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransferencias(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransferencias(true);
			//this.isEsNuevoTransferencias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transferencias.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransferencias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransferencias(false) ;
			
			if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransferencias(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferencias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransferencias(false);
			
			//if(!this.isEsNuevoTransferencias) {								
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				
			}
			
			if(this.permiteMantenimiento(this.transferencias)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransferencias=true;
					this.inicializarActualizarBindingTablaTransferencias(false);
					this.isEsNuevoTransferencias=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransferencias=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransferencias=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransferencias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransferencias(false);
				
				this.habilitarDeshabilitarControlesTransferencias(false);
			
												
				
				if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransferencias();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransferenciasActionPerformed(evt,transferenciasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransferencias(this.transferencias,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransferencias.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transferenciasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transferencias.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransferenciasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				this.transferencias.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				this.transferencias.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transferencias)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransferenciasModel) this.jTableDatosTransferencias.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransferencias=true;
				this.inicializarActualizarBindingTablaTransferencias(false);
				this.isEsNuevoTransferencias=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransferencias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransferencias(false);
				
				this.habilitarDeshabilitarControlesTransferencias(false);
				
				
				
				if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransferencias();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransferenciasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransferencias.getRowCount()>=1) {
				jTableDatosTransferencias.removeRowSelectionInterval(0, jTableDatosTransferencias.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransferencias(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransferencias(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransferencias(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferencias(false) ;
			
			this.isEsNuevoTransferencias=false;
			
			if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransferencias();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransferenciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransferencias(false);
				
				//SI ES MANUAL
				if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransferencias();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransferenciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransferencias--;			
			//Transferencias transferenciasAux= new Transferencias();			
			//transferenciasAux.setId(this.iIdNuevoTransferencias);
			
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransferencias();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
			
			this.transferencias.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transferenciasLogic.getTransferenciass().add(this.transferenciasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transferenciass.add(this.transferenciasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransferencias(false);
			
			this.jTableDatosTransferencias.setRowSelectionInterval(this.getIndiceNuevoTransferencias(), this.getIndiceNuevoTransferencias());
			
			int iLastRow =  this.jTableDatosTransferencias.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransferencias.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransferencias.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransferencias(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransferenciasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransferencias(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferencias(false);
			
			//SI ES MANUAL
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransferencias();
			}
			
			//this.abrirFrameTreeTransferencias();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransferenciasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransferenciasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransferencias.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransferencias.setFileImportacion(this.jInternalFrameImportacionTransferencias.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransferencias.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransferencias.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransferencias.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransferencias.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransferenciasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		

		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransferenciasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransferenciasBaseDesign.jrxml";
			
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
			
			this.generarReporteTransferenciass("Todos",transferenciassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presaOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presaOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presaOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presaOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cursalOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cursalOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cursalOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cursalOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bGrupoOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bGrupoOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bGrupoOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bGrupoOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_upoOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_upoOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_upoOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_upoOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tivoOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tivoOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tivoOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tivoOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presaDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presaDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presaDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presaDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cursalDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cursalDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cursalDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cursalDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bGrupoDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bGrupoDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bGrupoDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bGrupoDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPODESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_upoDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_upoDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_upoDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_upoDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tivoDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tivoDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tivoDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tivoDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_preciacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_preciacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_preciacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_preciacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_COSTOORIGEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_preciacionOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_preciacionOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_preciacionOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_preciacionOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_RAZON:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_zon_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_zon_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_zon_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_zon_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasConstantesFunciones.LABEL_TIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTransferencias.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN:
					sNombreCampoCategoria="empresa_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN:
					sNombreCampoCategoria="sucursal_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN:
					sNombreCampoCategoria="sub_grupo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN:
					sNombreCampoCategoria="grupo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN:
					sNombreCampoCategoria="activo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO:
					sNombreCampoCategoria="empresa_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO:
					sNombreCampoCategoria="sucursal_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO:
					sNombreCampoCategoria="sub_grupo_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPODESTINO:
					sNombreCampoCategoria="grupo_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO:
					sNombreCampoCategoria="activo_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case TransferenciasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACION:
					sNombreCampoCategoria="depreciacion";
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTOORIGEN:
					sNombreCampoCategoria="costo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN:
					sNombreCampoCategoria="depreciacion_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_RAZON:
					sNombreCampoCategoria="razon";
					break;

				case TransferenciasConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case TransferenciasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN:
					sNombreCampoCategoriaValor="empresa_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN:
					sNombreCampoCategoriaValor="sucursal_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN:
					sNombreCampoCategoriaValor="sub_grupo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN:
					sNombreCampoCategoriaValor="grupo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN:
					sNombreCampoCategoriaValor="activo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO:
					sNombreCampoCategoriaValor="empresa_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO:
					sNombreCampoCategoriaValor="sucursal_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO:
					sNombreCampoCategoriaValor="sub_grupo_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPODESTINO:
					sNombreCampoCategoriaValor="grupo_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO:
					sNombreCampoCategoriaValor="activo_destino";
					break;

				case TransferenciasConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case TransferenciasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACION:
					sNombreCampoCategoriaValor="depreciacion";
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTOORIGEN:
					sNombreCampoCategoriaValor="costo_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN:
					sNombreCampoCategoriaValor="depreciacion_origen";
					break;

				case TransferenciasConstantesFunciones.LABEL_RAZON:
					sNombreCampoCategoriaValor="razon";
					break;

				case TransferenciasConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case TransferenciasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"empresa_origen");
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sucursal_origen");
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Grupo Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_grupo_origen");
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"grupo_origen");
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Activo Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"activo_origen");
					break;

				case TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"empresa_destino");
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sucursal_destino");
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Grupo Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_grupo_destino");
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPODESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"grupo_destino");
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Activo Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"activo_destino");
					break;

				case TransferenciasConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case TransferenciasConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Depreciacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"depreciacion");
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTOORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_origen");
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Depreciacion Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"depreciacion_origen");
					break;

				case TransferenciasConstantesFunciones.LABEL_RAZON:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Razon",sNombreCampoCategoria,sNombreCampoCategoriaValor,"razon");
					break;

				case TransferenciasConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case TransferenciasConstantesFunciones.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
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
	
	public void jButtonGenerarExcelReporteDinamicoTransferenciasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferencias";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Transferenciass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransferenciasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getempresa_origen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getsucursal_origen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getsub_grupo_origen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getgrupo_origen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getactivo_origen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getempresa_destino());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getsucursal_destino());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getsub_grupo_destino());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_GRUPODESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getgrupo_destino());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getactivo_destino());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DEPRECIACION);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getdepreciacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_COSTOORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_COSTOORIGEN);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getcosto_origen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getdepreciacion_origen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_RAZON:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_RAZON);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getrazon());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(Transferencias transferencias:transferenciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferencias.gettipo());
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
			//	this.getFilaCabeceraExportarExcelTransferencias(row);				
			//	iRow++;
			//}				
			
			//for(Transferencias transferenciasAux:transferenciassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransferencias(transferenciasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
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
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferencias(false);
			
			//SI ES MANUAL
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransferencias();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransferenciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferencias(false);
			
			//SI ES MANUAL
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransferencias();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransferenciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferencias(false);
			
			//SI ES MANUAL
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransferencias();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransferencias() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransferencias.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransferencias.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransferencias.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransferencias.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransferencias.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransferencias.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransferencias.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransferencias(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransferencias(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransferencias(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransferencias(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransferencias(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransferencias(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransferencias(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransferencias(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransferenciasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransferencias() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransferencias();
		
		this.inicializarActualizarBindingBotonesManualTransferencias(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransferencias();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransferencias() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransferencias(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransferencias(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransferencias.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransferencias.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransferencias.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransferencias!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransferencias.jCheckBoxPostAccionNuevoTransferencias.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransferencias.jCheckBoxPostAccionSinCerrarTransferencias.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransferencias.jCheckBoxPostAccionSinMensajeTransferencias.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransferencias.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransferencias.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransferencias.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransferencias!=null) {
				this.jInternalFrameDetalleFormTransferencias.jCheckBoxPostAccionNuevoTransferencias.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransferencias.jCheckBoxPostAccionSinCerrarTransferencias.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransferencias.jCheckBoxPostAccionSinMensajeTransferencias.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransferencias.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransferencias.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransferencias.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransferencias.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransferencias.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransferencias.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransferencias.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransferencias.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransferencias.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransferencias(Boolean esInicializar) throws Exception {
		try	{	
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransferencias(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransferencias() throws Exception {
		try	{
			if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransferencias();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransferencias() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransferencias() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransferencias.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransferencias.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransferencias.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransferencias.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransferencias.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransferencias.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransferencias.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransferencias.addItem(reporte);
			}
			
			
			if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransferencias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransferencias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransferencias.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransferencias.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransferencias.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransferencias.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransferencias.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransferencias.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransferencias.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransferencias();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransferencias() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
				this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
				this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransferencias.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransferencias.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransferencias.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TransferenciasConstantesFunciones.getTiposSeleccionarTransferencias(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TransferenciasConstantesFunciones.getTiposSeleccionarTransferencias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TransferenciasConstantesFunciones.getTiposSeleccionarTransferencias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransferencias.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTransferencias.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransferencias()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaTransferencias=Long.parseLong(this.jLabelidTransferenciasBusquedaTransferencias.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransferencias(Boolean esInicializar) throws Exception {				
		if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransferencias();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransferencias() throws Exception {
		this.inicializarActualizarBindingTablaTransferencias(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransferencias() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransferenciasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransferencias(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transferenciasLogic.getTransferenciass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transferenciass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransferencias.setModel(new TransferenciasModel(this.transferenciasLogic.getTransferenciass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransferencias.setModel(new TransferenciasModel(this.transferenciass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransferencias!=null && this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransferencias();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransferenciasConstantesFunciones.SCLASSWEBTITULO,transferenciasConstantesFunciones.resaltarSeleccionarTransferencias,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransferenciasConstantesFunciones.SCLASSWEBTITULO,transferenciasConstantesFunciones.resaltarSeleccionarTransferencias,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_ID));

		if(this.transferenciasConstantesFunciones.mostraridTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasConstantesFunciones.resaltaridTransferencias,this.transferenciasConstantesFunciones.activaridTransferencias,iSizeTabla,this,true,"idTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltaridTransferencias,this.transferenciasConstantesFunciones.activaridTransferencias,this,true,"idTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN));

		if(this.transferenciasConstantesFunciones.mostrarempresa_origenTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarempresa_origenTransferencias,this.transferenciasConstantesFunciones.activarempresa_origenTransferencias,iSizeTabla,this,true,"empresa_origenTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarempresa_origenTransferencias,this.transferenciasConstantesFunciones.activarempresa_origenTransferencias,this,true,"empresa_origenTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN));

		if(this.transferenciasConstantesFunciones.mostrarsucursal_origenTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarsucursal_origenTransferencias,this.transferenciasConstantesFunciones.activarsucursal_origenTransferencias,iSizeTabla,this,true,"sucursal_origenTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarsucursal_origenTransferencias,this.transferenciasConstantesFunciones.activarsucursal_origenTransferencias,this,true,"sucursal_origenTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN));

		if(this.transferenciasConstantesFunciones.mostrarsub_grupo_origenTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarsub_grupo_origenTransferencias,this.transferenciasConstantesFunciones.activarsub_grupo_origenTransferencias,iSizeTabla,this,true,"sub_grupo_origenTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarsub_grupo_origenTransferencias,this.transferenciasConstantesFunciones.activarsub_grupo_origenTransferencias,this,true,"sub_grupo_origenTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN));

		if(this.transferenciasConstantesFunciones.mostrargrupo_origenTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltargrupo_origenTransferencias,this.transferenciasConstantesFunciones.activargrupo_origenTransferencias,iSizeTabla,this,true,"grupo_origenTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltargrupo_origenTransferencias,this.transferenciasConstantesFunciones.activargrupo_origenTransferencias,this,true,"grupo_origenTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN));

		if(this.transferenciasConstantesFunciones.mostraractivo_origenTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltaractivo_origenTransferencias,this.transferenciasConstantesFunciones.activaractivo_origenTransferencias,iSizeTabla,this,true,"activo_origenTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltaractivo_origenTransferencias,this.transferenciasConstantesFunciones.activaractivo_origenTransferencias,this,true,"activo_origenTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO));

		if(this.transferenciasConstantesFunciones.mostrarempresa_destinoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarempresa_destinoTransferencias,this.transferenciasConstantesFunciones.activarempresa_destinoTransferencias,iSizeTabla,this,true,"empresa_destinoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarempresa_destinoTransferencias,this.transferenciasConstantesFunciones.activarempresa_destinoTransferencias,this,true,"empresa_destinoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO));

		if(this.transferenciasConstantesFunciones.mostrarsucursal_destinoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarsucursal_destinoTransferencias,this.transferenciasConstantesFunciones.activarsucursal_destinoTransferencias,iSizeTabla,this,true,"sucursal_destinoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarsucursal_destinoTransferencias,this.transferenciasConstantesFunciones.activarsucursal_destinoTransferencias,this,true,"sucursal_destinoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO));

		if(this.transferenciasConstantesFunciones.mostrarsub_grupo_destinoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarsub_grupo_destinoTransferencias,this.transferenciasConstantesFunciones.activarsub_grupo_destinoTransferencias,iSizeTabla,this,true,"sub_grupo_destinoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarsub_grupo_destinoTransferencias,this.transferenciasConstantesFunciones.activarsub_grupo_destinoTransferencias,this,true,"sub_grupo_destinoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_GRUPODESTINO));

		if(this.transferenciasConstantesFunciones.mostrargrupo_destinoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_GRUPODESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltargrupo_destinoTransferencias,this.transferenciasConstantesFunciones.activargrupo_destinoTransferencias,iSizeTabla,this,true,"grupo_destinoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltargrupo_destinoTransferencias,this.transferenciasConstantesFunciones.activargrupo_destinoTransferencias,this,true,"grupo_destinoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO));

		if(this.transferenciasConstantesFunciones.mostraractivo_destinoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltaractivo_destinoTransferencias,this.transferenciasConstantesFunciones.activaractivo_destinoTransferencias,iSizeTabla,this,true,"activo_destinoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltaractivo_destinoTransferencias,this.transferenciasConstantesFunciones.activaractivo_destinoTransferencias,this,true,"activo_destinoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_SECUENCIAL));

		if(this.transferenciasConstantesFunciones.mostrarsecuencialTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarsecuencialTransferencias,this.transferenciasConstantesFunciones.activarsecuencialTransferencias,iSizeTabla,this,true,"secuencialTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarsecuencialTransferencias,this.transferenciasConstantesFunciones.activarsecuencialTransferencias,this,true,"secuencialTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_FECHA));

		if(this.transferenciasConstantesFunciones.mostrarfechaTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.transferenciasConstantesFunciones.resaltarfechaTransferencias,this.transferenciasConstantesFunciones.activarfechaTransferencias,iSizeTabla,this,true,"fechaTransferencias","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.transferenciasConstantesFunciones.resaltarfechaTransferencias,this.transferenciasConstantesFunciones.activarfechaTransferencias,this,true,"fechaTransferencias","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.transferenciasConstantesFunciones.mostrarnumero_documentoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarnumero_documentoTransferencias,this.transferenciasConstantesFunciones.activarnumero_documentoTransferencias,iSizeTabla,this,true,"numero_documentoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarnumero_documentoTransferencias,this.transferenciasConstantesFunciones.activarnumero_documentoTransferencias,this,true,"numero_documentoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_COSTO));

		if(this.transferenciasConstantesFunciones.mostrarcostoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasConstantesFunciones.resaltarcostoTransferencias,this.transferenciasConstantesFunciones.activarcostoTransferencias,iSizeTabla,this,true,"costoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarcostoTransferencias,this.transferenciasConstantesFunciones.activarcostoTransferencias,this,true,"costoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_DEPRECIACION));

		if(this.transferenciasConstantesFunciones.mostrardepreciacionTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_DEPRECIACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasConstantesFunciones.resaltardepreciacionTransferencias,this.transferenciasConstantesFunciones.activardepreciacionTransferencias,iSizeTabla,this,true,"depreciacionTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltardepreciacionTransferencias,this.transferenciasConstantesFunciones.activardepreciacionTransferencias,this,true,"depreciacionTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_COSTOORIGEN));

		if(this.transferenciasConstantesFunciones.mostrarcosto_origenTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_COSTOORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasConstantesFunciones.resaltarcosto_origenTransferencias,this.transferenciasConstantesFunciones.activarcosto_origenTransferencias,iSizeTabla,this,true,"costo_origenTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarcosto_origenTransferencias,this.transferenciasConstantesFunciones.activarcosto_origenTransferencias,this,true,"costo_origenTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN));

		if(this.transferenciasConstantesFunciones.mostrardepreciacion_origenTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasConstantesFunciones.resaltardepreciacion_origenTransferencias,this.transferenciasConstantesFunciones.activardepreciacion_origenTransferencias,iSizeTabla,this,true,"depreciacion_origenTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltardepreciacion_origenTransferencias,this.transferenciasConstantesFunciones.activardepreciacion_origenTransferencias,this,true,"depreciacion_origenTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_RAZON));

		if(this.transferenciasConstantesFunciones.mostrarrazonTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_RAZON,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltarrazonTransferencias,this.transferenciasConstantesFunciones.activarrazonTransferencias,iSizeTabla,this,true,"razonTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltarrazonTransferencias,this.transferenciasConstantesFunciones.activarrazonTransferencias,this,true,"razonTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_DESCRIPCION));

		if(this.transferenciasConstantesFunciones.mostrardescripcionTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltardescripcionTransferencias,this.transferenciasConstantesFunciones.activardescripcionTransferencias,iSizeTabla,this,true,"descripcionTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltardescripcionTransferencias,this.transferenciasConstantesFunciones.activardescripcionTransferencias,this,true,"descripcionTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,TransferenciasConstantesFunciones.LABEL_TIPO));

		if(this.transferenciasConstantesFunciones.mostrartipoTransferencias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasConstantesFunciones.resaltartipoTransferencias,this.transferenciasConstantesFunciones.activartipoTransferencias,iSizeTabla,this,true,"tipoTransferencias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasConstantesFunciones.resaltartipoTransferencias,this.transferenciasConstantesFunciones.activartipoTransferencias,this,true,"tipoTransferencias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transferenciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transferenciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransferencias.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transferenciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transferenciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransferencias.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransferencias && this.isPermisoGuardarCambiosTransferencias) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transferenciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transferenciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransferencias.addColumn(tableColumn);
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
			
			this.jTableDatosTransferencias.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransferencias && this.isPermisoGuardarCambiosTransferencias) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransferencias && this.isPermisoGuardarCambiosTransferencias) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransferencias.moveColumn(this.jTableDatosTransferencias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransferencias.moveColumn(this.jTableDatosTransferencias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransferencias.moveColumn(this.jTableDatosTransferencias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransferencias.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransferencias.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransferencias,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransferencias.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransferencias.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransferencias.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransferencias.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransferencias.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=transferenciasLogic.getTransferenciass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transferenciass.size()-1;
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
		//this.jTableDatosTransferencias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransferencias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransferencias();
			
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
				
				//this.isEsNuevoTransferencias=false;
					
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
				if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransferencias==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransferencias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransferencias.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transferencias.getsType().equals("DUPLICADO")
				   || this.transferencias.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransferencias=true;
				
				} else {
					this.isEsNuevoTransferencias=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
					if(this.transferencias.getId()>=0 && !this.transferencias.getIsNew()) {						
						this.isEsNuevoTransferencias=false;
						
					} else {
						this.isEsNuevoTransferencias=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransferencias(esRelaciones);						
				
				this.seleccionarTransferencias(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transferencias.getId()<0) {
					this.isEsNuevoTransferencias=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransferencias(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransferencias(evt,rowIndex);
				}	
				
				if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Transferencias: " + this.dDif); 
					}
				}								
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransferencias(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transferencias)) {
					if(this.transferencias.getId()>0) {
						this.transferencias.setIsDeleted(true);
						
						this.transferenciassEliminados.add(this.transferencias);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transferenciasLogic.getTransferenciass().remove(this.transferencias);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transferenciass.remove(this.transferencias);				
					}
					
					
					((TransferenciasModel) this.jTableDatosTransferencias.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransferencias(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransferencias(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransferencias) {
			
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransferencias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransferencias.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransferencias(this.transferencias);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransferencias("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransferencias(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransferencias() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransferencias(Transferencias transferencias) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransferencias(transferencias,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransferencias(Transferencias transferencias,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransferencias(transferencias);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransferencias(transferencias,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransferencias(transferencias);
	}
	
	public void setVariablesObjetoActualToFormularioTransferencias(Transferencias transferencias) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.setText(transferencias.getId().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.setText(transferencias.getempresa_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.setText(transferencias.getsucursal_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.setText(transferencias.getsub_grupo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.setText(transferencias.getgrupo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.setText(transferencias.getactivo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.setText(transferencias.getempresa_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.setText(transferencias.getsucursal_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.setText(transferencias.getsub_grupo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.setText(transferencias.getgrupo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.setText(transferencias.getactivo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.setText(transferencias.getsecuencial());
			this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.setDate(transferencias.getfecha());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.setText(transferencias.getnumero_documento());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.setText(transferencias.getcosto().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.setText(transferencias.getdepreciacion().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.setText(transferencias.getcosto_origen().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.setText(transferencias.getdepreciacion_origen().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.setText(transferencias.getrazon());
			this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.setText(transferencias.getdescripcion());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.setText(transferencias.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Transferencias transferenciasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transferenciasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Transferencias transferenciasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transferenciasLocal=this.transferencias;
			} else {
				transferenciasLocal=this.transferenciasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transferenciasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransferencias(transferenciasLocal,true);
					
					if(transferenciasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transferenciasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transferenciasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transferenciasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransferencias(Transferencias transferencias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransferencias(transferencias,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(transferencias);
	}
	
	public void setVariablesFormularioToObjetoActualTransferencias(Transferencias transferencias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransferencias(transferencias,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransferencias(Transferencias transferencias,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.getText()==null || this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.getText()=="" || this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.getText()=="Id") {
				this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.setText("0");
			}

			if(conColumnasBase) {transferencias.setId(Long.parseLong(this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelIdTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setempresa_origen(this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelempresa_origenTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setsucursal_origen(this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsucursal_origenTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setsub_grupo_origen(this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsub_grupo_origenTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setgrupo_origen(this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelgrupo_origenTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setactivo_origen(this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelactivo_origenTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setempresa_destino(this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelempresa_destinoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setsucursal_destino(this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsucursal_destinoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setsub_grupo_destino(this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsub_grupo_destinoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setgrupo_destino(this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_GRUPODESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelgrupo_destinoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setactivo_destino(this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelactivo_destinoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setsecuencial(this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelsecuencialTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setfecha(this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelfechaTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setnumero_documento(this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelnumero_documentoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelcostoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setdepreciacion(Double.parseDouble(this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_DEPRECIACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeldepreciacionTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setcosto_origen(Double.parseDouble(this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_COSTOORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelcosto_origenTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setdepreciacion_origen(Double.parseDouble(this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeldepreciacion_origenTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setrazon(this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_RAZON+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabelrazonTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.setdescripcion(this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeldescripcionTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferencias.settipo(this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferencias.jLabeltipoTransferencias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransferencias(Transferencias transferenciasBean,Transferencias transferencias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransferencias(Transferencias transferenciasOrigen,Transferencias transferencias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transferenciasOrigen.getId()!=null && !transferenciasOrigen.getId().equals(0L))) {transferencias.setId(transferenciasOrigen.getId());}}
			if(conDefault || (!conDefault && transferenciasOrigen.getempresa_origen()!=null && !transferenciasOrigen.getempresa_origen().equals(""))) {transferencias.setempresa_origen(transferenciasOrigen.getempresa_origen());}
			if(conDefault || (!conDefault && transferenciasOrigen.getsucursal_origen()!=null && !transferenciasOrigen.getsucursal_origen().equals(""))) {transferencias.setsucursal_origen(transferenciasOrigen.getsucursal_origen());}
			if(conDefault || (!conDefault && transferenciasOrigen.getsub_grupo_origen()!=null && !transferenciasOrigen.getsub_grupo_origen().equals(""))) {transferencias.setsub_grupo_origen(transferenciasOrigen.getsub_grupo_origen());}
			if(conDefault || (!conDefault && transferenciasOrigen.getgrupo_origen()!=null && !transferenciasOrigen.getgrupo_origen().equals(""))) {transferencias.setgrupo_origen(transferenciasOrigen.getgrupo_origen());}
			if(conDefault || (!conDefault && transferenciasOrigen.getactivo_origen()!=null && !transferenciasOrigen.getactivo_origen().equals(""))) {transferencias.setactivo_origen(transferenciasOrigen.getactivo_origen());}
			if(conDefault || (!conDefault && transferenciasOrigen.getempresa_destino()!=null && !transferenciasOrigen.getempresa_destino().equals(""))) {transferencias.setempresa_destino(transferenciasOrigen.getempresa_destino());}
			if(conDefault || (!conDefault && transferenciasOrigen.getsucursal_destino()!=null && !transferenciasOrigen.getsucursal_destino().equals(""))) {transferencias.setsucursal_destino(transferenciasOrigen.getsucursal_destino());}
			if(conDefault || (!conDefault && transferenciasOrigen.getsub_grupo_destino()!=null && !transferenciasOrigen.getsub_grupo_destino().equals(""))) {transferencias.setsub_grupo_destino(transferenciasOrigen.getsub_grupo_destino());}
			if(conDefault || (!conDefault && transferenciasOrigen.getgrupo_destino()!=null && !transferenciasOrigen.getgrupo_destino().equals(""))) {transferencias.setgrupo_destino(transferenciasOrigen.getgrupo_destino());}
			if(conDefault || (!conDefault && transferenciasOrigen.getactivo_destino()!=null && !transferenciasOrigen.getactivo_destino().equals(""))) {transferencias.setactivo_destino(transferenciasOrigen.getactivo_destino());}
			if(conDefault || (!conDefault && transferenciasOrigen.getsecuencial()!=null && !transferenciasOrigen.getsecuencial().equals(""))) {transferencias.setsecuencial(transferenciasOrigen.getsecuencial());}
			if(conDefault || (!conDefault && transferenciasOrigen.getfecha()!=null && !transferenciasOrigen.getfecha().equals(new Date()))) {transferencias.setfecha(transferenciasOrigen.getfecha());}
			if(conDefault || (!conDefault && transferenciasOrigen.getnumero_documento()!=null && !transferenciasOrigen.getnumero_documento().equals(""))) {transferencias.setnumero_documento(transferenciasOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && transferenciasOrigen.getcosto()!=null && !transferenciasOrigen.getcosto().equals(0.0))) {transferencias.setcosto(transferenciasOrigen.getcosto());}
			if(conDefault || (!conDefault && transferenciasOrigen.getdepreciacion()!=null && !transferenciasOrigen.getdepreciacion().equals(0.0))) {transferencias.setdepreciacion(transferenciasOrigen.getdepreciacion());}
			if(conDefault || (!conDefault && transferenciasOrigen.getcosto_origen()!=null && !transferenciasOrigen.getcosto_origen().equals(0.0))) {transferencias.setcosto_origen(transferenciasOrigen.getcosto_origen());}
			if(conDefault || (!conDefault && transferenciasOrigen.getdepreciacion_origen()!=null && !transferenciasOrigen.getdepreciacion_origen().equals(0.0))) {transferencias.setdepreciacion_origen(transferenciasOrigen.getdepreciacion_origen());}
			if(conDefault || (!conDefault && transferenciasOrigen.getrazon()!=null && !transferenciasOrigen.getrazon().equals(""))) {transferencias.setrazon(transferenciasOrigen.getrazon());}
			if(conDefault || (!conDefault && transferenciasOrigen.getdescripcion()!=null && !transferenciasOrigen.getdescripcion().equals(""))) {transferencias.setdescripcion(transferenciasOrigen.getdescripcion());}
			if(conDefault || (!conDefault && transferenciasOrigen.gettipo()!=null && !transferenciasOrigen.gettipo().equals(""))) {transferencias.settipo(transferenciasOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransferencias(Transferencias transferencias) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.setText(transferencias.getId().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.setText(transferencias.getempresa_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.setText(transferencias.getsucursal_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.setText(transferencias.getsub_grupo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.setText(transferencias.getgrupo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.setText(transferencias.getactivo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.setText(transferencias.getempresa_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.setText(transferencias.getsucursal_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.setText(transferencias.getsub_grupo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.setText(transferencias.getgrupo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.setText(transferencias.getactivo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.setText(transferencias.getsecuencial());
			this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.setDate(transferencias.getfecha());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.setText(transferencias.getnumero_documento());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.setText(transferencias.getcosto().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.setText(transferencias.getdepreciacion().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.setText(transferencias.getcosto_origen().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.setText(transferencias.getdepreciacion_origen().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.setText(transferencias.getrazon());
			this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.setText(transferencias.getdescripcion());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.setText(transferencias.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransferencias(TransferenciasBean transferenciasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.setText(transferenciasBean.getId().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.setText(transferenciasBean.getempresa_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.setText(transferenciasBean.getsucursal_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.setText(transferenciasBean.getsub_grupo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.setText(transferenciasBean.getgrupo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.setText(transferenciasBean.getactivo_origen());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.setText(transferenciasBean.getempresa_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.setText(transferenciasBean.getsucursal_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.setText(transferenciasBean.getsub_grupo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.setText(transferenciasBean.getgrupo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.setText(transferenciasBean.getactivo_destino());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.setText(transferenciasBean.getsecuencial());
			this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.setDate(transferenciasBean.getfecha());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.setText(transferenciasBean.getnumero_documento());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.setText(transferenciasBean.getcosto().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.setText(transferenciasBean.getdepreciacion().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.setText(transferenciasBean.getcosto_origen().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.setText(transferenciasBean.getdepreciacion_origen().toString());
			this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.setText(transferenciasBean.getrazon());
			this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.setText(transferenciasBean.getdescripcion());
			this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.setText(transferenciasBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransferencias(TransferenciasParameterReturnGeneral transferenciasReturnGeneral,TransferenciasBean transferenciasBean,Boolean conDefault) throws Exception { 
		try {
			Transferencias transferenciasLocal=new Transferencias();
			
			transferenciasLocal=transferenciasReturnGeneral.getTransferencias();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transferenciasLocal.getId()!=null && !transferenciasLocal.getId().equals(0L))) {transferenciasBean.setId(transferenciasLocal.getId());}}
			if(conDefault || (!conDefault && transferenciasLocal.getempresa_origen()!=null && !transferenciasLocal.getempresa_origen().equals(""))) {transferenciasBean.setempresa_origen(transferenciasLocal.getempresa_origen());}
			if(conDefault || (!conDefault && transferenciasLocal.getsucursal_origen()!=null && !transferenciasLocal.getsucursal_origen().equals(""))) {transferenciasBean.setsucursal_origen(transferenciasLocal.getsucursal_origen());}
			if(conDefault || (!conDefault && transferenciasLocal.getsub_grupo_origen()!=null && !transferenciasLocal.getsub_grupo_origen().equals(""))) {transferenciasBean.setsub_grupo_origen(transferenciasLocal.getsub_grupo_origen());}
			if(conDefault || (!conDefault && transferenciasLocal.getgrupo_origen()!=null && !transferenciasLocal.getgrupo_origen().equals(""))) {transferenciasBean.setgrupo_origen(transferenciasLocal.getgrupo_origen());}
			if(conDefault || (!conDefault && transferenciasLocal.getactivo_origen()!=null && !transferenciasLocal.getactivo_origen().equals(""))) {transferenciasBean.setactivo_origen(transferenciasLocal.getactivo_origen());}
			if(conDefault || (!conDefault && transferenciasLocal.getempresa_destino()!=null && !transferenciasLocal.getempresa_destino().equals(""))) {transferenciasBean.setempresa_destino(transferenciasLocal.getempresa_destino());}
			if(conDefault || (!conDefault && transferenciasLocal.getsucursal_destino()!=null && !transferenciasLocal.getsucursal_destino().equals(""))) {transferenciasBean.setsucursal_destino(transferenciasLocal.getsucursal_destino());}
			if(conDefault || (!conDefault && transferenciasLocal.getsub_grupo_destino()!=null && !transferenciasLocal.getsub_grupo_destino().equals(""))) {transferenciasBean.setsub_grupo_destino(transferenciasLocal.getsub_grupo_destino());}
			if(conDefault || (!conDefault && transferenciasLocal.getgrupo_destino()!=null && !transferenciasLocal.getgrupo_destino().equals(""))) {transferenciasBean.setgrupo_destino(transferenciasLocal.getgrupo_destino());}
			if(conDefault || (!conDefault && transferenciasLocal.getactivo_destino()!=null && !transferenciasLocal.getactivo_destino().equals(""))) {transferenciasBean.setactivo_destino(transferenciasLocal.getactivo_destino());}
			if(conDefault || (!conDefault && transferenciasLocal.getsecuencial()!=null && !transferenciasLocal.getsecuencial().equals(""))) {transferenciasBean.setsecuencial(transferenciasLocal.getsecuencial());}
			if(conDefault || (!conDefault && transferenciasLocal.getfecha()!=null && !transferenciasLocal.getfecha().equals(new Date()))) {transferenciasBean.setfecha(transferenciasLocal.getfecha());}
			if(conDefault || (!conDefault && transferenciasLocal.getnumero_documento()!=null && !transferenciasLocal.getnumero_documento().equals(""))) {transferenciasBean.setnumero_documento(transferenciasLocal.getnumero_documento());}
			if(conDefault || (!conDefault && transferenciasLocal.getcosto()!=null && !transferenciasLocal.getcosto().equals(0.0))) {transferenciasBean.setcosto(transferenciasLocal.getcosto());}
			if(conDefault || (!conDefault && transferenciasLocal.getdepreciacion()!=null && !transferenciasLocal.getdepreciacion().equals(0.0))) {transferenciasBean.setdepreciacion(transferenciasLocal.getdepreciacion());}
			if(conDefault || (!conDefault && transferenciasLocal.getcosto_origen()!=null && !transferenciasLocal.getcosto_origen().equals(0.0))) {transferenciasBean.setcosto_origen(transferenciasLocal.getcosto_origen());}
			if(conDefault || (!conDefault && transferenciasLocal.getdepreciacion_origen()!=null && !transferenciasLocal.getdepreciacion_origen().equals(0.0))) {transferenciasBean.setdepreciacion_origen(transferenciasLocal.getdepreciacion_origen());}
			if(conDefault || (!conDefault && transferenciasLocal.getrazon()!=null && !transferenciasLocal.getrazon().equals(""))) {transferenciasBean.setrazon(transferenciasLocal.getrazon());}
			if(conDefault || (!conDefault && transferenciasLocal.getdescripcion()!=null && !transferenciasLocal.getdescripcion().equals(""))) {transferenciasBean.setdescripcion(transferenciasLocal.getdescripcion());}
			if(conDefault || (!conDefault && transferenciasLocal.gettipo()!=null && !transferenciasLocal.gettipo().equals(""))) {transferenciasBean.settipo(transferenciasLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransferenciasGenerico(Long idTransferenciasSeleccionado,JComboBox jComboBoxTransferencias,List<Transferencias> transferenciassLocal)throws Exception {
		try {
			Transferencias  transferenciasTemp=null;

			for(Transferencias transferenciasAux:transferenciassLocal) {
				if(transferenciasAux.getId()!=null && transferenciasAux.getId().equals(idTransferenciasSeleccionado)) {
					transferenciasTemp=transferenciasAux;
					break;
				}
			}

			jComboBoxTransferencias.setSelectedItem(transferenciasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransferenciasGenerico(JComboBox jComboBoxTransferencias,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransferencias.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransferencias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransferencias.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransferencias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transferencias=(Transferencias) transferenciasLogic.getTransferenciass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transferencias =(Transferencias) transferenciass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transferencias.getIsNew() && !transferencias.getIsChanged() && !transferencias.getIsDeleted()) {
				sDescripcion=transferencias.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transferencias.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Transferencias transferenciasRow=new Transferencias();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transferenciasRow=(Transferencias) transferenciasLogic.getTransferenciass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transferenciasRow=(Transferencias) transferenciass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransferencias(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransferencias.setVisible((this.isVisibilidadCeldaNuevoTransferencias && this.isPermisoNuevoTransferencias));			
			this.jButtonDuplicarTransferencias.setVisible((this.isVisibilidadCeldaDuplicarTransferencias && this.isPermisoDuplicarTransferencias));			
			this.jButtonCopiarTransferencias.setVisible((this.isVisibilidadCeldaCopiarTransferencias && this.isPermisoCopiarTransferencias));
			this.jButtonVerFormTransferencias.setVisible((this.isVisibilidadCeldaVerFormTransferencias && this.isPermisoVerFormTransferencias));
			
			this.jButtonAbrirOrderByTransferencias.setVisible((this.isVisibilidadCeldaOrdenTransferencias && this.isPermisoOrdenTransferencias));			
			
			this.jButtonNuevoRelacionesTransferencias.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransferencias && this.isPermisoNuevoTransferencias));			
			this.jButtonNuevoGuardarCambiosTransferencias.setVisible((this.isVisibilidadCeldaNuevoTransferencias && this.isPermisoNuevoTransferencias && this.isPermisoGuardarCambiosTransferencias));
			
			if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.jInternalFrameDetalleFormTransferencias.jButtonModificarTransferencias.setVisible((this.isVisibilidadCeldaModificarTransferencias && this.isPermisoActualizarTransferencias));	
			this.jInternalFrameDetalleFormTransferencias.jButtonActualizarTransferencias.setVisible((this.isVisibilidadCeldaActualizarTransferencias && this.isPermisoActualizarTransferencias));	
			this.jInternalFrameDetalleFormTransferencias.jButtonEliminarTransferencias.setVisible((this.isVisibilidadCeldaEliminarTransferencias && this.isPermisoEliminarTransferencias));
			this.jInternalFrameDetalleFormTransferencias.jButtonCancelarTransferencias.setVisible(this.isVisibilidadCeldaCancelarTransferencias);							
			this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.setVisible((this.isVisibilidadCeldaGuardarTransferencias && this.isPermisoGuardarCambiosTransferencias));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransferencias.setVisible((this.isVisibilidadCeldaGuardarCambiosTransferencias && this.isPermisoGuardarCambiosTransferencias));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransferencias.setVisible((this.isVisibilidadCeldaNuevoTransferencias && this.isPermisoNuevoTransferencias));						
			this.jButtonDuplicarToolBarTransferencias.setVisible((this.isVisibilidadCeldaDuplicarTransferencias && this.isPermisoDuplicarTransferencias));						
			this.jButtonCopiarToolBarTransferencias.setVisible((this.isVisibilidadCeldaCopiarTransferencias && this.isPermisoCopiarTransferencias));			
			this.jButtonVerFormToolBarTransferencias.setVisible((this.isVisibilidadCeldaVerFormTransferencias && this.isPermisoVerFormTransferencias));			
			this.jButtonAbrirOrderByToolBarTransferencias.setVisible((this.isVisibilidadCeldaOrdenTransferencias && this.isPermisoOrdenTransferencias));
			this.jButtonNuevoRelacionesToolBarTransferencias.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransferencias && this.isPermisoNuevoTransferencias));			
			this.jButtonNuevoGuardarCambiosToolBarTransferencias.setVisible((this.isVisibilidadCeldaNuevoTransferencias && this.isPermisoNuevoTransferencias && this.isPermisoGuardarCambiosTransferencias));			
			
			if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.jInternalFrameDetalleFormTransferencias.jButtonModificarToolBarTransferencias.setVisible((this.isVisibilidadCeldaModificarTransferencias && this.isPermisoActualizarTransferencias));	
			this.jInternalFrameDetalleFormTransferencias.jButtonActualizarToolBarTransferencias.setVisible((this.isVisibilidadCeldaActualizarTransferencias  && this.isPermisoActualizarTransferencias));	
			this.jInternalFrameDetalleFormTransferencias.jButtonEliminarToolBarTransferencias.setVisible((this.isVisibilidadCeldaEliminarTransferencias && this.isPermisoEliminarTransferencias));
			this.jInternalFrameDetalleFormTransferencias.jButtonCancelarToolBarTransferencias.setVisible(this.isVisibilidadCeldaCancelarTransferencias);				
			this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosToolBarTransferencias.setVisible((this.isVisibilidadCeldaGuardarTransferencias && this.isPermisoGuardarCambiosTransferencias));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransferencias.setVisible((this.isVisibilidadCeldaGuardarCambiosTransferencias && this.isPermisoGuardarCambiosTransferencias));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransferencias.setVisible((this.isVisibilidadCeldaNuevoTransferencias && this.isPermisoNuevoTransferencias));			
			this.jMenuItemDuplicarTransferencias.setVisible((this.isVisibilidadCeldaDuplicarTransferencias && this.isPermisoDuplicarTransferencias));			
			this.jMenuItemCopiarTransferencias.setVisible((this.isVisibilidadCeldaCopiarTransferencias && this.isPermisoCopiarTransferencias));			
			this.jMenuItemVerFormTransferencias.setVisible((this.isVisibilidadCeldaVerFormTransferencias && this.isPermisoVerFormTransferencias));			
			this.jMenuItemAbrirOrderByTransferencias.setVisible((this.isVisibilidadCeldaOrdenTransferencias && this.isPermisoOrdenTransferencias));			
			//this.jMenuItemMostrarOcultarTransferencias.setVisible((this.isVisibilidadCeldaOrdenTransferencias && this.isPermisoOrdenTransferencias));
			this.jMenuItemDetalleAbrirOrderByTransferencias.setVisible((this.isVisibilidadCeldaOrdenTransferencias && this.isPermisoOrdenTransferencias));			
			//this.jMenuItemDetalleMostrarOcultarTransferencias.setVisible((this.isVisibilidadCeldaOrdenTransferencias && this.isPermisoOrdenTransferencias));			
			this.jMenuItemNuevoRelacionesTransferencias.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransferencias && this.isPermisoNuevoTransferencias));			
			this.jMenuItemNuevoGuardarCambiosTransferencias.setVisible((this.isVisibilidadCeldaNuevoTransferencias && this.isPermisoNuevoTransferencias && this.isPermisoGuardarCambiosTransferencias));									
			
			if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.jInternalFrameDetalleFormTransferencias.jMenuItemModificarTransferencias.setVisible((this.isVisibilidadCeldaModificarTransferencias && this.isPermisoActualizarTransferencias));	
			this.jInternalFrameDetalleFormTransferencias.jMenuItemActualizarTransferencias.setVisible((this.isVisibilidadCeldaActualizarTransferencias && this.isPermisoActualizarTransferencias));	
			this.jInternalFrameDetalleFormTransferencias.jMenuItemEliminarTransferencias.setVisible((this.isVisibilidadCeldaEliminarTransferencias && this.isPermisoEliminarTransferencias));
			this.jInternalFrameDetalleFormTransferencias.jMenuItemCancelarTransferencias.setVisible(this.isVisibilidadCeldaCancelarTransferencias);				
			}
			
			this.jMenuItemGuardarCambiosTransferencias.setVisible((this.isVisibilidadCeldaGuardarTransferencias && this.isPermisoGuardarCambiosTransferencias));						
			this.jMenuItemGuardarCambiosTablaTransferencias.setVisible((this.isVisibilidadCeldaGuardarCambiosTransferencias && this.isPermisoGuardarCambiosTransferencias));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransferencias=this.jButtonNuevoTransferencias.isVisible();
			this.isVisibilidadCeldaDuplicarTransferencias=this.jButtonDuplicarTransferencias.isVisible();
			this.isVisibilidadCeldaCopiarTransferencias=this.jButtonCopiarTransferencias.isVisible();
			this.isVisibilidadCeldaVerFormTransferencias=this.jButtonVerFormTransferencias.isVisible();
			
			this.isVisibilidadCeldaOrdenTransferencias=this.jButtonAbrirOrderByTransferencias.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=this.jButtonNuevoRelacionesTransferencias.isVisible();
			this.isVisibilidadCeldaModificarTransferencias=this.jButtonModificarTransferencias.isVisible();
			
			if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.isVisibilidadCeldaActualizarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonActualizarTransferencias.isVisible();
			this.isVisibilidadCeldaEliminarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonEliminarTransferencias.isVisible();
			this.isVisibilidadCeldaCancelarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonCancelarTransferencias.isVisible();
			this.isVisibilidadCeldaGuardarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransferencias=this.jButtonGuardarCambiosTablaTransferencias.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransferencias=this.jButtonNuevoToolBarTransferencias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=this.jButtonNuevoRelacionesToolBarTransferencias.isVisible();
			
			if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.isVisibilidadCeldaModificarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonModificarToolBarTransferencias.isVisible();
			this.isVisibilidadCeldaActualizarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonActualizarToolBarTransferencias.isVisible();
			this.isVisibilidadCeldaEliminarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonEliminarToolBarTransferencias.isVisible();
			this.isVisibilidadCeldaCancelarTransferencias=this.jInternalFrameDetalleFormTransferencias.jButtonCancelarToolBarTransferencias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransferencias=this.jButtonGuardarCambiosToolBarTransferencias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransferencias=this.jButtonGuardarCambiosTablaToolBarTransferencias.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransferencias=this.jMenuItemNuevoTransferencias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=this.jMenuItemNuevoRelacionesTransferencias.isVisible();
			
			if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.isVisibilidadCeldaModificarTransferencias=this.jInternalFrameDetalleFormTransferencias.jMenuItemModificarTransferencias.isVisible();
			this.isVisibilidadCeldaActualizarTransferencias=this.jInternalFrameDetalleFormTransferencias.jMenuItemActualizarTransferencias.isVisible();
			this.isVisibilidadCeldaEliminarTransferencias=this.jInternalFrameDetalleFormTransferencias.jMenuItemEliminarTransferencias.isVisible();
			this.isVisibilidadCeldaCancelarTransferencias=this.jInternalFrameDetalleFormTransferencias.jMenuItemCancelarTransferencias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransferencias=this.jMenuItemGuardarCambiosTransferencias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransferencias=this.jMenuItemGuardarCambiosTablaTransferencias.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransferencias(Boolean esInicializar) {
		if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
				//if(this.transferenciasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransferencias();
			}
			
			this.inicializarActualizarBindingBotonesManualTransferencias(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransferencias() {
		this.jButtonNuevoTransferencias.setVisible(this.isPermisoNuevoTransferencias);			
		this.jButtonDuplicarTransferencias.setVisible(this.isPermisoDuplicarTransferencias);			
		this.jButtonCopiarTransferencias.setVisible(this.isPermisoCopiarTransferencias);			
		this.jButtonVerFormTransferencias.setVisible(this.isPermisoVerFormTransferencias);			
		
		this.jButtonAbrirOrderByTransferencias.setVisible(this.isPermisoOrdenTransferencias);					
		
		this.jButtonNuevoRelacionesTransferencias.setVisible(this.isPermisoNuevoTransferencias);			
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonModificarTransferencias.setVisible(this.isPermisoActualizarTransferencias);	
			this.jInternalFrameDetalleFormTransferencias.jButtonActualizarTransferencias.setVisible(this.isPermisoActualizarTransferencias);	
			this.jInternalFrameDetalleFormTransferencias.jButtonEliminarTransferencias.setVisible(this.isPermisoEliminarTransferencias);
			this.jInternalFrameDetalleFormTransferencias.jButtonCancelarTransferencias.setVisible(this.isVisibilidadCeldaCancelarTransferencias);						
			this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.setVisible(this.isPermisoGuardarCambiosTransferencias);							
		}
		
		this.jButtonGuardarCambiosTablaTransferencias.setVisible(this.isPermisoActualizarTransferencias);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransferencias() {
		this.jInternalFrameDetalleFormTransferencias.jButtonModificarTransferencias.setVisible(this.isPermisoActualizarTransferencias);	
		this.jInternalFrameDetalleFormTransferencias.jButtonActualizarTransferencias.setVisible(this.isPermisoActualizarTransferencias);	
		this.jInternalFrameDetalleFormTransferencias.jButtonEliminarTransferencias.setVisible(this.isPermisoEliminarTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jButtonCancelarTransferencias.setVisible(this.isVisibilidadCeldaCancelarTransferencias);							
		this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.setVisible((this.isVisibilidadCeldaGuardarTransferencias && this.isPermisoGuardarCambiosTransferencias));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransferencias() {
		if(TransferenciasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransferencias();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransferencias() {
	}
	
	public void jTableDatosTransferenciasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransferencias(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transferencias.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransferenciasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransferencias(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferencias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferencias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transferenciasLogic.getConnexion());

				if(this.transferencias.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transferencias.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferencias=(TitledBorder)this.jScrollPanelDatosTransferencias.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransferencias.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transferencias.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonempresa_origenTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getempresa_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where empresa_origen like '%"+this.transferencias.getempresa_origen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsucursal_origenTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getsucursal_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sucursal_origen like '%"+this.transferencias.getsucursal_origen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_grupo_origenTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getsub_grupo_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_grupo_origen like '%"+this.transferencias.getsub_grupo_origen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtongrupo_origenTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getgrupo_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where grupo_origen like '%"+this.transferencias.getgrupo_origen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonactivo_origenTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getactivo_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where activo_origen like '%"+this.transferencias.getactivo_origen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonempresa_destinoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getempresa_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where empresa_destino like '%"+this.transferencias.getempresa_destino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsucursal_destinoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getsucursal_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sucursal_destino like '%"+this.transferencias.getsucursal_destino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_grupo_destinoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getsub_grupo_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_grupo_destino like '%"+this.transferencias.getsub_grupo_destino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtongrupo_destinoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getgrupo_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where grupo_destino like '%"+this.transferencias.getgrupo_destino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonactivo_destinoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getactivo_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where activo_destino like '%"+this.transferencias.getactivo_destino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.transferencias.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.transferencias.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.transferencias.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.transferencias.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondepreciacionTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getdepreciacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where depreciacion = "+this.transferencias.getdepreciacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_origenTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getcosto_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_origen = "+this.transferencias.getcosto_origen().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondepreciacion_origenTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getdepreciacion_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where depreciacion_origen = "+this.transferencias.getdepreciacion_origen().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrazonTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getrazon()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where razon like '%"+this.transferencias.getrazon()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.transferencias.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoTransferenciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.gettransferencias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferencias==null) {
						this.transferencias = new Transferencias();
					}

					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);
				}

				if(this.transferencias.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.transferencias.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferencias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaTransferenciasTransferenciasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferencias(false,false);

			this.getTransferenciassBusquedaTransferencias();

			this.inicializarActualizarBindingTransferencias(false);

			//if(TransferenciasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferencias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransferenciasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferencias(false,false);

			this.getTransferenciassFK_IdEmpresa();

			this.inicializarActualizarBindingTransferencias(false);

			//if(TransferenciasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferencias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransferencias() {
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
			this.jInternalFrameDetalleFormTransferencias.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransferencias.dispose();
			this.jInternalFrameDetalleFormTransferencias=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
			this.jInternalFrameReporteDinamicoTransferencias.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransferencias.dispose();
			this.jInternalFrameReporteDinamicoTransferencias=null;
		}
		
		if(this.jInternalFrameImportacionTransferencias!=null) {
			this.jInternalFrameImportacionTransferencias.setVisible(false);	    			
			this.jInternalFrameImportacionTransferencias.dispose();
			this.jInternalFrameImportacionTransferencias=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransferencias();
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransferencias")) {
				jButtonDuplicarTransferenciasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransferencias")) {
				jButtonCopiarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransferencias")) {
				jButtonVerFormTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransferencias")) {
				jButtonDuplicarTransferenciasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransferencias")) {
				jButtonDuplicarTransferenciasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransferencias")) {
				jButtonModificarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransferencias")) {
				jButtonModificarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransferencias")) {
				jButtonModificarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransferencias")) {
				jButtonActualizarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransferencias")) {
				jButtonActualizarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransferencias")) {
				jButtonActualizarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransferencias")) {
				jButtonEliminarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransferencias")) {
				jButtonEliminarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransferencias")) {
				jButtonEliminarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransferencias")) {
				jButtonCancelarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransferencias")) {
				jButtonCancelarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransferencias")) {
				jButtonCancelarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransferencias")) {
				jButtonCerrarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransferencias")) {
				jButtonCerrarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransferencias")) {
				jButtonCerrarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransferencias")) {
				jButtonMostrarOcultarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransferencias")) {
				jButtonCancelarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransferencias")) {
				jButtonCopiarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransferencias")) {
				jButtonVerFormTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransferencias")) {
				jButtonCopiarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransferencias")) {
				jButtonVerFormTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransferencias")) {
				jButtonRecargarInformacionTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransferencias")) {
				jButtonRecargarInformacionTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransferencias")) {
				jButtonRecargarInformacionTransferenciasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransferencias")) {
				jButtonAnterioresTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransferencias")) {
				jButtonAnterioresTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransferencias")) {
				jButtonAnterioresTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransferencias")) {
				jButtonSiguientesTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransferencias")) {
				jButtonSiguientesTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransferencias")) {
				jButtonSiguientesTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransferencias") || sTipo.equals("MenuItemDetalleAbrirOrderByTransferencias")) {
				jButtonAbrirOrderByTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransferencias") || sTipo.equals("MenuItemDetalleMostrarOcultarTransferencias")) {
				jButtonMostrarOcultarTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransferencias")) {
				jButtonNuevoGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransferencias")) {
				jButtonNuevoGuardarCambiosTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransferencias")) {
				jButtonNuevoGuardarCambiosTransferenciasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransferencias")) {
				jButtonCerrarReporteDinamicoTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransferencias")) {
				jButtonGenerarReporteDinamicoTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransferencias")) {
				
				jButtonGenerarExcelReporteDinamicoTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransferencias")) {
				jButtonCerrarImportacionTransferenciasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransferencias")) {
				
				jButtonGenerarImportacionTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransferencias")) {
				
				jButtonAbrirImportacionTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransferencias")) {
				jComboBoxTiposAccionesTransferenciasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransferencias")) {
				jComboBoxTiposRelacionesTransferenciasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransferencias")) {
				jComboBoxTiposAccionesTransferenciasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransferencias")) {
				
				jComboBoxTiposSeleccionarTransferenciasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransferencias")) {
				jTextFieldValorCampoGeneralTransferenciasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransferencias")) {
				jButtonAbrirOrderByTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransferencias")) {
				jButtonAbrirOrderByTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransferencias")) {
				jButtonCerrarOrderByTransferenciasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransferenciasBusqueda")) {
				this.jButtonidTransferenciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransferenciasUpdate")) {
				this.jButtonid_empresaTransferenciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransferenciasBusqueda")) {
				this.jButtonid_empresaTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("empresa_origenTransferenciasBusqueda")) {
				this.jButtonempresa_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sucursal_origenTransferenciasBusqueda")) {
				this.jButtonsucursal_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_grupo_origenTransferenciasBusqueda")) {
				this.jButtonsub_grupo_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("grupo_origenTransferenciasBusqueda")) {
				this.jButtongrupo_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("activo_origenTransferenciasBusqueda")) {
				this.jButtonactivo_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("empresa_destinoTransferenciasBusqueda")) {
				this.jButtonempresa_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sucursal_destinoTransferenciasBusqueda")) {
				this.jButtonsucursal_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_grupo_destinoTransferenciasBusqueda")) {
				this.jButtonsub_grupo_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("grupo_destinoTransferenciasBusqueda")) {
				this.jButtongrupo_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("activo_destinoTransferenciasBusqueda")) {
				this.jButtonactivo_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialTransferenciasBusqueda")) {
				this.jButtonsecuencialTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaTransferenciasBusqueda")) {
				this.jButtonfechaTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoTransferenciasBusqueda")) {
				this.jButtonnumero_documentoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoTransferenciasBusqueda")) {
				this.jButtoncostoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("depreciacionTransferenciasBusqueda")) {
				this.jButtondepreciacionTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_origenTransferenciasBusqueda")) {
				this.jButtoncosto_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("depreciacion_origenTransferenciasBusqueda")) {
				this.jButtondepreciacion_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("razonTransferenciasBusqueda")) {
				this.jButtonrazonTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTransferenciasBusqueda")) {
				this.jButtondescripcionTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoTransferenciasBusqueda")) {
				this.jButtontipoTransferenciasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaTransferenciasTransferencias")) {
				this.jButtonBusquedaTransferenciasTransferenciasActionPerformed(evt);
			}
			
			;
			
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransferencias();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Transferencias transferenciasLocal=null;
			
			if(!this.getEsControlTabla()) {
				transferenciasLocal=this.transferencias;
			} else {
				transferenciasLocal=this.transferenciasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
							
				
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasAnterior =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasAnterior =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
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
			
			


			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
								
						
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
								
				
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasAnterior =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasAnterior =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasAnterior =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasAnterior =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
							
				
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasAnterior =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transferenciasAnterior =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
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
			
			


			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
								
				
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasAnterior =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasAnterior =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransferencias")) {
					jCheckBoxSeleccionarTodosTransferenciasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransferencias")) {
					jCheckBoxSeleccionadosTransferenciasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransferencias")) {
					
				}
				
				


				
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
												
				
				


				
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasAnterior =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transferenciasAnterior =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
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
			
			


			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferencias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferencias);
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
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
				
				


				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transferencias.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transferencias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasAnterior =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasAnterior =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransferencias")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransferenciasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransferencias.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transferencias =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transferencias =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transferencias);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransferencias")) {
				
				}
				
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransferencias")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransferencias.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransferencias")) {
			
			}
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransferencias();
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
			if(sTipo.equals("NuevoTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransferencias")) {
				jButtonDuplicarTransferenciasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransferencias")) {
				jButtonCopiarTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransferencias")) {
				jButtonVerFormTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransferencias")) {
				jButtonNuevoTransferenciasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransferencias")) {
				jButtonModificarTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransferencias")) {
				jButtonActualizarTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransferencias")) {
				jButtonEliminarTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransferencias")) {
				jButtonCancelarTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransferencias")) {
				jButtonCerrarTransferenciasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransferencias")) {
				jButtonGuardarCambiosTransferenciasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransferencias")) {
				jButtonNuevoGuardarCambiosTransferenciasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransferencias")) {
				jButtonAbrirOrderByTransferenciasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransferencias")) {
				jButtonRecargarInformacionTransferenciasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransferencias")) {
				jButtonAnterioresTransferenciasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransferencias")) {
				jButtonSiguientesTransferenciasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransferenciasBusqueda")) {
				this.jButtonidTransferenciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransferenciasUpdate")) {
				this.jButtonid_empresaTransferenciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransferenciasBusqueda")) {
				this.jButtonid_empresaTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("empresa_origenTransferenciasBusqueda")) {
				this.jButtonempresa_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sucursal_origenTransferenciasBusqueda")) {
				this.jButtonsucursal_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_grupo_origenTransferenciasBusqueda")) {
				this.jButtonsub_grupo_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("grupo_origenTransferenciasBusqueda")) {
				this.jButtongrupo_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("activo_origenTransferenciasBusqueda")) {
				this.jButtonactivo_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("empresa_destinoTransferenciasBusqueda")) {
				this.jButtonempresa_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sucursal_destinoTransferenciasBusqueda")) {
				this.jButtonsucursal_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_grupo_destinoTransferenciasBusqueda")) {
				this.jButtonsub_grupo_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("grupo_destinoTransferenciasBusqueda")) {
				this.jButtongrupo_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("activo_destinoTransferenciasBusqueda")) {
				this.jButtonactivo_destinoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialTransferenciasBusqueda")) {
				this.jButtonsecuencialTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaTransferenciasBusqueda")) {
				this.jButtonfechaTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoTransferenciasBusqueda")) {
				this.jButtonnumero_documentoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoTransferenciasBusqueda")) {
				this.jButtoncostoTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("depreciacionTransferenciasBusqueda")) {
				this.jButtondepreciacionTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_origenTransferenciasBusqueda")) {
				this.jButtoncosto_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("depreciacion_origenTransferenciasBusqueda")) {
				this.jButtondepreciacion_origenTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("razonTransferenciasBusqueda")) {
				this.jButtonrazonTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTransferenciasBusqueda")) {
				this.jButtondescripcionTransferenciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoTransferenciasBusqueda")) {
				this.jButtontipoTransferenciasBusquedaActionPerformed(evt);
			}
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransferencias();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransferencias")) {
				closingInternalFrameTransferencias();
				
			} else if(sTipo.equals("jButtonCancelarTransferencias")) {
				JInternalFrameBase jInternalFrameDetalleFormTransferencias = (JInternalFrameBase)evt.getSource();
	            	
	            TransferenciasBeanSwingJInternalFrame jInternalFrameParent=(TransferenciasBeanSwingJInternalFrame)jInternalFrameDetalleFormTransferencias.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransferenciasActionPerformed(null);
			}
			
			TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transferencias,new Object(),this.transferenciasParameterGeneral,this.transferenciasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransferencias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransferencias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransferencias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transferencias)) {
			if(!esControlTabla) {
				if(TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);			
				}
				
				if(this.transferenciasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransferencias(this.transferencias,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransferencias(this.transferenciasReturnGeneral,this.transferenciasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transferenciasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransferencias(classes,this.transferenciasReturnGeneral,this.transferenciasBean,false);
					}
						
					if(this.transferenciasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransferencias(this.transferenciasReturnGeneral.getTransferencias());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransferencias(this.transferenciasReturnGeneral.getTransferencias());	
					}
						
					if(this.transferenciasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransferencias(this.transferenciasReturnGeneral.getTransferencias(),classes);//this.transferenciasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransferencias(this.transferencias,classes);//this.transferenciasBean);									
				}
			
				if(TransferenciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransferencias(this.transferencias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferencias(this.transferencias);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transferenciasAnterior!=null) {
						this.transferencias=this.transferenciasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transferenciasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transferenciasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transferenciasReturnGeneral.getTransferencias(),transferenciasLogic.getTransferenciass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transferenciasReturnGeneral.getTransferencias(),this.transferenciass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransferencias.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransferencias.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransferencias();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransferencias() throws Exception {
		
		TransferenciasModel transferenciasModel=(TransferenciasModel)this.jTableDatosTransferencias.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transferenciasModel.transferenciass=this.transferenciasLogic.getTransferenciass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transferenciasModel.transferenciass=this.transferenciass;
		}
		
		
		((TransferenciasModel) this.jTableDatosTransferencias.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransferencias() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransferenciasAnterior(),this.transferenciasLogic.getTransferenciass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransferenciasAnterior(),this.transferenciass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransferencias();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransferencias(Transferencias transferencias,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
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
										
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transferencias,new Object(),generalEntityParameterGeneral,this.transferenciasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransferenciasConstantesFunciones.getClassesRelationshipsOfTransferencias(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransferenciasConstantesFunciones.getClassesRelationshipsFromStringsOfTransferencias(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransferencias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransferenciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transferencias,new Object(),generalEntityParameterGeneral,this.transferenciasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransferencias(TransferenciasBean transferenciasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransferencias(ArrayList<Classe> classes,TransferenciasReturnGeneral transferenciasReturnGeneral,TransferenciasBean transferenciasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransferencias(Transferencias transferencias,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transferencias)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransferencias = new TransferenciasDetalleFormJInternalFrame(jDesktopPane,this.transferenciasSessionBean.getConGuardarRelaciones(),this.transferenciasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransferencias);
		this.jInternalFrameDetalleFormTransferencias.setVisible(false);
		this.jInternalFrameDetalleFormTransferencias.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransferencias.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransferencias.transferenciasLogic=this.transferenciasLogic;
		
		this.cargarCombosFrameForeignKeyTransferencias("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransferencias();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransferencias();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransferencias("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransferencias();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransferencias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransferencias"));
		
		this.jInternalFrameDetalleFormTransferencias.jButtonModificarTransferencias.addActionListener(new ButtonActionListener(this,"ModificarTransferencias"));

		
		this.jInternalFrameDetalleFormTransferencias.jButtonModificarToolBarTransferencias.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransferencias"));
					
		this.jInternalFrameDetalleFormTransferencias.jMenuItemModificarTransferencias.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransferencias"));		
		
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonActualizarTransferencias.addActionListener (new ButtonActionListener(this,"ActualizarTransferencias"));
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonActualizarToolBarTransferencias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransferencias"));
						
		this.jInternalFrameDetalleFormTransferencias.jMenuItemActualizarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransferencias"));		
		
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonEliminarTransferencias.addActionListener (new ButtonActionListener(this,"EliminarTransferencias"));
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonEliminarToolBarTransferencias.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransferencias"));
								
		this.jInternalFrameDetalleFormTransferencias.jMenuItemEliminarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransferencias"));		
		
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonCancelarTransferencias.addActionListener (new ButtonActionListener(this,"CancelarTransferencias"));
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonCancelarToolBarTransferencias.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransferencias"));
					
		this.jInternalFrameDetalleFormTransferencias.jMenuItemCancelarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransferencias"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransferencias.jMenuItemDetalleCerrarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransferencias"));		
		
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosToolBarTransferencias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransferencias"));
		
		
		
		this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosToolBarTransferencias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransferencias"));
		
		
		
		this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransferencias"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonidTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"idTransferenciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferencias.jButtonid_empresaTransferenciasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonid_empresaTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonempresa_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"empresa_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsucursal_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sucursal_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsub_grupo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sub_grupo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtongrupo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"grupo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonactivo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"activo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonempresa_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"empresa_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsucursal_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sucursal_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsub_grupo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sub_grupo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtongrupo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"grupo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonactivo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"activo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsecuencialTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"secuencialTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonfechaTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"fechaTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonnumero_documentoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtoncostoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"costoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondepreciacionTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"depreciacionTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtoncosto_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"costo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondepreciacion_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"depreciacion_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonrazonTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"razonTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondescripcionTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtontipoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"tipoTransferenciasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransferencias"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransferencias"));
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransferencias"));
		}
		
		this.jTableDatosTransferencias.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransferencias"));
		
		this.jTableDatosTransferencias.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransferencias"));
		
		this.jButtonNuevoTransferencias.addActionListener(new ButtonActionListener(this,"NuevoTransferencias"));
		
		this.jButtonDuplicarTransferencias.addActionListener(new ButtonActionListener(this,"DuplicarTransferencias"));
		
		this.jButtonCopiarTransferencias.addActionListener(new ButtonActionListener(this,"CopiarTransferencias"));
		
		this.jButtonVerFormTransferencias.addActionListener(new ButtonActionListener(this,"VerFormTransferencias"));
		
		
		this.jButtonNuevoToolBarTransferencias.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransferencias"));
			
		this.jButtonDuplicarToolBarTransferencias.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransferencias"));
			
		this.jMenuItemNuevoTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransferencias"));
			
		this.jMenuItemDuplicarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransferencias"));		
		
		
		this.jButtonNuevoRelacionesTransferencias.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransferencias"));
		
		
		this.jButtonNuevoRelacionesToolBarTransferencias.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransferencias"));
			
		this.jMenuItemNuevoRelacionesTransferencias.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransferencias"));		
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonModificarTransferencias.addActionListener(new ButtonActionListener(this,"ModificarTransferencias"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonModificarToolBarTransferencias.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransferencias"));
			
			this.jInternalFrameDetalleFormTransferencias.jMenuItemModificarTransferencias.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransferencias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransferencias.jButtonActualizarTransferencias.addActionListener (new ButtonActionListener(this,"ActualizarTransferencias"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonActualizarToolBarTransferencias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransferencias"));
				
			this.jInternalFrameDetalleFormTransferencias.jMenuItemActualizarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransferencias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonEliminarTransferencias.addActionListener (new ButtonActionListener(this,"EliminarTransferencias"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonEliminarToolBarTransferencias.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransferencias"));
						
			this.jInternalFrameDetalleFormTransferencias.jMenuItemEliminarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransferencias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonCancelarTransferencias.addActionListener (new ButtonActionListener(this,"CancelarTransferencias"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonCancelarToolBarTransferencias.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransferencias"));
			
			this.jInternalFrameDetalleFormTransferencias.jMenuItemCancelarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransferencias"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransferencias.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransferencias"));		
		
		
		this.jButtonCerrarTransferencias.addActionListener (new ButtonActionListener(this,"CerrarTransferencias"));
		
		
		this.jButtonCerrarToolBarTransferencias.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransferencias"));
			
		this.jMenuItemCerrarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransferencias"));
			
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jMenuItemDetalleCerrarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransferencias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransferencias"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosToolBarTransferencias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransferencias"));
		}
		
		this.jButtonCopiarToolBarTransferencias.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransferencias"));
			
		this.jButtonVerFormToolBarTransferencias.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransferencias"));
		
		this.jMenuItemGuardarCambiosTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransferencias"));
			
		this.jMenuItemCopiarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransferencias"));		
		
		this.jMenuItemVerFormTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransferencias"));		
		
		
		this.jButtonGuardarCambiosTablaTransferencias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransferencias"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransferencias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransferencias"));
			
		this.jMenuItemGuardarCambiosTablaTransferencias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransferencias"));		
		
		
		
		this.jButtonRecargarInformacionTransferencias.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransferencias"));
					
		this.jButtonRecargarInformacionToolBarTransferencias.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransferencias"));
		
		this.jMenuItemRecargarInformacionTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransferencias"));		
		
		
		
		this.jButtonAnterioresTransferencias.addActionListener (new ButtonActionListener(this,"AnterioresTransferencias"));
		
		
		this.jButtonAnterioresToolBarTransferencias.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransferencias"));
		
		this.jMenuItemAnterioresTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransferencias"));		
		
		
		this.jButtonSiguientesTransferencias.addActionListener (new ButtonActionListener(this,"SiguientesTransferencias"));
		
		
		this.jButtonSiguientesToolBarTransferencias.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransferencias"));
			
		this.jMenuItemSiguientesTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransferencias"));
			
		this.jMenuItemAbrirOrderByTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransferencias"));
			
		this.jMenuItemMostrarOcultarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransferencias"));
			
		this.jMenuItemDetalleAbrirOrderByTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransferencias"));
			
		this.jMenuItemDetalleMostarOcultarTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransferencias"));		
		
		
		this.jButtonNuevoGuardarCambiosTransferencias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransferencias"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransferencias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransferencias"));
			
		this.jMenuItemNuevoGuardarCambiosTransferencias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransferencias"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransferencias.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransferencias"));

		this.jCheckBoxSeleccionadosTransferencias.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransferencias"));
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransferencias"));
		}
		
		
		this.jComboBoxTiposRelacionesTransferencias.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransferencias"));
			
		this.jComboBoxTiposAccionesTransferencias.addActionListener (new ButtonActionListener(this,"TiposAccionesTransferencias"));
					
		this.jComboBoxTiposSeleccionarTransferencias.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransferencias"));
			
		this.jTextFieldValorCampoGeneralTransferencias.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransferencias"));		
		
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonidTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"idTransferenciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferencias.jButtonid_empresaTransferenciasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonid_empresaTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonempresa_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"empresa_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsucursal_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sucursal_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsub_grupo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sub_grupo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtongrupo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"grupo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonactivo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"activo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonempresa_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"empresa_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsucursal_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sucursal_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsub_grupo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sub_grupo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtongrupo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"grupo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonactivo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"activo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsecuencialTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"secuencialTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonfechaTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"fechaTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonnumero_documentoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtoncostoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"costoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondepreciacionTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"depreciacionTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtoncosto_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"costo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondepreciacion_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"depreciacion_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonrazonTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"razonTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondescripcionTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtontipoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"tipoTransferenciasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaTransferenciasTransferencias.addActionListener(new ButtonActionListener(this,"BusquedaTransferenciasTransferencias"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransferencias!=null) {
				this.jInternalFrameReporteDinamicoTransferencias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransferencias"));
				this.jInternalFrameReporteDinamicoTransferencias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransferencias"));
				this.jInternalFrameReporteDinamicoTransferencias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransferencias"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransferencias.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransferencias"));				
			//this.jButtonGenerarReporteDinamicoTransferencias.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransferencias"));
			//this.jButtonGenerarExcelReporteDinamicoTransferencias.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransferencias"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransferencias!=null) {
				this.jInternalFrameImportacionTransferencias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransferencias"));
				this.jInternalFrameImportacionTransferencias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransferencias"));
				this.jInternalFrameImportacionTransferencias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransferencias"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransferencias.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransferencias"));
			
			this.jButtonAbrirOrderByToolBarTransferencias.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransferencias"));			
			
			if(this.jInternalFrameOrderByTransferencias!=null) {
				this.jInternalFrameOrderByTransferencias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransferencias"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransferencias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferencias.jTabbedPaneRelacionesTransferencias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransferencias"));
		
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
            		closingInternalFrameTransferencias();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransferencias.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransferencias = (JInternalFrameBase)event.getSource();
	            	
	            TransferenciasBeanSwingJInternalFrame jInternalFrameParent=(TransferenciasBeanSwingJInternalFrame)jInternalFrameDetalleFormTransferencias.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransferenciasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransferencias.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransferenciasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransferencias.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransferencias.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransferencias";
		inputMap = this.jButtonNuevoTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransferenciasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransferencias";
		inputMap = this.jButtonNuevoRelacionesTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransferenciasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransferencias";
		inputMap = this.jButtonModificarTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransferenciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransferencias";
		inputMap = this.jButtonActualizarTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransferenciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransferencias";
		inputMap = this.jButtonEliminarTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransferenciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransferencias";
		inputMap = this.jButtonCancelarTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransferenciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransferencias";
		inputMap = this.jButtonCerrarTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransferenciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransferencias";
		inputMap = this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransferencias.jButtonGuardarCambiosTransferencias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransferenciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransferencias.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransferenciasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransferencias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransferenciasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransferencias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransferenciasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransferencias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransferenciasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonidTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"idTransferenciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferencias.jButtonid_empresaTransferenciasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonid_empresaTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonempresa_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"empresa_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsucursal_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sucursal_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsub_grupo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sub_grupo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtongrupo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"grupo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonactivo_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"activo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonempresa_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"empresa_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsucursal_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sucursal_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsub_grupo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"sub_grupo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtongrupo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"grupo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonactivo_destinoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"activo_destinoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonsecuencialTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"secuencialTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonfechaTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"fechaTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonnumero_documentoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtoncostoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"costoTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondepreciacionTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"depreciacionTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtoncosto_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"costo_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondepreciacion_origenTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"depreciacion_origenTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtonrazonTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"razonTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtondescripcionTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTransferenciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferencias.jButtontipoTransferenciasBusqueda.addActionListener(new ButtonActionListener(this,"tipoTransferenciasBusqueda"));
		
		
		this.jButtonBusquedaTransferenciasTransferencias.addActionListener(new ButtonActionListener(this,"BusquedaTransferenciasTransferencias"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransferencias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransferenciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransferenciasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransferencias.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransferencias(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
					transferenciasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transferencias transferenciasAux:transferenciass) {
					transferenciasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransferenciasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransferencias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
						transferenciasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transferencias transferenciasAux:transferenciass) {
						transferenciasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transferencias transferenciasAux:transferenciass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransferencias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransferencias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransferencias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransferenciasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransferencias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransferencias.getSelectedRows();
			
			Transferencias transferenciasLocal=new Transferencias();
			
			//this.seleccionarTodosTransferencias(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transferenciasLocal =(Transferencias) this.transferenciasLogic.getTransferenciass().toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transferenciasLocal =(Transferencias) this.transferenciass.toArray()[this.jTableDatosTransferencias.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transferenciasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
						transferenciasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transferencias transferenciasAux:transferenciass) {
						transferenciasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransferencias(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransferencias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransferencias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransferencias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransferenciasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransferenciasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransferenciasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransferencias(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransferencias.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transferencias transferenciasAux:this.transferenciasLogic.getTransferenciass()) {
				
						if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN)) {
							existe=true;
							transferenciasAux.setempresa_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN)) {
							existe=true;
							transferenciasAux.setsucursal_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN)) {
							existe=true;
							transferenciasAux.setsub_grupo_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN)) {
							existe=true;
							transferenciasAux.setgrupo_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN)) {
							existe=true;
							transferenciasAux.setactivo_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO)) {
							existe=true;
							transferenciasAux.setempresa_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO)) {
							existe=true;
							transferenciasAux.setsucursal_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO)) {
							existe=true;
							transferenciasAux.setsub_grupo_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO)) {
							existe=true;
							transferenciasAux.setgrupo_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO)) {
							existe=true;
							transferenciasAux.setactivo_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							transferenciasAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							transferenciasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							transferenciasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							transferenciasAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_DEPRECIACION)) {
							existe=true;
							transferenciasAux.setdepreciacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_COSTOORIGEN)) {
							existe=true;
							transferenciasAux.setcosto_origen(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN)) {
							existe=true;
							transferenciasAux.setdepreciacion_origen(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_RAZON)) {
							existe=true;
							transferenciasAux.setrazon(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							transferenciasAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							transferenciasAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transferencias transferenciasAux:transferenciass) {
					
						if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN)) {
							existe=true;
							transferenciasAux.setempresa_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN)) {
							existe=true;
							transferenciasAux.setsucursal_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN)) {
							existe=true;
							transferenciasAux.setsub_grupo_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN)) {
							existe=true;
							transferenciasAux.setgrupo_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN)) {
							existe=true;
							transferenciasAux.setactivo_origen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO)) {
							existe=true;
							transferenciasAux.setempresa_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO)) {
							existe=true;
							transferenciasAux.setsucursal_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO)) {
							existe=true;
							transferenciasAux.setsub_grupo_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO)) {
							existe=true;
							transferenciasAux.setgrupo_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO)) {
							existe=true;
							transferenciasAux.setactivo_destino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							transferenciasAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							transferenciasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							transferenciasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							transferenciasAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_DEPRECIACION)) {
							existe=true;
							transferenciasAux.setdepreciacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_COSTOORIGEN)) {
							existe=true;
							transferenciasAux.setcosto_origen(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN)) {
							existe=true;
							transferenciasAux.setdepreciacion_origen(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_RAZON)) {
							existe=true;
							transferenciasAux.setrazon(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							transferenciasAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							transferenciasAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransferencias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransferenciasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransferencias(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransferencias=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransferencias.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransferencias) {				
					conSplash=true;//false;										
					
					//this.startProcessTransferencias(conSplash);
				
					this.generarReporteTransferenciassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransferenciassSeleccionados();
				//this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransferenciassSeleccionados(false);
				//this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransferenciassSeleccionados(true);
				//this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransferencias();
				
				this.exportarTransferenciassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransferenciass();
				//this.importarTransferenciass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransferencias();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransferenciassSeleccionados();
				//this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transferencias", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransferencias();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransferencias)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransferencias(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.setSelectedIndex(0);					
				}	
			} 			
			else if(TransferenciasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransferencias) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransferencias(conSplash);
					
						//this.actualizarParametrosGeneralTransferencias();
						
						this.generarReporteProcesoAccionTransferenciassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransferenciasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TransferenciasES SELECCIONADOS?", "MANTENIMIENTO DE Transferencias", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransferencias();
				
						this.actualizarParametrosGeneralTransferencias();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transferenciasReturnGeneral=transferenciasLogic.procesarAccionTransferenciassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transferenciasLogic.getTransferenciass(),this.transferenciasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransferenciasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransferencias();
					
					TransferenciasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransferenciasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransferencias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransferencias.jComboBoxTiposAccionesFormularioTransferencias.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransferencias(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransferenciasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransferencias();
			
			if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
			Transferencias transferencias=new Transferencias();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransferencias(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransferencias.getSelectedItem();
			
			
			
			
			transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
			//this.sTipoAccion;
			
			if(transferenciassSeleccionados.size()==1) {
				for(Transferencias transferenciasAux:transferenciassSeleccionados) {
					transferencias=transferenciasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransferencias();
			
      		//this.finishProcessTransferencias(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransferenciasReturnGeneral() throws Exception {
		if(this.transferenciasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transferenciasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transferenciasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transferenciasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transferenciasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transferenciasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransferencias(false);
		}
		
		if(this.transferenciasReturnGeneral.getConRetornoLista() || this.transferenciasReturnGeneral.getConRetornoObjeto()) {
			if(this.transferenciasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transferenciasLogic.setTransferenciass(this.transferenciasReturnGeneral.getTransferenciass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingTransferencias(false);
		}
	}
	
	public void actualizarParametrosGeneralTransferencias() throws Exception {
		
		
	}
	
	public ArrayList<Transferencias> getTransferenciassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransferencias) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Transferencias transferenciasAux:transferenciasLogic.getTransferenciass()) {
					if(transferenciasAux.getIsSelected()) {
						transferenciassSeleccionados.add(transferenciasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transferencias transferenciasAux:this.transferenciass) {
					if(transferenciasAux.getIsSelected()) {
						transferenciassSeleccionados.add(transferenciasAux);				
					}
				}
			}
			
			if(transferenciassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transferenciassSeleccionados.addAll(this.transferenciasLogic.getTransferenciass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transferenciassSeleccionados.addAll(this.transferenciass);				
					}
				}
			}
		} else {
			transferenciassSeleccionados.add(this.transferencias);
		}
		
		return transferenciassSeleccionados;
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
	
	public void generarReporteTransferenciassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransferenciassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransferenciassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransferenciassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransferenciassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transferencias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransferenciassSeleccionados() throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransferenciass("Todos",transferenciassSeleccionados);
		
	}	
	
	public void generarReporteNormalTransferenciassSeleccionados() throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransferenciass("Todos",transferenciassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransferenciassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransferenciass("Todos",transferenciassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransferenciassSeleccionados() throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransferencias();
		
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransferencias();
		
		
		//this.generarReporteTransferenciass("Todos",transferenciassSeleccionados ,transferenciasImplementable,transferenciasImplementableHome);
	}
	
	public void mostrarImportacionTransferenciass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransferencias();
		
		this.abrirFrameImportacionTransferencias();		
		
			
		//this.generarReporteTransferenciass("Todos",transferenciassSeleccionados ,transferenciasImplementable,transferenciasImplementableHome);
	}
	
	public void importarTransferenciass() throws Exception {		
	
	}
	
	public void exportarTransferenciassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransferenciassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransferenciassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransferenciassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transferencias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransferenciassSeleccionados() throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferencias."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransferencias(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Transferencias transferenciasAux:transferenciassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransferencias(transferenciasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transferenciasAux.setsDetalleGeneralEntityReporte(transferenciasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransferencias(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_GRUPODESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_DEPRECIACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_COSTOORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_RAZON;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransferencias(Transferencias transferencias,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transferencias.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getempresa_origen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getsucursal_origen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getsub_grupo_origen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getgrupo_origen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getactivo_origen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getempresa_destino();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getsucursal_destino();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getsub_grupo_destino();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getgrupo_destino();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getactivo_destino();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getdepreciacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getcosto_origen().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getdepreciacion_origen().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getrazon();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferencias.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransferenciassSeleccionados() throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferencias.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Transferenciass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransferencias(row);				
				iRow++;
			}				
			
			for(Transferencias transferenciasAux:transferenciassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransferencias(transferenciasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransferenciassSeleccionados() throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();		
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferencias.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transferenciass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transferencias");
			//elementRoot.appendChild(element);
		
			for(Transferencias transferenciasAux:transferenciassSeleccionados) {
				element = document.createElement("transferencias");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransferencias(transferenciasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransferencias(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DEPRECIACION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_COSTOORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_RAZON);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransferencias(Transferencias transferencias,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getempresa_origen());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getsucursal_origen());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getsub_grupo_origen());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getgrupo_origen());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getactivo_origen());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getempresa_destino());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getsucursal_destino());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getsub_grupo_destino());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getgrupo_destino());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getactivo_destino());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getdepreciacion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getcosto_origen());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getdepreciacion_origen());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getrazon());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferencias.gettipo());				
	}
	
	public void setFilaDatosExportarXmlTransferencias(Transferencias transferencias,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransferenciasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transferencias.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransferenciasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transferencias.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransferenciasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transferencias.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempresa_origen = document.createElement(TransferenciasConstantesFunciones.EMPRESAORIGEN);
		elementempresa_origen.appendChild(document.createTextNode(transferencias.getempresa_origen().trim()));
		element.appendChild(elementempresa_origen);

		Element elementsucursal_origen = document.createElement(TransferenciasConstantesFunciones.SUCURSALORIGEN);
		elementsucursal_origen.appendChild(document.createTextNode(transferencias.getsucursal_origen().trim()));
		element.appendChild(elementsucursal_origen);

		Element elementsub_grupo_origen = document.createElement(TransferenciasConstantesFunciones.SUBGRUPOORIGEN);
		elementsub_grupo_origen.appendChild(document.createTextNode(transferencias.getsub_grupo_origen().trim()));
		element.appendChild(elementsub_grupo_origen);

		Element elementgrupo_origen = document.createElement(TransferenciasConstantesFunciones.GRUPOORIGEN);
		elementgrupo_origen.appendChild(document.createTextNode(transferencias.getgrupo_origen().trim()));
		element.appendChild(elementgrupo_origen);

		Element elementactivo_origen = document.createElement(TransferenciasConstantesFunciones.ACTIVOORIGEN);
		elementactivo_origen.appendChild(document.createTextNode(transferencias.getactivo_origen().trim()));
		element.appendChild(elementactivo_origen);

		Element elementempresa_destino = document.createElement(TransferenciasConstantesFunciones.EMPRESADESTINO);
		elementempresa_destino.appendChild(document.createTextNode(transferencias.getempresa_destino().trim()));
		element.appendChild(elementempresa_destino);

		Element elementsucursal_destino = document.createElement(TransferenciasConstantesFunciones.SUCURSALDESTINO);
		elementsucursal_destino.appendChild(document.createTextNode(transferencias.getsucursal_destino().trim()));
		element.appendChild(elementsucursal_destino);

		Element elementsub_grupo_destino = document.createElement(TransferenciasConstantesFunciones.SUBGRUPODESTINO);
		elementsub_grupo_destino.appendChild(document.createTextNode(transferencias.getsub_grupo_destino().trim()));
		element.appendChild(elementsub_grupo_destino);

		Element elementgrupo_destino = document.createElement(TransferenciasConstantesFunciones.GRUPODESTINO);
		elementgrupo_destino.appendChild(document.createTextNode(transferencias.getgrupo_destino().trim()));
		element.appendChild(elementgrupo_destino);

		Element elementactivo_destino = document.createElement(TransferenciasConstantesFunciones.ACTIVODESTINO);
		elementactivo_destino.appendChild(document.createTextNode(transferencias.getactivo_destino().trim()));
		element.appendChild(elementactivo_destino);

		Element elementsecuencial = document.createElement(TransferenciasConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(transferencias.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(TransferenciasConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(transferencias.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnumero_documento = document.createElement(TransferenciasConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(transferencias.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementcosto = document.createElement(TransferenciasConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(transferencias.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementdepreciacion = document.createElement(TransferenciasConstantesFunciones.DEPRECIACION);
		elementdepreciacion.appendChild(document.createTextNode(transferencias.getdepreciacion().toString().trim()));
		element.appendChild(elementdepreciacion);

		Element elementcosto_origen = document.createElement(TransferenciasConstantesFunciones.COSTOORIGEN);
		elementcosto_origen.appendChild(document.createTextNode(transferencias.getcosto_origen().toString().trim()));
		element.appendChild(elementcosto_origen);

		Element elementdepreciacion_origen = document.createElement(TransferenciasConstantesFunciones.DEPRECIACIONORIGEN);
		elementdepreciacion_origen.appendChild(document.createTextNode(transferencias.getdepreciacion_origen().toString().trim()));
		element.appendChild(elementdepreciacion_origen);

		Element elementrazon = document.createElement(TransferenciasConstantesFunciones.RAZON);
		elementrazon.appendChild(document.createTextNode(transferencias.getrazon().trim()));
		element.appendChild(elementrazon);

		Element elementdescripcion = document.createElement(TransferenciasConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(transferencias.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementtipo = document.createElement(TransferenciasConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(transferencias.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoTransferenciassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Transferencias> transferenciassSeleccionados=new ArrayList<Transferencias>();
		
		transferenciassSeleccionados=this.getTransferenciassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransferencias(transferenciassSeleccionados);
		
		this.generarReporteTransferenciass("Todos",transferenciassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransferencias(ArrayList<Transferencias> transferenciassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Transferencias transferenciasAux:transferenciassSeleccionados) {
				transferenciasAux.setsDetalleGeneralEntityReporte(transferenciasAux.toString());
			
				if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getempresa_origen());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getsucursal_origen());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getsub_grupo_origen());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getgrupo_origen());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getactivo_origen());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getempresa_destino());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getsucursal_destino());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getsub_grupo_destino());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getgrupo_destino());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getactivo_destino());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(transferenciasAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getnumero_documento());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_RAZON)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getrazon());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					transferenciasAux.setsDescripcionGeneralEntityReporte1(transferenciasAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransferencias(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransferencias=true;
				this.isVisibilidadCeldaNuevoRelacionesTransferencias=true;
				this.isVisibilidadCeldaGuardarCambiosTransferencias=true;
			}
			
			this.isVisibilidadCeldaModificarTransferencias=false;
			this.isVisibilidadCeldaActualizarTransferencias=false;
			this.isVisibilidadCeldaEliminarTransferencias=false;
			this.isVisibilidadCeldaCancelarTransferencias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferencias=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransferencias=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
			this.isVisibilidadCeldaModificarTransferencias=false;
			this.isVisibilidadCeldaActualizarTransferencias=true;
			this.isVisibilidadCeldaEliminarTransferencias=false;
			this.isVisibilidadCeldaCancelarTransferencias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferencias=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransferencias=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
			this.isVisibilidadCeldaModificarTransferencias=false;
			this.isVisibilidadCeldaActualizarTransferencias=true;
			this.isVisibilidadCeldaEliminarTransferencias=true;
			this.isVisibilidadCeldaCancelarTransferencias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferencias=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransferencias=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
			this.isVisibilidadCeldaModificarTransferencias=false;
			this.isVisibilidadCeldaActualizarTransferencias=true;
			this.isVisibilidadCeldaEliminarTransferencias=false;
			this.isVisibilidadCeldaCancelarTransferencias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				} else {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransferencias=true;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=true;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=true;
			this.isVisibilidadCeldaModificarTransferencias=false;
			this.isVisibilidadCeldaActualizarTransferencias=false;
			this.isVisibilidadCeldaEliminarTransferencias=false;
			this.isVisibilidadCeldaCancelarTransferencias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferencias=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransferencias=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
			this.isVisibilidadCeldaActualizarTransferencias=false;
			this.isVisibilidadCeldaEliminarTransferencias=false;
			this.isVisibilidadCeldaCancelarTransferencias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				} else {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransferencias=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
			this.isVisibilidadCeldaModificarTransferencias=true;
			this.isVisibilidadCeldaActualizarTransferencias=false;
			this.isVisibilidadCeldaEliminarTransferencias=false;
			this.isVisibilidadCeldaCancelarTransferencias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				} else {
					this.isVisibilidadCeldaGuardarTransferencias=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransferenciasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransferencias=true;
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=true;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=true;
		} else {
			this.actualizarEstadoPanelsTransferencias(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransferencias=false;
			//this.isVisibilidadCeldaVerFormTransferencias=false;
			this.isVisibilidadCeldaDuplicarTransferencias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transferenciasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
		} else {
			this.isVisibilidadCeldaNuevoTransferencias=false;
			this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transferenciasSessionBean.getEsGuardarRelacionado()) {
			if(!transferenciasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;												
			}
			
			this.jButtonCerrarTransferencias.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
		}
		
		if(!this.permiteMantenimiento(this.transferencias)) {
			this.isVisibilidadCeldaActualizarTransferencias=false;
			this.isVisibilidadCeldaEliminarTransferencias=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoTransferencias=false;
		this.isVisibilidadCeldaNuevoRelacionesTransferencias=false;
		this.isVisibilidadCeldaGuardarCambiosTransferencias=false;
		//this.isVisibilidadCeldaModificarTransferencias=true;
		this.isVisibilidadCeldaActualizarTransferencias=false;
		this.isVisibilidadCeldaEliminarTransferencias=false;
		//this.isVisibilidadCeldaCancelarTransferencias=true;			
		this.isVisibilidadCeldaGuardarTransferencias=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransferencias() {
	}
	
	public void actualizarEstadoPanelsTransferencias(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransferencias!=null) {
				this.jScrollPanelDatosEdicionTransferencias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferencias!=null) {
				this.jScrollPanelDatosTransferencias.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferencias!=null) {
				this.jPanelPaginacionTransferencias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransferencias!=null) {
				this.jScrollPanelDatosEdicionTransferencias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransferencias!=null) {
				this.jScrollPanelDatosTransferencias.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransferencias!=null) {
				this.jPanelPaginacionTransferencias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransferencias!=null) {
				this.jScrollPanelDatosEdicionTransferencias.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransferencias!=null) {
				this.jScrollPanelDatosTransferencias.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransferencias!=null) {
				this.jPanelPaginacionTransferencias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransferencias!=null) {
				this.jScrollPanelDatosEdicionTransferencias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransferencias!=null) {
				this.jScrollPanelDatosTransferencias.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransferencias!=null) {
				this.jPanelPaginacionTransferencias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransferencias!=null) {
				this.jScrollPanelDatosEdicionTransferencias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferencias!=null) {
				this.jScrollPanelDatosTransferencias.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferencias!=null) {
				this.jPanelPaginacionTransferencias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransferencias!=null) {
				this.jScrollPanelDatosEdicionTransferencias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferencias!=null) {
				this.jScrollPanelDatosTransferencias.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferencias!=null) {
				this.jPanelPaginacionTransferencias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransferencias!=null) {
				this.jScrollPanelDatosEdicionTransferencias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferencias!=null) {
				this.jScrollPanelDatosTransferencias.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferencias!=null) {
				this.jPanelPaginacionTransferencias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransferencias!=null) {
					this.jTabbedPaneBusquedasTransferencias.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferencias!=null) {
				this.jTabbedPaneBusquedasTransferencias.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransferencias!=null) {
				this.jPanelParametrosReportesTransferencias.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaTransferencias=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaTransferencias) {this.jTabbedPaneBusquedasTransferencias.remove(jPanelBusquedaTransferenciasTransferencias);}
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
			
			this.inicializarActualizarBindingTablaTransferencias(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransferencias() {
		this.updateBorderResaltarBusquedasFormularioTransferencias();
		this.updateVisibilidadBusquedasFormularioTransferencias();
		this.updateHabilitarBusquedasFormularioTransferencias();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransferencias() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransferencias.getComponents().length>0) {
	

		if(this.transferenciasConstantesFunciones.resaltarBusquedaTransferenciasTransferencias!=null) {
			index= this.jTabbedPaneBusquedasTransferencias.indexOfComponent(this.jPanelBusquedaTransferenciasTransferencias);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransferencias.getComponent(index);
				jPanel.setBorder(this.transferenciasConstantesFunciones.resaltarBusquedaTransferenciasTransferencias);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransferencias() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransferencias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransferencias.indexOfComponent(this.jPanelBusquedaTransferenciasTransferencias);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransferencias.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transferenciasConstantesFunciones.mostrarBusquedaTransferenciasTransferencias);
			if(!this.transferenciasConstantesFunciones.mostrarBusquedaTransferenciasTransferencias && index>-1) {
				this.jTabbedPaneBusquedasTransferencias.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransferencias() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransferencias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransferencias.indexOfComponent(this.jPanelBusquedaTransferenciasTransferencias);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransferencias.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transferenciasConstantesFunciones.activarBusquedaTransferenciasTransferencias);
				this.jTabbedPaneBusquedasTransferencias.setEnabledAt(index,this.transferenciasConstantesFunciones.activarBusquedaTransferenciasTransferencias);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransferencias(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaTransferencias")) {
			index= this.jTabbedPaneBusquedasTransferencias.indexOfComponent(this.jPanelBusquedaTransferenciasTransferencias);

			this.jTabbedPaneBusquedasTransferencias.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransferencias.getComponent(index);

			this.transferenciasConstantesFunciones.setResaltarBusquedaTransferenciasTransferencias(resaltar);

			jPanel.setBorder(this.transferenciasConstantesFunciones.resaltarBusquedaTransferenciasTransferencias);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransferencias.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransferencias() throws Exception {

		if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransferencias();
		this.updateVisibilidadResaltarControlesFormularioTransferencias();
		this.updateHabilitarResaltarControlesFormularioTransferencias();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransferencias() throws Exception {
		if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transferenciasConstantesFunciones.resaltaridTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltaridTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarid_empresaTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarid_empresaTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarempresa_origenTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarempresa_origenTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarsucursal_origenTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarsucursal_origenTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarsub_grupo_origenTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarsub_grupo_origenTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltargrupo_origenTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltargrupo_origenTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltaractivo_origenTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltaractivo_origenTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarempresa_destinoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarempresa_destinoTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarsucursal_destinoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarsucursal_destinoTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarsub_grupo_destinoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarsub_grupo_destinoTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltargrupo_destinoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltargrupo_destinoTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltaractivo_destinoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltaractivo_destinoTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarsecuencialTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarsecuencialTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarfechaTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarfechaTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarnumero_documentoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarnumero_documentoTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarcostoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarcostoTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltardepreciacionTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltardepreciacionTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarcosto_origenTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarcosto_origenTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltardepreciacion_origenTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltardepreciacion_origenTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltarrazonTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltarrazonTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltardescripcionTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltardescripcionTransferencias);}
		if(this.transferenciasConstantesFunciones.resaltartipoTransferencias!=null && this.jInternalFrameDetalleFormTransferencias!=null) {this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.setBorder(this.transferenciasConstantesFunciones.resaltartipoTransferencias);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransferencias() throws Exception {		
		if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
	
		//this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.setVisible(this.transferenciasConstantesFunciones.mostraridTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelidTransferencias.setVisible(this.transferenciasConstantesFunciones.mostraridTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarid_empresaTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelid_empresaTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarid_empresaTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarempresa_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelempresa_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarempresa_origenTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsucursal_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelsucursal_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsucursal_origenTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsub_grupo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelsub_grupo_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsub_grupo_origenTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrargrupo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelgrupo_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrargrupo_origenTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostraractivo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelactivo_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostraractivo_origenTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarempresa_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelempresa_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarempresa_destinoTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsucursal_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelsucursal_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsucursal_destinoTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsub_grupo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelsub_grupo_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsub_grupo_destinoTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrargrupo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelgrupo_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrargrupo_destinoTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostraractivo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelactivo_destinoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostraractivo_destinoTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsecuencialTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelsecuencialTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarsecuencialTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarfechaTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelfechaTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarfechaTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarnumero_documentoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelnumero_documentoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarnumero_documentoTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarcostoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelcostoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarcostoTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrardepreciacionTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPaneldepreciacionTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrardepreciacionTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarcosto_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelcosto_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarcosto_origenTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrardepreciacion_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPaneldepreciacion_origenTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrardepreciacion_origenTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarrazonTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPanelrazonTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrarrazonTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrardescripcionTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPaneldescripcionTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrardescripcionTransferencias);
		//this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrartipoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jPaneltipoTransferencias.setVisible(this.transferenciasConstantesFunciones.mostrartipoTransferencias);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransferencias() throws Exception {
		if(this.jInternalFrameDetalleFormTransferencias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransferencias!=null) {
	
		this.jInternalFrameDetalleFormTransferencias.jLabelidTransferencias.setEnabled(this.transferenciasConstantesFunciones.activaridTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jComboBoxid_empresaTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarid_empresaTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_origenTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarempresa_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_origenTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarsucursal_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_origenTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarsub_grupo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_origenTransferencias.setEnabled(this.transferenciasConstantesFunciones.activargrupo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_origenTransferencias.setEnabled(this.transferenciasConstantesFunciones.activaractivo_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreaempresa_destinoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarempresa_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasucursal_destinoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarsucursal_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreasub_grupo_destinoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarsub_grupo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreagrupo_destinoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activargrupo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreaactivo_destinoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activaractivo_destinoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldsecuencialTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarsecuencialTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jDateChooserfechaTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarfechaTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldnumero_documentoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarnumero_documentoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldcostoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarcostoTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacionTransferencias.setEnabled(this.transferenciasConstantesFunciones.activardepreciacionTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldcosto_origenTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarcosto_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFielddepreciacion_origenTransferencias.setEnabled(this.transferenciasConstantesFunciones.activardepreciacion_origenTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextArearazonTransferencias.setEnabled(this.transferenciasConstantesFunciones.activarrazonTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextAreadescripcionTransferencias.setEnabled(this.transferenciasConstantesFunciones.activardescripcionTransferencias);
		this.jInternalFrameDetalleFormTransferencias.jTextFieldtipoTransferencias.setEnabled(this.transferenciasConstantesFunciones.activartipoTransferencias);
		}
	}
	
		
}