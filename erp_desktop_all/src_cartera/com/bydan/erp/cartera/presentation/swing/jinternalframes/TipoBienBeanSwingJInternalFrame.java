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

import com.bydan.erp.cartera.util.TipoBienConstantesFunciones;
import com.bydan.erp.cartera.util.TipoBienParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoBienParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoBienBean;
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

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoBienBeanSwingJInternalFrame extends TipoBienJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoBienBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoBien> tipobienValidator = new ClassValidator<TipoBien>(TipoBien.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoBien tipobien;	
	public TipoBien tipobienAux;
	public TipoBien tipobienAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoBien tipobienTotales;
	public Long idTipoBienActual;
	public Long iIdNuevoTipoBien=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosBien=false;

	public Boolean getIsTienePermisosBien() {
		return isTienePermisosBien;
	}

	public void setIsTienePermisosBien(Boolean isTienePermisosBien) {
		this.isTienePermisosBien= isTienePermisosBien;
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
	
	public Boolean isPermisoTodoTipoBien;
	public Boolean isPermisoNuevoTipoBien;
	public Boolean isPermisoActualizarTipoBien;
	public Boolean isPermisoActualizarOriginalTipoBien;
	public Boolean isPermisoEliminarTipoBien;
	public Boolean isPermisoGuardarCambiosTipoBien;
	public Boolean isPermisoConsultaTipoBien;
	public Boolean isPermisoBusquedaTipoBien;
	public Boolean isPermisoReporteTipoBien;
	public Boolean isPermisoPaginacionMedioTipoBien;
	public Boolean isPermisoPaginacionAltoTipoBien;
	public Boolean isPermisoPaginacionTodoTipoBien;
	public Boolean isPermisoCopiarTipoBien;
	public Boolean isPermisoVerFormTipoBien;
	public Boolean isPermisoDuplicarTipoBien;
	public Boolean isPermisoOrdenTipoBien;
	
	
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
	
	public TipoBienParameterReturnGeneral tipobienReturnGeneral;
	public TipoBienParameterReturnGeneral tipobienParameterGeneral;
	
	

	public BienLogic bienLogic=null;

	public BienLogic getBienLogic() {
		return bienLogic;
	}

	public void setBienLogic(BienLogic bienLogic) {
		this.bienLogic = bienLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoBien=false;
	public Boolean esParaAccionDesdeFormularioTipoBien=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoBienSessionBeanAdditional tipobienSessionBeanAdditional=null;
	
	public TipoBienSessionBeanAdditional getTipoBienSessionBeanAdditional() {
		return this.tipobienSessionBeanAdditional;
	}
	
	public void setTipoBienSessionBeanAdditional(TipoBienSessionBeanAdditional tipobienSessionBeanAdditional) {
		try {
			this.tipobienSessionBeanAdditional=tipobienSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoBienBeanSwingJInternalFrameAdditional tipobienBeanSwingJInternalFrameAdditional=null;
	//public class TipoBienBeanSwingJInternalFrame
	
	public TipoBienBeanSwingJInternalFrameAdditional getTipoBienBeanSwingJInternalFrameAdditional() {
		return this.tipobienBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoBienBeanSwingJInternalFrameAdditional(TipoBienBeanSwingJInternalFrameAdditional tipobienBeanSwingJInternalFrameAdditional) {
		try {
			this.tipobienBeanSwingJInternalFrameAdditional=tipobienBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoBienLogic tipobienLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoBien tipobienBean;
	public TipoBienConstantesFunciones tipobienConstantesFunciones;
	//public TipoBienParameterReturnGeneral tipobienReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoBien> tipobiens;	
	//public List<TipoBien> tipobiensEliminados;
	//public List<TipoBien> tipobiensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoBien=false;
	public Boolean isVisibilidadCeldaDuplicarTipoBien=true;
	public Boolean isVisibilidadCeldaCopiarTipoBien=true;
	public Boolean isVisibilidadCeldaVerFormTipoBien=true;
	public Boolean isVisibilidadCeldaOrdenTipoBien=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoBien=false;
	public Boolean isVisibilidadCeldaModificarTipoBien=false;
	public Boolean isVisibilidadCeldaActualizarTipoBien=false;
	public Boolean isVisibilidadCeldaEliminarTipoBien=false;
	public Boolean isVisibilidadCeldaCancelarTipoBien=false;
	public Boolean isVisibilidadCeldaGuardarTipoBien=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoBien=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoBien() {
		return this.iIdNuevoTipoBien;
	}

	public void setiIdNuevoTipoBien(Long iIdNuevoTipoBien) {
		this.iIdNuevoTipoBien = iIdNuevoTipoBien;
	}
	
	public Long getidTipoBienActual() {
		return this.idTipoBienActual;
	}

	public void setidTipoBienActual(Long idTipoBienActual) {
		this.idTipoBienActual = idTipoBienActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoBien gettipobien() {
		return this.tipobien;
	}

	public void settipobien(TipoBien tipobien) {
		this.tipobien = tipobien;
	}
	
	public TipoBien gettipobienAux() {
		return this.tipobienAux;
	}

	public void settipobienAux(TipoBien tipobienAux) {
		this.tipobienAux = tipobienAux;
	}				
	
	public TipoBien gettipobienAnterior() {
		return this.tipobienAnterior;
	}

	public void settipobienAnterior(TipoBien tipobienAnterior) {
		this.tipobienAnterior = tipobienAnterior;
	}	
	
	public TipoBien gettipobienTotales() {
		return this.tipobienTotales;
	}

	public void settipobienTotales(TipoBien tipobienTotales) {
		this.tipobienTotales = tipobienTotales;
	}	
	
	public TipoBien gettipobienBean() {
		return this.tipobienBean;
	}

	public void settipobienBean(TipoBien tipobienBean) {
		this.tipobienBean = tipobienBean;
	}	
	
	public TipoBienParameterReturnGeneral gettipobienReturnGeneral() {
		return this.tipobienReturnGeneral;
	}

	public void settipobienReturnGeneral(TipoBienParameterReturnGeneral tipobienReturnGeneral) {
		this.tipobienReturnGeneral = tipobienReturnGeneral;
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
	
	
	public TipoBienLogic getTipoBienLogic()	{		
		return tipobienLogic;
	}

	public void setTipoBienLogic(TipoBienLogic tipobienLogic) {
		this.tipobienLogic = tipobienLogic;
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
	
	public Boolean getIsEsNuevoTipoBien() {
		return isEsNuevoTipoBien;
	}

	public void setIsEsNuevoTipoBien(Boolean isEsNuevoTipoBien) {
		this.isEsNuevoTipoBien = isEsNuevoTipoBien;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoBien() {
		return esParaAccionDesdeFormularioTipoBien;
	}
	
	public void setEsParaAccionDesdeFormularioTipoBien(Boolean esParaAccionDesdeFormularioTipoBien) {
		this.esParaAccionDesdeFormularioTipoBien = esParaAccionDesdeFormularioTipoBien;
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

			if(this.tipobienSessionBean==null) {
				this.tipobienSessionBean=new TipoBienSessionBean();
			}

			if(!this.tipobienSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipobienSessionBean.getlidEmpresaActual());
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

					if(this.tipobien!=null) {
						this.tipobien.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoBien!=null) {
						this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoBien.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoBien!=null) {
						if(this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoBienGenerico)throws Exception
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
				jComboBoxid_empresaTipoBienGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoBienGenerico!=null && jComboBoxid_empresaTipoBienGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoBienGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoBien tipobien,JComboBox jComboBoxid_empresaTipoBienGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoBienGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoBienGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipobien.setid_empresa(empresaAux.getId());
				tipobien.setempresa_descripcion(TipoBienConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipobien.setEmpresa(empresaAux);			}
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

					if(!TipoBienJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoBien!=null) { 
							this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoBien!=null) { 
					}

					if(!TipoBienJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoBien!=null) {
							this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoBien!=null) {
							this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoBien() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoBienConstantesFunciones.refrescarForeignKeysDescripcionesTipoBien(this.tipobienLogic.getTipoBiens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoBienConstantesFunciones.refrescarForeignKeysDescripcionesTipoBien(this.tipobiens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipobienLogic.setTipoBiens(this.tipobiens);
			tipobienLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoBienParameterReturnGeneral getTipoBienParameterGeneral() {
		return this.tipobienParameterGeneral;
	}
	
	public void setTipoBienParameterGeneral(TipoBienParameterReturnGeneral tipobienParameterGeneral) {
		this.tipobienParameterGeneral = tipobienParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoBien() {
		return isPermisoTodoTipoBien;
	}

	public void setIsPermisoTodoTipoBien(Boolean isPermisoTodoTipoBien) {
		this.isPermisoTodoTipoBien = isPermisoTodoTipoBien;
	}

	public Boolean getIsPermisoNuevoTipoBien() {
		return isPermisoNuevoTipoBien;
	}

	public void setIsPermisoNuevoTipoBien(Boolean isPermisoNuevoTipoBien) {
		this.isPermisoNuevoTipoBien = isPermisoNuevoTipoBien;
	}

	public Boolean getIsPermisoActualizarTipoBien() {
		return isPermisoActualizarTipoBien;
	}

	public void setIsPermisoActualizarTipoBien(Boolean isPermisoActualizarTipoBien) {
		this.isPermisoActualizarTipoBien = isPermisoActualizarTipoBien;
	}

	public Boolean getIsPermisoEliminarTipoBien() {
		return isPermisoEliminarTipoBien;
	}

	public void setIsPermisoEliminarTipoBien(Boolean isPermisoEliminarTipoBien) {
		this.isPermisoEliminarTipoBien = isPermisoEliminarTipoBien;
	}

	public Boolean getIsPermisoGuardarCambiosTipoBien() {
		return isPermisoGuardarCambiosTipoBien;
	}

	public void setIsPermisoGuardarCambiosTipoBien(Boolean isPermisoGuardarCambiosTipoBien) {
		this.isPermisoGuardarCambiosTipoBien = isPermisoGuardarCambiosTipoBien;
	}
	
	public Boolean getIsPermisoConsultaTipoBien() {
		return isPermisoConsultaTipoBien;
	}

	public void setIsPermisoConsultaTipoBien(Boolean isPermisoConsultaTipoBien) {
		this.isPermisoConsultaTipoBien = isPermisoConsultaTipoBien;
	}

	public Boolean getIsPermisoBusquedaTipoBien() {
		return isPermisoBusquedaTipoBien;
	}

	public void setIsPermisoBusquedaTipoBien(Boolean isPermisoBusquedaTipoBien) {
		this.isPermisoBusquedaTipoBien = isPermisoBusquedaTipoBien;
	}

	public Boolean getIsPermisoReporteTipoBien() {
		return isPermisoReporteTipoBien;
	}

	public void setIsPermisoReporteTipoBien(Boolean isPermisoReporteTipoBien) {
		this.isPermisoReporteTipoBien = isPermisoReporteTipoBien;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoBien() {
		return isPermisoPaginacionMedioTipoBien;
	}

	public void setIsPermisoPaginacionMedioTipoBien(Boolean isPermisoPaginacionMedioTipoBien) {
		this.isPermisoPaginacionMedioTipoBien = isPermisoPaginacionMedioTipoBien;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoBien() {
		return isPermisoPaginacionTodoTipoBien;
	}

	public void setIsPermisoPaginacionTodoTipoBien(Boolean isPermisoPaginacionTodoTipoBien) {
		this.isPermisoPaginacionTodoTipoBien = isPermisoPaginacionTodoTipoBien;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoBien() {
		return isPermisoPaginacionAltoTipoBien;
	}

	public void setIsPermisoPaginacionAltoTipoBien(Boolean isPermisoPaginacionAltoTipoBien) {
		this.isPermisoPaginacionAltoTipoBien = isPermisoPaginacionAltoTipoBien;
	}
	
	public Boolean getIsPermisoCopiarTipoBien() {
		return isPermisoCopiarTipoBien;
	}

	public void setIsPermisoCopiarTipoBien(Boolean isPermisoCopiarTipoBien) {
		this.isPermisoCopiarTipoBien = isPermisoCopiarTipoBien;
	}
	
	public Boolean getIsPermisoVerFormTipoBien() {
		return isPermisoVerFormTipoBien;
	}

	public void setIsPermisoVerFormTipoBien(Boolean isPermisoVerFormTipoBien) {
		this.isPermisoVerFormTipoBien = isPermisoVerFormTipoBien;
	}
	
	public Boolean getIsPermisoDuplicarTipoBien() {
		return isPermisoDuplicarTipoBien;
	}

	public void setIsPermisoDuplicarTipoBien(Boolean isPermisoDuplicarTipoBien) {
		this.isPermisoDuplicarTipoBien = isPermisoDuplicarTipoBien;
	}
	
	public Boolean getIsPermisoOrdenTipoBien() {
		return isPermisoOrdenTipoBien;
	}

	public void setIsPermisoOrdenTipoBien(Boolean isPermisoOrdenTipoBien) {
		this.isPermisoOrdenTipoBien = isPermisoOrdenTipoBien;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoBien() {
		return isVisibilidadCeldaNuevoTipoBien;
	}

	public void setIsVisibilidadCeldaNuevoTipoBien(Boolean isVisibilidadCeldaNuevoTipoBien) {
		this.isVisibilidadCeldaNuevoTipoBien = isVisibilidadCeldaNuevoTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoBien() {
		return isVisibilidadCeldaDuplicarTipoBien;
	}

	public void setIsVisibilidadCeldaDuplicarTipoBien(Boolean isVisibilidadCeldaDuplicarTipoBien) {
		this.isVisibilidadCeldaDuplicarTipoBien = isVisibilidadCeldaDuplicarTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoBien() {
		return isVisibilidadCeldaCopiarTipoBien;
	}

	public void setIsVisibilidadCeldaCopiarTipoBien(Boolean isVisibilidadCeldaCopiarTipoBien) {
		this.isVisibilidadCeldaCopiarTipoBien = isVisibilidadCeldaCopiarTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoBien() {
		return isVisibilidadCeldaVerFormTipoBien;
	}

	public void setIsVisibilidadCeldaVerFormTipoBien(Boolean isVisibilidadCeldaVerFormTipoBien) {
		this.isVisibilidadCeldaVerFormTipoBien = isVisibilidadCeldaVerFormTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoBien() {
		return isVisibilidadCeldaOrdenTipoBien;
	}

	public void setIsVisibilidadCeldaOrdenTipoBien(Boolean isVisibilidadCeldaOrdenTipoBien) {
		this.isVisibilidadCeldaOrdenTipoBien = isVisibilidadCeldaOrdenTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoBien() {
		return isVisibilidadCeldaNuevoRelacionesTipoBien;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoBien(Boolean isVisibilidadCeldaNuevoRelacionesTipoBien) {
		this.isVisibilidadCeldaNuevoRelacionesTipoBien = isVisibilidadCeldaNuevoRelacionesTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoBien() {
		return isVisibilidadCeldaModificarTipoBien;
	}

	public void setIsVisibilidadCeldaModificarTipoBien(Boolean isVisibilidadCeldaModificarTipoBien) {
		this.isVisibilidadCeldaModificarTipoBien = isVisibilidadCeldaModificarTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoBien() {
		return isVisibilidadCeldaActualizarTipoBien;
	}

	public void setIsVisibilidadCeldaActualizarTipoBien(Boolean isVisibilidadCeldaActualizarTipoBien) {
		this.isVisibilidadCeldaActualizarTipoBien = isVisibilidadCeldaActualizarTipoBien;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoBien() {
		return isVisibilidadCeldaEliminarTipoBien;
	}

	public void setIsVisibilidadCeldaEliminarTipoBien(Boolean isVisibilidadCeldaEliminarTipoBien) {
		this.isVisibilidadCeldaEliminarTipoBien = isVisibilidadCeldaEliminarTipoBien;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoBien() {
		return isVisibilidadCeldaCancelarTipoBien;
	}

	public void setIsVisibilidadCeldaCancelarTipoBien(Boolean isVisibilidadCeldaCancelarTipoBien) {
		this.isVisibilidadCeldaCancelarTipoBien = isVisibilidadCeldaCancelarTipoBien;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoBien() {
		return isVisibilidadCeldaGuardarTipoBien;
	}

	public void setIsVisibilidadCeldaGuardarTipoBien(Boolean isVisibilidadCeldaGuardarTipoBien) {
		this.isVisibilidadCeldaGuardarTipoBien = isVisibilidadCeldaGuardarTipoBien;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoBien() {
		return isVisibilidadCeldaGuardarCambiosTipoBien;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoBien(Boolean isVisibilidadCeldaGuardarCambiosTipoBien) {
		this.isVisibilidadCeldaGuardarCambiosTipoBien = isVisibilidadCeldaGuardarCambiosTipoBien;
	}
		
	public TipoBienSessionBean gettipobienSessionBean() {
		return this.tipobienSessionBean;
	}
	
	public void settipobienSessionBean(TipoBienSessionBean tipobienSessionBean) {
		this.tipobienSessionBean=tipobienSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoBien(TipoBien tipobien)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipobien,null);
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
	
	public void bugActualizarReferenciaActual(TipoBien tipobien,TipoBien tipobienAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoBien(tipobien);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipobienAux.setId(tipobien.getId());
		tipobienAux.setVersionRow(tipobien.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoBien();
		
			int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipobienValidator.getInvalidValues(this.tipobien);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipobienLogic.setDatosCliente(datosCliente);
			tipobienLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipobienAux=new  TipoBien();
				
				tipobienAux.setIsNew(true);
				tipobienAux.setIsChanged(true);
				
				tipobienAux.setTipoBienOriginal(this.tipobien);
				
				tipobienAux.setId(this.tipobien.getId());	
				tipobienAux.setVersionRow(this.tipobien.getVersionRow());	
				tipobienAux.setid_empresa(this.tipobien.getid_empresa());	
				tipobienAux.setcodigo(this.tipobien.getcodigo());	
				tipobienAux.setnombre(this.tipobien.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobienSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipobienAux,tipobienLogic.getTipoBiens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobienAux,tipobiens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobienSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobienLogic.saveTipoBiens();//WithConnection
						//tipobienLogic.getSetVersionRowTipoBiens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobien,tipobienAux);
					
					this.refrescarForeignKeysDescripcionesTipoBien();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobienSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens().addAll(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biens.addAll(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biensEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobienLogic.saveTipoBienRelaciones(tipobienAux,this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());//WithConnection
								//tipobienLogic.getSetVersionRowTipoBiens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobien,tipobienAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.setBiens(new ArrayList<Bien>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biens= new ArrayList<Bien>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobienAux.setBiens(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobienSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobienAux,tipobienLogic.getTipoBiens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobienAux,tipobiens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobien,tipobienAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipobienAux=new  TipoBien();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipobienSessionBean.getEsGuardarRelacionado() 
					|| (this.tipobienSessionBean.getEsGuardarRelacionado() && this.tipobien.getId()>=0)) {
						
					tipobienAux.setIsNew(false);
				}
				
				tipobienAux.setIsDeleted(false);
			
				tipobienAux.setId(this.tipobien.getId());	
				tipobienAux.setVersionRow(this.tipobien.getVersionRow());	
				tipobienAux.setid_empresa(this.tipobien.getid_empresa());	
				tipobienAux.setcodigo(this.tipobien.getcodigo());	
				tipobienAux.setnombre(this.tipobien.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobienAux,tipobienLogic.getTipoBiens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobienAux,tipobiens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobienSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobienLogic.saveTipoBiens();//WithConnection
						//tipobienLogic.getSetVersionRowTipoBiens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobien,tipobienAux);
					
					this.refrescarForeignKeysDescripcionesTipoBien();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobienSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens().addAll(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biens.addAll(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biensEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobienLogic.saveTipoBienRelaciones(tipobienAux,this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());//WithConnection
								//tipobienLogic.getSetVersionRowTipoBiens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobien,tipobienAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.setBiens(new ArrayList<Bien>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biens= new ArrayList<Bien>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobienAux.setBiens(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobienSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobienAux,tipobienLogic.getTipoBiens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobienAux,tipobiens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobien,tipobienAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipobienAux=new  TipoBien();
				
				tipobienAux.setIsNew(false);
				tipobienAux.setIsChanged(false);
				
				tipobienAux.setIsDeleted(true);
				
				tipobienAux.setId(this.tipobien.getId());	
				tipobienAux.setVersionRow(this.tipobien.getVersionRow());	
				tipobienAux.setid_empresa(this.tipobien.getid_empresa());	
				tipobienAux.setcodigo(this.tipobien.getcodigo());	
				tipobienAux.setnombre(this.tipobien.getnombre());	
				
				if(this.tipobienSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipobienAux.getId()>=0) {	
						this.tipobiensEliminados.add(tipobienAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipobienAux,tipobienLogic.getTipoBiens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobienAux,tipobiens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobienSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobienLogic.saveTipoBiens();//WithConnection
						//tipobienLogic.getSetVersionRowTipoBiens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobienSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens().addAll(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biens.addAll(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biensEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobienLogic.saveTipoBienRelaciones(tipobienAux,this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());//WithConnection
								//tipobienLogic.getSetVersionRowTipoBiens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.setBiens(new ArrayList<Bien>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biens= new ArrayList<Bien>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobienAux.setBiens(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipobienSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipobienAux,tipobienLogic.getTipoBiens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipobienAux,tipobiens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.getTipoBiens().addAll(this.tipobiensEliminados);
					
					tipobienLogic.saveTipoBiens();//WithConnection
					//tipobienLogic.getSetVersionRowTipoBiens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoBien();
				
				this.tipobiensEliminados= new ArrayList<TipoBien>();		
			}
			
			if(this.tipobienSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Bien GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipobien=tipobienAux;
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
      		//this.finishProcessTipoBien();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoBien tipobienLocal) throws Exception {
		
		if(this.tipobienSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipobienLocal.setBiens(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());
			
			} else {
			
				tipobienLocal.setBiens(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.biens);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoBien tipobienLocal) throws Exception {	
		if(this.tipobienSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipobienLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoBienActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipobienValidator.getInvalidValues(this.tipobien);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoBien tipobien,List<TipoBien> tipobiens) throws Exception {
		try	{		
			TipoBienConstantesFunciones.actualizarLista(tipobien,tipobiens,this.tipobienSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoBien tipobien,List<TipoBien> tipobiens) throws Exception {
		try	{			
			TipoBienConstantesFunciones.actualizarSelectedLista(tipobien,tipobiens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoBien> tipobiensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipobiensLocal=this.tipobienLogic.getTipoBiens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipobiensLocal=this.tipobiens;
			}
			//ARCHITECTURE
		
			for(TipoBien tipobienLocal:tipobiensLocal) {
				if(this.permiteMantenimiento(tipobienLocal) && tipobienLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoBienConstantesFunciones.getTipoBienLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoBienConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBien.jLabelid_empresaTipoBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBienConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBien.jLabelcodigoTipoBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBienConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBien.jLabelnombreTipoBien,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBien.jLabelid_empresaTipoBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBien.jLabelcodigoTipoBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBien.jLabelnombreTipoBien,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Bien")) {
			if(this.tipobien==null) {
				this.tipobien= new TipoBien();
			}

			if(this.tipobienSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoBien
				this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);

				this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.getbien().setTipoBien(this.tipobien);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoBien--;	
		
		
		this.tipobienAux=new TipoBien();
		
		this.tipobienAux.setId(this.iIdNuevoTipoBien);
		this.tipobienAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobienLogic.getTipoBiens().add(this.tipobienAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipobiens.add(this.tipobienAux);
		}
		//ARCHITECTURE
		
		this.tipobien=this.tipobienAux;
		
		if(TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoBien(this.tipobien);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBien(this.tipobien);
		}
				
		//this.setDefaultControlesTipoBien();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoBien();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoBien();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBien();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBien(this.tipobienBean,this.tipobien,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoBienConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipobienSessionBean.getConGuardarRelaciones()) {
			classes=TipoBienConstantesFunciones.getClassesRelationshipsOfTipoBien(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipobienReturnGeneral=tipobienLogic.procesarEventosTipoBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobienLogic.getTipoBiens(),this.tipobien,this.tipobienParameterGeneral,this.isEsNuevoTipoBien,classes);//this.tipobienLogic.getTipoBien()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoBien(this.tipobienReturnGeneral,this.tipobienBean,false);
		
		if(this.tipobienReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBien(this.tipobienReturnGeneral.getTipoBien());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoBien(this.tipobienReturnGeneral.getTipoBien());
		}
		
		if(this.tipobienReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoBien(this.tipobienReturnGeneral.getTipoBien(),classes);//this.tipobienBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoBien();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoBien();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBienBeanSwingJInternalFrameAdditional.RecargarFormTipoBien(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoBien(false);
						
			if(tipobienSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienSessionBean.getEsGuardarRelacionado() && BienJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBienActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBien();
			}
			
			this.actualizarVisualTableDatosTipoBien();
			
			this.jTableDatosTipoBien.setRowSelectionInterval(this.getIndiceNuevoTipoBien(), this.getIndiceNuevoTipoBien());
			
			this.seleccionarFilaTablaTipoBienActual();
						
			this.actualizarEstadoCeldasBotonesTipoBien("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoBien(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.setEnabled(isHabilitar && this.tipobienConstantesFunciones.activarcodigoTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.setEnabled(isHabilitar && this.tipobienConstantesFunciones.activarnombreTipoBien);	
		//
		this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setEnabled(isHabilitar && this.tipobienConstantesFunciones.activarid_empresaTipoBien);
	};
	
	public void setDefaultControlesTipoBien() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoBien(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipobienSessionBean.setConGuardarRelaciones(true);			
			this.tipobienSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipobienSessionBean.setConGuardarRelaciones(false);			
			this.tipobienSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoBien() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
				if(tipobienAux.getId().equals(this.iIdNuevoTipoBien)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBien tipobienAux:this.tipobiens) {
				if(tipobienAux.getId().equals(this.iIdNuevoTipoBien)) {
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
	
	public int getIndiceActualTipoBien(TipoBien tipobien,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
				if(tipobienAux.getId().equals(tipobien.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBien tipobienAux:this.tipobiens) {
				if(tipobienAux.getId().equals(tipobien.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoBien(TipoBien tipobienOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
				if(tipobienAux.getTipoBienOriginal().getId().equals(tipobienOriginal.getId())) {
					existe=true;
					tipobienOriginal.setId(tipobienAux.getId());
					tipobienOriginal.setVersionRow(tipobienAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBien tipobienAux:this.tipobiens) {
				if(tipobienAux.getTipoBienOriginal().getId().equals(tipobienOriginal.getId())) {
					existe=true;
					tipobienOriginal.setId(tipobienAux.getId());
					tipobienOriginal.setVersionRow(tipobienAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoBien(Boolean esParaCancelar) throws Exception {
		tipobiensAux=new ArrayList<TipoBien>();
		tipobienAux=new TipoBien();
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
					if(tipobienAux.getId()<0) {
						tipobiensAux.add(tipobienAux);
					}		
				}
				this.iIdNuevoTipoBien=0L;
				this.tipobienLogic.getTipoBiens().removeAll(tipobiensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBien tipobienAux:this.tipobiens) {
					if(tipobienAux.getId()<0) {
						tipobiensAux.add(tipobienAux);
					}		
				}
				this.iIdNuevoTipoBien=0L;
				this.tipobiens.removeAll(tipobiensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoBien 
					&& this.tipobienLogic.getTipoBiens().size()>0
					) {
					tipobienAux=this.tipobienLogic.getTipoBiens().get(this.tipobienLogic.getTipoBiens().size() - 1);
				
					if(tipobienAux.getId()<0) {
						this.tipobienLogic.getTipoBiens().remove(tipobienAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoBien && this.tipobiens.size()>0) {
					tipobienAux=this.tipobiens.get(this.tipobiens.size() - 1);
				
					if(tipobienAux.getId()<0) {
						this.tipobiens.remove(tipobienAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoBien(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipobien.getId()<0) {
				this.tipobienLogic.getTipoBiens().remove(this.tipobien);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipobien.getId()<0) {
				this.tipobiens.remove(this.tipobien);
			}
		}			
	}
	
	public void setEstadosInicialesTipoBien(List<TipoBien> tipobiensAux) throws Exception {
		TipoBienConstantesFunciones.setEstadosInicialesTipoBien(tipobiensAux);
	}
	
	public void setEstadosInicialesTipoBien(TipoBien tipobienAux) throws Exception {
		TipoBienConstantesFunciones.setEstadosInicialesTipoBien(tipobienAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoBienActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoBienActual()) {
				if(!this.isEsNuevoTipoBien) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoBien=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoBienActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Bien ?", "MANTENIMIENTO DE Tipo Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoBien tipobien) throws Exception {
		TipoBienConstantesFunciones.seleccionarAsignar(this.tipobien,tipobien);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoBien=this.isPermisoActualizarOriginalTipoBien;
			
			
			this.seleccionarAsignar(tipobien);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBienConstantesFunciones.quitarEspaciosTipoBien(this.tipobien,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoBien("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipobienSessionBean.setsFuncionBusquedaRapida(this.tipobienSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoBien) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoBien(esParaCancelar);				
				this.cancelarNuevoTipoBien(esParaCancelar);								
			}
			
			this.tipobien=new TipoBien();
			
			this.inicializarTipoBien();
			
			this.actualizarEstadoCeldasBotonesTipoBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoBien() throws Exception {
		try {
			TipoBienConstantesFunciones.inicializarTipoBien(this.tipobien);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipobienLogic.getTipoBiens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoBiens(String sAccionBusqueda,List<TipoBien> tipobiensParaReportes) throws Exception {
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
					sPathReporteFinal="TipoBien"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoBienMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoBienMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoBien"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Bienes");		
		parameters.put("busquedapor", TipoBienConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Bien.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoBienLogic tipobienLogicAuxiliar=new TipoBienLogic();
					tipobienLogicAuxiliar.setDatosCliente(tipobienLogic.getDatosCliente());				
					tipobienLogicAuxiliar.setTipoBiens(tipobiensParaReportes);
					
					tipobienLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoBienWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipobiensParaReportes=tipobienLogicAuxiliar.getTipoBiens();
					
					//tipobienLogic.getNewConnexionToDeep();
					
					//for (TipoBien tipobien:tipobiensParaReportes) {
					//	tipobienLogic.deepLoad(tipobien, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipobienLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipobienLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileBien = AuxiliarReportes.class.getResourceAsStream("BienDetalleRelacionesDesign.jasper");
			parameters.put("subreport_bien", reportFileBien);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoBien=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoBienConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoBienConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoBien=new JRBeanArrayDataSource(TipoBienJInternalFrame.TraerTipoBienBeans(tipobiensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoBien);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoBienConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoBienConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoBienBean.TraerTipoBienBeans(tipobiensParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoBiens(sAccionBusqueda,sTipoArchivoReporte,tipobiensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoBiens(sAccionBusqueda,sTipoArchivoReporte,tipobiensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoBienActionPerformed(null);
					//this.generarExcelReporteTipoBiens(sAccionBusqueda,sTipoArchivoReporte,tipobiensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoBiens(sAccionBusqueda,sTipoArchivoReporte,tipobiensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoBiens(sAccionBusqueda,sTipoArchivoReporte,tipobiensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoBiens(sAccionBusqueda,sTipoArchivoReporte,tipobiensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoBiens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBien> tipobiensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobien";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBiens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBien("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoBien tipobien : tipobiensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoBienConstantesFunciones.generarExcelReporteDataTipoBien("NORMAL",row,workbook,tipobien,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoBien(String sTipo,Row row,Workbook workbook) {
		
		TipoBienConstantesFunciones.generarExcelReporteHeaderTipoBien(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoBiens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBien> tipobiensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobien_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBiens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoBien tipobien : tipobiensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoBienConstantesFunciones.getTipoBienDescripcion(tipobien));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBienConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBienConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobien.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBienConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBienConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobien.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBienConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBienConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobien.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoBiens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBien> tipobiensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoBien> tipobiensRespaldo=null;
		
		classes=TipoBienConstantesFunciones.getClassesRelationshipsOfTipoBien(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipobienLogic.setDatosCliente(this.datosCliente);
		this.tipobienLogic.setDatosDeep(this.datosDeep);
		this.tipobienLogic.setIsConDeep(true);
		
		tipobiensRespaldo=this.tipobienLogic.getTipoBiens();
		
		this.tipobienLogic.setTipoBiens(tipobiensParaReportes);	
		this.tipobienLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipobiensParaReportes=this.tipobienLogic.getTipoBiens();
		this.tipobienLogic.setTipoBiens(tipobiensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobien_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBiens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBien("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoBien tipobien : tipobiensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoBien("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoBienConstantesFunciones.generarExcelReporteDataTipoBien("NORMAL",row,workbook,tipobien,cellStyleDataAux);
		
			
			


				//Bien
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(BienConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipobien.getBiens()!=null && tipobien.getBiens().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(BienConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					BienConstantesFunciones.generarExcelReporteHeaderBien("RELACIONADO",row,workbook);
				}

				if(tipobien.getBiens()!=null) {
					i2=0;
					for(Bien bien : tipobien.getBiens()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						BienConstantesFunciones.generarExcelReporteDataBien("RELACIONADO",row,workbook,bien,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoBienConstantesFunciones.getTipoBienDescripcion(tipobien));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBien.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoBien() throws Exception {		
		this.startProcessTipoBien(true);
	}
	
	public void startProcessTipoBien(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoBien ,this.jPanelParametrosReportesTipoBien, this.jScrollPanelDatosTipoBien,this.jPanelPaginacionTipoBien, this.jScrollPanelDatosEdicionTipoBien, this.jPanelAccionesTipoBien,this.jPanelAccionesFormularioTipoBien,this.jmenuBarTipoBien,this.jmenuBarDetalleTipoBien,this.jTtoolBarTipoBien,this.jTtoolBarDetalleTipoBien);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBien=this.jTabbedPaneBusquedasTipoBien; 
		
		final JPanel jPanelParametrosReportesTipoBien=this.jPanelParametrosReportesTipoBien;
		//final JScrollPane jScrollPanelDatosTipoBien=this.jScrollPanelDatosTipoBien;
		final JTable jTableDatosTipoBien=this.jTableDatosTipoBien;		
		final JPanel jPanelPaginacionTipoBien=this.jPanelPaginacionTipoBien;
		//final JScrollPane jScrollPanelDatosEdicionTipoBien=this.jScrollPanelDatosEdicionTipoBien;
		final JPanel jPanelAccionesTipoBien=this.jPanelAccionesTipoBien;
		
		JPanel jPanelCamposAuxiliarTipoBien=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoBien=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
			jPanelCamposAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jPanelCamposTipoBien;
			jPanelAccionesFormularioAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jPanelAccionesFormularioTipoBien;
		}
		
		final JPanel jPanelCamposTipoBien=jPanelCamposAuxiliarTipoBien;
		final JPanel jPanelAccionesFormularioTipoBien=jPanelAccionesFormularioAuxiliarTipoBien;
		
		
		final JMenuBar jmenuBarTipoBien=this.jmenuBarTipoBien;
		final JToolBar jTtoolBarTipoBien=this.jTtoolBarTipoBien;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoBien=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBien=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
			jmenuBarDetalleAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jmenuBarDetalleTipoBien;
			jTtoolBarDetalleAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jTtoolBarDetalleTipoBien;
		}
		
		final JMenuBar jmenuBarDetalleTipoBien=jmenuBarDetalleAuxiliarTipoBien;
		final JToolBar jTtoolBarDetalleTipoBien=jTtoolBarDetalleAuxiliarTipoBien;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBien;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBien;
			processRunnable.jTableDatos=jTableDatosTipoBien;
			processRunnable.jPanelCampos=jPanelCamposTipoBien;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBien;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBien;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBien;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBien;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBien;
			processRunnable.jTtoolBar=jTtoolBarTipoBien;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBien;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBien ,jPanelParametrosReportesTipoBien,jTableDatosTipoBien, /*jScrollPanelDatosTipoBien,*/jPanelCamposTipoBien,jPanelPaginacionTipoBien, /*jScrollPanelDatosEdicionTipoBien,*/ jPanelAccionesTipoBien,jPanelAccionesFormularioTipoBien,jmenuBarTipoBien,jmenuBarDetalleTipoBien,jTtoolBarTipoBien,jTtoolBarDetalleTipoBien);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBien ,jPanelParametrosReportesTipoBien, jScrollPanelDatosTipoBien,jPanelPaginacionTipoBien, jScrollPanelDatosEdicionTipoBien, jPanelAccionesTipoBien,jPanelAccionesFormularioTipoBien,jmenuBarTipoBien,jmenuBarDetalleTipoBien,jTtoolBarTipoBien,jTtoolBarDetalleTipoBien);
						
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
	
	public void finishProcessTipoBien() {// throws Exception 
		this.finishProcessTipoBien(true);
	}
	
	public void finishProcessTipoBien(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoBien ,this.jPanelParametrosReportesTipoBien, this.jScrollPanelDatosTipoBien,this.jPanelPaginacionTipoBien, this.jScrollPanelDatosEdicionTipoBien, this.jPanelAccionesTipoBien,this.jPanelAccionesFormularioTipoBien,this.jmenuBarTipoBien,this.jmenuBarDetalleTipoBien,this.jTtoolBarTipoBien,this.jTtoolBarDetalleTipoBien);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBien=this.jTabbedPaneBusquedasTipoBien; 
		
		final JPanel jPanelParametrosReportesTipoBien=this.jPanelParametrosReportesTipoBien;
		//final JScrollPane jScrollPanelDatosTipoBien=this.jScrollPanelDatosTipoBien;
		final JTable jTableDatosTipoBien=this.jTableDatosTipoBien;		
		final JPanel jPanelPaginacionTipoBien=this.jPanelPaginacionTipoBien;
		//final JScrollPane jScrollPanelDatosEdicionTipoBien=this.jScrollPanelDatosEdicionTipoBien;
		final JPanel jPanelAccionesTipoBien=this.jPanelAccionesTipoBien;
		
		JPanel jPanelCamposAuxiliarTipoBien=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoBien=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
			jPanelCamposAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jPanelCamposTipoBien;
			jPanelAccionesFormularioAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jPanelAccionesFormularioTipoBien;
		}
		
		final JPanel jPanelCamposTipoBien=jPanelCamposAuxiliarTipoBien;
		final JPanel jPanelAccionesFormularioTipoBien=jPanelAccionesFormularioAuxiliarTipoBien;
		
		
		final JMenuBar jmenuBarTipoBien=this.jmenuBarTipoBien;		
		final JToolBar jTtoolBarTipoBien=this.jTtoolBarTipoBien;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoBien=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBien=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
			jmenuBarDetalleAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jmenuBarDetalleTipoBien;
			jTtoolBarDetalleAuxiliarTipoBien=this.jInternalFrameDetalleFormTipoBien.jTtoolBarDetalleTipoBien;		
		}
		
		final JMenuBar jmenuBarDetalleTipoBien=jmenuBarDetalleAuxiliarTipoBien;
		final JToolBar jTtoolBarDetalleTipoBien=jTtoolBarDetalleAuxiliarTipoBien;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBien;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBien;
			processRunnable.jTableDatos=jTableDatosTipoBien;
			processRunnable.jPanelCampos=jPanelCamposTipoBien;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBien;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBien;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBien;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBien;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBien;
			processRunnable.jTtoolBar=jTtoolBarTipoBien;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBien;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoBien ,jPanelParametrosReportesTipoBien, jTableDatosTipoBien,/*jScrollPanelDatosTipoBien,*/jPanelCamposTipoBien,jPanelPaginacionTipoBien, /*jScrollPanelDatosEdicionTipoBien,*/ jPanelAccionesTipoBien,jPanelAccionesFormularioTipoBien,jmenuBarTipoBien,jmenuBarDetalleTipoBien,jTtoolBarTipoBien,jTtoolBarDetalleTipoBien));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoBien(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoBien(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoBien(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoBien(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoBien,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoBien,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoBien(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoBien,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoBien,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipobienConstantesFunciones.getsFinalQueryTipoBien();
		String  finalQueryPaginacionTodos=this.tipobienConstantesFunciones.getsFinalQueryTipoBien();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoBienConstantesFunciones.getArrayColumnasGlobalesNoTipoBien(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoBienConstantesFunciones.getArrayColumnasGlobalesTipoBien(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoBienConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipobiensEliminados= new ArrayList<TipoBien>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoBien();
		
				///*TipoBienSessionBean*/this.tipobienSessionBean=new TipoBienSessionBean();
			
			if(this.tipobienSessionBean==null) {
				this.tipobienSessionBean=new TipoBienSessionBean();
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
					this.iNumeroPaginacion=TipoBienConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoBienConstantesFunciones.getClassesForeignKeysOfTipoBien(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipobien."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipobiensAux= new ArrayList<TipoBien>();
			
				
			tipobienLogic.setDatosCliente(this.datosCliente);
			tipobienLogic.setDatosDeep(this.datosDeep);
			tipobienLogic.setIsConDeep(true);
			
			
			tipobienLogic.getTipoBienDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipobienLogic.getTodosTipoBiens(finalQueryGlobal,pagination);
					
					//tipobienLogic.getTodosTipoBiensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipobienLogic.getTipoBiens()==null|| tipobienLogic.getTipoBiens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobiensAux= new ArrayList<TipoBien>();
							tipobiensAux.addAll(tipobienLogic.getTipoBiens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobiensAux= new ArrayList<TipoBien>();
							tipobiensAux.addAll(tipobiens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobienLogic.getTodosTipoBiens(finalQueryGlobal+"",this.pagination);												
							
							//tipobienLogic.getTodosTipoBiensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoBiens("Todos",tipobienLogic.getTipoBiens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobienLogic.setTipoBiens(new ArrayList<TipoBien>());					
							tipobienLogic.getTipoBiens().addAll(tipobiensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobiens=new ArrayList<TipoBien>();
							tipobiens.addAll(tipobiensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoBien=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoBien=this.idActual;
				
				} else if(this.idTipoBienActual!=null && this.idTipoBienActual!=0L) {
					idTipoBien=idTipoBienActual;
				}
				
					
				this.sDetalleReporte=TipoBienConstantesFunciones.getDetalleIndicePorId(idTipoBien);
				
				this.tipobiens=new ArrayList<TipoBien>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipobienLogic.getEntity(idTipoBien);
					
					//tipobienLogic.getEntityWithConnection(idTipoBien);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobienLogic.setTipoBiens(new ArrayList<TipoBien>());
					tipobienLogic.getTipoBiens().add(tipobienLogic.getTipoBien());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobiens=new ArrayList<TipoBien>();
					this.tipobiens.add(tipobien);
				}
				
				if(tipobienLogic.getTipoBien()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoBienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipobienLogic.getTipoBiensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipobienLogic.getTipoBiens()==null||tipobienLogic.getTipoBiens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipobiens==null|| tipobiens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobiensAux=new ArrayList<TipoBien>();
						tipobiensAux.addAll(tipobienLogic.getTipoBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobiensAux=new ArrayList<TipoBien>();
							tipobiensAux.addAll(tipobiens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipobienLogic.getTipoBiensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoBiens("FK_IdEmpresa",tipobienLogic.getTipoBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoBiens("FK_IdEmpresa",tipobiens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobienLogic.setTipoBiens(new ArrayList<TipoBien>());
						tipobienLogic.getTipoBiens().addAll(tipobiensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobiens=new ArrayList<TipoBien>();
							tipobiens.addAll(tipobiensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoBien();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoBien();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobienLogic.getTipoBiens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobiens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobienLogic.getTipoBiens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobiens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoBien tipobien) {
		Boolean permite=true;
		
		if(this.tipobien.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoBienConstantesFunciones.getOrderByListaTipoBien();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoBienConstantesFunciones.getOrderByListaTipoBien();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBien tipobien:tipobienLogic.getTipoBiens()) {
				if(tipobien.getsType().equals(Constantes2.S_TOTALES)) {
					tipobienTotales=tipobien;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBien tipobien:this.tipobiens) {
				if(tipobien.getsType().equals(Constantes2.S_TOTALES)) {
					tipobienTotales=tipobien;
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
			this.tipobienAux=new TipoBien();
			this.tipobienAux.setsType(Constantes2.S_TOTALES);
			this.tipobienAux.setIsNew(false);
			this.tipobienAux.setIsChanged(false);
			this.tipobienAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoBienConstantesFunciones.TotalizarValoresFilaTipoBien(this.tipobienLogic.getTipoBiens(),this.tipobienAux);
				
				this.tipobienLogic.getTipoBiens().add(this.tipobienAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoBienConstantesFunciones.TotalizarValoresFilaTipoBien(this.tipobiens,this.tipobienAux);
				
				this.tipobiens.add(this.tipobienAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipobienTotales=new TipoBien();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobienLogic.getTipoBiens().remove(tipobienTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobiens.remove(tipobienTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipobienTotales=new TipoBien();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBien tipobien:tipobienLogic.getTipoBiens()) {
				if(tipobien.getsType().equals(Constantes2.S_TOTALES)) {
					tipobienTotales=tipobien;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBienConstantesFunciones.TotalizarValoresFilaTipoBien(this.tipobienLogic.getTipoBiens(),tipobienTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBien tipobien:this.tipobiens) {
				if(tipobien.getsType().equals(Constantes2.S_TOTALES)) {
					tipobienTotales=tipobien;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBienConstantesFunciones.TotalizarValoresFilaTipoBien(this.tipobiens,tipobienTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoBiensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoBiensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobienLogic.getTipoBiensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoBien() {
		this.isPermisoTodoTipoBien=false;
		this.isPermisoNuevoTipoBien=false;
		this.isPermisoActualizarTipoBien=false;
		this.isPermisoActualizarOriginalTipoBien=false;
		this.isPermisoEliminarTipoBien=false;
		this.isPermisoGuardarCambiosTipoBien=false;
		this.isPermisoConsultaTipoBien=false;
		this.isPermisoBusquedaTipoBien=false;
		this.isPermisoReporteTipoBien=false;		
		this.isPermisoOrdenTipoBien=false;		
		this.isPermisoPaginacionMedioTipoBien=false;		
		this.isPermisoPaginacionAltoTipoBien=false;
		this.isPermisoPaginacionTodoTipoBien=false;
		this.isPermisoCopiarTipoBien=false;		
		this.isPermisoVerFormTipoBien=false;		
		this.isPermisoDuplicarTipoBien=false;		
		this.isPermisoOrdenTipoBien=false;		
	}
	
	public void setPermisosUsuarioTipoBien(Boolean isPermiso) {
		this.isPermisoTodoTipoBien=isPermiso;
		this.isPermisoNuevoTipoBien=isPermiso;
		this.isPermisoActualizarTipoBien=isPermiso;
		this.isPermisoActualizarOriginalTipoBien=isPermiso;
		this.isPermisoEliminarTipoBien=isPermiso;
		this.isPermisoGuardarCambiosTipoBien=isPermiso;
		this.isPermisoConsultaTipoBien=isPermiso;
		this.isPermisoBusquedaTipoBien=isPermiso;
		this.isPermisoReporteTipoBien=isPermiso;
		this.isPermisoOrdenTipoBien=isPermiso;		
		this.isPermisoPaginacionMedioTipoBien=isPermiso;		
		this.isPermisoPaginacionAltoTipoBien=isPermiso;		
		this.isPermisoPaginacionTodoTipoBien=isPermiso;		
		this.isPermisoCopiarTipoBien=isPermiso;		
		this.isPermisoVerFormTipoBien=isPermiso;		
		this.isPermisoDuplicarTipoBien=isPermiso;
		this.isPermisoOrdenTipoBien=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoBien(Boolean isPermiso) {
		//this.isPermisoTodoTipoBien=isPermiso;
		this.isPermisoNuevoTipoBien=isPermiso;
		this.isPermisoActualizarTipoBien=isPermiso;
		this.isPermisoActualizarOriginalTipoBien=isPermiso;
		this.isPermisoEliminarTipoBien=isPermiso;
		this.isPermisoGuardarCambiosTipoBien=isPermiso;
		//this.isPermisoConsultaTipoBien=isPermiso;
		//this.isPermisoBusquedaTipoBien=isPermiso;
		//this.isPermisoReporteTipoBien=isPermiso;
		//this.isPermisoOrdenTipoBien=isPermiso;		
		//this.isPermisoPaginacionMedioTipoBien=isPermiso;		
		//this.isPermisoPaginacionAltoTipoBien=isPermiso;		
		//this.isPermisoPaginacionTodoTipoBien=isPermiso;		
		//this.isPermisoCopiarTipoBien=isPermiso;		
		//this.isPermisoDuplicarTipoBien=isPermiso;
		//this.isPermisoOrdenTipoBien=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoBienClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(BienConstantesFunciones.SNOMBREOPCION);
		
		if(TipoBienJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosBien=false;
		this.isTienePermisosBien=this.verificarGetPermisosUsuarioOpcionTipoBienClaseRelacionada(this.opcionsRelacionadas,BienConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoBien(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoBienClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosBien=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoBienClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoBienClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoBienClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosBien && this.jInternalFrameDetalleFormTipoBien!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.remove(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoBien() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoBienJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipobienSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoBienConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoBien=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoBien=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoBien=this.isPermisoActualizarTipoBien;
			this.isPermisoEliminarTipoBien=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoBien=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoBien=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoBien=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoBien=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoBien=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBien=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoBien=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoBien=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoBien=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoBien=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoBien=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoBien=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBien=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipobienSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoBien.setToolTipText(this.jTableDatosTipoBien.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoBien(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoBien(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoBienJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoBienJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoBien() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosBien && this.tipobienConstantesFunciones.mostrarBienTipoBien && !TipoBienConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Bien");
			reporte.setsDescripcion("Bien");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoBienListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoBienListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoBienJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoBienListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoBienListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoBienParameterReturnGeneral tipobienReturnGeneral=new TipoBienParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipobienConstantesFunciones.cargarid_empresaTipoBien)
					 || (this.esRecargarFks && this.tipobienConstantesFunciones.cargarid_empresaTipoBien)) {

					if(!this.tipobienSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipobienSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipobienReturnGeneral=tipobienLogic.cargarCombosLoteForeignKeyTipoBien(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipobienReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoBien()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipobienSessionBean==null) {
				this.tipobienSessionBean=new TipoBienSessionBean();
			}

			if(!this.tipobienSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoBien()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoBien(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoBien()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBien();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoBien(TipoBien tipobien)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoBien(TipoBien tipobien,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoBien()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBien()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoBien()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoBien()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoBien()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoBien()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoBien(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoBien()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien!=null && this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoBienBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoBienBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoBienBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipobienSessionBean=new TipoBienSessionBean(); 
		this.tipobienConstantesFunciones=new TipoBienConstantesFunciones(); 
		this.tipobienBean=new TipoBien();//(this.tipobienConstantesFunciones); 		
		this.tipobienReturnGeneral=new TipoBienParameterReturnGeneral(); 
		
		this.tipobienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoBienBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoBienBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoBienBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoBien(true);
			
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
			
			this.tipobienConstantesFunciones=new TipoBienConstantesFunciones(); 
			this.tipobienBean=new TipoBien();//this.tipobienConstantesFunciones); 			
			this.tipobienReturnGeneral=new TipoBienParameterReturnGeneral(); 
		
			TipoBienBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Bien Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipobien=new TipoBien();
			this.tipobiens = new ArrayList<TipoBien>();
			this.tipobiensAux = new ArrayList<TipoBien>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic=new TipoBienLogic();
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			//this.tipobienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipobienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoBien);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBien);	
					}
					
					if(this.jInternalFrameImportacionTipoBien!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBien);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoBien!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoBien);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoBien!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBien);
				this.jInternalFrameDetalleFormTipoBien.setVisible(false);
				this.jInternalFrameDetalleFormTipoBien.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBien);
					this.jInternalFrameReporteDinamicoTipoBien.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoBien.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoBien!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoBien);
					this.jInternalFrameImportacionTipoBien.setVisible(false);
					this.jInternalFrameImportacionTipoBien.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoBien!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoBien);
					this.jInternalFrameOrderByTipoBien.setVisible(false);
					this.jInternalFrameOrderByTipoBien.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoBienActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoBienConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipobienReturnGeneral=new TipoBienParameterReturnGeneral();
			
			this.tipobienParameterGeneral=new TipoBienParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipobienLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoBienJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipobienSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(BienConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBienConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobienSessionBean.getEsGuardarRelacionado(),this.tipobienSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBienConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobienSessionBean.getEsGuardarRelacionado(),this.tipobienSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoBien=false;
			this.isVisibilidadCeldaDuplicarTipoBien=true;
			this.isVisibilidadCeldaCopiarTipoBien=true;
			this.isVisibilidadCeldaVerFormTipoBien=true;
			this.isVisibilidadCeldaOrdenTipoBien=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
			this.isVisibilidadCeldaModificarTipoBien=false;
			this.isVisibilidadCeldaActualizarTipoBien=false;
			this.isVisibilidadCeldaEliminarTipoBien=false;
			this.isVisibilidadCeldaCancelarTipoBien=false;
			this.isVisibilidadCeldaGuardarTipoBien=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoBien();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoBien(false);
			
			this.setPermisosUsuarioTipoBien();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobienSessionBean.getEsGuardarRelacionado() 
				|| (this.tipobienSessionBean.getEsGuardarRelacionado() && this.tipobienSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoBienClasesRelacionadas();
			}
			
			if(this.tipobienSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoBienClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoBienJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoBien();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoBien();
			}
			
			if(!this.isPermisoBusquedaTipoBien) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoBien.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoBien,this.isPermisoPaginacionMedioTipoBien,this.isPermisoPaginacionTodoTipoBien);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoBienConstantesFunciones.getTiposSeleccionarTipoBien());
				
				this.tiposColumnasSelect=TipoBienConstantesFunciones.getTiposSeleccionarTipoBien(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoBien();				
				//this.tiposRelacionesSelect=TipoBienConstantesFunciones.getTiposRelacionesTipoBien(true);
				
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
			//if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoBien();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoBien(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoBien(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBien() ;
			
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
			
			
			this.bienLogic=new BienLogic(); 
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
				tipobienImplementable= (TipoBienImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBienConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipobienImplementableHome= (TipoBienImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBienConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipobiens= new ArrayList<TipoBien>();
			this.tipobiensEliminados= new ArrayList<TipoBien>();
						
			this.isEsNuevoTipoBien=false;
			this.esParaAccionDesdeFormularioTipoBien=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoBien(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoBien();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoBienBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoBienConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoBien(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoBien!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoBien();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoBien();
			}
			
			TipoBienBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoBien.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoBien.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoBien.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoBien(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoBien: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoBien() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(BienConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(BienConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoBien")) {
				iIndex=this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();	
				
				

				if(sTitle.equals("Bienes")) {
					if(!BienJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoBien();

						this.cargarParteTabPanelRelacionadaBien(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoBien();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaBien(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoBien.cargarSessionConBeanSwingJInternalFrameBien(false,true,iIndex);
		this.jButtonBienActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaBien();

		//this.jTabbedPaneRelacionesTipoBien.updateUI();
		//this.jTabbedPaneRelacionesTipoBien.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoBien.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Bien")) {
				int row=this.jTableDatosTipoBien.getSelectedRow();
				jButtonBienActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Bien")) {

					if(this.isTienePermisosBien && this.tipobienConstantesFunciones.mostrarBienTipoBien && !TipoBienConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Bienes"+"("+BienConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Bienes");

						if(tipobienConstantesFunciones.resaltarBienTipoBien!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipobienConstantesFunciones.resaltarBienTipoBien);
						}

						jmenuItem.setEnabled(this.tipobienConstantesFunciones.activarBienTipoBien);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Bien"));

						

						this.jInternalFrameDetalleFormTipoBien.jmenuDetalleTipoBien.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoBien(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoBien(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoBien(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoBienListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoBien();
		
		this.cargarCombosFrameForeignKeyTipoBien();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoBien();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoBien();
		}
	}
	
	
	
	public void jButtonNuevoTipoBienActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipobienSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
			
			if(jTableDatosTipoBien.getRowCount()>=1) {
				jTableDatosTipoBien.removeRowSelectionInterval(0, jTableDatosTipoBien.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoBien=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoBien(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoBien(true);			
			//this.tipobien=new TipoBien();
			//this.tipobien.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBien(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBien() ;
			
			if(TipoBienJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBien(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipobien);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipobien);				
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
			if(this.tipobienSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoBien: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoBienActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoBien.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoBien.getSelectedRows().length;			
			}
			
			tipobiensSeleccionados=this.getTipoBiensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoBien--;			
				//TipoBien tipobienAux= new TipoBien();			
				//tipobienAux.setId(this.iIdNuevoTipoBien);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoBien tipobienOrigen=new TipoBien();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoBien tipobienOrigen : tipobiensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipobienOrigen =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobienOrigen =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoBien();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipobien.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoBien(tipobienOrigen,this.tipobien,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobienLogic.getTipoBiens().add(this.tipobienAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobiens.add(this.tipobienAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoBien(false);
				
				this.jTableDatosTipoBien.setRowSelectionInterval(this.getIndiceNuevoTipoBien(), this.getIndiceNuevoTipoBien());
				
				int iLastRow =  this.jTableDatosTipoBien.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBien.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBien.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBien(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();									
		
			TipoBien tipobienOrigen=new TipoBien();
			TipoBien tipobienDestino=new TipoBien();
				
			tipobiensSeleccionados=this.getTipoBiensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoBien.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipobiensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoBien.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobienOrigen =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobienOrigen =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobienDestino =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobienDestino =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipobienOrigen =tipobiensSeleccionados.get(0);
				tipobienDestino =tipobiensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoBien(tipobienOrigen,tipobienDestino,true,false);
				
				tipobienDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobienDestino,tipobienLogic.getTipoBiens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobienDestino,tipobiens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoBien(false);
				
				//this.jTableDatosTipoBien.setRowSelectionInterval(this.getIndiceNuevoTipoBien(), this.getIndiceNuevoTipoBien());
				
				int iLastRow =  this.jTableDatosTipoBien.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBien.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBien.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBien(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoBien.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoBien.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoBien.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoBien.setVisible(!isVisible);
			this.jPanelPaginacionTipoBien.setVisible(!isVisible);
			this.jPanelAccionesTipoBien.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoBien();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoBien();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoBien();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoBien();
			
			this.abrirFrameOrderByTipoBien();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoBien();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoBien(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBien);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoBien.isMaximum()) {
					this.jInternalFrameDetalleFormTipoBien.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoBien.setSize(this.jInternalFrameDetalleFormTipoBien.iWidthFormulario,this.jInternalFrameDetalleFormTipoBien.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoBien.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoBien.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoBien.isMaximum()) {
						this.jInternalFrameDetalleFormTipoBien.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoBien.jContentPaneDetalleTipoBien.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoBien.jContentPaneDetalleTipoBien.getWidth(),TipoBienConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoBien.jContentPaneDetalleTipoBien.getWidth(),TipoBienConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoBien.jContentPaneDetalleTipoBien.getWidth(),TipoBienConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(BienJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaBien();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoBien.setVisible(true);
	        this.jInternalFrameDetalleFormTipoBien.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoBien() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoBien==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBien,false,this);
				} else {
					this.jInternalFrameOrderByTipoBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBien,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoBien);
				this.jInternalFrameOrderByTipoBien.setVisible(false);
				this.jInternalFrameOrderByTipoBien.setSelected(false);
				
				this.jInternalFrameOrderByTipoBien.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBien"));
				
				this.inicializarActualizarBindingTablaOrderByTipoBien();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoBien() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoBien==null) {
				
				this.jInternalFrameImportacionTipoBien=new ImportacionJInternalFrame(TipoBienConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBien);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoBien);
				this.jInternalFrameImportacionTipoBien.setVisible(false);
				this.jInternalFrameImportacionTipoBien.setSelected(false);


				this.jInternalFrameImportacionTipoBien.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBien"));
				this.jInternalFrameImportacionTipoBien.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBien"));
				this.jInternalFrameImportacionTipoBien.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBien"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoBien() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoBien==null) {
				this.jInternalFrameReporteDinamicoTipoBien=new ReporteDinamicoJInternalFrame(TipoBienConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBien);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBien);
				this.jInternalFrameReporteDinamicoTipoBien.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoBien.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoBien.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBien"));
				this.jInternalFrameReporteDinamicoTipoBien.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBien"));
				this.jInternalFrameReporteDinamicoTipoBien.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBien"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBien();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaBien() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.jScrollPanelDatosBien.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoBien.jContentPaneDetalleTipoBien.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.jScrollPanelDatosBien.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.jScrollPanelDatosBien.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.jScrollPanelDatosBien.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoBien() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBien);
			
	       	this.jInternalFrameDetalleFormTipoBien.setVisible(false);
	        this.jInternalFrameDetalleFormTipoBien.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoBien.dispose();
			//this.jInternalFrameDetalleFormTipoBien=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoBien() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoBien.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoBien.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoBien() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoBien.setVisible(true);
	        this.jInternalFrameImportacionTipoBien.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoBien() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoBien.setVisible(true);
	        this.jInternalFrameOrderByTipoBien.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoBien() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoBien.setVisible(false);
	        this.jInternalFrameOrderByTipoBien.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoBien() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoBien.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoBien.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoBien() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoBien.setVisible(false);
	        this.jInternalFrameImportacionTipoBien.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoBien(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoBien(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoBien(true);
			//this.isEsNuevoTipoBien=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoBien("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBien(false) ;
			
			if(tipobienSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienSessionBean.getEsGuardarRelacionado() && BienJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBienActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoBienJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBien(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBien(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoBienActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoBien(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoBien(true);
			//this.isEsNuevoTipoBien=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipobien.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoBien("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoBien(false) ;
			
			if(TipoBienJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBien(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBien(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoBien(false);
			
			//if(!this.isEsNuevoTipoBien) {								
				int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
				
			}
			
			if(this.permiteMantenimiento(this.tipobien)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobienSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoBien=true;
					this.inicializarActualizarBindingTablaTipoBien(false);
					this.isEsNuevoTipoBien=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoBien=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoBien=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBien(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBien(false);
				
				this.habilitarDeshabilitarControlesTipoBien(false);
			
												
				
				if(TipoBienJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoBien();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoBienActionPerformed(evt,tipobienSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoBien(this.tipobien,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoBien.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipobienSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipobien.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoBienActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				this.tipobien.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				this.tipobien.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipobien)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobienSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoBienModel) this.jTableDatosTipoBien.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoBien=true;
				this.inicializarActualizarBindingTablaTipoBien(false);
				this.isEsNuevoTipoBien=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBien(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBien(false);
				
				this.habilitarDeshabilitarControlesTipoBien(false);
				
				
				
				if(TipoBienJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoBien();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoBienActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoBien.getRowCount()>=1) {
				jTableDatosTipoBien.removeRowSelectionInterval(0, jTableDatosTipoBien.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoBien(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoBien(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBien(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBien(false) ;
			
			this.isEsNuevoTipoBien=false;
			
			if(TipoBienJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoBien();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoBien(false);
				
				//SI ES MANUAL
				if(TipoBienJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoBien();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoBien--;			
			//TipoBien tipobienAux= new TipoBien();			
			//tipobienAux.setId(this.iIdNuevoTipoBien);
			
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoBien();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
			
			this.tipobien.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipobienLogic.getTipoBiens().add(this.tipobienAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipobiens.add(this.tipobienAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoBien(false);
			
			this.jTableDatosTipoBien.setRowSelectionInterval(this.getIndiceNuevoTipoBien(), this.getIndiceNuevoTipoBien());
			
			int iLastRow =  this.jTableDatosTipoBien.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoBien.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoBien.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoBien(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoBienActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoBien(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBien(false);
			
			//SI ES MANUAL
			if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBien();
			}
			
			//this.abrirFrameTreeTipoBien();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoBienActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo BienES ?", "MANTENIMIENTO DE Tipo Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoBien.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoBien();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipobienReturnGeneral=tipobienLogic.procesarImportacionTipoBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipobienParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoBienReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoBienActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoBien.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoBien.setFileImportacion(this.jInternalFrameImportacionTipoBien.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoBien.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoBien.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoBien.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoBien.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoBienActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		

		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoBienBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoBienBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoBiens("Todos",tipobiensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBienConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBienConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBienConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoBien.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoBienConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoBienConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoBienConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoBienConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoBienConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoBienConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBienConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoBienConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoBienConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoBienActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobien";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoBiens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoBienConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBienConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoBien tipobien:tipobiensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobien.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBienConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBienConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoBien tipobien:tipobiensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobien.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBienConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBienConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoBien tipobien:tipobiensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobien.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoBien(row);				
			//	iRow++;
			//}				
			
			//for(TipoBien tipobienAux:tipobiensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoBien(tipobienAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBien(false);
			
			//SI ES MANUAL
			if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBien();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBien(false);
			
			//SI ES MANUAL
			if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBien();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBien(false);
			
			//SI ES MANUAL
			if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBien();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoBien() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoBien.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoBien.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoBien.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoBien.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoBien.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoBien.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoBien.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoBien(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoBien(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoBien(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoBien(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoBien(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoBien(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBien(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoBien(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoBienJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoBien() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoBien();
		
		this.inicializarActualizarBindingBotonesManualTipoBien(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBien();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBien() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBien(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBien(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoBien.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoBien.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoBien.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoBien!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoBien.jCheckBoxPostAccionNuevoTipoBien.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoBien.jCheckBoxPostAccionSinCerrarTipoBien.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoBien.jCheckBoxPostAccionSinMensajeTipoBien.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoBien.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoBien.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoBien.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoBien!=null) {
				this.jInternalFrameDetalleFormTipoBien.jCheckBoxPostAccionNuevoTipoBien.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoBien.jCheckBoxPostAccionSinCerrarTipoBien.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoBien.jCheckBoxPostAccionSinMensajeTipoBien.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoBien.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoBien.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoBien.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoBien.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoBien.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoBien.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoBien.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoBien.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoBien.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoBien(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBien(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoBien() throws Exception {
		try	{
			if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBien();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBien() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBien() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoBien.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoBien.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoBien.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoBien.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoBien.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoBien.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoBien.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoBien.addItem(reporte);
			}
			
			
			if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoBien.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoBien.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoBien.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoBien.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoBien.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoBien.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoBien.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoBien.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoBien.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBien();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBien() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
				this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
				this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBien.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBien.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoBien.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBien.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBien.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoBien()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoBien(Boolean esInicializar) throws Exception {				
		if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBien();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoBien() throws Exception {
		this.inicializarActualizarBindingTablaTipoBien(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoBien() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoBienOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBienOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoBien(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipobienLogic.getTipoBiens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipobiens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoBien.setModel(new TipoBienModel(this.tipobienLogic.getTipoBiens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoBien.setModel(new TipoBienModel(this.tipobiens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoBien!=null && this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoBien();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBien,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoBienConstantesFunciones.SCLASSWEBTITULO,tipobienConstantesFunciones.resaltarSeleccionarTipoBien,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoBienConstantesFunciones.SCLASSWEBTITULO,tipobienConstantesFunciones.resaltarSeleccionarTipoBien,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBien,TipoBienConstantesFunciones.LABEL_ID));

		if(this.tipobienConstantesFunciones.mostraridTipoBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBienConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipobienConstantesFunciones.resaltaridTipoBien,this.tipobienConstantesFunciones.activaridTipoBien,this,true,"idTipoBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobienConstantesFunciones.resaltaridTipoBien,this.tipobienConstantesFunciones.activaridTipoBien,this,true,"idTipoBien","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBien,TipoBienConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipobienConstantesFunciones.mostrarid_empresaTipoBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBienConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipobienConstantesFunciones.resaltarid_empresaTipoBien,this,this.tipobienConstantesFunciones.activarid_empresaTipoBien));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipobienConstantesFunciones.resaltarid_empresaTipoBien,this,this.tipobienConstantesFunciones.activarid_empresaTipoBien,false,"id_empresaTipoBien","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBien,TipoBienConstantesFunciones.LABEL_CODIGO));

		if(this.tipobienConstantesFunciones.mostrarcodigoTipoBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBienConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobienConstantesFunciones.resaltarcodigoTipoBien,this.tipobienConstantesFunciones.activarcodigoTipoBien,this,true,"codigoTipoBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobienConstantesFunciones.resaltarcodigoTipoBien,this.tipobienConstantesFunciones.activarcodigoTipoBien,this,true,"codigoTipoBien","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBien,TipoBienConstantesFunciones.LABEL_NOMBRE));

		if(this.tipobienConstantesFunciones.mostrarnombreTipoBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBienConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobienConstantesFunciones.resaltarnombreTipoBien,this.tipobienConstantesFunciones.activarnombreTipoBien,this,true,"nombreTipoBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobienConstantesFunciones.resaltarnombreTipoBien,this.tipobienConstantesFunciones.activarnombreTipoBien,this,true,"nombreTipoBien","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoBienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosBien && this.tipobienConstantesFunciones.mostrarBienTipoBien && !TipoBienConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Bienes");
				tableColumn.setHeaderValue("Bienes");
				tableColumn.setCellRenderer(new BienTableCell(tipobienConstantesFunciones.resaltarBienTipoBien,this,this.tipobienConstantesFunciones.activarBienTipoBien));
				tableColumn.setCellEditor(new BienTableCell(tipobienConstantesFunciones.resaltarBienTipoBien,this,this.tipobienConstantesFunciones.activarBienTipoBien));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoBien.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobienSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobienSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBien.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobienSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobienSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBien.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoBien && this.isPermisoGuardarCambiosTipoBien) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipobienSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipobienSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoBien.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipobienSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoBien.addColumn(tableColumn);
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
			
			this.jTableDatosTipoBien.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBien && this.isPermisoGuardarCambiosTipoBien) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipobienSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBien && this.isPermisoGuardarCambiosTipoBien) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoBien.moveColumn(this.jTableDatosTipoBien.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoBien.moveColumn(this.jTableDatosTipoBien.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipobienSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoBien.moveColumn(this.jTableDatosTipoBien.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoBien.moveColumn(this.jTableDatosTipoBien.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoBien.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoBien.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoBien,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoBien.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoBien.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoBien.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoBien.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoBien.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipobienLogic.getTipoBiens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipobiens.size()-1;
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
		//this.jTableDatosTipoBien.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoBien();
			
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
				
				//this.isEsNuevoTipoBien=false;
					
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
				if(this.tipobienSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoBien==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBien.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBien.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipobien.getsType().equals("DUPLICADO")
				   || this.tipobien.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoBien=true;
				
				} else {
					this.isEsNuevoTipoBien=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
					if(this.tipobien.getId()>=0 && !this.tipobien.getIsNew()) {						
						this.isEsNuevoTipoBien=false;
						
					} else {
						this.isEsNuevoTipoBien=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoBien(esRelaciones);						
				
				this.seleccionarTipoBien(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipobien.getId()<0) {
					this.isEsNuevoTipoBien=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoBien(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoBien(evt,rowIndex);
				}	
				
				if(this.tipobienSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoBien: " + this.dDif); 
					}
				}								
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoBien(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipobien)) {
					if(this.tipobien.getId()>0) {
						this.tipobien.setIsDeleted(true);
						
						this.tipobiensEliminados.add(this.tipobien);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobienLogic.getTipoBiens().remove(this.tipobien);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobiens.remove(this.tipobien);				
					}
					
					
					((TipoBienModel) this.jTableDatosTipoBien.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBien(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoBien(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoBien) {
			
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBien.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBien.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoBien(this.tipobien);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipobienConstantesFunciones.cargarid_empresaTipoBien || this.tipobienConstantesFunciones.event_dependid_empresaTipoBien) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipobien.getid_empresa());
									//this.inicializarActualizarBindingTipoBien(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipobien.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipobien.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipobien.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoBien("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoBien(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBien() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBien(TipoBien tipobien) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoBien(tipobien,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBien(TipoBien tipobien,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoBien(tipobien);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoBien(tipobien,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoBien(tipobien);
	}
	
	public void setVariablesObjetoActualToFormularioTipoBien(TipoBien tipobien) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.setText(tipobien.getId().toString());
			this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.setText(tipobien.getcodigo());
			this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.setText(tipobien.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoBien tipobienLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipobienLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoBien tipobienLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipobienLocal=this.tipobien;
			} else {
				tipobienLocal=this.tipobienAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipobienLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoBien(tipobienLocal,true);
					
					if(tipobienSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipobienLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipobienSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipobienLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoBien(TipoBien tipobien,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBien(tipobien,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(tipobien);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBien(TipoBien tipobien,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBien(tipobien,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBien(TipoBien tipobien,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.getText()==null || this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.getText()=="" || this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.setText("0");
			}

			if(conColumnasBase) {tipobien.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBienConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBien.jLabelIdTipoBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobien.setcodigo(this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBienConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBien.jLabelcodigoTipoBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobien.setnombre(this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBienConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBien.jLabelnombreTipoBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBien(TipoBien tipobienBean,TipoBien tipobien,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoBien(TipoBien tipobienOrigen,TipoBien tipobien,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobienOrigen.getId()!=null && !tipobienOrigen.getId().equals(0L))) {tipobien.setId(tipobienOrigen.getId());}}
			if(conDefault || (!conDefault && tipobienOrigen.getcodigo()!=null && !tipobienOrigen.getcodigo().equals(""))) {tipobien.setcodigo(tipobienOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipobienOrigen.getnombre()!=null && !tipobienOrigen.getnombre().equals(""))) {tipobien.setnombre(tipobienOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBien(TipoBien tipobien) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.setText(tipobien.getId().toString());
			this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.setText(tipobien.getcodigo());
			this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.setText(tipobien.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBien(TipoBienBean tipobienBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.setText(tipobienBean.getId().toString());
			this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.setText(tipobienBean.getcodigo());
			this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.setText(tipobienBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoBien(TipoBienParameterReturnGeneral tipobienReturnGeneral,TipoBienBean tipobienBean,Boolean conDefault) throws Exception { 
		try {
			TipoBien tipobienLocal=new TipoBien();
			
			tipobienLocal=tipobienReturnGeneral.getTipoBien();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobienLocal.getId()!=null && !tipobienLocal.getId().equals(0L))) {tipobienBean.setId(tipobienLocal.getId());}}
			if(conDefault || (!conDefault && tipobienLocal.getcodigo()!=null && !tipobienLocal.getcodigo().equals(""))) {tipobienBean.setcodigo(tipobienLocal.getcodigo());}
			if(conDefault || (!conDefault && tipobienLocal.getnombre()!=null && !tipobienLocal.getnombre().equals(""))) {tipobienBean.setnombre(tipobienLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoBienGenerico(Long idTipoBienSeleccionado,JComboBox jComboBoxTipoBien,List<TipoBien> tipobiensLocal)throws Exception {
		try {
			TipoBien  tipobienTemp=null;

			for(TipoBien tipobienAux:tipobiensLocal) {
				if(tipobienAux.getId()!=null && tipobienAux.getId().equals(idTipoBienSeleccionado)) {
					tipobienTemp=tipobienAux;
					break;
				}
			}

			jComboBoxTipoBien.setSelectedItem(tipobienTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoBienGenerico(JComboBox jComboBoxTipoBien,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBien.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoBien.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBien.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoBien.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Bien")) {
			jButtonBienActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobien=(TipoBien) tipobienLogic.getTipoBiens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobien =(TipoBien) tipobiens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipobien.getIsNew() && !tipobien.getIsChanged() && !tipobien.getIsDeleted()) {
				sDescripcion=tipobien.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipobien.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoBien tipobienRow=new TipoBien();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobienRow=(TipoBien) tipobienLogic.getTipoBiens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobienRow=(TipoBien) tipobiens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonBienActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoBien tipobien) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoBien==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobien = (TipoBien)this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipobien = (TipoBien)this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipobien!=null) {
						this.tipobien = tipobien;
					} else {
						this.tipobien = new TipoBien();
					}
				}

				if(this.isTienePermisosBien && this.permiteMantenimiento(this.tipobien)) {
					BienBeanSwingJInternalFrame bienBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFramePopup=new BienBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						bienBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFramePopup;
					} else {
						bienBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame;
					}

					List<TipoBien> tipobiens=new ArrayList<TipoBien>();
					tipobiens.add(this.tipobien);
					if(!esRelacionado) {
						//bienBeanSwingJInternalFrame.bienSessionBean.setConGuardarRelaciones(false);
						//bienBeanSwingJInternalFrame.bienSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					bienBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoBien.cargarBienBeanSwingJInternalFrame(tipobiens,this.tipobien,bienBeanSwingJInternalFrame,/*conInicializar,*/bienBeanSwingJInternalFrame.bienSessionBean.getConGuardarRelaciones(),bienBeanSwingJInternalFrame.bienSessionBean.getEsGuardarRelacionado());
					bienBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						bienBeanSwingJInternalFrame.actualizarEstadoPanelsBien("no_relacionado");

						bienBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(BienConstantesFunciones.ITAMANIOFILATABLA + (BienConstantesFunciones.ITAMANIOFILATABLA/2));

						bienBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoBien=(TitledBorder)this.jScrollPanelDatosTipoBien.getBorder();
						TitledBorder titledBorderBien=(TitledBorder)bienBeanSwingJInternalFrame.jScrollPanelDatosBien.getBorder();

						titledBorderBien.setTitle(titledBorderTipoBien.getTitle() + " -> Bien");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,bienBeanSwingJInternalFrame);
						}

						bienBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(bienBeanSwingJInternalFrame);

						bienBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipobienSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Bien",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoBien(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoBien.setVisible((this.isVisibilidadCeldaNuevoTipoBien && this.isPermisoNuevoTipoBien));			
			this.jButtonDuplicarTipoBien.setVisible((this.isVisibilidadCeldaDuplicarTipoBien && this.isPermisoDuplicarTipoBien));			
			this.jButtonCopiarTipoBien.setVisible((this.isVisibilidadCeldaCopiarTipoBien && this.isPermisoCopiarTipoBien));
			this.jButtonVerFormTipoBien.setVisible((this.isVisibilidadCeldaVerFormTipoBien && this.isPermisoVerFormTipoBien));
			
			this.jButtonAbrirOrderByTipoBien.setVisible((this.isVisibilidadCeldaOrdenTipoBien && this.isPermisoOrdenTipoBien));			
			
			this.jButtonNuevoRelacionesTipoBien.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBien && this.isPermisoNuevoTipoBien));			
			this.jButtonNuevoGuardarCambiosTipoBien.setVisible((this.isVisibilidadCeldaNuevoTipoBien && this.isPermisoNuevoTipoBien && this.isPermisoGuardarCambiosTipoBien));
			
			if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.jInternalFrameDetalleFormTipoBien.jButtonModificarTipoBien.setVisible((this.isVisibilidadCeldaModificarTipoBien && this.isPermisoActualizarTipoBien));	
			this.jInternalFrameDetalleFormTipoBien.jButtonActualizarTipoBien.setVisible((this.isVisibilidadCeldaActualizarTipoBien && this.isPermisoActualizarTipoBien));	
			this.jInternalFrameDetalleFormTipoBien.jButtonEliminarTipoBien.setVisible((this.isVisibilidadCeldaEliminarTipoBien && this.isPermisoEliminarTipoBien));
			this.jInternalFrameDetalleFormTipoBien.jButtonCancelarTipoBien.setVisible(this.isVisibilidadCeldaCancelarTipoBien);							
			this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.setVisible((this.isVisibilidadCeldaGuardarTipoBien && this.isPermisoGuardarCambiosTipoBien));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoBien.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBien && this.isPermisoGuardarCambiosTipoBien));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoBien.setVisible((this.isVisibilidadCeldaNuevoTipoBien && this.isPermisoNuevoTipoBien));						
			this.jButtonDuplicarToolBarTipoBien.setVisible((this.isVisibilidadCeldaDuplicarTipoBien && this.isPermisoDuplicarTipoBien));						
			this.jButtonCopiarToolBarTipoBien.setVisible((this.isVisibilidadCeldaCopiarTipoBien && this.isPermisoCopiarTipoBien));			
			this.jButtonVerFormToolBarTipoBien.setVisible((this.isVisibilidadCeldaVerFormTipoBien && this.isPermisoVerFormTipoBien));			
			this.jButtonAbrirOrderByToolBarTipoBien.setVisible((this.isVisibilidadCeldaOrdenTipoBien && this.isPermisoOrdenTipoBien));
			this.jButtonNuevoRelacionesToolBarTipoBien.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBien && this.isPermisoNuevoTipoBien));			
			this.jButtonNuevoGuardarCambiosToolBarTipoBien.setVisible((this.isVisibilidadCeldaNuevoTipoBien && this.isPermisoNuevoTipoBien && this.isPermisoGuardarCambiosTipoBien));			
			
			if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.jInternalFrameDetalleFormTipoBien.jButtonModificarToolBarTipoBien.setVisible((this.isVisibilidadCeldaModificarTipoBien && this.isPermisoActualizarTipoBien));	
			this.jInternalFrameDetalleFormTipoBien.jButtonActualizarToolBarTipoBien.setVisible((this.isVisibilidadCeldaActualizarTipoBien  && this.isPermisoActualizarTipoBien));	
			this.jInternalFrameDetalleFormTipoBien.jButtonEliminarToolBarTipoBien.setVisible((this.isVisibilidadCeldaEliminarTipoBien && this.isPermisoEliminarTipoBien));
			this.jInternalFrameDetalleFormTipoBien.jButtonCancelarToolBarTipoBien.setVisible(this.isVisibilidadCeldaCancelarTipoBien);				
			this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosToolBarTipoBien.setVisible((this.isVisibilidadCeldaGuardarTipoBien && this.isPermisoGuardarCambiosTipoBien));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoBien.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBien && this.isPermisoGuardarCambiosTipoBien));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoBien.setVisible((this.isVisibilidadCeldaNuevoTipoBien && this.isPermisoNuevoTipoBien));			
			this.jMenuItemDuplicarTipoBien.setVisible((this.isVisibilidadCeldaDuplicarTipoBien && this.isPermisoDuplicarTipoBien));			
			this.jMenuItemCopiarTipoBien.setVisible((this.isVisibilidadCeldaCopiarTipoBien && this.isPermisoCopiarTipoBien));			
			this.jMenuItemVerFormTipoBien.setVisible((this.isVisibilidadCeldaVerFormTipoBien && this.isPermisoVerFormTipoBien));			
			this.jMenuItemAbrirOrderByTipoBien.setVisible((this.isVisibilidadCeldaOrdenTipoBien && this.isPermisoOrdenTipoBien));			
			//this.jMenuItemMostrarOcultarTipoBien.setVisible((this.isVisibilidadCeldaOrdenTipoBien && this.isPermisoOrdenTipoBien));
			this.jMenuItemDetalleAbrirOrderByTipoBien.setVisible((this.isVisibilidadCeldaOrdenTipoBien && this.isPermisoOrdenTipoBien));			
			//this.jMenuItemDetalleMostrarOcultarTipoBien.setVisible((this.isVisibilidadCeldaOrdenTipoBien && this.isPermisoOrdenTipoBien));			
			this.jMenuItemNuevoRelacionesTipoBien.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBien && this.isPermisoNuevoTipoBien));			
			this.jMenuItemNuevoGuardarCambiosTipoBien.setVisible((this.isVisibilidadCeldaNuevoTipoBien && this.isPermisoNuevoTipoBien && this.isPermisoGuardarCambiosTipoBien));									
			
			if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.jInternalFrameDetalleFormTipoBien.jMenuItemModificarTipoBien.setVisible((this.isVisibilidadCeldaModificarTipoBien && this.isPermisoActualizarTipoBien));	
			this.jInternalFrameDetalleFormTipoBien.jMenuItemActualizarTipoBien.setVisible((this.isVisibilidadCeldaActualizarTipoBien && this.isPermisoActualizarTipoBien));	
			this.jInternalFrameDetalleFormTipoBien.jMenuItemEliminarTipoBien.setVisible((this.isVisibilidadCeldaEliminarTipoBien && this.isPermisoEliminarTipoBien));
			this.jInternalFrameDetalleFormTipoBien.jMenuItemCancelarTipoBien.setVisible(this.isVisibilidadCeldaCancelarTipoBien);				
			}
			
			this.jMenuItemGuardarCambiosTipoBien.setVisible((this.isVisibilidadCeldaGuardarTipoBien && this.isPermisoGuardarCambiosTipoBien));						
			this.jMenuItemGuardarCambiosTablaTipoBien.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBien && this.isPermisoGuardarCambiosTipoBien));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoBien=this.jButtonNuevoTipoBien.isVisible();
			this.isVisibilidadCeldaDuplicarTipoBien=this.jButtonDuplicarTipoBien.isVisible();
			this.isVisibilidadCeldaCopiarTipoBien=this.jButtonCopiarTipoBien.isVisible();
			this.isVisibilidadCeldaVerFormTipoBien=this.jButtonVerFormTipoBien.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoBien=this.jButtonAbrirOrderByTipoBien.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=this.jButtonNuevoRelacionesTipoBien.isVisible();
			this.isVisibilidadCeldaModificarTipoBien=this.jButtonModificarTipoBien.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.isVisibilidadCeldaActualizarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonActualizarTipoBien.isVisible();
			this.isVisibilidadCeldaEliminarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonEliminarTipoBien.isVisible();
			this.isVisibilidadCeldaCancelarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonCancelarTipoBien.isVisible();
			this.isVisibilidadCeldaGuardarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoBien=this.jButtonGuardarCambiosTablaTipoBien.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoBien=this.jButtonNuevoToolBarTipoBien.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=this.jButtonNuevoRelacionesToolBarTipoBien.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.isVisibilidadCeldaModificarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonModificarToolBarTipoBien.isVisible();
			this.isVisibilidadCeldaActualizarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonActualizarToolBarTipoBien.isVisible();
			this.isVisibilidadCeldaEliminarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonEliminarToolBarTipoBien.isVisible();
			this.isVisibilidadCeldaCancelarTipoBien=this.jInternalFrameDetalleFormTipoBien.jButtonCancelarToolBarTipoBien.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBien=this.jButtonGuardarCambiosToolBarTipoBien.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBien=this.jButtonGuardarCambiosTablaToolBarTipoBien.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoBien=this.jMenuItemNuevoTipoBien.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=this.jMenuItemNuevoRelacionesTipoBien.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.isVisibilidadCeldaModificarTipoBien=this.jInternalFrameDetalleFormTipoBien.jMenuItemModificarTipoBien.isVisible();
			this.isVisibilidadCeldaActualizarTipoBien=this.jInternalFrameDetalleFormTipoBien.jMenuItemActualizarTipoBien.isVisible();
			this.isVisibilidadCeldaEliminarTipoBien=this.jInternalFrameDetalleFormTipoBien.jMenuItemEliminarTipoBien.isVisible();
			this.isVisibilidadCeldaCancelarTipoBien=this.jInternalFrameDetalleFormTipoBien.jMenuItemCancelarTipoBien.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBien=this.jMenuItemGuardarCambiosTipoBien.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBien=this.jMenuItemGuardarCambiosTablaTipoBien.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoBien(Boolean esInicializar) {
		if(TipoBienJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipobienSessionBean.getConGuardarRelaciones()) {
				//if(this.tipobienSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBien();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoBien(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoBien() {
		this.jButtonNuevoTipoBien.setVisible(this.isPermisoNuevoTipoBien);			
		this.jButtonDuplicarTipoBien.setVisible(this.isPermisoDuplicarTipoBien);			
		this.jButtonCopiarTipoBien.setVisible(this.isPermisoCopiarTipoBien);			
		this.jButtonVerFormTipoBien.setVisible(this.isPermisoVerFormTipoBien);			
		
		this.jButtonAbrirOrderByTipoBien.setVisible(this.isPermisoOrdenTipoBien);					
		
		this.jButtonNuevoRelacionesTipoBien.setVisible(this.isPermisoNuevoTipoBien);			
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonModificarTipoBien.setVisible(this.isPermisoActualizarTipoBien);	
			this.jInternalFrameDetalleFormTipoBien.jButtonActualizarTipoBien.setVisible(this.isPermisoActualizarTipoBien);	
			this.jInternalFrameDetalleFormTipoBien.jButtonEliminarTipoBien.setVisible(this.isPermisoEliminarTipoBien);
			this.jInternalFrameDetalleFormTipoBien.jButtonCancelarTipoBien.setVisible(this.isVisibilidadCeldaCancelarTipoBien);						
			this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.setVisible(this.isPermisoGuardarCambiosTipoBien);							
		}
		
		this.jButtonGuardarCambiosTablaTipoBien.setVisible(this.isPermisoActualizarTipoBien);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBien() {
		this.jInternalFrameDetalleFormTipoBien.jButtonModificarTipoBien.setVisible(this.isPermisoActualizarTipoBien);	
		this.jInternalFrameDetalleFormTipoBien.jButtonActualizarTipoBien.setVisible(this.isPermisoActualizarTipoBien);	
		this.jInternalFrameDetalleFormTipoBien.jButtonEliminarTipoBien.setVisible(this.isPermisoEliminarTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jButtonCancelarTipoBien.setVisible(this.isVisibilidadCeldaCancelarTipoBien);							
		this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.setVisible((this.isVisibilidadCeldaGuardarTipoBien && this.isPermisoGuardarCambiosTipoBien));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoBien() {
		if(TipoBienJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoBien();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoBien() {
	}
	
	public void jTableDatosTipoBienListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoBien(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBien(this.gettipobien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobien==null) {
						this.tipobien = new TipoBien();
					}

					this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
				}

				if(this.tipobien.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipobien.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoBienUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoBien(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoBien.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoBien.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoBien(this.gettipobien(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipobienLogic.getConnexion());

				if(this.tipobien.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipobien.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoBien=(TitledBorder)this.jScrollPanelDatosTipoBien.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoBien.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBien(this.gettipobien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobien==null) {
						this.tipobien = new TipoBien();
					}

					this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
				}

				if(this.tipobien.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipobien.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBien(this.gettipobien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobien==null) {
						this.tipobien = new TipoBien();
					}

					this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
				}

				if(this.tipobien.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipobien.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBien(this.gettipobien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobien==null) {
						this.tipobien = new TipoBien();
					}

					this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);
				}

				if(this.tipobien.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipobien.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoBienActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoBien(false,false);

			this.getTipoBiensFK_IdEmpresa();

			this.inicializarActualizarBindingTipoBien(false);

			//if(TipoBienBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoBien(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobienLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoBien() {
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
		

		if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
			this.jInternalFrameDetalleFormTipoBien.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoBien.dispose();
			this.jInternalFrameDetalleFormTipoBien=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
			this.jInternalFrameReporteDinamicoTipoBien.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoBien.dispose();
			this.jInternalFrameReporteDinamicoTipoBien=null;
		}
		
		if(this.jInternalFrameImportacionTipoBien!=null) {
			this.jInternalFrameImportacionTipoBien.setVisible(false);	    			
			this.jInternalFrameImportacionTipoBien.dispose();
			this.jInternalFrameImportacionTipoBien=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoBien();
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoBien")) {
				jButtonDuplicarTipoBienActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoBien")) {
				jButtonCopiarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoBien")) {
				jButtonVerFormTipoBienActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoBien")) {
				jButtonDuplicarTipoBienActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoBien")) {
				jButtonDuplicarTipoBienActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoBien")) {
				jButtonModificarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoBien")) {
				jButtonModificarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoBien")) {
				jButtonModificarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoBien")) {
				jButtonActualizarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoBien")) {
				jButtonActualizarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoBien")) {
				jButtonActualizarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoBien")) {
				jButtonEliminarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoBien")) {
				jButtonEliminarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoBien")) {
				jButtonEliminarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoBien")) {
				jButtonCancelarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoBien")) {
				jButtonCancelarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoBien")) {
				jButtonCancelarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoBien")) {
				jButtonCerrarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoBien")) {
				jButtonCerrarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoBien")) {
				jButtonCerrarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoBien")) {
				jButtonMostrarOcultarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoBien")) {
				jButtonCancelarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoBien")) {
				jButtonCopiarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoBien")) {
				jButtonVerFormTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoBien")) {
				jButtonCopiarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoBien")) {
				jButtonVerFormTipoBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoBien")) {
				jButtonRecargarInformacionTipoBienActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoBien")) {
				jButtonRecargarInformacionTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoBien")) {
				jButtonRecargarInformacionTipoBienActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoBien")) {
				jButtonAnterioresTipoBienActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoBien")) {
				jButtonAnterioresTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoBien")) {
				jButtonAnterioresTipoBienActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoBien")) {
				jButtonSiguientesTipoBienActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoBien")) {
				jButtonSiguientesTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoBien")) {
				jButtonSiguientesTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoBien") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoBien")) {
				jButtonAbrirOrderByTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoBien") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoBien")) {
				jButtonMostrarOcultarTipoBienActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBien")) {
				jButtonNuevoGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoBien")) {
				jButtonNuevoGuardarCambiosTipoBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoBien")) {
				jButtonNuevoGuardarCambiosTipoBienActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoBien")) {
				jButtonCerrarReporteDinamicoTipoBienActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoBien")) {
				jButtonGenerarReporteDinamicoTipoBienActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoBien")) {
				
				jButtonGenerarExcelReporteDinamicoTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoBien")) {
				jButtonCerrarImportacionTipoBienActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoBien")) {
				
				jButtonGenerarImportacionTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoBien")) {
				
				jButtonAbrirImportacionTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoBien")) {
				jComboBoxTiposAccionesTipoBienActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoBien")) {
				jComboBoxTiposRelacionesTipoBienActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoBien")) {
				jComboBoxTiposAccionesTipoBienActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoBien")) {
				
				jComboBoxTiposSeleccionarTipoBienActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoBien")) {
				jTextFieldValorCampoGeneralTipoBienActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoBien")) {
				jButtonAbrirOrderByTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoBien")) {
				jButtonAbrirOrderByTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoBien")) {
				jButtonCerrarOrderByTipoBienActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBienBusqueda")) {
				this.jButtonidTipoBienBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBienUpdate")) {
				this.jButtonid_empresaTipoBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBienBusqueda")) {
				this.jButtonid_empresaTipoBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBienBusqueda")) {
				this.jButtoncodigoTipoBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBienBusqueda")) {
				this.jButtonnombreTipoBienBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoBien();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBienActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoBien tipobienLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipobienLocal=this.tipobien;
			} else {
				tipobienLocal=this.tipobienAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
							
				
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienAnterior =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobienAnterior =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
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
			
			


			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBienActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
								
						
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
								
				
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienAnterior =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobienAnterior =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienAnterior =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobienAnterior =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
							
				
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBienActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobienAnterior =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobienAnterior =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
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
			
			


			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
								
				
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienAnterior =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobienAnterior =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBienActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoBien")) {
					jCheckBoxSeleccionarTodosTipoBienItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoBien")) {
					jCheckBoxSeleccionadosTipoBienItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoBien")) {
					
				}
				
				


				
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
												
				
				


				
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBienActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobienAnterior =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobienAnterior =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBienActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
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
			
			


			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBienActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobien);
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
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
				
				


				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBien.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobienAnterior =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobienAnterior =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoBien")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoBienListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoBien.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipobien =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipobien =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipobien);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoBien")) {
				
				}
				
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoBien")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoBien.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoBien")) {
			
			}
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoBien();
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
			if(sTipo.equals("NuevoTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoBien")) {
				jButtonDuplicarTipoBienActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoBien")) {
				jButtonCopiarTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoBien")) {
				jButtonVerFormTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoBien")) {
				jButtonNuevoTipoBienActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoBien")) {
				jButtonModificarTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoBien")) {
				jButtonActualizarTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoBien")) {
				jButtonEliminarTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoBien")) {
				jButtonCancelarTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoBien")) {
				jButtonCerrarTipoBienActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoBien")) {
				jButtonGuardarCambiosTipoBienActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBien")) {
				jButtonNuevoGuardarCambiosTipoBienActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoBien")) {
				jButtonAbrirOrderByTipoBienActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoBien")) {
				jButtonRecargarInformacionTipoBienActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoBien")) {
				jButtonAnterioresTipoBienActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoBien")) {
				jButtonSiguientesTipoBienActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBienBusqueda")) {
				this.jButtonidTipoBienBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBienUpdate")) {
				this.jButtonid_empresaTipoBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBienBusqueda")) {
				this.jButtonid_empresaTipoBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBienBusqueda")) {
				this.jButtoncodigoTipoBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBienBusqueda")) {
				this.jButtonnombreTipoBienBusquedaActionPerformed(evt);
			}
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoBien();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoBien")) {
				closingInternalFrameTipoBien();
				
			} else if(sTipo.equals("jButtonCancelarTipoBien")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoBien = (JInternalFrameBase)evt.getSource();
	            	
	            TipoBienBeanSwingJInternalFrame jInternalFrameParent=(TipoBienBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBien.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoBienActionPerformed(null);
			}
			
			TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobien,new Object(),this.tipobienParameterGeneral,this.tipobienReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoBien(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoBien(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoBien(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipobien)) {
			if(!esControlTabla) {
				if(TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);			
				}
				
				if(this.tipobienSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoBien(this.tipobien,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobienReturnGeneral=tipobienLogic.procesarEventosTipoBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobienLogic.getTipoBiens(),this.tipobien,this.tipobienParameterGeneral,this.isEsNuevoTipoBien,classes);//this.tipobienLogic.getTipoBien()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoBien(this.tipobienReturnGeneral,this.tipobienBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipobienSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoBien(classes,this.tipobienReturnGeneral,this.tipobienBean,false);
					}
						
					if(this.tipobienReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoBien(this.tipobienReturnGeneral.getTipoBien());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoBien(this.tipobienReturnGeneral.getTipoBien());	
					}
						
					if(this.tipobienReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoBien(this.tipobienReturnGeneral.getTipoBien(),classes);//this.tipobienBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoBien(this.tipobien,classes);//this.tipobienBean);									
				}
			
				if(TipoBienJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoBien(this.tipobien,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBien(this.tipobien);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipobienAnterior!=null) {
						this.tipobien=this.tipobienAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobienReturnGeneral=tipobienLogic.procesarEventosTipoBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobienLogic.getTipoBiens(),this.tipobien,this.tipobienParameterGeneral,this.isEsNuevoTipoBien,classes);//this.tipobienLogic.getTipoBien()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobienSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobienSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipobienReturnGeneral.getTipoBien(),tipobienLogic.getTipoBiens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipobienReturnGeneral.getTipoBien(),this.tipobiens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoBien.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoBien.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoBien();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoBien() throws Exception {
		
		TipoBienModel tipobienModel=(TipoBienModel)this.jTableDatosTipoBien.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobienModel.tipobiens=this.tipobienLogic.getTipoBiens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipobienModel.tipobiens=this.tipobiens;
		}
		
		
		((TipoBienModel) this.jTableDatosTipoBien.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoBien() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipobienAnterior(),this.tipobienLogic.getTipoBiens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipobienAnterior(),this.tipobiens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoBien();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoBien(TipoBien tipobien,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Bien.class)) {
					this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.setBiens(tipobien.getBiens());
					this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.inicializarActualizarBindingTablaBien(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
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
										
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobien,new Object(),generalEntityParameterGeneral,this.tipobienReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipobienSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoBienConstantesFunciones.getClassesRelationshipsOfTipoBien(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoBienConstantesFunciones.getClassesRelationshipsFromStringsOfTipoBien(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoBien(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoBienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobien,new Object(),generalEntityParameterGeneral,this.tipobienReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoBien(TipoBienBean tipobienBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Bien.class)) {
					this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.setBiens(tipobien.getBiens());
					this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.inicializarActualizarBindingTablaBien(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoBien(ArrayList<Classe> classes,TipoBienReturnGeneral tipobienReturnGeneral,TipoBienBean tipobienBean,Boolean conDefault) throws Exception {
		
			this.tipobienBean.setBiens(tipobienReturnGeneral.getTipoBien().getBiens());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoBien(TipoBien tipobien,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Bien.class)) {
					tipobien.setBiens(this.jInternalFrameDetalleFormTipoBien.bienBeanSwingJInternalFrame.bienLogic.getBiens());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipobien)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoBien = new TipoBienDetalleFormJInternalFrame(jDesktopPane,this.tipobienSessionBean.getConGuardarRelaciones(),this.tipobienSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBien);
		this.jInternalFrameDetalleFormTipoBien.setVisible(false);
		this.jInternalFrameDetalleFormTipoBien.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoBien.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoBien.tipobienLogic=this.tipobienLogic;
		
		this.cargarCombosFrameForeignKeyTipoBien("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBien();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBien();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoBien("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoBien();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoBien.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBien"));
		
		this.jInternalFrameDetalleFormTipoBien.jButtonModificarTipoBien.addActionListener(new ButtonActionListener(this,"ModificarTipoBien"));

		
		this.jInternalFrameDetalleFormTipoBien.jButtonModificarToolBarTipoBien.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBien"));
					
		this.jInternalFrameDetalleFormTipoBien.jMenuItemModificarTipoBien.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBien"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonActualizarTipoBien.addActionListener (new ButtonActionListener(this,"ActualizarTipoBien"));
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonActualizarToolBarTipoBien.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBien"));
						
		this.jInternalFrameDetalleFormTipoBien.jMenuItemActualizarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBien"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonEliminarTipoBien.addActionListener (new ButtonActionListener(this,"EliminarTipoBien"));
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonEliminarToolBarTipoBien.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBien"));
								
		this.jInternalFrameDetalleFormTipoBien.jMenuItemEliminarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBien"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonCancelarTipoBien.addActionListener (new ButtonActionListener(this,"CancelarTipoBien"));
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonCancelarToolBarTipoBien.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBien"));
					
		this.jInternalFrameDetalleFormTipoBien.jMenuItemCancelarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBien"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoBien.jMenuItemDetalleCerrarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBien"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosToolBarTipoBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBien"));
		
		
		
		this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosToolBarTipoBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBien"));
		
		
		
		this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBien"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonidTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBien.jButtonid_empresaTipoBienUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonid_empresaTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtoncodigoTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonnombreTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBienBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBien"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoBien"));
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBien"));
		}
		
		this.jTableDatosTipoBien.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoBien"));
		
		this.jTableDatosTipoBien.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoBien"));
		
		this.jButtonNuevoTipoBien.addActionListener(new ButtonActionListener(this,"NuevoTipoBien"));
		
		this.jButtonDuplicarTipoBien.addActionListener(new ButtonActionListener(this,"DuplicarTipoBien"));
		
		this.jButtonCopiarTipoBien.addActionListener(new ButtonActionListener(this,"CopiarTipoBien"));
		
		this.jButtonVerFormTipoBien.addActionListener(new ButtonActionListener(this,"VerFormTipoBien"));
		
		
		this.jButtonNuevoToolBarTipoBien.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoBien"));
			
		this.jButtonDuplicarToolBarTipoBien.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoBien"));
			
		this.jMenuItemNuevoTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoBien"));
			
		this.jMenuItemDuplicarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoBien"));		
		
		
		this.jButtonNuevoRelacionesTipoBien.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoBien"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoBien.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoBien"));
			
		this.jMenuItemNuevoRelacionesTipoBien.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoBien"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonModificarTipoBien.addActionListener(new ButtonActionListener(this,"ModificarTipoBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonModificarToolBarTipoBien.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBien"));
			
			this.jInternalFrameDetalleFormTipoBien.jMenuItemModificarTipoBien.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoBien.jButtonActualizarTipoBien.addActionListener (new ButtonActionListener(this,"ActualizarTipoBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonActualizarToolBarTipoBien.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBien"));
				
			this.jInternalFrameDetalleFormTipoBien.jMenuItemActualizarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonEliminarTipoBien.addActionListener (new ButtonActionListener(this,"EliminarTipoBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonEliminarToolBarTipoBien.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBien"));
						
			this.jInternalFrameDetalleFormTipoBien.jMenuItemEliminarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonCancelarTipoBien.addActionListener (new ButtonActionListener(this,"CancelarTipoBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonCancelarToolBarTipoBien.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBien"));
			
			this.jInternalFrameDetalleFormTipoBien.jMenuItemCancelarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBien"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoBien.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoBien"));		
		
		
		this.jButtonCerrarTipoBien.addActionListener (new ButtonActionListener(this,"CerrarTipoBien"));
		
		
		this.jButtonCerrarToolBarTipoBien.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoBien"));
			
		this.jMenuItemCerrarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoBien"));
			
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jMenuItemDetalleCerrarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosToolBarTipoBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBien"));
		}
		
		this.jButtonCopiarToolBarTipoBien.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoBien"));
			
		this.jButtonVerFormToolBarTipoBien.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoBien"));
		
		this.jMenuItemGuardarCambiosTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoBien"));
			
		this.jMenuItemCopiarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoBien"));		
		
		this.jMenuItemVerFormTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoBien"));		
		
		
		this.jButtonGuardarCambiosTablaTipoBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBien"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoBien"));
			
		this.jMenuItemGuardarCambiosTablaTipoBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBien"));		
		
		
		
		this.jButtonRecargarInformacionTipoBien.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoBien"));
					
		this.jButtonRecargarInformacionToolBarTipoBien.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoBien"));
		
		this.jMenuItemRecargarInformacionTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoBien"));		
		
		
		
		this.jButtonAnterioresTipoBien.addActionListener (new ButtonActionListener(this,"AnterioresTipoBien"));
		
		
		this.jButtonAnterioresToolBarTipoBien.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoBien"));
		
		this.jMenuItemAnterioresTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoBien"));		
		
		
		this.jButtonSiguientesTipoBien.addActionListener (new ButtonActionListener(this,"SiguientesTipoBien"));
		
		
		this.jButtonSiguientesToolBarTipoBien.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoBien"));
			
		this.jMenuItemSiguientesTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoBien"));
			
		this.jMenuItemAbrirOrderByTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoBien"));
			
		this.jMenuItemMostrarOcultarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoBien"));
			
		this.jMenuItemDetalleAbrirOrderByTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoBien"));
			
		this.jMenuItemDetalleMostarOcultarTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoBien"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoBien.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoBien"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBien.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoBien"));
			
		this.jMenuItemNuevoGuardarCambiosTipoBien.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoBien"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoBien.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoBien"));

		this.jCheckBoxSeleccionadosTipoBien.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoBien"));
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBien"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoBien.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoBien"));
			
		this.jComboBoxTiposAccionesTipoBien.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoBien"));
					
		this.jComboBoxTiposSeleccionarTipoBien.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoBien"));
			
		this.jTextFieldValorCampoGeneralTipoBien.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoBien"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonidTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBien.jButtonid_empresaTipoBienUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonid_empresaTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtoncodigoTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonnombreTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBienBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoBien!=null) {
				this.jInternalFrameReporteDinamicoTipoBien.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBien"));
				this.jInternalFrameReporteDinamicoTipoBien.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBien"));
				this.jInternalFrameReporteDinamicoTipoBien.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBien"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoBien.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBien"));				
			//this.jButtonGenerarReporteDinamicoTipoBien.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBien"));
			//this.jButtonGenerarExcelReporteDinamicoTipoBien.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBien"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoBien!=null) {
				this.jInternalFrameImportacionTipoBien.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBien"));
				this.jInternalFrameImportacionTipoBien.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBien"));
				this.jInternalFrameImportacionTipoBien.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBien"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoBien.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoBien"));
			
			this.jButtonAbrirOrderByToolBarTipoBien.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoBien"));			
			
			if(this.jInternalFrameOrderByTipoBien!=null) {
				this.jInternalFrameOrderByTipoBien.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBien"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBien.jTabbedPaneRelacionesTipoBien.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBien"));
		
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
            		closingInternalFrameTipoBien();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoBien.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoBien = (JInternalFrameBase)event.getSource();
	            	
	            TipoBienBeanSwingJInternalFrame jInternalFrameParent=(TipoBienBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBien.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoBienActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoBien.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoBienListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoBien.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoBien.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBienActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBienActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBienActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoBien";
		inputMap = this.jButtonNuevoTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBienActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBienActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBienActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBienActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoBien";
		inputMap = this.jButtonNuevoRelacionesTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBienActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoBien";
		inputMap = this.jButtonModificarTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoBien";
		inputMap = this.jButtonActualizarTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoBien";
		inputMap = this.jButtonEliminarTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoBien";
		inputMap = this.jButtonCancelarTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoBien";
		inputMap = this.jButtonCerrarTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoBien";
		inputMap = this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoBien.jButtonGuardarCambiosTipoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoBien.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoBienItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoBien.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoBienActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoBien.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoBienActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoBien.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoBienActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonidTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBien.jButtonid_empresaTipoBienUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonid_empresaTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtoncodigoTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBien.jButtonnombreTipoBienBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBienBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoBienActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoBien.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoBien(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
					tipobienAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBien tipobienAux:tipobiens) {
					tipobienAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoBienItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBien(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
						tipobienAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBien tipobienAux:tipobiens) {
						tipobienAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBien tipobienAux:tipobiens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBien(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBien.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBien.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBien,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoBienItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBien(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoBien.getSelectedRows();
			
			TipoBien tipobienLocal=new TipoBien();
			
			//this.seleccionarTodosTipoBien(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobienLocal =(TipoBien) this.tipobienLogic.getTipoBiens().toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipobienLocal =(TipoBien) this.tipobiens.toArray()[this.jTableDatosTipoBien.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipobienLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
						tipobienAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBien tipobienAux:tipobiens) {
						tipobienAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoBien(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBien.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBien.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBien,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoBienItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoBienParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoBienActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoBien(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoBien.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBien tipobienAux:this.tipobienLogic.getTipoBiens()) {
				
						if(sTipoSeleccionar.equals(TipoBienConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobienAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBienConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobienAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBien tipobienAux:tipobiens) {
					
						if(sTipoSeleccionar.equals(TipoBienConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobienAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBienConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobienAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBien(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoBienActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoBien(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoBien=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoBien.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoBien) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoBien(conSplash);
				
					this.generarReporteTipoBiensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoBiensSeleccionados();
				//this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBiensSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBiensSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBien();
				
				this.exportarTipoBiensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoBiens();
				//this.importarTipoBiens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBien();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoBiensSeleccionados();
				//this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoBien();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoBien)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoBien(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoBienBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoBien) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoBien(conSplash);
					
						//this.actualizarParametrosGeneralTipoBien();
						
						this.generarReporteProcesoAccionTipoBiensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoBienBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo BienES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoBien();
				
						this.actualizarParametrosGeneralTipoBien();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipobienReturnGeneral=tipobienLogic.procesarAccionTipoBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipobienLogic.getTipoBiens(),this.tipobienParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoBienReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoBien();
					
					TipoBienBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoBienReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBien.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBien.jComboBoxTiposAccionesFormularioTipoBien.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoBien(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoBienActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoBien();
			
			if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
			TipoBien tipobien=new TipoBien();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoBien(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoBien.getSelectedItem();
			
			
			
			
			tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipobiensSeleccionados.size()==1) {
				for(TipoBien tipobienAux:tipobiensSeleccionados) {
					tipobien=tipobienAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Bien")) {
					jButtonBienActionPerformed(null,rowIndex,true,false,tipobien);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoBien();
			
      		//this.finishProcessTipoBien(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoBienReturnGeneral() throws Exception {
		if(this.tipobienReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipobienReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipobienReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipobienReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipobienReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipobienReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoBien(false);
		}
		
		if(this.tipobienReturnGeneral.getConRetornoLista() || this.tipobienReturnGeneral.getConRetornoObjeto()) {
			if(this.tipobienReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobienLogic.setTipoBiens(this.tipobienReturnGeneral.getTipoBiens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipobienReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobienLogic.setTipoBien(this.tipobienReturnGeneral.getTipoBien());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoBien(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoBien() throws Exception {
		
		
	}
	
	public ArrayList<TipoBien> getTipoBiensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoBien) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoBien tipobienAux:tipobienLogic.getTipoBiens()) {
					if(tipobienAux.getIsSelected()) {
						tipobiensSeleccionados.add(tipobienAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBien tipobienAux:this.tipobiens) {
					if(tipobienAux.getIsSelected()) {
						tipobiensSeleccionados.add(tipobienAux);				
					}
				}
			}
			
			if(tipobiensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipobiensSeleccionados.addAll(this.tipobienLogic.getTipoBiens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipobiensSeleccionados.addAll(this.tipobiens);				
					}
				}
			}
		} else {
			tipobiensSeleccionados.add(this.tipobien);
		}
		
		return tipobiensSeleccionados;
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
	
	public void generarReporteTipoBiensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoBiensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoBiensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBiensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBiensSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoBiensSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Bien",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoBiensSeleccionados() throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoBiens("Todos",tipobiensSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoBiensSeleccionados() throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoBiens("Todos",tipobiensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoBiensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoBiens("Todos",tipobiensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoBiensSeleccionados() throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoBien();
		
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoBien();
		
		
		//this.generarReporteTipoBiens("Todos",tipobiensSeleccionados ,tipobienImplementable,tipobienImplementableHome);
	}
	
	public void mostrarImportacionTipoBiens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoBien();
		
		this.abrirFrameImportacionTipoBien();		
		
			
		//this.generarReporteTipoBiens("Todos",tipobiensSeleccionados ,tipobienImplementable,tipobienImplementableHome);
	}
	
	public void importarTipoBiens() throws Exception {		
	
	}
	
	public void exportarTipoBiensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoBiensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoBiensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoBiensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Bien",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoBiensSeleccionados() throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobien."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoBien(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoBien tipobienAux:tipobiensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoBien(tipobienAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipobienAux.setsDetalleGeneralEntityReporte(tipobienAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoBien(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoBienConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBienConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBienConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBienConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBienConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoBien(TipoBien tipobien,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipobien.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobien.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobien.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobien.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobien.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoBiensSeleccionados() throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobien.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoBiens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoBien(row);				
				iRow++;
			}				
			
			for(TipoBien tipobienAux:tipobiensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoBien(tipobienAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoBiensSeleccionados() throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();		
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobien.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipobiens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipobien");
			//elementRoot.appendChild(element);
		
			for(TipoBien tipobienAux:tipobiensSeleccionados) {
				element = document.createElement("tipobien");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoBien(tipobienAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Bien",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoBien(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBienConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBienConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoBienConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBienConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBienConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoBien(TipoBien tipobien,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipobien.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobien.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobien.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobien.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoBien(TipoBien tipobien,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoBienConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipobien.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoBienConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipobien.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoBienConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipobien.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoBienConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipobien.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoBienConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipobien.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoBiensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoBien> tipobiensSeleccionados=new ArrayList<TipoBien>();
		
		tipobiensSeleccionados=this.getTipoBiensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoBien(tipobiensSeleccionados);
		
		this.generarReporteTipoBiens("Todos",tipobiensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoBien(ArrayList<TipoBien> tipobiensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoBien tipobienAux:tipobiensSeleccionados) {
				tipobienAux.setsDetalleGeneralEntityReporte(tipobienAux.toString());
			
				if(sTipoSeleccionar.equals(TipoBienConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipobienAux.setsDescripcionGeneralEntityReporte1(tipobienAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoBienConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipobienAux.setsDescripcionGeneralEntityReporte1(tipobienAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoBienConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipobienAux.setsDescripcionGeneralEntityReporte1(tipobienAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoBien(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoBien=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoBien=true;
				this.isVisibilidadCeldaGuardarCambiosTipoBien=true;
			}
			
			this.isVisibilidadCeldaModificarTipoBien=false;
			this.isVisibilidadCeldaActualizarTipoBien=false;
			this.isVisibilidadCeldaEliminarTipoBien=false;
			this.isVisibilidadCeldaCancelarTipoBien=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBien=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
			this.isVisibilidadCeldaModificarTipoBien=false;
			this.isVisibilidadCeldaActualizarTipoBien=true;
			this.isVisibilidadCeldaEliminarTipoBien=false;
			this.isVisibilidadCeldaCancelarTipoBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBien=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
			this.isVisibilidadCeldaModificarTipoBien=false;
			this.isVisibilidadCeldaActualizarTipoBien=true;
			this.isVisibilidadCeldaEliminarTipoBien=true;
			this.isVisibilidadCeldaCancelarTipoBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBien=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
			this.isVisibilidadCeldaModificarTipoBien=false;
			this.isVisibilidadCeldaActualizarTipoBien=true;
			this.isVisibilidadCeldaEliminarTipoBien=false;
			this.isVisibilidadCeldaCancelarTipoBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoBien=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=true;
			this.isVisibilidadCeldaModificarTipoBien=false;
			this.isVisibilidadCeldaActualizarTipoBien=false;
			this.isVisibilidadCeldaEliminarTipoBien=false;
			this.isVisibilidadCeldaCancelarTipoBien=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBien=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
			this.isVisibilidadCeldaActualizarTipoBien=false;
			this.isVisibilidadCeldaEliminarTipoBien=false;
			this.isVisibilidadCeldaCancelarTipoBien=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
			this.isVisibilidadCeldaModificarTipoBien=true;
			this.isVisibilidadCeldaActualizarTipoBien=false;
			this.isVisibilidadCeldaEliminarTipoBien=false;
			this.isVisibilidadCeldaCancelarTipoBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBien=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoBienJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoBien=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=true;
		} else {
			this.actualizarEstadoPanelsTipoBien(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoBien=false;
			//this.isVisibilidadCeldaVerFormTipoBien=false;
			this.isVisibilidadCeldaDuplicarTipoBien=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipobienSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoBien=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipobienSessionBean.getEsGuardarRelacionado()) {
			if(!tipobienSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;												
			}
			
			this.jButtonCerrarTipoBien.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBien=false;
		}
		
		if(!this.permiteMantenimiento(this.tipobien)) {
			this.isVisibilidadCeldaActualizarTipoBien=false;
			this.isVisibilidadCeldaEliminarTipoBien=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBien() {
		this.isVisibilidadCeldaNuevoTipoBien=false;
		this.isVisibilidadCeldaGuardarCambiosTipoBien=false;
	}
	
	public void actualizarEstadoPanelsTipoBien(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoBien!=null) {
				this.jScrollPanelDatosEdicionTipoBien.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBien!=null) {
				this.jScrollPanelDatosTipoBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBien!=null) {
				this.jPanelPaginacionTipoBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoBien!=null) {
				this.jScrollPanelDatosEdicionTipoBien.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoBien!=null) {
				this.jScrollPanelDatosTipoBien.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBien!=null) {
				this.jPanelPaginacionTipoBien.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoBien!=null) {
				this.jScrollPanelDatosEdicionTipoBien.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBien!=null) {
				this.jScrollPanelDatosTipoBien.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBien!=null) {
				this.jPanelPaginacionTipoBien.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoBien!=null) {
				this.jScrollPanelDatosEdicionTipoBien.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBien!=null) {
				this.jScrollPanelDatosTipoBien.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBien!=null) {
				this.jPanelPaginacionTipoBien.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoBien!=null) {
				this.jScrollPanelDatosEdicionTipoBien.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBien!=null) {
				this.jScrollPanelDatosTipoBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBien!=null) {
				this.jPanelPaginacionTipoBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoBien!=null) {
				this.jScrollPanelDatosEdicionTipoBien.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBien!=null) {
				this.jScrollPanelDatosTipoBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBien!=null) {
				this.jPanelPaginacionTipoBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoBien!=null) {
				this.jScrollPanelDatosEdicionTipoBien.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBien!=null) {
				this.jScrollPanelDatosTipoBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBien!=null) {
				this.jPanelPaginacionTipoBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipobienSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoBien!=null) {
					this.jTabbedPaneBusquedasTipoBien.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipobienSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBien!=null) {
				this.jTabbedPaneBusquedasTipoBien.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoBien!=null) {
				this.jPanelParametrosReportesTipoBien.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoBienParaBienes() throws Exception {
		Boolean isPaginaPopupBien=false;

		try {

			if(this.tipobienSessionBean==null) {
				this.tipobienSessionBean=new TipoBienSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoBien.bienSessionBean==null) {
				this.jInternalFrameDetalleFormTipoBien.bienSessionBean=new BienSessionBean();
			}

			this.jInternalFrameDetalleFormTipoBien.bienSessionBean.setsPathNavegacionActual(tipobienSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+BienConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoBien.bienSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupBien=this.jInternalFrameDetalleFormTipoBien.bienSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoBien.bienSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoBien.bienSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeBien(false);
			this.jInternalFrameDetalleFormTipoBien.bienSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeBien(TipoBienConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoBien.bienSessionBean.setisBusquedaDesdeForeignKeySesionTipoBien(true);
			this.jInternalFrameDetalleFormTipoBien.bienSessionBean.setlidTipoBienActual(this.idTipoBienActual);

			tipobienSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoBien(true);
			tipobienSessionBean.setlIdTipoBienActualForeignKey(this.idTipoBienActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoBienSessionBean tipobienSessionBean=new TipoBienSessionBean();
		
		if(this.tipobienSessionBean==null) {
			this.tipobienSessionBean=new TipoBienSessionBean();
		}
		
		this.tipobienSessionBean.setsUltimaBusquedaTipoBien(this.getsAccionBusqueda());
		this.tipobienSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipobienSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipobienSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoBienSessionBean tipobienSessionBean=new TipoBienSessionBean();
		
		if(this.tipobienSessionBean==null) {
			this.tipobienSessionBean=new TipoBienSessionBean();
		}
		
		if(this.tipobienSessionBean.getsUltimaBusquedaTipoBien()!=null&&!this.tipobienSessionBean.getsUltimaBusquedaTipoBien().equals("")) {
			this.setsAccionBusqueda(tipobienSessionBean.getsUltimaBusquedaTipoBien());
			this.setiNumeroPaginacion(tipobienSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipobienSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipobienSessionBean.getid_empresa());
				tipobienSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipobienSessionBean.setsUltimaBusquedaTipoBien("");
		this.tipobienSessionBean.setiNumeroPaginacion(TipoBienConstantesFunciones.INUMEROPAGINACION);
		this.tipobienSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoBien(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoBien() {
		this.updateBorderResaltarBusquedasFormularioTipoBien();
		this.updateVisibilidadBusquedasFormularioTipoBien();
		this.updateHabilitarBusquedasFormularioTipoBien();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoBien() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoBien.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoBien() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoBien.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoBien() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoBien.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoBien(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoBien.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoBien() throws Exception {

		if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoBien();
		this.updateVisibilidadResaltarControlesFormularioTipoBien();
		this.updateHabilitarResaltarControlesFormularioTipoBien();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoBien() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipobienConstantesFunciones.resaltaridTipoBien!=null && this.jInternalFrameDetalleFormTipoBien!=null) {this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.setBorder(this.tipobienConstantesFunciones.resaltaridTipoBien);}
		if(this.tipobienConstantesFunciones.resaltarid_empresaTipoBien!=null && this.jInternalFrameDetalleFormTipoBien!=null) {this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setBorder(this.tipobienConstantesFunciones.resaltarid_empresaTipoBien);}
		if(this.tipobienConstantesFunciones.resaltarcodigoTipoBien!=null && this.jInternalFrameDetalleFormTipoBien!=null) {this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.setBorder(this.tipobienConstantesFunciones.resaltarcodigoTipoBien);}
		if(this.tipobienConstantesFunciones.resaltarnombreTipoBien!=null && this.jInternalFrameDetalleFormTipoBien!=null) {this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.setBorder(this.tipobienConstantesFunciones.resaltarnombreTipoBien);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoBien() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
	
		//this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.setVisible(this.tipobienConstantesFunciones.mostraridTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jPanelidTipoBien.setVisible(this.tipobienConstantesFunciones.mostraridTipoBien);
		//this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setVisible(this.tipobienConstantesFunciones.mostrarid_empresaTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jPanelid_empresaTipoBien.setVisible(this.tipobienConstantesFunciones.mostrarid_empresaTipoBien);
		//this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.setVisible(this.tipobienConstantesFunciones.mostrarcodigoTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jPanelcodigoTipoBien.setVisible(this.tipobienConstantesFunciones.mostrarcodigoTipoBien);
		//this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.setVisible(this.tipobienConstantesFunciones.mostrarnombreTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jPanelnombreTipoBien.setVisible(this.tipobienConstantesFunciones.mostrarnombreTipoBien);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoBien() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBien==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBien!=null) {
	
		this.jInternalFrameDetalleFormTipoBien.jLabelidTipoBien.setEnabled(this.tipobienConstantesFunciones.activaridTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jComboBoxid_empresaTipoBien.setEnabled(this.tipobienConstantesFunciones.activarid_empresaTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jTextFieldcodigoTipoBien.setEnabled(this.tipobienConstantesFunciones.activarcodigoTipoBien);
		this.jInternalFrameDetalleFormTipoBien.jTextAreanombreTipoBien.setEnabled(this.tipobienConstantesFunciones.activarnombreTipoBien);
		}
	}
	
		
}