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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.importaciones.util.PedidoCompraImporConstantesFunciones;
import com.bydan.erp.importaciones.util.PedidoCompraImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.PedidoCompraImporParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.PedidoCompraImporBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.PedidoCompraImporJInternalFrame;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.PedidoCompraImporDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
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



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PedidoCompraImporModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PedidoCompraImporConstantesFunciones.LABEL_ID
										,PedidoCompraImporConstantesFunciones.LABEL_IDEMPRESA
										,PedidoCompraImporConstantesFunciones.LABEL_IDSUCURSAL
										,PedidoCompraImporConstantesFunciones.LABEL_IDMODULO
										,PedidoCompraImporConstantesFunciones.LABEL_IDEJERCICIO
										,PedidoCompraImporConstantesFunciones.LABEL_IDPERIODO
										,PedidoCompraImporConstantesFunciones.LABEL_IDPAIS
										,PedidoCompraImporConstantesFunciones.LABEL_IDCLIENTE
										,PedidoCompraImporConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR
										,PedidoCompraImporConstantesFunciones.LABEL_IDEMPLEADO
										,PedidoCompraImporConstantesFunciones.LABEL_IDUSUARIO
										,PedidoCompraImporConstantesFunciones.LABEL_IDTIPOCAMBIO
										,PedidoCompraImporConstantesFunciones.LABEL_IDMONEDA
										,PedidoCompraImporConstantesFunciones.LABEL_IDTIPOPRORRATEOIMPOR
										,PedidoCompraImporConstantesFunciones.LABEL_IDEMBARCADOR
										,PedidoCompraImporConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE
										,PedidoCompraImporConstantesFunciones.LABEL_IDPUERTO
										,PedidoCompraImporConstantesFunciones.LABEL_IDPUERTODESTINO
										,PedidoCompraImporConstantesFunciones.LABEL_IDTIPOTERMINOSIMPOR
										,PedidoCompraImporConstantesFunciones.LABEL_IDESTADOPEDIDOCOMPRA
										,PedidoCompraImporConstantesFunciones.LABEL_FORMAPAGO
										,PedidoCompraImporConstantesFunciones.LABEL_NUMERODUI
										,PedidoCompraImporConstantesFunciones.LABEL_SECUENCIAL
										,PedidoCompraImporConstantesFunciones.LABEL_NUMEROORDEN
										,PedidoCompraImporConstantesFunciones.LABEL_USOEN
										,PedidoCompraImporConstantesFunciones.LABEL_RESPONSABLE
										,PedidoCompraImporConstantesFunciones.LABEL_ORDENCOMPRA
										,PedidoCompraImporConstantesFunciones.LABEL_LUGARENTREGA
										,PedidoCompraImporConstantesFunciones.LABEL_DESCRIPCION
										,PedidoCompraImporConstantesFunciones.LABEL_FECHA
										,PedidoCompraImporConstantesFunciones.LABEL_FECHAEMISION
										,PedidoCompraImporConstantesFunciones.LABEL_FECHAENTREGA
										,PedidoCompraImporConstantesFunciones.LABEL_FECHAENTREGACLIENTE
										,PedidoCompraImporConstantesFunciones.LABEL_NOMBRESEGURO
										,PedidoCompraImporConstantesFunciones.LABEL_NOMBRECONSIGNATARIO
										,PedidoCompraImporConstantesFunciones.LABEL_PRECIOS
										,PedidoCompraImporConstantesFunciones.LABEL_FLETE
										,PedidoCompraImporConstantesFunciones.LABEL_SEGURO
										,PedidoCompraImporConstantesFunciones.LABEL_GASTOS
										,PedidoCompraImporConstantesFunciones.LABEL_CFR
										,PedidoCompraImporConstantesFunciones.LABEL_CIF
										,PedidoCompraImporConstantesFunciones.LABEL_TOTAL
										,PedidoCompraImporConstantesFunciones.LABEL_IDFORMATO
										,PedidoCompraImporConstantesFunciones.LABEL_IDANIO
										,PedidoCompraImporConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<PedidoCompraImpor> pedidocompraimpors;
	  	 
	    //NO SE UTILIZA
	    public PedidoCompraImporModel(List<PedidoCompraImpor> pedidocompraimpors,JInternalFrameBase jInternalFrameBase) {
	    	this.pedidocompraimpors=pedidocompraimpors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PedidoCompraImporModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pedidocompraimpors=new ArrayList<PedidoCompraImpor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pedidocompraimpors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pedidocompraimpors.get(rowIndex).getIsSelected();
	            
				case 1: return this.pedidocompraimpors.get(rowIndex).getId();
				case 2: return this.pedidocompraimpors.get(rowIndex).getid_empresa();
				case 3: return this.pedidocompraimpors.get(rowIndex).getid_sucursal();
				case 4: return this.pedidocompraimpors.get(rowIndex).getid_modulo();
				case 5: return this.pedidocompraimpors.get(rowIndex).getid_ejercicio();
				case 6: return this.pedidocompraimpors.get(rowIndex).getid_periodo();
				case 7: return this.pedidocompraimpors.get(rowIndex).getid_pais();
				case 8: return this.pedidocompraimpors.get(rowIndex).getid_cliente();
				case 9: return this.pedidocompraimpors.get(rowIndex).getid_cliente_proveedor();
				case 10: return this.pedidocompraimpors.get(rowIndex).getid_empleado();
				case 11: return this.pedidocompraimpors.get(rowIndex).getid_usuario();
				case 12: return this.pedidocompraimpors.get(rowIndex).getid_tipo_cambio();
				case 13: return this.pedidocompraimpors.get(rowIndex).getid_moneda();
				case 14: return this.pedidocompraimpors.get(rowIndex).getid_tipo_prorrateo_impor();
				case 15: return this.pedidocompraimpors.get(rowIndex).getid_embarcador();
				case 16: return this.pedidocompraimpors.get(rowIndex).getid_tipo_via_transporte();
				case 17: return this.pedidocompraimpors.get(rowIndex).getid_puerto();
				case 18: return this.pedidocompraimpors.get(rowIndex).getid_puerto_destino();
				case 19: return this.pedidocompraimpors.get(rowIndex).getid_tipo_terminos_impor();
				case 20: return this.pedidocompraimpors.get(rowIndex).getid_estado_pedido_compra();
				case 21: return this.pedidocompraimpors.get(rowIndex).getforma_pago();
				case 22: return this.pedidocompraimpors.get(rowIndex).getnumero_dui();
				case 23: return this.pedidocompraimpors.get(rowIndex).getsecuencial();
				case 24: return this.pedidocompraimpors.get(rowIndex).getnumero_orden();
				case 25: return this.pedidocompraimpors.get(rowIndex).getuso_en();
				case 26: return this.pedidocompraimpors.get(rowIndex).getresponsable();
				case 27: return this.pedidocompraimpors.get(rowIndex).getorden_compra();
				case 28: return this.pedidocompraimpors.get(rowIndex).getlugar_entrega();
				case 29: return this.pedidocompraimpors.get(rowIndex).getdescripcion();
				case 30: return this.pedidocompraimpors.get(rowIndex).getfecha();
				case 31: return this.pedidocompraimpors.get(rowIndex).getfecha_emision();
				case 32: return this.pedidocompraimpors.get(rowIndex).getfecha_entrega();
				case 33: return this.pedidocompraimpors.get(rowIndex).getfecha_entrega_cliente();
				case 34: return this.pedidocompraimpors.get(rowIndex).getnombre_seguro();
				case 35: return this.pedidocompraimpors.get(rowIndex).getnombre_consignatario();
				case 36: return this.pedidocompraimpors.get(rowIndex).getprecios();
				case 37: return this.pedidocompraimpors.get(rowIndex).getflete();
				case 38: return this.pedidocompraimpors.get(rowIndex).getseguro();
				case 39: return this.pedidocompraimpors.get(rowIndex).getgastos();
				case 40: return this.pedidocompraimpors.get(rowIndex).getcfr();
				case 41: return this.pedidocompraimpors.get(rowIndex).getcif();
				case 42: return this.pedidocompraimpors.get(rowIndex).gettotal();
				case 43: return this.pedidocompraimpors.get(rowIndex).getid_formato();
				case 44: return this.pedidocompraimpors.get(rowIndex).getid_anio();
				case 45: return this.pedidocompraimpors.get(rowIndex).getid_mes();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return Long.class;
				case 5: return Long.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return String.class;
				case 24: return Integer.class;
				case 25: return String.class;
				case 26: return String.class;
				case 27: return String.class;
				case 28: return String.class;
				case 29: return String.class;
				case 30: return Date.class;
				case 31: return Date.class;
				case 32: return Date.class;
				case 33: return Date.class;
				case 34: return String.class;
				case 35: return String.class;
				case 36: return String.class;
				case 37: return Double.class;
				case 38: return Double.class;
				case 39: return Double.class;
				case 40: return Double.class;
				case 41: return Double.class;
				case 42: return Double.class;
				case 43: return Long.class;
				case 44: return Long.class;
				case 45: return Long.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;
				case 30: return true;
				case 31: return true;
				case 32: return true;
				case 33: return true;
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;
				case 38: return true;
				case 39: return true;
				case 40: return true;
				case 41: return true;
				case 42: return true;
				case 43: return true;
				case 44: return true;
				case 45: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	PedidoCompraImpor pedidocompraimpor = this.pedidocompraimpors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame=(PedidoCompraImporBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pedidocompraimpor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pedidocompraimpor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pedidocompraimpor.setid_empresa((Long) value);pedidocompraimpor.setempresa_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pedidocompraimpor.setid_sucursal((Long) value);pedidocompraimpor.setsucursal_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pedidocompraimpor.setid_modulo((Long) value);pedidocompraimpor.setmodulo_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pedidocompraimpor.setid_ejercicio((Long) value);pedidocompraimpor.setejercicio_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pedidocompraimpor.setid_periodo((Long) value);pedidocompraimpor.setperiodo_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pedidocompraimpor.setid_pais((Long) value);pedidocompraimpor.setpais_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pedidocompraimpor.setid_cliente((Long) value);pedidocompraimpor.setcliente_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pedidocompraimpor.setid_cliente_proveedor((Long) value);pedidocompraimpor.setclienteproveedor_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualClienteProveedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pedidocompraimpor.setid_empleado((Long) value);pedidocompraimpor.setempleado_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pedidocompraimpor.setid_usuario((Long) value);pedidocompraimpor.setusuario_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pedidocompraimpor.setid_tipo_cambio((Long) value);pedidocompraimpor.settipocambio_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualTipoCambioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pedidocompraimpor.setid_moneda((Long) value);pedidocompraimpor.setmoneda_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pedidocompraimpor.setid_tipo_prorrateo_impor((Long) value);pedidocompraimpor.settipoprorrateoimpor_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualTipoProrrateoImporForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pedidocompraimpor.setid_embarcador((Long) value);pedidocompraimpor.setembarcador_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualEmbarcadorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {pedidocompraimpor.setid_tipo_via_transporte((Long) value);pedidocompraimpor.settipoviatransporte_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualTipoViaTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {pedidocompraimpor.setid_puerto((Long) value);pedidocompraimpor.setpuerto_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualPuertoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {pedidocompraimpor.setid_puerto_destino((Long) value);pedidocompraimpor.setpuertodestino_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualPuertoDestinoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {pedidocompraimpor.setid_tipo_terminos_impor((Long) value);pedidocompraimpor.settipoterminosimpor_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualTipoTerminosImporForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {pedidocompraimpor.setid_estado_pedido_compra((Long) value);pedidocompraimpor.setestadopedidocompra_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualEstadoPedidoCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {pedidocompraimpor.setforma_pago((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {pedidocompraimpor.setnumero_dui((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {pedidocompraimpor.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {pedidocompraimpor.setnumero_orden((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {pedidocompraimpor.setuso_en((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {pedidocompraimpor.setresponsable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {pedidocompraimpor.setorden_compra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {pedidocompraimpor.setlugar_entrega((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {pedidocompraimpor.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {pedidocompraimpor.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {pedidocompraimpor.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {pedidocompraimpor.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {pedidocompraimpor.setfecha_entrega_cliente((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {pedidocompraimpor.setnombre_seguro((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {pedidocompraimpor.setnombre_consignatario((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {pedidocompraimpor.setprecios((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {pedidocompraimpor.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {pedidocompraimpor.setseguro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {pedidocompraimpor.setgastos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {pedidocompraimpor.setcfr((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {pedidocompraimpor.setcif((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {pedidocompraimpor.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {pedidocompraimpor.setid_formato((Long) value);pedidocompraimpor.setformato_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {pedidocompraimpor.setid_anio((Long) value);pedidocompraimpor.setanio_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {pedidocompraimpor.setid_mes((Long) value);pedidocompraimpor.setmes_descripcion(pedidocompraimporBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PedidoCompraImporModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private PedidoCompraImporDetalleFormJInternalFrame pedidocompraimporJInternalFrame=null;
		
		public PedidoCompraImporModel(PedidoCompraImporDetalleFormJInternalFrame pedidocompraimporJInternalFrame) {
			this.pedidocompraimporJInternalFrame=pedidocompraimporJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidocompraimporJInternalFrame.getjButtonActualizarToolBarPedidoCompraImpor();
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.getjButtonActualizarToolBarPedidoCompraImpor())) {
				componentTab=this.pedidocompraimporJInternalFrame.getjButtonEliminarToolBarPedidoCompraImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.getjButtonEliminarToolBarPedidoCompraImpor())) {
				componentTab=this.pedidocompraimporJInternalFrame.getjButtonCancelarToolBarPedidoCompraImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.getjButtonCancelarToolBarPedidoCompraImpor())) {
				componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_empresaPedidoCompraImpor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_mesPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jButtonEliminarPedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jButtonEliminarPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jButtonActualizarPedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jButtonActualizarPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jButtonCancelarPedidoCompraImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_empresaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_sucursalPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_sucursalPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_moduloPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_moduloPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_ejercicioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_ejercicioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_periodoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_periodoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_paisPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_paisPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_clientePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_clientePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_cliente_proveedorPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_cliente_proveedorPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_empleadoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_empleadoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_usuarioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_usuarioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_cambioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_cambioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_monedaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_monedaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_embarcadorPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_embarcadorPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_via_transportePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_via_transportePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_puertoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_puertoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_puerto_destinoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_puerto_destinoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_terminos_imporPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_terminos_imporPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_estado_pedido_compraPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_estado_pedido_compraPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldforma_pagoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldforma_pagoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnumero_duiPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnumero_duiPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldsecuencialPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldsecuencialPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnumero_ordenPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnumero_ordenPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFielduso_enPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFielduso_enPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextArearesponsablePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextArearesponsablePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldorden_compraPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldorden_compraPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldlugar_entregaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldlugar_entregaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextAreadescripcionPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextAreadescripcionPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfechaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfechaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfecha_emisionPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfecha_emisionPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfecha_entregaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfecha_entregaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfecha_entrega_clientePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfecha_entrega_clientePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnombre_seguroPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnombre_seguroPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnombre_consignatarioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnombre_consignatarioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldpreciosPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldpreciosPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldfletePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldfletePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldseguroPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldseguroPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldgastosPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldgastosPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldcfrPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldcfrPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldcifPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldcifPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldtotalPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldtotalPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_formatoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_formatoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_anioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_anioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_mesPedidoCompraImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidocompraimporJInternalFrame.getjButtonActualizarToolBarPedidoCompraImpor();
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.getjButtonEliminarToolBarPedidoCompraImpor())) {
				componentTab=this.pedidocompraimporJInternalFrame.getjButtonActualizarToolBarPedidoCompraImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.getjButtonCancelarToolBarPedidoCompraImpor())) {
				componentTab=this.pedidocompraimporJInternalFrame.getjButtonEliminarToolBarPedidoCompraImpor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_empresaPedidoCompraImpor)) {
				
				componentTab=this.pedidocompraimporJInternalFrame.getjButtonCancelarToolBarPedidoCompraImpor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_mesPedidoCompraImpor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jButtonEliminarPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jButtonActualizarPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jButtonEliminarPedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jButtonCancelarPedidoCompraImpor)) {
				componentTab=this.pedidocompraimporJInternalFrame.jButtonActualizarPedidoCompraImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_sucursalPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_empresaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_moduloPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_sucursalPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_ejercicioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_moduloPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_periodoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_ejercicioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_paisPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_periodoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_clientePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_paisPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_cliente_proveedorPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_clientePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_empleadoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_cliente_proveedorPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_usuarioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_empleadoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_cambioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_usuarioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_monedaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_cambioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_monedaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_embarcadorPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_via_transportePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_embarcadorPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_puertoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_via_transportePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_puerto_destinoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_puertoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_terminos_imporPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_puerto_destinoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_estado_pedido_compraPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_tipo_terminos_imporPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldforma_pagoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_estado_pedido_compraPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnumero_duiPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldforma_pagoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldsecuencialPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnumero_duiPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnumero_ordenPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldsecuencialPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFielduso_enPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnumero_ordenPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextArearesponsablePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFielduso_enPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldorden_compraPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextArearesponsablePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldlugar_entregaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldorden_compraPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextAreadescripcionPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldlugar_entregaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfechaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextAreadescripcionPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfecha_emisionPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfechaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfecha_entregaPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfecha_emisionPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jDateChooserfecha_entrega_clientePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfecha_entregaPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnombre_seguroPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jDateChooserfecha_entrega_clientePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldnombre_consignatarioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnombre_seguroPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldpreciosPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldnombre_consignatarioPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldfletePedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldpreciosPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldseguroPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldfletePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldgastosPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldseguroPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldcfrPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldgastosPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldcifPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldcfrPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jTextFieldtotalPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldcifPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_formatoPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jTextFieldtotalPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_anioPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_formatoPedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraimporJInternalFrame.jComboBoxid_mesPedidoCompraImpor)) {
			componentTab=this.pedidocompraimporJInternalFrame.jComboBoxid_anioPedidoCompraImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidocompraimporJInternalFrame.getjButtonActualizarToolBarPedidoCompraImpor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidocompraimporJInternalFrame.getjButtonActualizarToolBarPedidoCompraImpor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidocompraimporJInternalFrame.getjButtonCancelarToolBarPedidoCompraImpor();
			
			
			return componentTab;		
		}
		
		public PedidoCompraImporDetalleFormJInternalFrame getpedidocompraimporJInternalFrame() {
			return this.pedidocompraimporJInternalFrame;
		}
		
		public void setpedidocompraimporJInternalFrame(PedidoCompraImporDetalleFormJInternalFrame pedidocompraimporJInternalFrame) {
			this.pedidocompraimporJInternalFrame=pedidocompraimporJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
