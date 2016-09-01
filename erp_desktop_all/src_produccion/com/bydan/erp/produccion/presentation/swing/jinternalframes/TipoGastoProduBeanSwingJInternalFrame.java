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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.TipoGastoProduConstantesFunciones;
import com.bydan.erp.produccion.util.TipoGastoProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoGastoProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoGastoProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
public class TipoGastoProduBeanSwingJInternalFrame extends TipoGastoProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGastoProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGastoProdu> tipogastoproduValidator = new ClassValidator<TipoGastoProdu>(TipoGastoProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGastoProdu tipogastoprodu;	
	public TipoGastoProdu tipogastoproduAux;
	public TipoGastoProdu tipogastoproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGastoProdu tipogastoproduTotales;
	public Long idTipoGastoProduActual;
	public Long iIdNuevoTipoGastoProdu=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoGastoProdu;
	public Boolean isPermisoNuevoTipoGastoProdu;
	public Boolean isPermisoActualizarTipoGastoProdu;
	public Boolean isPermisoActualizarOriginalTipoGastoProdu;
	public Boolean isPermisoEliminarTipoGastoProdu;
	public Boolean isPermisoGuardarCambiosTipoGastoProdu;
	public Boolean isPermisoConsultaTipoGastoProdu;
	public Boolean isPermisoBusquedaTipoGastoProdu;
	public Boolean isPermisoReporteTipoGastoProdu;
	public Boolean isPermisoPaginacionMedioTipoGastoProdu;
	public Boolean isPermisoPaginacionAltoTipoGastoProdu;
	public Boolean isPermisoPaginacionTodoTipoGastoProdu;
	public Boolean isPermisoCopiarTipoGastoProdu;
	public Boolean isPermisoVerFormTipoGastoProdu;
	public Boolean isPermisoDuplicarTipoGastoProdu;
	public Boolean isPermisoOrdenTipoGastoProdu;
	
	
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
	
	public TipoGastoProduParameterReturnGeneral tipogastoproduReturnGeneral;
	public TipoGastoProduParameterReturnGeneral tipogastoproduParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGastoProdu=false;
	public Boolean esParaAccionDesdeFormularioTipoGastoProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGastoProduLogic tipogastoproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGastoProdu tipogastoproduBean;
	public TipoGastoProduConstantesFunciones tipogastoproduConstantesFunciones;
	//public TipoGastoProduParameterReturnGeneral tipogastoproduReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoGastoProdu> tipogastoprodus;	
	//public List<TipoGastoProdu> tipogastoprodusEliminados;
	//public List<TipoGastoProdu> tipogastoprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGastoProdu=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGastoProdu=true;
	public Boolean isVisibilidadCeldaCopiarTipoGastoProdu=true;
	public Boolean isVisibilidadCeldaVerFormTipoGastoProdu=true;
	public Boolean isVisibilidadCeldaOrdenTipoGastoProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
	public Boolean isVisibilidadCeldaModificarTipoGastoProdu=false;
	public Boolean isVisibilidadCeldaActualizarTipoGastoProdu=false;
	public Boolean isVisibilidadCeldaEliminarTipoGastoProdu=false;
	public Boolean isVisibilidadCeldaCancelarTipoGastoProdu=false;
	public Boolean isVisibilidadCeldaGuardarTipoGastoProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoGastoProdu() {
		return this.iIdNuevoTipoGastoProdu;
	}

	public void setiIdNuevoTipoGastoProdu(Long iIdNuevoTipoGastoProdu) {
		this.iIdNuevoTipoGastoProdu = iIdNuevoTipoGastoProdu;
	}
	
	public Long getidTipoGastoProduActual() {
		return this.idTipoGastoProduActual;
	}

	public void setidTipoGastoProduActual(Long idTipoGastoProduActual) {
		this.idTipoGastoProduActual = idTipoGastoProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGastoProdu gettipogastoprodu() {
		return this.tipogastoprodu;
	}

	public void settipogastoprodu(TipoGastoProdu tipogastoprodu) {
		this.tipogastoprodu = tipogastoprodu;
	}
	
	public TipoGastoProdu gettipogastoproduAux() {
		return this.tipogastoproduAux;
	}

	public void settipogastoproduAux(TipoGastoProdu tipogastoproduAux) {
		this.tipogastoproduAux = tipogastoproduAux;
	}				
	
	public TipoGastoProdu gettipogastoproduAnterior() {
		return this.tipogastoproduAnterior;
	}

	public void settipogastoproduAnterior(TipoGastoProdu tipogastoproduAnterior) {
		this.tipogastoproduAnterior = tipogastoproduAnterior;
	}	
	
	public TipoGastoProdu gettipogastoproduTotales() {
		return this.tipogastoproduTotales;
	}

	public void settipogastoproduTotales(TipoGastoProdu tipogastoproduTotales) {
		this.tipogastoproduTotales = tipogastoproduTotales;
	}	
	
	public TipoGastoProdu gettipogastoproduBean() {
		return this.tipogastoproduBean;
	}

	public void settipogastoproduBean(TipoGastoProdu tipogastoproduBean) {
		this.tipogastoproduBean = tipogastoproduBean;
	}	
	
	public TipoGastoProduParameterReturnGeneral gettipogastoproduReturnGeneral() {
		return this.tipogastoproduReturnGeneral;
	}

	public void settipogastoproduReturnGeneral(TipoGastoProduParameterReturnGeneral tipogastoproduReturnGeneral) {
		this.tipogastoproduReturnGeneral = tipogastoproduReturnGeneral;
	}	
	
	
	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoGastoProduLogic getTipoGastoProduLogic()	{		
		return tipogastoproduLogic;
	}

	public void setTipoGastoProduLogic(TipoGastoProduLogic tipogastoproduLogic) {
		this.tipogastoproduLogic = tipogastoproduLogic;
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
	
	public Boolean getIsEsNuevoTipoGastoProdu() {
		return isEsNuevoTipoGastoProdu;
	}

	public void setIsEsNuevoTipoGastoProdu(Boolean isEsNuevoTipoGastoProdu) {
		this.isEsNuevoTipoGastoProdu = isEsNuevoTipoGastoProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGastoProdu() {
		return esParaAccionDesdeFormularioTipoGastoProdu;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGastoProdu(Boolean esParaAccionDesdeFormularioTipoGastoProdu) {
		this.esParaAccionDesdeFormularioTipoGastoProdu = esParaAccionDesdeFormularioTipoGastoProdu;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipogastoproduSessionBean==null) {
				this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
			}

			if(!this.tipogastoproduSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipogastoproduSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipogastoprodu!=null) {
						this.tipogastoprodu.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
						this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoGastoProdu.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
						if(this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoGastoProdu!=null) {
						jComboBoxid_paisFK_IdPaisTipoGastoProdu.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoGastoProdu!=null) {
							//jComboBoxid_paisFK_IdPaisTipoGastoProdu.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoGastoProdu.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoGastoProdu.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoGastoProduGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoGastoProduGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoGastoProduGenerico!=null && jComboBoxid_paisTipoGastoProduGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoGastoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoGastoProdu tipogastoprodu,JComboBox jComboBoxid_paisTipoGastoProduGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoGastoProduGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoGastoProduGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipogastoprodu.setid_pais(paisAux.getId());
				tipogastoprodu.setpais_descripcion(TipoGastoProduConstantesFunciones.getPaisDescripcion(paisAux));
				tipogastoprodu.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { 
							this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { 
					}

					if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGastoProdu.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoGastoProdu.addItem(pais);
							}
						}

						if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
							this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
							this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoGastoProdu.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGastoProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoGastoProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGastoProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoGastoProdu(this.tipogastoproduLogic.getTipoGastoProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGastoProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoGastoProdu(this.tipogastoprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogastoproduLogic.setTipoGastoProdus(this.tipogastoprodus);
			tipogastoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGastoProduParameterReturnGeneral getTipoGastoProduParameterGeneral() {
		return this.tipogastoproduParameterGeneral;
	}
	
	public void setTipoGastoProduParameterGeneral(TipoGastoProduParameterReturnGeneral tipogastoproduParameterGeneral) {
		this.tipogastoproduParameterGeneral = tipogastoproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGastoProdu() {
		return isPermisoTodoTipoGastoProdu;
	}

	public void setIsPermisoTodoTipoGastoProdu(Boolean isPermisoTodoTipoGastoProdu) {
		this.isPermisoTodoTipoGastoProdu = isPermisoTodoTipoGastoProdu;
	}

	public Boolean getIsPermisoNuevoTipoGastoProdu() {
		return isPermisoNuevoTipoGastoProdu;
	}

	public void setIsPermisoNuevoTipoGastoProdu(Boolean isPermisoNuevoTipoGastoProdu) {
		this.isPermisoNuevoTipoGastoProdu = isPermisoNuevoTipoGastoProdu;
	}

	public Boolean getIsPermisoActualizarTipoGastoProdu() {
		return isPermisoActualizarTipoGastoProdu;
	}

	public void setIsPermisoActualizarTipoGastoProdu(Boolean isPermisoActualizarTipoGastoProdu) {
		this.isPermisoActualizarTipoGastoProdu = isPermisoActualizarTipoGastoProdu;
	}

	public Boolean getIsPermisoEliminarTipoGastoProdu() {
		return isPermisoEliminarTipoGastoProdu;
	}

	public void setIsPermisoEliminarTipoGastoProdu(Boolean isPermisoEliminarTipoGastoProdu) {
		this.isPermisoEliminarTipoGastoProdu = isPermisoEliminarTipoGastoProdu;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGastoProdu() {
		return isPermisoGuardarCambiosTipoGastoProdu;
	}

	public void setIsPermisoGuardarCambiosTipoGastoProdu(Boolean isPermisoGuardarCambiosTipoGastoProdu) {
		this.isPermisoGuardarCambiosTipoGastoProdu = isPermisoGuardarCambiosTipoGastoProdu;
	}
	
	public Boolean getIsPermisoConsultaTipoGastoProdu() {
		return isPermisoConsultaTipoGastoProdu;
	}

	public void setIsPermisoConsultaTipoGastoProdu(Boolean isPermisoConsultaTipoGastoProdu) {
		this.isPermisoConsultaTipoGastoProdu = isPermisoConsultaTipoGastoProdu;
	}

	public Boolean getIsPermisoBusquedaTipoGastoProdu() {
		return isPermisoBusquedaTipoGastoProdu;
	}

	public void setIsPermisoBusquedaTipoGastoProdu(Boolean isPermisoBusquedaTipoGastoProdu) {
		this.isPermisoBusquedaTipoGastoProdu = isPermisoBusquedaTipoGastoProdu;
	}

	public Boolean getIsPermisoReporteTipoGastoProdu() {
		return isPermisoReporteTipoGastoProdu;
	}

	public void setIsPermisoReporteTipoGastoProdu(Boolean isPermisoReporteTipoGastoProdu) {
		this.isPermisoReporteTipoGastoProdu = isPermisoReporteTipoGastoProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGastoProdu() {
		return isPermisoPaginacionMedioTipoGastoProdu;
	}

	public void setIsPermisoPaginacionMedioTipoGastoProdu(Boolean isPermisoPaginacionMedioTipoGastoProdu) {
		this.isPermisoPaginacionMedioTipoGastoProdu = isPermisoPaginacionMedioTipoGastoProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGastoProdu() {
		return isPermisoPaginacionTodoTipoGastoProdu;
	}

	public void setIsPermisoPaginacionTodoTipoGastoProdu(Boolean isPermisoPaginacionTodoTipoGastoProdu) {
		this.isPermisoPaginacionTodoTipoGastoProdu = isPermisoPaginacionTodoTipoGastoProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGastoProdu() {
		return isPermisoPaginacionAltoTipoGastoProdu;
	}

	public void setIsPermisoPaginacionAltoTipoGastoProdu(Boolean isPermisoPaginacionAltoTipoGastoProdu) {
		this.isPermisoPaginacionAltoTipoGastoProdu = isPermisoPaginacionAltoTipoGastoProdu;
	}
	
	public Boolean getIsPermisoCopiarTipoGastoProdu() {
		return isPermisoCopiarTipoGastoProdu;
	}

	public void setIsPermisoCopiarTipoGastoProdu(Boolean isPermisoCopiarTipoGastoProdu) {
		this.isPermisoCopiarTipoGastoProdu = isPermisoCopiarTipoGastoProdu;
	}
	
	public Boolean getIsPermisoVerFormTipoGastoProdu() {
		return isPermisoVerFormTipoGastoProdu;
	}

	public void setIsPermisoVerFormTipoGastoProdu(Boolean isPermisoVerFormTipoGastoProdu) {
		this.isPermisoVerFormTipoGastoProdu = isPermisoVerFormTipoGastoProdu;
	}
	
	public Boolean getIsPermisoDuplicarTipoGastoProdu() {
		return isPermisoDuplicarTipoGastoProdu;
	}

	public void setIsPermisoDuplicarTipoGastoProdu(Boolean isPermisoDuplicarTipoGastoProdu) {
		this.isPermisoDuplicarTipoGastoProdu = isPermisoDuplicarTipoGastoProdu;
	}
	
	public Boolean getIsPermisoOrdenTipoGastoProdu() {
		return isPermisoOrdenTipoGastoProdu;
	}

	public void setIsPermisoOrdenTipoGastoProdu(Boolean isPermisoOrdenTipoGastoProdu) {
		this.isPermisoOrdenTipoGastoProdu = isPermisoOrdenTipoGastoProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGastoProdu() {
		return isVisibilidadCeldaNuevoTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaNuevoTipoGastoProdu(Boolean isVisibilidadCeldaNuevoTipoGastoProdu) {
		this.isVisibilidadCeldaNuevoTipoGastoProdu = isVisibilidadCeldaNuevoTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGastoProdu() {
		return isVisibilidadCeldaDuplicarTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGastoProdu(Boolean isVisibilidadCeldaDuplicarTipoGastoProdu) {
		this.isVisibilidadCeldaDuplicarTipoGastoProdu = isVisibilidadCeldaDuplicarTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGastoProdu() {
		return isVisibilidadCeldaCopiarTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaCopiarTipoGastoProdu(Boolean isVisibilidadCeldaCopiarTipoGastoProdu) {
		this.isVisibilidadCeldaCopiarTipoGastoProdu = isVisibilidadCeldaCopiarTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGastoProdu() {
		return isVisibilidadCeldaVerFormTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaVerFormTipoGastoProdu(Boolean isVisibilidadCeldaVerFormTipoGastoProdu) {
		this.isVisibilidadCeldaVerFormTipoGastoProdu = isVisibilidadCeldaVerFormTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGastoProdu() {
		return isVisibilidadCeldaOrdenTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaOrdenTipoGastoProdu(Boolean isVisibilidadCeldaOrdenTipoGastoProdu) {
		this.isVisibilidadCeldaOrdenTipoGastoProdu = isVisibilidadCeldaOrdenTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGastoProdu() {
		return isVisibilidadCeldaNuevoRelacionesTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGastoProdu(Boolean isVisibilidadCeldaNuevoRelacionesTipoGastoProdu) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu = isVisibilidadCeldaNuevoRelacionesTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGastoProdu() {
		return isVisibilidadCeldaModificarTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaModificarTipoGastoProdu(Boolean isVisibilidadCeldaModificarTipoGastoProdu) {
		this.isVisibilidadCeldaModificarTipoGastoProdu = isVisibilidadCeldaModificarTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGastoProdu() {
		return isVisibilidadCeldaActualizarTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaActualizarTipoGastoProdu(Boolean isVisibilidadCeldaActualizarTipoGastoProdu) {
		this.isVisibilidadCeldaActualizarTipoGastoProdu = isVisibilidadCeldaActualizarTipoGastoProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGastoProdu() {
		return isVisibilidadCeldaEliminarTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaEliminarTipoGastoProdu(Boolean isVisibilidadCeldaEliminarTipoGastoProdu) {
		this.isVisibilidadCeldaEliminarTipoGastoProdu = isVisibilidadCeldaEliminarTipoGastoProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGastoProdu() {
		return isVisibilidadCeldaCancelarTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaCancelarTipoGastoProdu(Boolean isVisibilidadCeldaCancelarTipoGastoProdu) {
		this.isVisibilidadCeldaCancelarTipoGastoProdu = isVisibilidadCeldaCancelarTipoGastoProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGastoProdu() {
		return isVisibilidadCeldaGuardarTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaGuardarTipoGastoProdu(Boolean isVisibilidadCeldaGuardarTipoGastoProdu) {
		this.isVisibilidadCeldaGuardarTipoGastoProdu = isVisibilidadCeldaGuardarTipoGastoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGastoProdu() {
		return isVisibilidadCeldaGuardarCambiosTipoGastoProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGastoProdu(Boolean isVisibilidadCeldaGuardarCambiosTipoGastoProdu) {
		this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu = isVisibilidadCeldaGuardarCambiosTipoGastoProdu;
	}
		
	public TipoGastoProduSessionBean gettipogastoproduSessionBean() {
		return this.tipogastoproduSessionBean;
	}
	
	public void settipogastoproduSessionBean(TipoGastoProduSessionBean tipogastoproduSessionBean) {
		this.tipogastoproduSessionBean=tipogastoproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(TipoGastoProdu tipogastoprodu)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipogastoprodu,null);
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
	
	public void bugActualizarReferenciaActual(TipoGastoProdu tipogastoprodu,TipoGastoProdu tipogastoproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGastoProdu(tipogastoprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogastoproduAux.setId(tipogastoprodu.getId());
		tipogastoproduAux.setVersionRow(tipogastoprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGastoProdu();
		
			int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogastoproduValidator.getInvalidValues(this.tipogastoprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogastoproduLogic.setDatosCliente(datosCliente);
			tipogastoproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogastoproduAux=new  TipoGastoProdu();
				
				tipogastoproduAux.setIsNew(true);
				tipogastoproduAux.setIsChanged(true);
				
				tipogastoproduAux.setTipoGastoProduOriginal(this.tipogastoprodu);
				
				tipogastoproduAux.setId(this.tipogastoprodu.getId());	
				tipogastoproduAux.setVersionRow(this.tipogastoprodu.getVersionRow());	
				tipogastoproduAux.setid_pais(this.tipogastoprodu.getid_pais());	
				tipogastoproduAux.setnombre(this.tipogastoprodu.getnombre());	
				tipogastoproduAux.setdescripcion(this.tipogastoprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogastoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogastoproduAux,tipogastoproduLogic.getTipoGastoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduAux,tipogastoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduLogic.saveTipoGastoProdus();//WithConnection
						//tipogastoproduLogic.getSetVersionRowTipoGastoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogastoprodu,tipogastoproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoGastoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogastoproduAux=new  TipoGastoProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogastoproduSessionBean.getEsGuardarRelacionado() && this.tipogastoprodu.getId()>=0)) {
						
					tipogastoproduAux.setIsNew(false);
				}
				
				tipogastoproduAux.setIsDeleted(false);
			
				tipogastoproduAux.setId(this.tipogastoprodu.getId());	
				tipogastoproduAux.setVersionRow(this.tipogastoprodu.getVersionRow());	
				tipogastoproduAux.setid_pais(this.tipogastoprodu.getid_pais());	
				tipogastoproduAux.setnombre(this.tipogastoprodu.getnombre());	
				tipogastoproduAux.setdescripcion(this.tipogastoprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogastoproduAux,tipogastoproduLogic.getTipoGastoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduAux,tipogastoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduLogic.saveTipoGastoProdus();//WithConnection
						//tipogastoproduLogic.getSetVersionRowTipoGastoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogastoprodu,tipogastoproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoGastoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogastoproduAux=new  TipoGastoProdu();
				
				tipogastoproduAux.setIsNew(false);
				tipogastoproduAux.setIsChanged(false);
				
				tipogastoproduAux.setIsDeleted(true);
				
				tipogastoproduAux.setId(this.tipogastoprodu.getId());	
				tipogastoproduAux.setVersionRow(this.tipogastoprodu.getVersionRow());	
				tipogastoproduAux.setid_pais(this.tipogastoprodu.getid_pais());	
				tipogastoproduAux.setnombre(this.tipogastoprodu.getnombre());	
				tipogastoproduAux.setdescripcion(this.tipogastoprodu.getdescripcion());	
				
				if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogastoproduAux.getId()>=0) {	
						this.tipogastoprodusEliminados.add(tipogastoproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogastoproduAux,tipogastoproduLogic.getTipoGastoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduAux,tipogastoprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduLogic.saveTipoGastoProdus();//WithConnection
						//tipogastoproduLogic.getSetVersionRowTipoGastoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogastoproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogastoproduAux,tipogastoproduLogic.getTipoGastoProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogastoproduAux,tipogastoprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.getTipoGastoProdus().addAll(this.tipogastoprodusEliminados);
					
					tipogastoproduLogic.saveTipoGastoProdus();//WithConnection
					//tipogastoproduLogic.getSetVersionRowTipoGastoProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoGastoProdu();
				
				this.tipogastoprodusEliminados= new ArrayList<TipoGastoProdu>();		
			}
			
			if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Gasto Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogastoprodu=tipogastoproduAux;
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
      		//this.finishProcessTipoGastoProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGastoProdu tipogastoproduLocal) throws Exception {
		
		if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGastoProdu tipogastoproduLocal) throws Exception {	
		if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipogastoproduLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoGastoProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogastoproduValidator.getInvalidValues(this.tipogastoprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGastoProdu tipogastoprodu,List<TipoGastoProdu> tipogastoprodus) throws Exception {
		try	{		
			TipoGastoProduConstantesFunciones.actualizarLista(tipogastoprodu,tipogastoprodus,this.tipogastoproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGastoProdu tipogastoprodu,List<TipoGastoProdu> tipogastoprodus) throws Exception {
		try	{			
			TipoGastoProduConstantesFunciones.actualizarSelectedLista(tipogastoprodu,tipogastoprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGastoProdu> tipogastoprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogastoprodusLocal=this.tipogastoproduLogic.getTipoGastoProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogastoprodusLocal=this.tipogastoprodus;
			}
			//ARCHITECTURE
		
			for(TipoGastoProdu tipogastoproduLocal:tipogastoprodusLocal) {
				if(this.permiteMantenimiento(tipogastoproduLocal) && tipogastoproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGastoProduConstantesFunciones.getTipoGastoProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGastoProduConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProdu.jLabelid_paisTipoGastoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGastoProduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProdu.jLabelnombreTipoGastoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGastoProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProdu.jLabeldescripcionTipoGastoProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGastoProdu.jLabelid_paisTipoGastoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGastoProdu.jLabelnombreTipoGastoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGastoProdu.jLabeldescripcionTipoGastoProdu,"");
		
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
		this.iIdNuevoTipoGastoProdu--;	
		
		
		this.tipogastoproduAux=new TipoGastoProdu();
		
		this.tipogastoproduAux.setId(this.iIdNuevoTipoGastoProdu);
		this.tipogastoproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogastoproduLogic.getTipoGastoProdus().add(this.tipogastoproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogastoprodus.add(this.tipogastoproduAux);
		}
		//ARCHITECTURE
		
		this.tipogastoprodu=this.tipogastoproduAux;
		
		if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGastoProdu(this.tipogastoprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProdu(this.tipogastoprodu);
		}
				
		//this.setDefaultControlesTipoGastoProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGastoProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGastoProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGastoProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGastoProdu(this.tipogastoproduBean,this.tipogastoprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGastoProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
			classes=TipoGastoProduConstantesFunciones.getClassesRelationshipsOfTipoGastoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogastoproduReturnGeneral=tipogastoproduLogic.procesarEventosTipoGastoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogastoproduLogic.getTipoGastoProdus(),this.tipogastoprodu,this.tipogastoproduParameterGeneral,this.isEsNuevoTipoGastoProdu,classes);//this.tipogastoproduLogic.getTipoGastoProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGastoProdu(this.tipogastoproduReturnGeneral,this.tipogastoproduBean,false);
		
		if(this.tipogastoproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProdu(this.tipogastoproduReturnGeneral.getTipoGastoProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGastoProdu(this.tipogastoproduReturnGeneral.getTipoGastoProdu());
		}
		
		if(this.tipogastoproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGastoProdu(this.tipogastoproduReturnGeneral.getTipoGastoProdu(),classes);//this.tipogastoproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGastoProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGastoProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGastoProdu(false);
						
			if(tipogastoproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGastoProdu();
			}
			
			this.actualizarVisualTableDatosTipoGastoProdu();
			
			this.jTableDatosTipoGastoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProdu(), this.getIndiceNuevoTipoGastoProdu());
			
			this.seleccionarFilaTablaTipoGastoProduActual();
						
			this.actualizarEstadoCeldasBotonesTipoGastoProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGastoProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.setEnabled(isHabilitar && this.tipogastoproduConstantesFunciones.activarnombreTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.setEnabled(isHabilitar && this.tipogastoproduConstantesFunciones.activardescripcionTipoGastoProdu);	
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setEnabled(isHabilitar && this.tipogastoproduConstantesFunciones.activarid_paisTipoGastoProdu);
	};
	
	public void setDefaultControlesTipoGastoProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGastoProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogastoproduSessionBean.setConGuardarRelaciones(true);			
			this.tipogastoproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.setVisible(true);
			
					
		} else {
			//this.tipogastoproduSessionBean.setConGuardarRelaciones(false);			
			this.tipogastoproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoGastoProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
				if(tipogastoproduAux.getId().equals(this.iIdNuevoTipoGastoProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProdu tipogastoproduAux:this.tipogastoprodus) {
				if(tipogastoproduAux.getId().equals(this.iIdNuevoTipoGastoProdu)) {
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
	
	public int getIndiceActualTipoGastoProdu(TipoGastoProdu tipogastoprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
				if(tipogastoproduAux.getId().equals(tipogastoprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProdu tipogastoproduAux:this.tipogastoprodus) {
				if(tipogastoproduAux.getId().equals(tipogastoprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGastoProdu(TipoGastoProdu tipogastoproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
				if(tipogastoproduAux.getTipoGastoProduOriginal().getId().equals(tipogastoproduOriginal.getId())) {
					existe=true;
					tipogastoproduOriginal.setId(tipogastoproduAux.getId());
					tipogastoproduOriginal.setVersionRow(tipogastoproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProdu tipogastoproduAux:this.tipogastoprodus) {
				if(tipogastoproduAux.getTipoGastoProduOriginal().getId().equals(tipogastoproduOriginal.getId())) {
					existe=true;
					tipogastoproduOriginal.setId(tipogastoproduAux.getId());
					tipogastoproduOriginal.setVersionRow(tipogastoproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGastoProdu(Boolean esParaCancelar) throws Exception {
		tipogastoprodusAux=new ArrayList<TipoGastoProdu>();
		tipogastoproduAux=new TipoGastoProdu();
		
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
					if(tipogastoproduAux.getId()<0) {
						tipogastoprodusAux.add(tipogastoproduAux);
					}		
				}
				this.iIdNuevoTipoGastoProdu=0L;
				this.tipogastoproduLogic.getTipoGastoProdus().removeAll(tipogastoprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProdu tipogastoproduAux:this.tipogastoprodus) {
					if(tipogastoproduAux.getId()<0) {
						tipogastoprodusAux.add(tipogastoproduAux);
					}		
				}
				this.iIdNuevoTipoGastoProdu=0L;
				this.tipogastoprodus.removeAll(tipogastoprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGastoProdu 
					&& this.tipogastoproduLogic.getTipoGastoProdus().size()>0
					) {
					tipogastoproduAux=this.tipogastoproduLogic.getTipoGastoProdus().get(this.tipogastoproduLogic.getTipoGastoProdus().size() - 1);
				
					if(tipogastoproduAux.getId()<0) {
						this.tipogastoproduLogic.getTipoGastoProdus().remove(tipogastoproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGastoProdu && this.tipogastoprodus.size()>0) {
					tipogastoproduAux=this.tipogastoprodus.get(this.tipogastoprodus.size() - 1);
				
					if(tipogastoproduAux.getId()<0) {
						this.tipogastoprodus.remove(tipogastoproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGastoProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogastoprodu.getId()<0) {
				this.tipogastoproduLogic.getTipoGastoProdus().remove(this.tipogastoprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogastoprodu.getId()<0) {
				this.tipogastoprodus.remove(this.tipogastoprodu);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGastoProdu(List<TipoGastoProdu> tipogastoprodusAux) throws Exception {
		TipoGastoProduConstantesFunciones.setEstadosInicialesTipoGastoProdu(tipogastoprodusAux);
	}
	
	public void setEstadosInicialesTipoGastoProdu(TipoGastoProdu tipogastoproduAux) throws Exception {
		TipoGastoProduConstantesFunciones.setEstadosInicialesTipoGastoProdu(tipogastoproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGastoProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGastoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGastoProduActual()) {
				if(!this.isEsNuevoTipoGastoProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGastoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGastoProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGastoProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Gasto Produccion ?", "MANTENIMIENTO DE Tipo Gasto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGastoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGastoProdu tipogastoprodu) throws Exception {
		TipoGastoProduConstantesFunciones.seleccionarAsignar(this.tipogastoprodu,tipogastoprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGastoProdu=this.isPermisoActualizarOriginalTipoGastoProdu;
			
			
			this.seleccionarAsignar(tipogastoprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGastoProduConstantesFunciones.quitarEspaciosTipoGastoProdu(this.tipogastoprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGastoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogastoproduSessionBean.setsFuncionBusquedaRapida(this.tipogastoproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGastoProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGastoProdu(esParaCancelar);				
				this.cancelarNuevoTipoGastoProdu(esParaCancelar);								
			}
			
			this.tipogastoprodu=new TipoGastoProdu();
			
			this.inicializarTipoGastoProdu();
			
			this.actualizarEstadoCeldasBotonesTipoGastoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGastoProdu() throws Exception {
		try {
			TipoGastoProduConstantesFunciones.inicializarTipoGastoProdu(this.tipogastoprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogastoproduLogic.getTipoGastoProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGastoProdus(String sAccionBusqueda,List<TipoGastoProdu> tipogastoprodusParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGastoProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGastoProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGastoProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGastoProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Gasto Produccions");		
		parameters.put("busquedapor", TipoGastoProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGastoProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGastoProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGastoProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGastoProdu=new JRBeanArrayDataSource(TipoGastoProduJInternalFrame.TraerTipoGastoProduBeans(tipogastoprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGastoProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGastoProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGastoProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGastoProduBean.TraerTipoGastoProduBeans(tipogastoprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGastoProdus(sAccionBusqueda,sTipoArchivoReporte,tipogastoprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGastoProdus(sAccionBusqueda,sTipoArchivoReporte,tipogastoprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGastoProduActionPerformed(null);
					//this.generarExcelReporteTipoGastoProdus(sAccionBusqueda,sTipoArchivoReporte,tipogastoprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGastoProdus(sAccionBusqueda,sTipoArchivoReporte,tipogastoprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGastoProdus(sAccionBusqueda,sTipoArchivoReporte,tipogastoprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGastoProdus(sAccionBusqueda,sTipoArchivoReporte,tipogastoprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGastoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGastoProdu> tipogastoprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastoProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGastoProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGastoProdu tipogastoprodu : tipogastoprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGastoProduConstantesFunciones.generarExcelReporteDataTipoGastoProdu("NORMAL",row,workbook,tipogastoprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGastoProdu(String sTipo,Row row,Workbook workbook) {
		
		TipoGastoProduConstantesFunciones.generarExcelReporteHeaderTipoGastoProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGastoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGastoProdu> tipogastoprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGastoProdu tipogastoprodu : tipogastoprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGastoProduConstantesFunciones.getTipoGastoProduDescripcion(tipogastoprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoProduConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogastoprodu.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoProduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogastoprodu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogastoprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGastoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGastoProdu> tipogastoprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGastoProdu> tipogastoprodusRespaldo=null;
		
		classes=TipoGastoProduConstantesFunciones.getClassesRelationshipsOfTipoGastoProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogastoproduLogic.setDatosCliente(this.datosCliente);
		this.tipogastoproduLogic.setDatosDeep(this.datosDeep);
		this.tipogastoproduLogic.setIsConDeep(true);
		
		tipogastoprodusRespaldo=this.tipogastoproduLogic.getTipoGastoProdus();
		
		this.tipogastoproduLogic.setTipoGastoProdus(tipogastoprodusParaReportes);	
		this.tipogastoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogastoprodusParaReportes=this.tipogastoproduLogic.getTipoGastoProdus();
		this.tipogastoproduLogic.setTipoGastoProdus(tipogastoprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGastoProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGastoProdu tipogastoprodu : tipogastoprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGastoProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGastoProduConstantesFunciones.generarExcelReporteDataTipoGastoProdu("NORMAL",row,workbook,tipogastoprodu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoGastoProduConstantesFunciones.getTipoGastoProduDescripcion(tipogastoprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGastoProdu() throws Exception {		
		this.startProcessTipoGastoProdu(true);
	}
	
	public void startProcessTipoGastoProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGastoProdu ,this.jPanelParametrosReportesTipoGastoProdu, this.jScrollPanelDatosTipoGastoProdu,this.jPanelPaginacionTipoGastoProdu, this.jScrollPanelDatosEdicionTipoGastoProdu, this.jPanelAccionesTipoGastoProdu,this.jPanelAccionesFormularioTipoGastoProdu,this.jmenuBarTipoGastoProdu,this.jmenuBarDetalleTipoGastoProdu,this.jTtoolBarTipoGastoProdu,this.jTtoolBarDetalleTipoGastoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGastoProdu=this.jTabbedPaneBusquedasTipoGastoProdu; 
		
		final JPanel jPanelParametrosReportesTipoGastoProdu=this.jPanelParametrosReportesTipoGastoProdu;
		//final JScrollPane jScrollPanelDatosTipoGastoProdu=this.jScrollPanelDatosTipoGastoProdu;
		final JTable jTableDatosTipoGastoProdu=this.jTableDatosTipoGastoProdu;		
		final JPanel jPanelPaginacionTipoGastoProdu=this.jPanelPaginacionTipoGastoProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoGastoProdu=this.jScrollPanelDatosEdicionTipoGastoProdu;
		final JPanel jPanelAccionesTipoGastoProdu=this.jPanelAccionesTipoGastoProdu;
		
		JPanel jPanelCamposAuxiliarTipoGastoProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGastoProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			jPanelCamposAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jPanelCamposTipoGastoProdu;
			jPanelAccionesFormularioAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jPanelAccionesFormularioTipoGastoProdu;
		}
		
		final JPanel jPanelCamposTipoGastoProdu=jPanelCamposAuxiliarTipoGastoProdu;
		final JPanel jPanelAccionesFormularioTipoGastoProdu=jPanelAccionesFormularioAuxiliarTipoGastoProdu;
		
		
		final JMenuBar jmenuBarTipoGastoProdu=this.jmenuBarTipoGastoProdu;
		final JToolBar jTtoolBarTipoGastoProdu=this.jTtoolBarTipoGastoProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGastoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGastoProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			jmenuBarDetalleAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jmenuBarDetalleTipoGastoProdu;
			jTtoolBarDetalleAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jTtoolBarDetalleTipoGastoProdu;
		}
		
		final JMenuBar jmenuBarDetalleTipoGastoProdu=jmenuBarDetalleAuxiliarTipoGastoProdu;
		final JToolBar jTtoolBarDetalleTipoGastoProdu=jTtoolBarDetalleAuxiliarTipoGastoProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGastoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGastoProdu;
			processRunnable.jTableDatos=jTableDatosTipoGastoProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoGastoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGastoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGastoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGastoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGastoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGastoProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoGastoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGastoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGastoProdu ,jPanelParametrosReportesTipoGastoProdu,jTableDatosTipoGastoProdu, /*jScrollPanelDatosTipoGastoProdu,*/jPanelCamposTipoGastoProdu,jPanelPaginacionTipoGastoProdu, /*jScrollPanelDatosEdicionTipoGastoProdu,*/ jPanelAccionesTipoGastoProdu,jPanelAccionesFormularioTipoGastoProdu,jmenuBarTipoGastoProdu,jmenuBarDetalleTipoGastoProdu,jTtoolBarTipoGastoProdu,jTtoolBarDetalleTipoGastoProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGastoProdu ,jPanelParametrosReportesTipoGastoProdu, jScrollPanelDatosTipoGastoProdu,jPanelPaginacionTipoGastoProdu, jScrollPanelDatosEdicionTipoGastoProdu, jPanelAccionesTipoGastoProdu,jPanelAccionesFormularioTipoGastoProdu,jmenuBarTipoGastoProdu,jmenuBarDetalleTipoGastoProdu,jTtoolBarTipoGastoProdu,jTtoolBarDetalleTipoGastoProdu);
						
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
	
	public void finishProcessTipoGastoProdu() {// throws Exception 
		this.finishProcessTipoGastoProdu(true);
	}
	
	public void finishProcessTipoGastoProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGastoProdu ,this.jPanelParametrosReportesTipoGastoProdu, this.jScrollPanelDatosTipoGastoProdu,this.jPanelPaginacionTipoGastoProdu, this.jScrollPanelDatosEdicionTipoGastoProdu, this.jPanelAccionesTipoGastoProdu,this.jPanelAccionesFormularioTipoGastoProdu,this.jmenuBarTipoGastoProdu,this.jmenuBarDetalleTipoGastoProdu,this.jTtoolBarTipoGastoProdu,this.jTtoolBarDetalleTipoGastoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGastoProdu=this.jTabbedPaneBusquedasTipoGastoProdu; 
		
		final JPanel jPanelParametrosReportesTipoGastoProdu=this.jPanelParametrosReportesTipoGastoProdu;
		//final JScrollPane jScrollPanelDatosTipoGastoProdu=this.jScrollPanelDatosTipoGastoProdu;
		final JTable jTableDatosTipoGastoProdu=this.jTableDatosTipoGastoProdu;		
		final JPanel jPanelPaginacionTipoGastoProdu=this.jPanelPaginacionTipoGastoProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoGastoProdu=this.jScrollPanelDatosEdicionTipoGastoProdu;
		final JPanel jPanelAccionesTipoGastoProdu=this.jPanelAccionesTipoGastoProdu;
		
		JPanel jPanelCamposAuxiliarTipoGastoProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGastoProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			jPanelCamposAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jPanelCamposTipoGastoProdu;
			jPanelAccionesFormularioAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jPanelAccionesFormularioTipoGastoProdu;
		}
		
		final JPanel jPanelCamposTipoGastoProdu=jPanelCamposAuxiliarTipoGastoProdu;
		final JPanel jPanelAccionesFormularioTipoGastoProdu=jPanelAccionesFormularioAuxiliarTipoGastoProdu;
		
		
		final JMenuBar jmenuBarTipoGastoProdu=this.jmenuBarTipoGastoProdu;		
		final JToolBar jTtoolBarTipoGastoProdu=this.jTtoolBarTipoGastoProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGastoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGastoProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			jmenuBarDetalleAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jmenuBarDetalleTipoGastoProdu;
			jTtoolBarDetalleAuxiliarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jTtoolBarDetalleTipoGastoProdu;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGastoProdu=jmenuBarDetalleAuxiliarTipoGastoProdu;
		final JToolBar jTtoolBarDetalleTipoGastoProdu=jTtoolBarDetalleAuxiliarTipoGastoProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGastoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGastoProdu;
			processRunnable.jTableDatos=jTableDatosTipoGastoProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoGastoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGastoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGastoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGastoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGastoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGastoProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoGastoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGastoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGastoProdu ,jPanelParametrosReportesTipoGastoProdu, jTableDatosTipoGastoProdu,/*jScrollPanelDatosTipoGastoProdu,*/jPanelCamposTipoGastoProdu,jPanelPaginacionTipoGastoProdu, /*jScrollPanelDatosEdicionTipoGastoProdu,*/ jPanelAccionesTipoGastoProdu,jPanelAccionesFormularioTipoGastoProdu,jmenuBarTipoGastoProdu,jmenuBarDetalleTipoGastoProdu,jTtoolBarTipoGastoProdu,jTtoolBarDetalleTipoGastoProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGastoProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGastoProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGastoProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGastoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGastoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGastoProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGastoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGastoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGastoProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogastoproduConstantesFunciones.getsFinalQueryTipoGastoProdu();
		String  finalQueryPaginacionTodos=this.tipogastoproduConstantesFunciones.getsFinalQueryTipoGastoProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGastoProduConstantesFunciones.getArrayColumnasGlobalesNoTipoGastoProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGastoProduConstantesFunciones.getArrayColumnasGlobalesTipoGastoProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGastoProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogastoprodusEliminados= new ArrayList<TipoGastoProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGastoProdu();
		
				///*TipoGastoProduSessionBean*/this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
			
			if(this.tipogastoproduSessionBean==null) {
				this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
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
					this.iNumeroPaginacion=TipoGastoProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGastoProduConstantesFunciones.getClassesForeignKeysOfTipoGastoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogastoprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogastoprodusAux= new ArrayList<TipoGastoProdu>();
			
				
			tipogastoproduLogic.setDatosCliente(this.datosCliente);
			tipogastoproduLogic.setDatosDeep(this.datosDeep);
			tipogastoproduLogic.setIsConDeep(true);
			
			
			tipogastoproduLogic.getTipoGastoProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogastoproduLogic.getTodosTipoGastoProdus(finalQueryGlobal,pagination);
					
					//tipogastoproduLogic.getTodosTipoGastoProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogastoproduLogic.getTipoGastoProdus()==null|| tipogastoproduLogic.getTipoGastoProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoprodusAux= new ArrayList<TipoGastoProdu>();
							tipogastoprodusAux.addAll(tipogastoproduLogic.getTipoGastoProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoprodusAux= new ArrayList<TipoGastoProdu>();
							tipogastoprodusAux.addAll(tipogastoprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoproduLogic.getTodosTipoGastoProdus(finalQueryGlobal+"",this.pagination);												
							
							//tipogastoproduLogic.getTodosTipoGastoProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGastoProdus("Todos",tipogastoproduLogic.getTipoGastoProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoproduLogic.setTipoGastoProdus(new ArrayList<TipoGastoProdu>());					
							tipogastoproduLogic.getTipoGastoProdus().addAll(tipogastoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoprodus=new ArrayList<TipoGastoProdu>();
							tipogastoprodus.addAll(tipogastoprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGastoProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGastoProdu=this.idActual;
				
				} else if(this.idTipoGastoProduActual!=null && this.idTipoGastoProduActual!=0L) {
					idTipoGastoProdu=idTipoGastoProduActual;
				}
				
					
				this.sDetalleReporte=TipoGastoProduConstantesFunciones.getDetalleIndicePorId(idTipoGastoProdu);
				
				this.tipogastoprodus=new ArrayList<TipoGastoProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogastoproduLogic.getEntity(idTipoGastoProdu);
					
					//tipogastoproduLogic.getEntityWithConnection(idTipoGastoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduLogic.setTipoGastoProdus(new ArrayList<TipoGastoProdu>());
					tipogastoproduLogic.getTipoGastoProdus().add(tipogastoproduLogic.getTipoGastoProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogastoprodus=new ArrayList<TipoGastoProdu>();
					this.tipogastoprodus.add(tipogastoprodu);
				}
				
				if(tipogastoproduLogic.getTipoGastoProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoGastoProduConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogastoproduLogic.getTipoGastoProdusFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoProduConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoProduConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogastoproduLogic.getTipoGastoProdus()==null||tipogastoproduLogic.getTipoGastoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogastoprodus==null|| tipogastoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoprodusAux=new ArrayList<TipoGastoProdu>();
						tipogastoprodusAux.addAll(tipogastoproduLogic.getTipoGastoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoprodusAux=new ArrayList<TipoGastoProdu>();
							tipogastoprodusAux.addAll(tipogastoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogastoproduLogic.getTipoGastoProdusFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoProduConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoProduConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGastoProdus("FK_IdPais",tipogastoproduLogic.getTipoGastoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGastoProdus("FK_IdPais",tipogastoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduLogic.setTipoGastoProdus(new ArrayList<TipoGastoProdu>());
						tipogastoproduLogic.getTipoGastoProdus().addAll(tipogastoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoprodus=new ArrayList<TipoGastoProdu>();
							tipogastoprodus.addAll(tipogastoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGastoProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGastoProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogastoproduLogic.getTipoGastoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastoprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogastoproduLogic.getTipoGastoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastoprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGastoProdu tipogastoprodu) {
		Boolean permite=true;
		
		if(this.tipogastoprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGastoProduConstantesFunciones.getOrderByListaTipoGastoProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGastoProduConstantesFunciones.getOrderByListaTipoGastoProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProdu tipogastoprodu:tipogastoproduLogic.getTipoGastoProdus()) {
				if(tipogastoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduTotales=tipogastoprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProdu tipogastoprodu:this.tipogastoprodus) {
				if(tipogastoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduTotales=tipogastoprodu;
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
			this.tipogastoproduAux=new TipoGastoProdu();
			this.tipogastoproduAux.setsType(Constantes2.S_TOTALES);
			this.tipogastoproduAux.setIsNew(false);
			this.tipogastoproduAux.setIsChanged(false);
			this.tipogastoproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGastoProduConstantesFunciones.TotalizarValoresFilaTipoGastoProdu(this.tipogastoproduLogic.getTipoGastoProdus(),this.tipogastoproduAux);
				
				this.tipogastoproduLogic.getTipoGastoProdus().add(this.tipogastoproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGastoProduConstantesFunciones.TotalizarValoresFilaTipoGastoProdu(this.tipogastoprodus,this.tipogastoproduAux);
				
				this.tipogastoprodus.add(this.tipogastoproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogastoproduTotales=new TipoGastoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogastoproduLogic.getTipoGastoProdus().remove(tipogastoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogastoprodus.remove(tipogastoproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogastoproduTotales=new TipoGastoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProdu tipogastoprodu:tipogastoproduLogic.getTipoGastoProdus()) {
				if(tipogastoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduTotales=tipogastoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGastoProduConstantesFunciones.TotalizarValoresFilaTipoGastoProdu(this.tipogastoproduLogic.getTipoGastoProdus(),tipogastoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProdu tipogastoprodu:this.tipogastoprodus) {
				if(tipogastoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduTotales=tipogastoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGastoProduConstantesFunciones.TotalizarValoresFilaTipoGastoProdu(this.tipogastoprodus,tipogastoproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGastoProdusFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoGastoProdusFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduLogic.getTipoGastoProdusFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosTipoGastoProdu() {
		this.isPermisoTodoTipoGastoProdu=false;
		this.isPermisoNuevoTipoGastoProdu=false;
		this.isPermisoActualizarTipoGastoProdu=false;
		this.isPermisoActualizarOriginalTipoGastoProdu=false;
		this.isPermisoEliminarTipoGastoProdu=false;
		this.isPermisoGuardarCambiosTipoGastoProdu=false;
		this.isPermisoConsultaTipoGastoProdu=false;
		this.isPermisoBusquedaTipoGastoProdu=false;
		this.isPermisoReporteTipoGastoProdu=false;		
		this.isPermisoOrdenTipoGastoProdu=false;		
		this.isPermisoPaginacionMedioTipoGastoProdu=false;		
		this.isPermisoPaginacionAltoTipoGastoProdu=false;
		this.isPermisoPaginacionTodoTipoGastoProdu=false;
		this.isPermisoCopiarTipoGastoProdu=false;		
		this.isPermisoVerFormTipoGastoProdu=false;		
		this.isPermisoDuplicarTipoGastoProdu=false;		
		this.isPermisoOrdenTipoGastoProdu=false;		
	}
	
	public void setPermisosUsuarioTipoGastoProdu(Boolean isPermiso) {
		this.isPermisoTodoTipoGastoProdu=isPermiso;
		this.isPermisoNuevoTipoGastoProdu=isPermiso;
		this.isPermisoActualizarTipoGastoProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoGastoProdu=isPermiso;
		this.isPermisoEliminarTipoGastoProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoGastoProdu=isPermiso;
		this.isPermisoConsultaTipoGastoProdu=isPermiso;
		this.isPermisoBusquedaTipoGastoProdu=isPermiso;
		this.isPermisoReporteTipoGastoProdu=isPermiso;
		this.isPermisoOrdenTipoGastoProdu=isPermiso;		
		this.isPermisoPaginacionMedioTipoGastoProdu=isPermiso;		
		this.isPermisoPaginacionAltoTipoGastoProdu=isPermiso;		
		this.isPermisoPaginacionTodoTipoGastoProdu=isPermiso;		
		this.isPermisoCopiarTipoGastoProdu=isPermiso;		
		this.isPermisoVerFormTipoGastoProdu=isPermiso;		
		this.isPermisoDuplicarTipoGastoProdu=isPermiso;
		this.isPermisoOrdenTipoGastoProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGastoProdu(Boolean isPermiso) {
		//this.isPermisoTodoTipoGastoProdu=isPermiso;
		this.isPermisoNuevoTipoGastoProdu=isPermiso;
		this.isPermisoActualizarTipoGastoProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoGastoProdu=isPermiso;
		this.isPermisoEliminarTipoGastoProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoGastoProdu=isPermiso;
		//this.isPermisoConsultaTipoGastoProdu=isPermiso;
		//this.isPermisoBusquedaTipoGastoProdu=isPermiso;
		//this.isPermisoReporteTipoGastoProdu=isPermiso;
		//this.isPermisoOrdenTipoGastoProdu=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGastoProdu=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGastoProdu=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGastoProdu=isPermiso;		
		//this.isPermisoCopiarTipoGastoProdu=isPermiso;		
		//this.isPermisoDuplicarTipoGastoProdu=isPermiso;
		//this.isPermisoOrdenTipoGastoProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGastoProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoGastoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGastoProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGastoProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGastoProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGastoProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGastoProduClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoGastoProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGastoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGastoProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGastoProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGastoProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGastoProdu=this.isPermisoActualizarTipoGastoProdu;
			this.isPermisoEliminarTipoGastoProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGastoProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGastoProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGastoProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGastoProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGastoProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGastoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGastoProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGastoProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGastoProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGastoProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGastoProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGastoProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGastoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGastoProdu.setToolTipText(this.jTableDatosTipoGastoProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGastoProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGastoProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGastoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGastoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGastoProdu() throws Exception {
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
	public void inicializarCombosForeignKeyTipoGastoProduListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGastoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGastoProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGastoProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoGastoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoGastoProduParameterReturnGeneral tipogastoproduReturnGeneral=new TipoGastoProduParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipogastoproduConstantesFunciones.cargarid_paisTipoGastoProdu)
					 || (this.esRecargarFks && this.tipogastoproduConstantesFunciones.cargarid_paisTipoGastoProdu)) {

					if(!this.tipogastoproduSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipogastoproduSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipogastoproduReturnGeneral=tipogastoproduLogic.cargarCombosLoteForeignKeyTipoGastoProdu(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipogastoproduReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGastoProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipogastoproduSessionBean==null) {
				this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
			}

			if(!this.tipogastoproduSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoGastoProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGastoProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGastoProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGastoProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGastoProdu(TipoGastoProdu tipogastoprodu)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipogastoprodu.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGastoProdu(TipoGastoProdu tipogastoprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGastoProdu()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipogastoproduConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGastoProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGastoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGastoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGastoProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGastoProdu()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGastoProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGastoProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu!=null && this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoGastoProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGastoProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGastoProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogastoproduSessionBean=new TipoGastoProduSessionBean(); 
		this.tipogastoproduConstantesFunciones=new TipoGastoProduConstantesFunciones(); 
		this.tipogastoproduBean=new TipoGastoProdu();//(this.tipogastoproduConstantesFunciones); 		
		this.tipogastoproduReturnGeneral=new TipoGastoProduParameterReturnGeneral(); 
		
		this.tipogastoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGastoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGastoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGastoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGastoProdu(true);
			
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
			
			this.tipogastoproduConstantesFunciones=new TipoGastoProduConstantesFunciones(); 
			this.tipogastoproduBean=new TipoGastoProdu();//this.tipogastoproduConstantesFunciones); 			
			this.tipogastoproduReturnGeneral=new TipoGastoProduParameterReturnGeneral(); 
		
			TipoGastoProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Gasto Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogastoprodu=new TipoGastoProdu();
			this.tipogastoprodus = new ArrayList<TipoGastoProdu>();
			this.tipogastoprodusAux = new ArrayList<TipoGastoProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic=new TipoGastoProduLogic();
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogastoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogastoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGastoProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGastoProdu);	
					}
					
					if(this.jInternalFrameImportacionTipoGastoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGastoProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGastoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGastoProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGastoProdu);
				this.jInternalFrameDetalleFormTipoGastoProdu.setVisible(false);
				this.jInternalFrameDetalleFormTipoGastoProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGastoProdu);
					this.jInternalFrameReporteDinamicoTipoGastoProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGastoProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGastoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGastoProdu);
					this.jInternalFrameImportacionTipoGastoProdu.setVisible(false);
					this.jInternalFrameImportacionTipoGastoProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGastoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGastoProdu);
					this.jInternalFrameOrderByTipoGastoProdu.setVisible(false);
					this.jInternalFrameOrderByTipoGastoProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGastoProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGastoProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogastoproduReturnGeneral=new TipoGastoProduParameterReturnGeneral();
			
			this.tipogastoproduParameterGeneral=new TipoGastoProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogastoproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGastoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGastoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogastoproduSessionBean.getEsGuardarRelacionado(),this.tipogastoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGastoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogastoproduSessionBean.getEsGuardarRelacionado(),this.tipogastoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGastoProdu=false;
			this.isVisibilidadCeldaDuplicarTipoGastoProdu=true;
			this.isVisibilidadCeldaCopiarTipoGastoProdu=true;
			this.isVisibilidadCeldaVerFormTipoGastoProdu=true;
			this.isVisibilidadCeldaOrdenTipoGastoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
			this.isVisibilidadCeldaModificarTipoGastoProdu=false;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=false;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGastoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGastoProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGastoProdu(false);
			
			this.setPermisosUsuarioTipoGastoProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogastoproduSessionBean.getEsGuardarRelacionado() && this.tipogastoproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGastoProduClasesRelacionadas();
			}
			
			if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGastoProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGastoProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGastoProdu();
			}
			
			if(!this.isPermisoBusquedaTipoGastoProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGastoProdu,this.isPermisoPaginacionMedioTipoGastoProdu,this.isPermisoPaginacionTodoTipoGastoProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGastoProduConstantesFunciones.getTiposSeleccionarTipoGastoProdu());
				
				this.tiposColumnasSelect=TipoGastoProduConstantesFunciones.getTiposSeleccionarTipoGastoProdu(true);
				
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
			//if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGastoProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoGastoProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoGastoProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProdu() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipogastoproduImplementable= (TipoGastoProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGastoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogastoproduImplementableHome= (TipoGastoProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGastoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogastoprodus= new ArrayList<TipoGastoProdu>();
			this.tipogastoprodusEliminados= new ArrayList<TipoGastoProdu>();
						
			this.isEsNuevoTipoGastoProdu=false;
			this.esParaAccionDesdeFormularioTipoGastoProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGastoProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGastoProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGastoProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGastoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGastoProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGastoProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGastoProdu();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGastoProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGastoProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGastoProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGastoProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGastoProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGastoProdu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGastoProdu")) {
				iIndex=this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGastoProdu();	
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
	
	public void cargarCombosForeignKeyTipoGastoProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGastoProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGastoProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGastoProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGastoProdu();
		
		this.cargarCombosFrameForeignKeyTipoGastoProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGastoProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGastoProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoGastoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
			
			if(jTableDatosTipoGastoProdu.getRowCount()>=1) {
				jTableDatosTipoGastoProdu.removeRowSelectionInterval(0, jTableDatosTipoGastoProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGastoProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGastoProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGastoProdu(true);			
			//this.tipogastoprodu=new TipoGastoProdu();
			//this.tipogastoprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGastoProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProdu() ;
			
			if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGastoProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogastoprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);				
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
			if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGastoProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGastoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGastoProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGastoProdu.getSelectedRows().length;			
			}
			
			tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGastoProdu--;			
				//TipoGastoProdu tipogastoproduAux= new TipoGastoProdu();			
				//tipogastoproduAux.setId(this.iIdNuevoTipoGastoProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGastoProdu tipogastoproduOrigen=new TipoGastoProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGastoProdu tipogastoproduOrigen : tipogastoprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogastoproduOrigen =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoproduOrigen =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGastoProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogastoprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGastoProdu(tipogastoproduOrigen,this.tipogastoprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogastoproduLogic.getTipoGastoProdus().add(this.tipogastoproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogastoprodus.add(this.tipogastoproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGastoProdu(false);
				
				this.jTableDatosTipoGastoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProdu(), this.getIndiceNuevoTipoGastoProdu());
				
				int iLastRow =  this.jTableDatosTipoGastoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGastoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGastoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGastoProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();									
		
			TipoGastoProdu tipogastoproduOrigen=new TipoGastoProdu();
			TipoGastoProdu tipogastoproduDestino=new TipoGastoProdu();
				
			tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGastoProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogastoprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGastoProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduOrigen =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogastoproduOrigen =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduDestino =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogastoproduDestino =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogastoproduOrigen =tipogastoprodusSeleccionados.get(0);
				tipogastoproduDestino =tipogastoprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGastoProdu(tipogastoproduOrigen,tipogastoproduDestino,true,false);
				
				tipogastoproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogastoproduDestino,tipogastoproduLogic.getTipoGastoProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduDestino,tipogastoprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGastoProdu(false);
				
				//this.jTableDatosTipoGastoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProdu(), this.getIndiceNuevoTipoGastoProdu());
				
				int iLastRow =  this.jTableDatosTipoGastoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGastoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGastoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGastoProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGastoProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGastoProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGastoProdu.setVisible(!isVisible);
			this.jPanelPaginacionTipoGastoProdu.setVisible(!isVisible);
			this.jPanelAccionesTipoGastoProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGastoProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGastoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGastoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGastoProdu();
			
			this.abrirFrameOrderByTipoGastoProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGastoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGastoProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGastoProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGastoProdu.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGastoProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGastoProdu.setSize(this.jInternalFrameDetalleFormTipoGastoProdu.iWidthFormulario,this.jInternalFrameDetalleFormTipoGastoProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGastoProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGastoProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGastoProdu.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGastoProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGastoProdu.jContentPaneDetalleTipoGastoProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGastoProdu.jContentPaneDetalleTipoGastoProdu.getWidth(),TipoGastoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGastoProdu.jContentPaneDetalleTipoGastoProdu.getWidth(),TipoGastoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGastoProdu.jContentPaneDetalleTipoGastoProdu.getWidth(),TipoGastoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGastoProdu.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGastoProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGastoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGastoProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGastoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProdu,false,this);
				} else {
					this.jInternalFrameOrderByTipoGastoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGastoProdu);
				this.jInternalFrameOrderByTipoGastoProdu.setVisible(false);
				this.jInternalFrameOrderByTipoGastoProdu.setSelected(false);
				
				this.jInternalFrameOrderByTipoGastoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGastoProdu"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGastoProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGastoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGastoProdu==null) {
				
				this.jInternalFrameImportacionTipoGastoProdu=new ImportacionJInternalFrame(TipoGastoProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGastoProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGastoProdu);
				this.jInternalFrameImportacionTipoGastoProdu.setVisible(false);
				this.jInternalFrameImportacionTipoGastoProdu.setSelected(false);


				this.jInternalFrameImportacionTipoGastoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGastoProdu"));
				this.jInternalFrameImportacionTipoGastoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGastoProdu"));
				this.jInternalFrameImportacionTipoGastoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGastoProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGastoProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGastoProdu==null) {
				this.jInternalFrameReporteDinamicoTipoGastoProdu=new ReporteDinamicoJInternalFrame(TipoGastoProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGastoProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGastoProdu);
				this.jInternalFrameReporteDinamicoTipoGastoProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGastoProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGastoProdu"));
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGastoProdu"));
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGastoProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGastoProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoGastoProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGastoProdu);
			
	       	this.jInternalFrameDetalleFormTipoGastoProdu.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGastoProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGastoProdu.dispose();
			//this.jInternalFrameDetalleFormTipoGastoProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGastoProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGastoProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGastoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGastoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGastoProdu.setVisible(true);
	        this.jInternalFrameImportacionTipoGastoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGastoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGastoProdu.setVisible(true);
	        this.jInternalFrameOrderByTipoGastoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGastoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGastoProdu.setVisible(false);
	        this.jInternalFrameOrderByTipoGastoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGastoProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGastoProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGastoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGastoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGastoProdu.setVisible(false);
	        this.jInternalFrameImportacionTipoGastoProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGastoProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGastoProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGastoProdu(true);
			//this.isEsNuevoTipoGastoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGastoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGastoProdu(false) ;
			
			if(tipogastoproduSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGastoProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGastoProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGastoProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGastoProdu(true);
			//this.isEsNuevoTipoGastoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogastoprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGastoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGastoProdu(false) ;
			
			if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGastoProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,TipoGastoProduConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoGastoProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGastoProdu(false);
			
			//if(!this.isEsNuevoTipoGastoProdu) {								
				int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
				
			}
			
			if(this.permiteMantenimiento(this.tipogastoprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGastoProdu=true;
					this.inicializarActualizarBindingTablaTipoGastoProdu(false);
					this.isEsNuevoTipoGastoProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGastoProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGastoProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGastoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGastoProdu(false);
				
				this.habilitarDeshabilitarControlesTipoGastoProdu(false);
			
												
				
				if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGastoProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGastoProduActionPerformed(evt,tipogastoproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGastoProdu(this.tipogastoprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGastoProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogastoproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogastoprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipogastoprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipogastoprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogastoprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGastoProduModel) this.jTableDatosTipoGastoProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGastoProdu=true;
				this.inicializarActualizarBindingTablaTipoGastoProdu(false);
				this.isEsNuevoTipoGastoProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGastoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGastoProdu(false);
				
				this.habilitarDeshabilitarControlesTipoGastoProdu(false);
				
				
				
				if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGastoProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGastoProdu.getRowCount()>=1) {
				jTableDatosTipoGastoProdu.removeRowSelectionInterval(0, jTableDatosTipoGastoProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGastoProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGastoProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGastoProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProdu(false) ;
			
			this.isEsNuevoTipoGastoProdu=false;
			
			if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGastoProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGastoProdu(false);
				
				//SI ES MANUAL
				if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGastoProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGastoProdu--;			
			//TipoGastoProdu tipogastoproduAux= new TipoGastoProdu();			
			//tipogastoproduAux.setId(this.iIdNuevoTipoGastoProdu);
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGastoProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
			
			this.tipogastoprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogastoproduLogic.getTipoGastoProdus().add(this.tipogastoproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogastoprodus.add(this.tipogastoproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGastoProdu(false);
			
			this.jTableDatosTipoGastoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProdu(), this.getIndiceNuevoTipoGastoProdu());
			
			int iLastRow =  this.jTableDatosTipoGastoProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGastoProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGastoProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGastoProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGastoProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProdu(false);
			
			//SI ES MANUAL
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGastoProdu();
			}
			
			//this.abrirFrameTreeTipoGastoProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Gasto ProduccionS ?", "MANTENIMIENTO DE Tipo Gasto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGastoProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGastoProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogastoproduReturnGeneral=tipogastoproduLogic.procesarImportacionTipoGastoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogastoproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGastoProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGastoProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGastoProdu.setFileImportacion(this.jInternalFrameImportacionTipoGastoProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGastoProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGastoProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGastoProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGastoProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		

		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGastoProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGastoProduBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGastoProdus("Todos",tipogastoprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGastoProduConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGastoProduConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoGastoProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGastoProduConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoGastoProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGastoProduConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoGastoProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGastoProduConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoGastoProduConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGastoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGastoProduConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoGastoProdu tipogastoprodu:tipogastoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogastoprodu.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGastoProduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGastoProdu tipogastoprodu:tipogastoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogastoprodu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoGastoProdu tipogastoprodu:tipogastoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogastoprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoGastoProdu(row);				
			//	iRow++;
			//}				
			
			//for(TipoGastoProdu tipogastoproduAux:tipogastoprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGastoProdu(tipogastoproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProdu(false);
			
			//SI ES MANUAL
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGastoProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProdu(false);
			
			//SI ES MANUAL
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGastoProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProdu(false);
			
			//SI ES MANUAL
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGastoProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGastoProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGastoProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGastoProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGastoProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGastoProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGastoProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGastoProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGastoProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGastoProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGastoProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGastoProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGastoProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGastoProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGastoProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGastoProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGastoProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGastoProdu();
		
		this.inicializarActualizarBindingBotonesManualTipoGastoProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGastoProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGastoProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGastoProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGastoProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGastoProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGastoProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGastoProdu.jCheckBoxPostAccionNuevoTipoGastoProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGastoProdu.jCheckBoxPostAccionSinCerrarTipoGastoProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGastoProdu.jCheckBoxPostAccionSinMensajeTipoGastoProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGastoProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGastoProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGastoProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
				this.jInternalFrameDetalleFormTipoGastoProdu.jCheckBoxPostAccionNuevoTipoGastoProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGastoProdu.jCheckBoxPostAccionSinCerrarTipoGastoProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGastoProdu.jCheckBoxPostAccionSinMensajeTipoGastoProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGastoProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGastoProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGastoProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGastoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGastoProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGastoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGastoProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGastoProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGastoProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGastoProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGastoProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProdu() throws Exception {
		try	{
			if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGastoProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGastoProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGastoProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGastoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGastoProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGastoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGastoProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGastoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGastoProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGastoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGastoProdu.addItem(reporte);
			}
			
			
			if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGastoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGastoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGastoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGastoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGastoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGastoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGastoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGastoProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGastoProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGastoProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGastoProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGastoProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGastoProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGastoProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoGastoProdu.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoGastoProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGastoProdu(Boolean esInicializar) throws Exception {				
		if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGastoProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGastoProdu() throws Exception {
		this.inicializarActualizarBindingTablaTipoGastoProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGastoProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGastoProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGastoProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogastoproduLogic.getTipoGastoProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogastoprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGastoProdu.setModel(new TipoGastoProduModel(this.tipogastoproduLogic.getTipoGastoProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGastoProdu.setModel(new TipoGastoProduModel(this.tipogastoprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGastoProdu!=null && this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGastoProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO,tipogastoproduConstantesFunciones.resaltarSeleccionarTipoGastoProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO,tipogastoproduConstantesFunciones.resaltarSeleccionarTipoGastoProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,TipoGastoProduConstantesFunciones.LABEL_ID));

		if(this.tipogastoproduConstantesFunciones.mostraridTipoGastoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogastoproduConstantesFunciones.resaltaridTipoGastoProdu,this.tipogastoproduConstantesFunciones.activaridTipoGastoProdu,this,true,"idTipoGastoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoproduConstantesFunciones.resaltaridTipoGastoProdu,this.tipogastoproduConstantesFunciones.activaridTipoGastoProdu,this,true,"idTipoGastoProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,TipoGastoProduConstantesFunciones.LABEL_IDPAIS));

		if(this.tipogastoproduConstantesFunciones.mostrarid_paisTipoGastoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipogastoproduConstantesFunciones.resaltarid_paisTipoGastoProdu,this,this.tipogastoproduConstantesFunciones.activarid_paisTipoGastoProdu));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipogastoproduConstantesFunciones.resaltarid_paisTipoGastoProdu,this,this.tipogastoproduConstantesFunciones.activarid_paisTipoGastoProdu,true,"id_paisTipoGastoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,TipoGastoProduConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogastoproduConstantesFunciones.mostrarnombreTipoGastoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogastoproduConstantesFunciones.resaltarnombreTipoGastoProdu,this.tipogastoproduConstantesFunciones.activarnombreTipoGastoProdu,this,true,"nombreTipoGastoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoproduConstantesFunciones.resaltarnombreTipoGastoProdu,this.tipogastoproduConstantesFunciones.activarnombreTipoGastoProdu,this,true,"nombreTipoGastoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipogastoproduConstantesFunciones.mostrardescripcionTipoGastoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogastoproduConstantesFunciones.resaltardescripcionTipoGastoProdu,this.tipogastoproduConstantesFunciones.activardescripcionTipoGastoProdu,this,true,"descripcionTipoGastoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoproduConstantesFunciones.resaltardescripcionTipoGastoProdu,this.tipogastoproduConstantesFunciones.activardescripcionTipoGastoProdu,this,true,"descripcionTipoGastoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGastoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogastoproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogastoproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGastoProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogastoproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogastoproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGastoProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogastoproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogastoproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGastoProdu.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGastoProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGastoProdu.moveColumn(this.jTableDatosTipoGastoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGastoProdu.moveColumn(this.jTableDatosTipoGastoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGastoProdu.moveColumn(this.jTableDatosTipoGastoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGastoProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGastoProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGastoProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGastoProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGastoProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGastoProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGastoProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogastoproduLogic.getTipoGastoProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogastoprodus.size()-1;
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
		//this.jTableDatosTipoGastoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGastoProdu();
			
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
				
				//this.isEsNuevoTipoGastoProdu=false;
					
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
				if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGastoProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGastoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGastoProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogastoprodu.getsType().equals("DUPLICADO")
				   || this.tipogastoprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGastoProdu=true;
				
				} else {
					this.isEsNuevoTipoGastoProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogastoprodu.getId()>=0 && !this.tipogastoprodu.getIsNew()) {						
						this.isEsNuevoTipoGastoProdu=false;
						
					} else {
						this.isEsNuevoTipoGastoProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGastoProdu(esRelaciones);						
				
				this.seleccionarTipoGastoProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogastoprodu.getId()<0) {
					this.isEsNuevoTipoGastoProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGastoProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGastoProdu(evt,rowIndex);
				}	
				
				if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGastoProdu: " + this.dDif); 
					}
				}								
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGastoProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogastoprodu)) {
					if(this.tipogastoprodu.getId()>0) {
						this.tipogastoprodu.setIsDeleted(true);
						
						this.tipogastoprodusEliminados.add(this.tipogastoprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogastoproduLogic.getTipoGastoProdus().remove(this.tipogastoprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogastoprodus.remove(this.tipogastoprodu);				
					}
					
					
					((TipoGastoProduModel) this.jTableDatosTipoGastoProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGastoProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGastoProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGastoProdu) {
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGastoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGastoProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGastoProdu(this.tipogastoprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipogastoproduConstantesFunciones.cargarid_paisTipoGastoProdu || this.tipogastoproduConstantesFunciones.event_dependid_paisTipoGastoProdu) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipogastoprodu.getid_pais());
									//this.inicializarActualizarBindingTipoGastoProdu(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipogastoprodu.getPais()!=null) {
							this.paissForeignKey.add(tipogastoprodu.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipogastoprodu.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGastoProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGastoProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGastoProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGastoProdu(TipoGastoProdu tipogastoprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGastoProdu(tipogastoprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGastoProdu(TipoGastoProdu tipogastoprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGastoProdu(tipogastoprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGastoProdu(tipogastoprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProdu(tipogastoprodu);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGastoProdu(TipoGastoProdu tipogastoprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.setText(tipogastoprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.setText(tipogastoprodu.getnombre());
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.setText(tipogastoprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGastoProdu tipogastoproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogastoproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGastoProdu tipogastoproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogastoproduLocal=this.tipogastoprodu;
			} else {
				tipogastoproduLocal=this.tipogastoproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogastoproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGastoProdu(tipogastoproduLocal,true);
					
					if(tipogastoproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogastoproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogastoproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGastoProdu(TipoGastoProdu tipogastoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGastoProdu(tipogastoprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(tipogastoprodu);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGastoProdu(TipoGastoProdu tipogastoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGastoProdu(tipogastoprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGastoProdu(TipoGastoProdu tipogastoprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.getText()==null || this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.getText()=="" || this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.setText("0");
			}

			if(conColumnasBase) {tipogastoprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProdu.jLabelIdTipoGastoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogastoprodu.setnombre(this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoProduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProdu.jLabelnombreTipoGastoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogastoprodu.setdescripcion(this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProdu.jLabeldescripcionTipoGastoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGastoProdu(TipoGastoProdu tipogastoproduBean,TipoGastoProdu tipogastoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipogastoproduBean.getid_pais()!=null && !tipogastoproduBean.getid_pais().equals(-1L))) {tipogastoprodu.setid_pais(tipogastoproduBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGastoProdu(TipoGastoProdu tipogastoproduOrigen,TipoGastoProdu tipogastoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogastoproduOrigen.getId()!=null && !tipogastoproduOrigen.getId().equals(0L))) {tipogastoprodu.setId(tipogastoproduOrigen.getId());}}
			if(conDefault || (!conDefault && tipogastoproduOrigen.getid_pais()!=null && !tipogastoproduOrigen.getid_pais().equals(-1L))) {tipogastoprodu.setid_pais(tipogastoproduOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipogastoproduOrigen.getnombre()!=null && !tipogastoproduOrigen.getnombre().equals(""))) {tipogastoprodu.setnombre(tipogastoproduOrigen.getnombre());}
			if(conDefault || (!conDefault && tipogastoproduOrigen.getdescripcion()!=null && !tipogastoproduOrigen.getdescripcion().equals(""))) {tipogastoprodu.setdescripcion(tipogastoproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGastoProdu(TipoGastoProdu tipogastoprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.setText(tipogastoprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.setText(tipogastoprodu.getnombre());
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.setText(tipogastoprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGastoProdu(TipoGastoProduBean tipogastoproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.setText(tipogastoproduBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.setText(tipogastoproduBean.getnombre());
			this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.setText(tipogastoproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGastoProdu(TipoGastoProduParameterReturnGeneral tipogastoproduReturnGeneral,TipoGastoProduBean tipogastoproduBean,Boolean conDefault) throws Exception { 
		try {
			TipoGastoProdu tipogastoproduLocal=new TipoGastoProdu();
			
			tipogastoproduLocal=tipogastoproduReturnGeneral.getTipoGastoProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogastoproduLocal.getId()!=null && !tipogastoproduLocal.getId().equals(0L))) {tipogastoproduBean.setId(tipogastoproduLocal.getId());}}
			if(conDefault || (!conDefault && tipogastoproduLocal.getid_pais()!=null && !tipogastoproduLocal.getid_pais().equals(-1L))) {tipogastoproduBean.setid_pais(tipogastoproduLocal.getid_pais());}
			if(conDefault || (!conDefault && tipogastoproduLocal.getnombre()!=null && !tipogastoproduLocal.getnombre().equals(""))) {tipogastoproduBean.setnombre(tipogastoproduLocal.getnombre());}
			if(conDefault || (!conDefault && tipogastoproduLocal.getdescripcion()!=null && !tipogastoproduLocal.getdescripcion().equals(""))) {tipogastoproduBean.setdescripcion(tipogastoproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGastoProduGenerico(Long idTipoGastoProduSeleccionado,JComboBox jComboBoxTipoGastoProdu,List<TipoGastoProdu> tipogastoprodusLocal)throws Exception {
		try {
			TipoGastoProdu  tipogastoproduTemp=null;

			for(TipoGastoProdu tipogastoproduAux:tipogastoprodusLocal) {
				if(tipogastoproduAux.getId()!=null && tipogastoproduAux.getId().equals(idTipoGastoProduSeleccionado)) {
					tipogastoproduTemp=tipogastoproduAux;
					break;
				}
			}

			jComboBoxTipoGastoProdu.setSelectedItem(tipogastoproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGastoProduGenerico(JComboBox jComboBoxTipoGastoProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGastoProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGastoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGastoProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGastoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoprodu=(TipoGastoProdu) tipogastoproduLogic.getTipoGastoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogastoprodu =(TipoGastoProdu) tipogastoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipogastoprodu.getIsNew() && !tipogastoprodu.getIsChanged() && !tipogastoprodu.getIsDeleted()) {
				sDescripcion=tipogastoprodu.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipogastoprodu.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGastoProdu tipogastoproduRow=new TipoGastoProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoproduRow=(TipoGastoProdu) tipogastoproduLogic.getTipoGastoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogastoproduRow=(TipoGastoProdu) tipogastoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGastoProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu));			
			this.jButtonDuplicarTipoGastoProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoGastoProdu && this.isPermisoDuplicarTipoGastoProdu));			
			this.jButtonCopiarTipoGastoProdu.setVisible((this.isVisibilidadCeldaCopiarTipoGastoProdu && this.isPermisoCopiarTipoGastoProdu));
			this.jButtonVerFormTipoGastoProdu.setVisible((this.isVisibilidadCeldaVerFormTipoGastoProdu && this.isPermisoVerFormTipoGastoProdu));
			
			this.jButtonAbrirOrderByTipoGastoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProdu && this.isPermisoOrdenTipoGastoProdu));			
			
			this.jButtonNuevoRelacionesTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu));			
			this.jButtonNuevoGuardarCambiosTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarTipoGastoProdu.setVisible((this.isVisibilidadCeldaModificarTipoGastoProdu && this.isPermisoActualizarTipoGastoProdu));	
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarTipoGastoProdu.setVisible((this.isVisibilidadCeldaActualizarTipoGastoProdu && this.isPermisoActualizarTipoGastoProdu));	
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarTipoGastoProdu.setVisible((this.isVisibilidadCeldaEliminarTipoGastoProdu && this.isPermisoEliminarTipoGastoProdu));
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarTipoGastoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProdu);							
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGastoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu));						
			this.jButtonDuplicarToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoGastoProdu && this.isPermisoDuplicarTipoGastoProdu));						
			this.jButtonCopiarToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaCopiarTipoGastoProdu && this.isPermisoCopiarTipoGastoProdu));			
			this.jButtonVerFormToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaVerFormTipoGastoProdu && this.isPermisoVerFormTipoGastoProdu));			
			this.jButtonAbrirOrderByToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProdu && this.isPermisoOrdenTipoGastoProdu));
			this.jButtonNuevoRelacionesToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));			
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaModificarTipoGastoProdu && this.isPermisoActualizarTipoGastoProdu));	
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaActualizarTipoGastoProdu  && this.isPermisoActualizarTipoGastoProdu));	
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaEliminarTipoGastoProdu && this.isPermisoEliminarTipoGastoProdu));
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarToolBarTipoGastoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProdu);				
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGastoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu));			
			this.jMenuItemDuplicarTipoGastoProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoGastoProdu && this.isPermisoDuplicarTipoGastoProdu));			
			this.jMenuItemCopiarTipoGastoProdu.setVisible((this.isVisibilidadCeldaCopiarTipoGastoProdu && this.isPermisoCopiarTipoGastoProdu));			
			this.jMenuItemVerFormTipoGastoProdu.setVisible((this.isVisibilidadCeldaVerFormTipoGastoProdu && this.isPermisoVerFormTipoGastoProdu));			
			this.jMenuItemAbrirOrderByTipoGastoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProdu && this.isPermisoOrdenTipoGastoProdu));			
			//this.jMenuItemMostrarOcultarTipoGastoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProdu && this.isPermisoOrdenTipoGastoProdu));
			this.jMenuItemDetalleAbrirOrderByTipoGastoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProdu && this.isPermisoOrdenTipoGastoProdu));			
			//this.jMenuItemDetalleMostrarOcultarTipoGastoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProdu && this.isPermisoOrdenTipoGastoProdu));			
			this.jMenuItemNuevoRelacionesTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu));			
			this.jMenuItemNuevoGuardarCambiosTipoGastoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProdu && this.isPermisoNuevoTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));									
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemModificarTipoGastoProdu.setVisible((this.isVisibilidadCeldaModificarTipoGastoProdu && this.isPermisoActualizarTipoGastoProdu));	
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemActualizarTipoGastoProdu.setVisible((this.isVisibilidadCeldaActualizarTipoGastoProdu && this.isPermisoActualizarTipoGastoProdu));	
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemEliminarTipoGastoProdu.setVisible((this.isVisibilidadCeldaEliminarTipoGastoProdu && this.isPermisoEliminarTipoGastoProdu));
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemCancelarTipoGastoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProdu);				
			}
			
			this.jMenuItemGuardarCambiosTipoGastoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));						
			this.jMenuItemGuardarCambiosTablaTipoGastoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=this.jButtonNuevoTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGastoProdu=this.jButtonDuplicarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaCopiarTipoGastoProdu=this.jButtonCopiarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaVerFormTipoGastoProdu=this.jButtonVerFormTipoGastoProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGastoProdu=this.jButtonAbrirOrderByTipoGastoProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=this.jButtonNuevoRelacionesTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaModificarTipoGastoProdu=this.jButtonModificarTipoGastoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.isVisibilidadCeldaActualizarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaGuardarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=this.jButtonGuardarCambiosTablaTipoGastoProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGastoProdu=this.jButtonNuevoToolBarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=this.jButtonNuevoRelacionesToolBarTipoGastoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.isVisibilidadCeldaModificarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarToolBarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarToolBarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarToolBarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarToolBarTipoGastoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGastoProdu=this.jButtonGuardarCambiosToolBarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=this.jButtonGuardarCambiosTablaToolBarTipoGastoProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGastoProdu=this.jMenuItemNuevoTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=this.jMenuItemNuevoRelacionesTipoGastoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.isVisibilidadCeldaModificarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemModificarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemActualizarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemEliminarTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoGastoProdu=this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemCancelarTipoGastoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGastoProdu=this.jMenuItemGuardarCambiosTipoGastoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=this.jMenuItemGuardarCambiosTablaTipoGastoProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGastoProdu(Boolean esInicializar) {
		if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGastoProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGastoProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGastoProdu() {
		this.jButtonNuevoTipoGastoProdu.setVisible(this.isPermisoNuevoTipoGastoProdu);			
		this.jButtonDuplicarTipoGastoProdu.setVisible(this.isPermisoDuplicarTipoGastoProdu);			
		this.jButtonCopiarTipoGastoProdu.setVisible(this.isPermisoCopiarTipoGastoProdu);			
		this.jButtonVerFormTipoGastoProdu.setVisible(this.isPermisoVerFormTipoGastoProdu);			
		
		this.jButtonAbrirOrderByTipoGastoProdu.setVisible(this.isPermisoOrdenTipoGastoProdu);					
		
		this.jButtonNuevoRelacionesTipoGastoProdu.setVisible(this.isPermisoNuevoTipoGastoProdu);			
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarTipoGastoProdu.setVisible(this.isPermisoActualizarTipoGastoProdu);	
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarTipoGastoProdu.setVisible(this.isPermisoActualizarTipoGastoProdu);	
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarTipoGastoProdu.setVisible(this.isPermisoEliminarTipoGastoProdu);
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarTipoGastoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProdu);						
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.setVisible(this.isPermisoGuardarCambiosTipoGastoProdu);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu.setVisible(this.isPermisoActualizarTipoGastoProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGastoProdu() {
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarTipoGastoProdu.setVisible(this.isPermisoActualizarTipoGastoProdu);	
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarTipoGastoProdu.setVisible(this.isPermisoActualizarTipoGastoProdu);	
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarTipoGastoProdu.setVisible(this.isPermisoEliminarTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarTipoGastoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProdu);							
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProdu && this.isPermisoGuardarCambiosTipoGastoProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGastoProdu() {
		if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGastoProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGastoProdu() {
	}
	
	public void jTableDatosTipoGastoProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGastoProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGastoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.gettipogastoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoprodu==null) {
						this.tipogastoprodu = new TipoGastoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
				}

				if(this.tipogastoprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogastoprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoGastoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoGastoProdu(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoGastoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoGastoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.gettipogastoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipogastoproduLogic.getConnexion());

				if(this.tipogastoprodu.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipogastoprodu.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoGastoProdu=(TitledBorder)this.jScrollPanelDatosTipoGastoProdu.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoGastoProdu.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoGastoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.gettipogastoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoprodu==null) {
						this.tipogastoprodu = new TipoGastoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
				}

				if(this.tipogastoprodu.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipogastoprodu.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGastoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.gettipogastoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoprodu==null) {
						this.tipogastoprodu = new TipoGastoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
				}

				if(this.tipogastoprodu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogastoprodu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoGastoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.gettipogastoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoprodu==null) {
						this.tipogastoprodu = new TipoGastoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);
				}

				if(this.tipogastoprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipogastoprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoGastoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGastoProdu(false,false);

			this.getTipoGastoProdusFK_IdPais();

			this.inicializarActualizarBindingTipoGastoProdu(false);

			//if(TipoGastoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGastoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGastoProdu() {
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
			this.jInternalFrameDetalleFormTipoGastoProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGastoProdu.dispose();
			this.jInternalFrameDetalleFormTipoGastoProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
			this.jInternalFrameReporteDinamicoTipoGastoProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGastoProdu.dispose();
			this.jInternalFrameReporteDinamicoTipoGastoProdu=null;
		}
		
		if(this.jInternalFrameImportacionTipoGastoProdu!=null) {
			this.jInternalFrameImportacionTipoGastoProdu.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGastoProdu.dispose();
			this.jInternalFrameImportacionTipoGastoProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGastoProdu();
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGastoProdu")) {
				jButtonDuplicarTipoGastoProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGastoProdu")) {
				jButtonCopiarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGastoProdu")) {
				jButtonVerFormTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGastoProdu")) {
				jButtonDuplicarTipoGastoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGastoProdu")) {
				jButtonDuplicarTipoGastoProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGastoProdu")) {
				jButtonModificarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGastoProdu")) {
				jButtonModificarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGastoProdu")) {
				jButtonModificarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGastoProdu")) {
				jButtonActualizarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGastoProdu")) {
				jButtonActualizarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGastoProdu")) {
				jButtonActualizarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGastoProdu")) {
				jButtonEliminarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGastoProdu")) {
				jButtonEliminarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGastoProdu")) {
				jButtonEliminarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGastoProdu")) {
				jButtonCancelarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGastoProdu")) {
				jButtonCancelarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGastoProdu")) {
				jButtonCancelarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGastoProdu")) {
				jButtonCerrarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGastoProdu")) {
				jButtonCerrarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGastoProdu")) {
				jButtonCerrarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGastoProdu")) {
				jButtonMostrarOcultarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGastoProdu")) {
				jButtonCancelarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGastoProdu")) {
				jButtonCopiarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGastoProdu")) {
				jButtonVerFormTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGastoProdu")) {
				jButtonCopiarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGastoProdu")) {
				jButtonVerFormTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGastoProdu")) {
				jButtonRecargarInformacionTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGastoProdu")) {
				jButtonRecargarInformacionTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGastoProdu")) {
				jButtonRecargarInformacionTipoGastoProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGastoProdu")) {
				jButtonAnterioresTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGastoProdu")) {
				jButtonAnterioresTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGastoProdu")) {
				jButtonAnterioresTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGastoProdu")) {
				jButtonSiguientesTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGastoProdu")) {
				jButtonSiguientesTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGastoProdu")) {
				jButtonSiguientesTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGastoProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGastoProdu")) {
				jButtonAbrirOrderByTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGastoProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGastoProdu")) {
				jButtonMostrarOcultarTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGastoProdu")) {
				jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGastoProdu")) {
				jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGastoProdu")) {
				jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGastoProdu")) {
				jButtonCerrarReporteDinamicoTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGastoProdu")) {
				jButtonGenerarReporteDinamicoTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGastoProdu")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGastoProdu")) {
				jButtonCerrarImportacionTipoGastoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGastoProdu")) {
				
				jButtonGenerarImportacionTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGastoProdu")) {
				
				jButtonAbrirImportacionTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGastoProdu")) {
				jComboBoxTiposAccionesTipoGastoProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGastoProdu")) {
				jComboBoxTiposRelacionesTipoGastoProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGastoProdu")) {
				jComboBoxTiposAccionesTipoGastoProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGastoProdu")) {
				
				jComboBoxTiposSeleccionarTipoGastoProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGastoProdu")) {
				jTextFieldValorCampoGeneralTipoGastoProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGastoProdu")) {
				jButtonAbrirOrderByTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGastoProdu")) {
				jButtonAbrirOrderByTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGastoProdu")) {
				jButtonCerrarOrderByTipoGastoProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGastoProduBusqueda")) {
				this.jButtonidTipoGastoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGastoProduUpdate")) {
				this.jButtonid_paisTipoGastoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGastoProduBusqueda")) {
				this.jButtonid_paisTipoGastoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGastoProduBusqueda")) {
				this.jButtonnombreTipoGastoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoGastoProduBusqueda")) {
				this.jButtondescripcionTipoGastoProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoGastoProdu")) {
				this.jButtonFK_IdPaisTipoGastoProduActionPerformed(evt);
			}
			
			;
			
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGastoProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGastoProdu tipogastoproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogastoproduLocal=this.tipogastoprodu;
			} else {
				tipogastoproduLocal=this.tipogastoproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
							
				
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
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
			
			


			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
								
						
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
								
				
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
							
				
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
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
			
			


			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
								
				
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGastoProdu")) {
					jCheckBoxSeleccionarTodosTipoGastoProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGastoProdu")) {
					jCheckBoxSeleccionadosTipoGastoProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGastoProdu")) {
					
				}
				
				


				
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
												
				
				


				
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
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
			
			


			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoprodu);
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
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
				
				


				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduAnterior =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGastoProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGastoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGastoProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogastoprodu =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogastoprodu =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogastoprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGastoProdu")) {
				
				}
				
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGastoProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGastoProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGastoProdu")) {
			
			}
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGastoProdu();
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGastoProdu")) {
				jButtonDuplicarTipoGastoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGastoProdu")) {
				jButtonCopiarTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGastoProdu")) {
				jButtonVerFormTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGastoProdu")) {
				jButtonNuevoTipoGastoProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGastoProdu")) {
				jButtonModificarTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGastoProdu")) {
				jButtonActualizarTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGastoProdu")) {
				jButtonEliminarTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGastoProdu")) {
				jButtonCancelarTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGastoProdu")) {
				jButtonCerrarTipoGastoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGastoProdu")) {
				jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGastoProdu")) {
				jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGastoProdu")) {
				jButtonAbrirOrderByTipoGastoProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGastoProdu")) {
				jButtonRecargarInformacionTipoGastoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGastoProdu")) {
				jButtonAnterioresTipoGastoProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGastoProdu")) {
				jButtonSiguientesTipoGastoProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGastoProduBusqueda")) {
				this.jButtonidTipoGastoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGastoProduUpdate")) {
				this.jButtonid_paisTipoGastoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGastoProduBusqueda")) {
				this.jButtonid_paisTipoGastoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGastoProduBusqueda")) {
				this.jButtonnombreTipoGastoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoGastoProduBusqueda")) {
				this.jButtondescripcionTipoGastoProduBusquedaActionPerformed(evt);
			}
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGastoProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGastoProdu")) {
				closingInternalFrameTipoGastoProdu();
				
			} else if(sTipo.equals("jButtonCancelarTipoGastoProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGastoProdu = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGastoProduBeanSwingJInternalFrame jInternalFrameParent=(TipoGastoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGastoProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGastoProduActionPerformed(null);
			}
			
			TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogastoprodu,new Object(),this.tipogastoproduParameterGeneral,this.tipogastoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGastoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGastoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGastoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogastoprodu)) {
			if(!esControlTabla) {
				if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);			
				}
				
				if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGastoProdu(this.tipogastoprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogastoproduReturnGeneral=tipogastoproduLogic.procesarEventosTipoGastoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoproduLogic.getTipoGastoProdus(),this.tipogastoprodu,this.tipogastoproduParameterGeneral,this.isEsNuevoTipoGastoProdu,classes);//this.tipogastoproduLogic.getTipoGastoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGastoProdu(this.tipogastoproduReturnGeneral,this.tipogastoproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGastoProdu(classes,this.tipogastoproduReturnGeneral,this.tipogastoproduBean,false);
					}
						
					if(this.tipogastoproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProdu(this.tipogastoproduReturnGeneral.getTipoGastoProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGastoProdu(this.tipogastoproduReturnGeneral.getTipoGastoProdu());	
					}
						
					if(this.tipogastoproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGastoProdu(this.tipogastoproduReturnGeneral.getTipoGastoProdu(),classes);//this.tipogastoproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGastoProdu(this.tipogastoprodu,classes);//this.tipogastoproduBean);									
				}
			
				if(TipoGastoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGastoProdu(this.tipogastoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProdu(this.tipogastoprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogastoproduAnterior!=null) {
						this.tipogastoprodu=this.tipogastoproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogastoproduReturnGeneral=tipogastoproduLogic.procesarEventosTipoGastoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoproduLogic.getTipoGastoProdus(),this.tipogastoprodu,this.tipogastoproduParameterGeneral,this.isEsNuevoTipoGastoProdu,classes);//this.tipogastoproduLogic.getTipoGastoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogastoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogastoproduReturnGeneral.getTipoGastoProdu(),tipogastoproduLogic.getTipoGastoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogastoproduReturnGeneral.getTipoGastoProdu(),this.tipogastoprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGastoProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGastoProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGastoProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGastoProdu() throws Exception {
		
		TipoGastoProduModel tipogastoproduModel=(TipoGastoProduModel)this.jTableDatosTipoGastoProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoproduModel.tipogastoprodus=this.tipogastoproduLogic.getTipoGastoProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogastoproduModel.tipogastoprodus=this.tipogastoprodus;
		}
		
		
		((TipoGastoProduModel) this.jTableDatosTipoGastoProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGastoProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogastoproduAnterior(),this.tipogastoproduLogic.getTipoGastoProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogastoproduAnterior(),this.tipogastoprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGastoProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGastoProdu(TipoGastoProdu tipogastoprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
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
										
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoprodu,new Object(),generalEntityParameterGeneral,this.tipogastoproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGastoProduConstantesFunciones.getClassesRelationshipsOfTipoGastoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGastoProduConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGastoProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGastoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGastoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoprodu,new Object(),generalEntityParameterGeneral,this.tipogastoproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGastoProdu(TipoGastoProduBean tipogastoproduBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGastoProdu(ArrayList<Classe> classes,TipoGastoProduReturnGeneral tipogastoproduReturnGeneral,TipoGastoProduBean tipogastoproduBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGastoProdu(TipoGastoProdu tipogastoprodu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipogastoprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGastoProdu = new TipoGastoProduDetalleFormJInternalFrame(jDesktopPane,this.tipogastoproduSessionBean.getConGuardarRelaciones(),this.tipogastoproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.setVisible(false);
		this.jInternalFrameDetalleFormTipoGastoProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGastoProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGastoProdu.tipogastoproduLogic=this.tipogastoproduLogic;
		
		this.cargarCombosFrameForeignKeyTipoGastoProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGastoProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGastoProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGastoProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGastoProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGastoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGastoProdu"));
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoGastoProdu"));

		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarToolBarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGastoProdu"));
					
		this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemModificarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGastoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoGastoProdu"));
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarToolBarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGastoProdu"));
						
		this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemActualizarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGastoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoGastoProdu"));
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGastoProdu"));
								
		this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemEliminarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGastoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoGastoProdu"));
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGastoProdu"));
					
		this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemCancelarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGastoProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemDetalleCerrarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGastoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGastoProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGastoProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGastoProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonidTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonid_paisTipoGastoProduUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonid_paisTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonnombreTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtondescripcionTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoGastoProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGastoProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGastoProdu"));
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGastoProdu"));
		}
		
		this.jTableDatosTipoGastoProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGastoProdu"));
		
		this.jTableDatosTipoGastoProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGastoProdu"));
		
		this.jButtonNuevoTipoGastoProdu.addActionListener(new ButtonActionListener(this,"NuevoTipoGastoProdu"));
		
		this.jButtonDuplicarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"DuplicarTipoGastoProdu"));
		
		this.jButtonCopiarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"CopiarTipoGastoProdu"));
		
		this.jButtonVerFormTipoGastoProdu.addActionListener(new ButtonActionListener(this,"VerFormTipoGastoProdu"));
		
		
		this.jButtonNuevoToolBarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGastoProdu"));
			
		this.jButtonDuplicarToolBarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGastoProdu"));
			
		this.jMenuItemNuevoTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGastoProdu"));
			
		this.jMenuItemDuplicarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGastoProdu"));		
		
		
		this.jButtonNuevoRelacionesTipoGastoProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGastoProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGastoProdu"));
			
		this.jMenuItemNuevoRelacionesTipoGastoProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGastoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoGastoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonModificarToolBarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGastoProdu"));
			
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemModificarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGastoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoGastoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonActualizarToolBarTipoGastoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGastoProdu"));
				
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemActualizarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGastoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoGastoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonEliminarToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGastoProdu"));
						
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemEliminarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGastoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoGastoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonCancelarToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGastoProdu"));
			
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemCancelarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGastoProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGastoProdu"));		
		
		
		this.jButtonCerrarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CerrarTipoGastoProdu"));
		
		
		this.jButtonCerrarToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGastoProdu"));
			
		this.jMenuItemCerrarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGastoProdu"));
			
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jMenuItemDetalleCerrarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGastoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGastoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGastoProdu"));
		}
		
		this.jButtonCopiarToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGastoProdu"));
			
		this.jButtonVerFormToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGastoProdu"));
		
		this.jMenuItemGuardarCambiosTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGastoProdu"));
			
		this.jMenuItemCopiarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGastoProdu"));		
		
		this.jMenuItemVerFormTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGastoProdu"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGastoProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGastoProdu"));
			
		this.jMenuItemGuardarCambiosTablaTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGastoProdu"));		
		
		
		
		this.jButtonRecargarInformacionTipoGastoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGastoProdu"));
					
		this.jButtonRecargarInformacionToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGastoProdu"));
		
		this.jMenuItemRecargarInformacionTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGastoProdu"));		
		
		
		
		this.jButtonAnterioresTipoGastoProdu.addActionListener (new ButtonActionListener(this,"AnterioresTipoGastoProdu"));
		
		
		this.jButtonAnterioresToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGastoProdu"));
		
		this.jMenuItemAnterioresTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGastoProdu"));		
		
		
		this.jButtonSiguientesTipoGastoProdu.addActionListener (new ButtonActionListener(this,"SiguientesTipoGastoProdu"));
		
		
		this.jButtonSiguientesToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGastoProdu"));
			
		this.jMenuItemSiguientesTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGastoProdu"));
			
		this.jMenuItemAbrirOrderByTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGastoProdu"));
			
		this.jMenuItemMostrarOcultarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGastoProdu"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGastoProdu"));
			
		this.jMenuItemDetalleMostarOcultarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGastoProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGastoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGastoProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGastoProdu"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGastoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGastoProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGastoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGastoProdu"));

		this.jCheckBoxSeleccionadosTipoGastoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGastoProdu"));
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGastoProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGastoProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGastoProdu"));
			
		this.jComboBoxTiposAccionesTipoGastoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGastoProdu"));
					
		this.jComboBoxTiposSeleccionarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGastoProdu"));
			
		this.jTextFieldValorCampoGeneralTipoGastoProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGastoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonidTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonid_paisTipoGastoProduUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonid_paisTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonnombreTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtondescripcionTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoGastoProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoGastoProdu.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGastoProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGastoProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGastoProdu"));
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGastoProdu"));
				this.jInternalFrameReporteDinamicoTipoGastoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGastoProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGastoProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGastoProdu"));				
			//this.jButtonGenerarReporteDinamicoTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGastoProdu"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGastoProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGastoProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGastoProdu!=null) {
				this.jInternalFrameImportacionTipoGastoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGastoProdu"));
				this.jInternalFrameImportacionTipoGastoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGastoProdu"));
				this.jInternalFrameImportacionTipoGastoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGastoProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGastoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGastoProdu"));
			
			this.jButtonAbrirOrderByToolBarTipoGastoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGastoProdu"));			
			
			if(this.jInternalFrameOrderByTipoGastoProdu!=null) {
				this.jInternalFrameOrderByTipoGastoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGastoProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProdu.jTabbedPaneRelacionesTipoGastoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGastoProdu"));
		
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
            		closingInternalFrameTipoGastoProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGastoProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGastoProdu = (JInternalFrameBase)event.getSource();
	            	
	            TipoGastoProduBeanSwingJInternalFrame jInternalFrameParent=(TipoGastoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGastoProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGastoProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGastoProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGastoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGastoProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGastoProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGastoProdu";
		inputMap = this.jButtonNuevoTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGastoProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGastoProdu";
		inputMap = this.jButtonNuevoRelacionesTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGastoProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGastoProdu";
		inputMap = this.jButtonModificarTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGastoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGastoProdu";
		inputMap = this.jButtonActualizarTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGastoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGastoProdu";
		inputMap = this.jButtonEliminarTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGastoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGastoProdu";
		inputMap = this.jButtonCancelarTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGastoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGastoProdu";
		inputMap = this.jButtonCerrarTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGastoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGastoProdu";
		inputMap = this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonGuardarCambiosTipoGastoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGastoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGastoProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGastoProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGastoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGastoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGastoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGastoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGastoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGastoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonidTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonid_paisTipoGastoProduUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonid_paisTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtonnombreTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProdu.jButtondescripcionTipoGastoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoGastoProduBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoGastoProdu.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGastoProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGastoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGastoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGastoProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGastoProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGastoProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
					tipogastoproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProdu tipogastoproduAux:tipogastoprodus) {
					tipogastoproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGastoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGastoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
						tipogastoproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGastoProdu tipogastoproduAux:tipogastoprodus) {
						tipogastoproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGastoProdu tipogastoproduAux:tipogastoprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGastoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGastoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGastoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGastoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGastoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGastoProdu.getSelectedRows();
			
			TipoGastoProdu tipogastoproduLocal=new TipoGastoProdu();
			
			//this.seleccionarTodosTipoGastoProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduLocal =(TipoGastoProdu) this.tipogastoproduLogic.getTipoGastoProdus().toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogastoproduLocal =(TipoGastoProdu) this.tipogastoprodus.toArray()[this.jTableDatosTipoGastoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogastoproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
						tipogastoproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGastoProdu tipogastoproduAux:tipogastoprodus) {
						tipogastoproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGastoProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGastoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGastoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGastoProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGastoProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGastoProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGastoProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGastoProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGastoProdu tipogastoproduAux:this.tipogastoproduLogic.getTipoGastoProdus()) {
				
						if(sTipoSeleccionar.equals(TipoGastoProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogastoproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipogastoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProdu tipogastoproduAux:tipogastoprodus) {
					
						if(sTipoSeleccionar.equals(TipoGastoProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogastoproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipogastoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGastoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGastoProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGastoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGastoProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGastoProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGastoProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGastoProdu(conSplash);
				
					this.generarReporteTipoGastoProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGastoProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGastoProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGastoProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGastoProdu();
				
				this.exportarTipoGastoProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGastoProdus();
				//this.importarTipoGastoProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGastoProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGastoProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Gasto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGastoProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGastoProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGastoProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxTiposAccionesFormularioTipoGastoProdu.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGastoProdu();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGastoProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGastoProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGastoProdu();
			
			if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
			TipoGastoProdu tipogastoprodu=new TipoGastoProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGastoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGastoProdu.getSelectedItem();
			
			
			
			
			tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogastoprodusSeleccionados.size()==1) {
				for(TipoGastoProdu tipogastoproduAux:tipogastoprodusSeleccionados) {
					tipogastoprodu=tipogastoproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGastoProdu();
			
      		//this.finishProcessTipoGastoProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGastoProduReturnGeneral() throws Exception {
		if(this.tipogastoproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogastoproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogastoproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogastoproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogastoproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogastoproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGastoProdu(false);
		}
		
		if(this.tipogastoproduReturnGeneral.getConRetornoLista() || this.tipogastoproduReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogastoproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogastoproduLogic.setTipoGastoProdus(this.tipogastoproduReturnGeneral.getTipoGastoProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogastoproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogastoproduLogic.setTipoGastoProdu(this.tipogastoproduReturnGeneral.getTipoGastoProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGastoProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGastoProdu() throws Exception {
		
		
	}
	
	public ArrayList<TipoGastoProdu> getTipoGastoProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGastoProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGastoProdu tipogastoproduAux:tipogastoproduLogic.getTipoGastoProdus()) {
					if(tipogastoproduAux.getIsSelected()) {
						tipogastoprodusSeleccionados.add(tipogastoproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProdu tipogastoproduAux:this.tipogastoprodus) {
					if(tipogastoproduAux.getIsSelected()) {
						tipogastoprodusSeleccionados.add(tipogastoproduAux);				
					}
				}
			}
			
			if(tipogastoprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogastoprodusSeleccionados.addAll(this.tipogastoproduLogic.getTipoGastoProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogastoprodusSeleccionados.addAll(this.tipogastoprodus);				
					}
				}
			}
		} else {
			tipogastoprodusSeleccionados.add(this.tipogastoprodu);
		}
		
		return tipogastoprodusSeleccionados;
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
	
	public void generarReporteTipoGastoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGastoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGastoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGastoProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGastoProdusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Gasto Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGastoProdusSeleccionados() throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGastoProdus("Todos",tipogastoprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGastoProdusSeleccionados() throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGastoProdus("Todos",tipogastoprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGastoProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGastoProdus("Todos",tipogastoprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGastoProdusSeleccionados() throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGastoProdu();
		
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGastoProdu();
		
		
		//this.generarReporteTipoGastoProdus("Todos",tipogastoprodusSeleccionados ,tipogastoproduImplementable,tipogastoproduImplementableHome);
	}
	
	public void mostrarImportacionTipoGastoProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGastoProdu();
		
		this.abrirFrameImportacionTipoGastoProdu();		
		
			
		//this.generarReporteTipoGastoProdus("Todos",tipogastoprodusSeleccionados ,tipogastoproduImplementable,tipogastoproduImplementableHome);
	}
	
	public void importarTipoGastoProdus() throws Exception {		
	
	}
	
	public void exportarTipoGastoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGastoProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGastoProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGastoProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Gasto Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGastoProdusSeleccionados() throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGastoProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGastoProdu tipogastoproduAux:tipogastoprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGastoProdu(tipogastoproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogastoproduAux.setsDetalleGeneralEntityReporte(tipogastoproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGastoProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGastoProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGastoProdu(TipoGastoProdu tipogastoprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogastoprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoprodu.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoprodu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGastoProdusSeleccionados() throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGastoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGastoProdu(row);				
				iRow++;
			}				
			
			for(TipoGastoProdu tipogastoproduAux:tipogastoprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGastoProdu(tipogastoproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGastoProdusSeleccionados() throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();		
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogastoprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogastoprodu");
			//elementRoot.appendChild(element);
		
			for(TipoGastoProdu tipogastoproduAux:tipogastoprodusSeleccionados) {
				element = document.createElement("tipogastoprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGastoProdu(tipogastoproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGastoProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGastoProdu(TipoGastoProdu tipogastoprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoprodu.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoprodu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoGastoProdu(TipoGastoProdu tipogastoprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGastoProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogastoprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGastoProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogastoprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoGastoProduConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipogastoprodu.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoGastoProduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogastoprodu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoGastoProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipogastoprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoGastoProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados=new ArrayList<TipoGastoProdu>();
		
		tipogastoprodusSeleccionados=this.getTipoGastoProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGastoProdu(tipogastoprodusSeleccionados);
		
		this.generarReporteTipoGastoProdus("Todos",tipogastoprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGastoProdu(ArrayList<TipoGastoProdu> tipogastoprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGastoProdu tipogastoproduAux:tipogastoprodusSeleccionados) {
				tipogastoproduAux.setsDetalleGeneralEntityReporte(tipogastoproduAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGastoProduConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipogastoproduAux.setsDescripcionGeneralEntityReporte1(tipogastoproduAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoGastoProduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogastoproduAux.setsDescripcionGeneralEntityReporte1(tipogastoproduAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipogastoproduAux.setsDescripcionGeneralEntityReporte1(tipogastoproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGastoProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGastoProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGastoProdu=false;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=false;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;
			this.isVisibilidadCeldaModificarTipoGastoProdu=false;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=true;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;
			this.isVisibilidadCeldaModificarTipoGastoProdu=false;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=true;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=true;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;
			this.isVisibilidadCeldaModificarTipoGastoProdu=false;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=true;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=true;
			this.isVisibilidadCeldaModificarTipoGastoProdu=false;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=false;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=false;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;
			this.isVisibilidadCeldaModificarTipoGastoProdu=true;
			this.isVisibilidadCeldaActualizarTipoGastoProdu=false;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
			this.isVisibilidadCeldaCancelarTipoGastoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGastoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=true;
		} else {
			this.actualizarEstadoPanelsTipoGastoProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGastoProdu=false;
			//this.isVisibilidadCeldaVerFormTipoGastoProdu=false;
			this.isVisibilidadCeldaDuplicarTipoGastoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogastoproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGastoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			if(!tipogastoproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;												
			}
			
			this.jButtonCerrarTipoGastoProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogastoprodu)) {
			this.isVisibilidadCeldaActualizarTipoGastoProdu=false;
			this.isVisibilidadCeldaEliminarTipoGastoProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGastoProdu() {
	}
	
	public void actualizarEstadoPanelsTipoGastoProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGastoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProdu!=null) {
				this.jScrollPanelDatosTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProdu!=null) {
				this.jPanelPaginacionTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGastoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGastoProdu!=null) {
				this.jScrollPanelDatosTipoGastoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGastoProdu!=null) {
				this.jPanelPaginacionTipoGastoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGastoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProdu!=null) {
				this.jScrollPanelDatosTipoGastoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGastoProdu!=null) {
				this.jPanelPaginacionTipoGastoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGastoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProdu!=null) {
				this.jScrollPanelDatosTipoGastoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGastoProdu!=null) {
				this.jPanelPaginacionTipoGastoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGastoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProdu!=null) {
				this.jScrollPanelDatosTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProdu!=null) {
				this.jPanelPaginacionTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGastoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProdu!=null) {
				this.jScrollPanelDatosTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProdu!=null) {
				this.jPanelPaginacionTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGastoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProdu!=null) {
				this.jScrollPanelDatosTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProdu!=null) {
				this.jPanelPaginacionTipoGastoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
					this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProdu!=null) {
				this.jTabbedPaneBusquedasTipoGastoProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGastoProdu!=null) {
				this.jPanelParametrosReportesTipoGastoProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoGastoProdu.remove(jPanelFK_IdPaisTipoGastoProdu);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGastoProduSessionBean tipogastoproduSessionBean=new TipoGastoProduSessionBean();
		
		if(this.tipogastoproduSessionBean==null) {
			this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
		}
		
		this.tipogastoproduSessionBean.setsUltimaBusquedaTipoGastoProdu(this.getsAccionBusqueda());
		this.tipogastoproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogastoproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipogastoproduSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGastoProduSessionBean tipogastoproduSessionBean=new TipoGastoProduSessionBean();
		
		if(this.tipogastoproduSessionBean==null) {
			this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
		}
		
		if(this.tipogastoproduSessionBean.getsUltimaBusquedaTipoGastoProdu()!=null&&!this.tipogastoproduSessionBean.getsUltimaBusquedaTipoGastoProdu().equals("")) {
			this.setsAccionBusqueda(tipogastoproduSessionBean.getsUltimaBusquedaTipoGastoProdu());
			this.setiNumeroPaginacion(tipogastoproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogastoproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipogastoproduSessionBean.getid_pais());
				tipogastoproduSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipogastoproduSessionBean.setsUltimaBusquedaTipoGastoProdu("");
		this.tipogastoproduSessionBean.setiNumeroPaginacion(TipoGastoProduConstantesFunciones.INUMEROPAGINACION);
		this.tipogastoproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGastoProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGastoProdu() {
		this.updateBorderResaltarBusquedasFormularioTipoGastoProdu();
		this.updateVisibilidadBusquedasFormularioTipoGastoProdu();
		this.updateHabilitarBusquedasFormularioTipoGastoProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGastoProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGastoProdu.getComponents().length>0) {
	

		if(this.tipogastoproduConstantesFunciones.resaltarFK_IdPaisTipoGastoProdu!=null) {
			index= this.jTabbedPaneBusquedasTipoGastoProdu.indexOfComponent(this.jPanelFK_IdPaisTipoGastoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGastoProdu.getComponent(index);
				jPanel.setBorder(this.tipogastoproduConstantesFunciones.resaltarFK_IdPaisTipoGastoProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGastoProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGastoProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGastoProdu.indexOfComponent(this.jPanelFK_IdPaisTipoGastoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGastoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogastoproduConstantesFunciones.mostrarFK_IdPaisTipoGastoProdu);
			if(!this.tipogastoproduConstantesFunciones.mostrarFK_IdPaisTipoGastoProdu && index>-1) {
				this.jTabbedPaneBusquedasTipoGastoProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGastoProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGastoProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGastoProdu.indexOfComponent(this.jPanelFK_IdPaisTipoGastoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGastoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogastoproduConstantesFunciones.activarFK_IdPaisTipoGastoProdu);
				this.jTabbedPaneBusquedasTipoGastoProdu.setEnabledAt(index,this.tipogastoproduConstantesFunciones.activarFK_IdPaisTipoGastoProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGastoProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoGastoProdu.indexOfComponent(this.jPanelFK_IdPaisTipoGastoProdu);

			this.jTabbedPaneBusquedasTipoGastoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGastoProdu.getComponent(index);

			this.tipogastoproduConstantesFunciones.setResaltarFK_IdPaisTipoGastoProdu(resaltar);

			jPanel.setBorder(this.tipogastoproduConstantesFunciones.resaltarFK_IdPaisTipoGastoProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoGastoProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoGastoProdu() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGastoProdu();
		this.updateVisibilidadResaltarControlesFormularioTipoGastoProdu();
		this.updateHabilitarResaltarControlesFormularioTipoGastoProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGastoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogastoproduConstantesFunciones.resaltaridTipoGastoProdu!=null && this.jInternalFrameDetalleFormTipoGastoProdu!=null) {this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.setBorder(this.tipogastoproduConstantesFunciones.resaltaridTipoGastoProdu);}
		if(this.tipogastoproduConstantesFunciones.resaltarid_paisTipoGastoProdu!=null && this.jInternalFrameDetalleFormTipoGastoProdu!=null) {this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setBorder(this.tipogastoproduConstantesFunciones.resaltarid_paisTipoGastoProdu);}
		if(this.tipogastoproduConstantesFunciones.resaltarnombreTipoGastoProdu!=null && this.jInternalFrameDetalleFormTipoGastoProdu!=null) {this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.setBorder(this.tipogastoproduConstantesFunciones.resaltarnombreTipoGastoProdu);}
		if(this.tipogastoproduConstantesFunciones.resaltardescripcionTipoGastoProdu!=null && this.jInternalFrameDetalleFormTipoGastoProdu!=null) {this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.setBorder(this.tipogastoproduConstantesFunciones.resaltardescripcionTipoGastoProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGastoProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
	
		//this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostraridTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jPanelidTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostraridTipoGastoProdu);
		//this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostrarid_paisTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jPanelid_paisTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostrarid_paisTipoGastoProdu);
		//this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostrarnombreTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jPanelnombreTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostrarnombreTipoGastoProdu);
		//this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostrardescripcionTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jPaneldescripcionTipoGastoProdu.setVisible(this.tipogastoproduConstantesFunciones.mostrardescripcionTipoGastoProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGastoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGastoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGastoProdu!=null) {
	
		this.jInternalFrameDetalleFormTipoGastoProdu.jTextFieldidTipoGastoProdu.setEnabled(this.tipogastoproduConstantesFunciones.activaridTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jComboBoxid_paisTipoGastoProdu.setEnabled(this.tipogastoproduConstantesFunciones.activarid_paisTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreanombreTipoGastoProdu.setEnabled(this.tipogastoproduConstantesFunciones.activarnombreTipoGastoProdu);
		this.jInternalFrameDetalleFormTipoGastoProdu.jTextAreadescripcionTipoGastoProdu.setEnabled(this.tipogastoproduConstantesFunciones.activardescripcionTipoGastoProdu);
		}
	}
	
		
}